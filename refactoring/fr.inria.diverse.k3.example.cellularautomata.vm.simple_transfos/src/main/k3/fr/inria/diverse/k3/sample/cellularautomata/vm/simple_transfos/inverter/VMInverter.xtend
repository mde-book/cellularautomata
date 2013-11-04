package fr.inria.diverse.k3.sample.cellularautomata.vm.simple_transfos.inverter

import vm.Universe
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.EPackage
import vm.VmPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource

class VMInverter {
	
	
	
	public def Universe invertVMValues(Universe inputModel){
		
	}
	
	public def void invertVMValues(String inputModel, String resultModel){
		val vm = loadVM(inputModel)
		saveVM(invertVMValues(vm), resultModel)
	}
	
	public def Universe loadVM(String gridFile) {
		var fact = new XMIResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(VmPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(VmPackage.eNS_URI, VmPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact)
	
		var rs = new ResourceSetImpl()
		var uri = URI.createURI(gridFile)
		var res = rs.getResource(uri, true)
		return res.getContents.get(0) as Universe
	}
	def public saveVM(Universe universe, String outputFile) {
		var rs = new ResourceSetImpl()
		var uri = URI.createURI(outputFile)
		var res = rs.createResource(uri)
		    							 					
	 	// Define a Root ...
	 	res.getContents.add(universe)
	 		 	
	 	res.save(null)
	}
}