// MDE_BOOK_START
package fr.inria.diverse.k3.example.cellularautomata.visitorbasedsimulator;
// MDE_BOOK_END
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
// MDE_BOOK_START
import evol.CellularAutomata;
import evol.EvolPackage;
import vm.Universe;
import vm.VmPackage;

public class Simulator {
	public void simulateWithAsciiArt2Dvisualizer(String ruleFile, String gridFile, String universeSize) { 
		Universe grid = loadGrid(gridFile);
		CellularAutomata automata = loadRule(ruleFile);
		Integer universeLength = Integer.parseInt(universeSize);
		
		SimpleAsciiArt2DVisualizer asciiArtVisualizer = new SimpleAsciiArt2DVisualizer();
		asciiArtVisualizer.visualizeRegular2DUniverse(universeLength, grid);
		
		SimulatorContext context = new SimulatorContext(grid);
		SimulatorVisitor simVisitor = new SimulatorVisitor(context);
		for(int i = 0; i<3; i++) {
			automata.accept(simVisitor);
			asciiArtVisualizer.visualizeRegular2DUniverse(universeLength, grid);
		}
	}
		
	public CellularAutomata loadRule(String ruleFile) {
		XMIResourceFactoryImpl fact = new XMIResourceFactoryImpl();
		if (!EPackage.Registry.INSTANCE.containsKey(EvolPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(EvolPackage.eNS_URI, EvolPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact);
	
		ResourceSet rs = new ResourceSetImpl();
		URI uri = URI.createURI(ruleFile);
		Resource res = rs.getResource(uri, true);
		return (CellularAutomata)(res.getContents().get(0));
	}
	
	public  Universe loadGrid(String gridFile) {
// MDE_BOOK_END
		 XMIResourceFactoryImpl fact = new XMIResourceFactoryImpl();
		if (!EPackage.Registry.INSTANCE.containsKey(VmPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(VmPackage.eNS_URI, VmPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact);
	
		ResourceSet rs = new ResourceSetImpl();
// MDE_BOOK_START
		URI uri = URI.createURI(gridFile);
		Resource res = rs.getResource(uri, true);
		return (Universe)(res.getContents().get(0));
	}
}
// MDE_BOOK_END