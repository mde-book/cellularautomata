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
public interface CAERModelToTextVisitor extends CoreModelToTextVisitor {
	public String visitCellularAutomata(CellularAutomata automata);
	public String visitCurrentCellPopulation(CurrentCellPopulation expression);
	public String visitMax(Max expression);
	public String visitMin(Min expression);
	public String visitNeighborsExpression(NeighborsExpression expression);
	public String visitPopulationRange(PopulationRange popRange);
	public String visitSize(Size expression);
	public String visitSum(Sum expression);
} 
