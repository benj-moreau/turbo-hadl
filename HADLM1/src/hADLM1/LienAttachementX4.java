/**
 */
package hADLM1;

import hADL.Liens.LienAttachementPFRF;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Attachement X4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.LienAttachementX4#getSecurityauth_portfourni <em>Securityauth portfourni</em>}</li>
 *   <li>{@link hADLM1.LienAttachementX4#getClearencerequest_rolefrom <em>Clearencerequest rolefrom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienAttachementX4 extends LienAttachementPFRF {
	/**
	 * The cached value of the '{@link #getSecurityauth_portfourni() <em>Securityauth portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityauth_portfourni()
	 * @generated
	 * @ordered
	 */
	protected SecurityAuth_PortFourni securityauth_portfourni;

	/**
	 * The cached value of the '{@link #getClearencerequest_rolefrom() <em>Clearencerequest rolefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearencerequest_rolefrom()
	 * @generated
	 * @ordered
	 */
	protected ClearenceRequest_RoleFrom clearencerequest_rolefrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienAttachementX4() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.LIEN_ATTACHEMENT_X4;
	}

	/**
	 * Returns the value of the '<em><b>Securityauth portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityauth portfourni</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityauth portfourni</em>' containment reference.
	 * @see #setSecurityauth_portfourni(SecurityAuth_PortFourni)
	 * @generated
	 */
	public SecurityAuth_PortFourni getSecurityauth_portfourni() {
		return securityauth_portfourni;
	}

	/**
	 * Sets the value of the '{@link hADLM1.LienAttachementX4#getSecurityauth_portfourni <em>Securityauth portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityauth portfourni</em>' containment reference.
	 * @see #getSecurityauth_portfourni()
	 * @generated
	 */
	public void setSecurityauth_portfourni(SecurityAuth_PortFourni newSecurityauth_portfourni) {
		securityauth_portfourni = newSecurityauth_portfourni;
	}

	/**
	 * Returns the value of the '<em><b>Clearencerequest rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clearencerequest rolefrom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clearencerequest rolefrom</em>' containment reference.
	 * @see #setClearencerequest_rolefrom(ClearenceRequest_RoleFrom)
	 * @generated
	 */
	public ClearenceRequest_RoleFrom getClearencerequest_rolefrom() {
		return clearencerequest_rolefrom;
	}

	/**
	 * Sets the value of the '{@link hADLM1.LienAttachementX4#getClearencerequest_rolefrom <em>Clearencerequest rolefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clearencerequest rolefrom</em>' containment reference.
	 * @see #getClearencerequest_rolefrom()
	 * @generated
	 */
	public void setClearencerequest_rolefrom(ClearenceRequest_RoleFrom newClearencerequest_rolefrom) {
		clearencerequest_rolefrom = newClearencerequest_rolefrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.LIEN_ATTACHEMENT_X4__SECURITYAUTH_PORTFOURNI:
				return getSecurityauth_portfourni();
			case HADLM1Package.LIEN_ATTACHEMENT_X4__CLEARENCEREQUEST_ROLEFROM:
				return getClearencerequest_rolefrom();
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
			case HADLM1Package.LIEN_ATTACHEMENT_X4__SECURITYAUTH_PORTFOURNI:
				setSecurityauth_portfourni((SecurityAuth_PortFourni)newValue);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_X4__CLEARENCEREQUEST_ROLEFROM:
				setClearencerequest_rolefrom((ClearenceRequest_RoleFrom)newValue);
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
			case HADLM1Package.LIEN_ATTACHEMENT_X4__SECURITYAUTH_PORTFOURNI:
				setSecurityauth_portfourni((SecurityAuth_PortFourni)null);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_X4__CLEARENCEREQUEST_ROLEFROM:
				setClearencerequest_rolefrom((ClearenceRequest_RoleFrom)null);
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
			case HADLM1Package.LIEN_ATTACHEMENT_X4__SECURITYAUTH_PORTFOURNI:
				return securityauth_portfourni != null;
			case HADLM1Package.LIEN_ATTACHEMENT_X4__CLEARENCEREQUEST_ROLEFROM:
				return clearencerequest_rolefrom != null;
		}
		return super.eIsSet(featureID);
	}

} // LienAttachementX4
