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
    "init" Ranges "by" "{" Conditional "}"
  ;
  
  Ranges =
    Range ("," Range)*
  ;
  
  Range =
	"(" Interval ("," Interval)* ")"
  ;
  
  Interval =
    IntLiteral (".." IntLiteral)?
  ;


  RegularGeometry =
	"regularGeometry" (["neumann"]|["moore"]) "{" dimensions:Dimension  ("x" dimensions:Dimension)* "}" (["allCircular"])?
  ;

  Dimension =
	(size:IntLiteral) (["circular"])?
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

  PrimaryExpression = "(" Conditional ")" | SignedIntegerLiteral | position:Name;
  
  SignedIntegerLiteral  = 
    /*(neg:["-"])?*/ IntLiteral; // TODO



}