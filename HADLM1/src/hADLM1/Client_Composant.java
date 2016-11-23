/**
 */
package hADLM1;

import hADL.Composant.Composant;
import hADL.Interfaces.PortFourniCompo;
import hADL.Interfaces.PortRequisCompo;

import java.util.logging.Logger;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.Client_Composant#getSend_request_port <em>Send request port</em>}</li>
 *   <li>{@link hADLM1.Client_Composant#getAnswerrequest_portrequiscompo <em>Answerrequest portrequiscompo</em>}</li>
 *   <li>{@link hADLM1.Client_Composant#getExternalportfourniclientanswerrequest <em>Externalportfourniclientanswerrequest</em>}</li>
 *   <li>{@link hADLM1.Client_Composant#getExternalportrequisclientsendrequest <em>Externalportrequisclientsendrequest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Client_Composant extends Composant {
	private static final Logger LOGGER = Logger.getAnonymousLogger();
	/**
	 * The cached value of the '{@link #getSend_request_port() <em>Send request port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSend_request_port()
	 * @generated
	 * @ordered
	 */
	protected Send_request_PortFourniCompo send_request_port;

	/**
	 * The cached value of the '{@link #getAnswerrequest_portrequiscompo() <em>Answerrequest portrequiscompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerrequest_portrequiscompo()
	 * @generated
	 * @ordered
	 */
	protected AnswerRequest_PortRequisCompo answerrequest_portrequiscompo;

	/**
	 * The cached value of the '{@link #getExternalportfourniclientanswerrequest() <em>Externalportfourniclientanswerrequest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalportfourniclientanswerrequest()
	 * @generated
	 * @ordered
	 */
	protected ExternalPortFourniClientAnswerRequest externalportfourniclientanswerrequest;

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
	protected Client_Composant() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.CLIENT_COMPOSANT;
	}

	/**
	 * Returns the value of the '<em><b>Send request port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send request port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send request port</em>' containment reference.
	 * @see #setSend_request_port(Send_request_PortFourniCompo)
	 * @generated
	 */
	public Send_request_PortFourniCompo getSend_request_port() {
		return send_request_port;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Client_Composant#getSend_request_port <em>Send request port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send request port</em>' containment reference.
	 * @see #getSend_request_port()
	 * @generated
	 */
	public void setSend_request_port(Send_request_PortFourniCompo newSend_request_port) {
		send_request_port = newSend_request_port;
	}

	/**
	 * Returns the value of the '<em><b>Answerrequest portrequiscompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answerrequest portrequiscompo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answerrequest portrequiscompo</em>' containment reference.
	 * @see #setAnswerrequest_portrequiscompo(AnswerRequest_PortRequisCompo)
	 * @generated
	 */
	public AnswerRequest_PortRequisCompo getAnswerrequest_portrequiscompo() {
		return answerrequest_portrequiscompo;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Client_Composant#getAnswerrequest_portrequiscompo <em>Answerrequest portrequiscompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answerrequest portrequiscompo</em>' containment reference.
	 * @see #getAnswerrequest_portrequiscompo()
	 * @generated
	 */
	public void setAnswerrequest_portrequiscompo(AnswerRequest_PortRequisCompo newAnswerrequest_portrequiscompo) {
		answerrequest_portrequiscompo = newAnswerrequest_portrequiscompo;
	}

	/**
	 * Returns the value of the '<em><b>Externalportfourniclientanswerrequest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Externalportfourniclientanswerrequest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externalportfourniclientanswerrequest</em>' containment reference.
	 * @see #setExternalportfourniclientanswerrequest(ExternalPortFourniClientAnswerRequest)
	 * @generated
	 */
	public ExternalPortFourniClientAnswerRequest getExternalportfourniclientanswerrequest() {
		return externalportfourniclientanswerrequest;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Client_Composant#getExternalportfourniclientanswerrequest <em>Externalportfourniclientanswerrequest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Externalportfourniclientanswerrequest</em>' containment reference.
	 * @see #getExternalportfourniclientanswerrequest()
	 * @generated
	 */
	public void setExternalportfourniclientanswerrequest(ExternalPortFourniClientAnswerRequest newExternalportfourniclientanswerrequest) {
		externalportfourniclientanswerrequest = newExternalportfourniclientanswerrequest;
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
	 * Sets the value of the '{@link hADLM1.Client_Composant#getExternalportrequisclientsendrequest <em>Externalportrequisclientsendrequest</em>}' containment reference.
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
			case HADLM1Package.CLIENT_COMPOSANT__SEND_REQUEST_PORT:
				return getSend_request_port();
			case HADLM1Package.CLIENT_COMPOSANT__ANSWERREQUEST_PORTREQUISCOMPO:
				return getAnswerrequest_portrequiscompo();
			case HADLM1Package.CLIENT_COMPOSANT__EXTERNALPORTFOURNICLIENTANSWERREQUEST:
				return getExternalportfourniclientanswerrequest();
			case HADLM1Package.CLIENT_COMPOSANT__EXTERNALPORTREQUISCLIENTSENDREQUEST:
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
			case HADLM1Package.CLIENT_COMPOSANT__SEND_REQUEST_PORT:
				setSend_request_port((Send_request_PortFourniCompo)newValue);
				return;
			case HADLM1Package.CLIENT_COMPOSANT__ANSWERREQUEST_PORTREQUISCOMPO:
				setAnswerrequest_portrequiscompo((AnswerRequest_PortRequisCompo)newValue);
				return;
			case HADLM1Package.CLIENT_COMPOSANT__EXTERNALPORTFOURNICLIENTANSWERREQUEST:
				setExternalportfourniclientanswerrequest((ExternalPortFourniClientAnswerRequest)newValue);
				return;
			case HADLM1Package.CLIENT_COMPOSANT__EXTERNALPORTREQUISCLIENTSENDREQUEST:
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
			case HADLM1Package.CLIENT_COMPOSANT__SEND_REQUEST_PORT:
				setSend_request_port((Send_request_PortFourniCompo)null);
				return;
			case HADLM1Package.CLIENT_COMPOSANT__ANSWERREQUEST_PORTREQUISCOMPO:
				setAnswerrequest_portrequiscompo((AnswerRequest_PortRequisCompo)null);
				return;
			case HADLM1Package.CLIENT_COMPOSANT__EXTERNALPORTFOURNICLIENTANSWERREQUEST:
				setExternalportfourniclientanswerrequest((ExternalPortFourniClientAnswerRequest)null);
				return;
			case HADLM1Package.CLIENT_COMPOSANT__EXTERNALPORTREQUISCLIENTSENDREQUEST:
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
			case HADLM1Package.CLIENT_COMPOSANT__SEND_REQUEST_PORT:
				return send_request_port != null;
			case HADLM1Package.CLIENT_COMPOSANT__ANSWERREQUEST_PORTREQUISCOMPO:
				return answerrequest_portrequiscompo != null;
			case HADLM1Package.CLIENT_COMPOSANT__EXTERNALPORTFOURNICLIENTANSWERREQUEST:
				return externalportfourniclientanswerrequest != null;
			case HADLM1Package.CLIENT_COMPOSANT__EXTERNALPORTREQUISCLIENTSENDREQUEST:
				return externalportrequisclientsendrequest != null;
		}
		return super.eIsSet(featureID);
	}
	/**
	 * @generated NOT
	 */
	@Override
	public void notify(PortRequisCompo portrequis, Object data) {
		if(portrequis.equals(externalportrequisclientsendrequest)){
			LOGGER.info("Reception d'une requete");
		}else if(portrequis.equals(answerrequest_portrequiscompo)){
			
		}
	}
	/**
	 * @generated NOT
	 */
	@Override
	public void notify(PortFourniCompo portDestinataire, Object data) {
		// TODO Auto-generated method stub
		
	}
	
} // Client_Composant
