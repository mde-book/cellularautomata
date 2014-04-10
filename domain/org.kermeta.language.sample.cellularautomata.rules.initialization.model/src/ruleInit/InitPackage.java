/**
 */
package ruleInit;

import core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ruleInit.InitFactory
 * @model kind="package"
 * @generated
 */
public interface InitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ruleInit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rules/init/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ruleInit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InitPackage eINSTANCE = ruleInit.impl.InitPackageImpl.init();

	/**
	 * The meta object id for the '{@link ruleInit.impl.CellularAutomatatInitializationImpl <em>Cellular Automatat Initialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ruleInit.impl.CellularAutomatatInitializationImpl
	 * @see ruleInit.impl.InitPackageImpl#getCellularAutomatatInitialization()
	 * @generated
	 */
	int CELLULAR_AUTOMATAT_INITIALIZATION = 0;

	/**
	 * The feature id for the '<em><b>Seed Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR_AUTOMATAT_INITIALIZATION__SEED_RULES = 0;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR_AUTOMATAT_INITIALIZATION__GEOMETRY = 1;

	/**
	 * The number of structural features of the '<em>Cellular Automatat Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR_AUTOMATAT_INITIALIZATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ruleInit.impl.CoordinateRangesImpl <em>Coordinate Ranges</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ruleInit.impl.CoordinateRangesImpl
	 * @see ruleInit.impl.InitPackageImpl#getCoordinateRanges()
	 * @generated
	 */
	int COORDINATE_RANGES = 1;

	/**
	 * The feature id for the '<em><b>Coordinate Ranges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_RANGES__COORDINATE_RANGES = CorePackage.FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coordinate Ranges</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_RANGES_FEATURE_COUNT = CorePackage.FILTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ruleInit.impl.CoordinateRangeImpl <em>Coordinate Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ruleInit.impl.CoordinateRangeImpl
	 * @see ruleInit.impl.InitPackageImpl#getCoordinateRange()
	 * @generated
	 */
	int COORDINATE_RANGE = 2;

	/**
	 * The feature id for the '<em><b>Dimension Ranges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_RANGE__DIMENSION_RANGES = 0;

	/**
	 * The number of structural features of the '<em>Coordinate Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_RANGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ruleInit.impl.DimensionRangeImpl <em>Dimension Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ruleInit.impl.DimensionRangeImpl
	 * @see ruleInit.impl.InitPackageImpl#getDimensionRange()
	 * @generated
	 */
	int DIMENSION_RANGE = 3;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_RANGE__LOWER = 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_RANGE__UPPER = 1;

	/**
	 * The number of structural features of the '<em>Dimension Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_RANGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ruleInit.impl.PositionLiteralImpl <em>Position Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ruleInit.impl.PositionLiteralImpl
	 * @see ruleInit.impl.InitPackageImpl#getPositionLiteral()
	 * @generated
	 */
	int POSITION_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Dimension Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_LITERAL__DIMENSION_INDEX = CorePackage.INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Position Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_LITERAL_FEATURE_COUNT = CorePackage.INTEGER_EXPRESSION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link ruleInit.CellularAutomatatInitialization <em>Cellular Automatat Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cellular Automatat Initialization</em>'.
	 * @see ruleInit.CellularAutomatatInitialization
	 * @generated
	 */
	EClass getCellularAutomatatInitialization();

	/**
	 * Returns the meta object for the containment reference list '{@link ruleInit.CellularAutomatatInitialization#getSeedRules <em>Seed Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seed Rules</em>'.
	 * @see ruleInit.CellularAutomatatInitialization#getSeedRules()
	 * @see #getCellularAutomatatInitialization()
	 * @generated
	 */
	EReference getCellularAutomatatInitialization_SeedRules();

	/**
	 * Returns the meta object for the containment reference '{@link ruleInit.CellularAutomatatInitialization#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see ruleInit.CellularAutomatatInitialization#getGeometry()
	 * @see #getCellularAutomatatInitialization()
	 * @generated
	 */
	EReference getCellularAutomatatInitialization_Geometry();

	/**
	 * Returns the meta object for class '{@link ruleInit.CoordinateRanges <em>Coordinate Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate Ranges</em>'.
	 * @see ruleInit.CoordinateRanges
	 * @generated
	 */
	EClass getCoordinateRanges();

	/**
	 * Returns the meta object for the containment reference list '{@link ruleInit.CoordinateRanges#getCoordinateRanges <em>Coordinate Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordinate Ranges</em>'.
	 * @see ruleInit.CoordinateRanges#getCoordinateRanges()
	 * @see #getCoordinateRanges()
	 * @generated
	 */
	EReference getCoordinateRanges_CoordinateRanges();

	/**
	 * Returns the meta object for class '{@link ruleInit.CoordinateRange <em>Coordinate Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate Range</em>'.
	 * @see ruleInit.CoordinateRange
	 * @generated
	 */
	EClass getCoordinateRange();

	/**
	 * Returns the meta object for the containment reference list '{@link ruleInit.CoordinateRange#getDimensionRanges <em>Dimension Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension Ranges</em>'.
	 * @see ruleInit.CoordinateRange#getDimensionRanges()
	 * @see #getCoordinateRange()
	 * @generated
	 */
	EReference getCoordinateRange_DimensionRanges();

	/**
	 * Returns the meta object for class '{@link ruleInit.DimensionRange <em>Dimension Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Range</em>'.
	 * @see ruleInit.DimensionRange
	 * @generated
	 */
	EClass getDimensionRange();

	/**
	 * Returns the meta object for the attribute '{@link ruleInit.DimensionRange#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see ruleInit.DimensionRange#getLower()
	 * @see #getDimensionRange()
	 * @generated
	 */
	EAttribute getDimensionRange_Lower();

	/**
	 * Returns the meta object for the attribute '{@link ruleInit.DimensionRange#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see ruleInit.DimensionRange#getUpper()
	 * @see #getDimensionRange()
	 * @generated
	 */
	EAttribute getDimensionRange_Upper();

	/**
	 * Returns the meta object for class '{@link ruleInit.PositionLiteral <em>Position Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Literal</em>'.
	 * @see ruleInit.PositionLiteral
	 * @generated
	 */
	EClass getPositionLiteral();

	/**
	 * Returns the meta object for the attribute '{@link ruleInit.PositionLiteral#getDimensionIndex <em>Dimension Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension Index</em>'.
	 * @see ruleInit.PositionLiteral#getDimensionIndex()
	 * @see #getPositionLiteral()
	 * @generated
	 */
	EAttribute getPositionLiteral_DimensionIndex();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InitFactory getInitFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ruleInit.impl.CellularAutomatatInitializationImpl <em>Cellular Automatat Initialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ruleInit.impl.CellularAutomatatInitializationImpl
		 * @see ruleInit.impl.InitPackageImpl#getCellularAutomatatInitialization()
		 * @generated
		 */
		EClass CELLULAR_AUTOMATAT_INITIALIZATION = eINSTANCE.getCellularAutomatatInitialization();

		/**
		 * The meta object literal for the '<em><b>Seed Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELLULAR_AUTOMATAT_INITIALIZATION__SEED_RULES = eINSTANCE.getCellularAutomatatInitialization_SeedRules();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELLULAR_AUTOMATAT_INITIALIZATION__GEOMETRY = eINSTANCE.getCellularAutomatatInitialization_Geometry();

		/**
		 * The meta object literal for the '{@link ruleInit.impl.CoordinateRangesImpl <em>Coordinate Ranges</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ruleInit.impl.CoordinateRangesImpl
		 * @see ruleInit.impl.InitPackageImpl#getCoordinateRanges()
		 * @generated
		 */
		EClass COORDINATE_RANGES = eINSTANCE.getCoordinateRanges();

		/**
		 * The meta object literal for the '<em><b>Coordinate Ranges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATE_RANGES__COORDINATE_RANGES = eINSTANCE.getCoordinateRanges_CoordinateRanges();

		/**
		 * The meta object literal for the '{@link ruleInit.impl.CoordinateRangeImpl <em>Coordinate Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ruleInit.impl.CoordinateRangeImpl
		 * @see ruleInit.impl.InitPackageImpl#getCoordinateRange()
		 * @generated
		 */
		EClass COORDINATE_RANGE = eINSTANCE.getCoordinateRange();

		/**
		 * The meta object literal for the '<em><b>Dimension Ranges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATE_RANGE__DIMENSION_RANGES = eINSTANCE.getCoordinateRange_DimensionRanges();

		/**
		 * The meta object literal for the '{@link ruleInit.impl.DimensionRangeImpl <em>Dimension Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ruleInit.impl.DimensionRangeImpl
		 * @see ruleInit.impl.InitPackageImpl#getDimensionRange()
		 * @generated
		 */
		EClass DIMENSION_RANGE = eINSTANCE.getDimensionRange();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_RANGE__LOWER = eINSTANCE.getDimensionRange_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_RANGE__UPPER = eINSTANCE.getDimensionRange_Upper();

		/**
		 * The meta object literal for the '{@link ruleInit.impl.PositionLiteralImpl <em>Position Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ruleInit.impl.PositionLiteralImpl
		 * @see ruleInit.impl.InitPackageImpl#getPositionLiteral()
		 * @generated
		 */
		EClass POSITION_LITERAL = eINSTANCE.getPositionLiteral();

		/**
		 * The meta object literal for the '<em><b>Dimension Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_LITERAL__DIMENSION_INDEX = eINSTANCE.getPositionLiteral_DimensionIndex();

	}

} //InitPackage
