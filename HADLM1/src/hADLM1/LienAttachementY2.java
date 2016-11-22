/**
 */
package hADLM1;

import hADL.Liens.LienAttachementPRRT;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Attachement Y2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.LienAttachementY2#getQueryint_portrequis <em>Queryint portrequis</em>}</li>
 *   <li>{@link hADLM1.LienAttachementY2#getSqlrequest_roleto <em>Sqlrequest roleto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienAttachementY2 extends LienAttachementPRRT {
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
	 * The cached value of the '{@link #getSqlrequest_roleto() <em>Sqlrequest roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlrequest_roleto()
	 * @generated
	 * @ordered
	 */
	protected SQLRequest_RoleTo sqlrequest_roleto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienAttachementY2() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.LIEN_ATTACHEMENT_Y2;
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
	 * Sets the value of the '{@link hADLM1.LienAttachementY2#getQueryint_portrequis <em>Queryint portrequis</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Sqlrequest roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sqlrequest roleto</em>' containment reference isn't clear,
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
	 * Sets the value of the '{@link hADLM1.LienAttachementY2#getSqlrequest_roleto <em>Sqlrequest roleto</em>}' containment reference.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.LIEN_ATTACHEMENT_Y2__QUERYINT_PORTREQUIS:
				return getQueryint_portrequis();
			case HADLM1Package.LIEN_ATTACHEMENT_Y2__SQLREQUEST_ROLETO:
				return getSqlrequest_roleto();
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
			case HADLM1Package.LIEN_ATTACHEMENT_Y2__QUERYINT_PORTREQUIS:
				setQueryint_portrequis((QueryInt_PortRequis)newValue);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_Y2__SQLREQUEST_ROLETO:
				setSqlrequest_roleto((SQLRequest_RoleTo)newValue);
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
			case HADLM1Package.LIEN_ATTACHEMENT_Y2__QUERYINT_PORTREQUIS:
				setQueryint_portrequis((QueryInt_PortRequis)null);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_Y2__SQLREQUEST_ROLETO:
				setSqlrequest_roleto((SQLRequest_RoleTo)null);
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
			case HADLM1Package.LIEN_ATTACHEMENT_Y2__QUERYINT_PORTREQUIS:
				return queryint_portrequis != null;
			case HADLM1Package.LIEN_ATTACHEMENT_Y2__SQLREQUEST_ROLETO:
				return sqlrequest_roleto != null;
		}
		return super.eIsSet(featureID);
	}

} // LienAttachementY2
