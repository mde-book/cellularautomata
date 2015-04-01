package fr.inria.diverse.k3.sample.cellularautomata.init.refactoring

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import core.Rule
import geometry.RegularGeometry
import ruleInit.CellularAutomataInitialization
import ruleInit.CoordinateRanges
import ruleInit.DimensionRange

import static extension fr.inria.diverse.k3.sample.cellularautomata.init.refactoring.RuleAspect.*

@Aspect(className=CellularAutomataInitialization)
class CellularAutomataInitializationAspect{
	def public void extendDimension( int dimIndex, int incr){
		if(_self.geometry instanceof RegularGeometry){
			val dimension = (_self.geometry as RegularGeometry).dimensions.get(dimIndex)
			val int dimPrevSize = dimension.extent
			dimension.extent = dimPrevSize + incr
			
			_self.seedRules.forEach[rule|
				rule.extendDimension(dimIndex, dimPrevSize, incr)
			]
		}
	}
}

@Aspect(className=Rule)
class RuleAspect {
	def public void extendDimension( int dimension, int dimPrevSize, int incr){
		if(_self.filter instanceof CoordinateRanges){
			(_self.filter as CoordinateRanges).coordinateRanges.forEach[coordinateRange |
				val DimensionRange dimRangeToExtend = coordinateRange.dimensionRanges.get(dimension) 
				if (dimRangeToExtend.upper == dimPrevSize){
					dimRangeToExtend.upper = dimPrevSize + incr
				} 
			]
		}
	}
}

