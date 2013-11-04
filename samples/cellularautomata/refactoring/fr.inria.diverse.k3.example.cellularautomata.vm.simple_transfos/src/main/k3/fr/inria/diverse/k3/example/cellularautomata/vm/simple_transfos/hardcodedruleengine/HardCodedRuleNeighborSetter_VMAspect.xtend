package fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.hardcodedruleengine

import fr.inria.triskell.k3.Aspect
import vm.Cell
import vm.Universe

import static extension fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.hardcodedruleengine.CellAspect.*

@Aspect(className=typeof(Universe))
class UniverseAspect{
	public def void applySetterTransfo(Integer appliedVal){
		_self.cells.filter[cell | cell.hasNeighborSetTo(appliedVal)]
				   .forEach[cell | cell.applySet(appliedVal)]
	}
}

@Aspect(className=typeof(Cell))
class CellAspect{
	public def boolean hasNeighborSetTo(Integer searchedVal){
		return _self.neighbors.exists[ neighborCell | neighborCell.^val == searchedVal]
	}
	public def void applySet(Integer newVal){
		_self.^val = newVal
	}
}