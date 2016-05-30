package fr.inria.diverse.k3.example.cellularautomata.visitorbasedcompiler4mason.visitor;

public class TestCompiler {
	public static void main(String [] args){
	 EvolutionRuleVisitorBasedCompiler4Mason compiler = new EvolutionRuleVisitorBasedCompiler4Mason();
			
			/*compiler.compile2mason("../cellularautomata_samples_models/evol_xmi/flipFlop.evol.xmi",
								   "../sample_cellularautomata_compiled_for_mason/src/generated_ca/CA.java")*/
			/* compiler.compile2mason("../cellularautomata_samples_models/evol_xmi/flipFlopInOneRule.evol.xmi",
								   "../sample_cellularautomata_compiled_for_mason/src/generated_ca/CA.java")*/	
			/*compiler.compile2mason("../cellularautomata_samples_models/evol_xmi/lifeGame.evol.xmi",
								   "../sample_cellularautomata_compiled_for_mason/src/generated_ca/CA.java",
								   "generated_ca");	*/
			compiler.compile2mason("../cellularautomata_samples_models/evol_xmi/sampleIntegerExpression.evol.xmi",
					   "../sample_cellularautomata_compiled_for_mason/src/generated_ca/CA.java",
					   "generated_ca");	
			System.out.println("End of EvolutionRuleVisitorBasedCompiler4Mason");
	}
}
