package fr.inria.diverse.k3.example.cellularautomata.visitorbasedsimulator;

import vm.Cell;
import vm.Universe;
//MDE_BOOK_START
public class SimulatorContext  {
	public Universe currentUniverse;
	public Cell currentCell;
//MDE_BOOK_END	
	
	public SimulatorContext(Universe currentUniverse){
		this.currentUniverse=currentUniverse;
	}
//MDE_BOOK_START	
}
//MDE_BOOK_END
