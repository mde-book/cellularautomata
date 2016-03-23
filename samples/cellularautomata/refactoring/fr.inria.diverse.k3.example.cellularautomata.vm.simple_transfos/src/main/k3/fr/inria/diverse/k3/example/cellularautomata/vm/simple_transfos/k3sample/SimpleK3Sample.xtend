

package fr.inria.diverse.k3.example.cellularautomata.vm.simple_transfos.k3sample

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
	public Integer populationCount
		
	public def void countPopulation(){
		_self.populationCount =  0
		_self.cells.forEach[cell | 
			_self.populationCount = _self.populationCount + cell.^val
		]
	}
}
//MDE_BOOK_END
