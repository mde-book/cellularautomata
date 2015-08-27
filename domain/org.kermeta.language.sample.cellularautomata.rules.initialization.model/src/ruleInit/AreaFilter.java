/**
 */
package ruleInit;

import core.Filter;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ruleInit.AreaFilter#getAreas <em>Areas</em>}</li>
 * </ul>
 * </p>
 *
 * @see ruleInit.InitPackage#getAreaFilter()
 * @model
 * @generated
 */
public interface AreaFilter extends Filter {
	/**
	 * Returns the value of the '<em><b>Areas</b></em>' containment reference list.
	 * The list contents are of type {@link ruleInit.Area}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Areas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Areas</em>' containment reference list.
	 * @see ruleInit.InitPackage#getAreaFilter_Areas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Area> getAreas();

} // AreaFilter
