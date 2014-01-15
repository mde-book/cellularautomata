package fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.hardcoded_gameoflife

class TestHardcodedGameOfLife {
	
	def static void main(String[] args)  {
		var fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.inverter.VMInverter inverter = new fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.inverter.VMInverter
		inverter.invertVMValues("src/main/examples/lifeGame.evol.xmi", "src/main/examples/Moore5x5_corner.vm.xmi")
	}
}