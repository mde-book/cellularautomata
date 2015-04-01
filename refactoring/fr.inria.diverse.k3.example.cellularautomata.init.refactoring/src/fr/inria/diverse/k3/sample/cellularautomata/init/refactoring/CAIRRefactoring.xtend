package fr.inria.diverse.k3.sample.cellularautomata.init.refactoring

import core.Rule
import ruleInit.CellularAutomataInitialization
import ruleInit.InitPackage
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension fr.inria.diverse.k3.sample.cellularautomata.init.refactoring.CellularAutomataInitializationAspect.*

class CAIRRefactoring {
	def public extendDimension(String ruleFile, String ruleOutFile, int dimensionIndex, int increment){
		initEMFRegistry()
		val CellularAutomataInitialization automata = loadRules(ruleFile)
		automata.extendDimension(dimensionIndex, increment)
		saveRules(automata, ruleOutFile)
	}
	
	

	public def CellularAutomataInitialization loadRules(String rulesFile) {
		var rs = new ResourceSetImpl()
		var res = rs.getResource(URI.createURI(rulesFile), true)
		return res.getContents.get(0) as CellularAutomataInitialization
	}
	public def saveRules(CellularAutomataInitialization automata, String rulesFile) {
		var rs = new ResourceSetImpl()
		var res = rs.createResource(URI.createURI(rulesFile))
		res.getContents.add(automata)
		res.save(null)
	}	
	
	public def initEMFRegistry(){
		var fact = new XMIResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(InitPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(InitPackage.eNS_URI, InitPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact)
	}
}