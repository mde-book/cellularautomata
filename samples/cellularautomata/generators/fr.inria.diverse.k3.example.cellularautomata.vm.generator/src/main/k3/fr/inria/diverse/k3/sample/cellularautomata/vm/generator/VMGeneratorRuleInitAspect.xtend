package fr.inria.diverse.k3.sample.cellularautomata.vm.generator

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import ruleInit.CoordinateRanges
import ruleInit.CoordinateRange
import ruleInit.DimensionRange
import ruleInit.PositionLiteral
import vm.Cell
import core.Filter
import fr.inria.diverse.k3.sample.cellularautomata.vm.generator.Context

import static extension fr.inria.diverse.k3.sample.cellularautomata.vm.generator.CellAspect.*
import static extension fr.inria.diverse.k3.sample.cellularautomata.vm.generator.CoordinateRangeAspect.*
import static extension fr.inria.diverse.k3.sample.cellularautomata.vm.generator.DimensionRangeAspect.*

@Aspect(className=Filter)
abstract class FilterAspect {
	def public Boolean isApplicableForCell(Cell cell)
}


@Aspect(className=CoordinateRanges)
class CoordinateRangesAspect extends FilterAspect {
	def public Boolean isApplicableForCell(Cell cell) {
		var Boolean result = true
		if (_self.coordinateRanges.size == cell.coordinates.size) {
		    for(int i : 0.._self.coordinateRanges.size-1) {
		    	result = result && (_self.coordinateRanges.get(i).isInRange(cell.coordinates.get(i)))
		    }
		    return result
		}
	}
}

@Aspect(className=CoordinateRange)
class CoordinateRangeAspect {
	def public Boolean isInRange(Integer i) {
		var Boolean result = true
		for(DimensionRange dimRange : _self.dimensionRanges){
			result = result && dimRange.isInRange(i)
		}
		return result
	}
}

@Aspect(className=DimensionRange)
class DimensionRangeAspect {
	def public Boolean isInRange(Integer i) {
		return ((_self.lower <= i) && (i <= _self.upper))
	}
}

@Aspect(className=PositionLiteral)
class PositionLiteralAspect extends IntegerExpressionAspect {
	def public Integer evaluate(Context context) {
		return context.currentCell.coordinates.get(_self.dimensionIndex)
	}
}