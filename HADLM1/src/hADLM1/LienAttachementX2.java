/**
 */
package hADLM1;

import hADL.Liens.LienAttachementPFRF;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Attachement X2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.LienAttachementX2#getQueryint_portfourni <em>Queryint portfourni</em>}</li>
 *   <li>{@link hADLM1.LienAttachementX2#getSqlrequest_rolefrom <em>Sqlrequest rolefrom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienAttachementX2 extends LienAttachementPFRF {
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
	protected LienAttachementX2() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.LIEN_ATTACHEMENT_X2;
	}

	/**
	 * Returns the value of the '<em><b>Queryint portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queryint portfourni</em>' containment reference isn't clear,
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
	 * Sets the value of the '{@link hADLM1.LienAttachementX2#getQueryint_portfourni <em>Queryint portfourni</em>}' containment reference.
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
	 * Sets the value of the '{@link hADLM1.LienAttachementX2#getSqlrequest_rolefrom <em>Sqlrequest rolefrom</em>}' containment reference.
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
			case HADLM1Package.LIEN_ATTACHEMENT_X2__QUERYINT_PORTFOURNI:
				return getQueryint_portfourni();
			case HADLM1Package.LIEN_ATTACHEMENT_X2__SQLREQUEST_ROLEFROM:
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
			case HADLM1Package.LIEN_ATTACHEMENT_X2__QUERYINT_PORTFOURNI:
				setQueryint_portfourni((QueryInt_PortFourni)newValue);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_X2__SQLREQUEST_ROLEFROM:
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
			case HADLM1Package.LIEN_ATTACHEMENT_X2__QUERYINT_PORTFOURNI:
				setQueryint_portfourni((QueryInt_PortFourni)null);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_X2__SQLREQUEST_ROLEFROM:
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
			case HADLM1Package.LIEN_ATTACHEMENT_X2__QUERYINT_PORTFOURNI:
				return queryint_portfourni != null;
			case HADLM1Package.LIEN_ATTACHEMENT_X2__SQLREQUEST_ROLEFROM:
				return sqlrequest_rolefrom != null;
		}
		return super.eIsSet(featureID);
	}

} // LienAttachementX2
