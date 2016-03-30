package cellularautomata.acceleo.generateLatex;

import vm.Universe;

public class Utility {
	public String getBaseFilename(Universe u){
		return u.eResource().getURI().lastSegment();
	}
}
