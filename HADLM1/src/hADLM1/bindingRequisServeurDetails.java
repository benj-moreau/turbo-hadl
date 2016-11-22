/**
 */
package hADLM1;

import hADL.Liens.LienBindingRequis;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>binding Requis Serveur Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.bindingRequisServeurDetails#getReceive_request_portrequiscompo <em>Receive request portrequiscompo</em>}</li>
 *   <li>{@link hADLM1.bindingRequisServeurDetails#getExternalsocket_portrequis <em>Externalsocket portrequis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class bindingRequisServeurDetails extends LienBindingRequis {
	/**
	 * The cached value of the '{@link #getReceive_request_portrequiscompo() <em>Receive request portrequiscompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceive_request_portrequiscompo()
	 * @generated
	 * @ordered
	 */
	protected ReceiveRequestRequisConfig receive_request_portrequiscompo;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected bindingRequisServeurDetails() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.BINDING_REQUIS_SERVEUR_DETAILS;
	}

	/**
	 * Returns the value of the '<em><b>Receive request portrequiscompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive request portrequiscompo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive request portrequiscompo</em>' containment reference.
	 * @see #setReceive_request_portrequiscompo(ReceiveRequestRequisConfig)
	 * @generated
	 */
	public ReceiveRequestRequisConfig getReceive_request_portrequiscompo() {
		return receive_request_portrequiscompo;
	}

	/**
	 * Sets the value of the '{@link hADLM1.bindingRequisServeurDetails#getReceive_request_portrequiscompo <em>Receive request portrequiscompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive request portrequiscompo</em>' containment reference.
	 * @see #getReceive_request_portrequiscompo()
	 * @generated
	 */
	public void setReceive_request_portrequiscompo(ReceiveRequestRequisConfig newReceive_request_portrequiscompo) {
		receive_request_portrequiscompo = newReceive_request_portrequiscompo;
	}

	/**
	 * Returns the value of the '<em><b>Externalsocket portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Externalsocket portrequis</em>' containment reference isn't clear,
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
	 * Sets the value of the '{@link hADLM1.bindingRequisServeurDetails#getExternalsocket_portrequis <em>Externalsocket portrequis</em>}' containment reference.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.BINDING_REQUIS_SERVEUR_DETAILS__RECEIVE_REQUEST_PORTREQUISCOMPO:
				return getReceive_request_portrequiscompo();
			case HADLM1Package.BINDING_REQUIS_SERVEUR_DETAILS__EXTERNALSOCKET_PORTREQUIS:
				return getExternalsocket_portrequis();
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
			case HADLM1Package.BINDING_REQUIS_SERVEUR_DETAILS__RECEIVE_REQUEST_PORTREQUISCOMPO:
				setReceive_request_portrequiscompo((ReceiveRequestRequisConfig)newValue);
				return;
			case HADLM1Package.BINDING_REQUIS_SERVEUR_DETAILS__EXTERNALSOCKET_PORTREQUIS:
				setExternalsocket_portrequis((ExternalSocket_PortRequis)newValue);
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
			case HADLM1Package.BINDING_REQUIS_SERVEUR_DETAILS__RECEIVE_REQUEST_PORTREQUISCOMPO:
				setReceive_request_portrequiscompo((ReceiveRequestRequisConfig)null);
				return;
			case HADLM1Package.BINDING_REQUIS_SERVEUR_DETAILS__EXTERNALSOCKET_PORTREQUIS:
				setExternalsocket_portrequis((ExternalSocket_PortRequis)null);
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
			case HADLM1Package.BINDING_REQUIS_SERVEUR_DETAILS__RECEIVE_REQUEST_PORTREQUISCOMPO:
				return receive_request_portrequiscompo != null;
			case HADLM1Package.BINDING_REQUIS_SERVEUR_DETAILS__EXTERNALSOCKET_PORTREQUIS:
				return externalsocket_portrequis != null;
		}
		return super.eIsSet(featureID);
	}

} // bindingRequisServeurDetails
