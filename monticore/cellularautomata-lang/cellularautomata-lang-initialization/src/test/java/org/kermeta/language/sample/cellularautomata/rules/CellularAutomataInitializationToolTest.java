/* Copyright (c) 2012 RWTH Aachen. All rights reserved.
 *
 * http://www.monticore.de/ - http://www.se-rwth.de/ */
package org.kermeta.language.sample.cellularautomata.rules;

import org.junit.Test;
import org.kermeta.language.cellularautomata.rules.CellularAutomataInitializationTool;

/**
 * Test for @{MyLanguageTool}.
 *
 * @author (last commit) $Author$
 * @version $Revision$, $Date$
 *
 */
public class CellularAutomataInitializationToolTest {

  @Test
  public void test() {
    CellularAutomataInitializationTool.main(new String[] {
        "src/test/resources/models/",
        "-analysis", "ALL", "parse",
        "-analysis", "ALL", "ecore_export"
    });
  }

}
