/*
 * Copyright (c) 2014 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/
 */
package org.kermeta.language.cellularautomata.rules;

import org.kermeta.language.cellularautomata.rules._ast.ASTSignedIntegerLiteral;

import core.CoreFactory;
import core.IntegerLiteral;
import core.impl.CoreFactoryImpl;

/**
 * TODO: Write me!
 *
 * @author  (last commit) $Author$
 * @version $Revision$,
 *          $Date$
 *
 */
public class Monticore2EcoreConverter {

  private static final CoreFactory coreFactory = new CoreFactoryImpl();

  public static IntegerLiteral convertASTIntLiteral(ASTSignedIntegerLiteral intNode) {
    IntegerLiteral intLiteral = coreFactory.createIntegerLiteral();
    int value = intNode.getIntLiteral().getValue();

//    if (intNode.isNeg()) {
//      value *= -1;
//    }

    intLiteral.setVal(value);
    return intLiteral;
  }

}
