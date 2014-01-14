package org.cellularautomata.lang.core;

version "0.0.1";

/**
 * A exemplary MontiCore grammar.
 *
 * @author
 */
grammar CellularAutomataCore {


  /* ======================================================================= */
  /* =============================== GRAMMAR =============================== */
  /* ======================================================================= */

  IntegerExpression = "1";

  Rule =
    "when" OrExpression variable:Name "=" IntegerExpression;

  OrExpression =
    left:AndExpression ("|" right:AndExpression)*;

  AndExpression =
    left:EqualExpression ("&" right:EqualExpression)*;

  EqualExpression =
    left:ComparisonExpression ("==" right:ComparisonExpression)*;

  ComparisonExpression =
    left:AddExpression ((lower:["<"] | greater:[">"]) right:AddExpression)*;

  AddExpression =
    left:MultExpression ((plus:["+"] | minus:["-"]) right:MultExpression)*;

  MultExpression =
    left:UnaryExpression ((mult:["*"] | div:["/"] | mod:["%"]) right:UnaryExpression)*;

  UnaryExpression =
    (not:["!"] | uminus:["-"])? LiteralsExpression;

  LiteralsExpression = "(" OrExpression ")" | IntegerExpression;

}