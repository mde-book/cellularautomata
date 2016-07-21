/*
 * 
 * count the number of neighbors around the cell, and for good measure include the cell itself
 * if the count is 2 or less, or 5 or higher, the cell dies
 * else if the count is 3 exactly, a dead cell becomes live again
 * else the cell stays as it is
 */

package fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.hardcoded_gameoflife_one_step

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import vm.Cell
import vm.Universe
import vm.VmPackage

import static extension fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.hardcoded_gameoflife_one_step.CellAspect.*
import static extension fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.hardcoded_gameoflife_one_step.UniverseAspect.*

// MDE_BOOK_START
@Aspect(className=Cell)
class CellAspect{
	public Cell cellCopy	
	public def void copyCell(){
		_self.cellCopy = VmPackage.eINSTANCE.vmFactory.createCell
		val liveNgbCount = _self.neighbors.filter[n | n.^val == 1].size
		if(_self.^val == 0){
			if(liveNgbCount == 3) 
				_self.cellCopy.^val = 1
			else _self.cellCopy.^val = 0
		} else {
			if(liveNgbCount == 2 || liveNgbCount == 3)
				_self.cellCopy.^val = 1
			else _self.cellCopy.^val = 0
		}
	}	
	public def void linkNeigbours(){
		_self.neighbors.forEach[n | _self.cellCopy.neighbors.addAll(n.cellCopy)]
	} 
}
@Aspect(className=Universe)
class UniverseAspect{	
	public Universe universeCopy
	public def Universe copyUniverse(){
		_self.cells.forEach[cell | cell.copyCell]
		_self.cells.forEach[cell | cell.linkNeigbours]
		_self.universeCopy =  VmPackage.eINSTANCE.vmFactory.createUniverse
		_self.universeCopy.cells.addAll(_self.cells.map[c | c.cellCopy])
		return _self.universeCopy
	}
}
// MDE_BOOK_END

class Main{
	def static void main(String[] args) {
		
	}
	
}