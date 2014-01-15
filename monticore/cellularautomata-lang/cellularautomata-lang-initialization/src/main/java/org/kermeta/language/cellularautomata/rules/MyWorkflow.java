package org.kermeta.language.cellularautomata.rules;
/* Copyright (c) 2012 RWTH Aachen. All rights reserved.
 *
 * http://www.monticore.de/ - http://www.se-rwth.de/ */


import mc.DSLWorkflow;
import mc.ast.ASTNode;
import mc.ast.AbstractVisitor;

import org.kermeta.language.cellularautomata.rules._tool.CellularAutomataInitializationRoot;

/**
 * A workflow that executes a {@link MyVisitor} on the given AST.
 *
 * @author (last commit) $Author$
 * @version $Revision$, $Date$
 *
 */
public final class MyWorkflow extends DSLWorkflow<CellularAutomataInitializationRoot> {

  /**
   * Factory method for {@link MyWorkflow}.
   */
  public static final MyWorkflow newWorkflow(Class<? extends CellularAutomataInitializationRoot> responsibleClass) {
    return new MyWorkflow(responsibleClass);
  }

  /**
   * Constructor for a.b.c.a_d.MyWorkflow
   *
   * @param responsibleClass
   */
  private MyWorkflow(Class<? extends CellularAutomataInitializationRoot> responsibleClass) {
    super(responsibleClass);
  }

  /**
   * @see mc.DSLWorkflow#run(mc.DSLRoot)
   */
  @Override
  public final void run(CellularAutomataInitializationRoot dslroot) {
    ASTNode ast = dslroot.getAst();
    MyVisitor visitor = MyVisitor.newVisitor();
    AbstractVisitor.run(visitor, ast);
  }

}
