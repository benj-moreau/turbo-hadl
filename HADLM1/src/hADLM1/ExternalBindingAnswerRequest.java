/**
 */
package hADLM1;

import hADL.Liens.LienBindingFourni;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Binding Answer Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.ExternalBindingAnswerRequest#getAnswerrequest_portfourniconfig <em>Answerrequest portfourniconfig</em>}</li>
 *   <li>{@link hADLM1.ExternalBindingAnswerRequest#getExternalportfourniclientanswerrequest <em>Externalportfourniclientanswerrequest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalBindingAnswerRequest extends LienBindingFourni {
	/**
	 * The cached value of the '{@link #getAnswerrequest_portfourniconfig() <em>Answerrequest portfourniconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerrequest_portfourniconfig()
	 * @generated
	 * @ordered
	 */
	protected AnswerRequest_PortFourniConfig answerrequest_portfourniconfig;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalBindingAnswerRequest() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.EXTERNAL_BINDING_ANSWER_REQUEST;
	}

	/**
	 * Returns the value of the '<em><b>Answerrequest portfourniconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answerrequest portfourniconfig</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answerrequest portfourniconfig</em>' containment reference.
	 * @see #setAnswerrequest_portfourniconfig(AnswerRequest_PortFourniConfig)
	 * @generated
	 */
	public AnswerRequest_PortFourniConfig getAnswerrequest_portfourniconfig() {
		return answerrequest_portfourniconfig;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ExternalBindingAnswerRequest#getAnswerrequest_portfourniconfig <em>Answerrequest portfourniconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answerrequest portfourniconfig</em>' containment reference.
	 * @see #getAnswerrequest_portfourniconfig()
	 * @generated
	 */
	public void setAnswerrequest_portfourniconfig(AnswerRequest_PortFourniConfig newAnswerrequest_portfourniconfig) {
		answerrequest_portfourniconfig = newAnswerrequest_portfourniconfig;
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
	 * Sets the value of the '{@link hADLM1.ExternalBindingAnswerRequest#getExternalportfourniclientanswerrequest <em>Externalportfourniclientanswerrequest</em>}' containment reference.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.EXTERNAL_BINDING_ANSWER_REQUEST__ANSWERREQUEST_PORTFOURNICONFIG:
				return getAnswerrequest_portfourniconfig();
			case HADLM1Package.EXTERNAL_BINDING_ANSWER_REQUEST__EXTERNALPORTFOURNICLIENTANSWERREQUEST:
				return getExternalportfourniclientanswerrequest();
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
			case HADLM1Package.EXTERNAL_BINDING_ANSWER_REQUEST__ANSWERREQUEST_PORTFOURNICONFIG:
				setAnswerrequest_portfourniconfig((AnswerRequest_PortFourniConfig)newValue);
				return;
			case HADLM1Package.EXTERNAL_BINDING_ANSWER_REQUEST__EXTERNALPORTFOURNICLIENTANSWERREQUEST:
				setExternalportfourniclientanswerrequest((ExternalPortFourniClientAnswerRequest)newValue);
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
			case HADLM1Package.EXTERNAL_BINDING_ANSWER_REQUEST__ANSWERREQUEST_PORTFOURNICONFIG:
				setAnswerrequest_portfourniconfig((AnswerRequest_PortFourniConfig)null);
				return;
			case HADLM1Package.EXTERNAL_BINDING_ANSWER_REQUEST__EXTERNALPORTFOURNICLIENTANSWERREQUEST:
				setExternalportfourniclientanswerrequest((ExternalPortFourniClientAnswerRequest)null);
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
			case HADLM1Package.EXTERNAL_BINDING_ANSWER_REQUEST__ANSWERREQUEST_PORTFOURNICONFIG:
				return answerrequest_portfourniconfig != null;
			case HADLM1Package.EXTERNAL_BINDING_ANSWER_REQUEST__EXTERNALPORTFOURNICLIENTANSWERREQUEST:
				return externalportfourniclientanswerrequest != null;
		}
		return super.eIsSet(featureID);
	}

} // ExternalBindingAnswerRequest
