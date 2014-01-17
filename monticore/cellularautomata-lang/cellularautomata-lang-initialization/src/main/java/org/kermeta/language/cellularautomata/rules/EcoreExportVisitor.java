package org.kermeta.language.cellularautomata.rules;

/* Copyright (c) 2012 RWTH Aachen. All rights reserved.
 *
 * http://www.monticore.de/ - http://www.se-rwth.de/ */

import static org.kermeta.language.cellularautomata.rules.Monticore2EcoreConverter.convertASTIntLiteral;
import geometry.Dimension;
import geometry.GeometryFactory;
import geometry.RegularGeometry;
import geometry.impl.GeometryFactoryImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import mc.ast.ConcreteVisitor;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.kermeta.language.cellularautomata.rules._ast.ASTAddExpression;
import org.kermeta.language.cellularautomata.rules._ast.ASTAndExpression;
import org.kermeta.language.cellularautomata.rules._ast.ASTCAInit;
import org.kermeta.language.cellularautomata.rules._ast.ASTConditional;
import org.kermeta.language.cellularautomata.rules._ast.ASTCoordinateRange;
import org.kermeta.language.cellularautomata.rules._ast.ASTDimension;
import org.kermeta.language.cellularautomata.rules._ast.ASTDivExpression;
import org.kermeta.language.cellularautomata.rules._ast.ASTEqualExpression;
import org.kermeta.language.cellularautomata.rules._ast.ASTGlobalPosition;
import org.kermeta.language.cellularautomata.rules._ast.ASTGreaterExpression;
import org.kermeta.language.cellularautomata.rules._ast.ASTLiteralsExpression;
import org.kermeta.language.cellularautomata.rules._ast.ASTLowerExpression;
import org.kermeta.language.cellularautomata.rules._ast.ASTMinusExpression;
import org.kermeta.language.cellularautomata.rules._ast.ASTModExpression;
import org.kermeta.language.cellularautomata.rules._ast.ASTMultExpression;
import org.kermeta.language.cellularautomata.rules._ast.ASTOrExpression;
import org.kermeta.language.cellularautomata.rules._ast.ASTRegularGeometry;
import org.kermeta.language.cellularautomata.rules._ast.ASTRule;
import org.kermeta.language.cellularautomata.rules._ast.ASTSignedIntegerLiteral;
import org.kermeta.language.cellularautomata.rules._ast.ASTUnaryExpression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ruleInit.CellularAutomatatInitialization;
import ruleInit.CoordinateRange;
import ruleInit.GlobalPosition;
import ruleInit.InitFactory;
import ruleInit.PositionLiteral;
import ruleInit.impl.InitFactoryImpl;
import core.Add;
import core.And;
import core.BinaryExpression;
import core.Conditional;
import core.CoreFactory;
import core.Div;
import core.Equal;
import core.Greater;
import core.IntegerExpression;
import core.IntegerLiteral;
import core.Lower;
import core.Minus;
import core.Mod;
import core.Mult;
import core.Or;
import core.Rule;
import core.UnaryExpression;
import core.impl.CoreFactoryImpl;

/**
 * Traverses the AST of My Language and prints a log message for every
 * {@link ASTMyElement} it encounters.
 *
 * @author (last commit) $Author$
 * @version $Revision$, $Date$
 *
 */
public final class EcoreExportVisitor extends ConcreteVisitor {

	/**
	 * SLF4J logger
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(EcoreExportVisitor.class);


	private final CoreFactory coreFactory = new CoreFactoryImpl();
	private final InitFactory initFactory = new InitFactoryImpl();
	private final GeometryFactory geoFactory = new GeometryFactoryImpl();

  private Resource gastResource;

  final Stack<EObject> estack = new Stack<EObject>();


  private CellularAutomatatInitialization root;

	/**
	 * Factory method for {@link EcoreExportVisitor}.
	 */
	public static final EcoreExportVisitor newVisitor() {
		return new EcoreExportVisitor();
	}

	/**
	 * Private constructor permitting manual instantiation.
	 */
	private EcoreExportVisitor() {
	}

	/**
	 * Visitor method for {@link ASTMyElement}. This is called for all MyElement
	 * nodes in the AST.
	 */
	public final void visit(ASTCAInit node) {
		ResourceSet rs = new ResourceSetImpl();
		String fileName = node.get_root().getName();
		gastResource = createAndAddResource("target/generated-sources/" + fileName + ".xmi",
				new String[] {"xmi"}, rs);

		root = initFactory.createCellularAutomatatInitialization();
		gastResource.getContents().add(root);
	}

	public final void endVisit(ASTCAInit node) {
		saveResource(gastResource);
	}

	public final void visit(ASTRegularGeometry node) {
	  RegularGeometry geometry = geoFactory.createRegularGeometry();

	  geometry.setNeighborsNumber(node.getNeighborsNumber().getValue());

	  for (ASTDimension dimensionNode : node.getDimensions()) {
	    Dimension dimension = geoFactory.createDimension();
	    dimension.setIsCircular(dimensionNode.isIsCircular());
	    dimension.setSize(dimensionNode.getSize().getValue());

	    geometry.getDimensions().add(dimension);
	  }

	  root.setGeometry(geometry);
	}

	public final void visit(ASTRule node) {
	  Rule rule = coreFactory.createRule();

	  root.getSeedRules().add(rule);

	  estack.push(rule);
	}

	public final void endVisit(ASTRule node) {
	  estack.pop();
	}

	public final void visit (ASTGlobalPosition node) {
	  GlobalPosition pos = initFactory.createGlobalPosition();

	  for (ASTCoordinateRange rangeNode : node.getRanges()) {
	    CoordinateRange range = initFactory.createCoordinateRange();
	    range.setLowerCoordinate(rangeNode.getLowerCoord().getValue());
	    range.setUpperCoordinate(rangeNode.getUpperCoord().getValue());

	    pos.getCoordinateRanges().add(range);
	  }

	  Rule rule = (Rule) estack.peek();
	  rule.setFilter(pos);
	}

	public final void ownVisit (ASTConditional node) {
	  if (node.getOrExpression() != null) {
	    getVisitor().startVisit(node.getOrExpression());

	    return;
	  }

	  Conditional conditional = coreFactory.createConditional();

	  addChildToParent(estack.peek(), conditional);
	  estack.push(conditional);

	  getVisitor().startVisit(node.getConditional());
	  getVisitor().startVisit(node.getTrueExpr());
	  getVisitor().startVisit(node.getFalseExpr());

	  estack.pop();

	}

  public final void ownVisit (ASTOrExpression node) {
    if (node.getRight().isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLeft());
      return;
    }

    Or or = coreFactory.createOr();

    EObject parent = estack.peek();
    estack.push(or);

    // visit left child
    getVisitor().startVisit(node.getLeft());

    // visit (first) right child
    // TODO needs to be done for all right children
    getVisitor().startVisit(node.getRight().get(0));

    addChildToParent(parent, or);
    estack.pop();
  }

  public final void ownVisit (ASTAndExpression node) {
    if (node.getRight().isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLeft());
      return;
    }

    And and = coreFactory.createAnd();

    EObject parent = estack.peek();
    estack.push(and);

    // visit left child
    getVisitor().startVisit(node.getLeft());

    // visit (first) right child
    // TODO needs to be done for all right children
    getVisitor().startVisit(node.getRight().get(0));

    addChildToParent(parent, and);
    estack.pop();
  }

  public final void ownVisit (ASTEqualExpression node) {
    if (node.getRight().isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLeft());
      return;
    }

    Equal lower = coreFactory.createEqual();

    EObject parent = estack.peek();
    estack.push(lower);

    // visit left child
    getVisitor().startVisit(node.getLeft());

    // visit (first) right child
    // TODO needs to be done for all right children
    getVisitor().startVisit(node.getRight().get(0));

    addChildToParent(parent, lower);
    estack.pop();
  }

  public final void ownVisit (ASTLowerExpression node) {
    if (node.getRight().isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLeft());
      return;
    }

    Lower lower = coreFactory.createLower();

    EObject parent = estack.peek();
    estack.push(lower);

    // visit left child
    getVisitor().startVisit(node.getLeft());

    // visit (first) right child
    // TODO needs to be done for all right children
    getVisitor().startVisit(node.getRight().get(0));

    addChildToParent(parent, lower);
    estack.pop();
  }

  public final void ownVisit (ASTGreaterExpression node) {
    if (node.getRight().isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLeft());
      return;
    }

    Greater greater = coreFactory.createGreater();

    EObject parent = estack.peek();
    estack.push(greater);

    // visit left child
    getVisitor().startVisit(node.getLeft());

    // visit (first) right child
    // TODO needs to be done for all right children
    getVisitor().startVisit(node.getRight().get(0));

    addChildToParent(parent, greater);
    estack.pop();
  }

  public final void ownVisit (ASTAddExpression node) {
    if (node.getRight().isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLeft());
      return;
    }

    Add add = coreFactory.createAdd();

    EObject parent = estack.peek();
    estack.push(add);

    // visit left child
    getVisitor().startVisit(node.getLeft());

    // visit (first) right child
    // TODO needs to be done for all right children
    getVisitor().startVisit(node.getRight().get(0));

    addChildToParent(parent, add);
    estack.pop();
  }


  public final void ownVisit (ASTMinusExpression node) {
    if (node.getRight().isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLeft());
      return;
    }

    Minus minus = coreFactory.createMinus();

    EObject parent = estack.peek();
    estack.push(minus);

    // visit left child
    getVisitor().startVisit(node.getLeft());

    // visit (first) right child
    // TODO needs to be done for all right children
    getVisitor().startVisit(node.getRight().get(0));

    addChildToParent(parent, minus);
    estack.pop();
  }

  public final void ownVisit (ASTMultExpression node) {
    if (node.getRight().isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLeft());
      return;
    }

    Mult mult = coreFactory.createMult();

    EObject parent = estack.peek();
    estack.push(mult);

    // visit left child
    getVisitor().startVisit(node.getLeft());

    // visit (first) right child
    // TODO needs to be done for all right children
    getVisitor().startVisit(node.getRight().get(0));

    addChildToParent(parent, mult);
    estack.pop();
  }

  public final void ownVisit (ASTDivExpression node) {
    if (node.getRight().isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLeft());
      return;
    }

    Div div = coreFactory.createDiv();

    EObject parent = estack.peek();
    estack.push(div);

    // visit left child
    getVisitor().startVisit(node.getLeft());

    // visit (first) right child
    // TODO needs to be done for all right children
    getVisitor().startVisit(node.getRight().get(0));

    addChildToParent(parent, div);
    estack.pop();
  }

	 public final void ownVisit (ASTModExpression node) {
	    if (node.getRight().isEmpty()) {
	      // Only visit child nodes
	      getVisitor().startVisit(node.getLeft());
	      return;
	    }

	    Mod mod = coreFactory.createMod();

	    EObject parent = estack.peek();
	    estack.push(mod);

	    // visit left child
	    getVisitor().startVisit(node.getLeft());

	    // visit (first) right child
	    // TODO needs to be done for all right children
	    getVisitor().startVisit(node.getRight().get(0));

	    addChildToParent(parent, mod);
	    estack.pop();


//	    EObject parent = estack.peek();
//
//	    Mod prevMod = null;
//
//      for (int i = 0; i < node.getRight().size(); i++) {
//        ASTUnaryExpression right = node.getRight().get(i);
//
//        Mod curMod = coreFactory.createMod();
//        estack.push(curMod);
//
//        if (i == 0) {
//          getVisitor().startVisit(node.getLeft());
//        }
//        else {
//          curMod.setLeft(prevMod);
//        }
//
//        getVisitor().startVisit(right);
//        prevMod = curMod;
//      }
//      addChildToParent(parent, prevMod);
	  }

  public final void ownVisit(ASTUnaryExpression node) {
    if (!node.isNot() && !node.isUminus()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLiteralsExpression());

      return;
    }

	  EObject parent = estack.peek();

	  UnaryExpression unary = null;

	  if (node.isNot()) {
	    unary = coreFactory.createNot();
	  }
	  else if (node.isUminus()) {
	    unary = coreFactory.createUMinus();
	  }

    estack.push(unary);

    addChildToParent(parent, unary);

    // visit child nodes
    getVisitor().startVisit(node.getLiteralsExpression());

    estack.pop();
	}

	public void ownVisit(ASTLiteralsExpression node) {
	  EObject parent = estack.peek();

	  if (node.getSignedIntegerLiteral() != null) {
	    ASTSignedIntegerLiteral intNode = node.getSignedIntegerLiteral();
	    IntegerLiteral intLiteral = convertASTIntLiteral(intNode);

	    addChildToParent(parent, intLiteral);
	  }
	  else if (node.getPositionLiteral() != null) {
	    PositionLiteral position = initFactory.createPositionLiteral();
	    position.setDimensionIndex(node.getPositionLiteral().getDimensionIndex().getValue());

	    addChildToParent(parent, position);
	  }
	  else if (node.getConditional() != null) {
	    getVisitor().startVisit(node.getConditional());
	  }
	}


  private void addChildToParent(EObject parent, IntegerExpression child) {
    if (parent instanceof Rule) {
      ((Rule) parent).setEvaluatedVal(child);
    }
    else if (parent instanceof Conditional) {
      Conditional condParent = (Conditional) parent;
      if (condParent.getCondition() == null) {
        condParent.setCondition(child);
      }
      else if (condParent.getIfTrueExpression() == null) {
        condParent.setIfTrueExpression(child);
      }
      else {
        condParent.setIfFalseExpression(child);
      }
    }
    else if (parent instanceof UnaryExpression) {
      ((UnaryExpression) parent).setTarget(child);
    }
    else if (parent instanceof BinaryExpression) {
      BinaryExpression modParent = (BinaryExpression) parent;

      if (modParent.getLeft() == null) {
        modParent.setLeft(child);
      }
      else {
        modParent.setRight(child);
      }
    }
  }

	private Resource createAndAddResource(String outputFile, String[] fileextensions, ResourceSet rs) {
		for (String fileext : fileextensions) {
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put(fileext, new XMLResourceFactoryImpl());
		}
		URI uri = URI.createFileURI(outputFile);
		Resource resource = rs.createResource(uri);
		((ResourceImpl) resource).setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
		return resource;
	}

	private void saveResource(Resource resource) {
		Map<Object, Object> saveOptions = ((XMLResource) resource).getDefaultSaveOptions();
		saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE,
				new ArrayList<Object>());
		try {
			resource.save(saveOptions);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
