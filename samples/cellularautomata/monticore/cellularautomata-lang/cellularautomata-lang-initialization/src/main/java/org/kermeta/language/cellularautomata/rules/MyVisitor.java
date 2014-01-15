package org.kermeta.language.cellularautomata.rules;
/* Copyright (c) 2012 RWTH Aachen. All rights reserved.
 *
 * http://www.monticore.de/ - http://www.se-rwth.de/ */


import mc.ast.ConcreteVisitor;

import org.kermeta.language.cellularautomata.rules._ast.ASTRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Traverses the AST of My Language and prints a log message for every
 * {@link ASTMyElement} it encounters.
 *
 * @author (last commit) $Author$
 * @version $Revision$, $Date$
 *
 */
public final class MyVisitor extends ConcreteVisitor {

  /**
   * SLF4J logger
   */
  private static final Logger logger = LoggerFactory.getLogger(MyVisitor.class);

  /**
   * Factory method for {@link MyVisitor}.
   */
  public static final MyVisitor newVisitor() {
    return new MyVisitor();
  }

  /**
   * Private constructor permitting manual instantiation.
   */
  private MyVisitor() {
  }

  /**
   * Visitor method for {@link ASTMyElement}. This is called for all MyElement
   * nodes in the AST.
   */
  public final void visit(ASTRule element) {
  }

}
