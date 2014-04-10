/**
 */
package ruleInit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinate Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ruleInit.CoordinateRange#getDimensionRanges <em>Dimension Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @see ruleInit.InitPackage#getCoordinateRange()
 * @model
 * @generated
 */
public interface CoordinateRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Dimension Ranges</b></em>' containment reference list.
	 * The list contents are of type {@link ruleInit.DimensionRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension Ranges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Ranges</em>' containment reference list.
	 * @see ruleInit.InitPackage#getCoordinateRange_DimensionRanges()
	 * @model containment="true"
	 * @generated
	 */
	EList<DimensionRange> getDimensionRanges();

} // CoordinateRange
