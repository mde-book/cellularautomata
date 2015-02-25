/**
 */
package evol.util.visitor;

import core.util.visitor.EvaluationVisitor;
import evol.CellularAutomata;
import evol.CurrentCellPopulation;
import evol.Max;
import evol.Min;
import evol.NeighborsExpression;
import evol.PopulationRange;
import evol.Size;
import evol.Sum;

/**
 * 
 */
public interface EvolEvaluationVisitor extends EvaluationVisitor {
	int visitCellularAutomata(CellularAutomata automata);
	int visitCurrentCellPopulation(CurrentCellPopulation expression);
	int visitMax(Max expression);
	int visitMin(Min expression);
	int visitNeighborsExpression(NeighborsExpression expression);
	int visitPopulationRange(PopulationRange popRange);
	int visitSize(Size expression);
	int visitSum(Sum expression);
} 
