/**
 */
package ruleInit;

import core.Rule;

import geometry.Geometry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cellular Automata Initialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ruleInit.CellularAutomataInitialization#getSeedRules <em>Seed Rules</em>}</li>
 *   <li>{@link ruleInit.CellularAutomataInitialization#getGeometry <em>Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @see ruleInit.InitPackage#getCellularAutomataInitialization()
 * @model
 * @generated
 */
public interface CellularAutomataInitialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Seed Rules</b></em>' containment reference list.
	 * The list contents are of type {@link core.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seed Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed Rules</em>' containment reference list.
	 * @see ruleInit.InitPackage#getCellularAutomataInitialization_SeedRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getSeedRules();

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference.
	 * @see #setGeometry(Geometry)
	 * @see ruleInit.InitPackage#getCellularAutomataInitialization_Geometry()
	 * @model containment="true"
	 * @generated
	 */
	Geometry getGeometry();

	/**
	 * Sets the value of the '{@link ruleInit.CellularAutomataInitialization#getGeometry <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' containment reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(Geometry value);

} // CellularAutomataInitialization
