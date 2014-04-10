/**
 */
package geometry;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Neighborhood</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see geometry.GeometryPackage#getNeighborhood()
 * @model
 * @generated
 */
public enum Neighborhood implements Enumerator {
	/**
	 * The '<em><b>Neumann</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEUMANN_VALUE
	 * @generated
	 * @ordered
	 */
	NEUMANN(4, "Neumann", "Neumann"),

	/**
	 * The '<em><b>Moore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOORE_VALUE
	 * @generated
	 * @ordered
	 */
	MOORE(8, "Moore", "Moore");

	/**
	 * The '<em><b>Neumann</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Neumann</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEUMANN
	 * @model name="Neumann"
	 * @generated
	 * @ordered
	 */
	public static final int NEUMANN_VALUE = 4;

	/**
	 * The '<em><b>Moore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Moore</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOORE
	 * @model name="Moore"
	 * @generated
	 * @ordered
	 */
	public static final int MOORE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Neighborhood</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Neighborhood[] VALUES_ARRAY =
		new Neighborhood[] {
			NEUMANN,
			MOORE,
		};

	/**
	 * A public read-only list of all the '<em><b>Neighborhood</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Neighborhood> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Neighborhood</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Neighborhood get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Neighborhood result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Neighborhood</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Neighborhood getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Neighborhood result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Neighborhood</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Neighborhood get(int value) {
		switch (value) {
			case NEUMANN_VALUE: return NEUMANN;
			case MOORE_VALUE: return MOORE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Neighborhood(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Neighborhood
