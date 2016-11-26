/**
 */
package hADLM1;

import hADL.Connecteurs.ConnecteurExplicite;
import hADL.Roles.RoleFrom;
import java.util.logging.Logger;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clearence Request Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.ClearenceRequest_Connector#getClearencerequest_roleto <em>Clearencerequest roleto</em>}</li>
 *   <li>{@link hADLM1.ClearenceRequest_Connector#getClearencerequest_rolefrom <em>Clearencerequest rolefrom</em>}</li>
 *   <li>{@link hADLM1.ClearenceRequest_Connector#getRetourclearencerequest_rolefrom <em>Retourclearencerequest rolefrom</em>}</li>
 *   <li>{@link hADLM1.ClearenceRequest_Connector#getRetourclearencerequest_roleto <em>Retourclearencerequest roleto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClearenceRequest_Connector extends ConnecteurExplicite {
	/**
	 * The cached value of the '{@link #getClearencerequest_roleto() <em>Clearencerequest roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearencerequest_roleto()
	 * @generated
	 * @ordered
	 */
	protected ClearenceRequest_RoleTo clearencerequest_roleto;

	/**
	 * The cached value of the '{@link #getClearencerequest_rolefrom() <em>Clearencerequest rolefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearencerequest_rolefrom()
	 * @generated
	 * @ordered
	 */
	protected ClearenceRequest_RoleFrom clearencerequest_rolefrom;

	/**
	 * The cached value of the '{@link #getRetourclearencerequest_rolefrom() <em>Retourclearencerequest rolefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetourclearencerequest_rolefrom()
	 * @generated
	 * @ordered
	 */
	protected RetourClearenceRequest_RoleFrom retourclearencerequest_rolefrom;

	/**
	 * The cached value of the '{@link #getRetourclearencerequest_roleto() <em>Retourclearencerequest roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetourclearencerequest_roleto()
	 * @generated
	 * @ordered
	 */
	protected RetourClearenceRequest_RoleTo retourclearencerequest_roleto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClearenceRequest_Connector() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.CLEARENCE_REQUEST_CONNECTOR;
	}

	/**
	 * Returns the value of the '<em><b>Clearencerequest roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clearencerequest roleto</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clearencerequest roleto</em>' containment reference.
	 * @see #setClearencerequest_roleto(ClearenceRequest_RoleTo)
	 * @generated
	 */
	public ClearenceRequest_RoleTo getClearencerequest_roleto() {
		return clearencerequest_roleto;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ClearenceRequest_Connector#getClearencerequest_roleto <em>Clearencerequest roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clearencerequest roleto</em>' containment reference.
	 * @see #getClearencerequest_roleto()
	 * @generated
	 */
	public void setClearencerequest_roleto(ClearenceRequest_RoleTo newClearencerequest_roleto) {
		clearencerequest_roleto = newClearencerequest_roleto;
	}

	/**
	 * Returns the value of the '<em><b>Clearencerequest rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clearencerequest rolefrom</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clearencerequest rolefrom</em>' containment reference.
	 * @see #setClearencerequest_rolefrom(ClearenceRequest_RoleFrom)
	 * @generated
	 */
	public ClearenceRequest_RoleFrom getClearencerequest_rolefrom() {
		return clearencerequest_rolefrom;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ClearenceRequest_Connector#getClearencerequest_rolefrom <em>Clearencerequest rolefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clearencerequest rolefrom</em>' containment reference.
	 * @see #getClearencerequest_rolefrom()
	 * @generated
	 */
	public void setClearencerequest_rolefrom(ClearenceRequest_RoleFrom newClearencerequest_rolefrom) {
		clearencerequest_rolefrom = newClearencerequest_rolefrom;
	}

	/**
	 * Returns the value of the '<em><b>Retourclearencerequest rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retourclearencerequest rolefrom</em>' containment reference.
	 * @see #setRetourclearencerequest_rolefrom(RetourClearenceRequest_RoleFrom)
	 * @generated
	 */
	public RetourClearenceRequest_RoleFrom getRetourclearencerequest_rolefrom() {
		return retourclearencerequest_rolefrom;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ClearenceRequest_Connector#getRetourclearencerequest_rolefrom <em>Retourclearencerequest rolefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retourclearencerequest rolefrom</em>' containment reference.
	 * @see #getRetourclearencerequest_rolefrom()
	 * @generated
	 */
	public void setRetourclearencerequest_rolefrom(RetourClearenceRequest_RoleFrom newRetourclearencerequest_rolefrom) {
		retourclearencerequest_rolefrom = newRetourclearencerequest_rolefrom;
	}

	/**
	 * Returns the value of the '<em><b>Retourclearencerequest roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retourclearencerequest roleto</em>' containment reference.
	 * @see #setRetourclearencerequest_roleto(RetourClearenceRequest_RoleTo)
	 * @generated
	 */
	public RetourClearenceRequest_RoleTo getRetourclearencerequest_roleto() {
		return retourclearencerequest_roleto;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ClearenceRequest_Connector#getRetourclearencerequest_roleto <em>Retourclearencerequest roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retourclearencerequest roleto</em>' containment reference.
	 * @see #getRetourclearencerequest_roleto()
	 * @generated
	 */
	public void setRetourclearencerequest_roleto(RetourClearenceRequest_RoleTo newRetourclearencerequest_roleto) {
		retourclearencerequest_roleto = newRetourclearencerequest_roleto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.CLEARENCE_REQUEST_CONNECTOR__CLEARENCEREQUEST_ROLETO:
				return getClearencerequest_roleto();
			case HADLM1Package.CLEARENCE_REQUEST_CONNECTOR__CLEARENCEREQUEST_ROLEFROM:
				return getClearencerequest_rolefrom();
			case HADLM1Package.CLEARENCE_REQUEST_CONNECTOR__RETOURCLEARENCEREQUEST_ROLEFROM:
				return getRetourclearencerequest_rolefrom();
			case HADLM1Package.CLEARENCE_REQUEST_CONNECTOR__RETOURCLEARENCEREQUEST_ROLETO:
				return getRetourclearencerequest_roleto();
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
			case HADLM1Package.CLEARENCE_REQUEST_CONNECTOR__CLEARENCEREQUEST_ROLETO:
				setClearencerequest_roleto((ClearenceRequest_RoleTo)newValue);
				return;
			case HADLM1Package.CLEARENCE_REQUEST_CONNECTOR__CLEARENCEREQUEST_ROLEFROM:
				setClearencerequest_rolefrom((ClearenceRequest_RoleFrom)newValue);
				return;
			case HADLM1Package.CLEARENCE_REQUEST_CONNECTOR__RETOURCLEARENCEREQUEST_ROLEFROM:
				setRetourclearencerequest_rolefrom((RetourClearenceRequest_RoleFrom)newValue);
				return;
			case HADLM1Package.CLEARENCE_REQUEST_CONNECTOR__RETOURCLEARENCEREQUEST_ROLETO:
				setRetourclearencerequest_roleto((RetourClearenceRequest_RoleTo)newValue);
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
			case HADLM1Package.CLEARENCE_REQUEST_CONNECTOR__CLEARENCEREQUEST_ROLETO:
				setClearencerequest_roleto((ClearenceRequest_RoleTo)null);
				return;
			case HADLM1Package.CLEARENCE_REQUEST_CONNECTOR__CLEARENCEREQUEST_ROLEFROM:
				setClearencerequest_rolefrom((ClearenceRequest_RoleFrom)null);
				return;
			case HADLM1Package.CLEARENCE_REQUEST_CONNECTOR__RETOURCLEARENCEREQUEST_ROLEFROM:
				setRetourclearencerequest_rolefrom((RetourClearenceRequest_RoleFrom)null);
				return;
			case HADLM1Package.CLEARENCE_REQUEST_CONNECTOR__RETOURCLEARENCEREQUEST_ROLETO:
				setRetourclearencerequest_roleto((RetourClearenceRequest_RoleTo)null);
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
			case HADLM1Package.CLEARENCE_REQUEST_CONNECTOR__CLEARENCEREQUEST_ROLETO:
				return clearencerequest_roleto != null;
			case HADLM1Package.CLEARENCE_REQUEST_CONNECTOR__CLEARENCEREQUEST_ROLEFROM:
				return clearencerequest_rolefrom != null;
			case HADLM1Package.CLEARENCE_REQUEST_CONNECTOR__RETOURCLEARENCEREQUEST_ROLEFROM:
				return retourclearencerequest_rolefrom != null;
			case HADLM1Package.CLEARENCE_REQUEST_CONNECTOR__RETOURCLEARENCEREQUEST_ROLETO:
				return retourclearencerequest_roleto != null;
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
		if(clearencerequest_rolefrom.equals(roleFrom)){
			LOGGER.info("ConnectionManager -> SecurityManager");
			clearencerequest_roleto.notifyConfig(data);
		}else{
			LOGGER.warning("mauvais role");
		}
		
	}

} // ClearenceRequest_Connector
