package fr.inria.diverse.k3.example.cellularautomata.compiler4mason

import com.google.common.base.Charsets
import com.google.common.io.Files
import evol.CellularAutomata
import evol.EvolPackage
import java.io.File
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension fr.inria.diverse.k3.example.cellularautomata.compiler4mason.aspects.CellularAutomataAspect.*

class EvolutionRuleCompiler4Mason {

	def public compile2mason(String ruleFile, String masonOutFile, String packageName){
		val CellularAutomata automata = loadRules(ruleFile)
		
		var Context context = new Context(packageName)
		
		automata.compile(context)

		saveJavaCARules(context.masonFileContentSB.toString, masonOutFile)
		println(context.masonFileContentSB)
	}


	public def CellularAutomata loadRules(String rulesFile) {
		var fact = new XMIResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(EvolPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(EvolPackage.eNS_URI, EvolPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact)
	
		var rs = new ResourceSetImpl()
		var uri = URI.createURI(rulesFile)
		var res = rs.getResource(uri, true)
		return res.getContents.get(0) as CellularAutomata
	}
	public def saveJavaCARules(String automataContenet, String masonOutFile) {
		
		val out = new File(masonOutFile);
		Files.write(automataContenet, out, Charsets.UTF_8)
		
		
	}
}