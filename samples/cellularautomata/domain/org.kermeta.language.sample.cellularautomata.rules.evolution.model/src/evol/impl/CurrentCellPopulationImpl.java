/**
 */
package evol.impl;

import org.eclipse.emf.ecore.EClass;

import core.impl.IntegerExpressionImpl;
import core.util.visitor.CoreModelToTextVisitor;
import core.util.visitor.EvaluationVisitor;
import evol.CurrentCellPopulation;
import evol.EvolPackage;
import evol.util.visitor.EvolEvaluationVisitor;
import evol.util.visitor.EvolModelToTextVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Cell Population</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CurrentCellPopulationImpl extends IntegerExpressionImpl implements CurrentCellPopulation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentCellPopulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvolPackage.Literals.CURRENT_CELL_POPULATION;
	}

	@Override
	public String accept(CoreModelToTextVisitor visitor) {
		if(visitor instanceof EvolModelToTextVisitor)
			return ((EvolModelToTextVisitor)visitor).visitCurrentCellPopulation(this);
		else 
			return visitor.visitIntegerExpression(this);
	}
	
	public String accept(EvolModelToTextVisitor visitor) {
		return visitor.visitCurrentCellPopulation(this);
	}

	@Override
	public int accept(final EvaluationVisitor visitor) {
		if(visitor instanceof EvolEvaluationVisitor)
			return ((EvolEvaluationVisitor)visitor).visitCurrentCellPopulation(this);
		else 
			return visitor.visitIntegerExpression(this);
	}

} //CurrentCellPopulationImpl
