package fr.inria.diverse.k3.example.cellularautomata.visitorbasedsimulator;

import vm.Cell;
import vm.Universe;

public class SimulatorContext  {
	public Universe currentUniverse;
	public Cell currentCell;
	
	
	public SimulatorContext(Universe currentUniverse){
		this.currentUniverse=currentUniverse;
	}
	
}
