package generated_ca;

import cellularautomata.mason.utils.*;
import sim.engine.*;
import sim.field.grid.*;

public class MyGeneratedMasonAutomata implements Steppable{
	private static final long serialVersionUID = 1L;
	public IntGrid2D tempGrid = new IntGrid2D(0,0);

    @Override
    public void step(SimState state){
    	 GeneratedAutomataSimulationState tut = (GeneratedAutomataSimulationState)state;
        // first copy the grid into tempGrid
        tempGrid.setTo(tut.grid);
        
        // now apply the CA rules for each cell...
        int width = tempGrid.getWidth();
        int height = tempGrid.getHeight();
        for(int x=0;x<width;x++){
			for(int y=0;y<height;y++){            	
				int currentVal = tempGrid.field[tempGrid.stx(x)][tempGrid.sty(y)];
				if(1 <= currentVal && currentVal <= 1){
					tut.grid.field[x][y] = ((((2 == Utils.neighborSum(tempGrid, x, y)? 1 : 0) != 0) || ((3 == Utils.neighborSum(tempGrid, x, y)? 1 : 0) != 0))? 1: 0)== 1 ? 1 : 0;
				}
		
				if(0 <= currentVal && currentVal <= 0){
					tut.grid.field[x][y] = (3 == Utils.neighborSum(tempGrid, x, y)? 1 : 0)== 1 ? 1 : currentVal;
				}		
			}
		}
	}
}