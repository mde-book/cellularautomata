/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.IntegerLiteral#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.RulePackage#getIntegerLiteral()
 * @model
 * @generated
 */
public interface IntegerLiteral extends IntegerExpression {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see #setVal(int)
	 * @see rule.RulePackage#getIntegerLiteral_Val()
	 * @model required="true"
	 * @generated
	 */
	int getVal();

	/**
	 * Sets the value of the '{@link rule.IntegerLiteral#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(int value);

} // IntegerLiteral
