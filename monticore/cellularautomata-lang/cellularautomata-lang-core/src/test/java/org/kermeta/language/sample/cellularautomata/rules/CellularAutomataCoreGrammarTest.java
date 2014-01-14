/* Copyright (c) 2012 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/ */
package org.kermeta.language.sample.cellularautomata.rules;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import mc.antlr.RecognitionException;
import mc.antlr.TokenStreamException;
import mc.grammar.MCConcreteParser;

import org.cellularautomata.lang.core._parser.CellularAutomataCoreOrExpressionMCConcreteParser;
import org.junit.Test;

import com.google.common.base.Supplier;

/**
 * Tests if CellularAutomataCore.mc is producing the desired models.
 *
 * @author (last commit) $Author$
 * @version $Revision$, $Date: 2012-11-01 16:19:26 +0100 (Do, 01 Nov
 *          2012) $
 *
 */
public class CellularAutomataCoreGrammarTest {

  public static final Supplier<MCConcreteParser> parserSupplier = new Supplier<MCConcreteParser>() {
    @Override
    public MCConcreteParser get() {
      return new CellularAutomataCoreOrExpressionMCConcreteParser("Test");
    }
  };



  /**
   * Tests if the models are really unparsable on basis
   * of the current Cellular Automata Core grammar.
   *
   * @throws IOException
   * @throws RecognitionException
   * @throws TokenStreamException
   */
  public void parseAllInalidTestModels() throws IOException, RecognitionException,
      TokenStreamException {

    GrammarTestParser parser = GrammarTestParser.newParser(parserSupplier);
    parser.parseModels(new File("src/test/resources/syntactically_invalid/syntax"), ".core");

    assertTrue(parser.printReport(), parser.failedParsingAllModelFiles());
  }

  /**
   * Tests if the models are really parsable on basis
   * of the current Cellular Automata Core grammar.
   *
   * @throws IOException
   * @throws RecognitionException
   * @throws TokenStreamException
   */
  @Test
  public void parseAllValidTestModels() throws IOException, RecognitionException,
      TokenStreamException {

    GrammarTestParser parser = GrammarTestParser.newParser(parserSupplier);
    parser.parseModels(new File("src/test/resources/syntactically_valid"), ".core");

    assertTrue(parser.printReport(), parser.wasSuccessful());

  }

}
