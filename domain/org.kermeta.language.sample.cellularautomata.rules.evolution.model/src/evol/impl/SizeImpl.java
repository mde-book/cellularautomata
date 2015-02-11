/**
 */
package evol.impl;

import org.eclipse.emf.ecore.EClass;

import core.util.visitor.CoreModelToTextVisitor;
import evol.EvolPackage;
import evol.Size;
import evol.util.visitor.EvolModelToTextVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SizeImpl extends NeighborsExpressionImpl implements Size {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvolPackage.Literals.SIZE;
	}
	/**
	 * 
	 */
	@Override
	public String accept(CoreModelToTextVisitor visitor) {
		if(visitor instanceof EvolModelToTextVisitor)
			return ((EvolModelToTextVisitor)visitor).visitSize(this);
		else 
			return visitor.visitIntegerExpression(this);
	}
	

} //SizeImpl
