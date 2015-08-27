package fr.inria.diverse.k3.sample.cellularautomata.vm.generator

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import ruleInit.AreaFilter
import ruleInit.Area
import ruleInit.DimensionRange
import ruleInit.PositionLiteral
import vm.Cell
import core.Filter
import fr.inria.diverse.k3.sample.cellularautomata.vm.generator.Context

import static extension fr.inria.diverse.k3.sample.cellularautomata.vm.generator.CellAspect.*
import static extension fr.inria.diverse.k3.sample.cellularautomata.vm.generator.AreaAspect.*
import static extension fr.inria.diverse.k3.sample.cellularautomata.vm.generator.DimensionRangeAspect.*

@Aspect(className=Filter)
abstract class FilterAspect {
	def public Boolean isApplicableForCell(Cell cell)
}


@Aspect(className=AreaFilter)
class AreaFilterAspect extends FilterAspect {
	def public Boolean isApplicableForCell(Cell cell) {
		var Boolean result = true
		for (Area area:  _self.areas){
			result = area.isInRange(cell)
			if(result) return result			
		}
		return false // no range have matched the cell
	}
}

@Aspect(className=Area)
class AreaAspect {
	def public Boolean isInRange(Cell cell){
		var Boolean result = true
		if (_self.dimensionRanges.size == cell.coordinates.size) {
		    for(int i : 0.._self.dimensionRanges.size-1) {
		    	result = result && (_self.dimensionRanges.get(i).isInRange(cell.coordinates.get(i)))
		    }
		    return result
		}
		else return false   // illformed coordinateRange, must have the same number of dimensions as the universe TODO raise exception
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