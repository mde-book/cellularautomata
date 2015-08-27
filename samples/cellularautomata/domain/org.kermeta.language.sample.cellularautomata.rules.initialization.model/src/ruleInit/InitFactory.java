/**
 */
package ruleInit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ruleInit.InitPackage
 * @generated
 */
public interface InitFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InitFactory eINSTANCE = ruleInit.impl.InitFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cellular Automata Initialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cellular Automata Initialization</em>'.
	 * @generated
	 */
	CellularAutomataInitialization createCellularAutomataInitialization();

	/**
	 * Returns a new object of class '<em>Area Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area Filter</em>'.
	 * @generated
	 */
	AreaFilter createAreaFilter();

	/**
	 * Returns a new object of class '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area</em>'.
	 * @generated
	 */
	Area createArea();

	/**
	 * Returns a new object of class '<em>Dimension Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension Range</em>'.
	 * @generated
	 */
	DimensionRange createDimensionRange();

	/**
	 * Returns a new object of class '<em>Position Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Literal</em>'.
	 * @generated
	 */
	PositionLiteral createPositionLiteral();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InitPackage getInitPackage();

} //InitFactory
