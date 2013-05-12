/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.Rule#getNextVal <em>Next Val</em>}</li>
 *   <li>{@link rule.Rule#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.RulePackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Next Val</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Val</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Val</em>' containment reference.
	 * @see #setNextVal(IntegerExpression)
	 * @see rule.RulePackage#getRule_NextVal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntegerExpression getNextVal();

	/**
	 * Sets the value of the '{@link rule.Rule#getNextVal <em>Next Val</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Val</em>' containment reference.
	 * @see #getNextVal()
	 * @generated
	 */
	void setNextVal(IntegerExpression value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(PopulationRange)
	 * @see rule.RulePackage#getRule_Filter()
	 * @model containment="true"
	 * @generated
	 */
	PopulationRange getFilter();

	/**
	 * Sets the value of the '{@link rule.Rule#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(PopulationRange value);

} // Rule
