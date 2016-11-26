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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hADLM1.HADLM1Package
 * @generated
 */
public class HADLM1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HADLM1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HADLM1Switch() {
		if (modelPackage == null) {
			modelPackage = HADLM1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HADLM1Package.SECURITY_CHECK_PORT_FOURNI: {
				SecurityCheck_PortFourni securityCheck_PortFourni = (SecurityCheck_PortFourni)theEObject;
				T result = caseSecurityCheck_PortFourni(securityCheck_PortFourni);
				if (result == null) result = casePortFourniCompo(securityCheck_PortFourni);
				if (result == null) result = casePort(securityCheck_PortFourni);
				if (result == null) result = caseInterface(securityCheck_PortFourni);
				if (result == null) result = caseObjet(securityCheck_PortFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.EXTERNAL_SOCKET_PORT_FOURNI: {
				ExternalSocket_PortFourni externalSocket_PortFourni = (ExternalSocket_PortFourni)theEObject;
				T result = caseExternalSocket_PortFourni(externalSocket_PortFourni);
				if (result == null) result = casePortFourniCompo(externalSocket_PortFourni);
				if (result == null) result = casePort(externalSocket_PortFourni);
				if (result == null) result = caseInterface(externalSocket_PortFourni);
				if (result == null) result = caseObjet(externalSocket_PortFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.LIEN_ATTACHEMENT_Y6: {
				LienAttachementY6 lienAttachementY6 = (LienAttachementY6)theEObject;
				T result = caseLienAttachementY6(lienAttachementY6);
				if (result == null) result = caseLienAttachementPRRT(lienAttachementY6);
				if (result == null) result = caseLienAttachement(lienAttachementY6);
				if (result == null) result = caseLien(lienAttachementY6);
				if (result == null) result = caseObjet(lienAttachementY6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.SERVEUR_COMPOSANT: {
				Serveur_Composant serveur_Composant = (Serveur_Composant)theEObject;
				T result = caseServeur_Composant(serveur_Composant);
				if (result == null) result = caseComposant(serveur_Composant);
				if (result == null) result = caseElement(serveur_Composant);
				if (result == null) result = caseObserver(serveur_Composant);
				if (result == null) result = caseObjet(serveur_Composant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.QUERY_INT_PORT_REQUIS: {
				QueryInt_PortRequis queryInt_PortRequis = (QueryInt_PortRequis)theEObject;
				T result = caseQueryInt_PortRequis(queryInt_PortRequis);
				if (result == null) result = casePortRequisCompo(queryInt_PortRequis);
				if (result == null) result = casePort(queryInt_PortRequis);
				if (result == null) result = caseInterface(queryInt_PortRequis);
				if (result == null) result = caseObjet(queryInt_PortRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.LIEN_ATTACHEMENT_Y4: {
				LienAttachementY4 lienAttachementY4 = (LienAttachementY4)theEObject;
				T result = caseLienAttachementY4(lienAttachementY4);
				if (result == null) result = caseLienAttachementPRRT(lienAttachementY4);
				if (result == null) result = caseLienAttachement(lienAttachementY4);
				if (result == null) result = caseLien(lienAttachementY4);
				if (result == null) result = caseObjet(lienAttachementY4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.LIEN_ATTACHEMENT_X6: {
				LienAttachementX6 lienAttachementX6 = (LienAttachementX6)theEObject;
				T result = caseLienAttachementX6(lienAttachementX6);
				if (result == null) result = caseLienAttachementPFRF(lienAttachementX6);
				if (result == null) result = caseLienAttachement(lienAttachementX6);
				if (result == null) result = caseLien(lienAttachementX6);
				if (result == null) result = caseObjet(lienAttachementX6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.EXTERNAL_BINDING_SEND_REQUEST: {
				ExternalBindingSendRequest externalBindingSendRequest = (ExternalBindingSendRequest)theEObject;
				T result = caseExternalBindingSendRequest(externalBindingSendRequest);
				if (result == null) result = caseLienBindingRequis(externalBindingSendRequest);
				if (result == null) result = caseLienBinding(externalBindingSendRequest);
				if (result == null) result = caseLien(externalBindingSendRequest);
				if (result == null) result = caseObjet(externalBindingSendRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.CLIENT_COMPOSANT: {
				Client_Composant client_Composant = (Client_Composant)theEObject;
				T result = caseClient_Composant(client_Composant);
				if (result == null) result = caseComposant(client_Composant);
				if (result == null) result = caseElement(client_Composant);
				if (result == null) result = caseObserver(client_Composant);
				if (result == null) result = caseObjet(client_Composant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.RECEIVE_REQUEST_PORT_REQUIS_COMPO: {
				Receive_request_PortRequisCompo receive_request_PortRequisCompo = (Receive_request_PortRequisCompo)theEObject;
				T result = caseReceive_request_PortRequisCompo(receive_request_PortRequisCompo);
				if (result == null) result = casePortRequisCompo(receive_request_PortRequisCompo);
				if (result == null) result = casePort(receive_request_PortRequisCompo);
				if (result == null) result = caseInterface(receive_request_PortRequisCompo);
				if (result == null) result = caseObjet(receive_request_PortRequisCompo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.SEND_REQUEST_PORT_REQUIS_CONFIG: {
				SendRequest_PortRequisConfig sendRequest_PortRequisConfig = (SendRequest_PortRequisConfig)theEObject;
				T result = caseSendRequest_PortRequisConfig(sendRequest_PortRequisConfig);
				if (result == null) result = casePortRequisConfig(sendRequest_PortRequisConfig);
				if (result == null) result = casePort(sendRequest_PortRequisConfig);
				if (result == null) result = caseInterface(sendRequest_PortRequisConfig);
				if (result == null) result = caseObjet(sendRequest_PortRequisConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.CLEARENCE_REQUEST_ROLE_TO: {
				ClearenceRequest_RoleTo clearenceRequest_RoleTo = (ClearenceRequest_RoleTo)theEObject;
				T result = caseClearenceRequest_RoleTo(clearenceRequest_RoleTo);
				if (result == null) result = caseRoleTo(clearenceRequest_RoleTo);
				if (result == null) result = caseRole(clearenceRequest_RoleTo);
				if (result == null) result = caseInterface(clearenceRequest_RoleTo);
				if (result == null) result = caseGlue(clearenceRequest_RoleTo);
				if (result == null) result = caseObjet(clearenceRequest_RoleTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.SQL_REQUEST_CONNECTOR: {
				SQLRequest_Connector sqlRequest_Connector = (SQLRequest_Connector)theEObject;
				T result = caseSQLRequest_Connector(sqlRequest_Connector);
				if (result == null) result = caseConnecteurExplicite(sqlRequest_Connector);
				if (result == null) result = caseConnecteur(sqlRequest_Connector);
				if (result == null) result = caseElement(sqlRequest_Connector);
				if (result == null) result = caseObjet(sqlRequest_Connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.SEND_REQUEST_PORT_FOURNI_COMPO: {
				Send_request_PortFourniCompo send_request_PortFourniCompo = (Send_request_PortFourniCompo)theEObject;
				T result = caseSend_request_PortFourniCompo(send_request_PortFourniCompo);
				if (result == null) result = casePortFourniCompo(send_request_PortFourniCompo);
				if (result == null) result = casePort(send_request_PortFourniCompo);
				if (result == null) result = caseInterface(send_request_PortFourniCompo);
				if (result == null) result = caseObjet(send_request_PortFourniCompo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.SECURITY_MANAGEMENT_PORT_FOURNI: {
				SecurityManagement_PortFourni securityManagement_PortFourni = (SecurityManagement_PortFourni)theEObject;
				T result = caseSecurityManagement_PortFourni(securityManagement_PortFourni);
				if (result == null) result = casePortFourniCompo(securityManagement_PortFourni);
				if (result == null) result = casePort(securityManagement_PortFourni);
				if (result == null) result = caseInterface(securityManagement_PortFourni);
				if (result == null) result = caseObjet(securityManagement_PortFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.LIEN_ATTACHEMENT_Y2: {
				LienAttachementY2 lienAttachementY2 = (LienAttachementY2)theEObject;
				T result = caseLienAttachementY2(lienAttachementY2);
				if (result == null) result = caseLienAttachementPRRT(lienAttachementY2);
				if (result == null) result = caseLienAttachement(lienAttachementY2);
				if (result == null) result = caseLien(lienAttachementY2);
				if (result == null) result = caseObjet(lienAttachementY2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.CALLER_ANSWER_ROLE_FROM: {
				callerAnswer_RoleFrom callerAnswer_RoleFrom = (callerAnswer_RoleFrom)theEObject;
				T result = casecallerAnswer_RoleFrom(callerAnswer_RoleFrom);
				if (result == null) result = caseRoleFrom(callerAnswer_RoleFrom);
				if (result == null) result = caseRole(callerAnswer_RoleFrom);
				if (result == null) result = caseInterface(callerAnswer_RoleFrom);
				if (result == null) result = caseGlue(callerAnswer_RoleFrom);
				if (result == null) result = caseObjet(callerAnswer_RoleFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION: {
				ServeurDetails_Configuration serveurDetails_Configuration = (ServeurDetails_Configuration)theEObject;
				T result = caseServeurDetails_Configuration(serveurDetails_Configuration);
				if (result == null) result = caseConfiguration(serveurDetails_Configuration);
				if (result == null) result = caseElement(serveurDetails_Configuration);
				if (result == null) result = caseObserver(serveurDetails_Configuration);
				if (result == null) result = caseObjet(serveurDetails_Configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.SECURITY_AUTH_PORT_REQUIS: {
				SecurityAuth_PortRequis securityAuth_PortRequis = (SecurityAuth_PortRequis)theEObject;
				T result = caseSecurityAuth_PortRequis(securityAuth_PortRequis);
				if (result == null) result = casePortRequisCompo(securityAuth_PortRequis);
				if (result == null) result = casePort(securityAuth_PortRequis);
				if (result == null) result = caseInterface(securityAuth_PortRequis);
				if (result == null) result = caseObjet(securityAuth_PortRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.ANSWER_REQUEST_PORT_REQUIS_COMPO: {
				AnswerRequest_PortRequisCompo answerRequest_PortRequisCompo = (AnswerRequest_PortRequisCompo)theEObject;
				T result = caseAnswerRequest_PortRequisCompo(answerRequest_PortRequisCompo);
				if (result == null) result = casePortRequisCompo(answerRequest_PortRequisCompo);
				if (result == null) result = casePort(answerRequest_PortRequisCompo);
				if (result == null) result = caseInterface(answerRequest_PortRequisCompo);
				if (result == null) result = caseObjet(answerRequest_PortRequisCompo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.LIEN_ATTACHEMENT_Y1: {
				LienAttachementY1 lienAttachementY1 = (LienAttachementY1)theEObject;
				T result = caseLienAttachementY1(lienAttachementY1);
				if (result == null) result = caseLienAttachementPRRT(lienAttachementY1);
				if (result == null) result = caseLienAttachement(lienAttachementY1);
				if (result == null) result = caseLien(lienAttachementY1);
				if (result == null) result = caseObjet(lienAttachementY1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.RPC_CONNECTOR_EXPLICITE: {
				RPC_ConnectorExplicite rpC_ConnectorExplicite = (RPC_ConnectorExplicite)theEObject;
				T result = caseRPC_ConnectorExplicite(rpC_ConnectorExplicite);
				if (result == null) result = caseConnecteurExplicite(rpC_ConnectorExplicite);
				if (result == null) result = caseConnecteur(rpC_ConnectorExplicite);
				if (result == null) result = caseElement(rpC_ConnectorExplicite);
				if (result == null) result = caseObjet(rpC_ConnectorExplicite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.LIEN_ATTACHEMENT_Y3: {
				LienAttachementY3 lienAttachementY3 = (LienAttachementY3)theEObject;
				T result = caseLienAttachementY3(lienAttachementY3);
				if (result == null) result = caseLienAttachementPRRT(lienAttachementY3);
				if (result == null) result = caseLienAttachement(lienAttachementY3);
				if (result == null) result = caseLien(lienAttachementY3);
				if (result == null) result = caseObjet(lienAttachementY3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.BINDING_SERVEUR_FOURNI_COMPO: {
				BindingServeurFourniCompo bindingServeurFourniCompo = (BindingServeurFourniCompo)theEObject;
				T result = caseBindingServeurFourniCompo(bindingServeurFourniCompo);
				if (result == null) result = caseLienBindingFourni(bindingServeurFourniCompo);
				if (result == null) result = caseLienBinding(bindingServeurFourniCompo);
				if (result == null) result = caseLien(bindingServeurFourniCompo);
				if (result == null) result = caseObjet(bindingServeurFourniCompo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.QUERY_INT_PORT_FOURNI: {
				QueryInt_PortFourni queryInt_PortFourni = (QueryInt_PortFourni)theEObject;
				T result = caseQueryInt_PortFourni(queryInt_PortFourni);
				if (result == null) result = casePortFourniCompo(queryInt_PortFourni);
				if (result == null) result = casePort(queryInt_PortFourni);
				if (result == null) result = caseInterface(queryInt_PortFourni);
				if (result == null) result = caseObjet(queryInt_PortFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.CALLED_ROLE_TO: {
				called_RoleTo called_RoleTo = (called_RoleTo)theEObject;
				T result = casecalled_RoleTo(called_RoleTo);
				if (result == null) result = caseRoleTo(called_RoleTo);
				if (result == null) result = caseRole(called_RoleTo);
				if (result == null) result = caseInterface(called_RoleTo);
				if (result == null) result = caseGlue(called_RoleTo);
				if (result == null) result = caseObjet(called_RoleTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.CLEARENCE_REQUEST_CONNECTOR: {
				ClearenceRequest_Connector clearenceRequest_Connector = (ClearenceRequest_Connector)theEObject;
				T result = caseClearenceRequest_Connector(clearenceRequest_Connector);
				if (result == null) result = caseConnecteurExplicite(clearenceRequest_Connector);
				if (result == null) result = caseConnecteur(clearenceRequest_Connector);
				if (result == null) result = caseElement(clearenceRequest_Connector);
				if (result == null) result = caseObjet(clearenceRequest_Connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.LIEN_ATTACHEMENT_XREQUEST: {
				LienAttachementXRequest lienAttachementXRequest = (LienAttachementXRequest)theEObject;
				T result = caseLienAttachementXRequest(lienAttachementXRequest);
				if (result == null) result = caseLienAttachementPFRF(lienAttachementXRequest);
				if (result == null) result = caseLienAttachement(lienAttachementXRequest);
				if (result == null) result = caseLien(lienAttachementXRequest);
				if (result == null) result = caseObjet(lienAttachementXRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.SECURITY_AUTH_PORT_FOURNI: {
				SecurityAuth_PortFourni securityAuth_PortFourni = (SecurityAuth_PortFourni)theEObject;
				T result = caseSecurityAuth_PortFourni(securityAuth_PortFourni);
				if (result == null) result = casePortFourniCompo(securityAuth_PortFourni);
				if (result == null) result = casePort(securityAuth_PortFourni);
				if (result == null) result = caseInterface(securityAuth_PortFourni);
				if (result == null) result = caseObjet(securityAuth_PortFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.ANSWER_REQUEST_PORT_FOURNI: {
				AnswerRequest_PortFourni answerRequest_PortFourni = (AnswerRequest_PortFourni)theEObject;
				T result = caseAnswerRequest_PortFourni(answerRequest_PortFourni);
				if (result == null) result = casePortFourniConfig(answerRequest_PortFourni);
				if (result == null) result = casePort(answerRequest_PortFourni);
				if (result == null) result = caseInterface(answerRequest_PortFourni);
				if (result == null) result = caseObjet(answerRequest_PortFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.SECURITY_QUERY_CONNECTOR: {
				SecurityQuery_Connector securityQuery_Connector = (SecurityQuery_Connector)theEObject;
				T result = caseSecurityQuery_Connector(securityQuery_Connector);
				if (result == null) result = caseConnecteurExplicite(securityQuery_Connector);
				if (result == null) result = caseConnecteur(securityQuery_Connector);
				if (result == null) result = caseElement(securityQuery_Connector);
				if (result == null) result = caseObjet(securityQuery_Connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.EXTERNAL_SOCKET_PORT_REQUIS: {
				ExternalSocket_PortRequis externalSocket_PortRequis = (ExternalSocket_PortRequis)theEObject;
				T result = caseExternalSocket_PortRequis(externalSocket_PortRequis);
				if (result == null) result = casePortRequisCompo(externalSocket_PortRequis);
				if (result == null) result = casePort(externalSocket_PortRequis);
				if (result == null) result = caseInterface(externalSocket_PortRequis);
				if (result == null) result = caseObjet(externalSocket_PortRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.CLEARENCE_REQUEST_ROLE_FROM: {
				ClearenceRequest_RoleFrom clearenceRequest_RoleFrom = (ClearenceRequest_RoleFrom)theEObject;
				T result = caseClearenceRequest_RoleFrom(clearenceRequest_RoleFrom);
				if (result == null) result = caseRoleFrom(clearenceRequest_RoleFrom);
				if (result == null) result = caseRole(clearenceRequest_RoleFrom);
				if (result == null) result = caseInterface(clearenceRequest_RoleFrom);
				if (result == null) result = caseGlue(clearenceRequest_RoleFrom);
				if (result == null) result = caseObjet(clearenceRequest_RoleFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.DB_QUERY_PORT_FOURNI: {
				DBQuery_PortFourni dbQuery_PortFourni = (DBQuery_PortFourni)theEObject;
				T result = caseDBQuery_PortFourni(dbQuery_PortFourni);
				if (result == null) result = casePortFourniCompo(dbQuery_PortFourni);
				if (result == null) result = casePort(dbQuery_PortFourni);
				if (result == null) result = caseInterface(dbQuery_PortFourni);
				if (result == null) result = caseObjet(dbQuery_PortFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.DB_QUERY_PORT_REQUIS: {
				DBQuery_PortRequis dbQuery_PortRequis = (DBQuery_PortRequis)theEObject;
				T result = caseDBQuery_PortRequis(dbQuery_PortRequis);
				if (result == null) result = casePortRequisCompo(dbQuery_PortRequis);
				if (result == null) result = casePort(dbQuery_PortRequis);
				if (result == null) result = caseInterface(dbQuery_PortRequis);
				if (result == null) result = caseObjet(dbQuery_PortRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.BINDING_SERVEUR_FOURNI: {
				BindingServeurFOurni bindingServeurFOurni = (BindingServeurFOurni)theEObject;
				T result = caseBindingServeurFOurni(bindingServeurFOurni);
				if (result == null) result = caseLienBindingFourni(bindingServeurFOurni);
				if (result == null) result = caseLienBinding(bindingServeurFOurni);
				if (result == null) result = caseLien(bindingServeurFOurni);
				if (result == null) result = caseObjet(bindingServeurFOurni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.LIEN_ATTACHEMENT_YANSWER: {
				LienAttachementYAnswer lienAttachementYAnswer = (LienAttachementYAnswer)theEObject;
				T result = caseLienAttachementYAnswer(lienAttachementYAnswer);
				if (result == null) result = caseLienAttachementPRRT(lienAttachementYAnswer);
				if (result == null) result = caseLienAttachement(lienAttachementYAnswer);
				if (result == null) result = caseLien(lienAttachementYAnswer);
				if (result == null) result = caseObjet(lienAttachementYAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.CALLED_ANSWER_ROLE_TO: {
				calledAnswer_RoleTo calledAnswer_RoleTo = (calledAnswer_RoleTo)theEObject;
				T result = casecalledAnswer_RoleTo(calledAnswer_RoleTo);
				if (result == null) result = caseRoleTo(calledAnswer_RoleTo);
				if (result == null) result = caseRole(calledAnswer_RoleTo);
				if (result == null) result = caseInterface(calledAnswer_RoleTo);
				if (result == null) result = caseGlue(calledAnswer_RoleTo);
				if (result == null) result = caseObjet(calledAnswer_RoleTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.SECURITY_CHECK_PORT_REQUIS: {
				SecurityCheck_PortRequis securityCheck_PortRequis = (SecurityCheck_PortRequis)theEObject;
				T result = caseSecurityCheck_PortRequis(securityCheck_PortRequis);
				if (result == null) result = casePortRequisCompo(securityCheck_PortRequis);
				if (result == null) result = casePort(securityCheck_PortRequis);
				if (result == null) result = caseInterface(securityCheck_PortRequis);
				if (result == null) result = caseObjet(securityCheck_PortRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.SQL_REQUEST_ROLE_FROM: {
				SQLRequest_RoleFrom sqlRequest_RoleFrom = (SQLRequest_RoleFrom)theEObject;
				T result = caseSQLRequest_RoleFrom(sqlRequest_RoleFrom);
				if (result == null) result = caseRoleFrom(sqlRequest_RoleFrom);
				if (result == null) result = caseRole(sqlRequest_RoleFrom);
				if (result == null) result = caseInterface(sqlRequest_RoleFrom);
				if (result == null) result = caseGlue(sqlRequest_RoleFrom);
				if (result == null) result = caseObjet(sqlRequest_RoleFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.ANSWER_REQUEST_PORT_FOURNI_CONFIG: {
				AnswerRequest_PortFourniConfig answerRequest_PortFourniConfig = (AnswerRequest_PortFourniConfig)theEObject;
				T result = caseAnswerRequest_PortFourniConfig(answerRequest_PortFourniConfig);
				if (result == null) result = casePortFourniConfig(answerRequest_PortFourniConfig);
				if (result == null) result = casePort(answerRequest_PortFourniConfig);
				if (result == null) result = caseInterface(answerRequest_PortFourniConfig);
				if (result == null) result = caseObjet(answerRequest_PortFourniConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.CALLER_ROLE_FROM: {
				caller_RoleFrom caller_RoleFrom = (caller_RoleFrom)theEObject;
				T result = casecaller_RoleFrom(caller_RoleFrom);
				if (result == null) result = caseRoleFrom(caller_RoleFrom);
				if (result == null) result = caseRole(caller_RoleFrom);
				if (result == null) result = caseInterface(caller_RoleFrom);
				if (result == null) result = caseGlue(caller_RoleFrom);
				if (result == null) result = caseObjet(caller_RoleFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.LIEN_ATTACHEMENT_X1: {
				LienAttachementX1 lienAttachementX1 = (LienAttachementX1)theEObject;
				T result = caseLienAttachementX1(lienAttachementX1);
				if (result == null) result = caseLienAttachementPFRF(lienAttachementX1);
				if (result == null) result = caseLienAttachement(lienAttachementX1);
				if (result == null) result = caseLien(lienAttachementX1);
				if (result == null) result = caseObjet(lienAttachementX1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.CQUERY_PORT_REQUIS: {
				CQuery_PortRequis cQuery_PortRequis = (CQuery_PortRequis)theEObject;
				T result = caseCQuery_PortRequis(cQuery_PortRequis);
				if (result == null) result = casePortRequisCompo(cQuery_PortRequis);
				if (result == null) result = casePort(cQuery_PortRequis);
				if (result == null) result = caseInterface(cQuery_PortRequis);
				if (result == null) result = caseObjet(cQuery_PortRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.SQL_REQUEST_ROLE_TO: {
				SQLRequest_RoleTo sqlRequest_RoleTo = (SQLRequest_RoleTo)theEObject;
				T result = caseSQLRequest_RoleTo(sqlRequest_RoleTo);
				if (result == null) result = caseRoleTo(sqlRequest_RoleTo);
				if (result == null) result = caseRole(sqlRequest_RoleTo);
				if (result == null) result = caseInterface(sqlRequest_RoleTo);
				if (result == null) result = caseGlue(sqlRequest_RoleTo);
				if (result == null) result = caseObjet(sqlRequest_RoleTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.SECURITY_QUERY_ROLE_TO: {
				SecurityQuery_RoleTo securityQuery_RoleTo = (SecurityQuery_RoleTo)theEObject;
				T result = caseSecurityQuery_RoleTo(securityQuery_RoleTo);
				if (result == null) result = caseRoleTo(securityQuery_RoleTo);
				if (result == null) result = caseRole(securityQuery_RoleTo);
				if (result == null) result = caseInterface(securityQuery_RoleTo);
				if (result == null) result = caseGlue(securityQuery_RoleTo);
				if (result == null) result = caseObjet(securityQuery_RoleTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.LIEN_ATTACHEMENT_X3: {
				LienAttachementX3 lienAttachementX3 = (LienAttachementX3)theEObject;
				T result = caseLienAttachementX3(lienAttachementX3);
				if (result == null) result = caseLienAttachementPFRF(lienAttachementX3);
				if (result == null) result = caseLienAttachement(lienAttachementX3);
				if (result == null) result = caseLien(lienAttachementX3);
				if (result == null) result = caseObjet(lienAttachementX3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.SECURITY_QUERY_ROLE_FROM: {
				SecurityQuery_RoleFrom securityQuery_RoleFrom = (SecurityQuery_RoleFrom)theEObject;
				T result = caseSecurityQuery_RoleFrom(securityQuery_RoleFrom);
				if (result == null) result = caseRoleFrom(securityQuery_RoleFrom);
				if (result == null) result = caseRole(securityQuery_RoleFrom);
				if (result == null) result = caseInterface(securityQuery_RoleFrom);
				if (result == null) result = caseGlue(securityQuery_RoleFrom);
				if (result == null) result = caseObjet(securityQuery_RoleFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.ANSWER_REQUEST_PORT_FOURNI_COMPO: {
				AnswerRequest_PortFourniCompo answerRequest_PortFourniCompo = (AnswerRequest_PortFourniCompo)theEObject;
				T result = caseAnswerRequest_PortFourniCompo(answerRequest_PortFourniCompo);
				if (result == null) result = casePortFourniCompo(answerRequest_PortFourniCompo);
				if (result == null) result = casePort(answerRequest_PortFourniCompo);
				if (result == null) result = caseInterface(answerRequest_PortFourniCompo);
				if (result == null) result = caseObjet(answerRequest_PortFourniCompo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.LIEN_ATTACHEMENT_Y5: {
				LienAttachementY5 lienAttachementY5 = (LienAttachementY5)theEObject;
				T result = caseLienAttachementY5(lienAttachementY5);
				if (result == null) result = caseLienAttachementPRRT(lienAttachementY5);
				if (result == null) result = caseLienAttachement(lienAttachementY5);
				if (result == null) result = caseLien(lienAttachementY5);
				if (result == null) result = caseObjet(lienAttachementY5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.SECURITY_MANAGER_COMPOSANT: {
				SecurityManager_Composant securityManager_Composant = (SecurityManager_Composant)theEObject;
				T result = caseSecurityManager_Composant(securityManager_Composant);
				if (result == null) result = caseComposant(securityManager_Composant);
				if (result == null) result = caseElement(securityManager_Composant);
				if (result == null) result = caseObserver(securityManager_Composant);
				if (result == null) result = caseObjet(securityManager_Composant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT: {
				ConnectionManager_Composant connectionManager_Composant = (ConnectionManager_Composant)theEObject;
				T result = caseConnectionManager_Composant(connectionManager_Composant);
				if (result == null) result = caseComposant(connectionManager_Composant);
				if (result == null) result = caseElement(connectionManager_Composant);
				if (result == null) result = caseObserver(connectionManager_Composant);
				if (result == null) result = caseObjet(connectionManager_Composant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.BINDING_REQUIS_SERVEUR_CONFIG: {
				bindingRequisServeurConfig bindingRequisServeurConfig = (bindingRequisServeurConfig)theEObject;
				T result = casebindingRequisServeurConfig(bindingRequisServeurConfig);
				if (result == null) result = caseLienBindingRequis(bindingRequisServeurConfig);
				if (result == null) result = caseLienBinding(bindingRequisServeurConfig);
				if (result == null) result = caseLien(bindingRequisServeurConfig);
				if (result == null) result = caseObjet(bindingRequisServeurConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.SECURITY_MANAGEMENT_PORT_REQUIS: {
				SecurityManagement_PortRequis securityManagement_PortRequis = (SecurityManagement_PortRequis)theEObject;
				T result = caseSecurityManagement_PortRequis(securityManagement_PortRequis);
				if (result == null) result = casePortRequisCompo(securityManagement_PortRequis);
				if (result == null) result = casePort(securityManagement_PortRequis);
				if (result == null) result = caseInterface(securityManagement_PortRequis);
				if (result == null) result = caseObjet(securityManagement_PortRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.LIEN_ATTACHEMENT_X2: {
				LienAttachementX2 lienAttachementX2 = (LienAttachementX2)theEObject;
				T result = caseLienAttachementX2(lienAttachementX2);
				if (result == null) result = caseLienAttachementPFRF(lienAttachementX2);
				if (result == null) result = caseLienAttachement(lienAttachementX2);
				if (result == null) result = caseLien(lienAttachementX2);
				if (result == null) result = caseObjet(lienAttachementX2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.LIEN_ATTACHEMENT_YREQUEST: {
				LienAttachementYRequest lienAttachementYRequest = (LienAttachementYRequest)theEObject;
				T result = caseLienAttachementYRequest(lienAttachementYRequest);
				if (result == null) result = caseLienAttachementPRRT(lienAttachementYRequest);
				if (result == null) result = caseLienAttachement(lienAttachementYRequest);
				if (result == null) result = caseLien(lienAttachementYRequest);
				if (result == null) result = caseObjet(lienAttachementYRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.SYSTEME_CONFIGURATION: {
				Systeme_Configuration systeme_Configuration = (Systeme_Configuration)theEObject;
				T result = caseSysteme_Configuration(systeme_Configuration);
				if (result == null) result = caseConfiguration(systeme_Configuration);
				if (result == null) result = caseElement(systeme_Configuration);
				if (result == null) result = caseObserver(systeme_Configuration);
				if (result == null) result = caseObjet(systeme_Configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.LIEN_ATTACHEMENT_XANSWER: {
				LienAttachementXAnswer lienAttachementXAnswer = (LienAttachementXAnswer)theEObject;
				T result = caseLienAttachementXAnswer(lienAttachementXAnswer);
				if (result == null) result = caseLienAttachementPFRF(lienAttachementXAnswer);
				if (result == null) result = caseLienAttachement(lienAttachementXAnswer);
				if (result == null) result = caseLien(lienAttachementXAnswer);
				if (result == null) result = caseObjet(lienAttachementXAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.BINDING_REQUIS_SERVEUR_DETAILS: {
				bindingRequisServeurDetails bindingRequisServeurDetails = (bindingRequisServeurDetails)theEObject;
				T result = casebindingRequisServeurDetails(bindingRequisServeurDetails);
				if (result == null) result = caseLienBindingRequis(bindingRequisServeurDetails);
				if (result == null) result = caseLienBinding(bindingRequisServeurDetails);
				if (result == null) result = caseLien(bindingRequisServeurDetails);
				if (result == null) result = caseObjet(bindingRequisServeurDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.LIEN_ATTACHEMENT_X4: {
				LienAttachementX4 lienAttachementX4 = (LienAttachementX4)theEObject;
				T result = caseLienAttachementX4(lienAttachementX4);
				if (result == null) result = caseLienAttachementPFRF(lienAttachementX4);
				if (result == null) result = caseLienAttachement(lienAttachementX4);
				if (result == null) result = caseLien(lienAttachementX4);
				if (result == null) result = caseObjet(lienAttachementX4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.DATABASE_COMPOSANT: {
				Database_Composant database_Composant = (Database_Composant)theEObject;
				T result = caseDatabase_Composant(database_Composant);
				if (result == null) result = caseComposant(database_Composant);
				if (result == null) result = caseElement(database_Composant);
				if (result == null) result = caseObserver(database_Composant);
				if (result == null) result = caseObjet(database_Composant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.CQUERY_PORT_FOURNI: {
				CQuery_PortFourni cQuery_PortFourni = (CQuery_PortFourni)theEObject;
				T result = caseCQuery_PortFourni(cQuery_PortFourni);
				if (result == null) result = casePortFourniCompo(cQuery_PortFourni);
				if (result == null) result = casePort(cQuery_PortFourni);
				if (result == null) result = caseInterface(cQuery_PortFourni);
				if (result == null) result = caseObjet(cQuery_PortFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.LIEN_ATTACHEMENT_X5: {
				LienAttachementX5 lienAttachementX5 = (LienAttachementX5)theEObject;
				T result = caseLienAttachementX5(lienAttachementX5);
				if (result == null) result = caseLienAttachementPFRF(lienAttachementX5);
				if (result == null) result = caseLienAttachement(lienAttachementX5);
				if (result == null) result = caseLien(lienAttachementX5);
				if (result == null) result = caseObjet(lienAttachementX5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.RECEIVE_REQUEST_REQUIS_CONFIG: {
				ReceiveRequestRequisConfig receiveRequestRequisConfig = (ReceiveRequestRequisConfig)theEObject;
				T result = caseReceiveRequestRequisConfig(receiveRequestRequisConfig);
				if (result == null) result = casePortRequisConfig(receiveRequestRequisConfig);
				if (result == null) result = casePort(receiveRequestRequisConfig);
				if (result == null) result = caseInterface(receiveRequestRequisConfig);
				if (result == null) result = caseObjet(receiveRequestRequisConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.EXTERNAL_BINDING_ANSWER_REQUEST: {
				ExternalBindingAnswerRequest externalBindingAnswerRequest = (ExternalBindingAnswerRequest)theEObject;
				T result = caseExternalBindingAnswerRequest(externalBindingAnswerRequest);
				if (result == null) result = caseLienBindingFourni(externalBindingAnswerRequest);
				if (result == null) result = caseLienBinding(externalBindingAnswerRequest);
				if (result == null) result = caseLien(externalBindingAnswerRequest);
				if (result == null) result = caseObjet(externalBindingAnswerRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.EXTERNAL_PORT_REQUIS_CLIENT_SEND_REQUEST: {
				ExternalPortRequisClientSendRequest externalPortRequisClientSendRequest = (ExternalPortRequisClientSendRequest)theEObject;
				T result = caseExternalPortRequisClientSendRequest(externalPortRequisClientSendRequest);
				if (result == null) result = casePortRequisCompo(externalPortRequisClientSendRequest);
				if (result == null) result = casePort(externalPortRequisClientSendRequest);
				if (result == null) result = caseInterface(externalPortRequisClientSendRequest);
				if (result == null) result = caseObjet(externalPortRequisClientSendRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.EXTERNAL_PORT_FOURNI_CLIENT_ANSWER_REQUEST: {
				ExternalPortFourniClientAnswerRequest externalPortFourniClientAnswerRequest = (ExternalPortFourniClientAnswerRequest)theEObject;
				T result = caseExternalPortFourniClientAnswerRequest(externalPortFourniClientAnswerRequest);
				if (result == null) result = casePortFourniCompo(externalPortFourniClientAnswerRequest);
				if (result == null) result = casePort(externalPortFourniClientAnswerRequest);
				if (result == null) result = caseInterface(externalPortFourniClientAnswerRequest);
				if (result == null) result = caseObjet(externalPortFourniClientAnswerRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.RETOUR_CLEARENCE_REQUEST_ROLE_FROM: {
				RetourClearenceRequest_RoleFrom retourClearenceRequest_RoleFrom = (RetourClearenceRequest_RoleFrom)theEObject;
				T result = caseRetourClearenceRequest_RoleFrom(retourClearenceRequest_RoleFrom);
				if (result == null) result = caseRoleFrom(retourClearenceRequest_RoleFrom);
				if (result == null) result = caseRole(retourClearenceRequest_RoleFrom);
				if (result == null) result = caseInterface(retourClearenceRequest_RoleFrom);
				if (result == null) result = caseGlue(retourClearenceRequest_RoleFrom);
				if (result == null) result = caseObjet(retourClearenceRequest_RoleFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HADLM1Package.RETOUR_CLEARENCE_REQUEST_ROLE_TO: {
				RetourClearenceRequest_RoleTo retourClearenceRequest_RoleTo = (RetourClearenceRequest_RoleTo)theEObject;
				T result = caseRetourClearenceRequest_RoleTo(retourClearenceRequest_RoleTo);
				if (result == null) result = caseRoleTo(retourClearenceRequest_RoleTo);
				if (result == null) result = caseRole(retourClearenceRequest_RoleTo);
				if (result == null) result = caseInterface(retourClearenceRequest_RoleTo);
				if (result == null) result = caseGlue(retourClearenceRequest_RoleTo);
				if (result == null) result = caseObjet(retourClearenceRequest_RoleTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Check Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Check Port Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityCheck_PortFourni(SecurityCheck_PortFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Socket Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Socket Port Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalSocket_PortFourni(ExternalSocket_PortFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement Y6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement Y6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementY6(LienAttachementY6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serveur Composant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serveur Composant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServeur_Composant(Serveur_Composant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Int Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Int Port Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryInt_PortRequis(QueryInt_PortRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement Y4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement Y4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementY4(LienAttachementY4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement X6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement X6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementX6(LienAttachementX6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Binding Send Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Binding Send Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalBindingSendRequest(ExternalBindingSendRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client Composant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client Composant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient_Composant(Client_Composant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive request Port Requis Compo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive request Port Requis Compo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceive_request_PortRequisCompo(Receive_request_PortRequisCompo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Request Port Requis Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Request Port Requis Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendRequest_PortRequisConfig(SendRequest_PortRequisConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clearence Request Role To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clearence Request Role To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearenceRequest_RoleTo(ClearenceRequest_RoleTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQL Request Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQL Request Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQLRequest_Connector(SQLRequest_Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send request Port Fourni Compo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send request Port Fourni Compo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSend_request_PortFourniCompo(Send_request_PortFourniCompo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Management Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Management Port Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityManagement_PortFourni(SecurityManagement_PortFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement Y2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement Y2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementY2(LienAttachementY2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>caller Answer Role From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>caller Answer Role From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecallerAnswer_RoleFrom(callerAnswer_RoleFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serveur Details Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serveur Details Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServeurDetails_Configuration(ServeurDetails_Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Auth Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Auth Port Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityAuth_PortRequis(SecurityAuth_PortRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Answer Request Port Requis Compo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Answer Request Port Requis Compo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnswerRequest_PortRequisCompo(AnswerRequest_PortRequisCompo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement Y1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement Y1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementY1(LienAttachementY1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPC Connector Explicite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPC Connector Explicite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPC_ConnectorExplicite(RPC_ConnectorExplicite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement Y3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement Y3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementY3(LienAttachementY3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Serveur Fourni Compo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Serveur Fourni Compo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingServeurFourniCompo(BindingServeurFourniCompo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Int Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Int Port Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryInt_PortFourni(QueryInt_PortFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>called Role To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>called Role To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecalled_RoleTo(called_RoleTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clearence Request Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clearence Request Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearenceRequest_Connector(ClearenceRequest_Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement XRequest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement XRequest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementXRequest(LienAttachementXRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Auth Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Auth Port Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityAuth_PortFourni(SecurityAuth_PortFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Answer Request Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Answer Request Port Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnswerRequest_PortFourni(AnswerRequest_PortFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Query Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Query Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityQuery_Connector(SecurityQuery_Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Socket Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Socket Port Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalSocket_PortRequis(ExternalSocket_PortRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clearence Request Role From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clearence Request Role From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearenceRequest_RoleFrom(ClearenceRequest_RoleFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DB Query Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DB Query Port Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBQuery_PortFourni(DBQuery_PortFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DB Query Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DB Query Port Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBQuery_PortRequis(DBQuery_PortRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Serveur FOurni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Serveur FOurni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingServeurFOurni(BindingServeurFOurni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement YAnswer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement YAnswer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementYAnswer(LienAttachementYAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>called Answer Role To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>called Answer Role To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecalledAnswer_RoleTo(calledAnswer_RoleTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Check Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Check Port Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityCheck_PortRequis(SecurityCheck_PortRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQL Request Role From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQL Request Role From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQLRequest_RoleFrom(SQLRequest_RoleFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Answer Request Port Fourni Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Answer Request Port Fourni Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnswerRequest_PortFourniConfig(AnswerRequest_PortFourniConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>caller Role From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>caller Role From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecaller_RoleFrom(caller_RoleFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement X1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement X1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementX1(LienAttachementX1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CQuery Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CQuery Port Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCQuery_PortRequis(CQuery_PortRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQL Request Role To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQL Request Role To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQLRequest_RoleTo(SQLRequest_RoleTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Query Role To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Query Role To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityQuery_RoleTo(SecurityQuery_RoleTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement X3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement X3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementX3(LienAttachementX3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Query Role From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Query Role From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityQuery_RoleFrom(SecurityQuery_RoleFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Answer Request Port Fourni Compo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Answer Request Port Fourni Compo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnswerRequest_PortFourniCompo(AnswerRequest_PortFourniCompo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement Y5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement Y5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementY5(LienAttachementY5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Manager Composant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Manager Composant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityManager_Composant(SecurityManager_Composant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Manager Composant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Manager Composant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionManager_Composant(ConnectionManager_Composant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>binding Requis Serveur Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>binding Requis Serveur Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casebindingRequisServeurConfig(bindingRequisServeurConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Management Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Management Port Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityManagement_PortRequis(SecurityManagement_PortRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement X2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement X2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementX2(LienAttachementX2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement YRequest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement YRequest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementYRequest(LienAttachementYRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Systeme Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systeme Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysteme_Configuration(Systeme_Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement XAnswer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement XAnswer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementXAnswer(LienAttachementXAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>binding Requis Serveur Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>binding Requis Serveur Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casebindingRequisServeurDetails(bindingRequisServeurDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement X4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement X4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementX4(LienAttachementX4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Composant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Composant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase_Composant(Database_Composant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CQuery Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CQuery Port Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCQuery_PortFourni(CQuery_PortFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement X5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement X5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementX5(LienAttachementX5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Request Requis Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Request Requis Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveRequestRequisConfig(ReceiveRequestRequisConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Binding Answer Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Binding Answer Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalBindingAnswerRequest(ExternalBindingAnswerRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Port Requis Client Send Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Port Requis Client Send Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalPortRequisClientSendRequest(ExternalPortRequisClientSendRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Port Fourni Client Answer Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Port Fourni Client Answer Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalPortFourniClientAnswerRequest(ExternalPortFourniClientAnswerRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retour Clearence Request Role From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retour Clearence Request Role From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetourClearenceRequest_RoleFrom(RetourClearenceRequest_RoleFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retour Clearence Request Role To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retour Clearence Request Role To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetourClearenceRequest_RoleTo(RetourClearenceRequest_RoleTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjet(Objet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fourni Compo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fourni Compo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortFourniCompo(PortFourniCompo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLien(Lien object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachement(LienAttachement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement PRRT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement PRRT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementPRRT(LienAttachementPRRT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposant(Composant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement PFRF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement PFRF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementPFRF(LienAttachementPFRF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienBinding(LienBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Binding Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Binding Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienBindingRequis(LienBindingRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Compo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Compo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRequisCompo(PortRequisCompo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRequisConfig(PortRequisConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlue(Glue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleTo(RoleTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connecteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connecteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnecteur(Connecteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connecteur Explicite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connecteur Explicite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnecteurExplicite(ConnecteurExplicite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleFrom(RoleFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObserver(Observer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Binding Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Binding Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienBindingFourni(LienBindingFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fourni Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fourni Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortFourniConfig(PortFourniConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HADLM1Switch
