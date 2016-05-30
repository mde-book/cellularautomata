package fr.inria.diverse.k3.example.cellularautomata.compiler4mason

class TestExecution {
	
	def static void main(String[] args)  {
		var EvolutionRuleCompiler4Mason compiler = new EvolutionRuleCompiler4Mason
		
		/*compiler.compile2mason("../cellularautomata_samples_models/evol_xmi/flipFlop.evol.xmi",
							   "../sample_cellularautomata_compiled_for_mason/src/generated_ca/CA.java")*/
		/* compiler.compile2mason("../cellularautomata_samples_models/evol_xmi/flipFlopInOneRule.evol.xmi",
							   "../sample_cellularautomata_compiled_for_mason/src/generated_ca/CA.java")*/	
		compiler.compile2mason("../cellularautomata_samples_models/evol_xmi/lifeGame.evol.xmi",
							   "../sample_cellularautomata_compiled_for_mason/src/generated_ca/CA.java",
							   "generated_ca")						
		println('End of EvolutionRuleCompiler4Mason')
	}
}