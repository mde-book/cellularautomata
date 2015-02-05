package fr.inria.diverse.k3.sample.cellularautomata.evol.refactoring

import core.Rule
import evol.CellularAutomata
import evol.EvolPackage
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension fr.inria.diverse.k3.sample.cellularautomata.evol.refactoring.RuleAspect.*

class EvolutionRuleRefactoring {

	def public refactorCondition(String ruleFile, String ruleOutFile){
		initEMFRegistry()
		val CellularAutomata automata = loadRules(ruleFile)
		var splittableRules = detectSplittableRules(automata.rules)
		while(!splittableRules.empty){			
			splittableRules.forEach[rule |
				automata.rules.remove(rule)
				automata.rules.addAll(rule.splitEqual())
			]
			splittableRules = detectSplittableRules(automata.rules)
		}
		saveRules(automata, ruleOutFile)
	}
	
	def public List<Rule> detectSplittableRules(List<Rule> rules){
		val result = new ArrayList<Rule>()
		rules.forEach[rule|
			if(rule.isEqualSplittable) {
				result.add(rule)	
			}
		]
		return result
	}

	public def CellularAutomata loadRules(String rulesFile) {
		var rs = new ResourceSetImpl()
		var res = rs.getResource(URI.createURI(rulesFile), true)
		return res.getContents.get(0) as CellularAutomata
	}
	public def saveRules(CellularAutomata automata, String rulesFile) {
		var rs = new ResourceSetImpl()
		var res = rs.createResource(URI.createURI(rulesFile))
		res.getContents.add(automata)
		res.save(null)
	}	
	
	public def initEMFRegistry(){
		var fact = new XMIResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(EvolPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(EvolPackage.eNS_URI, EvolPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact)
	}
	
}