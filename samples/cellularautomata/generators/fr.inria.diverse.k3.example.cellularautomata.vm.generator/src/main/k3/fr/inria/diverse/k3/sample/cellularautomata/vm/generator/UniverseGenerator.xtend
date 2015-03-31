package fr.inria.diverse.k3.sample.cellularautomata.vm.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

import fr.inria.diverse.k3.sample.cellularautomata.visualize.asciiart.SimpleAsciiArt2DVisualizer 

import vm.Universe
import vm.Cell
import ruleInit.CellularAutomataInitialization
import ruleInit.InitPackage
import geometry.RegularGeometry
import core.Rule

import static extension fr.inria.diverse.k3.sample.cellularautomata.vm.generator.CellAspect.*
import static extension fr.inria.diverse.k3.sample.cellularautomata.vm.generator.IntegerExpressionAspect.*
import static extension fr.inria.diverse.k3.sample.cellularautomata.vm.generator.RuleAspect.*

import org.eclipse.emf.ecore.EPackage
import fr.inria.diverse.k3.sample.cellularautomata.vm.generator.Context
import vm.impl.VmFactoryImpl
import geometry.Neighborhood

class UniverseGenerator {
	
		private Universe result 
	
		def public generateUniverse() {
			var Universe g = generateMooreRectangleBoundedUniverse(3,3)
			saveUniverse(g)
		}
		
		def public generateInitialUniverseForAutomataFile(String automataFile) {
			var fact = new XMIResourceFactoryImpl
			if (!EPackage.Registry.INSTANCE.containsKey(InitPackage.eNS_URI)) {
				EPackage.Registry.INSTANCE.put(InitPackage.eNS_URI, InitPackage.eINSTANCE);
			}
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact)
		
			var rs = new ResourceSetImpl()
			var uri = URI.createURI(automataFile)
			var res = rs.getResource(uri, true)
			var CellularAutomataInitialization ca = res.getContents.get(0) as CellularAutomataInitialization
			saveUniverse(generateInitialUniverseForAutomata(ca))
		}
		
		def public Universe generateInitialUniverseForAutomata(CellularAutomataInitialization automata) {
			var Universe result
			var RegularGeometry regularGeometry = null
			
			if (automata.geometry instanceof RegularGeometry) {
				regularGeometry = automata.geometry as RegularGeometry
			}
			
			if (regularGeometry != null) {
				
				if ((regularGeometry.neighbors == Neighborhood.NEUMANN) && (regularGeometry.dimensions.size == 2) 
						&& (!regularGeometry.dimensions.exists[ d | d.isCircular])) {
					result = generateVonNeumannRectangleBoundedUniverse(regularGeometry.dimensions.get(0).extent, regularGeometry.dimensions.get(1).extent)
				} else {
					if ((regularGeometry.neighbors == Neighborhood.MOORE) && (regularGeometry.dimensions.size == 2) 
							&& (!regularGeometry.dimensions.exists[d | d.isCircular])) {
						result = generateMooreRectangleBoundedUniverse(regularGeometry.dimensions.get(0).extent, regularGeometry.dimensions.get(1).extent)
					} else { 
						println(" Generic configuration not supported yet. Currently supported configurations : dimension=2; neighborsNumber=4|8; not circular")
					}
				}
				
				if (result != null) {
					setResult(result)
					// fill default values
					result.cells.forEach[cell |
						// select the rule that applies (there must be maximum one)
						/* var Iterable<Rule> rules = automata.seedRules.filter[r |r.isApplicableForCell(cell)]
						var Rule rule = null
						if (!rules.nullOrEmpty){
							rule = rules.get(0)
						}
						if (rule != null) {
							var Context context = new Context
							context.initialize(getResult, cell)
							cell.^val = rule.evaluatedVal.evaluate(context)
						} */
						val rules = automata.seedRules.filter[r |r.isApplicableForCell(cell)].toList
						var Rule rule = null
						if (!rules.empty){
							rule = rules.get(0)
						}
						if (rule != null) {
							var Context context = new Context
							context.initialize(getResult, cell)
							cell.^val = rule.evaluatedVal.evaluate(context)
						}
					]
						
					if (regularGeometry.dimensions.size <= 2 && (regularGeometry.dimensions.get(0).extent == regularGeometry.dimensions.get(1).extent)) {
						// visualize result using ascii art
						var SimpleAsciiArt2DVisualizer asciiArtVisualizer = new SimpleAsciiArt2DVisualizer
						asciiArtVisualizer.initialize(false)
						asciiArtVisualizer.visualizeRegular2DUniverse(regularGeometry.dimensions.get(0).extent, result)
					}
					
				}
			} else {
				println(" Generic configuration not supported yet. Only RegularGeometry can be generated automatically by this.")
			}
			return result
		}
		
		def public setResult(Universe result) {
			this.result = result
		}
		
		def public Universe getResult() {
			return this.result
		}
		
		def public Universe generateVonNeumannRectangleBoundedUniverse(Integer universeLength, Integer universeWidth) { 
			println("Generating a square Universe using von Neumann neighborhood...")
			var Universe g = new VmFactoryImpl().createUniverse
			
			var Integer cellNumber = universeLength * universeWidth
			println("Generating "+cellNumber.toString+" Cells...")
			
			for (int i : 0..cellNumber-1) {
				var Cell cell = new VmFactoryImpl().createCell
				cell.init
				cell.globalPosition = i
				cell.coordinates.add(i / universeWidth) // x
				cell.coordinates.add(i % universeWidth) // y
				g.cells.add(cell)
			}
			 
			
			println("Generating bounded VonNeumann neighborhood for "+cellNumber.toString+" Cells...")
			for (int i : 0..cellNumber-1) {
				var Cell currentCell = g.cells.get(i)
				var Integer currentLine =  i / universeWidth
				var Integer currentColumn = i % universeWidth
				
				var Integer maxCol = universeWidth - 1
				if (currentLine > 0) { // add north 
					currentCell.neighbors.add(g.cells.get(i-universeWidth))
				}
				if (currentColumn < maxCol) {// add east 
					currentCell.neighbors.add(g.cells.get(i+1))
				}
				if(currentLine < maxCol) { // add south 
					currentCell.neighbors.add(g.cells.get(i+universeWidth))
				}
				if(currentColumn > 0) { // add west 
					currentCell.neighbors.add(g.cells.get(i-1))
				}
				currentCell.^val = 0
			}
			return g
		}
		
		def public Universe generateMooreRectangleBoundedUniverse(Integer universeLength, Integer universeWidth) { 
			println("Generating a square Universe using Moore neighborhood...")
			var Universe g = new VmFactoryImpl().createUniverse
			
			var Integer cellNumber = universeLength * universeWidth
			println("Generating "+cellNumber.toString+" Cells...")
						
			for(int i : 0..cellNumber-1) {
				var Cell cell = new VmFactoryImpl().createCell
				cell.init
				cell.globalPosition = i
				// logical coordinates starts at 1
				cell.coordinates.add((i / universeWidth)+1) // x
				cell.coordinates.add((i % universeWidth)+1) // y
				g.cells.add(cell)
			}
						
			println("Generating bounded Moore neighborhood for "+cellNumber.toString+" Cells...")
			
			// internal collections starts at 0
			for(int i : 0..cellNumber-1) {
				var Cell currentCell = g.cells.get(i)
				var Integer currentLine =  i / universeWidth
				var Integer currentColumn = i % universeWidth
				
				var Integer maxCol = universeWidth - 1
				if(currentLine > 0) { // add north 
					currentCell.neighbors.add(g.cells.get(i-universeWidth))
				}
				if(currentLine > 0 && currentColumn < maxCol) { // add north/east 
					currentCell.neighbors.add(g.cells.get(i-universeWidth+1))
				}
				if(currentColumn < maxCol) { // add east 
					currentCell.neighbors.add(g.cells.get(i+1))
				}
				if(currentColumn < maxCol && currentLine < maxCol) { // add south/east 
					currentCell.neighbors.add(g.cells.get(i+1+universeWidth))
				}
				if(currentLine < maxCol) { // add south 
					currentCell.neighbors.add(g.cells.get(i+universeWidth))
				}
				if(currentLine < maxCol && currentColumn > 0) { // add south/west
					currentCell.neighbors.add(g.cells.get(i+universeWidth-1))
				}
				if(currentColumn > 0) { // add west 
					currentCell.neighbors.add(g.cells.get(i-1))
				}
				if(currentColumn > 0 && currentLine > 0) { // add north/west 
					currentCell.neighbors.add(g.cells.get(i-1-universeWidth))
				}
				currentCell.^val = 0
			}
			return g
		}
		
		def public saveUniverse(Universe universe) {
			var rs = new ResourceSetImpl()
			var uri = URI.createURI("./target/results/universe.vm.xmi")
			var res = rs.createResource(uri, System.getProperty("user.dir")+ "/org.kermeta.language.sample.cellularautomata.vm.model/metamodel/vm.ecore")
			    							 					
		 	// Define a Root ...
		 	res.getContents.add(universe)
		 		 	
		 	res.save(null)
		 	println("saved to fr.inria.diverse.k3.example.cellularautomata.vm.generator/target/results/universe.vm.xmi")
		}
}