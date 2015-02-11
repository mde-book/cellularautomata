/**
 */
package evol.util.visitor;

import core.util.visitor.CoreModelToTextVisitable;


/**
 * 
 */
public interface EvolModelToTextVisitable extends CoreModelToTextVisitable<EvolModelToTextVisitor> {
	@Override
	public  String accept(EvolModelToTextVisitor visitor);
} 
