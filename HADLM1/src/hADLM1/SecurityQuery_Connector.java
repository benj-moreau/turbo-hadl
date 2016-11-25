/**
 */
package hADLM1;

import hADL.Connecteurs.ConnecteurExplicite;
import hADL.Roles.RoleFrom;

import java.util.logging.Logger;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Query Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.SecurityQuery_Connector#getSecurityquery_roleto <em>Securityquery roleto</em>}</li>
 *   <li>{@link hADLM1.SecurityQuery_Connector#getSecurityquery_rolefrom <em>Securityquery rolefrom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityQuery_Connector extends ConnecteurExplicite {
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
	protected SecurityQuery_Connector() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.SECURITY_QUERY_CONNECTOR;
	}

	/**
	 * Returns the value of the '<em><b>Securityquery roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityquery roleto</em>' containment reference list isn't clear,
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
	 * Sets the value of the '{@link hADLM1.SecurityQuery_Connector#getSecurityquery_roleto <em>Securityquery roleto</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Securityquery rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityquery rolefrom</em>' containment reference list isn't clear,
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
	 * Sets the value of the '{@link hADLM1.SecurityQuery_Connector#getSecurityquery_rolefrom <em>Securityquery rolefrom</em>}' containment reference.
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
			case HADLM1Package.SECURITY_QUERY_CONNECTOR__SECURITYQUERY_ROLETO:
				return getSecurityquery_roleto();
			case HADLM1Package.SECURITY_QUERY_CONNECTOR__SECURITYQUERY_ROLEFROM:
				return getSecurityquery_rolefrom();
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
			case HADLM1Package.SECURITY_QUERY_CONNECTOR__SECURITYQUERY_ROLETO:
				setSecurityquery_roleto((SecurityQuery_RoleTo)newValue);
				return;
			case HADLM1Package.SECURITY_QUERY_CONNECTOR__SECURITYQUERY_ROLEFROM:
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
			case HADLM1Package.SECURITY_QUERY_CONNECTOR__SECURITYQUERY_ROLETO:
				setSecurityquery_roleto((SecurityQuery_RoleTo)null);
				return;
			case HADLM1Package.SECURITY_QUERY_CONNECTOR__SECURITYQUERY_ROLEFROM:
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
			case HADLM1Package.SECURITY_QUERY_CONNECTOR__SECURITYQUERY_ROLETO:
				return securityquery_roleto != null;
			case HADLM1Package.SECURITY_QUERY_CONNECTOR__SECURITYQUERY_ROLEFROM:
				return securityquery_rolefrom != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	private static final Logger LOGGER = Logger.getAnonymousLogger();
	/**
	 * @generated NOT
	 */
	public void notify(RoleFrom roleFrom, Object data) {
		if(securityquery_rolefrom.equals(roleFrom)){
			LOGGER.info("Reception requete via security manager "+ data);
			securityquery_roleto.notifyConfig(data);
		}else{
			LOGGER.warning("mauvais role");
		}
		
	}
} // SecurityQuery_Connector
