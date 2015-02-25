/**
 */
package core.impl;

import core.CorePackage;
import core.Mult;
import core.util.visitor.CoreModelToTextVisitor;
import core.util.visitor.EvaluationVisitor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mult</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MultImpl extends BinaryExpressionImpl implements Mult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.MULT;
	}

	/**
	 * 
	 */
	@Override
	public String accept(final CoreModelToTextVisitor visitor) {
		return visitor.visitMult(this);
	}
	
	@Override
	public int accept(final EvaluationVisitor visitor) {
		return visitor.visitMult(this);
	}
} //MultImpl
