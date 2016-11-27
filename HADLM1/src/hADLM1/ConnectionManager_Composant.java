/**
 */
package hADLM1;

import hADL.Composant.Composant;
import hADL.Interfaces.PortFourniCompo;
import hADL.Interfaces.PortRequisCompo;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Manager Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.ConnectionManager_Composant#getExternalsocket_portrequis <em>Externalsocket portrequis</em>}</li>
 *   <li>{@link hADLM1.ConnectionManager_Composant#getSecuritycheck_portfourni <em>Securitycheck portfourni</em>}</li>
 *   <li>{@link hADLM1.ConnectionManager_Composant#getDbquery_portfourni <em>Dbquery portfourni</em>}</li>
 *   <li>{@link hADLM1.ConnectionManager_Composant#getDbquery_portrequis <em>Dbquery portrequis</em>}</li>
 *   <li>{@link hADLM1.ConnectionManager_Composant#getSecuritycheck_portrequis <em>Securitycheck portrequis</em>}</li>
 *   <li>{@link hADLM1.ConnectionManager_Composant#getExternalsocket_portfourni <em>Externalsocket portfourni</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionManager_Composant extends Composant {
	/**
	 * @generated NOT
	 */
	/**
	 * The cached value of the '{@link #getExternalsocket_portrequis() <em>Externalsocket portrequis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalsocket_portrequis()
	 * @generated
	 * @ordered
	 */
	protected ExternalSocket_PortRequis externalsocket_portrequis;

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
	 * The cached value of the '{@link #getDbquery_portfourni() <em>Dbquery portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbquery_portfourni()
	 * @generated
	 * @ordered
	 */
	protected DBQuery_PortFourni dbquery_portfourni;

	/**
	 * The cached value of the '{@link #getDbquery_portrequis() <em>Dbquery portrequis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbquery_portrequis()
	 * @generated
	 * @ordered
	 */
	protected DBQuery_PortRequis dbquery_portrequis;

	/**
	 * The cached value of the '{@link #getSecuritycheck_portrequis() <em>Securitycheck portrequis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritycheck_portrequis()
	 * @generated
	 * @ordered
	 */
	protected SecurityCheck_PortRequis securitycheck_portrequis;

	/**
	 * The cached value of the '{@link #getExternalsocket_portfourni() <em>Externalsocket portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalsocket_portfourni()
	 * @generated
	 * @ordered
	 */
	protected ExternalSocket_PortFourni externalsocket_portfourni;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionManager_Composant() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.CONNECTION_MANAGER_COMPOSANT;
	}

	/**
	 * Returns the value of the '<em><b>Externalsocket portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Externalsocket portrequis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externalsocket portrequis</em>' containment reference.
	 * @see #setExternalsocket_portrequis(ExternalSocket_PortRequis)
	 * @generated
	 */
	public ExternalSocket_PortRequis getExternalsocket_portrequis() {
		return externalsocket_portrequis;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ConnectionManager_Composant#getExternalsocket_portrequis <em>Externalsocket portrequis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Externalsocket portrequis</em>' containment reference.
	 * @see #getExternalsocket_portrequis()
	 * @generated
	 */
	public void setExternalsocket_portrequis(ExternalSocket_PortRequis newExternalsocket_portrequis) {
		externalsocket_portrequis = newExternalsocket_portrequis;
	}

	/**
	 * Returns the value of the '<em><b>Securitycheck portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitycheck portfourni</em>' containment reference list isn't clear,
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
	 * Sets the value of the '{@link hADLM1.ConnectionManager_Composant#getSecuritycheck_portfourni <em>Securitycheck portfourni</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Dbquery portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dbquery portfourni</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbquery portfourni</em>' containment reference.
	 * @see #setDbquery_portfourni(DBQuery_PortFourni)
	 * @generated
	 */
	public DBQuery_PortFourni getDbquery_portfourni() {
		return dbquery_portfourni;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ConnectionManager_Composant#getDbquery_portfourni <em>Dbquery portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbquery portfourni</em>' containment reference.
	 * @see #getDbquery_portfourni()
	 * @generated
	 */
	public void setDbquery_portfourni(DBQuery_PortFourni newDbquery_portfourni) {
		dbquery_portfourni = newDbquery_portfourni;
	}

	/**
	 * Returns the value of the '<em><b>Dbquery portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dbquery portrequis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbquery portrequis</em>' containment reference.
	 * @see #setDbquery_portrequis(DBQuery_PortRequis)
	 * @generated
	 */
	public DBQuery_PortRequis getDbquery_portrequis() {
		return dbquery_portrequis;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ConnectionManager_Composant#getDbquery_portrequis <em>Dbquery portrequis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbquery portrequis</em>' containment reference.
	 * @see #getDbquery_portrequis()
	 * @generated
	 */
	public void setDbquery_portrequis(DBQuery_PortRequis newDbquery_portrequis) {
		dbquery_portrequis = newDbquery_portrequis;
	}

	/**
	 * Returns the value of the '<em><b>Securitycheck portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitycheck portrequis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitycheck portrequis</em>' containment reference.
	 * @see #setSecuritycheck_portrequis(SecurityCheck_PortRequis)
	 * @generated
	 */
	public SecurityCheck_PortRequis getSecuritycheck_portrequis() {
		return securitycheck_portrequis;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ConnectionManager_Composant#getSecuritycheck_portrequis <em>Securitycheck portrequis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securitycheck portrequis</em>' containment reference.
	 * @see #getSecuritycheck_portrequis()
	 * @generated
	 */
	public void setSecuritycheck_portrequis(SecurityCheck_PortRequis newSecuritycheck_portrequis) {
		securitycheck_portrequis = newSecuritycheck_portrequis;
	}

	/**
	 * Returns the value of the '<em><b>Externalsocket portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Externalsocket portfourni</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externalsocket portfourni</em>' containment reference.
	 * @see #setExternalsocket_portfourni(ExternalSocket_PortFourni)
	 * @generated
	 */
	public ExternalSocket_PortFourni getExternalsocket_portfourni() {
		return externalsocket_portfourni;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ConnectionManager_Composant#getExternalsocket_portfourni <em>Externalsocket portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Externalsocket portfourni</em>' containment reference.
	 * @see #getExternalsocket_portfourni()
	 * @generated
	 */
	public void setExternalsocket_portfourni(ExternalSocket_PortFourni newExternalsocket_portfourni) {
		externalsocket_portfourni = newExternalsocket_portfourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__EXTERNALSOCKET_PORTREQUIS:
				return getExternalsocket_portrequis();
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__SECURITYCHECK_PORTFOURNI:
				return getSecuritycheck_portfourni();
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__DBQUERY_PORTFOURNI:
				return getDbquery_portfourni();
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__DBQUERY_PORTREQUIS:
				return getDbquery_portrequis();
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__SECURITYCHECK_PORTREQUIS:
				return getSecuritycheck_portrequis();
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__EXTERNALSOCKET_PORTFOURNI:
				return getExternalsocket_portfourni();
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
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__EXTERNALSOCKET_PORTREQUIS:
				setExternalsocket_portrequis((ExternalSocket_PortRequis)newValue);
				return;
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__SECURITYCHECK_PORTFOURNI:
				setSecuritycheck_portfourni((SecurityCheck_PortFourni)newValue);
				return;
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__DBQUERY_PORTFOURNI:
				setDbquery_portfourni((DBQuery_PortFourni)newValue);
				return;
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__DBQUERY_PORTREQUIS:
				setDbquery_portrequis((DBQuery_PortRequis)newValue);
				return;
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__SECURITYCHECK_PORTREQUIS:
				setSecuritycheck_portrequis((SecurityCheck_PortRequis)newValue);
				return;
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__EXTERNALSOCKET_PORTFOURNI:
				setExternalsocket_portfourni((ExternalSocket_PortFourni)newValue);
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
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__EXTERNALSOCKET_PORTREQUIS:
				setExternalsocket_portrequis((ExternalSocket_PortRequis)null);
				return;
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__SECURITYCHECK_PORTFOURNI:
				setSecuritycheck_portfourni((SecurityCheck_PortFourni)null);
				return;
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__DBQUERY_PORTFOURNI:
				setDbquery_portfourni((DBQuery_PortFourni)null);
				return;
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__DBQUERY_PORTREQUIS:
				setDbquery_portrequis((DBQuery_PortRequis)null);
				return;
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__SECURITYCHECK_PORTREQUIS:
				setSecuritycheck_portrequis((SecurityCheck_PortRequis)null);
				return;
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__EXTERNALSOCKET_PORTFOURNI:
				setExternalsocket_portfourni((ExternalSocket_PortFourni)null);
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
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__EXTERNALSOCKET_PORTREQUIS:
				return externalsocket_portrequis != null;
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__SECURITYCHECK_PORTFOURNI:
				return securitycheck_portfourni != null;
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__DBQUERY_PORTFOURNI:
				return dbquery_portfourni != null;
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__DBQUERY_PORTREQUIS:
				return dbquery_portrequis != null;
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__SECURITYCHECK_PORTREQUIS:
				return securitycheck_portrequis != null;
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT__EXTERNALSOCKET_PORTFOURNI:
				return externalsocket_portfourni != null;
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
	@Override
	public void notify(PortRequisCompo portrequis, Object data) {
		if(portrequis.equals(externalsocket_portrequis)){
			LOGGER.info("Reception d'une requete par l'exterieur "+data.toString());
			data = connection(data);
			securitycheck_portfourni.notifyConfig(data);
		}else if (portrequis.equals(dbquery_portrequis)){
			LOGGER.info("Reception d'une reponse par la DB: "+data.toString());
			externalsocket_portfourni.notifyConfig(data);
		}else if(portrequis.equals(securitycheck_portrequis)){
			LOGGER.info("Reception de reponse par la le composant de securité: "+data.toString());
			externalsocket_portfourni.notifyConfig(data);
		}else{
			LOGGER.warning("mauvais port");
		}
	}
	/**
	 * @generated NOT
	 */
	@Override
	public void notify(PortFourniCompo portDestinataire, Object data) {
		/*if(portDestinataire.equals()){
			LOGGER.info("transfert de la reponse au systeme " + data.toString());
		}else if(portDestinataire.equals()){
			LOGGER.info("transfert de la reponse au connecteur "+data.toString());
		}*/
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ArrayList connection(Object data) {
		ArrayList LogedQuery = new ArrayList();
		LogedQuery.add(0, data);
		Scanner sc = new Scanner(System.in);
		LOGGER.log(Level.SEVERE,"Entrez le mot de passe");
		String str = sc.nextLine();
		LogedQuery.add(1,str);
		return LogedQuery;
	}
} // ConnectionManager_Composant
