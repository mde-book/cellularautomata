/**
 */
package evol.impl;

import org.eclipse.emf.ecore.EClass;

import core.impl.IntegerExpressionImpl;
import core.util.visitor.CoreModelToTextVisitor;
import core.util.visitor.EvaluationVisitor;
import evol.CurrentCellPopulation;
import evol.EvolPackage;
import evol.util.visitor.CAERVisitor;
import evol.util.visitor.CAERModelToTextVisitor;

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
		if(visitor instanceof CAERModelToTextVisitor)
			return ((CAERModelToTextVisitor)visitor).visitCurrentCellPopulation(this);
		else 
			return visitor.visitIntegerExpression(this);
	}
	
	public String accept(CAERModelToTextVisitor visitor) {
		return visitor.visitCurrentCellPopulation(this);
	}

	@Override
	public int accept(final EvaluationVisitor visitor) {
		if(visitor instanceof CAERVisitor)
			return ((CAERVisitor)visitor).visitCurrentCellPopulation(this);
		else 
			return visitor.visitIntegerExpression(this);
	}

} //CurrentCellPopulationImpl
