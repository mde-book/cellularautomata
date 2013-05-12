/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neighbors Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.NeighborsExpression#getNeighborsFilter <em>Neighbors Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.RulePackage#getNeighborsExpression()
 * @model
 * @generated
 */
public interface NeighborsExpression extends IntegerExpression {
	/**
	 * Returns the value of the '<em><b>Neighbors Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neighbors Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighbors Filter</em>' containment reference.
	 * @see #setNeighborsFilter(PopulationRange)
	 * @see rule.RulePackage#getNeighborsExpression_NeighborsFilter()
	 * @model containment="true"
	 * @generated
	 */
	PopulationRange getNeighborsFilter();

	/**
	 * Sets the value of the '{@link rule.NeighborsExpression#getNeighborsFilter <em>Neighbors Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neighbors Filter</em>' containment reference.
	 * @see #getNeighborsFilter()
	 * @generated
	 */
	void setNeighborsFilter(PopulationRange value);

} // NeighborsExpression
