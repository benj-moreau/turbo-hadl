/**
 */
package hADLM1;

import hADL.Connecteurs.ConnecteurExplicite;
import hADL.Roles.RoleFrom;

import java.util.logging.Logger;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQL Request Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.SQLRequest_Connector#getSqlrequest_roleto <em>Sqlrequest roleto</em>}</li>
 *   <li>{@link hADLM1.SQLRequest_Connector#getSqlrequest_rolefrom <em>Sqlrequest rolefrom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SQLRequest_Connector extends ConnecteurExplicite {
	/**
	 * The cached value of the '{@link #getSqlrequest_roleto() <em>Sqlrequest roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlrequest_roleto()
	 * @generated
	 * @ordered
	 */
	protected SQLRequest_RoleTo sqlrequest_roleto;

	/**
	 * The cached value of the '{@link #getSqlrequest_rolefrom() <em>Sqlrequest rolefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlrequest_rolefrom()
	 * @generated
	 * @ordered
	 */
	protected SQLRequest_RoleFrom sqlrequest_rolefrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SQLRequest_Connector() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.SQL_REQUEST_CONNECTOR;
	}

	/**
	 * Returns the value of the '<em><b>Sqlrequest roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sqlrequest roleto</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sqlrequest roleto</em>' containment reference.
	 * @see #setSqlrequest_roleto(SQLRequest_RoleTo)
	 * @generated
	 */
	public SQLRequest_RoleTo getSqlrequest_roleto() {
		return sqlrequest_roleto;
	}

	/**
	 * Sets the value of the '{@link hADLM1.SQLRequest_Connector#getSqlrequest_roleto <em>Sqlrequest roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sqlrequest roleto</em>' containment reference.
	 * @see #getSqlrequest_roleto()
	 * @generated
	 */
	public void setSqlrequest_roleto(SQLRequest_RoleTo newSqlrequest_roleto) {
		sqlrequest_roleto = newSqlrequest_roleto;
	}

	/**
	 * Returns the value of the '<em><b>Sqlrequest rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sqlrequest rolefrom</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sqlrequest rolefrom</em>' containment reference.
	 * @see #setSqlrequest_rolefrom(SQLRequest_RoleFrom)
	 * @generated
	 */
	public SQLRequest_RoleFrom getSqlrequest_rolefrom() {
		return sqlrequest_rolefrom;
	}

	/**
	 * Sets the value of the '{@link hADLM1.SQLRequest_Connector#getSqlrequest_rolefrom <em>Sqlrequest rolefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sqlrequest rolefrom</em>' containment reference.
	 * @see #getSqlrequest_rolefrom()
	 * @generated
	 */
	public void setSqlrequest_rolefrom(SQLRequest_RoleFrom newSqlrequest_rolefrom) {
		sqlrequest_rolefrom = newSqlrequest_rolefrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.SQL_REQUEST_CONNECTOR__SQLREQUEST_ROLETO:
				return getSqlrequest_roleto();
			case HADLM1Package.SQL_REQUEST_CONNECTOR__SQLREQUEST_ROLEFROM:
				return getSqlrequest_rolefrom();
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
			case HADLM1Package.SQL_REQUEST_CONNECTOR__SQLREQUEST_ROLETO:
				setSqlrequest_roleto((SQLRequest_RoleTo)newValue);
				return;
			case HADLM1Package.SQL_REQUEST_CONNECTOR__SQLREQUEST_ROLEFROM:
				setSqlrequest_rolefrom((SQLRequest_RoleFrom)newValue);
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
			case HADLM1Package.SQL_REQUEST_CONNECTOR__SQLREQUEST_ROLETO:
				setSqlrequest_roleto((SQLRequest_RoleTo)null);
				return;
			case HADLM1Package.SQL_REQUEST_CONNECTOR__SQLREQUEST_ROLEFROM:
				setSqlrequest_rolefrom((SQLRequest_RoleFrom)null);
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
			case HADLM1Package.SQL_REQUEST_CONNECTOR__SQLREQUEST_ROLETO:
				return sqlrequest_roleto != null;
			case HADLM1Package.SQL_REQUEST_CONNECTOR__SQLREQUEST_ROLEFROM:
				return sqlrequest_rolefrom != null;
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
		if(sqlrequest_rolefrom.equals(roleFrom)){
			LOGGER.info("DB -> Connection Manager");
			sqlrequest_roleto.notifyConfig(data);
			
		}else{
			LOGGER.warning("mauvais role");
		}
		
	}
} // SQLRequest_Connector
