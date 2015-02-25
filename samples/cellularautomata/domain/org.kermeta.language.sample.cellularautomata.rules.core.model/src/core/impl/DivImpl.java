/**
 */
package core.impl;

import core.CorePackage;
import core.Div;
import core.util.visitor.CoreModelToTextVisitor;
import core.util.visitor.EvaluationVisitor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Div</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DivImpl extends BinaryExpressionImpl implements Div {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DIV;
	}

	/**
	 * 
	 */
	@Override
	public String accept(final CoreModelToTextVisitor visitor) {
		return visitor.visitDiv(this);
	}
	
	@Override
	public int accept(final EvaluationVisitor visitor) {
		return visitor.visitDiv(this);
	}
} //DivImpl
