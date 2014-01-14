package org.kermeta.language.cellularautomata.rules;

version "0.0.1";

grammar CellularAutomataInitialization extends org.kermeta.language.cellularautomata.rules.CellularAutomataCore {


  /* ======================================================================= */
  /* =============================== GRAMMAR =============================== */
  /* ======================================================================= */

  CellularAutomataInitialization =
    (geometry:RegularGeometry)?
    seedRules:Rule (seedRules:Rule)*
  ;


  Rule =
    "where"  "initValue" (filter:GlobalPosition) "=" "{" evaluatedVal:Conditional "}"
  ;

  GlobalPosition =
	"{" coordinateRanges:CoordinateRange ("x" (coordinateRanges:CoordinateRange)?)* "}"
  ;

  CoordinateRange =
	"[" (lowerCoordinate:IntLiteral) "," (upperCoordinate:IntLiteral) "]"
  ;

  InitializationLiteralsExpression extends LiteralsExpression = BooleanLiteral;

  PositionLiteral =
    "positionOn" "[" dimensionIndex:IntLiteral
  ;

  RegularGeometry =
	"regularGeometry" neighborsNumber:IntLiteral "{" dimensions:Dimension  ("x" dimensions:Dimension)* "}"
  ;

  Dimension =
	(size:IntLiteral) /* | (isCircular? = '(' size=EInt ')')*/ // TODO
  ;

}