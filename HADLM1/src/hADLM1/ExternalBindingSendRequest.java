/**
 */
package hADLM1;

import hADL.Liens.LienBindingRequis;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Binding Send Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.ExternalBindingSendRequest#getSendrequest_portrequisconfig <em>Sendrequest portrequisconfig</em>}</li>
 *   <li>{@link hADLM1.ExternalBindingSendRequest#getExternalportrequisclientsendrequest <em>Externalportrequisclientsendrequest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalBindingSendRequest extends LienBindingRequis {
	/**
	 * The cached value of the '{@link #getSendrequest_portrequisconfig() <em>Sendrequest portrequisconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendrequest_portrequisconfig()
	 * @generated
	 * @ordered
	 */
	protected SendRequest_PortRequisConfig sendrequest_portrequisconfig;

	/**
	 * The cached value of the '{@link #getExternalportrequisclientsendrequest() <em>Externalportrequisclientsendrequest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalportrequisclientsendrequest()
	 * @generated
	 * @ordered
	 */
	protected ExternalPortRequisClientSendRequest externalportrequisclientsendrequest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalBindingSendRequest() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.EXTERNAL_BINDING_SEND_REQUEST;
	}

	/**
	 * Returns the value of the '<em><b>Sendrequest portrequisconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sendrequest portrequisconfig</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sendrequest portrequisconfig</em>' containment reference.
	 * @see #setSendrequest_portrequisconfig(SendRequest_PortRequisConfig)
	 * @generated
	 */
	public SendRequest_PortRequisConfig getSendrequest_portrequisconfig() {
		return sendrequest_portrequisconfig;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ExternalBindingSendRequest#getSendrequest_portrequisconfig <em>Sendrequest portrequisconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sendrequest portrequisconfig</em>' containment reference.
	 * @see #getSendrequest_portrequisconfig()
	 * @generated
	 */
	public void setSendrequest_portrequisconfig(SendRequest_PortRequisConfig newSendrequest_portrequisconfig) {
		sendrequest_portrequisconfig = newSendrequest_portrequisconfig;
	}

	/**
	 * Returns the value of the '<em><b>Externalportrequisclientsendrequest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Externalportrequisclientsendrequest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externalportrequisclientsendrequest</em>' containment reference.
	 * @see #setExternalportrequisclientsendrequest(ExternalPortRequisClientSendRequest)
	 * @generated
	 */
	public ExternalPortRequisClientSendRequest getExternalportrequisclientsendrequest() {
		return externalportrequisclientsendrequest;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ExternalBindingSendRequest#getExternalportrequisclientsendrequest <em>Externalportrequisclientsendrequest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Externalportrequisclientsendrequest</em>' containment reference.
	 * @see #getExternalportrequisclientsendrequest()
	 * @generated
	 */
	public void setExternalportrequisclientsendrequest(ExternalPortRequisClientSendRequest newExternalportrequisclientsendrequest) {
		externalportrequisclientsendrequest = newExternalportrequisclientsendrequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.EXTERNAL_BINDING_SEND_REQUEST__SENDREQUEST_PORTREQUISCONFIG:
				return getSendrequest_portrequisconfig();
			case HADLM1Package.EXTERNAL_BINDING_SEND_REQUEST__EXTERNALPORTREQUISCLIENTSENDREQUEST:
				return getExternalportrequisclientsendrequest();
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
			case HADLM1Package.EXTERNAL_BINDING_SEND_REQUEST__SENDREQUEST_PORTREQUISCONFIG:
				setSendrequest_portrequisconfig((SendRequest_PortRequisConfig)newValue);
				return;
			case HADLM1Package.EXTERNAL_BINDING_SEND_REQUEST__EXTERNALPORTREQUISCLIENTSENDREQUEST:
				setExternalportrequisclientsendrequest((ExternalPortRequisClientSendRequest)newValue);
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
			case HADLM1Package.EXTERNAL_BINDING_SEND_REQUEST__SENDREQUEST_PORTREQUISCONFIG:
				setSendrequest_portrequisconfig((SendRequest_PortRequisConfig)null);
				return;
			case HADLM1Package.EXTERNAL_BINDING_SEND_REQUEST__EXTERNALPORTREQUISCLIENTSENDREQUEST:
				setExternalportrequisclientsendrequest((ExternalPortRequisClientSendRequest)null);
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
			case HADLM1Package.EXTERNAL_BINDING_SEND_REQUEST__SENDREQUEST_PORTREQUISCONFIG:
				return sendrequest_portrequisconfig != null;
			case HADLM1Package.EXTERNAL_BINDING_SEND_REQUEST__EXTERNALPORTREQUISCLIENTSENDREQUEST:
				return externalportrequisclientsendrequest != null;
		}
		return super.eIsSet(featureID);
	}

} // ExternalBindingSendRequest
