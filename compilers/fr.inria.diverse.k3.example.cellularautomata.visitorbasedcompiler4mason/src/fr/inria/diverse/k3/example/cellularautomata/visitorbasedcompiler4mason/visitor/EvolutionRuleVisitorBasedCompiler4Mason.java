package fr.inria.diverse.k3.example.cellularautomata.visitorbasedcompiler4mason.visitor;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import core.Rule;
import evol.CellularAutomata;
import evol.EvolPackage;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


class EvolutionRuleVisitorBasedCompiler4Mason {

	public void compile2mason(String ruleFile, String masonOutFile, String packageName){
		CellularAutomata automata = loadRules(ruleFile);
		
		
		for(Rule rule :automata.getRules()){
			EvolutionRuleCompiler4MasonVisitor visitor = new EvolutionRuleCompiler4MasonVisitor();
			System.out.println(rule.getEvaluatedVal().accept(visitor));
		}
		//Context context = new Context(packageName);
		
		//automata.compile(context);

		//saveJavaCARules(context.masonFileContentSB.toString, masonOutFile);
		//println(context.masonFileContentSB);
	}


	public CellularAutomata loadRules(String rulesFile) {
		XMIResourceFactoryImpl fact = new XMIResourceFactoryImpl();
		if (!EPackage.Registry.INSTANCE.containsKey(EvolPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(EvolPackage.eNS_URI, EvolPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact);
	
		ResourceSetImpl rs = new ResourceSetImpl();
		URI uri = URI.createURI(rulesFile);
		Resource res = rs.getResource(uri, true);
		return (CellularAutomata)(res.getContents().get(0));
	}
	public void saveJavaCARules(String automataContenet, String masonOutFile) {
		
		File out = new File(masonOutFile);
		try{
		Files.write(automataContenet, out, Charsets.UTF_8);
		}catch(Exception e){e.printStackTrace(System.out);};
		
	}
}