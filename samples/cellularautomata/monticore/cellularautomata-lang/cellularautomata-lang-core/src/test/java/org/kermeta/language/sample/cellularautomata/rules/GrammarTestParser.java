/* Copyright (c) 2012 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/ */
package org.kermeta.language.sample.cellularautomata.rules;

import static com.google.common.collect.Maps.newHashMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import mc.DSLRoot;
import mc.MCG;
import mc.ProblemReport;
import mc.SimpleErrorDelegator;
import mc.antlr.RecognitionException;
import mc.antlr.TokenStreamException;
import mc.ast.ASTNode;
import mc.grammar.MCConcreteParser;
import mc.grammar.MonticoreParser;

import com.google.common.base.Charsets;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.Files;

import de.se_rwth.commons.Directories;

/**
 * Parses given set of model files using a given {@link MCConcreteParser} and
 * provides the parsing results for testing purposes.
 *
 * @author (last commit) $Author$
 * @version $Revision$, $Date$
 */
public final class GrammarTestParser {

  /**
   * Interface to be implemented by a class providing the actual
   * {@link MCConcreteParser} to be used.
   */
  public interface ParserConfigurator {
    void configure(MonticoreParser parser);
  }

  /**
   * Creates a new {@link GrammarTestParser} based on the given parser
   * configuration.
   */
  public static GrammarTestParser newParser(ParserConfigurator parserConfigurator) {
    return new GrammarTestParser(parserConfigurator);
  }

  /**
   * Creates a new {@link GrammarTestParser} based on the given concrete parser.
   */
  public static GrammarTestParser newParser(final Supplier<MCConcreteParser> parserSupplier) {
    return new GrammarTestParser(new ParserConfigurator() {
      @Override
      public void configure(MonticoreParser parser) {
        MCConcreteParser concreteParser = parserSupplier.get();
        concreteParser.create(parser);
        parser.addMCConcreteParser(concreteParser);
        parser.setStartParser(concreteParser.getName());
      }
    });
  }

  /**
   * The actual concrete parser to be used.
   */
  private ParserConfigurator parserConfigurator;

  /**
   * Map of model names to {@link DSLRoot}s created by parsing their respective
   * models.
   */
  private Map<String, ASTNode> astRoots = newHashMap();

  /**
   * Map of model names to collections of errorMessages logged while parsing
   * these models.
   */
  private Map<String, Collection<String>> errorMessages = newHashMap();

  /**
   * Flag indicating that all models failed to be parsed.
   */
  private boolean failedParsingAllModels;

  /**
   * Flag indicating that all models where parsed successfully.
   */
  private boolean succeededParsingAllModels;

  /**
   * Constructor for cc.clarc.commons.monticore.test.TestModelParser
   */
  public GrammarTestParser(ParserConfigurator concreteParserProvider) {
    this.parserConfigurator = concreteParserProvider;
    MCG.initMonticoreGlobals();
  }

  /**
   * @return true if the parse failed to parse all given model files.
   */
  public boolean failedParsingAllModelFiles() {
    return this.failedParsingAllModels;
  }

  /**
   * @return true if at least one model file could not be parsed by the parser.
   */
  public boolean failedParsingAtLeastOneModel() {
    return !this.succeededParsingAllModels;
  }

  /**
   * @return a Map of parsed model names to ASTs created by parsing them.
   */
  public Map<String, ASTNode> getAstRoots() {
    return ImmutableMap.copyOf(this.astRoots);
  }

  /**
   * Parses the given model file and changes this parsers state accordingly.
   *
   * @throws FileNotFoundException
   */
  public ASTNode parseModel(File modelFile) throws FileNotFoundException {
    reset();
    return parse(Files.newReader(modelFile, Charsets.UTF_8), modelFile.getName());
  }

  /**
   * Parses all models of the given file ending found in the given directory or
   * any of its sub directories and changes this parsers state accordingly.
   *
   * @return a Map of parsed model names to ASTs created by parsing them.
   * @throws FileNotFoundException
   */
  public Map<String, ASTNode> parseModels(File directory, String fileEnding)
      throws FileNotFoundException {

    reset();

    Collection<File> modelFiles = null;

    modelFiles = Directories.listFilesRecursivly(directory, fileEnding);

    for (File modelFile : modelFiles) {
      parse(Files.newReader(modelFile, Charsets.UTF_8), modelFile.getName());
    }

    return getAstRoots();
  }

  /**
   * Parses the given model file and changes this parsers state accordingly.
   *
   * @throws FileNotFoundException
   */
  public ASTNode parseString(String model) {
    reset();
    return parse(new StringReader(model), "String");
  }

  /**
   * @return a String containing a report of all error messages logged by this
   * parser.
   */
  public String printReport() {

    StringBuilder report = new StringBuilder("\n");

    for (String modelFile : this.errorMessages.keySet()) {
      report.append("Document: " + modelFile + "\n");
      for (String errorMessage : this.errorMessages.get(modelFile)) {
        report.append(" - " + errorMessage + "\n");
      }
    }

    report.append("\n");

    return report.toString();
  }

  /**
   * @return true if the parser could parse all given models.
   */
  public boolean wasSuccessful() {
    return this.succeededParsingAllModels;
  }

  /**
   * Adds the given error message to this parser's state.
   */
  private void addErrorMessage(String string) {
    this.addErrorMessage("", string);
  }

  /**
   * Adds the given error message to this parser's state.
   */
  private void addErrorMessage(String modelFile, String errorMessage) {

    Collection<String> errorMessagesForModelFile = this.errorMessages.get(modelFile);
    if (errorMessagesForModelFile == null) {
      errorMessagesForModelFile = new ArrayList<String>();
      this.errorMessages.put(modelFile, errorMessagesForModelFile);
    }
    errorMessagesForModelFile.add(errorMessage);

  }

  /**
   * Parses the given model file and changes this parsers state accordingly.
   */
  private ASTNode parse(Reader modelReader, String modelName) {

    ASTNode astRoot = null;

    try {

      SimpleErrorDelegator errorDelegator = new SimpleErrorDelegator();
      MonticoreParser montiCoreParser = new MonticoreParser(
          modelName,
          modelReader,
          errorDelegator);

      this.parserConfigurator.configure(montiCoreParser);

      astRoot = montiCoreParser.parse();
      this.astRoots.put(modelName, astRoot);

      if (errorDelegator.errors.isEmpty()) {
        this.failedParsingAllModels = false;
      }
      else {
        this.succeededParsingAllModels = false;
        for (ProblemReport problemReport : errorDelegator.getErrors()) {
          this.addErrorMessage(modelName, problemReport.getMessage());
        }
      }
    }
    catch (RecognitionException e) {
      this.addErrorMessage(e.toString());
      this.succeededParsingAllModels = false;
    }
    catch (TokenStreamException e) {
      this.addErrorMessage(e.toString());
      this.succeededParsingAllModels = false;
    }

    return astRoot;
  }

  /**
   * Resets this parser's state.
   */
  private void reset() {
    this.astRoots.clear();
    this.errorMessages.clear();
    this.succeededParsingAllModels = true;
    this.failedParsingAllModels = true;
  }

}
