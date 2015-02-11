/**
 */
package core.impl;

import core.CorePackage;
import core.UMinus;
import core.util.visitor.CoreModelToTextVisitor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UMinus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UMinusImpl extends UnaryExpressionImpl implements UMinus {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMinusImpl() {
		super();
	}

	
	@Override
	public String accept(final CoreModelToTextVisitor visitor) {
		return visitor.visitUMinus(this);
	}

} //UMinusImpl
