package fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.inverter

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import vm.Cell
import vm.Universe

import static extension fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.inverter.CellAspect.*

@Aspect(className=Universe)
class UniverseAspect{
	public def void invert(){
		_self.cells.forEach[cell | cell.invert()]
	}
}

@Aspect(className=Cell)
class CellAspect{
	public def void invert(){
		if(_self.^val == 0) _self.^val = 1
		else _self.^val = 0
	}
}