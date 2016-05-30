package fr.inria.diverse.k3.example.cellularautomata.compiler4mason

class Context {

	public StringBuilder masonFileContentSB = new StringBuilder
	
	public String packageName = ""
	//public boolean needSumOperation = false
	//public boolean needRangeFilter = false

	new (String packageName){
		this.packageName = packageName
	}

}
