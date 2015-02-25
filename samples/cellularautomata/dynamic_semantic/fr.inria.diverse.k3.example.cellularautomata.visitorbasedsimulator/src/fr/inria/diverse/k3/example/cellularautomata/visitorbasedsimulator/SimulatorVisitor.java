package fr.inria.diverse.k3.example.cellularautomata.visitorbasedsimulator;



import vm.*;
import evol.*;
import evol.util.visitor.EvolEvaluationVisitor;
import core.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class SimulatorVisitor implements EvolEvaluationVisitor{
	public SimulatorContext context;

	public SimulatorVisitor(SimulatorContext context) {
		super();
		this.context = context;
	}

	@Override
	public int visitCellularAutomata(CellularAutomata automata) {
		HashMap<Cell, Integer> futureCellValues = new HashMap<Cell, Integer>();
		for (Cell cell : context.currentUniverse.getCells()) {
			context.currentCell = cell;
			Optional<Rule> rule = automata.getRules().stream().filter(r -> isRuleApplicableForCell(r, cell)).findFirst();
			if(!rule.isPresent()){
				// no rule applicable, report the current value as the future
				futureCellValues.put(cell, cell.getVal());
			} else {
				futureCellValues.put(cell, rule.get().accept(this));
			}
		}
		for (Cell cell : context.currentUniverse.getCells()) {
			cell.setVal(futureCellValues.get(cell));
		}
		return 0;
	}
	@Override
	public int visitRule(Rule rule) {
		return rule.getEvaluatedVal().accept(this);
	}
	@Override
	public int visitIntegerLiteral(IntegerLiteral expression) {
		return expression.getVal();
	}
	@Override
	public int visitAdd(Add expression) {
		return expression.getLeft().accept(this) + expression.getRight().accept(this);
	}
	@Override
	public int visitConditional(Conditional expression) {
		if (expression.getCondition().accept(this) != 0) {
			return expression.getIfTrueExpression().accept(this);
		} else {
			return expression.getIfFalseExpression().accept(this);				
		}
	}
	@Override
	public int visitEqual(Equal expression) {
		int left = expression.getLeft().accept(this);
		int right = expression.getRight().accept(this);
		return left == right ? 1 : 0;
	}
	@Override
	public int visitDiv(Div expression) {
		return expression.getLeft().accept(this) / expression.getRight().accept(this);
	}
	@Override
	public int visitGreater(Greater expression) {
		int left = expression.getLeft().accept(this);
		int right = expression.getRight().accept(this);
		return left > right ? 1 : 0;
	}
	@Override
	public int visitLower(Lower expression) {
		int left = expression.getLeft().accept(this);
		int right = expression.getRight().accept(this);
		return left < right ? 1 : 0;
	}
	@Override
	public int visitMinus(Minus expression) {
		return expression.getLeft().accept(this) - expression.getRight().accept(this);
	}
	@Override
	public int visitMod(Mod expression) {
		return expression.getLeft().accept(this) % expression.getRight().accept(this);
	}
	@Override
	public int visitMult(Mult expression) {
		return expression.getLeft().accept(this) * expression.getRight().accept(this);
	}
	@Override
	public int visitNot(Not expression) {
		boolean target = expression.getTarget().accept(this) != 0 ;
		return (!target) ? 1 : 0;
	}
	@Override
	public int visitAnd(And expression) {
		boolean left = expression.getLeft().accept(this) != 0 ;
		boolean right = expression.getRight().accept(this) != 0;
		return left && right ? 1 : 0;
	}
	@Override
	public int visitOr(Or expression) {
		boolean left = expression.getLeft().accept(this) != 0 ;
		boolean right = expression.getRight().accept(this) != 0;
		return left || right ? 1 : 0;
	}
	@Override
	public int visitUMinus(UMinus expression) {
		return -(expression.getTarget().accept(this));
	}
	@Override
	public int visitCurrentCellPopulation(CurrentCellPopulation expression) {
		return context.currentCell.getVal();
	}
	@Override
	public int visitMax(Max expression) {
		Stream<Integer> selectedCellValues;
		if (expression.getNeighborsFilter() == null) {
			selectedCellValues = context.currentCell.getNeighbors().stream().map(cellValue -> cellValue.getVal());
		} else {
			Filter filter = expression.getNeighborsFilter();
			selectedCellValues = context.currentCell.getNeighbors().stream()
					.filter(cell -> isFilterApplicableForCell(filter, cell))
					.map(cellValue -> cellValue.getVal());
		}
		return selectedCellValues.reduce(Integer.MIN_VALUE, (p1, p2) -> p1 < p2 ? p2 : p1); 
	}
	@Override
	public int visitMin(Min expression) {
		Stream<Integer> selectedCellValues;
		if (expression.getNeighborsFilter() == null) {
			selectedCellValues = context.currentCell.getNeighbors().stream().map(cellValue -> cellValue.getVal());
		} else {
			Filter filter = expression.getNeighborsFilter();
			selectedCellValues = context.currentCell.getNeighbors().stream()
					.filter(cell -> isFilterApplicableForCell(filter, cell))
					.map(cellValue -> cellValue.getVal());
		}
		return selectedCellValues.reduce(Integer.MAX_VALUE, (p1, p2) -> p1 > p2 ? p2 : p1);
	}
	@Override
	public int visitSize(Size expression) {
		if (expression.getNeighborsFilter() == null) {
			return context.currentCell.getNeighbors().size();
		} else {
			Filter filter = expression.getNeighborsFilter();
			return context.currentCell.getNeighbors().stream()
					.filter(cell -> isFilterApplicableForCell(filter, cell))
					.mapToInt(c -> 1)
					.sum();
		}
	}
	@Override
	public int visitSum(Sum expression) {
		if (expression.getNeighborsFilter() == null) {
			return context.currentCell.getNeighbors().stream()
					.mapToInt(cell -> cell.getVal()).sum();
		} else {
			Filter filter = expression.getNeighborsFilter();
			return context.currentCell.getNeighbors().stream()
					.filter(cell -> isFilterApplicableForCell(filter, cell))
					.mapToInt(cell -> cell.getVal())
					.sum();
		}
		
	}

	@Override
	public int visitFilter(Filter filter) {
		// do nothing, should never append
		return 0;
	}
	@Override
	public int visitPopulationRange(PopulationRange popRange) {
		// do nothing, should never append
		return 0;
	}
	//----------------
	// visit methods related to abstract concepts
	//----------------
	@Override
	public int visitIntegerExpression(IntegerExpression expression) {
		// do nothing, should never append
		return 0;
	}

	@Override
	public int visitBinaryExpression(BinaryExpression expression) {
		// do nothing, should never append
		return 0;
	}

	@Override
	public int visitUnaryExpression(UnaryExpression expression) {
		// do nothing, should never append
		return 0;
		
	}
	@Override
	public int visitNeighborsExpression(NeighborsExpression expression) {
		// do nothing, should never append
		return 0;
	}


	//----------------
	// Helper methods
	//----------------
	private boolean isRuleApplicableForCell(Rule r, Cell cell) {
		if (r.getFilter() == null) {
			return true;
		}
		else {
			return isFilterApplicableForCell(r.getFilter(), cell);
		}
	}

	private boolean isFilterApplicableForCell(Filter filter, Cell cell) {
		if(filter instanceof PopulationRange){
			return doesPopulationRangeMatchesValue((PopulationRange) filter, cell.getVal());
		} else { return false; }
	}
	private boolean doesPopulationRangeMatchesValue(PopulationRange filter, Integer value) {
		return ((value >= filter.getLowerRange()) && (value <= filter.getUpperRange()));
	}	
	
}
