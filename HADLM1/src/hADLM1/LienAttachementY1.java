/**
 */
package hADLM1;

import hADL.Liens.LienAttachementPRRT;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Attachement Y1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.LienAttachementY1#getSecuritymanagement_portrequis <em>Securitymanagement portrequis</em>}</li>
 *   <li>{@link hADLM1.LienAttachementY1#getSecurityquery_roleto <em>Securityquery roleto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienAttachementY1 extends LienAttachementPRRT {
	/**
	 * The cached value of the '{@link #getSecuritymanagement_portrequis() <em>Securitymanagement portrequis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritymanagement_portrequis()
	 * @generated
	 * @ordered
	 */
	protected SecurityManagement_PortRequis securitymanagement_portrequis;

	/**
	 * The cached value of the '{@link #getSecurityquery_roleto() <em>Securityquery roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityquery_roleto()
	 * @generated
	 * @ordered
	 */
	protected SecurityQuery_RoleTo securityquery_roleto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienAttachementY1() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.LIEN_ATTACHEMENT_Y1;
	}

	/**
	 * Returns the value of the '<em><b>Securitymanagement portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitymanagement portrequis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitymanagement portrequis</em>' containment reference.
	 * @see #setSecuritymanagement_portrequis(SecurityManagement_PortRequis)
	 * @generated
	 */
	public SecurityManagement_PortRequis getSecuritymanagement_portrequis() {
		return securitymanagement_portrequis;
	}

	/**
	 * Sets the value of the '{@link hADLM1.LienAttachementY1#getSecuritymanagement_portrequis <em>Securitymanagement portrequis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securitymanagement portrequis</em>' containment reference.
	 * @see #getSecuritymanagement_portrequis()
	 * @generated
	 */
	public void setSecuritymanagement_portrequis(SecurityManagement_PortRequis newSecuritymanagement_portrequis) {
		securitymanagement_portrequis = newSecuritymanagement_portrequis;
	}

	/**
	 * Returns the value of the '<em><b>Securityquery roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityquery roleto</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityquery roleto</em>' containment reference.
	 * @see #setSecurityquery_roleto(SecurityQuery_RoleTo)
	 * @generated
	 */
	public SecurityQuery_RoleTo getSecurityquery_roleto() {
		return securityquery_roleto;
	}

	/**
	 * Sets the value of the '{@link hADLM1.LienAttachementY1#getSecurityquery_roleto <em>Securityquery roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityquery roleto</em>' containment reference.
	 * @see #getSecurityquery_roleto()
	 * @generated
	 */
	public void setSecurityquery_roleto(SecurityQuery_RoleTo newSecurityquery_roleto) {
		securityquery_roleto = newSecurityquery_roleto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.LIEN_ATTACHEMENT_Y1__SECURITYMANAGEMENT_PORTREQUIS:
				return getSecuritymanagement_portrequis();
			case HADLM1Package.LIEN_ATTACHEMENT_Y1__SECURITYQUERY_ROLETO:
				return getSecurityquery_roleto();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HADLM1Package.LIEN_ATTACHEMENT_Y1__SECURITYMANAGEMENT_PORTREQUIS:
				setSecuritymanagement_portrequis((SecurityManagement_PortRequis)newValue);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_Y1__SECURITYQUERY_ROLETO:
				setSecurityquery_roleto((SecurityQuery_RoleTo)newValue);
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
			case HADLM1Package.LIEN_ATTACHEMENT_Y1__SECURITYMANAGEMENT_PORTREQUIS:
				setSecuritymanagement_portrequis((SecurityManagement_PortRequis)null);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_Y1__SECURITYQUERY_ROLETO:
				setSecurityquery_roleto((SecurityQuery_RoleTo)null);
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
			case HADLM1Package.LIEN_ATTACHEMENT_Y1__SECURITYMANAGEMENT_PORTREQUIS:
				return securitymanagement_portrequis != null;
			case HADLM1Package.LIEN_ATTACHEMENT_Y1__SECURITYQUERY_ROLETO:
				return securityquery_roleto != null;
		}
		return super.eIsSet(featureID);
	}

} // LienAttachementY1
