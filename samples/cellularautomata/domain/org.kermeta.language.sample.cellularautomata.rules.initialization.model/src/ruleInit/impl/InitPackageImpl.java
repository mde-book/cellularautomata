/**
 */
package ruleInit.impl;

import core.CorePackage;

import geometry.GeometryPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ruleInit.CellularAutomatatInitialization;
import ruleInit.CoordinateRange;
import ruleInit.CoordinateRanges;
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
	private EClass cellularAutomatatInitializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinateRangesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinateRangeEClass = null;

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
	public EClass getCellularAutomatatInitialization() {
		return cellularAutomatatInitializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCellularAutomatatInitialization_SeedRules() {
		return (EReference)cellularAutomatatInitializationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCellularAutomatatInitialization_Geometry() {
		return (EReference)cellularAutomatatInitializationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinateRanges() {
		return coordinateRangesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinateRanges_CoordinateRanges() {
		return (EReference)coordinateRangesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinateRange() {
		return coordinateRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinateRange_DimensionRanges() {
		return (EReference)coordinateRangeEClass.getEStructuralFeatures().get(0);
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
		cellularAutomatatInitializationEClass = createEClass(CELLULAR_AUTOMATAT_INITIALIZATION);
		createEReference(cellularAutomatatInitializationEClass, CELLULAR_AUTOMATAT_INITIALIZATION__SEED_RULES);
		createEReference(cellularAutomatatInitializationEClass, CELLULAR_AUTOMATAT_INITIALIZATION__GEOMETRY);

		coordinateRangesEClass = createEClass(COORDINATE_RANGES);
		createEReference(coordinateRangesEClass, COORDINATE_RANGES__COORDINATE_RANGES);

		coordinateRangeEClass = createEClass(COORDINATE_RANGE);
		createEReference(coordinateRangeEClass, COORDINATE_RANGE__DIMENSION_RANGES);

		dimensionRangeEClass = createEClass(DIMENSION_RANGE);
		createEAttribute(dimensionRangeEClass, DIMENSION_RANGE__LOWER);
		createEAttribute(dimensionRangeEClass, DIMENSION_RANGE__UPPER);

		positionLiteralEClass = createEClass(POSITION_LITERAL);
		createEAttribute(positionLiteralEClass, POSITION_LITERAL__DIMENSION_INDEX);
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
		coordinateRangesEClass.getESuperTypes().add(theCorePackage.getFilter());
		positionLiteralEClass.getESuperTypes().add(theCorePackage.getIntegerExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(cellularAutomatatInitializationEClass, CellularAutomatatInitialization.class, "CellularAutomatatInitialization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCellularAutomatatInitialization_SeedRules(), theCorePackage.getRule(), null, "seedRules", null, 0, -1, CellularAutomatatInitialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCellularAutomatatInitialization_Geometry(), theGeometryPackage.getGeometry(), null, "geometry", null, 0, 1, CellularAutomatatInitialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinateRangesEClass, CoordinateRanges.class, "CoordinateRanges", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinateRanges_CoordinateRanges(), this.getCoordinateRange(), null, "coordinateRanges", null, 0, -1, CoordinateRanges.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinateRangeEClass, CoordinateRange.class, "CoordinateRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinateRange_DimensionRanges(), this.getDimensionRange(), null, "dimensionRanges", null, 0, -1, CoordinateRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionRangeEClass, DimensionRange.class, "DimensionRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimensionRange_Lower(), ecorePackage.getEInt(), "lower", null, 0, 1, DimensionRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionRange_Upper(), ecorePackage.getEInt(), "upper", null, 0, 1, DimensionRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionLiteralEClass, PositionLiteral.class, "PositionLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionLiteral_DimensionIndex(), ecorePackage.getEInt(), "dimensionIndex", null, 1, 1, PositionLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //InitPackageImpl
