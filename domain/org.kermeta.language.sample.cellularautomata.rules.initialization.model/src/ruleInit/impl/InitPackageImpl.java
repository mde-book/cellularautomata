/**
 */
package ruleInit.impl;

import core.CorePackage;

import geometry.GeometryPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ruleInit.Area;
import ruleInit.AreaFilter;
import ruleInit.CellularAutomataInitialization;
import ruleInit.DimensionRange;
import ruleInit.InitFactory;
import ruleInit.InitPackage;
import ruleInit.PositionLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InitPackageImpl extends EPackageImpl implements InitPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellularAutomataInitializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ruleInit.InitPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InitPackageImpl() {
		super(eNS_URI, InitFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link InitPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InitPackage init() {
		if (isInited) return (InitPackage)EPackage.Registry.INSTANCE.getEPackage(InitPackage.eNS_URI);

		// Obtain or create and register package
		InitPackageImpl theInitPackage = (InitPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InitPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InitPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GeometryPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInitPackage.createPackageContents();

		// Initialize created meta-data
		theInitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInitPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InitPackage.eNS_URI, theInitPackage);
		return theInitPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCellularAutomataInitialization() {
		return cellularAutomataInitializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCellularAutomataInitialization_SeedRules() {
		return (EReference)cellularAutomataInitializationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCellularAutomataInitialization_Geometry() {
		return (EReference)cellularAutomataInitializationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAreaFilter() {
		return areaFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAreaFilter_Areas() {
		return (EReference)areaFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArea() {
		return areaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArea_DimensionRanges() {
		return (EReference)areaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionRange() {
		return dimensionRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionRange_Lower() {
		return (EAttribute)dimensionRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionRange_Upper() {
		return (EAttribute)dimensionRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionLiteral() {
		return positionLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionLiteral_DimensionIndex() {
		return (EAttribute)positionLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitFactory getInitFactory() {
		return (InitFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cellularAutomataInitializationEClass = createEClass(CELLULAR_AUTOMATA_INITIALIZATION);
		createEReference(cellularAutomataInitializationEClass, CELLULAR_AUTOMATA_INITIALIZATION__SEED_RULES);
		createEReference(cellularAutomataInitializationEClass, CELLULAR_AUTOMATA_INITIALIZATION__GEOMETRY);

		areaFilterEClass = createEClass(AREA_FILTER);
		createEReference(areaFilterEClass, AREA_FILTER__AREAS);

		areaEClass = createEClass(AREA);
		createEReference(areaEClass, AREA__DIMENSION_RANGES);

		dimensionRangeEClass = createEClass(DIMENSION_RANGE);
		createEAttribute(dimensionRangeEClass, DIMENSION_RANGE__LOWER);
		createEAttribute(dimensionRangeEClass, DIMENSION_RANGE__UPPER);

		positionLiteralEClass = createEClass(POSITION_LITERAL);
		createEAttribute(positionLiteralEClass, POSITION_LITERAL__DIMENSION_INDEX);

		// Create data types
		integerEDataType = createEDataType(INTEGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		GeometryPackage theGeometryPackage = (GeometryPackage)EPackage.Registry.INSTANCE.getEPackage(GeometryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		areaFilterEClass.getESuperTypes().add(theCorePackage.getFilter());
		positionLiteralEClass.getESuperTypes().add(theCorePackage.getIntegerExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(cellularAutomataInitializationEClass, CellularAutomataInitialization.class, "CellularAutomataInitialization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCellularAutomataInitialization_SeedRules(), theCorePackage.getRule(), null, "seedRules", null, 0, -1, CellularAutomataInitialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCellularAutomataInitialization_Geometry(), theGeometryPackage.getGeometry(), null, "geometry", null, 0, 1, CellularAutomataInitialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(areaFilterEClass, AreaFilter.class, "AreaFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAreaFilter_Areas(), this.getArea(), null, "areas", null, 0, -1, AreaFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(areaEClass, Area.class, "Area", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArea_DimensionRanges(), this.getDimensionRange(), null, "dimensionRanges", null, 0, -1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionRangeEClass, DimensionRange.class, "DimensionRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimensionRange_Lower(), this.getInteger(), "lower", null, 0, 1, DimensionRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionRange_Upper(), this.getInteger(), "upper", null, 0, 1, DimensionRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionLiteralEClass, PositionLiteral.class, "PositionLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionLiteral_DimensionIndex(), this.getInteger(), "dimensionIndex", null, 1, 1, PositionLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(integerEDataType, int.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //InitPackageImpl
