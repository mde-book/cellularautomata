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
import java.util.List;
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
    ASTAndExpression left = node.getAndExpression().get(0);
    List<ASTAndExpression> right = node.getAndExpression().subList(1, node.getAndExpression().size());

    if (right.isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(left);
      return;
    }

    Or or = coreFactory.createOr();

    // visit left child
    getVisitor().startVisit(left);
    or.setLeft((IntegerExpression) estack.pop());

    // visit (first) right child
    getVisitor().startVisit(right.get(0));
    or.setRight((IntegerExpression) estack.pop());

    for (int i=1; i < right.size(); i++) {
      ASTAndExpression andNode = right.get(i);

      Or currOr = coreFactory.createOr();

      currOr.setLeft(or);

      getVisitor().startVisit(andNode);
      currOr.setRight((IntegerExpression) estack.pop());

      or = currOr;
    }

    estack.push(or);
  }

  public final void ownVisit (ASTAndExpression node) {
    ASTEqualExpression left = node.getEqualExpression().get(0);
    List<ASTEqualExpression> right = node.getEqualExpression().subList(1, node.getEqualExpression().size());

    if (right.isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(left);
      return;
    }

    And and = coreFactory.createAnd();

    // visit left child
    getVisitor().startVisit(left);
    and.setLeft((IntegerExpression) estack.pop());

    // visit (first) right child
    getVisitor().startVisit(right.get(0));
    and.setRight((IntegerExpression) estack.pop());

    for (int i=1; i < right.size(); i++) {
      ASTEqualExpression andNode = right.get(i);

      And curr = coreFactory.createAnd();

      curr.setLeft(and);

      getVisitor().startVisit(andNode);
      curr.setRight((IntegerExpression) estack.pop());

      and = curr;
    }

    estack.push(and);
  }

  public final void ownVisit (ASTEqualExpression node) {
    ASTLowerExpression left = node.getLowerExpression().get(0);
    List<ASTLowerExpression> right = node.getLowerExpression().subList(1, node.getLowerExpression().size());

    if (right.isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(left);
      return;
    }

    Equal equal = coreFactory.createEqual();

    // visit left child
    getVisitor().startVisit(left);
    equal.setLeft((IntegerExpression) estack.pop());

    // visit (first) right child
    getVisitor().startVisit(right.get(0));
    equal.setRight((IntegerExpression) estack.pop());

    for (int i=1; i < right.size(); i++) {
      ASTLowerExpression andNode = right.get(i);

      Equal curr = coreFactory.createEqual();

      curr.setLeft(equal);

      getVisitor().startVisit(andNode);
      curr.setRight((IntegerExpression) estack.pop());

      equal = curr;
    }

    estack.push(equal);
  }

  public final void ownVisit (ASTLowerExpression node) {
    ASTGreaterExpression left = node.getGreaterExpression().get(0);
    List<ASTGreaterExpression> right = node.getGreaterExpression().subList(1, node.getGreaterExpression().size());

    if (right.isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(left);
      return;
    }

    Lower lower = coreFactory.createLower();

    // visit left child
    getVisitor().startVisit(left);
    lower.setLeft((IntegerExpression) estack.pop());

    // visit (first) right child
    getVisitor().startVisit(right.get(0));
    lower.setRight((IntegerExpression) estack.pop());

    for (int i=1; i < right.size(); i++) {
      ASTGreaterExpression curNode = right.get(i);

      Lower curr = coreFactory.createLower();

      curr.setLeft(lower);

      getVisitor().startVisit(curNode);
      curr.setRight((IntegerExpression) estack.pop());

      lower = curr;
    }

    estack.push(lower);
  }

  public final void ownVisit (ASTGreaterExpression node) {
    ASTAddExpression left = node.getAddExpression().get(0);
    List<ASTAddExpression> right = node.getAddExpression().subList(1, node.getAddExpression().size());

    if (right.isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(left);
      return;
    }

    Greater greater = coreFactory.createGreater();

    // visit left child
    getVisitor().startVisit(left);
    greater.setLeft((IntegerExpression) estack.pop());

    // visit (first) right child
    getVisitor().startVisit(right.get(0));
    greater.setRight((IntegerExpression) estack.pop());

    for (int i=1; i < right.size(); i++) {
      ASTAddExpression curNode = right.get(i);

      Greater curr = coreFactory.createGreater();

      curr.setLeft(greater);

      getVisitor().startVisit(curNode);
      curr.setRight((IntegerExpression) estack.pop());

      greater = curr;
    }

    estack.push(greater);
  }

  public final void ownVisit (ASTAddExpression node) {
    ASTMinusExpression left = node.getMinusExpression().get(0);
    List<ASTMinusExpression> right = node.getMinusExpression().subList(1, node.getMinusExpression().size());

    if (right.isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(left);
      return;
    }

    Add add = coreFactory.createAdd();

    // visit left child
    getVisitor().startVisit(left);
    add.setLeft((IntegerExpression) estack.pop());

    // visit (first) right child
    getVisitor().startVisit(right.get(0));
    add.setRight((IntegerExpression) estack.pop());

    for (int i=1; i < right.size(); i++) {
      ASTMinusExpression curNode = right.get(i);

      Add curr = coreFactory.createAdd();

      curr.setLeft(add);

      getVisitor().startVisit(curNode);
      curr.setRight((IntegerExpression) estack.pop());

      add = curr;
    }

    estack.push(add);
  }


  public final void ownVisit (ASTMinusExpression node) {
    ASTMultExpression left = node.getMultExpression().get(0);
    List<ASTMultExpression> right = node.getMultExpression().subList(1, node.getMultExpression().size());

    if (right.isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(left);
      return;
    }

    Minus minus = coreFactory.createMinus();

    // visit left child
    getVisitor().startVisit(left);
    minus.setLeft((IntegerExpression) estack.pop());


    // visit (first) right child
    getVisitor().startVisit(right.get(0));
    minus.setRight((IntegerExpression) estack.pop());

    for (int i=1; i < right.size(); i++) {
      ASTMultExpression curNode = right.get(i);

      Minus curr = coreFactory.createMinus();

      curr.setLeft(minus);

      getVisitor().startVisit(curNode);
      curr.setRight((IntegerExpression) estack.pop());

      minus = curr;
    }

    estack.push(minus);
  }

  public final void ownVisit (ASTMultExpression node) {
    ASTDivExpression left = node.getDivExpression().get(0);
    List<ASTDivExpression> right = node.getDivExpression().subList(1, node.getDivExpression().size());

    if (right.isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(left);
      return;
    }

    Mult mult = coreFactory.createMult();

    // visit left child
    getVisitor().startVisit(left);
    mult.setLeft((IntegerExpression) estack.pop());

    // visit (first) right child
    getVisitor().startVisit(right.get(0));
    mult.setRight((IntegerExpression) estack.pop());

    for (int i=1; i < right.size(); i++) {
      ASTDivExpression curNode = right.get(i);

      Mult curr = coreFactory.createMult();

      curr.setLeft(mult);

      getVisitor().startVisit(curNode);
      curr.setRight((IntegerExpression) estack.pop());

      mult = curr;
    }

    estack.push(mult);
  }

  public final void ownVisit (ASTDivExpression node) {
    ASTModExpression left = node.getModExpression().get(0);
    List<ASTModExpression> right = node.getModExpression().subList(1, node.getModExpression().size());

    if (right.isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(left);
      return;
    }

    Div div = coreFactory.createDiv();

    // visit left child
    getVisitor().startVisit(left);
    div.setLeft((IntegerExpression) estack.pop());

    // visit (first) right child
    getVisitor().startVisit(right.get(0));
    div.setRight((IntegerExpression) estack.pop());

    for (int i=1; i < right.size(); i++) {
      ASTModExpression curNode = right.get(i);

      Div curr = coreFactory.createDiv();

      curr.setLeft(div);

      getVisitor().startVisit(curNode);
      curr.setRight((IntegerExpression) estack.pop());

      div = curr;
    }

    estack.push(div);
  }

	 public final void ownVisit (ASTModExpression node) {
    ASTUnaryExpression left = node.getUnaryExpression().get(0);
    List<ASTUnaryExpression> right = node.getUnaryExpression().subList(1,
        node.getUnaryExpression().size());

    if (right.isEmpty()) {
      // Only visit child nodes
      getVisitor().startVisit(left);
      return;
    }

    Mod mod = coreFactory.createMod();

    // visit left child
    getVisitor().startVisit(left);
    mod.setLeft((IntegerExpression) estack.pop());

    // visit (first) right child
    getVisitor().startVisit(right.get(0));
    mod.setRight((IntegerExpression) estack.pop());

    for (int i = 1; i < right.size(); i++) {
      ASTUnaryExpression curNode = right.get(i);

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
