/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

import core.util.visitor.CoreModelToTextVisitable;
import core.util.visitor.CoreModelToTextVisitor;
import core.util.visitor.EvaluationVisitable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see core.CorePackage#getIntegerExpression()
 * @model abstract="true"
 * @generated
 */
public interface IntegerExpression  extends EObject, CoreModelToTextVisitable, EvaluationVisitable{

	/**
	 * Visitor used by pure java visitor sample
	 */
	//String accept(CoreModelToTextVisitor visitor);
} // IntegerExpression
