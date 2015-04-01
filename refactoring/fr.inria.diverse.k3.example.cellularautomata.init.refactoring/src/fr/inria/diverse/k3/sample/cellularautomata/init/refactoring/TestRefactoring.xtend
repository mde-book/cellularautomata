package fr.inria.diverse.k3.sample.cellularautomata.init.refactoring

class TestExecution {
	
	def static void main(String[] args)  {
	var CAIRRefactoring refactoring = new CAIRRefactoring
	//refactoring.refactorCondition("src/main/examples/flipFlop.evol.xmi","src/main/examples/out/flipFlop.evol.xmi")
	refactoring.extendDimension("../cellularautomata_samples_models/init_xmi/Moore5x5_corner.rulesInit.xmi", 
		                          "../cellularautomata_samples_models/out/Moore5x5_2_extended_by_5_corner.rulesInit.xmi",
		                          1,
		                          5)
	refactoring.extendDimension("../cellularautomata_samples_models/init_xmi/Moore5x5_corner.rulesInit.xmi", 
		                          "../cellularautomata_samples_models/out/Moore5x5_1_extended_by_3_corner.rulesInit.xmi",
		                          0,
		                          3)		                         
	}
}