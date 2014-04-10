/**
 */
package ruleInit;

import core.Filter;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinate Ranges</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ruleInit.CoordinateRanges#getCoordinateRanges <em>Coordinate Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @see ruleInit.InitPackage#getCoordinateRanges()
 * @model
 * @generated
 */
public interface CoordinateRanges extends Filter {
	/**
	 * Returns the value of the '<em><b>Coordinate Ranges</b></em>' containment reference list.
	 * The list contents are of type {@link ruleInit.CoordinateRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate Ranges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate Ranges</em>' containment reference list.
	 * @see ruleInit.InitPackage#getCoordinateRanges_CoordinateRanges()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoordinateRange> getCoordinateRanges();

} // CoordinateRanges
