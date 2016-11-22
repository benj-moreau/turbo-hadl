/**
 */
package hADLM1;

import hADL.Liens.LienAttachementPRRT;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Attachement Y5</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.LienAttachementY5#getCquery_portrequis <em>Cquery portrequis</em>}</li>
 *   <li>{@link hADLM1.LienAttachementY5#getSecurityquery_roleto <em>Securityquery roleto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienAttachementY5 extends LienAttachementPRRT {
	/**
	 * The cached value of the '{@link #getCquery_portrequis() <em>Cquery portrequis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCquery_portrequis()
	 * @generated
	 * @ordered
	 */
	protected CQuery_PortRequis cquery_portrequis;

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
	protected LienAttachementY5() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.LIEN_ATTACHEMENT_Y5;
	}

	/**
	 * Returns the value of the '<em><b>Cquery portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cquery portrequis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cquery portrequis</em>' containment reference.
	 * @see #setCquery_portrequis(CQuery_PortRequis)
	 * @generated
	 */
	public CQuery_PortRequis getCquery_portrequis() {
		return cquery_portrequis;
	}

	/**
	 * Sets the value of the '{@link hADLM1.LienAttachementY5#getCquery_portrequis <em>Cquery portrequis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cquery portrequis</em>' containment reference.
	 * @see #getCquery_portrequis()
	 * @generated
	 */
	public void setCquery_portrequis(CQuery_PortRequis newCquery_portrequis) {
		cquery_portrequis = newCquery_portrequis;
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
	 * Sets the value of the '{@link hADLM1.LienAttachementY5#getSecurityquery_roleto <em>Securityquery roleto</em>}' containment reference.
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
			case HADLM1Package.LIEN_ATTACHEMENT_Y5__CQUERY_PORTREQUIS:
				return getCquery_portrequis();
			case HADLM1Package.LIEN_ATTACHEMENT_Y5__SECURITYQUERY_ROLETO:
				return getSecurityquery_roleto();
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
			case HADLM1Package.LIEN_ATTACHEMENT_Y5__CQUERY_PORTREQUIS:
				setCquery_portrequis((CQuery_PortRequis)newValue);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_Y5__SECURITYQUERY_ROLETO:
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
			case HADLM1Package.LIEN_ATTACHEMENT_Y5__CQUERY_PORTREQUIS:
				setCquery_portrequis((CQuery_PortRequis)null);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_Y5__SECURITYQUERY_ROLETO:
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
			case HADLM1Package.LIEN_ATTACHEMENT_Y5__CQUERY_PORTREQUIS:
				return cquery_portrequis != null;
			case HADLM1Package.LIEN_ATTACHEMENT_Y5__SECURITYQUERY_ROLETO:
				return securityquery_roleto != null;
		}
		return super.eIsSet(featureID);
	}

} // LienAttachementY5
