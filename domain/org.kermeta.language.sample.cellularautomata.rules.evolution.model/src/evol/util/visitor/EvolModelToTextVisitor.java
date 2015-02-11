/**
 */
package evol.util.visitor;

import core.util.visitor.CoreModelToTextVisitor;
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
public interface EvolModelToTextVisitor extends CoreModelToTextVisitor {
	public abstract String visitCellularAutomata(CellularAutomata automata);
	public abstract String visitCurrentCellPopulation(CurrentCellPopulation expression);
	public abstract String visitMax(Max expression);
	public abstract String visitMin(Min expression);
	public abstract String visitNeighborsExpression(NeighborsExpression expression);
	public abstract String visitPopulationRange(PopulationRange popRange);
	public abstract String visitSize(Size expression);
	public abstract String visitSum(Sum expression);
} 
