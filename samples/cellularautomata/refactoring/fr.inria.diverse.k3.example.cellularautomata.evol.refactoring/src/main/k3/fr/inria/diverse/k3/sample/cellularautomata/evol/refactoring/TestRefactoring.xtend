package fr.inria.diverse.k3.sample.cellularautomata.evol.refactoring

class TestExecution {
	
	def static void main(String[] args)  {
	var EvolutionRuleRefactoring refactoring = new EvolutionRuleRefactoring
	//refactoring.refactorCondition("src/main/examples/flipFlop.evol.xmi","src/main/examples/out/flipFlop.evol.xmi")
	refactoring.refactorCondition("../cellularautomata_samples_models/evol_xmi/flipFlopInOneRule.evol.xmi", 
		                          "../cellularautomata_samples_models/evol_xmi/out/flipFlop_refactored.evol.xmi")
	}
}