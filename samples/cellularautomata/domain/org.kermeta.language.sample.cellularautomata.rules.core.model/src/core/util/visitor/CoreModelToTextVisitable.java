/**
 */
package core.util.visitor;


/**
 * 
 */
public interface  CoreModelToTextVisitable <T extends CoreModelToTextVisitor>{
	public  String accept(T visitor);
} 
