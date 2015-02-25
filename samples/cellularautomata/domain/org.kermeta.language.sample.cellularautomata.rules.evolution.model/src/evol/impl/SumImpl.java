/**
 */
package evol.impl;

import org.eclipse.emf.ecore.EClass;

import core.util.visitor.CoreModelToTextVisitor;
import core.util.visitor.EvaluationVisitor;
import evol.EvolPackage;
import evol.Sum;
import evol.util.visitor.EvolEvaluationVisitor;
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
		
	@Override
	public int accept(final EvaluationVisitor visitor) {
		if(visitor instanceof EvolEvaluationVisitor)
			return ((EvolEvaluationVisitor)visitor).visitSum(this);
		else 
			return visitor.visitIntegerExpression(this);
	}
} //SumImpl
