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
    left:AndExpression ("|" right:AndExpression)*;

  AndExpression =
    left:EqualExpression ("&" right:EqualExpression)*;

  EqualExpression =
    left:LowerExpression ("==" right:LowerExpression)*;

  LowerExpression =
    left:GreaterExpression ("<" right:GreaterExpression)*;
	
  GreaterExpression =
    left:AddExpression (">" right:AddExpression)*;

  AddExpression =
    left:MinusExpression ("+" right:MinusExpression)*;
	
  MinusExpression =
    left:MultExpression ("-" right:MultExpression)*;

  MultExpression =
    left:DivExpression ("*" right:DivExpression)*;

  DivExpression =
    left:ModExpression ("/" right:ModExpression)*;	

  ModExpression =
    left:UnaryExpression ("%" right:UnaryExpression)*;
	
  UnaryExpression =
    (not:["!"] | uminus:["-"])? LiteralsExpression;

  LiteralsExpression = "(" Conditional ")" | SignedIntegerLiteral | PositionLiteral; // TODO SignedIntegerLiteral
  
  SignedIntegerLiteral  = 
    /*(neg:["-"])?*/ IntLiteral; // TODO



}