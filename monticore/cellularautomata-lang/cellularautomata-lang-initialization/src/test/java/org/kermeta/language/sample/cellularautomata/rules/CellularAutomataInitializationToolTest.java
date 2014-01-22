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
import ruleInit.GlobalPosition;
import core.Conditional;
import core.IntegerLiteral;
import core.Not;
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
    assertEquals(3, geometry.getNeighborsNumber());
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

    Rule rule = checkOneRuleWithWithOneRange(1, 5);

    IntegerLiteral intLiteral = (IntegerLiteral) rule.getEvaluatedVal();
    assertNotNull(intLiteral);
    assertEquals(1, intLiteral.getVal());
  }

  @Test
  public void testAtomicNot() {
    initAndRun("AtomicNot");

    Rule rule = checkOneRuleWithWithOneRange(1, 5);
    Not not = (Not) rule.getEvaluatedVal();
    assertNotNull(not);
    IntegerLiteral intLiteral = (IntegerLiteral) not.getTarget();
    assertEquals(2, intLiteral.getVal());
  }

  @Test
  public void testAtomicCondition() {
    initAndRun("AtomicCondition");

    Rule rule = checkOneRuleWithWithOneRange(1, 5);
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

  private Rule checkOneRuleWithWithOneRange(int lower, int upper) {
    assertNull(caInit.getGeometry());
    assertEquals(1, caInit.getSeedRules().size());

    Rule rule = caInit.getSeedRules().get(0);
    GlobalPosition filter = (GlobalPosition) rule.getFilter();
    assertNotNull(filter);
    assertEquals(1, filter.getCoordinateRanges().size());
    CoordinateRange coordinateRange = filter.getCoordinateRanges().get(0);
    assertEquals(lower, coordinateRange.getLowerCoordinate());
    assertEquals(upper, coordinateRange.getUpperCoordinate());
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
