/**
 */
package hADLM1.util;

import hADL.Composant.Composant;

import hADL.Configuration.Configuration;
import hADL.Configuration.Observer;

import hADL.Connecteurs.Connecteur;
import hADL.Connecteurs.ConnecteurExplicite;

import hADL.Element;

import hADL.Interfaces.Interface;
import hADL.Interfaces.Port;
import hADL.Interfaces.PortFourniCompo;
import hADL.Interfaces.PortFourniConfig;
import hADL.Interfaces.PortRequisCompo;
import hADL.Interfaces.PortRequisConfig;

import hADL.Liens.Lien;
import hADL.Liens.LienAttachement;
import hADL.Liens.LienAttachementPFRF;
import hADL.Liens.LienAttachementPRRT;
import hADL.Liens.LienBinding;
import hADL.Liens.LienBindingFourni;
import hADL.Liens.LienBindingRequis;

import hADL.Objet;

import hADL.Roles.Glue;
import hADL.Roles.Role;
import hADL.Roles.RoleFrom;
import hADL.Roles.RoleTo;

import hADLM1.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hADLM1.HADLM1Package
 * @generated
 */
public class HADLM1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HADLM1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HADLM1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HADLM1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HADLM1Switch<Adapter> modelSwitch =
		new HADLM1Switch<Adapter>() {
			@Override
			public Adapter caseSecurityCheck_PortFourni(SecurityCheck_PortFourni object) {
				return createSecurityCheck_PortFourniAdapter();
			}
			@Override
			public Adapter caseExternalSocket_PortFourni(ExternalSocket_PortFourni object) {
				return createExternalSocket_PortFourniAdapter();
			}
			@Override
			public Adapter caseLienAttachementY6(LienAttachementY6 object) {
				return createLienAttachementY6Adapter();
			}
			@Override
			public Adapter caseServeur_Composant(Serveur_Composant object) {
				return createServeur_ComposantAdapter();
			}
			@Override
			public Adapter caseQueryInt_PortRequis(QueryInt_PortRequis object) {
				return createQueryInt_PortRequisAdapter();
			}
			@Override
			public Adapter caseLienAttachementY4(LienAttachementY4 object) {
				return createLienAttachementY4Adapter();
			}
			@Override
			public Adapter caseLienAttachementX6(LienAttachementX6 object) {
				return createLienAttachementX6Adapter();
			}
			@Override
			public Adapter caseExternalBindingSendRequest(ExternalBindingSendRequest object) {
				return createExternalBindingSendRequestAdapter();
			}
			@Override
			public Adapter caseClient_Composant(Client_Composant object) {
				return createClient_ComposantAdapter();
			}
			@Override
			public Adapter caseReceive_request_PortRequisCompo(Receive_request_PortRequisCompo object) {
				return createReceive_request_PortRequisCompoAdapter();
			}
			@Override
			public Adapter caseSendRequest_PortRequisConfig(SendRequest_PortRequisConfig object) {
				return createSendRequest_PortRequisConfigAdapter();
			}
			@Override
			public Adapter caseClearenceRequest_RoleTo(ClearenceRequest_RoleTo object) {
				return createClearenceRequest_RoleToAdapter();
			}
			@Override
			public Adapter caseSQLRequest_Connector(SQLRequest_Connector object) {
				return createSQLRequest_ConnectorAdapter();
			}
			@Override
			public Adapter caseSend_request_PortFourniCompo(Send_request_PortFourniCompo object) {
				return createSend_request_PortFourniCompoAdapter();
			}
			@Override
			public Adapter caseSecurityManagement_PortFourni(SecurityManagement_PortFourni object) {
				return createSecurityManagement_PortFourniAdapter();
			}
			@Override
			public Adapter caseLienAttachementY2(LienAttachementY2 object) {
				return createLienAttachementY2Adapter();
			}
			@Override
			public Adapter casecallerAnswer_RoleFrom(callerAnswer_RoleFrom object) {
				return createcallerAnswer_RoleFromAdapter();
			}
			@Override
			public Adapter caseServeurDetails_Configuration(ServeurDetails_Configuration object) {
				return createServeurDetails_ConfigurationAdapter();
			}
			@Override
			public Adapter caseSecurityAuth_PortRequis(SecurityAuth_PortRequis object) {
				return createSecurityAuth_PortRequisAdapter();
			}
			@Override
			public Adapter caseAnswerRequest_PortRequisCompo(AnswerRequest_PortRequisCompo object) {
				return createAnswerRequest_PortRequisCompoAdapter();
			}
			@Override
			public Adapter caseLienAttachementY1(LienAttachementY1 object) {
				return createLienAttachementY1Adapter();
			}
			@Override
			public Adapter caseRPC_ConnectorExplicite(RPC_ConnectorExplicite object) {
				return createRPC_ConnectorExpliciteAdapter();
			}
			@Override
			public Adapter caseLienAttachementY3(LienAttachementY3 object) {
				return createLienAttachementY3Adapter();
			}
			@Override
			public Adapter caseBindingServeurFourniCompo(BindingServeurFourniCompo object) {
				return createBindingServeurFourniCompoAdapter();
			}
			@Override
			public Adapter caseQueryInt_PortFourni(QueryInt_PortFourni object) {
				return createQueryInt_PortFourniAdapter();
			}
			@Override
			public Adapter casecalled_RoleTo(called_RoleTo object) {
				return createcalled_RoleToAdapter();
			}
			@Override
			public Adapter caseClearenceRequest_Connector(ClearenceRequest_Connector object) {
				return createClearenceRequest_ConnectorAdapter();
			}
			@Override
			public Adapter caseLienAttachementXRequest(LienAttachementXRequest object) {
				return createLienAttachementXRequestAdapter();
			}
			@Override
			public Adapter caseSecurityAuth_PortFourni(SecurityAuth_PortFourni object) {
				return createSecurityAuth_PortFourniAdapter();
			}
			@Override
			public Adapter caseAnswerRequest_PortFourni(AnswerRequest_PortFourni object) {
				return createAnswerRequest_PortFourniAdapter();
			}
			@Override
			public Adapter caseSecurityQuery_Connector(SecurityQuery_Connector object) {
				return createSecurityQuery_ConnectorAdapter();
			}
			@Override
			public Adapter caseExternalSocket_PortRequis(ExternalSocket_PortRequis object) {
				return createExternalSocket_PortRequisAdapter();
			}
			@Override
			public Adapter caseClearenceRequest_RoleFrom(ClearenceRequest_RoleFrom object) {
				return createClearenceRequest_RoleFromAdapter();
			}
			@Override
			public Adapter caseDBQuery_PortFourni(DBQuery_PortFourni object) {
				return createDBQuery_PortFourniAdapter();
			}
			@Override
			public Adapter caseDBQuery_PortRequis(DBQuery_PortRequis object) {
				return createDBQuery_PortRequisAdapter();
			}
			@Override
			public Adapter caseBindingServeurFOurni(BindingServeurFOurni object) {
				return createBindingServeurFOurniAdapter();
			}
			@Override
			public Adapter caseLienAttachementYAnswer(LienAttachementYAnswer object) {
				return createLienAttachementYAnswerAdapter();
			}
			@Override
			public Adapter casecalledAnswer_RoleTo(calledAnswer_RoleTo object) {
				return createcalledAnswer_RoleToAdapter();
			}
			@Override
			public Adapter caseSecurityCheck_PortRequis(SecurityCheck_PortRequis object) {
				return createSecurityCheck_PortRequisAdapter();
			}
			@Override
			public Adapter caseSQLRequest_RoleFrom(SQLRequest_RoleFrom object) {
				return createSQLRequest_RoleFromAdapter();
			}
			@Override
			public Adapter caseAnswerRequest_PortFourniConfig(AnswerRequest_PortFourniConfig object) {
				return createAnswerRequest_PortFourniConfigAdapter();
			}
			@Override
			public Adapter casecaller_RoleFrom(caller_RoleFrom object) {
				return createcaller_RoleFromAdapter();
			}
			@Override
			public Adapter caseLienAttachementX1(LienAttachementX1 object) {
				return createLienAttachementX1Adapter();
			}
			@Override
			public Adapter caseCQuery_PortRequis(CQuery_PortRequis object) {
				return createCQuery_PortRequisAdapter();
			}
			@Override
			public Adapter caseSQLRequest_RoleTo(SQLRequest_RoleTo object) {
				return createSQLRequest_RoleToAdapter();
			}
			@Override
			public Adapter caseSecurityQuery_RoleTo(SecurityQuery_RoleTo object) {
				return createSecurityQuery_RoleToAdapter();
			}
			@Override
			public Adapter caseLienAttachementX3(LienAttachementX3 object) {
				return createLienAttachementX3Adapter();
			}
			@Override
			public Adapter caseSecurityQuery_RoleFrom(SecurityQuery_RoleFrom object) {
				return createSecurityQuery_RoleFromAdapter();
			}
			@Override
			public Adapter caseAnswerRequest_PortFourniCompo(AnswerRequest_PortFourniCompo object) {
				return createAnswerRequest_PortFourniCompoAdapter();
			}
			@Override
			public Adapter caseLienAttachementY5(LienAttachementY5 object) {
				return createLienAttachementY5Adapter();
			}
			@Override
			public Adapter caseSecurityManager_Composant(SecurityManager_Composant object) {
				return createSecurityManager_ComposantAdapter();
			}
			@Override
			public Adapter caseConnectionManager_Composant(ConnectionManager_Composant object) {
				return createConnectionManager_ComposantAdapter();
			}
			@Override
			public Adapter casebindingRequisServeurConfig(bindingRequisServeurConfig object) {
				return createbindingRequisServeurConfigAdapter();
			}
			@Override
			public Adapter caseSecurityManagement_PortRequis(SecurityManagement_PortRequis object) {
				return createSecurityManagement_PortRequisAdapter();
			}
			@Override
			public Adapter caseLienAttachementX2(LienAttachementX2 object) {
				return createLienAttachementX2Adapter();
			}
			@Override
			public Adapter caseLienAttachementYRequest(LienAttachementYRequest object) {
				return createLienAttachementYRequestAdapter();
			}
			@Override
			public Adapter caseSysteme_Configuration(Systeme_Configuration object) {
				return createSysteme_ConfigurationAdapter();
			}
			@Override
			public Adapter caseLienAttachementXAnswer(LienAttachementXAnswer object) {
				return createLienAttachementXAnswerAdapter();
			}
			@Override
			public Adapter casebindingRequisServeurDetails(bindingRequisServeurDetails object) {
				return createbindingRequisServeurDetailsAdapter();
			}
			@Override
			public Adapter caseLienAttachementX4(LienAttachementX4 object) {
				return createLienAttachementX4Adapter();
			}
			@Override
			public Adapter caseDatabase_Composant(Database_Composant object) {
				return createDatabase_ComposantAdapter();
			}
			@Override
			public Adapter caseCQuery_PortFourni(CQuery_PortFourni object) {
				return createCQuery_PortFourniAdapter();
			}
			@Override
			public Adapter caseLienAttachementX5(LienAttachementX5 object) {
				return createLienAttachementX5Adapter();
			}
			@Override
			public Adapter caseReceiveRequestRequisConfig(ReceiveRequestRequisConfig object) {
				return createReceiveRequestRequisConfigAdapter();
			}
			@Override
			public Adapter caseExternalBindingAnswerRequest(ExternalBindingAnswerRequest object) {
				return createExternalBindingAnswerRequestAdapter();
			}
			@Override
			public Adapter caseExternalPortRequisClientSendRequest(ExternalPortRequisClientSendRequest object) {
				return createExternalPortRequisClientSendRequestAdapter();
			}
			@Override
			public Adapter caseExternalPortFourniClientAnswerRequest(ExternalPortFourniClientAnswerRequest object) {
				return createExternalPortFourniClientAnswerRequestAdapter();
			}
			@Override
			public Adapter caseRetourClearenceRequest_RoleFrom(RetourClearenceRequest_RoleFrom object) {
				return createRetourClearenceRequest_RoleFromAdapter();
			}
			@Override
			public Adapter caseRetourClearenceRequest_RoleTo(RetourClearenceRequest_RoleTo object) {
				return createRetourClearenceRequest_RoleToAdapter();
			}
			@Override
			public Adapter caseObjet(Objet object) {
				return createObjetAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter casePortFourniCompo(PortFourniCompo object) {
				return createPortFourniCompoAdapter();
			}
			@Override
			public Adapter caseLien(Lien object) {
				return createLienAdapter();
			}
			@Override
			public Adapter caseLienAttachement(LienAttachement object) {
				return createLienAttachementAdapter();
			}
			@Override
			public Adapter caseLienAttachementPRRT(LienAttachementPRRT object) {
				return createLienAttachementPRRTAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseObserver(Observer object) {
				return createObserverAdapter();
			}
			@Override
			public Adapter caseComposant(Composant object) {
				return createComposantAdapter();
			}
			@Override
			public Adapter casePortRequisCompo(PortRequisCompo object) {
				return createPortRequisCompoAdapter();
			}
			@Override
			public Adapter caseLienAttachementPFRF(LienAttachementPFRF object) {
				return createLienAttachementPFRFAdapter();
			}
			@Override
			public Adapter caseLienBinding(LienBinding object) {
				return createLienBindingAdapter();
			}
			@Override
			public Adapter caseLienBindingRequis(LienBindingRequis object) {
				return createLienBindingRequisAdapter();
			}
			@Override
			public Adapter casePortRequisConfig(PortRequisConfig object) {
				return createPortRequisConfigAdapter();
			}
			@Override
			public Adapter caseGlue(Glue object) {
				return createGlueAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseRoleTo(RoleTo object) {
				return createRoleToAdapter();
			}
			@Override
			public Adapter caseConnecteur(Connecteur object) {
				return createConnecteurAdapter();
			}
			@Override
			public Adapter caseConnecteurExplicite(ConnecteurExplicite object) {
				return createConnecteurExpliciteAdapter();
			}
			@Override
			public Adapter caseRoleFrom(RoleFrom object) {
				return createRoleFromAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseLienBindingFourni(LienBindingFourni object) {
				return createLienBindingFourniAdapter();
			}
			@Override
			public Adapter casePortFourniConfig(PortFourniConfig object) {
				return createPortFourniConfigAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.SecurityCheck_PortFourni <em>Security Check Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.SecurityCheck_PortFourni
	 * @generated
	 */
	public Adapter createSecurityCheck_PortFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.ExternalSocket_PortFourni <em>External Socket Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.ExternalSocket_PortFourni
	 * @generated
	 */
	public Adapter createExternalSocket_PortFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.LienAttachementY6 <em>Lien Attachement Y6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.LienAttachementY6
	 * @generated
	 */
	public Adapter createLienAttachementY6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.Serveur_Composant <em>Serveur Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.Serveur_Composant
	 * @generated
	 */
	public Adapter createServeur_ComposantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.QueryInt_PortRequis <em>Query Int Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.QueryInt_PortRequis
	 * @generated
	 */
	public Adapter createQueryInt_PortRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.LienAttachementY4 <em>Lien Attachement Y4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.LienAttachementY4
	 * @generated
	 */
	public Adapter createLienAttachementY4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.LienAttachementX6 <em>Lien Attachement X6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.LienAttachementX6
	 * @generated
	 */
	public Adapter createLienAttachementX6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.ExternalBindingSendRequest <em>External Binding Send Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.ExternalBindingSendRequest
	 * @generated
	 */
	public Adapter createExternalBindingSendRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.Client_Composant <em>Client Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.Client_Composant
	 * @generated
	 */
	public Adapter createClient_ComposantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.Receive_request_PortRequisCompo <em>Receive request Port Requis Compo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.Receive_request_PortRequisCompo
	 * @generated
	 */
	public Adapter createReceive_request_PortRequisCompoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.SendRequest_PortRequisConfig <em>Send Request Port Requis Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.SendRequest_PortRequisConfig
	 * @generated
	 */
	public Adapter createSendRequest_PortRequisConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.ClearenceRequest_RoleTo <em>Clearence Request Role To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.ClearenceRequest_RoleTo
	 * @generated
	 */
	public Adapter createClearenceRequest_RoleToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.SQLRequest_Connector <em>SQL Request Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.SQLRequest_Connector
	 * @generated
	 */
	public Adapter createSQLRequest_ConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.Send_request_PortFourniCompo <em>Send request Port Fourni Compo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.Send_request_PortFourniCompo
	 * @generated
	 */
	public Adapter createSend_request_PortFourniCompoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.SecurityManagement_PortFourni <em>Security Management Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.SecurityManagement_PortFourni
	 * @generated
	 */
	public Adapter createSecurityManagement_PortFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.LienAttachementY2 <em>Lien Attachement Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.LienAttachementY2
	 * @generated
	 */
	public Adapter createLienAttachementY2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.callerAnswer_RoleFrom <em>caller Answer Role From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.callerAnswer_RoleFrom
	 * @generated
	 */
	public Adapter createcallerAnswer_RoleFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.ServeurDetails_Configuration <em>Serveur Details Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.ServeurDetails_Configuration
	 * @generated
	 */
	public Adapter createServeurDetails_ConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.SecurityAuth_PortRequis <em>Security Auth Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.SecurityAuth_PortRequis
	 * @generated
	 */
	public Adapter createSecurityAuth_PortRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.AnswerRequest_PortRequisCompo <em>Answer Request Port Requis Compo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.AnswerRequest_PortRequisCompo
	 * @generated
	 */
	public Adapter createAnswerRequest_PortRequisCompoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.LienAttachementY1 <em>Lien Attachement Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.LienAttachementY1
	 * @generated
	 */
	public Adapter createLienAttachementY1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.RPC_ConnectorExplicite <em>RPC Connector Explicite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.RPC_ConnectorExplicite
	 * @generated
	 */
	public Adapter createRPC_ConnectorExpliciteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.LienAttachementY3 <em>Lien Attachement Y3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.LienAttachementY3
	 * @generated
	 */
	public Adapter createLienAttachementY3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.BindingServeurFourniCompo <em>Binding Serveur Fourni Compo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.BindingServeurFourniCompo
	 * @generated
	 */
	public Adapter createBindingServeurFourniCompoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.QueryInt_PortFourni <em>Query Int Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.QueryInt_PortFourni
	 * @generated
	 */
	public Adapter createQueryInt_PortFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.called_RoleTo <em>called Role To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.called_RoleTo
	 * @generated
	 */
	public Adapter createcalled_RoleToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.ClearenceRequest_Connector <em>Clearence Request Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.ClearenceRequest_Connector
	 * @generated
	 */
	public Adapter createClearenceRequest_ConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.LienAttachementXRequest <em>Lien Attachement XRequest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.LienAttachementXRequest
	 * @generated
	 */
	public Adapter createLienAttachementXRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.SecurityAuth_PortFourni <em>Security Auth Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.SecurityAuth_PortFourni
	 * @generated
	 */
	public Adapter createSecurityAuth_PortFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.AnswerRequest_PortFourni <em>Answer Request Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.AnswerRequest_PortFourni
	 * @generated
	 */
	public Adapter createAnswerRequest_PortFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.SecurityQuery_Connector <em>Security Query Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.SecurityQuery_Connector
	 * @generated
	 */
	public Adapter createSecurityQuery_ConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.ExternalSocket_PortRequis <em>External Socket Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.ExternalSocket_PortRequis
	 * @generated
	 */
	public Adapter createExternalSocket_PortRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.ClearenceRequest_RoleFrom <em>Clearence Request Role From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.ClearenceRequest_RoleFrom
	 * @generated
	 */
	public Adapter createClearenceRequest_RoleFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.DBQuery_PortFourni <em>DB Query Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.DBQuery_PortFourni
	 * @generated
	 */
	public Adapter createDBQuery_PortFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.DBQuery_PortRequis <em>DB Query Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.DBQuery_PortRequis
	 * @generated
	 */
	public Adapter createDBQuery_PortRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.BindingServeurFOurni <em>Binding Serveur FOurni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.BindingServeurFOurni
	 * @generated
	 */
	public Adapter createBindingServeurFOurniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.LienAttachementYAnswer <em>Lien Attachement YAnswer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.LienAttachementYAnswer
	 * @generated
	 */
	public Adapter createLienAttachementYAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.calledAnswer_RoleTo <em>called Answer Role To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.calledAnswer_RoleTo
	 * @generated
	 */
	public Adapter createcalledAnswer_RoleToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.SecurityCheck_PortRequis <em>Security Check Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.SecurityCheck_PortRequis
	 * @generated
	 */
	public Adapter createSecurityCheck_PortRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.SQLRequest_RoleFrom <em>SQL Request Role From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.SQLRequest_RoleFrom
	 * @generated
	 */
	public Adapter createSQLRequest_RoleFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.AnswerRequest_PortFourniConfig <em>Answer Request Port Fourni Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.AnswerRequest_PortFourniConfig
	 * @generated
	 */
	public Adapter createAnswerRequest_PortFourniConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.caller_RoleFrom <em>caller Role From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.caller_RoleFrom
	 * @generated
	 */
	public Adapter createcaller_RoleFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.LienAttachementX1 <em>Lien Attachement X1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.LienAttachementX1
	 * @generated
	 */
	public Adapter createLienAttachementX1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.CQuery_PortRequis <em>CQuery Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.CQuery_PortRequis
	 * @generated
	 */
	public Adapter createCQuery_PortRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.SQLRequest_RoleTo <em>SQL Request Role To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.SQLRequest_RoleTo
	 * @generated
	 */
	public Adapter createSQLRequest_RoleToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.SecurityQuery_RoleTo <em>Security Query Role To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.SecurityQuery_RoleTo
	 * @generated
	 */
	public Adapter createSecurityQuery_RoleToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.LienAttachementX3 <em>Lien Attachement X3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.LienAttachementX3
	 * @generated
	 */
	public Adapter createLienAttachementX3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.SecurityQuery_RoleFrom <em>Security Query Role From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.SecurityQuery_RoleFrom
	 * @generated
	 */
	public Adapter createSecurityQuery_RoleFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.AnswerRequest_PortFourniCompo <em>Answer Request Port Fourni Compo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.AnswerRequest_PortFourniCompo
	 * @generated
	 */
	public Adapter createAnswerRequest_PortFourniCompoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.LienAttachementY5 <em>Lien Attachement Y5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.LienAttachementY5
	 * @generated
	 */
	public Adapter createLienAttachementY5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.SecurityManager_Composant <em>Security Manager Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.SecurityManager_Composant
	 * @generated
	 */
	public Adapter createSecurityManager_ComposantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.ConnectionManager_Composant <em>Connection Manager Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.ConnectionManager_Composant
	 * @generated
	 */
	public Adapter createConnectionManager_ComposantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.bindingRequisServeurConfig <em>binding Requis Serveur Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.bindingRequisServeurConfig
	 * @generated
	 */
	public Adapter createbindingRequisServeurConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.SecurityManagement_PortRequis <em>Security Management Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.SecurityManagement_PortRequis
	 * @generated
	 */
	public Adapter createSecurityManagement_PortRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.LienAttachementX2 <em>Lien Attachement X2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.LienAttachementX2
	 * @generated
	 */
	public Adapter createLienAttachementX2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.LienAttachementYRequest <em>Lien Attachement YRequest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.LienAttachementYRequest
	 * @generated
	 */
	public Adapter createLienAttachementYRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.Systeme_Configuration <em>Systeme Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.Systeme_Configuration
	 * @generated
	 */
	public Adapter createSysteme_ConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.LienAttachementXAnswer <em>Lien Attachement XAnswer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.LienAttachementXAnswer
	 * @generated
	 */
	public Adapter createLienAttachementXAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.bindingRequisServeurDetails <em>binding Requis Serveur Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.bindingRequisServeurDetails
	 * @generated
	 */
	public Adapter createbindingRequisServeurDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.LienAttachementX4 <em>Lien Attachement X4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.LienAttachementX4
	 * @generated
	 */
	public Adapter createLienAttachementX4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.Database_Composant <em>Database Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.Database_Composant
	 * @generated
	 */
	public Adapter createDatabase_ComposantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.CQuery_PortFourni <em>CQuery Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.CQuery_PortFourni
	 * @generated
	 */
	public Adapter createCQuery_PortFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.LienAttachementX5 <em>Lien Attachement X5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.LienAttachementX5
	 * @generated
	 */
	public Adapter createLienAttachementX5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.ReceiveRequestRequisConfig <em>Receive Request Requis Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.ReceiveRequestRequisConfig
	 * @generated
	 */
	public Adapter createReceiveRequestRequisConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.ExternalBindingAnswerRequest <em>External Binding Answer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.ExternalBindingAnswerRequest
	 * @generated
	 */
	public Adapter createExternalBindingAnswerRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.ExternalPortRequisClientSendRequest <em>External Port Requis Client Send Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.ExternalPortRequisClientSendRequest
	 * @generated
	 */
	public Adapter createExternalPortRequisClientSendRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.ExternalPortFourniClientAnswerRequest <em>External Port Fourni Client Answer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.ExternalPortFourniClientAnswerRequest
	 * @generated
	 */
	public Adapter createExternalPortFourniClientAnswerRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.RetourClearenceRequest_RoleFrom <em>Retour Clearence Request Role From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.RetourClearenceRequest_RoleFrom
	 * @generated
	 */
	public Adapter createRetourClearenceRequest_RoleFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADLM1.RetourClearenceRequest_RoleTo <em>Retour Clearence Request Role To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADLM1.RetourClearenceRequest_RoleTo
	 * @generated
	 */
	public Adapter createRetourClearenceRequest_RoleToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Objet <em>Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Objet
	 * @generated
	 */
	public Adapter createObjetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Interfaces.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Interfaces.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Interfaces.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Interfaces.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Interfaces.PortFourniCompo <em>Port Fourni Compo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Interfaces.PortFourniCompo
	 * @generated
	 */
	public Adapter createPortFourniCompoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Liens.Lien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Liens.Lien
	 * @generated
	 */
	public Adapter createLienAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Liens.LienAttachement <em>Lien Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Liens.LienAttachement
	 * @generated
	 */
	public Adapter createLienAttachementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Liens.LienAttachementPRRT <em>Lien Attachement PRRT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Liens.LienAttachementPRRT
	 * @generated
	 */
	public Adapter createLienAttachementPRRTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Composant.Composant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Composant.Composant
	 * @generated
	 */
	public Adapter createComposantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Liens.LienAttachementPFRF <em>Lien Attachement PFRF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Liens.LienAttachementPFRF
	 * @generated
	 */
	public Adapter createLienAttachementPFRFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Liens.LienBinding <em>Lien Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Liens.LienBinding
	 * @generated
	 */
	public Adapter createLienBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Liens.LienBindingRequis <em>Lien Binding Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Liens.LienBindingRequis
	 * @generated
	 */
	public Adapter createLienBindingRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Interfaces.PortRequisCompo <em>Port Requis Compo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Interfaces.PortRequisCompo
	 * @generated
	 */
	public Adapter createPortRequisCompoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Interfaces.PortRequisConfig <em>Port Requis Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Interfaces.PortRequisConfig
	 * @generated
	 */
	public Adapter createPortRequisConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Roles.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Roles.Glue
	 * @generated
	 */
	public Adapter createGlueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Roles.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Roles.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Roles.RoleTo <em>Role To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Roles.RoleTo
	 * @generated
	 */
	public Adapter createRoleToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Connecteurs.Connecteur <em>Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Connecteurs.Connecteur
	 * @generated
	 */
	public Adapter createConnecteurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Connecteurs.ConnecteurExplicite <em>Connecteur Explicite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Connecteurs.ConnecteurExplicite
	 * @generated
	 */
	public Adapter createConnecteurExpliciteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Roles.RoleFrom <em>Role From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Roles.RoleFrom
	 * @generated
	 */
	public Adapter createRoleFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Configuration.Observer <em>Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Configuration.Observer
	 * @generated
	 */
	public Adapter createObserverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Configuration.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Configuration.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Liens.LienBindingFourni <em>Lien Binding Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Liens.LienBindingFourni
	 * @generated
	 */
	public Adapter createLienBindingFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Interfaces.PortFourniConfig <em>Port Fourni Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Interfaces.PortFourniConfig
	 * @generated
	 */
	public Adapter createPortFourniConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HADLM1AdapterFactory
