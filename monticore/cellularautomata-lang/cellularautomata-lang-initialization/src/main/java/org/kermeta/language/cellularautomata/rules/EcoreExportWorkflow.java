package org.kermeta.language.cellularautomata.rules;
/* Copyright (c) 2012 RWTH Aachen. All rights reserved.
 *
 * http://www.monticore.de/ - http://www.se-rwth.de/ */


import mc.DSLWorkflow;
import mc.ast.ASTNode;
import mc.ast.AbstractVisitor;

import org.kermeta.language.cellularautomata.rules._tool.CellularAutomataInitializationRoot;

/**
 * A workflow that executes a {@link EcoreExportVisitor} on the given AST.
 *
 * @author (last commit) $Author$
 * @version $Revision$, $Date$
 *
 */
public final class EcoreExportWorkflow extends DSLWorkflow<CellularAutomataInitializationRoot> {

  /**
   * Factory method for {@link EcoreExportWorkflow}.
   */
  public static final EcoreExportWorkflow newWorkflow(Class<? extends CellularAutomataInitializationRoot> responsibleClass) {
    return new EcoreExportWorkflow(responsibleClass);
  }

  /**
   * Constructor for a.b.c.a_d.MyWorkflow
   *
   * @param responsibleClass
   */
  private EcoreExportWorkflow(Class<? extends CellularAutomataInitializationRoot> responsibleClass) {
    super(responsibleClass);
  }

  /**
   * @see mc.DSLWorkflow#run(mc.DSLRoot)
   */
  @Override
  public final void run(CellularAutomataInitializationRoot dslroot) {
    ASTNode ast = dslroot.getAst();
    EcoreExportVisitor visitor = EcoreExportVisitor.newVisitor();
    AbstractVisitor.run(visitor, ast);
  }

}
