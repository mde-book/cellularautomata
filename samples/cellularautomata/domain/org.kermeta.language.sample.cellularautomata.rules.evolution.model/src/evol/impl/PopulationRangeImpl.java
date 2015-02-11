/**
 */
package evol.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import core.impl.FilterImpl;
import core.util.visitor.CoreModelToTextVisitor;
import core.util.visitor.ModelToTextVisitor;
import evol.EvolPackage;
import evol.PopulationRange;
import evol.util.visitor.EvolModelToTextVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Population Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link evol.impl.PopulationRangeImpl#getLowerRange <em>Lower Range</em>}</li>
 *   <li>{@link evol.impl.PopulationRangeImpl#getUpperRange <em>Upper Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PopulationRangeImpl extends FilterImpl implements PopulationRange {
	/**
	 * The default value of the '{@link #getLowerRange() <em>Lower Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerRange()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_RANGE_EDEFAULT = -2147483648;

	/**
	 * The cached value of the '{@link #getLowerRange() <em>Lower Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerRange()
	 * @generated
	 * @ordered
	 */
	protected int lowerRange = LOWER_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperRange() <em>Upper Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperRange()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_RANGE_EDEFAULT = 2147483647;

	/**
	 * The cached value of the '{@link #getUpperRange() <em>Upper Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperRange()
	 * @generated
	 * @ordered
	 */
	protected int upperRange = UPPER_RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopulationRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvolPackage.Literals.POPULATION_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerRange() {
		return lowerRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerRange(int newLowerRange) {
		int oldLowerRange = lowerRange;
		lowerRange = newLowerRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvolPackage.POPULATION_RANGE__LOWER_RANGE, oldLowerRange, lowerRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperRange() {
		return upperRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperRange(int newUpperRange) {
		int oldUpperRange = upperRange;
		upperRange = newUpperRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvolPackage.POPULATION_RANGE__UPPER_RANGE, oldUpperRange, upperRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvolPackage.POPULATION_RANGE__LOWER_RANGE:
				return getLowerRange();
			case EvolPackage.POPULATION_RANGE__UPPER_RANGE:
				return getUpperRange();
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
			case EvolPackage.POPULATION_RANGE__LOWER_RANGE:
				setLowerRange((Integer)newValue);
				return;
			case EvolPackage.POPULATION_RANGE__UPPER_RANGE:
				setUpperRange((Integer)newValue);
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
			case EvolPackage.POPULATION_RANGE__LOWER_RANGE:
				setLowerRange(LOWER_RANGE_EDEFAULT);
				return;
			case EvolPackage.POPULATION_RANGE__UPPER_RANGE:
				setUpperRange(UPPER_RANGE_EDEFAULT);
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
			case EvolPackage.POPULATION_RANGE__LOWER_RANGE:
				return lowerRange != LOWER_RANGE_EDEFAULT;
			case EvolPackage.POPULATION_RANGE__UPPER_RANGE:
				return upperRange != UPPER_RANGE_EDEFAULT;
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
		result.append(" (lowerRange: ");
		result.append(lowerRange);
		result.append(", upperRange: ");
		result.append(upperRange);
		result.append(')');
		return result.toString();
	}

	@Override
	public String accept(CoreModelToTextVisitor visitor) {
		if(visitor instanceof EvolModelToTextVisitor)
			return ((EvolModelToTextVisitor)visitor).visitPopulationRange(this);
		else 
			return visitor.visitFilter(this);
	}

} //PopulationRangeImpl
