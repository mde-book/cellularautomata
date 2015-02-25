/**
 */
package core.impl;

import core.CorePackage;
import core.Or;
import core.util.visitor.CoreModelToTextVisitor;
import core.util.visitor.EvaluationVisitor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OrImpl extends BinaryExpressionImpl implements Or {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.OR;
	}
	/**
	 * 
	 */
	@Override
	public String accept(final CoreModelToTextVisitor visitor) {
		return visitor.visitOr(this);
	}
	
	@Override
	public int accept(final EvaluationVisitor visitor) {
		return visitor.visitOr(this);
	}
} //OrImpl
