package fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.hardcoded_gameoflife

import fr.inria.triskell.k3.Aspect
import vm.Cell
import vm.Universe
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.EPackage
import vm.VmPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import java.util.ArrayList

class GameOfLifeProcedural {	
	public def Universe playOneStep(Universe inputModel){
		val futureValues = new ArrayList<Integer>()
		inputModel.cells.forEach[cell |
			// count the number of neighbors around the cell,
	        // and for good measure include the cell itself
			var count = cell.^val
			for(neighborCell : cell.neighbors) { count = count +neighborCell.^val}
			// if the count is 2 or less, or 5 or higher, the cell dies
	        // else if the count is 3 exactly, a dead cell becomes live again
	        // else the cell stays as it is
	        if (count <= 2 || count >= 5){  // dead
	        	futureValues.add(0)
	        }
	        else if (count == 3){ // life
	           futureValues.add(1)
	        }	
		]
		// apply the change to all cells
		inputModel.cells.forEach[ cell,i | cell.^val = futureValues.get(i)]
		return inputModel
	}
	
	public def void playOneStep(String inputModel, String resultModel){
		val vm = loadVM(inputModel)
		saveVM(playOneStep(vm), resultModel)
	}
	public def void playNSteps(String inputModel, String resultModel, int nbSteps){
		val vm = loadVM(inputModel)
		for(int i :0..nbSteps){
			playOneStep(vm)
		}
		saveVM(vm, resultModel)
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