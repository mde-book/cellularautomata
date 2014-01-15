

package fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.vonneuman2moore

import fr.inria.triskell.k3.Aspect
import vm.Cell
import vm.Universe
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.EPackage
import vm.VmPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource

import static extension fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.vonneuman2moore.CellAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.vonneuman2moore.UniverseAspect.*
import java.util.HashSet

@Aspect(className=typeof(Universe))
class UniverseAspect{
	public def void vonNeumann2Moore(){
		_self.cells.forEach[cell |	cell.vonNeumann2Moore]
	}
}
@Aspect(className=typeof(Cell))
class CellAspect{
	public def void vonNeumann2Moore(){
		val neighborsToAdd = new HashSet<Cell>  
		_self.neighbors.forEach[neighborCell| 
			neighborCell.neighbors.filter[possibleCommonNeighbor | 
				(_self.neighbors.contains(possibleCommonNeighbor) && possibleCommonNeighbor != _self )
				].forEach[neighborToAdd | neighborsToAdd.add(neighborToAdd) ]
		]
		_self.neighbors.addAll(neighborsToAdd) 
	}
}

class VonNeumann2Moore {		
	public def void vonneumann2moore(String inputModel, String resultModel, Integer universeLength, Integer universeWidth){
		val vm = loadVM(inputModel)
		vm.vonNeumann2Moore()
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