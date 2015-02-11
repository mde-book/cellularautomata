/**
 */
package core.impl;

import org.eclipse.emf.ecore.EClass;

import core.Add;
import core.CorePackage;
import core.util.visitor.CoreModelToTextVisitor;
import core.util.visitor.ModelToTextVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AddImpl extends BinaryExpressionImpl implements Add {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ADD;
	}
	
	
	@Override
	public String accept(final CoreModelToTextVisitor visitor) {
		return visitor.visitAdd(this);
	}
} //AddImpl
