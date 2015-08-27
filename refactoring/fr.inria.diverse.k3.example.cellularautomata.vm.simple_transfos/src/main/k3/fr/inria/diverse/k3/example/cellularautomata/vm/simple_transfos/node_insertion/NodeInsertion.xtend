

package fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.node_insertion

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import vm.Cell
import vm.Universe
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.EPackage
import vm.VmPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import java.util.HashSet


import static extension fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.node_insertion.CellAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.node_insertion.UniverseAspect.*
//MDE_BOOK_START
@Aspect(className=Universe)
class UniverseAspect{
	public def void insertNeighbors(){
		_self.cells.forall[cell | cell.insertNeighbors()]
	}
}
@Aspect(className=Cell)
class CellAspect{
	public def boolean insertNeighbors(){
		val hasInsertedNeighbor = _self.neighborsWithHighValDifference().size > 0
		_self.neighborsWithHighValDifference().forEach[ neighborCell | 
			_self.neighbors.remove(neighborCell)
			neighborCell.neighbors.remove(_self)
			val intermediateCell = VmPackage.eINSTANCE.vmFactory.createCell
			intermediateCell.^val = _self.intermediateVal(neighborCell)
			_self.neighbors.add(intermediateCell)
			neighborCell.neighbors.add(intermediateCell)
			intermediateCell.neighbors.addAll(newArrayList(_self,neighborCell))
		]
		return hasInsertedNeighbor
	}
	public def HashSet<Cell> neighborsWithHighValDifference(){
		val commonNeighbors = new HashSet<Cell>
		commonNeighbors.addAll(_self.neighbors.filter[otherCell | 
			Math.abs(_self.^val - otherCell.^val) > 10
		])
		return commonNeighbors
	}
	
	public def int intermediateVal(Cell otherCell){
		val min = Math.min(_self.^val, otherCell.^val)
		val max = Math.max(_self.^val, otherCell.^val)
		return min+((max-min)/2)
	}
}
//MDE_BOOK_END

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