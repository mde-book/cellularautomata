/**
 */
package geometry.impl;

import geometry.Dimension;
import geometry.GeometryPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link geometry.impl.DimensionImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link geometry.impl.DimensionImpl#isIsCircular <em>Is Circular</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimensionImpl extends EObjectImpl implements Dimension {
	/**
	 * The default value of the '{@link #getExtent() <em>Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected static final int EXTENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExtent() <em>Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected int extent = EXTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsCircular() <em>Is Circular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCircular()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CIRCULAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCircular() <em>Is Circular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCircular()
	 * @generated
	 * @ordered
	 */
	protected boolean isCircular = IS_CIRCULAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeometryPackage.Literals.DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExtent() {
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtent(int newExtent) {
		int oldExtent = extent;
		extent = newExtent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.DIMENSION__EXTENT, oldExtent, extent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCircular() {
		return isCircular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCircular(boolean newIsCircular) {
		boolean oldIsCircular = isCircular;
		isCircular = newIsCircular;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.DIMENSION__IS_CIRCULAR, oldIsCircular, isCircular));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeometryPackage.DIMENSION__EXTENT:
				return getExtent();
			case GeometryPackage.DIMENSION__IS_CIRCULAR:
				return isIsCircular();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeometryPackage.DIMENSION__EXTENT:
				setExtent((Integer)newValue);
				return;
			case GeometryPackage.DIMENSION__IS_CIRCULAR:
				setIsCircular((Boolean)newValue);
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
			case GeometryPackage.DIMENSION__EXTENT:
				setExtent(EXTENT_EDEFAULT);
				return;
			case GeometryPackage.DIMENSION__IS_CIRCULAR:
				setIsCircular(IS_CIRCULAR_EDEFAULT);
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
			case GeometryPackage.DIMENSION__EXTENT:
				return extent != EXTENT_EDEFAULT;
			case GeometryPackage.DIMENSION__IS_CIRCULAR:
				return isCircular != IS_CIRCULAR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (extent: ");
		result.append(extent);
		result.append(", isCircular: ");
		result.append(isCircular);
		result.append(')');
		return result.toString();
	}

} //DimensionImpl
