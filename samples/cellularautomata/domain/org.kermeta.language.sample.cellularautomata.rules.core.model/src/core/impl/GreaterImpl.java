/**
 */
package core.impl;

import core.CorePackage;
import core.Greater;
import core.util.visitor.CoreModelToTextVisitor;
import core.util.visitor.EvaluationVisitor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Greater</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GreaterImpl extends BinaryExpressionImpl implements Greater {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GreaterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.GREATER;
	}

	/**
	 * 
	 */
	@Override
	public String accept(final CoreModelToTextVisitor visitor) {
		return visitor.visitGreater(this);
	}
	
	@Override
	public int accept(final EvaluationVisitor visitor) {
		return visitor.visitGreater(this);
	}
	
} //GreaterImpl
