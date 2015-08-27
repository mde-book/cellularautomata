/**
 */
package evol.impl;

import evol.EvolPackage;
import evol.Min;
import evol.util.visitor.CAERVisitor;
import evol.util.visitor.CAERModelToTextVisitor;

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
		if(visitor instanceof CAERModelToTextVisitor)
			return ((CAERModelToTextVisitor)visitor).visitMin(this);
		else 
			return visitor.visitIntegerExpression(this);
	}
	
	public String accept(CAERModelToTextVisitor visitor) {
		return visitor.visitMin(this);
	}

	@Override
	public int accept(final EvaluationVisitor visitor) {
		if(visitor instanceof CAERVisitor)
			return ((CAERVisitor)visitor).visitMin(this);
		else 
			return visitor.visitIntegerExpression(this);
	}
} //MinImpl
