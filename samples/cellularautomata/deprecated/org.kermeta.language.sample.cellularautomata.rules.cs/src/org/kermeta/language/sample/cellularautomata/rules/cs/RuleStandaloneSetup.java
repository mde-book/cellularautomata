
package org.kermeta.language.sample.cellularautomata.rules.cs;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RuleStandaloneSetup extends RuleStandaloneSetupGenerated{

	public static void doSetup() {
		new RuleStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
}

