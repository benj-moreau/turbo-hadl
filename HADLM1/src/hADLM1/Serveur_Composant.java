/**
 */
package hADLM1;

import hADL.Composant.Composant;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serveur Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.Serveur_Composant#getReceive_request_port <em>Receive request port</em>}</li>
 *   <li>{@link hADLM1.Serveur_Composant#getServeurdetails_configuration <em>Serveurdetails configuration</em>}</li>
 *   <li>{@link hADLM1.Serveur_Composant#getAnswerrequest_portfournicompo <em>Answerrequest portfournicompo</em>}</li>
 *   <li>{@link hADLM1.Serveur_Composant#getBindingrequisserveurconfig <em>Bindingrequisserveurconfig</em>}</li>
 *   <li>{@link hADLM1.Serveur_Composant#getBindingserveurfournicompo <em>Bindingserveurfournicompo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Serveur_Composant extends Composant {
	/**
	 * The cached value of the '{@link #getReceive_request_port() <em>Receive request port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceive_request_port()
	 * @generated
	 * @ordered
	 */
	protected Receive_request_PortRequisCompo receive_request_port;

	/**
	 * The cached value of the '{@link #getServeurdetails_configuration() <em>Serveurdetails configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServeurdetails_configuration()
	 * @generated
	 * @ordered
	 */
	protected ServeurDetails_Configuration serveurdetails_configuration;

	/**
	 * The cached value of the '{@link #getAnswerrequest_portfournicompo() <em>Answerrequest portfournicompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerrequest_portfournicompo()
	 * @generated
	 * @ordered
	 */
	protected AnswerRequest_PortFourniCompo answerrequest_portfournicompo;

	/**
	 * The cached value of the '{@link #getBindingrequisserveurconfig() <em>Bindingrequisserveurconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingrequisserveurconfig()
	 * @generated
	 * @ordered
	 */
	protected bindingRequisServeurConfig bindingrequisserveurconfig;

	/**
	 * The cached value of the '{@link #getBindingserveurfournicompo() <em>Bindingserveurfournicompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingserveurfournicompo()
	 * @generated
	 * @ordered
	 */
	protected BindingServeurFourniCompo bindingserveurfournicompo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Serveur_Composant() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.SERVEUR_COMPOSANT;
	}

	/**
	 * Returns the value of the '<em><b>Receive request port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive request port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive request port</em>' containment reference.
	 * @see #setReceive_request_port(Receive_request_PortRequisCompo)
	 * @generated
	 */
	public Receive_request_PortRequisCompo getReceive_request_port() {
		return receive_request_port;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Serveur_Composant#getReceive_request_port <em>Receive request port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive request port</em>' containment reference.
	 * @see #getReceive_request_port()
	 * @generated
	 */
	public void setReceive_request_port(Receive_request_PortRequisCompo newReceive_request_port) {
		receive_request_port = newReceive_request_port;
	}

	/**
	 * Returns the value of the '<em><b>Serveurdetails configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serveurdetails configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serveurdetails configuration</em>' containment reference.
	 * @see #setServeurdetails_configuration(ServeurDetails_Configuration)
	 * @generated
	 */
	public ServeurDetails_Configuration getServeurdetails_configuration() {
		return serveurdetails_configuration;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Serveur_Composant#getServeurdetails_configuration <em>Serveurdetails configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serveurdetails configuration</em>' containment reference.
	 * @see #getServeurdetails_configuration()
	 * @generated
	 */
	public void setServeurdetails_configuration(ServeurDetails_Configuration newServeurdetails_configuration) {
		serveurdetails_configuration = newServeurdetails_configuration;
	}

	/**
	 * Returns the value of the '<em><b>Answerrequest portfournicompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answerrequest portfournicompo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answerrequest portfournicompo</em>' containment reference.
	 * @see #setAnswerrequest_portfournicompo(AnswerRequest_PortFourniCompo)
	 * @generated
	 */
	public AnswerRequest_PortFourniCompo getAnswerrequest_portfournicompo() {
		return answerrequest_portfournicompo;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Serveur_Composant#getAnswerrequest_portfournicompo <em>Answerrequest portfournicompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answerrequest portfournicompo</em>' containment reference.
	 * @see #getAnswerrequest_portfournicompo()
	 * @generated
	 */
	public void setAnswerrequest_portfournicompo(AnswerRequest_PortFourniCompo newAnswerrequest_portfournicompo) {
		answerrequest_portfournicompo = newAnswerrequest_portfournicompo;
	}

	/**
	 * Returns the value of the '<em><b>Bindingrequisserveurconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindingrequisserveurconfig</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindingrequisserveurconfig</em>' containment reference.
	 * @see #setBindingrequisserveurconfig(bindingRequisServeurConfig)
	 * @generated
	 */
	public bindingRequisServeurConfig getBindingrequisserveurconfig() {
		return bindingrequisserveurconfig;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Serveur_Composant#getBindingrequisserveurconfig <em>Bindingrequisserveurconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindingrequisserveurconfig</em>' containment reference.
	 * @see #getBindingrequisserveurconfig()
	 * @generated
	 */
	public void setBindingrequisserveurconfig(bindingRequisServeurConfig newBindingrequisserveurconfig) {
		bindingrequisserveurconfig = newBindingrequisserveurconfig;
	}

	/**
	 * Returns the value of the '<em><b>Bindingserveurfournicompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindingserveurfournicompo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindingserveurfournicompo</em>' containment reference.
	 * @see #setBindingserveurfournicompo(BindingServeurFourniCompo)
	 * @generated
	 */
	public BindingServeurFourniCompo getBindingserveurfournicompo() {
		return bindingserveurfournicompo;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Serveur_Composant#getBindingserveurfournicompo <em>Bindingserveurfournicompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindingserveurfournicompo</em>' containment reference.
	 * @see #getBindingserveurfournicompo()
	 * @generated
	 */
	public void setBindingserveurfournicompo(BindingServeurFourniCompo newBindingserveurfournicompo) {
		bindingserveurfournicompo = newBindingserveurfournicompo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.SERVEUR_COMPOSANT__RECEIVE_REQUEST_PORT:
				return getReceive_request_port();
			case HADLM1Package.SERVEUR_COMPOSANT__SERVEURDETAILS_CONFIGURATION:
				return getServeurdetails_configuration();
			case HADLM1Package.SERVEUR_COMPOSANT__ANSWERREQUEST_PORTFOURNICOMPO:
				return getAnswerrequest_portfournicompo();
			case HADLM1Package.SERVEUR_COMPOSANT__BINDINGREQUISSERVEURCONFIG:
				return getBindingrequisserveurconfig();
			case HADLM1Package.SERVEUR_COMPOSANT__BINDINGSERVEURFOURNICOMPO:
				return getBindingserveurfournicompo();
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
			case HADLM1Package.SERVEUR_COMPOSANT__RECEIVE_REQUEST_PORT:
				setReceive_request_port((Receive_request_PortRequisCompo)newValue);
				return;
			case HADLM1Package.SERVEUR_COMPOSANT__SERVEURDETAILS_CONFIGURATION:
				setServeurdetails_configuration((ServeurDetails_Configuration)newValue);
				return;
			case HADLM1Package.SERVEUR_COMPOSANT__ANSWERREQUEST_PORTFOURNICOMPO:
				setAnswerrequest_portfournicompo((AnswerRequest_PortFourniCompo)newValue);
				return;
			case HADLM1Package.SERVEUR_COMPOSANT__BINDINGREQUISSERVEURCONFIG:
				setBindingrequisserveurconfig((bindingRequisServeurConfig)newValue);
				return;
			case HADLM1Package.SERVEUR_COMPOSANT__BINDINGSERVEURFOURNICOMPO:
				setBindingserveurfournicompo((BindingServeurFourniCompo)newValue);
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
			case HADLM1Package.SERVEUR_COMPOSANT__RECEIVE_REQUEST_PORT:
				setReceive_request_port((Receive_request_PortRequisCompo)null);
				return;
			case HADLM1Package.SERVEUR_COMPOSANT__SERVEURDETAILS_CONFIGURATION:
				setServeurdetails_configuration((ServeurDetails_Configuration)null);
				return;
			case HADLM1Package.SERVEUR_COMPOSANT__ANSWERREQUEST_PORTFOURNICOMPO:
				setAnswerrequest_portfournicompo((AnswerRequest_PortFourniCompo)null);
				return;
			case HADLM1Package.SERVEUR_COMPOSANT__BINDINGREQUISSERVEURCONFIG:
				setBindingrequisserveurconfig((bindingRequisServeurConfig)null);
				return;
			case HADLM1Package.SERVEUR_COMPOSANT__BINDINGSERVEURFOURNICOMPO:
				setBindingserveurfournicompo((BindingServeurFourniCompo)null);
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
			case HADLM1Package.SERVEUR_COMPOSANT__RECEIVE_REQUEST_PORT:
				return receive_request_port != null;
			case HADLM1Package.SERVEUR_COMPOSANT__SERVEURDETAILS_CONFIGURATION:
				return serveurdetails_configuration != null;
			case HADLM1Package.SERVEUR_COMPOSANT__ANSWERREQUEST_PORTFOURNICOMPO:
				return answerrequest_portfournicompo != null;
			case HADLM1Package.SERVEUR_COMPOSANT__BINDINGREQUISSERVEURCONFIG:
				return bindingrequisserveurconfig != null;
			case HADLM1Package.SERVEUR_COMPOSANT__BINDINGSERVEURFOURNICOMPO:
				return bindingserveurfournicompo != null;
		}
		return super.eIsSet(featureID);
	}

} // Serveur_Composant
