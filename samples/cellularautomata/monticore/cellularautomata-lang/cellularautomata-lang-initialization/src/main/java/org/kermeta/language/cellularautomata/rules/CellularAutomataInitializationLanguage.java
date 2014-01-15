package org.kermeta.language.cellularautomata.rules;
/* Copyright (c) 2012 RWTH Aachen. All rights reserved.
 *
 * http://www.monticore.de/ - http://www.se-rwth.de/ */


import interfaces2.language.ILanguage;
import interfaces2.language.ModelingLanguage;
import mc.DSLRootFactory;
import mc.IErrorDelegator;
import mc.IModelInfrastructureProvider;

import org.kermeta.language.cellularautomata.rules._tool.CellularAutomataInitializationParsingWorkflow;
import org.kermeta.language.cellularautomata.rules._tool.CellularAutomataInitializationRoot;
import org.kermeta.language.cellularautomata.rules._tool.CellularAutomataInitializationRootFactory;

/**
 * As subclass of {@link ModelingLanguage}, this class configures the technical
 * aspects of My Language.
 *
 * @author (last commit) $Author$
 * @version $Revision$, $Date$
 *
 */
public final class CellularAutomataInitializationLanguage extends ModelingLanguage {

  /**
   * The unique identifier of this language. In this case, the qualified name of
   * its package.
   */
  public static final String LANGUAGE_ID = "cair";

  /**
   * The descriptive name of this language.
   */
  public static final String LANGUAGE_NAME = "Cellular Automata Initialization Language";

  /**
   * The short name of this language.
   */
  public static final String LANGUAGE_SHORTNAME = "irule";

  /**
   * The {@link mc.DSLRoot} class that encapsulates ASTs of this language.
   */
  public static final Class<? extends CellularAutomataInitializationRoot> LANGUAGE_ROOT = CellularAutomataInitializationRoot.class;

  /**
   * The file ending of models of this language.
   */
  public static final String FILE_ENDING = LANGUAGE_SHORTNAME;

  /**
   * Factory method for {@link CellularAutomataInitializationLanguage}.
   */
  public static final CellularAutomataInitializationLanguage newLanguage() {
    return new CellularAutomataInitializationLanguage();
  }

  /**
   * Constructor for a.b.c.a_d.MyLanguage
   */
  private CellularAutomataInitializationLanguage() {

    setRootClass(LANGUAGE_ROOT);
    this.dslRootClassForUserNames.put(
        LANGUAGE_SHORTNAME,
        LANGUAGE_ROOT);

    setFileEnding(FILE_ENDING);

    /* Execution Units */

    addExecutionUnit("parse",
        new CellularAutomataInitializationParsingWorkflow());

//    addExecutionUnit("myworkflow",
//        MyWorkflow.newWorkflow(LANGUAGE_ROOT));
  }

  /**
   * @see interfaces2.language.ModelingLanguage#getRootFactory(mc.IModelInfrastructureProvider,
   *      mc.IErrorDelegator, java.lang.String)
   */
  @Override
  public final DSLRootFactory<?> getRootFactory(IModelInfrastructureProvider mip,
      IErrorDelegator errorDelegator, String encoding) {
    return new CellularAutomataInitializationRootFactory(mip, errorDelegator, encoding);
  }

  /**
   * @see interfaces2.language.ModelingLanguage#initILanguage()
   */
  @Override
  protected final ILanguage initILanguage() {
    return new CellularAutomataInitializationLanguageComponent();
  }

}
