/**
 */
package hADLM1;

import hADL.Liens.LienAttachementPFRF;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Attachement X5</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.LienAttachementX5#getDbquery_portfourni <em>Dbquery portfourni</em>}</li>
 *   <li>{@link hADLM1.LienAttachementX5#getSqlrequest_rolefrom <em>Sqlrequest rolefrom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienAttachementX5 extends LienAttachementPFRF {
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
	protected LienAttachementX5() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.LIEN_ATTACHEMENT_X5;
	}

	/**
	 * Returns the value of the '<em><b>Dbquery portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dbquery portfourni</em>' containment reference isn't clear,
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
	 * Sets the value of the '{@link hADLM1.LienAttachementX5#getDbquery_portfourni <em>Dbquery portfourni</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Sqlrequest rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sqlrequest rolefrom</em>' containment reference isn't clear,
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
	 * Sets the value of the '{@link hADLM1.LienAttachementX5#getSqlrequest_rolefrom <em>Sqlrequest rolefrom</em>}' containment reference.
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
			case HADLM1Package.LIEN_ATTACHEMENT_X5__DBQUERY_PORTFOURNI:
				return getDbquery_portfourni();
			case HADLM1Package.LIEN_ATTACHEMENT_X5__SQLREQUEST_ROLEFROM:
				return getSqlrequest_rolefrom();
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
			case HADLM1Package.LIEN_ATTACHEMENT_X5__DBQUERY_PORTFOURNI:
				setDbquery_portfourni((DBQuery_PortFourni)newValue);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_X5__SQLREQUEST_ROLEFROM:
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
			case HADLM1Package.LIEN_ATTACHEMENT_X5__DBQUERY_PORTFOURNI:
				setDbquery_portfourni((DBQuery_PortFourni)null);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_X5__SQLREQUEST_ROLEFROM:
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
			case HADLM1Package.LIEN_ATTACHEMENT_X5__DBQUERY_PORTFOURNI:
				return dbquery_portfourni != null;
			case HADLM1Package.LIEN_ATTACHEMENT_X5__SQLREQUEST_ROLEFROM:
				return sqlrequest_rolefrom != null;
		}
		return super.eIsSet(featureID);
	}

} // LienAttachementX5
