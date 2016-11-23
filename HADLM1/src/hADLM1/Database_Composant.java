/**
 */
package hADLM1;

import hADL.Composant.Composant;
import hADL.Interfaces.PortRequisCompo;

import java.util.HashMap;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.Database_Composant#getQueryint_portrequis <em>Queryint portrequis</em>}</li>
 *   <li>{@link hADLM1.Database_Composant#getSecuritymanagement_portrequis <em>Securitymanagement portrequis</em>}</li>
 *   <li>{@link hADLM1.Database_Composant#getQueryint_portfourni <em>Queryint portfourni</em>}</li>
 *   <li>{@link hADLM1.Database_Composant#getSecuritymanagement_portfourni <em>Securitymanagement portfourni</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Database_Composant extends Composant {
	/**
	 * @generated NOT
	 */
	private static final Logger LOGGER = Logger.getAnonymousLogger();
	/**
	 * The cached value of the '{@link #getQueryint_portrequis() <em>Queryint portrequis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryint_portrequis()
	 * @generated
	 * @ordered
	 */
	protected QueryInt_PortRequis queryint_portrequis;

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
	 * The cached value of the '{@link #getQueryint_portfourni() <em>Queryint portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryint_portfourni()
	 * @generated
	 * @ordered
	 */
	protected QueryInt_PortFourni queryint_portfourni;

	/**
	 * The cached value of the '{@link #getSecuritymanagement_portfourni() <em>Securitymanagement portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritymanagement_portfourni()
	 * @generated
	 * @ordered
	 */
	protected SecurityManagement_PortFourni securitymanagement_portfourni;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Database_Composant() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.DATABASE_COMPOSANT;
	}

	/**
	 * Returns the value of the '<em><b>Queryint portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queryint portrequis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queryint portrequis</em>' containment reference.
	 * @see #setQueryint_portrequis(QueryInt_PortRequis)
	 * @generated
	 */
	public QueryInt_PortRequis getQueryint_portrequis() {
		return queryint_portrequis;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Database_Composant#getQueryint_portrequis <em>Queryint portrequis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queryint portrequis</em>' containment reference.
	 * @see #getQueryint_portrequis()
	 * @generated
	 */
	public void setQueryint_portrequis(QueryInt_PortRequis newQueryint_portrequis) {
		queryint_portrequis = newQueryint_portrequis;
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
	 * Sets the value of the '{@link hADLM1.Database_Composant#getSecuritymanagement_portrequis <em>Securitymanagement portrequis</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Queryint portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queryint portfourni</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queryint portfourni</em>' containment reference.
	 * @see #setQueryint_portfourni(QueryInt_PortFourni)
	 * @generated
	 */
	public QueryInt_PortFourni getQueryint_portfourni() {
		return queryint_portfourni;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Database_Composant#getQueryint_portfourni <em>Queryint portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queryint portfourni</em>' containment reference.
	 * @see #getQueryint_portfourni()
	 * @generated
	 */
	public void setQueryint_portfourni(QueryInt_PortFourni newQueryint_portfourni) {
		queryint_portfourni = newQueryint_portfourni;
	}

	/**
	 * Returns the value of the '<em><b>Securitymanagement portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitymanagement portfourni</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitymanagement portfourni</em>' containment reference.
	 * @see #setSecuritymanagement_portfourni(SecurityManagement_PortFourni)
	 * @generated
	 */
	public SecurityManagement_PortFourni getSecuritymanagement_portfourni() {
		return securitymanagement_portfourni;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Database_Composant#getSecuritymanagement_portfourni <em>Securitymanagement portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securitymanagement portfourni</em>' containment reference.
	 * @see #getSecuritymanagement_portfourni()
	 * @generated
	 */
	public void setSecuritymanagement_portfourni(SecurityManagement_PortFourni newSecuritymanagement_portfourni) {
		securitymanagement_portfourni = newSecuritymanagement_portfourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.DATABASE_COMPOSANT__QUERYINT_PORTREQUIS:
				return getQueryint_portrequis();
			case HADLM1Package.DATABASE_COMPOSANT__SECURITYMANAGEMENT_PORTREQUIS:
				return getSecuritymanagement_portrequis();
			case HADLM1Package.DATABASE_COMPOSANT__QUERYINT_PORTFOURNI:
				return getQueryint_portfourni();
			case HADLM1Package.DATABASE_COMPOSANT__SECURITYMANAGEMENT_PORTFOURNI:
				return getSecuritymanagement_portfourni();
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
			case HADLM1Package.DATABASE_COMPOSANT__QUERYINT_PORTREQUIS:
				setQueryint_portrequis((QueryInt_PortRequis)newValue);
				return;
			case HADLM1Package.DATABASE_COMPOSANT__SECURITYMANAGEMENT_PORTREQUIS:
				setSecuritymanagement_portrequis((SecurityManagement_PortRequis)newValue);
				return;
			case HADLM1Package.DATABASE_COMPOSANT__QUERYINT_PORTFOURNI:
				setQueryint_portfourni((QueryInt_PortFourni)newValue);
				return;
			case HADLM1Package.DATABASE_COMPOSANT__SECURITYMANAGEMENT_PORTFOURNI:
				setSecuritymanagement_portfourni((SecurityManagement_PortFourni)newValue);
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
			case HADLM1Package.DATABASE_COMPOSANT__QUERYINT_PORTREQUIS:
				setQueryint_portrequis((QueryInt_PortRequis)null);
				return;
			case HADLM1Package.DATABASE_COMPOSANT__SECURITYMANAGEMENT_PORTREQUIS:
				setSecuritymanagement_portrequis((SecurityManagement_PortRequis)null);
				return;
			case HADLM1Package.DATABASE_COMPOSANT__QUERYINT_PORTFOURNI:
				setQueryint_portfourni((QueryInt_PortFourni)null);
				return;
			case HADLM1Package.DATABASE_COMPOSANT__SECURITYMANAGEMENT_PORTFOURNI:
				setSecuritymanagement_portfourni((SecurityManagement_PortFourni)null);
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
			case HADLM1Package.DATABASE_COMPOSANT__QUERYINT_PORTREQUIS:
				return queryint_portrequis != null;
			case HADLM1Package.DATABASE_COMPOSANT__SECURITYMANAGEMENT_PORTREQUIS:
				return securitymanagement_portrequis != null;
			case HADLM1Package.DATABASE_COMPOSANT__QUERYINT_PORTFOURNI:
				return queryint_portfourni != null;
			case HADLM1Package.DATABASE_COMPOSANT__SECURITYMANAGEMENT_PORTFOURNI:
				return securitymanagement_portfourni != null;
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object getResultRequest(Object data){
		//Bouchon de la base
	    HashMap<String, String> db = new HashMap<String, String>();
	    db.put("key1", "value1");
	    db.put("key2", "value2");
	    db.put("key3", "value3");
	    LOGGER.info("interoggation de la BD");
	    Object res = db.get(data);
	    if (res != null) {
	    	LOGGER.info("correspondance trouvée : " + res);
	    } else {
	    	LOGGER.info("La requête n'a pas de reponse");
	    }
	    return res;
	}
} // Database_Composant
