/**
 */
package hADLM1;

import hADL.Configuration.Configuration;
import hADL.Interfaces.PortFourniConfig;

import java.util.logging.Logger;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Systeme Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.Systeme_Configuration#getClient_composant <em>Client composant</em>}</li>
 *   <li>{@link hADLM1.Systeme_Configuration#getServeur_composant <em>Serveur composant</em>}</li>
 *   <li>{@link hADLM1.Systeme_Configuration#getRpc_connectorexplicite <em>Rpc connectorexplicite</em>}</li>
 *   <li>{@link hADLM1.Systeme_Configuration#getLienattachementx <em>Lienattachementx</em>}</li>
 *   <li>{@link hADLM1.Systeme_Configuration#getLienattachementy <em>Lienattachementy</em>}</li>
 *   <li>{@link hADLM1.Systeme_Configuration#getSendrequest_portrequisconfig <em>Sendrequest portrequisconfig</em>}</li>
 *   <li>{@link hADLM1.Systeme_Configuration#getAnswerrequest_portfourniconfig <em>Answerrequest portfourniconfig</em>}</li>
 *   <li>{@link hADLM1.Systeme_Configuration#getExternalbindinganswerrequest <em>Externalbindinganswerrequest</em>}</li>
 *   <li>{@link hADLM1.Systeme_Configuration#getExternalbindingsendrequest <em>Externalbindingsendrequest</em>}</li>
 *   <li>{@link hADLM1.Systeme_Configuration#getLienattachementxanswer <em>Lienattachementxanswer</em>}</li>
 *   <li>{@link hADLM1.Systeme_Configuration#getLienattachementyanswer <em>Lienattachementyanswer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Systeme_Configuration extends Configuration {
	private static final Logger LOGGER = Logger.getAnonymousLogger();
	/**
	 * The cached value of the '{@link #getClient_composant() <em>Client composant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_composant()
	 * @generated
	 * @ordered
	 */
	protected Client_Composant client_composant;

	/**
	 * The cached value of the '{@link #getServeur_composant() <em>Serveur composant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServeur_composant()
	 * @generated
	 * @ordered
	 */
	protected Serveur_Composant serveur_composant;

	/**
	 * The cached value of the '{@link #getRpc_connectorexplicite() <em>Rpc connectorexplicite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpc_connectorexplicite()
	 * @generated
	 * @ordered
	 */
	protected RPC_ConnectorExplicite rpc_connectorexplicite;

	/**
	 * The cached value of the '{@link #getLienattachementx() <em>Lienattachementx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementx()
	 * @generated
	 * @ordered
	 */
	protected LienAttachementXRequest lienattachementx;

	/**
	 * The cached value of the '{@link #getLienattachementy() <em>Lienattachementy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementy()
	 * @generated
	 * @ordered
	 */
	protected LienAttachementYRequest lienattachementy;

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
	 * The cached value of the '{@link #getAnswerrequest_portfourniconfig() <em>Answerrequest portfourniconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerrequest_portfourniconfig()
	 * @generated
	 * @ordered
	 */
	protected AnswerRequest_PortFourniConfig answerrequest_portfourniconfig;

	/**
	 * The cached value of the '{@link #getExternalbindinganswerrequest() <em>Externalbindinganswerrequest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalbindinganswerrequest()
	 * @generated
	 * @ordered
	 */
	protected ExternalBindingAnswerRequest externalbindinganswerrequest;

	/**
	 * The cached value of the '{@link #getExternalbindingsendrequest() <em>Externalbindingsendrequest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalbindingsendrequest()
	 * @generated
	 * @ordered
	 */
	protected ExternalBindingSendRequest externalbindingsendrequest;

	/**
	 * The cached value of the '{@link #getLienattachementxanswer() <em>Lienattachementxanswer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementxanswer()
	 * @generated
	 * @ordered
	 */
	protected LienAttachementXAnswer lienattachementxanswer;

	/**
	 * The cached value of the '{@link #getLienattachementyanswer() <em>Lienattachementyanswer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementyanswer()
	 * @generated
	 * @ordered
	 */
	protected LienAttachementYAnswer lienattachementyanswer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Systeme_Configuration() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.SYSTEME_CONFIGURATION;
	}

	/**
	 * Returns the value of the '<em><b>Client composant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client composant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client composant</em>' containment reference.
	 * @see #setClient_composant(Client_Composant)
	 * @generated
	 */
	public Client_Composant getClient_composant() {
		return client_composant;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Systeme_Configuration#getClient_composant <em>Client composant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client composant</em>' containment reference.
	 * @see #getClient_composant()
	 * @generated
	 */
	public void setClient_composant(Client_Composant newClient_composant) {
		client_composant = newClient_composant;
	}

	/**
	 * Returns the value of the '<em><b>Serveur composant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serveur composant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serveur composant</em>' containment reference.
	 * @see #setServeur_composant(Serveur_Composant)
	 * @generated
	 */
	public Serveur_Composant getServeur_composant() {
		return serveur_composant;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Systeme_Configuration#getServeur_composant <em>Serveur composant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serveur composant</em>' containment reference.
	 * @see #getServeur_composant()
	 * @generated
	 */
	public void setServeur_composant(Serveur_Composant newServeur_composant) {
		serveur_composant = newServeur_composant;
	}

	/**
	 * Returns the value of the '<em><b>Rpc connectorexplicite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rpc connectorexplicite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpc connectorexplicite</em>' containment reference.
	 * @see #setRpc_connectorexplicite(RPC_ConnectorExplicite)
	 * @generated
	 */
	public RPC_ConnectorExplicite getRpc_connectorexplicite() {
		return rpc_connectorexplicite;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Systeme_Configuration#getRpc_connectorexplicite <em>Rpc connectorexplicite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpc connectorexplicite</em>' containment reference.
	 * @see #getRpc_connectorexplicite()
	 * @generated
	 */
	public void setRpc_connectorexplicite(RPC_ConnectorExplicite newRpc_connectorexplicite) {
		rpc_connectorexplicite = newRpc_connectorexplicite;
	}

	/**
	 * Returns the value of the '<em><b>Lienattachementx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachementx</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachementx</em>' containment reference.
	 * @see #setLienattachementx(LienAttachementXRequest)
	 * @generated
	 */
	public LienAttachementXRequest getLienattachementx() {
		return lienattachementx;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Systeme_Configuration#getLienattachementx <em>Lienattachementx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lienattachementx</em>' containment reference.
	 * @see #getLienattachementx()
	 * @generated
	 */
	public void setLienattachementx(LienAttachementXRequest newLienattachementx) {
		lienattachementx = newLienattachementx;
	}

	/**
	 * Returns the value of the '<em><b>Lienattachementy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachementy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachementy</em>' containment reference.
	 * @see #setLienattachementy(LienAttachementYRequest)
	 * @generated
	 */
	public LienAttachementYRequest getLienattachementy() {
		return lienattachementy;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Systeme_Configuration#getLienattachementy <em>Lienattachementy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lienattachementy</em>' containment reference.
	 * @see #getLienattachementy()
	 * @generated
	 */
	public void setLienattachementy(LienAttachementYRequest newLienattachementy) {
		lienattachementy = newLienattachementy;
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
	 * Sets the value of the '{@link hADLM1.Systeme_Configuration#getSendrequest_portrequisconfig <em>Sendrequest portrequisconfig</em>}' containment reference.
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
	 * Sets the value of the '{@link hADLM1.Systeme_Configuration#getAnswerrequest_portfourniconfig <em>Answerrequest portfourniconfig</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Externalbindinganswerrequest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Externalbindinganswerrequest</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externalbindinganswerrequest</em>' containment reference.
	 * @see #setExternalbindinganswerrequest(ExternalBindingAnswerRequest)
	 * @generated
	 */
	public ExternalBindingAnswerRequest getExternalbindinganswerrequest() {
		return externalbindinganswerrequest;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Systeme_Configuration#getExternalbindinganswerrequest <em>Externalbindinganswerrequest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Externalbindinganswerrequest</em>' containment reference.
	 * @see #getExternalbindinganswerrequest()
	 * @generated
	 */
	public void setExternalbindinganswerrequest(ExternalBindingAnswerRequest newExternalbindinganswerrequest) {
		externalbindinganswerrequest = newExternalbindinganswerrequest;
	}

	/**
	 * Returns the value of the '<em><b>Externalbindingsendrequest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Externalbindingsendrequest</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externalbindingsendrequest</em>' containment reference.
	 * @see #setExternalbindingsendrequest(ExternalBindingSendRequest)
	 * @generated
	 */
	public ExternalBindingSendRequest getExternalbindingsendrequest() {
		return externalbindingsendrequest;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Systeme_Configuration#getExternalbindingsendrequest <em>Externalbindingsendrequest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Externalbindingsendrequest</em>' containment reference.
	 * @see #getExternalbindingsendrequest()
	 * @generated
	 */
	public void setExternalbindingsendrequest(ExternalBindingSendRequest newExternalbindingsendrequest) {
		externalbindingsendrequest = newExternalbindingsendrequest;
	}

	/**
	 * Returns the value of the '<em><b>Lienattachementxanswer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachementxanswer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachementxanswer</em>' containment reference.
	 * @see #setLienattachementxanswer(LienAttachementXAnswer)
	 * @generated
	 */
	public LienAttachementXAnswer getLienattachementxanswer() {
		return lienattachementxanswer;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Systeme_Configuration#getLienattachementxanswer <em>Lienattachementxanswer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lienattachementxanswer</em>' containment reference.
	 * @see #getLienattachementxanswer()
	 * @generated
	 */
	public void setLienattachementxanswer(LienAttachementXAnswer newLienattachementxanswer) {
		lienattachementxanswer = newLienattachementxanswer;
	}

	/**
	 * Returns the value of the '<em><b>Lienattachementyanswer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachementyanswer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachementyanswer</em>' containment reference.
	 * @see #setLienattachementyanswer(LienAttachementYAnswer)
	 * @generated
	 */
	public LienAttachementYAnswer getLienattachementyanswer() {
		return lienattachementyanswer;
	}

	/**
	 * Sets the value of the '{@link hADLM1.Systeme_Configuration#getLienattachementyanswer <em>Lienattachementyanswer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lienattachementyanswer</em>' containment reference.
	 * @see #getLienattachementyanswer()
	 * @generated
	 */
	public void setLienattachementyanswer(LienAttachementYAnswer newLienattachementyanswer) {
		lienattachementyanswer = newLienattachementyanswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.SYSTEME_CONFIGURATION__CLIENT_COMPOSANT:
				return getClient_composant();
			case HADLM1Package.SYSTEME_CONFIGURATION__SERVEUR_COMPOSANT:
				return getServeur_composant();
			case HADLM1Package.SYSTEME_CONFIGURATION__RPC_CONNECTOREXPLICITE:
				return getRpc_connectorexplicite();
			case HADLM1Package.SYSTEME_CONFIGURATION__LIENATTACHEMENTX:
				return getLienattachementx();
			case HADLM1Package.SYSTEME_CONFIGURATION__LIENATTACHEMENTY:
				return getLienattachementy();
			case HADLM1Package.SYSTEME_CONFIGURATION__SENDREQUEST_PORTREQUISCONFIG:
				return getSendrequest_portrequisconfig();
			case HADLM1Package.SYSTEME_CONFIGURATION__ANSWERREQUEST_PORTFOURNICONFIG:
				return getAnswerrequest_portfourniconfig();
			case HADLM1Package.SYSTEME_CONFIGURATION__EXTERNALBINDINGANSWERREQUEST:
				return getExternalbindinganswerrequest();
			case HADLM1Package.SYSTEME_CONFIGURATION__EXTERNALBINDINGSENDREQUEST:
				return getExternalbindingsendrequest();
			case HADLM1Package.SYSTEME_CONFIGURATION__LIENATTACHEMENTXANSWER:
				return getLienattachementxanswer();
			case HADLM1Package.SYSTEME_CONFIGURATION__LIENATTACHEMENTYANSWER:
				return getLienattachementyanswer();
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
			case HADLM1Package.SYSTEME_CONFIGURATION__CLIENT_COMPOSANT:
				setClient_composant((Client_Composant)newValue);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__SERVEUR_COMPOSANT:
				setServeur_composant((Serveur_Composant)newValue);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__RPC_CONNECTOREXPLICITE:
				setRpc_connectorexplicite((RPC_ConnectorExplicite)newValue);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__LIENATTACHEMENTX:
				setLienattachementx((LienAttachementXRequest)newValue);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__LIENATTACHEMENTY:
				setLienattachementy((LienAttachementYRequest)newValue);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__SENDREQUEST_PORTREQUISCONFIG:
				setSendrequest_portrequisconfig((SendRequest_PortRequisConfig)newValue);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__ANSWERREQUEST_PORTFOURNICONFIG:
				setAnswerrequest_portfourniconfig((AnswerRequest_PortFourniConfig)newValue);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__EXTERNALBINDINGANSWERREQUEST:
				setExternalbindinganswerrequest((ExternalBindingAnswerRequest)newValue);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__EXTERNALBINDINGSENDREQUEST:
				setExternalbindingsendrequest((ExternalBindingSendRequest)newValue);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__LIENATTACHEMENTXANSWER:
				setLienattachementxanswer((LienAttachementXAnswer)newValue);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__LIENATTACHEMENTYANSWER:
				setLienattachementyanswer((LienAttachementYAnswer)newValue);
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
			case HADLM1Package.SYSTEME_CONFIGURATION__CLIENT_COMPOSANT:
				setClient_composant((Client_Composant)null);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__SERVEUR_COMPOSANT:
				setServeur_composant((Serveur_Composant)null);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__RPC_CONNECTOREXPLICITE:
				setRpc_connectorexplicite((RPC_ConnectorExplicite)null);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__LIENATTACHEMENTX:
				setLienattachementx((LienAttachementXRequest)null);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__LIENATTACHEMENTY:
				setLienattachementy((LienAttachementYRequest)null);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__SENDREQUEST_PORTREQUISCONFIG:
				setSendrequest_portrequisconfig((SendRequest_PortRequisConfig)null);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__ANSWERREQUEST_PORTFOURNICONFIG:
				setAnswerrequest_portfourniconfig((AnswerRequest_PortFourniConfig)null);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__EXTERNALBINDINGANSWERREQUEST:
				setExternalbindinganswerrequest((ExternalBindingAnswerRequest)null);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__EXTERNALBINDINGSENDREQUEST:
				setExternalbindingsendrequest((ExternalBindingSendRequest)null);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__LIENATTACHEMENTXANSWER:
				setLienattachementxanswer((LienAttachementXAnswer)null);
				return;
			case HADLM1Package.SYSTEME_CONFIGURATION__LIENATTACHEMENTYANSWER:
				setLienattachementyanswer((LienAttachementYAnswer)null);
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
			case HADLM1Package.SYSTEME_CONFIGURATION__CLIENT_COMPOSANT:
				return client_composant != null;
			case HADLM1Package.SYSTEME_CONFIGURATION__SERVEUR_COMPOSANT:
				return serveur_composant != null;
			case HADLM1Package.SYSTEME_CONFIGURATION__RPC_CONNECTOREXPLICITE:
				return rpc_connectorexplicite != null;
			case HADLM1Package.SYSTEME_CONFIGURATION__LIENATTACHEMENTX:
				return lienattachementx != null;
			case HADLM1Package.SYSTEME_CONFIGURATION__LIENATTACHEMENTY:
				return lienattachementy != null;
			case HADLM1Package.SYSTEME_CONFIGURATION__SENDREQUEST_PORTREQUISCONFIG:
				return sendrequest_portrequisconfig != null;
			case HADLM1Package.SYSTEME_CONFIGURATION__ANSWERREQUEST_PORTFOURNICONFIG:
				return answerrequest_portfourniconfig != null;
			case HADLM1Package.SYSTEME_CONFIGURATION__EXTERNALBINDINGANSWERREQUEST:
				return externalbindinganswerrequest != null;
			case HADLM1Package.SYSTEME_CONFIGURATION__EXTERNALBINDINGSENDREQUEST:
				return externalbindingsendrequest != null;
			case HADLM1Package.SYSTEME_CONFIGURATION__LIENATTACHEMENTXANSWER:
				return lienattachementxanswer != null;
			case HADLM1Package.SYSTEME_CONFIGURATION__LIENATTACHEMENTYANSWER:
				return lienattachementyanswer != null;
		}
		return super.eIsSet(featureID);
	}
	
	protected void notify(PortFourniConfig port, Object data) {
		//int id = port.
		System.out.println(this.eContainerFeatureID());
	}
	
	/**
	* @generated NOT
	*/
	public void sendRequest(Object data) {
		LOGGER.info("Debut: Send Request");
		actionViaPort(sendrequest_portrequisconfig, data);
	}
	
} // Systeme_Configuration
