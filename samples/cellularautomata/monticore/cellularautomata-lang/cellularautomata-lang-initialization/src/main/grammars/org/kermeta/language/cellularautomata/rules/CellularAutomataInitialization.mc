package org.kermeta.language.cellularautomata.rules;

version "0.0.1";

grammar CellularAutomataInitialization extends mc.literals.Literals {

  /* ======================================================================= */
  /* =============================== GRAMMAR =============================== */
  /* ======================================================================= */

  CAInit =
    RegularGeometry?
    rules:Rule (rules:Rule)*
  ;


  Rule =
    "init" GlobalPosition "by" "{" Conditional "}"
  ;

  GlobalPosition =
	"{" ranges:CoordinateRange ("x" (ranges:CoordinateRange)?)* "}"
  ;

  CoordinateRange =
	"[" (lowerCoord:IntLiteral) "," (upperCoord:IntLiteral) "]"
  ;

  PositionLiteral =
    "positionOn" "[" dimensionIndex:IntLiteral "]"
  ;

  RegularGeometry =
	"regularGeometry" neighborsNumber:IntLiteral "{" dimensions:Dimension  ("x" dimensions:Dimension)* "}"
  ;

  Dimension =
	(size:IntLiteral) | ["isCircular"] "(" size:IntLiteral ")"
  ;

  Conditional =
    OrExpression
    |
    ("if" Conditional "{" trueExpr:Conditional "}" "else" "{" falseExpr:Conditional "}")
  ;
  
  
  OrExpression =
    AndExpression ("|" AndExpression)*;

  AndExpression =
    EqualExpression ("&" EqualExpression)*;

  EqualExpression =
    ComparisonExpression ("==" ComparisonExpression)*;

  ComparisonExpression =
    AddExpression (ComparisonOperator AddExpression)*;
	
  ComparisonOperator =
    lower:["<"] | greater:[">"];

  AddExpression =
    MultExpression (AddOperator MultExpression)*;
	
  AddOperator = 
    plus:["+"] | minus:["-"];
	
  MultExpression =
    UnaryExpression (MultOperator UnaryExpression)*;
  
  MultOperator = 
    mult:["*"] | div:["/"] | mod:["%"];
	
  UnaryExpression =
    (not:["!"] | uminus:["-"])? PrimaryExpression;

  PrimaryExpression = "(" Conditional ")" | SignedIntegerLiteral | PositionLiteral; // TODO SignedIntegerLiteral
  
  SignedIntegerLiteral  = 
    /*(neg:["-"])?*/ IntLiteral; // TODO



}