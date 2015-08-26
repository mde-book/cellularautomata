

package fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.node_insertion

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import vm.Cell
import vm.Universe
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.EPackage
import vm.VmPackage
import vm.impl.VmFactoryImpl
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource

import static extension fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.node_insertion.CellAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.node_insertion.UniverseAspect.*
import java.util.HashSet

@Aspect(className=Universe)
class UniverseAspect{
	public def void insertNeighbors(){
		_self.cells.forall[cell | cell.insertNeighbors()]
	}
}
@Aspect(className=Cell)
class CellAspect{
	
	public def boolean insertNeighbors(){
		val hasInsertedNeighbor = _self.neighborsWithHighValueDifference().size > 0
		_self.neighborsWithHighValueDifference().forEach[ neighborCell | 
			_self.neighbors.remove(neighborCell)
			neighborCell.neighbors.remove(_self)
			val intermediateCell = VmPackage.eINSTANCE.vmFactory.createCell
			_self.neighbors.add(intermediateCell)
			neighborCell.neighbors.add(intermediateCell)
			intermediateCell.neighbors.addAll(newArrayList(_self,neighborCell))
		]
		return hasInsertedNeighbor
	}
	public def HashSet<Cell> neighborsWithHighValueDifference(){
		val commonNeighbors = new HashSet<Cell>
		commonNeighbors.addAll(_self.neighbors.filter[otherCell | _self.valueDifference(otherCell) > 10])
		return commonNeighbors
	}
	
	public def int valueDifference(Cell otherCell){
		min max
		return 0 // TODO
	}
	public def int intermediateValue(Cell otherCell){
		return 0 // TODO
	}
}

class NodeInsertion {		
	public def void insertNode(String inputModel, String resultModel, Integer universeLength, Integer universeWidth){
		val vm = loadVM(inputModel)
		vm.insertNeighbors()
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