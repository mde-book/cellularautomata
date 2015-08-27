/**
 */
package ruleInit;

import core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	 * The meta object id for the '{@link ruleInit.impl.CellularAutomataInitializationImpl <em>Cellular Automata Initialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ruleInit.impl.CellularAutomataInitializationImpl
	 * @see ruleInit.impl.InitPackageImpl#getCellularAutomataInitialization()
	 * @generated
	 */
	int CELLULAR_AUTOMATA_INITIALIZATION = 0;

	/**
	 * The feature id for the '<em><b>Seed Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR_AUTOMATA_INITIALIZATION__SEED_RULES = 0;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR_AUTOMATA_INITIALIZATION__GEOMETRY = 1;

	/**
	 * The number of structural features of the '<em>Cellular Automata Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR_AUTOMATA_INITIALIZATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ruleInit.impl.AreaFilterImpl <em>Area Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ruleInit.impl.AreaFilterImpl
	 * @see ruleInit.impl.InitPackageImpl#getAreaFilter()
	 * @generated
	 */
	int AREA_FILTER = 1;

	/**
	 * The feature id for the '<em><b>Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FILTER__AREAS = CorePackage.FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Area Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FILTER_FEATURE_COUNT = CorePackage.FILTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ruleInit.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ruleInit.impl.AreaImpl
	 * @see ruleInit.impl.InitPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 2;

	/**
	 * The feature id for the '<em><b>Dimension Ranges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__DIMENSION_RANGES = 0;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = 1;

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
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ruleInit.impl.InitPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 5;


	/**
	 * Returns the meta object for class '{@link ruleInit.CellularAutomataInitialization <em>Cellular Automata Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cellular Automata Initialization</em>'.
	 * @see ruleInit.CellularAutomataInitialization
	 * @generated
	 */
	EClass getCellularAutomataInitialization();

	/**
	 * Returns the meta object for the containment reference list '{@link ruleInit.CellularAutomataInitialization#getSeedRules <em>Seed Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seed Rules</em>'.
	 * @see ruleInit.CellularAutomataInitialization#getSeedRules()
	 * @see #getCellularAutomataInitialization()
	 * @generated
	 */
	EReference getCellularAutomataInitialization_SeedRules();

	/**
	 * Returns the meta object for the containment reference '{@link ruleInit.CellularAutomataInitialization#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see ruleInit.CellularAutomataInitialization#getGeometry()
	 * @see #getCellularAutomataInitialization()
	 * @generated
	 */
	EReference getCellularAutomataInitialization_Geometry();

	/**
	 * Returns the meta object for class '{@link ruleInit.AreaFilter <em>Area Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Filter</em>'.
	 * @see ruleInit.AreaFilter
	 * @generated
	 */
	EClass getAreaFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link ruleInit.AreaFilter#getAreas <em>Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Areas</em>'.
	 * @see ruleInit.AreaFilter#getAreas()
	 * @see #getAreaFilter()
	 * @generated
	 */
	EReference getAreaFilter_Areas();

	/**
	 * Returns the meta object for class '{@link ruleInit.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see ruleInit.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the containment reference list '{@link ruleInit.Area#getDimensionRanges <em>Dimension Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension Ranges</em>'.
	 * @see ruleInit.Area#getDimensionRanges()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_DimensionRanges();

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
	 * Returns the meta object for data type '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getInteger();

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
		 * The meta object literal for the '{@link ruleInit.impl.CellularAutomataInitializationImpl <em>Cellular Automata Initialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ruleInit.impl.CellularAutomataInitializationImpl
		 * @see ruleInit.impl.InitPackageImpl#getCellularAutomataInitialization()
		 * @generated
		 */
		EClass CELLULAR_AUTOMATA_INITIALIZATION = eINSTANCE.getCellularAutomataInitialization();

		/**
		 * The meta object literal for the '<em><b>Seed Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELLULAR_AUTOMATA_INITIALIZATION__SEED_RULES = eINSTANCE.getCellularAutomataInitialization_SeedRules();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELLULAR_AUTOMATA_INITIALIZATION__GEOMETRY = eINSTANCE.getCellularAutomataInitialization_Geometry();

		/**
		 * The meta object literal for the '{@link ruleInit.impl.AreaFilterImpl <em>Area Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ruleInit.impl.AreaFilterImpl
		 * @see ruleInit.impl.InitPackageImpl#getAreaFilter()
		 * @generated
		 */
		EClass AREA_FILTER = eINSTANCE.getAreaFilter();

		/**
		 * The meta object literal for the '<em><b>Areas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA_FILTER__AREAS = eINSTANCE.getAreaFilter_Areas();

		/**
		 * The meta object literal for the '{@link ruleInit.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ruleInit.impl.AreaImpl
		 * @see ruleInit.impl.InitPackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Dimension Ranges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__DIMENSION_RANGES = eINSTANCE.getArea_DimensionRanges();

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

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ruleInit.impl.InitPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

	}

} //InitPackage
