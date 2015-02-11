/**
 */
package core.impl;

import core.CorePackage;
import core.Minus;
import core.util.visitor.CoreModelToTextVisitor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Minus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MinusImpl extends BinaryExpressionImpl implements Minus {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.MINUS;
	}
	/**
	 * 
	 */
	@Override
	public String accept(final CoreModelToTextVisitor visitor) {
		return visitor.visitMinus(this);
	}
} //MinusImpl
