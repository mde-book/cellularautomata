/*
 * 
 * count the number of neighbors around the cell, and for good measure include the cell itself
 * if the count is 2 or less, or 5 or higher, the cell dies
 * else if the count is 3 exactly, a dead cell becomes live again
 * else the cell stays as it is
 */

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

import static extension fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.hardcoded_gameoflife.CellAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.hardcoded_gameoflife.UniverseAspect.*

 @Aspect(className=typeof(Universe))
class UniverseAspect{
	public def void playOneStep(){
		_self.cells.forEach[cell |	cell.computeGameOfLifeFutureValue]
		_self.cells.forEach[ cell | cell.^val = cell.futureValue]
	}
}

@Aspect(className=typeof(Cell))
class CellAspect{
	public Integer futureValue
	
	public def void computeGameOfLifeFutureValue(){
		var count = _self.^val
		for(neighborCell : _self.neighbors) { count = count +neighborCell.^val}
        if (count <= 2 || count >= 5){  // dead
            _self.futureValue = 0
        }
        else if (count == 3){ // life
            _self.futureValue = 1
        }
        else _self.futureValue = _self.^val
	}
}

class GameOfLife {		
	public def void playOneStep(String inputModel, String resultModel){
		val vm = loadVM(inputModel)
		vm.playOneStep
		saveVM(vm, resultModel)
	}
	public def void playNSteps(String inputModel, String resultModel, int nbSteps){
		val vm = loadVM(inputModel)
		for(int i :0..nbSteps){	vm.playOneStep }
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