/**
 */
package evol.impl;

import evol.EvolPackage;
import evol.Min;
import evol.util.visitor.EvolEvaluationVisitor;
import evol.util.visitor.EvolModelToTextVisitor;

import org.eclipse.emf.ecore.EClass;

import core.util.visitor.CoreModelToTextVisitor;
import core.util.visitor.EvaluationVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Min</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MinImpl extends NeighborsExpressionImpl implements Min {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvolPackage.Literals.MIN;
	}
	/**
	 * 
	 */
	@Override
	public String accept(CoreModelToTextVisitor visitor) {
		if(visitor instanceof EvolModelToTextVisitor)
			return ((EvolModelToTextVisitor)visitor).visitMin(this);
		else 
			return visitor.visitIntegerExpression(this);
	}
	
	public String accept(EvolModelToTextVisitor visitor) {
		return visitor.visitMin(this);
	}

	@Override
	public int accept(final EvaluationVisitor visitor) {
		if(visitor instanceof EvolEvaluationVisitor)
			return ((EvolEvaluationVisitor)visitor).visitMin(this);
		else 
			return visitor.visitIntegerExpression(this);
	}
} //MinImpl
