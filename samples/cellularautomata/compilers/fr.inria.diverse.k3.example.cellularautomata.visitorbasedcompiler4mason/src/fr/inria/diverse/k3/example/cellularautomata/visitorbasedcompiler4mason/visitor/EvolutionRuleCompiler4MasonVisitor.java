package fr.inria.diverse.k3.example.cellularautomata.visitorbasedcompiler4mason.visitor;

import core.Add;
import core.And;
import core.BinaryExpression;
import core.Conditional;
import core.Div;
import core.Equal;
import core.Filter;
import core.Greater;
import core.IntegerExpression;
import core.IntegerLiteral;
import core.Lower;
import core.Minus;
import core.Mod;
import core.Mult;
import core.Not;
import core.Or;
import core.Rule;
import core.UMinus;
import core.UnaryExpression;
import core.util.visitor.CoreModelToTextVisitor;
import evol.CellularAutomata;
import evol.CurrentCellPopulation;
import evol.Max;
import evol.Min;
import evol.NeighborsExpression;
import evol.PopulationRange;
import evol.Size;
import evol.Sum;
import evol.util.visitor.CAERModelToTextVisitor;


class EvolutionRuleCompiler4MasonVisitor implements CAERModelToTextVisitor {
	
	
	@Override
	public String visitIntegerExpression(IntegerExpression expression) {
		// TODO Auto-generated method stub
		return "[PB : visit(IntegerExpression "+expression.getClass().getSimpleName()+")]";
	}
	
	@Override
	public String visitBinaryExpression(BinaryExpression expression) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override	
	public String visitIntegerLiteral(IntegerLiteral expression) {
		return Integer.toString(expression.getVal());
	}
	
	@Override
	public String visitConditional(Conditional expression) {
		return  expression.getCondition().accept(this) + "== 1 ?"+
				expression.getIfTrueExpression().accept(this)+":"+
				expression.getIfFalseExpression().accept(this);
	}


	@Override
	public String visitUnaryExpression(UnaryExpression expression) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String visitAnd(And expression) {		
		return "((("+ expression.getLeft().accept(this)+" != 0" + ") && (" + 
				expression.getRight().accept(this)+" != 0))? 1: 0)";
	}


	@Override
	public String visitAdd(Add expression) {
		return "("+ expression.getLeft().accept(this) + " + " + expression.getRight().accept(this) + ")";
	}


	@Override
	public String visitDiv(Div expression) {
		return "("+ expression.getLeft().accept(this) + " / " + expression.getRight().accept(this) + ")";
	}


	@Override
	public String visitEqual(Equal expression) {
		return "("+ expression.getLeft().accept(this) + " == " + expression.getRight().accept(this) + "? 1 : 0)";
	}


	@Override
	public String visitFilter(Filter expression) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String visitGreater(Greater expression) {
		return "("+ expression.getLeft().accept(this) + " > " + expression.getRight().accept(this) + "? 1 : 0)";
	}


	@Override
	public String visitLower(Lower expression) {
		return "("+ expression.getLeft().accept(this) + " < " + expression.getRight().accept(this) + "? 1 : 0)";
	}


	@Override
	public String visitMinus(Minus expression) {
		return "("+ expression.getLeft().accept(this) + " - " + expression.getRight().accept(this) + ")";
	}


	@Override
	public String visitMult(Mult expression) {
		return "("+ expression.getLeft().accept(this) + " * " + expression.getRight().accept(this) + ")";
	}


	@Override
	public String visitNot(Not expression) {
		return "(" + expression.getTarget().accept(this)+"!=0 ? 1 : 0)";
	}


	@Override
	public String visitOr(Or expression) {
		return "((("+ expression.getLeft().accept(this)+" != 0" + ") || (" + 
				expression.getRight().accept(this)+" != 0))? 1: 0)";
	}


	@Override
	public String visitRule(Rule expression) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String visitUMinus(UMinus expression) {
		return "(-" + expression.getTarget().accept(this) + ")";
	}

	@Override
	public String visitCellularAutomata(CellularAutomata automata) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitCurrentCellPopulation(CurrentCellPopulation expression) {
		return "currentVal";
	}

	@Override
	public String visitMax(Max expression) {
		if(expression.getNeighborsFilter() != null){
			return "Utils.neighborMax(tempGrid, x, y, new RangeFilter("
					+ expression.getNeighborsFilter().getLowerRange()+","
					 +expression.getNeighborsFilter().getUpperRange()+"))";
		} 
		else{
			return "Utils.neighborMax(tempGrid, x, y)";		
		}
	}

	@Override
	public String visitMin(Min expression) {
		if(expression.getNeighborsFilter() != null){
			return "Utils.neighborMin(tempGrid, x, y, new RangeFilter("
					+ expression.getNeighborsFilter().getLowerRange()+","
					 +expression.getNeighborsFilter().getUpperRange()+"))";
		} 
		else{
			return "Utils.neighborMin(tempGrid, x, y)";		
		}
	}

	@Override
	public String visitNeighborsExpression(NeighborsExpression expression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitPopulationRange(PopulationRange expression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitSize(Size expression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitSum(Sum expression) {
		if(expression.getNeighborsFilter() != null){
			return "Utils.neighbourSum(tempGrid, x, y, new RangeFilter("
					+ expression.getNeighborsFilter().getLowerRange()+","
					 +expression.getNeighborsFilter().getUpperRange()+"))";
		} 
		else{
			return "Utils.neighbourSum(tempGrid, x, y)";		
		}

	}

	@Override
	public String visitMod(Mod expression) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}