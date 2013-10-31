package fr.inria.diverse.k3.sample.cellularautomata.simulator

class TestExecution {
	
	def static void main(String[] args)  {
		var Simulator simulator = new Simulator
		simulator.simulateWithAsciiArt2Dvisualizer("src/main/examples/lifeGame.evol.xmi", "src/main/examples/Moore5x5_corner.vm.xmi", "5")
	}
}