/**
 */
package core.impl;

import core.CorePackage;
import core.Mod;
import core.util.visitor.CoreModelToTextVisitor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ModImpl extends BinaryExpressionImpl implements Mod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.MOD;
	}

	/**
	 * 
	 */
	@Override
	public String accept(final CoreModelToTextVisitor visitor) {
		return visitor.visitMod(this);
	}
} //ModImpl
