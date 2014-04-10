/**
 */
package geometry;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geometry.RegularGeometry#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link geometry.RegularGeometry#getNeighbors <em>Neighbors</em>}</li>
 * </ul>
 * </p>
 *
 * @see geometry.GeometryPackage#getRegularGeometry()
 * @model
 * @generated
 */
public interface RegularGeometry extends Geometry {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link geometry.Dimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference list.
	 * @see geometry.GeometryPackage#getRegularGeometry_Dimensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dimension> getDimensions();

	/**
	 * Returns the value of the '<em><b>Neighbors</b></em>' attribute.
	 * The default value is <code>"Moore"</code>.
	 * The literals are from the enumeration {@link geometry.Neighborhood}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neighbors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighbors</em>' attribute.
	 * @see geometry.Neighborhood
	 * @see #setNeighbors(Neighborhood)
	 * @see geometry.GeometryPackage#getRegularGeometry_Neighbors()
	 * @model default="Moore"
	 * @generated
	 */
	Neighborhood getNeighbors();

	/**
	 * Sets the value of the '{@link geometry.RegularGeometry#getNeighbors <em>Neighbors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neighbors</em>' attribute.
	 * @see geometry.Neighborhood
	 * @see #getNeighbors()
	 * @generated
	 */
	void setNeighbors(Neighborhood value);

} // RegularGeometry
