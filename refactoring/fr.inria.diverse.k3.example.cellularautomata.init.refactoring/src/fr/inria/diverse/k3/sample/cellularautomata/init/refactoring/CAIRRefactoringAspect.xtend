package fr.inria.diverse.k3.sample.cellularautomata.init.refactoring

import core.Rule
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import ruleInit.CellularAutomataInitialization
import ruleInit.CoordinateRanges
import ruleInit.DimensionRange

import static extension fr.inria.diverse.k3.sample.cellularautomata.init.refactoring.RuleAspect.*
import geometry.RegularGeometry

@Aspect(className=CellularAutomataInitialization)
class CellularAutomataInitializationAspect{
	def public void extendDimension( int dimensionIndex, int increment){
		if(_self.geometry instanceof RegularGeometry){
			val geometry = _self.geometry as RegularGeometry
			val int dimensionPreviousSize = geometry.dimensions.get(dimensionIndex).extent
			geometry.dimensions.get(dimensionIndex).extent = dimensionPreviousSize + increment
			
			_self.seedRules.forEach[rule|
				rule.extendDimension(dimensionIndex, dimensionPreviousSize, increment)
			]
		}
	}
}

@Aspect(className=Rule)
class RuleAspect {
	def public void extendDimension( int dimension, int dimensionPreviousSize, int increment){
		if(_self.filter instanceof CoordinateRanges){
			(_self.filter as CoordinateRanges).coordinateRanges.forEach[coordinateRange |
				val DimensionRange dimensionRangeToExtend = coordinateRange.dimensionRanges.get(dimension) 
				if (dimensionRangeToExtend.upper == dimensionPreviousSize){
					dimensionRangeToExtend.upper = dimensionPreviousSize + increment
				} 
			]
		}
	}
}

