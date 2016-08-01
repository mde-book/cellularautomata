package fr.inria.diverse.k3.sample.cellularautomata.evol.refactoring


import java.util.List
import java.util.ArrayList

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import core.Equal
import core.Rule
import core.Conditional
import core.IntegerLiteral
import core.CoreFactory
import evol.PopulationRange
import evol.CurrentCellPopulation
import evol.EvolFactory
// TODO rename package from  "fr.inria.diverse.k3.sample.cellularautomata.evol" to "caer"
//MDE_BOOK_START
import static extension fr.inria.diverse.k3.sample.cellularautomata.evol.refactoring.EqualAspect.*
import static extension fr.inria.diverse.k3.sample.cellularautomata.evol.refactoring.PopulationRangeAspect.*

@Aspect(className=typeof(Rule))
class RuleAspect {
	def public Boolean isEqualSplittable() {
		if(_self.filter instanceof PopulationRange){
			val lower = (_self.filter as PopulationRange).lowerRange
			val upper = (_self.filter as PopulationRange).upperRange
			if (lower != upper){
				if(_self.evaluatedVal instanceof Conditional){
					val conditional = (_self.evaluatedVal as Conditional)
					if(conditional.condition instanceof Equal){
						val equal = conditional.condition as Equal
						if(equal.isLeftOrRigthCurrentCellPopulation && equal.isLeftOrRigthIntegerLiteralOnBorderOfRange(lower, upper)){
							return true
		}	}	}	}	}
		return false
	}
		
	def public List<Rule> splitEqual() {
		val result = new ArrayList<Rule>		
		val lower = (_self.filter as PopulationRange).lowerRange
		val upper = (_self.filter as PopulationRange).upperRange
		val evaluatedValCond = _self.evaluatedVal as Conditional
		val equalcondition = evaluatedValCond.condition as Equal
		
		var Integer literalValue
		if (equalcondition.left instanceof IntegerLiteral) 
			literalValue = (equalcondition.left as IntegerLiteral).^val
		if (equalcondition.right instanceof IntegerLiteral) 
			literalValue= (equalcondition.right as IntegerLiteral).^val
		
		val lowerRule = CoreFactory.eINSTANCE.createRule
		val upperRule = CoreFactory.eINSTANCE.createRule
		if(literalValue == lower){
			lowerRule.filter = EvolFactory.eINSTANCE.createPopulationRange.init(lower, lower)
			lowerRule.evaluatedVal = evaluatedValCond.ifTrueExpression
			upperRule.filter = EvolFactory.eINSTANCE.createPopulationRange.init(lower+1, upper)
			upperRule.evaluatedVal = evaluatedValCond.ifFalseExpression
		}
		else{
			lowerRule.filter = EvolFactory.eINSTANCE.createPopulationRange.init(lower, upper-1)
			lowerRule.evaluatedVal = evaluatedValCond.ifFalseExpression
			upperRule.filter = EvolFactory.eINSTANCE.createPopulationRange.init(upper, upper)
			upperRule.evaluatedVal = evaluatedValCond.ifTrueExpression
		}
		
		result.add(lowerRule)
		result.add(upperRule)
		return result
	}
}

@Aspect(className=typeof(Equal))
class EqualAspect {
	def public boolean isLeftOrRigthCurrentCellPopulation() {
		return _self.left instanceof CurrentCellPopulation || _self.right  instanceof CurrentCellPopulation
	}
	
	def public boolean isLeftOrRigthIntegerLiteralOnBorderOfRange(int lower, int upper) {
		return (_self.left instanceof IntegerLiteral && ((_self.left as IntegerLiteral).^val == lower || (_self.left as IntegerLiteral).^val == upper))
			|| (_self.right instanceof IntegerLiteral && ((_self.right as IntegerLiteral).^val == lower || (_self.right as IntegerLiteral).^val == upper))
	}
}

@Aspect(className=PopulationRange)
class PopulationRangeAspect {
	def public PopulationRange init(int lowerRange, int upperRange){
		_self.lowerRange = lowerRange
		_self.upperRange = upperRange
		return _self
	}
}
//MDE_BOOK_END