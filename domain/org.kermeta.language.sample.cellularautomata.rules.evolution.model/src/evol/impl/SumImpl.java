/**
 */
package evol.impl;

import org.eclipse.emf.ecore.EClass;

import core.util.visitor.CoreModelToTextVisitor;
import evol.EvolPackage;
import evol.Sum;
import evol.util.visitor.EvolModelToTextVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SumImpl extends NeighborsExpressionImpl implements Sum {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvolPackage.Literals.SUM;
	}


	@Override
	public String accept(CoreModelToTextVisitor visitor) {
		if(visitor instanceof EvolModelToTextVisitor)
			return ((EvolModelToTextVisitor)visitor).visitSum(this);
		else 
			return visitor.visitIntegerExpression(this);
	}
		
	
} //SumImpl
