/* Copyright (c) 2012 RWTH Aachen. All rights reserved.
 *
 * http://www.monticore.de/ - http://www.se-rwth.de/ */
package org.kermeta.language.sample.cellularautomata.rules;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import geometry.Dimension;
import geometry.RegularGeometry;

import org.junit.Before;
import org.junit.Test;
import org.kermeta.language.cellularautomata.rules.CellularAutomataInitializationTool;
import org.kermeta.language.cellularautomata.rules.EMFModelLoader;
import org.kermeta.language.cellularautomata.rules.EcoreExportVisitor;

import ruleInit.CellularAutomatatInitialization;
import ruleInit.CoordinateRange;
import ruleInit.CoordinateRanges;
import core.Add;
import core.Conditional;
import core.IntegerLiteral;
import core.Minus;
import core.Not;
import core.Or;
import core.Rule;

/**
 * Test for @{MyLanguageTool}.
 *
 * @author (last commit) $Author$
 * @version $Revision$, $Date$
 *
 */

public class CellularAutomataInitializationToolTest {

  private static final String ECORE_DIR = EcoreExportVisitor.TARGET_ECORE_DIR;
  private static final String FILE_EXTENSION = EcoreExportVisitor.EXPORTED_FILE_EXTENSION;
  private EMFModelLoader loader;
  private CellularAutomatatInitialization caInit;

  @Before
  public void setup() {
    loader = new EMFModelLoader();

    caInit = null;
  }

  public void test() {
    CellularAutomataInitializationTool.main(new String[] {
        "src/test/resources/models/",
        "-analysis", "ALL", "parse",
        "-analysis", "ALL", "ecore_export"
    });
  }

  @Test
  public void testAllAtomic() {
    initAndRun("AllAtomic");

    // Check Geometry //
    RegularGeometry geometry = (RegularGeometry) caInit.getGeometry();
    assertNotNull(geometry);
//    assertEquals(3, geometry.getNeighborsNumber());
    // Dimensions
    assertEquals(2, geometry.getDimensions().size());
    Dimension dimension = geometry.getDimensions().get(0);
    assertEquals(6, dimension.getSize());
    assertFalse(dimension.isIsCircular());
    Dimension secondDimension = geometry.getDimensions().get(1);
    assertEquals(7, secondDimension.getSize());
    assertTrue(secondDimension.isIsCircular());

    // Check Rules //
    assertEquals(14, caInit.getSeedRules().size());
  }

  @Test
  public void testAtomicIntLiteral() {
    initAndRun("AtomicIntLiteral");

    Rule rule = checkOneRuleWithOneRange(1, 5);

    IntegerLiteral intLiteral = (IntegerLiteral) rule.getEvaluatedVal();
    assertNotNull(intLiteral);
    assertEquals(1, intLiteral.getVal());
  }

  @Test
  public void testAtomicNot() {
    initAndRun("AtomicNot");

    Rule rule = checkOneRuleWithOneRange(1, 5);
    Not not = (Not) rule.getEvaluatedVal();
    assertNotNull(not);
    IntegerLiteral intLiteral = (IntegerLiteral) not.getTarget();
    assertEquals(2, intLiteral.getVal());
  }

  @Test
  public void testAtomicCondition() {
    initAndRun("AtomicCondition");

    Rule rule = checkOneRuleWithOneRange(1, 5);
    Conditional conditional = (Conditional) rule.getEvaluatedVal();
    assertNotNull(conditional.getCondition());
    assertNotNull(conditional.getIfTrueExpression());
    assertNotNull(conditional.getIfFalseExpression());

    IntegerLiteral intCond = (IntegerLiteral) conditional.getCondition();
    assertEquals(1, intCond.getVal());

    IntegerLiteral intIfTrue = (IntegerLiteral) conditional.getIfTrueExpression();
    assertEquals(2, intIfTrue.getVal());

    IntegerLiteral intIfFalse = (IntegerLiteral) conditional.getIfFalseExpression();
    assertEquals(3, intIfFalse.getVal());
  }

  @Test
  public void testSeveralOr() {
    initAndRun("SeveralOr");

    Rule rule = checkOneRuleWithOneRange(4, 5);
    Or or = (Or) rule.getEvaluatedVal();
    assertNotNull(or);

    // check that expression 1|2|3 is evaluated as (1|2)|3

    Or orLeft = (Or) or.getLeft();
    assertNotNull(orLeft);
    IntegerLiteral orLeftLeft = (IntegerLiteral) orLeft.getLeft();
    assertEquals(1, orLeftLeft.getVal());
    IntegerLiteral orLeftRight = (IntegerLiteral) orLeft.getRight();
    assertEquals(2, orLeftRight.getVal());

    IntegerLiteral orRight = (IntegerLiteral) or.getRight();
    assertNotNull(orRight);
    assertEquals(3, orRight.getVal());
  }

  @Test
  public void testLeftAssociativityOfAdd1() {
    initAndRun("LeftAssociativityOfAdd1");

    Rule rule = checkOneRuleWithOneRange(4, 5);
    Minus minus = (Minus) rule.getEvaluatedVal();
    assertNotNull(minus);

    // check that expression 1+2-3 is evaluated as (1+2)-3

    Add minusLeft = (Add) minus.getLeft();
    assertNotNull(minusLeft);
    IntegerLiteral minusLeftLeft = (IntegerLiteral) minusLeft.getLeft();
    assertEquals(1, minusLeftLeft.getVal());
    IntegerLiteral minusLeftRight = (IntegerLiteral) minusLeft.getRight();
    assertEquals(2, minusLeftRight.getVal());

    IntegerLiteral minusRight = (IntegerLiteral) minus.getRight();
    assertNotNull(minusRight);
    assertEquals(3, minusRight.getVal());
  }

  @Test
  public void testLeftAssociativityOfAdd2() {
    initAndRun("LeftAssociativityOfAdd2");

    Rule rule = checkOneRuleWithOneRange(4, 5);
    Add add = (Add) rule.getEvaluatedVal();
    assertNotNull(add);

    // check that expression 1+2-3 is evaluated as (1+2)-3

    Minus addLeft = (Minus) add.getLeft();
    assertNotNull(addLeft);
    IntegerLiteral addLeftLeft = (IntegerLiteral) addLeft.getLeft();
    assertEquals(1, addLeftLeft.getVal());
    IntegerLiteral addLeftRight = (IntegerLiteral) addLeft.getRight();
    assertEquals(2, addLeftRight.getVal());

    IntegerLiteral addRight = (IntegerLiteral) add.getRight();
    assertNotNull(addRight);
    assertEquals(3, addRight.getVal());
  }

  private Rule checkOneRuleWithOneRange(int lower, int upper) {
    assertNull(caInit.getGeometry());
    assertEquals(1, caInit.getSeedRules().size());

    Rule rule = caInit.getSeedRules().get(0);
    CoordinateRanges filter = (CoordinateRanges) rule.getFilter();
    assertNotNull(filter);
    assertEquals(1, filter.getCoordinateRanges().size());
    CoordinateRange coordinateRange = filter.getCoordinateRanges().get(0);
//    assertEquals(lower, coordinateRange.getLowerCoordinate());
//    assertEquals(upper, coordinateRange.getUpperCoordinate());
    return rule;
  }

  private void initAndRun(String name) {
    CellularAutomataInitializationTool.main(new String[] {
        "src/test/resources/models/" + name + ".irule",
        "-analysis", "ALL", "parse",
        "-analysis", "ALL", "ecore_export"
    });


    caInit = loader.load(ECORE_DIR + name + "." + FILE_EXTENSION);
    assertNotNull(caInit);
  }

}
