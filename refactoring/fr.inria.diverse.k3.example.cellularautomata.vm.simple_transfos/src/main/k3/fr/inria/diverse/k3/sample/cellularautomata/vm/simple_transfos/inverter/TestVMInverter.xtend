package fr.inria.diverse.k3.sample.cellularautomata.vm.simple_transfos.inverter

class TestVMInverter {
	
	def static void main(String[] args)  {
		var VMInverter inverter = new VMInverter
		inverter.invertVMValues("src/main/examples/lifeGame.evol.xmi", "src/main/examples/Moore5x5_corner.vm.xmi")
	}
}