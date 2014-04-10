package fr.inria.diverse.k3.sample.cellularautomata.simulator

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import vm.Cell

class SimulatorVMAspect {
}

@Aspect(className=typeof(Cell))
class CellAspect{
	public Integer futureValue
}