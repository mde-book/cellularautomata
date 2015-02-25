/**
 */
package evol.impl;

import evol.EvolPackage;
import evol.Max;
import evol.util.visitor.EvolEvaluationVisitor;
import evol.util.visitor.EvolModelToTextVisitor;

import org.eclipse.emf.ecore.EClass;

import core.util.visitor.CoreModelToTextVisitor;
import core.util.visitor.EvaluationVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MaxImpl extends NeighborsExpressionImpl implements Max {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvolPackage.Literals.MAX;
	}

	/**
	 * 
	 */
	@Override
	public String accept(CoreModelToTextVisitor visitor) {
		if(visitor instanceof EvolModelToTextVisitor)
			return ((EvolModelToTextVisitor)visitor).visitMax(this);
		else 
			return visitor.visitIntegerExpression(this);
	}
	
	public String accept(EvolModelToTextVisitor visitor) {
		return visitor.visitMax(this);
	}

	
	@Override
	public int accept(final EvaluationVisitor visitor) {
		if(visitor instanceof EvolEvaluationVisitor)
			return ((EvolEvaluationVisitor)visitor).visitMax(this);
		else 
			return visitor.visitIntegerExpression(this);
	}
	
} //MaxImpl
