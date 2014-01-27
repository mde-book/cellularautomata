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
    "where" GlobalPosition "initValue" "=" "{" Conditional "}"
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
    LowerExpression ("==" LowerExpression)*;

  LowerExpression =
    GreaterExpression ("<" GreaterExpression)*;
	
  GreaterExpression =
    AddExpression (">" AddExpression)*;

  AddExpression =
    MinusExpression ("+" MinusExpression)*;
	
  MinusExpression =
    MultExpression ("-" MultExpression)*;

  MultExpression =
    DivExpression ("*" DivExpression)*;

  DivExpression =
    ModExpression ("/" ModExpression)*;	

  ModExpression =
    UnaryExpression ("%" UnaryExpression)*;
	
  UnaryExpression =
    (not:["!"] | uminus:["-"])? LiteralsExpression;

  LiteralsExpression = "(" Conditional ")" | SignedIntegerLiteral | PositionLiteral; // TODO SignedIntegerLiteral
  
  SignedIntegerLiteral  = 
    /*(neg:["-"])?*/ IntLiteral; // TODO



}