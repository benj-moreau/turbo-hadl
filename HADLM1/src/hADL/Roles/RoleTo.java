/**
 */
package hADL.Roles;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role To</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @generated
 */
public class RoleTo extends Role {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleTo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RolesPackage.Literals.ROLE_TO;
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public void notifyConfig(Object data) {
		observer.actionViaRole(this, data);
	}

} // RoleTo
