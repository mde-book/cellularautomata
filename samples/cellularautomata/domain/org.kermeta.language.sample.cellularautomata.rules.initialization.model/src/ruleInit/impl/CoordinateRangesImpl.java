/**
 */
package ruleInit.impl;

import core.impl.FilterImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ruleInit.CoordinateRange;
import ruleInit.CoordinateRanges;
import ruleInit.InitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinate Ranges</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ruleInit.impl.CoordinateRangesImpl#getCoordinateRanges <em>Coordinate Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoordinateRangesImpl extends FilterImpl implements CoordinateRanges {
	/**
	 * The cached value of the '{@link #getCoordinateRanges() <em>Coordinate Ranges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinateRange> coordinateRanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinateRangesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InitPackage.Literals.COORDINATE_RANGES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoordinateRange> getCoordinateRanges() {
		if (coordinateRanges == null) {
			coordinateRanges = new EObjectContainmentEList<CoordinateRange>(CoordinateRange.class, this, InitPackage.COORDINATE_RANGES__COORDINATE_RANGES);
		}
		return coordinateRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InitPackage.COORDINATE_RANGES__COORDINATE_RANGES:
				return ((InternalEList<?>)getCoordinateRanges()).basicRemove(otherEnd, msgs);
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
			case InitPackage.COORDINATE_RANGES__COORDINATE_RANGES:
				return getCoordinateRanges();
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
			case InitPackage.COORDINATE_RANGES__COORDINATE_RANGES:
				getCoordinateRanges().clear();
				getCoordinateRanges().addAll((Collection<? extends CoordinateRange>)newValue);
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
			case InitPackage.COORDINATE_RANGES__COORDINATE_RANGES:
				getCoordinateRanges().clear();
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
			case InitPackage.COORDINATE_RANGES__COORDINATE_RANGES:
				return coordinateRanges != null && !coordinateRanges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoordinateRangesImpl
