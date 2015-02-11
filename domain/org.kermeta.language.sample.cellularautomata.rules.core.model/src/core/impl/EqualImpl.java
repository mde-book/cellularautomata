/**
 */
package core.impl;

import core.CorePackage;
import core.Equal;
import core.util.visitor.CoreModelToTextVisitor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EqualImpl extends BinaryExpressionImpl implements Equal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.EQUAL;
	}

	/**
	 * 
	 */
	@Override
	public String accept(final CoreModelToTextVisitor visitor) {
		return visitor.visitEqual(this);
	}
} //EqualImpl
