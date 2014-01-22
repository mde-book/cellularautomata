package org.kermeta.language.cellularautomata.rules;

/* Copyright (c) 2012 RWTH Aachen. All rights reserved.
 *
 * http://www.monticore.de/ - http://www.se-rwth.de/ */

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

  public static final String TARGET_ECORE_DIR = "target/generated-sources/ecore/";
  public static final String EXPORTED_FILE_EXTENSION = "xmi";


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
		gastResource = createAndAddResource(TARGET_ECORE_DIR + fileName + "." + EXPORTED_FILE_EXTENSION,
				new String[] {EXPORTED_FILE_EXTENSION}, rs);

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

	public final void ownVisit(ASTRule node) {
	  Rule rule = coreFactory.createRule();

	  root.getSeedRules().add(rule);

	  getVisitor().startVisit(node.getGlobalPosition());

	  GlobalPosition position = (GlobalPosition) estack.pop();
	  rule.setFilter(position);

	  getVisitor().startVisit(node.getConditional());

	  IntegerExpression integerExpression = (IntegerExpression) estack.pop();
	  rule.setEvaluatedVal(integerExpression);
	}

	public final void ownVisit (ASTGlobalPosition node) {
	  GlobalPosition position = initFactory.createGlobalPosition();

	  for (ASTCoordinateRange rangeNode : node.getRanges()) {
	    CoordinateRange range = initFactory.createCoordinateRange();
	    range.setLowerCoordinate(rangeNode.getLowerCoord().getValue());
	    range.setUpperCoordinate(rangeNode.getUpperCoord().getValue());

	    position.getCoordinateRanges().add(range);
	  }

	  estack.push(position);

	}

	public final void ownVisit (ASTConditional node) {
	  if (node.getOrExpression() != null) {
	    getVisitor().startVisit(node.getOrExpression());

	    return;
	  }

	  Conditional conditional = coreFactory.createConditional();

	  // Handle children
	  getVisitor().startVisit(node.getConditional());
	  conditional.setCondition((IntegerExpression) estack.pop());

	  getVisitor().startVisit(node.getTrueExpr());
	  conditional.setIfTrueExpression((IntegerExpression) estack.pop());

	  getVisitor().startVisit(node.getFalseExpr());
	  conditional.setIfFalseExpression((IntegerExpression) estack.pop());


	  estack.push(conditional);
	}

  public final void ownVisit (ASTOrExpression node) {
    if (node.getRight().isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLeft());
      return;
    }

    Or or = coreFactory.createOr();

    // visit left child
    getVisitor().startVisit(node.getLeft());
    or.setLeft((IntegerExpression) estack.pop());

    // visit (first) right child
    getVisitor().startVisit(node.getRight().get(0));
    or.setRight((IntegerExpression) estack.pop());

    for (int i=1; i < node.getRight().size(); i++) {
      ASTAndExpression andNode = node.getRight().get(i);

      Or currOr = coreFactory.createOr();

      currOr.setLeft(or);

      getVisitor().startVisit(andNode);
      currOr.setRight((IntegerExpression) estack.pop());

      or = currOr;
    }

    estack.push(or);
  }

  public final void ownVisit (ASTAndExpression node) {
    if (node.getRight().isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLeft());
      return;
    }

    And and = coreFactory.createAnd();

    // visit left child
    getVisitor().startVisit(node.getLeft());
    and.setLeft((IntegerExpression) estack.pop());

    // visit (first) right child
    getVisitor().startVisit(node.getRight().get(0));
    and.setRight((IntegerExpression) estack.pop());

    for (int i=1; i < node.getRight().size(); i++) {
      ASTEqualExpression andNode = node.getRight().get(i);

      And curr = coreFactory.createAnd();

      curr.setLeft(and);

      getVisitor().startVisit(andNode);
      curr.setRight((IntegerExpression) estack.pop());

      and = curr;
    }

    estack.push(and);
  }

  public final void ownVisit (ASTEqualExpression node) {
    if (node.getRight().isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLeft());
      return;
    }

    Equal equal = coreFactory.createEqual();

    // visit left child
    getVisitor().startVisit(node.getLeft());
    equal.setLeft((IntegerExpression) estack.pop());

    // visit (first) right child
    getVisitor().startVisit(node.getRight().get(0));
    equal.setRight((IntegerExpression) estack.pop());

    for (int i=1; i < node.getRight().size(); i++) {
      ASTLowerExpression andNode = node.getRight().get(i);

      Equal curr = coreFactory.createEqual();

      curr.setLeft(equal);

      getVisitor().startVisit(andNode);
      curr.setRight((IntegerExpression) estack.pop());

      equal = curr;
    }

    estack.push(equal);
  }

  public final void ownVisit (ASTLowerExpression node) {
    if (node.getRight().isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLeft());
      return;
    }

    Lower lower = coreFactory.createLower();

    // visit left child
    getVisitor().startVisit(node.getLeft());
    lower.setLeft((IntegerExpression) estack.pop());

    // visit (first) right child
    getVisitor().startVisit(node.getRight().get(0));
    lower.setRight((IntegerExpression) estack.pop());

    for (int i=1; i < node.getRight().size(); i++) {
      ASTGreaterExpression curNode = node.getRight().get(i);

      Lower curr = coreFactory.createLower();

      curr.setLeft(lower);

      getVisitor().startVisit(curNode);
      curr.setRight((IntegerExpression) estack.pop());

      lower = curr;
    }

    estack.push(lower);
  }

  public final void ownVisit (ASTGreaterExpression node) {
    if (node.getRight().isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLeft());
      return;
    }

    Greater greater = coreFactory.createGreater();

    // visit left child
    getVisitor().startVisit(node.getLeft());
    greater.setLeft((IntegerExpression) estack.pop());

    // visit (first) right child
    getVisitor().startVisit(node.getRight().get(0));
    greater.setRight((IntegerExpression) estack.pop());

    for (int i=1; i < node.getRight().size(); i++) {
      ASTAddExpression curNode = node.getRight().get(i);

      Greater curr = coreFactory.createGreater();

      curr.setLeft(greater);

      getVisitor().startVisit(curNode);
      curr.setRight((IntegerExpression) estack.pop());

      greater = curr;
    }

    estack.push(greater);
  }

  public final void ownVisit (ASTAddExpression node) {
    if (node.getRight().isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLeft());
      return;
    }

    Add add = coreFactory.createAdd();

    // visit left child
    getVisitor().startVisit(node.getLeft());
    add.setLeft((IntegerExpression) estack.pop());

    // visit (first) right child
    getVisitor().startVisit(node.getRight().get(0));
    add.setRight((IntegerExpression) estack.pop());

    for (int i=1; i < node.getRight().size(); i++) {
      ASTMinusExpression curNode = node.getRight().get(i);

      Add curr = coreFactory.createAdd();

      curr.setLeft(add);

      getVisitor().startVisit(curNode);
      curr.setRight((IntegerExpression) estack.pop());

      add = curr;
    }

    estack.push(add);
  }


  public final void ownVisit (ASTMinusExpression node) {
    if (node.getRight().isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLeft());
      return;
    }

    Minus minus = coreFactory.createMinus();

    // visit left child
    getVisitor().startVisit(node.getLeft());
    minus.setLeft((IntegerExpression) estack.pop());


    // visit (first) right child
    getVisitor().startVisit(node.getRight().get(0));
    minus.setRight((IntegerExpression) estack.pop());

    for (int i=1; i < node.getRight().size(); i++) {
      ASTMultExpression curNode = node.getRight().get(i);

      Minus curr = coreFactory.createMinus();

      curr.setLeft(minus);

      getVisitor().startVisit(curNode);
      curr.setRight((IntegerExpression) estack.pop());

      minus = curr;
    }

    estack.push(minus);
  }

  public final void ownVisit (ASTMultExpression node) {
    if (node.getRight().isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLeft());
      return;
    }

    Mult mult = coreFactory.createMult();

    // visit left child
    getVisitor().startVisit(node.getLeft());
    mult.setLeft((IntegerExpression) estack.pop());

    // visit (first) right child
    getVisitor().startVisit(node.getRight().get(0));
    mult.setRight((IntegerExpression) estack.pop());

    for (int i=1; i < node.getRight().size(); i++) {
      ASTDivExpression curNode = node.getRight().get(i);

      Mult curr = coreFactory.createMult();

      curr.setLeft(mult);

      getVisitor().startVisit(curNode);
      curr.setRight((IntegerExpression) estack.pop());

      mult = curr;
    }

    estack.push(mult);
  }

  public final void ownVisit (ASTDivExpression node) {
    if (node.getRight().isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLeft());
      return;
    }

    Div div = coreFactory.createDiv();

    // visit left child
    getVisitor().startVisit(node.getLeft());
    div.setLeft((IntegerExpression) estack.pop());

    // visit (first) right child
    getVisitor().startVisit(node.getRight().get(0));
    div.setRight((IntegerExpression) estack.pop());

    for (int i=1; i < node.getRight().size(); i++) {
      ASTModExpression curNode = node.getRight().get(i);

      Div curr = coreFactory.createDiv();

      curr.setLeft(div);

      getVisitor().startVisit(curNode);
      curr.setRight((IntegerExpression) estack.pop());

      div = curr;
    }

    estack.push(div);
  }

	 public final void ownVisit (ASTModExpression node) {
	    if (node.getRight().isEmpty()) {
	      // Only visit child nodes
	      getVisitor().startVisit(node.getLeft());
	      return;
	    }

	    Mod mod = coreFactory.createMod();

	    // visit left child
	    getVisitor().startVisit(node.getLeft());
	    mod.setLeft((IntegerExpression) estack.pop());

	    // visit (first) right child
	    getVisitor().startVisit(node.getRight().get(0));
	    mod.setRight((IntegerExpression) estack.pop());

	    for (int i=1; i < node.getRight().size(); i++) {
	      ASTUnaryExpression curNode = node.getRight().get(i);

	      Mod curr = coreFactory.createMod();

	      curr.setLeft(mod);

	      getVisitor().startVisit(curNode);
	      curr.setRight((IntegerExpression) estack.pop());

	      mod = curr;
	    }

	    estack.push(mod);
	  }

  public final void ownVisit(ASTUnaryExpression node) {
    if (!node.isNot() && !node.isUminus()) {
      // Only visit child nodes
      getVisitor().startVisit(node.getLiteralsExpression());

      return;
    }

	  UnaryExpression unary = null;

	  if (node.isNot()) {
	    unary = coreFactory.createNot();
	  }
	  else if (node.isUminus()) {
	    unary = coreFactory.createUMinus();
	  }

    // visit child nodes
    getVisitor().startVisit(node.getLiteralsExpression());
    unary.setTarget((IntegerExpression) estack.pop());

    estack.push(unary);
	}

	public void ownVisit(ASTLiteralsExpression node) {
	  if (node.getSignedIntegerLiteral() != null) {
	    ASTSignedIntegerLiteral intNode = node.getSignedIntegerLiteral();
	    IntegerLiteral intLiteral = Monticore2EcoreConverter.convertASTIntLiteral(intNode);

	    estack.push(intLiteral);
	  }
	  else if (node.getPositionLiteral() != null) {
	    PositionLiteral position = initFactory.createPositionLiteral();
	    position.setDimensionIndex(node.getPositionLiteral().getDimensionIndex().getValue());

	    estack.push(position);
	  }
	  else if (node.getConditional() != null) {
	    getVisitor().startVisit(node.getConditional());
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
