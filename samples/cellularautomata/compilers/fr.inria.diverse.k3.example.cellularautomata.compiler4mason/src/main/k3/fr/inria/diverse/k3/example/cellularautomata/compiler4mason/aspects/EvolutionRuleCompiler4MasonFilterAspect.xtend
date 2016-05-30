package fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.example.cellularautomata.compiler4mason.Context

import core.Filter
import evol.PopulationRange
import evol.CellularAutomata



import static extension fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects.FilterAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects.RuleAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects.IntegerExpressionAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects.IntegerLiteralAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects.NeighborsExpressionAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects.SizeAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects.SumAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects.MaxAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects.MinAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects.PopulationRangeAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects.CellularAutomataAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects.CurrentCellPopulationAspect.*



@Aspect(className=Filter)
abstract class FilterAspect {
	def public void compile (Context context)
	
}



@Aspect(className=typeof(PopulationRange))
class PopulationRangeAspect extends FilterAspect {
	@OverrideAspectMethod
	def public void compile (Context context) { 
		
		context.masonFileContentSB.append('''«_self.lowerRange» <= currentVal && currentVal <= «_self.upperRange»''')
	}
}

@Aspect(className=typeof(CellularAutomata))
class CellularAutomataAspect {
	def public void compile (Context context) { 
		val String start = '''package «context.packageName»;

import cellularautomata.mason.utils.*;
import sim.engine.*;
import sim.field.grid.*;

public class CA implements Steppable{
    private static final long serialVersionUID = 1;

    // the width and height will change later
    public IntGrid2D tempGrid = new IntGrid2D(0,0);

    @Override
    public void step(SimState state){
    	 CA_SimulationState tut = (CA_SimulationState)state;
        // first copy the grid into tempGrid
        tempGrid.setTo(tut.grid);
        
        // now apply the CA rules!
        
        // for each cell...
        int width = tempGrid.getWidth();
        int height = tempGrid.getHeight();
        for(int x=0;x<width;x++){
			for(int y=0;y<height;y++){            	
				int currentVal = tempGrid.field[tempGrid.stx(x)][tempGrid.sty(y)];
				'''
    
		context.masonFileContentSB.append(start)
		_self.rules.forEach[ r | r.compile(context)]
		context.masonFileContentSB.append("
			}
		}
	}
}")
	}
}





