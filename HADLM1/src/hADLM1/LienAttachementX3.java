/**
 */
package hADLM1;

import hADL.Liens.LienAttachementPFRF;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Attachement X3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.LienAttachementX3#getCquery_portfourni <em>Cquery portfourni</em>}</li>
 *   <li>{@link hADLM1.LienAttachementX3#getSecurityquery_rolefrom <em>Securityquery rolefrom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienAttachementX3 extends LienAttachementPFRF {
	/**
	 * The cached value of the '{@link #getCquery_portfourni() <em>Cquery portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCquery_portfourni()
	 * @generated
	 * @ordered
	 */
	protected CQuery_PortFourni cquery_portfourni;

	/**
	 * The cached value of the '{@link #getSecurityquery_rolefrom() <em>Securityquery rolefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityquery_rolefrom()
	 * @generated
	 * @ordered
	 */
	protected SecurityQuery_RoleFrom securityquery_rolefrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienAttachementX3() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.LIEN_ATTACHEMENT_X3;
	}

	/**
	 * Returns the value of the '<em><b>Cquery portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cquery portfourni</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cquery portfourni</em>' containment reference.
	 * @see #setCquery_portfourni(CQuery_PortFourni)
	 * @generated
	 */
	public CQuery_PortFourni getCquery_portfourni() {
		return cquery_portfourni;
	}

	/**
	 * Sets the value of the '{@link hADLM1.LienAttachementX3#getCquery_portfourni <em>Cquery portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cquery portfourni</em>' containment reference.
	 * @see #getCquery_portfourni()
	 * @generated
	 */
	public void setCquery_portfourni(CQuery_PortFourni newCquery_portfourni) {
		cquery_portfourni = newCquery_portfourni;
	}

	/**
	 * Returns the value of the '<em><b>Securityquery rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityquery rolefrom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityquery rolefrom</em>' containment reference.
	 * @see #setSecurityquery_rolefrom(SecurityQuery_RoleFrom)
	 * @generated
	 */
	public SecurityQuery_RoleFrom getSecurityquery_rolefrom() {
		return securityquery_rolefrom;
	}

	/**
	 * Sets the value of the '{@link hADLM1.LienAttachementX3#getSecurityquery_rolefrom <em>Securityquery rolefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityquery rolefrom</em>' containment reference.
	 * @see #getSecurityquery_rolefrom()
	 * @generated
	 */
	public void setSecurityquery_rolefrom(SecurityQuery_RoleFrom newSecurityquery_rolefrom) {
		securityquery_rolefrom = newSecurityquery_rolefrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.LIEN_ATTACHEMENT_X3__CQUERY_PORTFOURNI:
				return getCquery_portfourni();
			case HADLM1Package.LIEN_ATTACHEMENT_X3__SECURITYQUERY_ROLEFROM:
				return getSecurityquery_rolefrom();
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
			case HADLM1Package.LIEN_ATTACHEMENT_X3__CQUERY_PORTFOURNI:
				setCquery_portfourni((CQuery_PortFourni)newValue);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_X3__SECURITYQUERY_ROLEFROM:
				setSecurityquery_rolefrom((SecurityQuery_RoleFrom)newValue);
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
			case HADLM1Package.LIEN_ATTACHEMENT_X3__CQUERY_PORTFOURNI:
				setCquery_portfourni((CQuery_PortFourni)null);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_X3__SECURITYQUERY_ROLEFROM:
				setSecurityquery_rolefrom((SecurityQuery_RoleFrom)null);
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
			case HADLM1Package.LIEN_ATTACHEMENT_X3__CQUERY_PORTFOURNI:
				return cquery_portfourni != null;
			case HADLM1Package.LIEN_ATTACHEMENT_X3__SECURITYQUERY_ROLEFROM:
				return securityquery_rolefrom != null;
		}
		return super.eIsSet(featureID);
	}

} // LienAttachementX3
