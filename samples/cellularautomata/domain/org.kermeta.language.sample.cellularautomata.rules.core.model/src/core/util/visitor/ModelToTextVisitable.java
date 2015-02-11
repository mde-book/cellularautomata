/**
 */
package core.util.visitor;


/**
 * 
 */
public interface ModelToTextVisitable {
	public String accept(final ModelToTextVisitor visitor);
} 
