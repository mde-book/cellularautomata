package fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects


import java.util.List
import java.util.ArrayList

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.example.cellularautomata.compiler4mason.Context
import core.Equal
import core.Or
import core.Rule
import core.Conditional
import core.IntegerExpression
import core.IntegerLiteral
import evol.NeighborsExpression
import evol.Size
import evol.Sum
import evol.Max
import evol.Min
import evol.CurrentCellPopulation

import static extension fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects.EqualAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects.IntegerExpressionAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects.FilterAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects.CurrentCellPopulationAspect.*
import core.BinaryExpression
import core.And
import core.Add

// from Core

@Aspect(className=Rule)
class RuleAspect {
	def public void compile (Context context) { 
		context.masonFileContentSB.append("
				if(")
		_self.filter.compile(context)
		context.masonFileContentSB.append("){\n")
		context.masonFileContentSB.append("					tut.grid.field[x][y] = ")
		_self.evaluatedVal.compile(context)
		context.masonFileContentSB.append(";
				}
		")
	}
}



@Aspect(className=IntegerExpression)
class IntegerExpressionAspect{
	def public void compile (Context context) { 
		context.masonFileContentSB.append("// IntegerExpressionAspect should not append, did you forget implementing a subclass aspect ?")
	}
}
@Aspect(className=BinaryExpression)
class BinaryExpressionAspect  extends IntegerExpressionAspect{}


@Aspect(className=IntegerLiteral)
class IntegerLiteralAspect extends IntegerExpressionAspect{
	
	def public void compile (Context context) { 
		context.masonFileContentSB.append(_self.^val)
	}
}

@Aspect(className=Add)
class AddAspect extends BinaryExpressionAspect{
	def public void compile (Context context) {
		context.masonFileContentSB.append("(")
		_self.left.compile(context) 
		context.masonFileContentSB.append(" + ")
		_self.right.compile(context)
		context.masonFileContentSB.append(")")
	}
}

@Aspect(className=Equal)
class EqualAspect extends BinaryExpressionAspect{
	def public void compile (Context context) {
		context.masonFileContentSB.append("(")
		_self.left.compile(context) 
		context.masonFileContentSB.append(" == ")
		_self.right.compile(context)
		context.masonFileContentSB.append("? 1 : 0)")
	}
}

@Aspect(className=Or)
class OrAspect extends BinaryExpressionAspect{
	def public void compile (Context context) {
		context.masonFileContentSB.append("(((")
		_self.left.compile(context) 
		context.masonFileContentSB.append(" != 0) || (")
		_self.right.compile(context)
		context.masonFileContentSB.append(" != 0))? 1: 0)")
	}
}

@Aspect(className=And)
class AndAspect extends BinaryExpressionAspect{
	def public void compile (Context context) {
		context.masonFileContentSB.append("(((")
		_self.left.compile(context) 
		context.masonFileContentSB.append(" != 0) && (")
		_self.right.compile(context)
		context.masonFileContentSB.append(" != 0))? 1: 0)")
	}
	
}



@Aspect(className=Conditional)
class ConditionnalAspect  extends IntegerExpressionAspect{
	def public void compile (Context context) {
		 
		_self.condition.compile(context);
		context.masonFileContentSB.append("== 1 ? ");
		_self.ifTrueExpression.compile(context);
		context.masonFileContentSB.append(" : ");
		_self.ifFalseExpression.compile(context);
	}
}


// from evol
@Aspect(className=typeof(CurrentCellPopulation))
class CurrentCellPopulationAspect extends IntegerExpressionAspect {	
	def public void compile (Context context) { 
		context.masonFileContentSB.append("currentVal")
	}
}

@Aspect(className=typeof(NeighborsExpression))
abstract class NeighborsExpressionAspect extends IntegerExpressionAspect {}

@Aspect(className=typeof(Size))
class SizeAspect extends NeighborsExpressionAspect {
	def public void compile (Context context) { 
		// TODO
	}
}

@Aspect(className=typeof(Sum))
class SumAspect extends NeighborsExpressionAspect {
	def public void compile (Context context) {
		if(_self.neighborsFilter != null){
			context.masonFileContentSB.append("Utils.neighborSum(tempGrid, x, y, new RangeFilter("+_self.neighborsFilter.lowerRange+","+_self.neighborsFilter.upperRange+"))")
		} 
		else{
			context.masonFileContentSB.append("Utils.neighborSum(tempGrid, x, y)")		
		}
	}
}

@Aspect(className=typeof(Max))
class MaxAspect extends NeighborsExpressionAspect {
	def public void compile (Context context) { 
		if(_self.neighborsFilter != null){
			context.masonFileContentSB.append("Utils.neighborMax(tempGrid, x, y, new RangeFilter("+_self.neighborsFilter.lowerRange+","+_self.neighborsFilter.upperRange+"))")
		} 
		else{
			context.masonFileContentSB.append("Utils.neighborMax(tempGrid, x, y)")		
		}
	}
}

@Aspect(className=typeof(Min))
class MinAspect extends NeighborsExpressionAspect {
	def public void compile (Context context) { 
		if(_self.neighborsFilter != null){
			context.masonFileContentSB.append("Utils.neighborMin(tempGrid, x, y, new RangeFilter("+_self.neighborsFilter.lowerRange+","+_self.neighborsFilter.upperRange+"))")
		} 
		else{
			context.masonFileContentSB.append("Utils.neighborMin(tempGrid, x, y)")		
		}
	}
}