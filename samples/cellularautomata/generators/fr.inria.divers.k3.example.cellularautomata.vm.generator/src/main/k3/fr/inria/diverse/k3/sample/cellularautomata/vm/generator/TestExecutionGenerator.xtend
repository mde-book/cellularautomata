package fr.inria.diverse.k3.sample.cellularautomata.vm.generator

class TestExecutionGenerator {
	
	def static void main(String[] args)  {
		var UniverseGenerator universeGenerator = new UniverseGenerator
		universeGenerator.generateInitialUniverseForAutomataFile("src/main/examples/generator/Moore5x5_corner.rulesInit.xmi")
	}
} 