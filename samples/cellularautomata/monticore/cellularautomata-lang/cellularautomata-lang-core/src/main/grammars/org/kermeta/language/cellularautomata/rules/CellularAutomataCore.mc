package org.kermeta.language.cellularautomata.rules;

version "0.0.1";

/**
 * A exemplary MontiCore grammar.
 *
 * @author
 */
grammar CellularAutomataCore extends mc.literals.Literals {


  /* ======================================================================= */
  /* =============================== GRAMMAR =============================== */
  /* ======================================================================= */


  // TODO is this rule really needed in this core grammar?
  Rule =
    "when" OrExpression variable:Name "=" IntLiteral; // TODO SignedIntLiteral

  Conditional =
    OrExpression
    |
    ("if" condition:Conditional "{" trueExpr:Conditional "}" "else" "{" falseExpr:Conditional "}")
  ;

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

  LiteralsExpression = "(" OrExpression ")" | IntLiteral; // TODO SignedIntLiteral

}