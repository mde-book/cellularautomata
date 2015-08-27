/**
 */
package ruleInit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ruleInit.DimensionRange#getLower <em>Lower</em>}</li>
 *   <li>{@link ruleInit.DimensionRange#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @see ruleInit.InitPackage#getDimensionRange()
 * @model
 * @generated
 */
public interface DimensionRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(int)
	 * @see ruleInit.InitPackage#getDimensionRange_Lower()
	 * @model dataType="ruleInit.Integer"
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link ruleInit.DimensionRange#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(int value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(int)
	 * @see ruleInit.InitPackage#getDimensionRange_Upper()
	 * @model dataType="ruleInit.Integer"
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link ruleInit.DimensionRange#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

} // DimensionRange
