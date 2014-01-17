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
import org.kermeta.language.cellularautomata.rules._ast.ASTCAInit;
import org.kermeta.language.cellularautomata.rules._ast.ASTConditional;
import org.kermeta.language.cellularautomata.rules._ast.ASTCoordinateRange;
import org.kermeta.language.cellularautomata.rules._ast.ASTDimension;
import org.kermeta.language.cellularautomata.rules._ast.ASTGlobalPosition;
import org.kermeta.language.cellularautomata.rules._ast.ASTLiteralsExpression;
import org.kermeta.language.cellularautomata.rules._ast.ASTMultExpression;
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
import core.Conditional;
import core.CoreFactory;
import core.IntegerExpression;
import core.IntegerLiteral;
import core.Mult;
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

	public final void visit (ASTConditional node) {
	  if (node.getOrExpression() != null) {
	    return;
	  }

	  Conditional conditional = coreFactory.createConditional();

	  if (estack.peek() instanceof Rule) {
	    Rule rule = (Rule) estack.peek();
	    rule.setEvaluatedVal(conditional);
	  }


	  if (node.getOrExpression() != null) {
	    // TODO rekursive conditionals
	  }

	  estack.push(conditional);

	  estack.pop();

	}

	 public final void ownVisit (ASTMultExpression node) {
	    if (node.getRight().isEmpty()) {
	      // Only visit child nodes
	      getVisitor().startVisit(node.getLeft());
	      return;
	    }

	    EObject parent = estack.peek();

	    Mult mult = null;


	    addChildToParent(parent, mult);

	    estack.pop();

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
	}


//	public final void ownVisitXXX(ASTOrExpression node) {
//	  ASTAndExpression left = node.getLeft();
//	  if (!node.getRight().isEmpty()) {
//
//	    BinaryExpression beParent = null;
//	    Conditional condParent = null;
//	    if (estack.peek() instanceof BinaryExpression) {
//	      beParent = (BinaryExpression) estack.peek();
//	    }
//	    else if (estack.peek() instanceof Conditional) {
//	      condParent = (Conditional) estack.peek();
//	    }
//
//	    Or prev = null;
//	    for (int i = 0; i < node.getRight().size(); i++) {
//	      ASTAndExpression right = node.getRight().get(i);
//
//	      Or orOp = coreFactory.createOr();
//	      estack.push(orOp);
//	      if (i == 0) {
//	        getVisitor().startVisit(left);
//	      }
//	      else {
//	        orOp.setLeft(prev);
//	      }
//
//	      getVisitor().startVisit(right);
//
//	      prev = (Or) estack.pop();
//	      if (beParent != null) {
//	        if (beParent.getLeft() == null) {
//	          beParent.setLeft(prev);
//	        }
//	        else {
//	          beParent.setRight(prev);
//	        }
//	      }
//	      else if (condParent != null) {
//	        if (condParent.getCondition() == null) {
//	          condParent.setCondition(prev);
//	        }
//	        else if (condParent.getIfTrueExpression() == null) {
//	          condParent.setIfTrueExpression(prev);
//	        }
//	        else {
//	          condParent.setIfFalseExpression(prev);
//	        }
//	      }
//	    }
//	  }
//	  else {
//	    getVisitor().startVisit(left);
//	  }
//	}



  private void addChildToParent(EObject parent, IntegerExpression child) {
    if (parent instanceof Rule) {
      ((Rule) parent).setEvaluatedVal(child);
    }
    if (parent instanceof Conditional) {
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
    else if (parent instanceof Mult) {
      Mult multParent = (Mult) parent;

      if (multParent.getLeft() == null) {
        multParent.setLeft(child);
      }
      else {
        multParent.setRight(child);
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
