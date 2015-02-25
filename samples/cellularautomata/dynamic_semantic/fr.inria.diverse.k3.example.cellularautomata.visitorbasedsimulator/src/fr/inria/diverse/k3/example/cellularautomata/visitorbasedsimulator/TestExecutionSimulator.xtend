package fr.inria.diverse.k3.example.cellularautomata.visitorbasedsimulator

class TestExecution {
	
	def static void main(String[] args)  {
		var Simulator simulator = new Simulator
		//simulator.simulateWithAsciiArt2Dvisualizer("src/main/examples/lifeGame.evol.xmi", "src/main/examples/Moore5x5_corner.vm.xmi", "5")
		simulator.simulateWithAsciiArt2Dvisualizer("../cellularautomata_samples_models/evol_xmi/lifeGame.evol.xmi", 
		                                           "../cellularautomata_samples_models/vm_xmi/Moore5x5_corner.vm.xmi", 
		                                           "5")
	}
}