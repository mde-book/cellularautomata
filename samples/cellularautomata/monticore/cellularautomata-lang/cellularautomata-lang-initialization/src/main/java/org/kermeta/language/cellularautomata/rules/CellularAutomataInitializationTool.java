package org.kermeta.language.cellularautomata.rules;
/* Copyright (c) 2012 RWTH Aachen. All rights reserved.
 * 
 * http://www.monticore.de/ - http://www.se-rwth.de/ */


import interfaces2.language.ETSTool;
import interfaces2.language.LanguageFamily;
import mc.DSLTool;
import mc.MCG;

/**
 * Tool for {@link CellularAutomataInitializationLanguage}.
 * 
 * @author (last commit) $Author$
 * @version $Revision$, $Date$
 * 
 */
public class CellularAutomataInitializationTool extends ETSTool {
  
  /**
   * The main method of this tool. Creates, initializes and starts
   * {@link CellularAutomataInitializationTool}. Takes a list of {@link DSLTool} arguments.
   * 
   * @param a list of {@link DSLTool} arguments.
   */
  public static void main(String[] arguments) {
    
    MCG.initMonticoreGlobals();
    
    CellularAutomataInitializationTool tool = new CellularAutomataInitializationTool(arguments);
    
    tool.init();
    tool.run();
    
  }
  
  /**
   * Constructor for a.b.c.a_d.MyLanguageTool
   * 
   * @param arguments
   */
  public CellularAutomataInitializationTool(String[] arguments) {
    super(arguments);
    LanguageFamily languageFamily = new LanguageFamily();
    languageFamily.addLanguage(CellularAutomataInitializationLanguage.newLanguage());
    setLanguages(languageFamily);
  }
  
}
