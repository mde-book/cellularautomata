/**
 */
package ruleInit.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.InternalEList;
import ruleInit.CoordinateRange;
import ruleInit.DimensionRange;
import ruleInit.InitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinate Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ruleInit.impl.CoordinateRangeImpl#getDimensionRanges <em>Dimension Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoordinateRangeImpl extends EObjectImpl implements CoordinateRange {
	/**
	 * The cached value of the '{@link #getDimensionRanges() <em>Dimension Ranges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<DimensionRange> dimensionRanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinateRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InitPackage.Literals.COORDINATE_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DimensionRange> getDimensionRanges() {
		if (dimensionRanges == null) {
			dimensionRanges = new EObjectContainmentEList<DimensionRange>(DimensionRange.class, this, InitPackage.COORDINATE_RANGE__DIMENSION_RANGES);
		}
		return dimensionRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InitPackage.COORDINATE_RANGE__DIMENSION_RANGES:
				return ((InternalEList<?>)getDimensionRanges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InitPackage.COORDINATE_RANGE__DIMENSION_RANGES:
				return getDimensionRanges();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InitPackage.COORDINATE_RANGE__DIMENSION_RANGES:
				getDimensionRanges().clear();
				getDimensionRanges().addAll((Collection<? extends DimensionRange>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InitPackage.COORDINATE_RANGE__DIMENSION_RANGES:
				getDimensionRanges().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InitPackage.COORDINATE_RANGE__DIMENSION_RANGES:
				return dimensionRanges != null && !dimensionRanges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoordinateRangeImpl
