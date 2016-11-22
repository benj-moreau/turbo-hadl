/**
 */
package hADLM1;

import hADL.Liens.LienAttachementPFRF;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Attachement X6</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.LienAttachementX6#getSecuritycheck_portfourni <em>Securitycheck portfourni</em>}</li>
 *   <li>{@link hADLM1.LienAttachementX6#getClearencerequest_rolefrom <em>Clearencerequest rolefrom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienAttachementX6 extends LienAttachementPFRF {
	/**
	 * The cached value of the '{@link #getSecuritycheck_portfourni() <em>Securitycheck portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritycheck_portfourni()
	 * @generated
	 * @ordered
	 */
	protected SecurityCheck_PortFourni securitycheck_portfourni;

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
	protected LienAttachementX6() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.LIEN_ATTACHEMENT_X6;
	}

	/**
	 * Returns the value of the '<em><b>Securitycheck portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitycheck portfourni</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitycheck portfourni</em>' containment reference.
	 * @see #setSecuritycheck_portfourni(SecurityCheck_PortFourni)
	 * @generated
	 */
	public SecurityCheck_PortFourni getSecuritycheck_portfourni() {
		return securitycheck_portfourni;
	}

	/**
	 * Sets the value of the '{@link hADLM1.LienAttachementX6#getSecuritycheck_portfourni <em>Securitycheck portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securitycheck portfourni</em>' containment reference.
	 * @see #getSecuritycheck_portfourni()
	 * @generated
	 */
	public void setSecuritycheck_portfourni(SecurityCheck_PortFourni newSecuritycheck_portfourni) {
		securitycheck_portfourni = newSecuritycheck_portfourni;
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
	 * Sets the value of the '{@link hADLM1.LienAttachementX6#getClearencerequest_rolefrom <em>Clearencerequest rolefrom</em>}' containment reference.
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
			case HADLM1Package.LIEN_ATTACHEMENT_X6__SECURITYCHECK_PORTFOURNI:
				return getSecuritycheck_portfourni();
			case HADLM1Package.LIEN_ATTACHEMENT_X6__CLEARENCEREQUEST_ROLEFROM:
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
			case HADLM1Package.LIEN_ATTACHEMENT_X6__SECURITYCHECK_PORTFOURNI:
				setSecuritycheck_portfourni((SecurityCheck_PortFourni)newValue);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_X6__CLEARENCEREQUEST_ROLEFROM:
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
			case HADLM1Package.LIEN_ATTACHEMENT_X6__SECURITYCHECK_PORTFOURNI:
				setSecuritycheck_portfourni((SecurityCheck_PortFourni)null);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_X6__CLEARENCEREQUEST_ROLEFROM:
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
			case HADLM1Package.LIEN_ATTACHEMENT_X6__SECURITYCHECK_PORTFOURNI:
				return securitycheck_portfourni != null;
			case HADLM1Package.LIEN_ATTACHEMENT_X6__CLEARENCEREQUEST_ROLEFROM:
				return clearencerequest_rolefrom != null;
		}
		return super.eIsSet(featureID);
	}

} // LienAttachementX6
