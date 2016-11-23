/**
 */
package hADLM1;

import hADL.Composant.Composant;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Manager Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.SecurityManager_Composant#getCquery_portfourni <em>Cquery portfourni</em>}</li>
 *   <li>{@link hADLM1.SecurityManager_Composant#getSecurityauth_portrequis <em>Securityauth portrequis</em>}</li>
 *   <li>{@link hADLM1.SecurityManager_Composant#getCquery_portrequis <em>Cquery portrequis</em>}</li>
 *   <li>{@link hADLM1.SecurityManager_Composant#getSecurityauth_portfourni <em>Securityauth portfourni</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityManager_Composant extends Composant {
	/**
	 * @generated NOT
	 */
	private static final Logger LOGGER = Logger.getAnonymousLogger();
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
	 * The cached value of the '{@link #getSecurityauth_portrequis() <em>Securityauth portrequis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityauth_portrequis()
	 * @generated
	 * @ordered
	 */
	protected SecurityAuth_PortRequis securityauth_portrequis;

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
	 * The cached value of the '{@link #getSecurityauth_portfourni() <em>Securityauth portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityauth_portfourni()
	 * @generated
	 * @ordered
	 */
	protected SecurityAuth_PortFourni securityauth_portfourni;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityManager_Composant() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.SECURITY_MANAGER_COMPOSANT;
	}

	/**
	 * Returns the value of the '<em><b>Cquery portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cquery portfourni</em>' containment reference list isn't clear,
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
	 * Sets the value of the '{@link hADLM1.SecurityManager_Composant#getCquery_portfourni <em>Cquery portfourni</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Securityauth portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityauth portrequis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityauth portrequis</em>' containment reference.
	 * @see #setSecurityauth_portrequis(SecurityAuth_PortRequis)
	 * @generated
	 */
	public SecurityAuth_PortRequis getSecurityauth_portrequis() {
		return securityauth_portrequis;
	}

	/**
	 * Sets the value of the '{@link hADLM1.SecurityManager_Composant#getSecurityauth_portrequis <em>Securityauth portrequis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityauth portrequis</em>' containment reference.
	 * @see #getSecurityauth_portrequis()
	 * @generated
	 */
	public void setSecurityauth_portrequis(SecurityAuth_PortRequis newSecurityauth_portrequis) {
		securityauth_portrequis = newSecurityauth_portrequis;
	}

	/**
	 * Returns the value of the '<em><b>Cquery portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cquery portrequis</em>' containment reference list isn't clear,
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
	 * Sets the value of the '{@link hADLM1.SecurityManager_Composant#getCquery_portrequis <em>Cquery portrequis</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Securityauth portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityauth portfourni</em>' containment reference list isn't clear,
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
	 * Sets the value of the '{@link hADLM1.SecurityManager_Composant#getSecurityauth_portfourni <em>Securityauth portfourni</em>}' containment reference.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.SECURITY_MANAGER_COMPOSANT__CQUERY_PORTFOURNI:
				return getCquery_portfourni();
			case HADLM1Package.SECURITY_MANAGER_COMPOSANT__SECURITYAUTH_PORTREQUIS:
				return getSecurityauth_portrequis();
			case HADLM1Package.SECURITY_MANAGER_COMPOSANT__CQUERY_PORTREQUIS:
				return getCquery_portrequis();
			case HADLM1Package.SECURITY_MANAGER_COMPOSANT__SECURITYAUTH_PORTFOURNI:
				return getSecurityauth_portfourni();
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
			case HADLM1Package.SECURITY_MANAGER_COMPOSANT__CQUERY_PORTFOURNI:
				setCquery_portfourni((CQuery_PortFourni)newValue);
				return;
			case HADLM1Package.SECURITY_MANAGER_COMPOSANT__SECURITYAUTH_PORTREQUIS:
				setSecurityauth_portrequis((SecurityAuth_PortRequis)newValue);
				return;
			case HADLM1Package.SECURITY_MANAGER_COMPOSANT__CQUERY_PORTREQUIS:
				setCquery_portrequis((CQuery_PortRequis)newValue);
				return;
			case HADLM1Package.SECURITY_MANAGER_COMPOSANT__SECURITYAUTH_PORTFOURNI:
				setSecurityauth_portfourni((SecurityAuth_PortFourni)newValue);
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
			case HADLM1Package.SECURITY_MANAGER_COMPOSANT__CQUERY_PORTFOURNI:
				setCquery_portfourni((CQuery_PortFourni)null);
				return;
			case HADLM1Package.SECURITY_MANAGER_COMPOSANT__SECURITYAUTH_PORTREQUIS:
				setSecurityauth_portrequis((SecurityAuth_PortRequis)null);
				return;
			case HADLM1Package.SECURITY_MANAGER_COMPOSANT__CQUERY_PORTREQUIS:
				setCquery_portrequis((CQuery_PortRequis)null);
				return;
			case HADLM1Package.SECURITY_MANAGER_COMPOSANT__SECURITYAUTH_PORTFOURNI:
				setSecurityauth_portfourni((SecurityAuth_PortFourni)null);
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
			case HADLM1Package.SECURITY_MANAGER_COMPOSANT__CQUERY_PORTFOURNI:
				return cquery_portfourni != null;
			case HADLM1Package.SECURITY_MANAGER_COMPOSANT__SECURITYAUTH_PORTREQUIS:
				return securityauth_portrequis != null;
			case HADLM1Package.SECURITY_MANAGER_COMPOSANT__CQUERY_PORTREQUIS:
				return cquery_portrequis != null;
			case HADLM1Package.SECURITY_MANAGER_COMPOSANT__SECURITYAUTH_PORTFOURNI:
				return securityauth_portfourni != null;
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean authentification(Object data) {
		// mot de passe bouchon
		String mdp = "admin";
		ArrayList<Object> newData = (ArrayList<Object>) data;
		LOGGER.info("test mot de passe");
		return newData.get(1).equals(mdp);
	}

} // SecurityManager_Composant
