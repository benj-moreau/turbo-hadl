/**
 */
package hADLM1;

import hADL.Composant.ComposantPackage;

import hADL.Configuration.ConfigurationPackage;

import hADL.Connecteurs.ConnecteursPackage;

import hADL.HADLPackage;

import hADL.Interfaces.InterfacesPackage;

import hADL.Liens.LiensPackage;

import hADL.Roles.RolesPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hADLM1.HADLM1Factory
 * @generated
 */
public class HADLM1Package extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "hADLM1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.example.org/hADLM1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "hADLM1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HADLM1Package eINSTANCE = hADLM1.HADLM1Package.init();

	/**
	 * The meta object id for the '{@link hADLM1.SecurityCheck_PortFourni <em>Security Check Port Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.SecurityCheck_PortFourni
	 * @see hADLM1.HADLM1Package#getSecurityCheck_PortFourni()
	 * @generated
	 */
	public static final int SECURITY_CHECK_PORT_FOURNI = 0;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_CHECK_PORT_FOURNI__OBSERVER = InterfacesPackage.PORT_FOURNI_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>Security Check Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_CHECK_PORT_FOURNI_FEATURE_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_CHECK_PORT_FOURNI___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_FOURNI_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Security Check Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_CHECK_PORT_FOURNI_OPERATION_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.ExternalSocket_PortFourni <em>External Socket Port Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.ExternalSocket_PortFourni
	 * @see hADLM1.HADLM1Package#getExternalSocket_PortFourni()
	 * @generated
	 */
	public static final int EXTERNAL_SOCKET_PORT_FOURNI = 1;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_SOCKET_PORT_FOURNI__OBSERVER = InterfacesPackage.PORT_FOURNI_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>External Socket Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_SOCKET_PORT_FOURNI_FEATURE_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_SOCKET_PORT_FOURNI___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_FOURNI_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>External Socket Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_SOCKET_PORT_FOURNI_OPERATION_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.LienAttachementY6 <em>Lien Attachement Y6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.LienAttachementY6
	 * @see hADLM1.HADLM1Package#getLienAttachementY6()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT_Y6 = 2;

	/**
	 * The feature id for the '<em><b>Portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y6__PORTREQUIS = LiensPackage.LIEN_ATTACHEMENT_PRRT__PORTREQUIS;

	/**
	 * The feature id for the '<em><b>Roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y6__ROLETO = LiensPackage.LIEN_ATTACHEMENT_PRRT__ROLETO;

	/**
	 * The feature id for the '<em><b>Dbquery portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y6__DBQUERY_PORTREQUIS = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sqlrequest roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y6__SQLREQUEST_ROLETO = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Attachement Y6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y6_FEATURE_COUNT = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Attachement Y6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y6_OPERATION_COUNT = LiensPackage.LIEN_ATTACHEMENT_PRRT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.Serveur_Composant <em>Serveur Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.Serveur_Composant
	 * @see hADLM1.HADLM1Package#getServeur_Composant()
	 * @generated
	 */
	public static final int SERVEUR_COMPOSANT = 3;

	/**
	 * The feature id for the '<em><b>Child Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT__CHILD_CONFIGURATION = ComposantPackage.COMPOSANT__CHILD_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Child Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT__CHILD_COMPOSANT = ComposantPackage.COMPOSANT__CHILD_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Child Connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT__CHILD_CONNECTEUR = ComposantPackage.COMPOSANT__CHILD_CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Propriete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT__PROPRIETE = ComposantPackage.COMPOSANT__PROPRIETE;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT__CONTRAINTES = ComposantPackage.COMPOSANT__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Portrequiscompo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT__PORTREQUISCOMPO = ComposantPackage.COMPOSANT__PORTREQUISCOMPO;

	/**
	 * The feature id for the '<em><b>Portfournicompo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT__PORTFOURNICOMPO = ComposantPackage.COMPOSANT__PORTFOURNICOMPO;

	/**
	 * The feature id for the '<em><b>Lienbindingrequis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT__LIENBINDINGREQUIS = ComposantPackage.COMPOSANT__LIENBINDINGREQUIS;

	/**
	 * The feature id for the '<em><b>Lienbindingfourni</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT__LIENBINDINGFOURNI = ComposantPackage.COMPOSANT__LIENBINDINGFOURNI;

	/**
	 * The feature id for the '<em><b>Receive request port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT__RECEIVE_REQUEST_PORT = ComposantPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Serveurdetails configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT__SERVEURDETAILS_CONFIGURATION = ComposantPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Answerrequest portfournicompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT__ANSWERREQUEST_PORTFOURNICOMPO = ComposantPackage.COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bindingrequisserveurconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT__BINDINGREQUISSERVEURCONFIG = ComposantPackage.COMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bindingserveurfournicompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT__BINDINGSERVEURFOURNICOMPO = ComposantPackage.COMPOSANT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Serveur Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT_FEATURE_COUNT = ComposantPackage.COMPOSANT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT___ACTION_VIA_ROLE__ROLETO_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_ROLE__ROLETO_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT;

	/**
	 * The number of operations of the '<em>Serveur Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_COMPOSANT_OPERATION_COUNT = ComposantPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.QueryInt_PortRequis <em>Query Int Port Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.QueryInt_PortRequis
	 * @see hADLM1.HADLM1Package#getQueryInt_PortRequis()
	 * @generated
	 */
	public static final int QUERY_INT_PORT_REQUIS = 4;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_INT_PORT_REQUIS__OBSERVER = InterfacesPackage.PORT_REQUIS_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>Query Int Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_INT_PORT_REQUIS_FEATURE_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_INT_PORT_REQUIS___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_REQUIS_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Query Int Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_INT_PORT_REQUIS_OPERATION_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.LienAttachementY4 <em>Lien Attachement Y4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.LienAttachementY4
	 * @see hADLM1.HADLM1Package#getLienAttachementY4()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT_Y4 = 5;

	/**
	 * The feature id for the '<em><b>Portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y4__PORTREQUIS = LiensPackage.LIEN_ATTACHEMENT_PRRT__PORTREQUIS;

	/**
	 * The feature id for the '<em><b>Roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y4__ROLETO = LiensPackage.LIEN_ATTACHEMENT_PRRT__ROLETO;

	/**
	 * The feature id for the '<em><b>Securitycheck portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y4__SECURITYCHECK_PORTREQUIS = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clearencerequest roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y4__CLEARENCEREQUEST_ROLETO = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Attachement Y4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y4_FEATURE_COUNT = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Attachement Y4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y4_OPERATION_COUNT = LiensPackage.LIEN_ATTACHEMENT_PRRT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.LienAttachementX6 <em>Lien Attachement X6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.LienAttachementX6
	 * @see hADLM1.HADLM1Package#getLienAttachementX6()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT_X6 = 6;

	/**
	 * The feature id for the '<em><b>Portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X6__PORTFOURNI = LiensPackage.LIEN_ATTACHEMENT_PFRF__PORTFOURNI;

	/**
	 * The feature id for the '<em><b>Rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X6__ROLEFROM = LiensPackage.LIEN_ATTACHEMENT_PFRF__ROLEFROM;

	/**
	 * The feature id for the '<em><b>Securitycheck portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X6__SECURITYCHECK_PORTFOURNI = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clearencerequest rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X6__CLEARENCEREQUEST_ROLEFROM = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Attachement X6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X6_FEATURE_COUNT = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Attachement X6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X6_OPERATION_COUNT = LiensPackage.LIEN_ATTACHEMENT_PFRF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.ExternalBindingSendRequest <em>External Binding Send Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.ExternalBindingSendRequest
	 * @see hADLM1.HADLM1Package#getExternalBindingSendRequest()
	 * @generated
	 */
	public static final int EXTERNAL_BINDING_SEND_REQUEST = 7;

	/**
	 * The feature id for the '<em><b>Portrequiscompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_BINDING_SEND_REQUEST__PORTREQUISCOMPO = LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCOMPO;

	/**
	 * The feature id for the '<em><b>Portrequisconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_BINDING_SEND_REQUEST__PORTREQUISCONFIG = LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCONFIG;

	/**
	 * The feature id for the '<em><b>Sendrequest portrequisconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_BINDING_SEND_REQUEST__SENDREQUEST_PORTREQUISCONFIG = LiensPackage.LIEN_BINDING_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Externalportrequisclientsendrequest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_BINDING_SEND_REQUEST__EXTERNALPORTREQUISCLIENTSENDREQUEST = LiensPackage.LIEN_BINDING_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Binding Send Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_BINDING_SEND_REQUEST_FEATURE_COUNT = LiensPackage.LIEN_BINDING_REQUIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>External Binding Send Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_BINDING_SEND_REQUEST_OPERATION_COUNT = LiensPackage.LIEN_BINDING_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.Client_Composant <em>Client Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.Client_Composant
	 * @see hADLM1.HADLM1Package#getClient_Composant()
	 * @generated
	 */
	public static final int CLIENT_COMPOSANT = 8;

	/**
	 * The feature id for the '<em><b>Child Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT__CHILD_CONFIGURATION = ComposantPackage.COMPOSANT__CHILD_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Child Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT__CHILD_COMPOSANT = ComposantPackage.COMPOSANT__CHILD_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Child Connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT__CHILD_CONNECTEUR = ComposantPackage.COMPOSANT__CHILD_CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Propriete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT__PROPRIETE = ComposantPackage.COMPOSANT__PROPRIETE;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT__CONTRAINTES = ComposantPackage.COMPOSANT__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Portrequiscompo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT__PORTREQUISCOMPO = ComposantPackage.COMPOSANT__PORTREQUISCOMPO;

	/**
	 * The feature id for the '<em><b>Portfournicompo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT__PORTFOURNICOMPO = ComposantPackage.COMPOSANT__PORTFOURNICOMPO;

	/**
	 * The feature id for the '<em><b>Lienbindingrequis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT__LIENBINDINGREQUIS = ComposantPackage.COMPOSANT__LIENBINDINGREQUIS;

	/**
	 * The feature id for the '<em><b>Lienbindingfourni</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT__LIENBINDINGFOURNI = ComposantPackage.COMPOSANT__LIENBINDINGFOURNI;

	/**
	 * The feature id for the '<em><b>Send request port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT__SEND_REQUEST_PORT = ComposantPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Answerrequest portrequiscompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT__ANSWERREQUEST_PORTREQUISCOMPO = ComposantPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Externalportfourniclientanswerrequest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT__EXTERNALPORTFOURNICLIENTANSWERREQUEST = ComposantPackage.COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Externalportrequisclientsendrequest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT__EXTERNALPORTREQUISCLIENTSENDREQUEST = ComposantPackage.COMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Client Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT_FEATURE_COUNT = ComposantPackage.COMPOSANT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT___ACTION_VIA_ROLE__ROLETO_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_ROLE__ROLETO_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT;

	/**
	 * The number of operations of the '<em>Client Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_COMPOSANT_OPERATION_COUNT = ComposantPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.Receive_request_PortRequisCompo <em>Receive request Port Requis Compo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.Receive_request_PortRequisCompo
	 * @see hADLM1.HADLM1Package#getReceive_request_PortRequisCompo()
	 * @generated
	 */
	public static final int RECEIVE_REQUEST_PORT_REQUIS_COMPO = 9;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVE_REQUEST_PORT_REQUIS_COMPO__OBSERVER = InterfacesPackage.PORT_REQUIS_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>Receive request Port Requis Compo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVE_REQUEST_PORT_REQUIS_COMPO_FEATURE_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVE_REQUEST_PORT_REQUIS_COMPO___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_REQUIS_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Receive request Port Requis Compo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVE_REQUEST_PORT_REQUIS_COMPO_OPERATION_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.SendRequest_PortRequisConfig <em>Send Request Port Requis Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.SendRequest_PortRequisConfig
	 * @see hADLM1.HADLM1Package#getSendRequest_PortRequisConfig()
	 * @generated
	 */
	public static final int SEND_REQUEST_PORT_REQUIS_CONFIG = 10;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEND_REQUEST_PORT_REQUIS_CONFIG__OBSERVER = InterfacesPackage.PORT_REQUIS_CONFIG__OBSERVER;

	/**
	 * The number of structural features of the '<em>Send Request Port Requis Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEND_REQUEST_PORT_REQUIS_CONFIG_FEATURE_COUNT = InterfacesPackage.PORT_REQUIS_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEND_REQUEST_PORT_REQUIS_CONFIG___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_REQUIS_CONFIG___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Send Request Port Requis Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEND_REQUEST_PORT_REQUIS_CONFIG_OPERATION_COUNT = InterfacesPackage.PORT_REQUIS_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.called_RoleTo <em>called Role To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.called_RoleTo
	 * @see hADLM1.HADLM1Package#getcalled_RoleTo()
	 * @generated
	 */
	public static final int CALLED_ROLE_TO = 25;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLED_ROLE_TO__OBSERVER = RolesPackage.ROLE_TO__OBSERVER;

	/**
	 * The number of structural features of the '<em>called Role To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLED_ROLE_TO_FEATURE_COUNT = RolesPackage.ROLE_TO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLED_ROLE_TO___NOTIFY_CONFIG__OBJECT = RolesPackage.ROLE_TO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The operation id for the '<em>Fonct Liaison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLED_ROLE_TO___FONCT_LIAISON__ROLE_ROLE = RolesPackage.ROLE_TO___FONCT_LIAISON__ROLE_ROLE;

	/**
	 * The number of operations of the '<em>called Role To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLED_ROLE_TO_OPERATION_COUNT = RolesPackage.ROLE_TO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.ClearenceRequest_RoleTo <em>Clearence Request Role To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.ClearenceRequest_RoleTo
	 * @see hADLM1.HADLM1Package#getClearenceRequest_RoleTo()
	 * @generated
	 */
	public static final int CLEARENCE_REQUEST_ROLE_TO = 11;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_ROLE_TO__OBSERVER = CALLED_ROLE_TO__OBSERVER;

	/**
	 * The number of structural features of the '<em>Clearence Request Role To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_ROLE_TO_FEATURE_COUNT = CALLED_ROLE_TO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_ROLE_TO___NOTIFY_CONFIG__OBJECT = CALLED_ROLE_TO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The operation id for the '<em>Fonct Liaison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_ROLE_TO___FONCT_LIAISON__ROLE_ROLE = CALLED_ROLE_TO___FONCT_LIAISON__ROLE_ROLE;

	/**
	 * The number of operations of the '<em>Clearence Request Role To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_ROLE_TO_OPERATION_COUNT = CALLED_ROLE_TO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.SQLRequest_Connector <em>SQL Request Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.SQLRequest_Connector
	 * @see hADLM1.HADLM1Package#getSQLRequest_Connector()
	 * @generated
	 */
	public static final int SQL_REQUEST_CONNECTOR = 12;

	/**
	 * The feature id for the '<em><b>Child Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_CONNECTOR__CHILD_CONFIGURATION = ConnecteursPackage.CONNECTEUR_EXPLICITE__CHILD_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Child Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_CONNECTOR__CHILD_COMPOSANT = ConnecteursPackage.CONNECTEUR_EXPLICITE__CHILD_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Child Connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_CONNECTOR__CHILD_CONNECTEUR = ConnecteursPackage.CONNECTEUR_EXPLICITE__CHILD_CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Rolefrom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_CONNECTOR__ROLEFROM = ConnecteursPackage.CONNECTEUR_EXPLICITE__ROLEFROM;

	/**
	 * The feature id for the '<em><b>Roleto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_CONNECTOR__ROLETO = ConnecteursPackage.CONNECTEUR_EXPLICITE__ROLETO;

	/**
	 * The feature id for the '<em><b>Sqlrequest roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_CONNECTOR__SQLREQUEST_ROLETO = ConnecteursPackage.CONNECTEUR_EXPLICITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sqlrequest rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_CONNECTOR__SQLREQUEST_ROLEFROM = ConnecteursPackage.CONNECTEUR_EXPLICITE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SQL Request Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_CONNECTOR_FEATURE_COUNT = ConnecteursPackage.CONNECTEUR_EXPLICITE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SQL Request Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_CONNECTOR_OPERATION_COUNT = ConnecteursPackage.CONNECTEUR_EXPLICITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.Send_request_PortFourniCompo <em>Send request Port Fourni Compo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.Send_request_PortFourniCompo
	 * @see hADLM1.HADLM1Package#getSend_request_PortFourniCompo()
	 * @generated
	 */
	public static final int SEND_REQUEST_PORT_FOURNI_COMPO = 13;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEND_REQUEST_PORT_FOURNI_COMPO__OBSERVER = InterfacesPackage.PORT_FOURNI_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>Send request Port Fourni Compo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEND_REQUEST_PORT_FOURNI_COMPO_FEATURE_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEND_REQUEST_PORT_FOURNI_COMPO___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_FOURNI_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Send request Port Fourni Compo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEND_REQUEST_PORT_FOURNI_COMPO_OPERATION_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.SecurityManagement_PortFourni <em>Security Management Port Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.SecurityManagement_PortFourni
	 * @see hADLM1.HADLM1Package#getSecurityManagement_PortFourni()
	 * @generated
	 */
	public static final int SECURITY_MANAGEMENT_PORT_FOURNI = 14;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGEMENT_PORT_FOURNI__OBSERVER = InterfacesPackage.PORT_FOURNI_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>Security Management Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGEMENT_PORT_FOURNI_FEATURE_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGEMENT_PORT_FOURNI___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_FOURNI_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Security Management Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGEMENT_PORT_FOURNI_OPERATION_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.LienAttachementY2 <em>Lien Attachement Y2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.LienAttachementY2
	 * @see hADLM1.HADLM1Package#getLienAttachementY2()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT_Y2 = 15;

	/**
	 * The feature id for the '<em><b>Portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y2__PORTREQUIS = LiensPackage.LIEN_ATTACHEMENT_PRRT__PORTREQUIS;

	/**
	 * The feature id for the '<em><b>Roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y2__ROLETO = LiensPackage.LIEN_ATTACHEMENT_PRRT__ROLETO;

	/**
	 * The feature id for the '<em><b>Queryint portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y2__QUERYINT_PORTREQUIS = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sqlrequest roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y2__SQLREQUEST_ROLETO = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Attachement Y2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y2_FEATURE_COUNT = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Attachement Y2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y2_OPERATION_COUNT = LiensPackage.LIEN_ATTACHEMENT_PRRT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.callerAnswer_RoleFrom <em>caller Answer Role From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.callerAnswer_RoleFrom
	 * @see hADLM1.HADLM1Package#getcallerAnswer_RoleFrom()
	 * @generated
	 */
	public static final int CALLER_ANSWER_ROLE_FROM = 16;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLER_ANSWER_ROLE_FROM__OBSERVER = RolesPackage.ROLE_FROM__OBSERVER;

	/**
	 * The number of structural features of the '<em>caller Answer Role From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLER_ANSWER_ROLE_FROM_FEATURE_COUNT = RolesPackage.ROLE_FROM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLER_ANSWER_ROLE_FROM___NOTIFY_CONFIG__OBJECT = RolesPackage.ROLE_FROM___NOTIFY_CONFIG__OBJECT;

	/**
	 * The operation id for the '<em>Fonct Liaison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLER_ANSWER_ROLE_FROM___FONCT_LIAISON__ROLE_ROLE = RolesPackage.ROLE_FROM___FONCT_LIAISON__ROLE_ROLE;

	/**
	 * The number of operations of the '<em>caller Answer Role From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLER_ANSWER_ROLE_FROM_OPERATION_COUNT = RolesPackage.ROLE_FROM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.ServeurDetails_Configuration <em>Serveur Details Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.ServeurDetails_Configuration
	 * @see hADLM1.HADLM1Package#getServeurDetails_Configuration()
	 * @generated
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION = 17;

	/**
	 * The feature id for the '<em><b>Child Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__CHILD_CONFIGURATION = ConfigurationPackage.CONFIGURATION__CHILD_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Child Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__CHILD_COMPOSANT = ConfigurationPackage.CONFIGURATION__CHILD_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Child Connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__CHILD_CONNECTEUR = ConfigurationPackage.CONFIGURATION__CHILD_CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Portrequisconfig</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__PORTREQUISCONFIG = ConfigurationPackage.CONFIGURATION__PORTREQUISCONFIG;

	/**
	 * The feature id for the '<em><b>Portfourniconfig</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__PORTFOURNICONFIG = ConfigurationPackage.CONFIGURATION__PORTFOURNICONFIG;

	/**
	 * The feature id for the '<em><b>Lienbindingrequis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__LIENBINDINGREQUIS = ConfigurationPackage.CONFIGURATION__LIENBINDINGREQUIS;

	/**
	 * The feature id for the '<em><b>Lienbindingfourni</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__LIENBINDINGFOURNI = ConfigurationPackage.CONFIGURATION__LIENBINDINGFOURNI;

	/**
	 * The feature id for the '<em><b>Lienattachementprrt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTPRRT = ConfigurationPackage.CONFIGURATION__LIENATTACHEMENTPRRT;

	/**
	 * The feature id for the '<em><b>Lienattachementpfrf</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTPFRF = ConfigurationPackage.CONFIGURATION__LIENATTACHEMENTPFRF;

	/**
	 * The feature id for the '<em><b>Connectionmanager composant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__CONNECTIONMANAGER_COMPOSANT = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Securitymanager composant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__SECURITYMANAGER_COMPOSANT = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Database composant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__DATABASE_COMPOSANT = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Clearencerequest connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__CLEARENCEREQUEST_CONNECTOR = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sqlrequest connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__SQLREQUEST_CONNECTOR = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Securityquery connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__SECURITYQUERY_CONNECTOR = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lienattachementx1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX1 = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lienattachementx2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX2 = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Lienattachementx3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX3 = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Lienattachementx4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX4 = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Lienattachementx5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX5 = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Lienattachementx6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX6 = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Lienattachementy1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY1 = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Lienattachementy2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY2 = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Lienattachementy3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY3 = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Lienattachementy6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY6 = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Lienattachementy4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY4 = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Lienattachementy5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY5 = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Receiverequestrequisconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__RECEIVEREQUESTREQUISCONFIG = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Answerrequest portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__ANSWERREQUEST_PORTFOURNI = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Bindingserveurfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__BINDINGSERVEURFOURNI = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Bindingrequisserveurdetails</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION__BINDINGREQUISSERVEURDETAILS = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Serveur Details Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION_FEATURE_COUNT = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 22;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT = ConfigurationPackage.CONFIGURATION___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION___ACTION_VIA_ROLE__ROLETO_OBJECT = ConfigurationPackage.CONFIGURATION___ACTION_VIA_ROLE__ROLETO_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT = ConfigurationPackage.CONFIGURATION___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT = ConfigurationPackage.CONFIGURATION___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT = ConfigurationPackage.CONFIGURATION___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT;

	/**
	 * The number of operations of the '<em>Serveur Details Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVEUR_DETAILS_CONFIGURATION_OPERATION_COUNT = ConfigurationPackage.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.SecurityAuth_PortRequis <em>Security Auth Port Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.SecurityAuth_PortRequis
	 * @see hADLM1.HADLM1Package#getSecurityAuth_PortRequis()
	 * @generated
	 */
	public static final int SECURITY_AUTH_PORT_REQUIS = 18;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_AUTH_PORT_REQUIS__OBSERVER = InterfacesPackage.PORT_REQUIS_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>Security Auth Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_AUTH_PORT_REQUIS_FEATURE_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_AUTH_PORT_REQUIS___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_REQUIS_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Security Auth Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_AUTH_PORT_REQUIS_OPERATION_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.AnswerRequest_PortRequisCompo <em>Answer Request Port Requis Compo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.AnswerRequest_PortRequisCompo
	 * @see hADLM1.HADLM1Package#getAnswerRequest_PortRequisCompo()
	 * @generated
	 */
	public static final int ANSWER_REQUEST_PORT_REQUIS_COMPO = 19;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANSWER_REQUEST_PORT_REQUIS_COMPO__OBSERVER = InterfacesPackage.PORT_REQUIS_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>Answer Request Port Requis Compo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANSWER_REQUEST_PORT_REQUIS_COMPO_FEATURE_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANSWER_REQUEST_PORT_REQUIS_COMPO___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_REQUIS_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Answer Request Port Requis Compo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANSWER_REQUEST_PORT_REQUIS_COMPO_OPERATION_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.LienAttachementY1 <em>Lien Attachement Y1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.LienAttachementY1
	 * @see hADLM1.HADLM1Package#getLienAttachementY1()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT_Y1 = 20;

	/**
	 * The feature id for the '<em><b>Portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y1__PORTREQUIS = LiensPackage.LIEN_ATTACHEMENT_PRRT__PORTREQUIS;

	/**
	 * The feature id for the '<em><b>Roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y1__ROLETO = LiensPackage.LIEN_ATTACHEMENT_PRRT__ROLETO;

	/**
	 * The feature id for the '<em><b>Securitymanagement portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y1__SECURITYMANAGEMENT_PORTREQUIS = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Securityquery roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y1__SECURITYQUERY_ROLETO = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Attachement Y1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y1_FEATURE_COUNT = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Attachement Y1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y1_OPERATION_COUNT = LiensPackage.LIEN_ATTACHEMENT_PRRT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.RPC_ConnectorExplicite <em>RPC Connector Explicite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.RPC_ConnectorExplicite
	 * @see hADLM1.HADLM1Package#getRPC_ConnectorExplicite()
	 * @generated
	 */
	public static final int RPC_CONNECTOR_EXPLICITE = 21;

	/**
	 * The feature id for the '<em><b>Child Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RPC_CONNECTOR_EXPLICITE__CHILD_CONFIGURATION = ConnecteursPackage.CONNECTEUR_EXPLICITE__CHILD_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Child Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RPC_CONNECTOR_EXPLICITE__CHILD_COMPOSANT = ConnecteursPackage.CONNECTEUR_EXPLICITE__CHILD_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Child Connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RPC_CONNECTOR_EXPLICITE__CHILD_CONNECTEUR = ConnecteursPackage.CONNECTEUR_EXPLICITE__CHILD_CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Rolefrom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RPC_CONNECTOR_EXPLICITE__ROLEFROM = ConnecteursPackage.CONNECTEUR_EXPLICITE__ROLEFROM;

	/**
	 * The feature id for the '<em><b>Roleto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RPC_CONNECTOR_EXPLICITE__ROLETO = ConnecteursPackage.CONNECTEUR_EXPLICITE__ROLETO;

	/**
	 * The feature id for the '<em><b>Caller role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RPC_CONNECTOR_EXPLICITE__CALLER_ROLE = ConnecteursPackage.CONNECTEUR_EXPLICITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Called roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RPC_CONNECTOR_EXPLICITE__CALLED_ROLETO = ConnecteursPackage.CONNECTEUR_EXPLICITE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Calledanswer roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RPC_CONNECTOR_EXPLICITE__CALLEDANSWER_ROLETO = ConnecteursPackage.CONNECTEUR_EXPLICITE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Calleranswer rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RPC_CONNECTOR_EXPLICITE__CALLERANSWER_ROLEFROM = ConnecteursPackage.CONNECTEUR_EXPLICITE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>RPC Connector Explicite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RPC_CONNECTOR_EXPLICITE_FEATURE_COUNT = ConnecteursPackage.CONNECTEUR_EXPLICITE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>RPC Connector Explicite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RPC_CONNECTOR_EXPLICITE_OPERATION_COUNT = ConnecteursPackage.CONNECTEUR_EXPLICITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.LienAttachementY3 <em>Lien Attachement Y3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.LienAttachementY3
	 * @see hADLM1.HADLM1Package#getLienAttachementY3()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT_Y3 = 22;

	/**
	 * The feature id for the '<em><b>Portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y3__PORTREQUIS = LiensPackage.LIEN_ATTACHEMENT_PRRT__PORTREQUIS;

	/**
	 * The feature id for the '<em><b>Roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y3__ROLETO = LiensPackage.LIEN_ATTACHEMENT_PRRT__ROLETO;

	/**
	 * The feature id for the '<em><b>Securityauth portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y3__SECURITYAUTH_PORTREQUIS = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clearencerequest roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y3__CLEARENCEREQUEST_ROLETO = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Attachement Y3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y3_FEATURE_COUNT = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Attachement Y3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y3_OPERATION_COUNT = LiensPackage.LIEN_ATTACHEMENT_PRRT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.BindingServeurFourniCompo <em>Binding Serveur Fourni Compo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.BindingServeurFourniCompo
	 * @see hADLM1.HADLM1Package#getBindingServeurFourniCompo()
	 * @generated
	 */
	public static final int BINDING_SERVEUR_FOURNI_COMPO = 23;

	/**
	 * The feature id for the '<em><b>Portfournicompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_SERVEUR_FOURNI_COMPO__PORTFOURNICOMPO = LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICOMPO;

	/**
	 * The feature id for the '<em><b>Portfourniconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_SERVEUR_FOURNI_COMPO__PORTFOURNICONFIG = LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICONFIG;

	/**
	 * The feature id for the '<em><b>Answerrequest portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_SERVEUR_FOURNI_COMPO__ANSWERREQUEST_PORTFOURNI = LiensPackage.LIEN_BINDING_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Answerrequest portfournicompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_SERVEUR_FOURNI_COMPO__ANSWERREQUEST_PORTFOURNICOMPO = LiensPackage.LIEN_BINDING_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding Serveur Fourni Compo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_SERVEUR_FOURNI_COMPO_FEATURE_COUNT = LiensPackage.LIEN_BINDING_FOURNI_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binding Serveur Fourni Compo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_SERVEUR_FOURNI_COMPO_OPERATION_COUNT = LiensPackage.LIEN_BINDING_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.QueryInt_PortFourni <em>Query Int Port Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.QueryInt_PortFourni
	 * @see hADLM1.HADLM1Package#getQueryInt_PortFourni()
	 * @generated
	 */
	public static final int QUERY_INT_PORT_FOURNI = 24;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_INT_PORT_FOURNI__OBSERVER = InterfacesPackage.PORT_FOURNI_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>Query Int Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_INT_PORT_FOURNI_FEATURE_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_INT_PORT_FOURNI___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_FOURNI_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Query Int Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_INT_PORT_FOURNI_OPERATION_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.ClearenceRequest_Connector <em>Clearence Request Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.ClearenceRequest_Connector
	 * @see hADLM1.HADLM1Package#getClearenceRequest_Connector()
	 * @generated
	 */
	public static final int CLEARENCE_REQUEST_CONNECTOR = 26;

	/**
	 * The feature id for the '<em><b>Child Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_CONNECTOR__CHILD_CONFIGURATION = ConnecteursPackage.CONNECTEUR_EXPLICITE__CHILD_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Child Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_CONNECTOR__CHILD_COMPOSANT = ConnecteursPackage.CONNECTEUR_EXPLICITE__CHILD_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Child Connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_CONNECTOR__CHILD_CONNECTEUR = ConnecteursPackage.CONNECTEUR_EXPLICITE__CHILD_CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Rolefrom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_CONNECTOR__ROLEFROM = ConnecteursPackage.CONNECTEUR_EXPLICITE__ROLEFROM;

	/**
	 * The feature id for the '<em><b>Roleto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_CONNECTOR__ROLETO = ConnecteursPackage.CONNECTEUR_EXPLICITE__ROLETO;

	/**
	 * The feature id for the '<em><b>Clearencerequest roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_CONNECTOR__CLEARENCEREQUEST_ROLETO = ConnecteursPackage.CONNECTEUR_EXPLICITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clearencerequest rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_CONNECTOR__CLEARENCEREQUEST_ROLEFROM = ConnecteursPackage.CONNECTEUR_EXPLICITE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clearence Request Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_CONNECTOR_FEATURE_COUNT = ConnecteursPackage.CONNECTEUR_EXPLICITE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Clearence Request Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_CONNECTOR_OPERATION_COUNT = ConnecteursPackage.CONNECTEUR_EXPLICITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.LienAttachementXRequest <em>Lien Attachement XRequest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.LienAttachementXRequest
	 * @see hADLM1.HADLM1Package#getLienAttachementXRequest()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT_XREQUEST = 27;

	/**
	 * The feature id for the '<em><b>Portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_XREQUEST__PORTFOURNI = LiensPackage.LIEN_ATTACHEMENT_PFRF__PORTFOURNI;

	/**
	 * The feature id for the '<em><b>Rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_XREQUEST__ROLEFROM = LiensPackage.LIEN_ATTACHEMENT_PFRF__ROLEFROM;

	/**
	 * The feature id for the '<em><b>Caller rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_XREQUEST__CALLER_ROLEFROM = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>W</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_XREQUEST__W = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Attachement XRequest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_XREQUEST_FEATURE_COUNT = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Attachement XRequest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_XREQUEST_OPERATION_COUNT = LiensPackage.LIEN_ATTACHEMENT_PFRF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.SecurityAuth_PortFourni <em>Security Auth Port Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.SecurityAuth_PortFourni
	 * @see hADLM1.HADLM1Package#getSecurityAuth_PortFourni()
	 * @generated
	 */
	public static final int SECURITY_AUTH_PORT_FOURNI = 28;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_AUTH_PORT_FOURNI__OBSERVER = InterfacesPackage.PORT_FOURNI_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>Security Auth Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_AUTH_PORT_FOURNI_FEATURE_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_AUTH_PORT_FOURNI___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_FOURNI_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Security Auth Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_AUTH_PORT_FOURNI_OPERATION_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.AnswerRequest_PortFourni <em>Answer Request Port Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.AnswerRequest_PortFourni
	 * @see hADLM1.HADLM1Package#getAnswerRequest_PortFourni()
	 * @generated
	 */
	public static final int ANSWER_REQUEST_PORT_FOURNI = 29;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANSWER_REQUEST_PORT_FOURNI__OBSERVER = InterfacesPackage.PORT_FOURNI_CONFIG__OBSERVER;

	/**
	 * The number of structural features of the '<em>Answer Request Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANSWER_REQUEST_PORT_FOURNI_FEATURE_COUNT = InterfacesPackage.PORT_FOURNI_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANSWER_REQUEST_PORT_FOURNI___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_FOURNI_CONFIG___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Answer Request Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANSWER_REQUEST_PORT_FOURNI_OPERATION_COUNT = InterfacesPackage.PORT_FOURNI_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.SecurityQuery_Connector <em>Security Query Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.SecurityQuery_Connector
	 * @see hADLM1.HADLM1Package#getSecurityQuery_Connector()
	 * @generated
	 */
	public static final int SECURITY_QUERY_CONNECTOR = 30;

	/**
	 * The feature id for the '<em><b>Child Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_CONNECTOR__CHILD_CONFIGURATION = ConnecteursPackage.CONNECTEUR_EXPLICITE__CHILD_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Child Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_CONNECTOR__CHILD_COMPOSANT = ConnecteursPackage.CONNECTEUR_EXPLICITE__CHILD_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Child Connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_CONNECTOR__CHILD_CONNECTEUR = ConnecteursPackage.CONNECTEUR_EXPLICITE__CHILD_CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Rolefrom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_CONNECTOR__ROLEFROM = ConnecteursPackage.CONNECTEUR_EXPLICITE__ROLEFROM;

	/**
	 * The feature id for the '<em><b>Roleto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_CONNECTOR__ROLETO = ConnecteursPackage.CONNECTEUR_EXPLICITE__ROLETO;

	/**
	 * The feature id for the '<em><b>Securityquery roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_CONNECTOR__SECURITYQUERY_ROLETO = ConnecteursPackage.CONNECTEUR_EXPLICITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Securityquery rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_CONNECTOR__SECURITYQUERY_ROLEFROM = ConnecteursPackage.CONNECTEUR_EXPLICITE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Security Query Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_CONNECTOR_FEATURE_COUNT = ConnecteursPackage.CONNECTEUR_EXPLICITE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Security Query Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_CONNECTOR_OPERATION_COUNT = ConnecteursPackage.CONNECTEUR_EXPLICITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.ExternalSocket_PortRequis <em>External Socket Port Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.ExternalSocket_PortRequis
	 * @see hADLM1.HADLM1Package#getExternalSocket_PortRequis()
	 * @generated
	 */
	public static final int EXTERNAL_SOCKET_PORT_REQUIS = 31;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_SOCKET_PORT_REQUIS__OBSERVER = InterfacesPackage.PORT_REQUIS_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>External Socket Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_SOCKET_PORT_REQUIS_FEATURE_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_SOCKET_PORT_REQUIS___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_REQUIS_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>External Socket Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_SOCKET_PORT_REQUIS_OPERATION_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.ClearenceRequest_RoleFrom <em>Clearence Request Role From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.ClearenceRequest_RoleFrom
	 * @see hADLM1.HADLM1Package#getClearenceRequest_RoleFrom()
	 * @generated
	 */
	public static final int CLEARENCE_REQUEST_ROLE_FROM = 32;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_ROLE_FROM__OBSERVER = RolesPackage.ROLE_FROM__OBSERVER;

	/**
	 * The number of structural features of the '<em>Clearence Request Role From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_ROLE_FROM_FEATURE_COUNT = RolesPackage.ROLE_FROM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_ROLE_FROM___NOTIFY_CONFIG__OBJECT = RolesPackage.ROLE_FROM___NOTIFY_CONFIG__OBJECT;

	/**
	 * The operation id for the '<em>Fonct Liaison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_ROLE_FROM___FONCT_LIAISON__ROLE_ROLE = RolesPackage.ROLE_FROM___FONCT_LIAISON__ROLE_ROLE;

	/**
	 * The number of operations of the '<em>Clearence Request Role From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CLEARENCE_REQUEST_ROLE_FROM_OPERATION_COUNT = RolesPackage.ROLE_FROM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.DBQuery_PortFourni <em>DB Query Port Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.DBQuery_PortFourni
	 * @see hADLM1.HADLM1Package#getDBQuery_PortFourni()
	 * @generated
	 */
	public static final int DB_QUERY_PORT_FOURNI = 33;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DB_QUERY_PORT_FOURNI__OBSERVER = InterfacesPackage.PORT_FOURNI_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>DB Query Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DB_QUERY_PORT_FOURNI_FEATURE_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DB_QUERY_PORT_FOURNI___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_FOURNI_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>DB Query Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DB_QUERY_PORT_FOURNI_OPERATION_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.DBQuery_PortRequis <em>DB Query Port Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.DBQuery_PortRequis
	 * @see hADLM1.HADLM1Package#getDBQuery_PortRequis()
	 * @generated
	 */
	public static final int DB_QUERY_PORT_REQUIS = 34;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DB_QUERY_PORT_REQUIS__OBSERVER = InterfacesPackage.PORT_REQUIS_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>DB Query Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DB_QUERY_PORT_REQUIS_FEATURE_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DB_QUERY_PORT_REQUIS___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_REQUIS_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>DB Query Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DB_QUERY_PORT_REQUIS_OPERATION_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.BindingServeurFOurni <em>Binding Serveur FOurni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.BindingServeurFOurni
	 * @see hADLM1.HADLM1Package#getBindingServeurFOurni()
	 * @generated
	 */
	public static final int BINDING_SERVEUR_FOURNI = 35;

	/**
	 * The feature id for the '<em><b>Portfournicompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_SERVEUR_FOURNI__PORTFOURNICOMPO = LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICOMPO;

	/**
	 * The feature id for the '<em><b>Portfourniconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_SERVEUR_FOURNI__PORTFOURNICONFIG = LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICONFIG;

	/**
	 * The feature id for the '<em><b>Externalsocket portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_SERVEUR_FOURNI__EXTERNALSOCKET_PORTFOURNI = LiensPackage.LIEN_BINDING_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Answerrequest portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_SERVEUR_FOURNI__ANSWERREQUEST_PORTFOURNI = LiensPackage.LIEN_BINDING_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding Serveur FOurni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_SERVEUR_FOURNI_FEATURE_COUNT = LiensPackage.LIEN_BINDING_FOURNI_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binding Serveur FOurni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_SERVEUR_FOURNI_OPERATION_COUNT = LiensPackage.LIEN_BINDING_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.LienAttachementYAnswer <em>Lien Attachement YAnswer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.LienAttachementYAnswer
	 * @see hADLM1.HADLM1Package#getLienAttachementYAnswer()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT_YANSWER = 36;

	/**
	 * The feature id for the '<em><b>Portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_YANSWER__PORTREQUIS = LiensPackage.LIEN_ATTACHEMENT_PRRT__PORTREQUIS;

	/**
	 * The feature id for the '<em><b>Roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_YANSWER__ROLETO = LiensPackage.LIEN_ATTACHEMENT_PRRT__ROLETO;

	/**
	 * The feature id for the '<em><b>Calledanswer roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_YANSWER__CALLEDANSWER_ROLETO = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Answerrequest portrequiscompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_YANSWER__ANSWERREQUEST_PORTREQUISCOMPO = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Attachement YAnswer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_YANSWER_FEATURE_COUNT = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Attachement YAnswer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_YANSWER_OPERATION_COUNT = LiensPackage.LIEN_ATTACHEMENT_PRRT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.calledAnswer_RoleTo <em>called Answer Role To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.calledAnswer_RoleTo
	 * @see hADLM1.HADLM1Package#getcalledAnswer_RoleTo()
	 * @generated
	 */
	public static final int CALLED_ANSWER_ROLE_TO = 37;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLED_ANSWER_ROLE_TO__OBSERVER = RolesPackage.ROLE_TO__OBSERVER;

	/**
	 * The number of structural features of the '<em>called Answer Role To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLED_ANSWER_ROLE_TO_FEATURE_COUNT = RolesPackage.ROLE_TO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLED_ANSWER_ROLE_TO___NOTIFY_CONFIG__OBJECT = RolesPackage.ROLE_TO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The operation id for the '<em>Fonct Liaison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLED_ANSWER_ROLE_TO___FONCT_LIAISON__ROLE_ROLE = RolesPackage.ROLE_TO___FONCT_LIAISON__ROLE_ROLE;

	/**
	 * The number of operations of the '<em>called Answer Role To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLED_ANSWER_ROLE_TO_OPERATION_COUNT = RolesPackage.ROLE_TO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.SecurityCheck_PortRequis <em>Security Check Port Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.SecurityCheck_PortRequis
	 * @see hADLM1.HADLM1Package#getSecurityCheck_PortRequis()
	 * @generated
	 */
	public static final int SECURITY_CHECK_PORT_REQUIS = 38;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_CHECK_PORT_REQUIS__OBSERVER = InterfacesPackage.PORT_REQUIS_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>Security Check Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_CHECK_PORT_REQUIS_FEATURE_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_CHECK_PORT_REQUIS___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_REQUIS_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Security Check Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_CHECK_PORT_REQUIS_OPERATION_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.SQLRequest_RoleFrom <em>SQL Request Role From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.SQLRequest_RoleFrom
	 * @see hADLM1.HADLM1Package#getSQLRequest_RoleFrom()
	 * @generated
	 */
	public static final int SQL_REQUEST_ROLE_FROM = 39;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_ROLE_FROM__OBSERVER = RolesPackage.ROLE_FROM__OBSERVER;

	/**
	 * The number of structural features of the '<em>SQL Request Role From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_ROLE_FROM_FEATURE_COUNT = RolesPackage.ROLE_FROM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_ROLE_FROM___NOTIFY_CONFIG__OBJECT = RolesPackage.ROLE_FROM___NOTIFY_CONFIG__OBJECT;

	/**
	 * The operation id for the '<em>Fonct Liaison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_ROLE_FROM___FONCT_LIAISON__ROLE_ROLE = RolesPackage.ROLE_FROM___FONCT_LIAISON__ROLE_ROLE;

	/**
	 * The number of operations of the '<em>SQL Request Role From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_ROLE_FROM_OPERATION_COUNT = RolesPackage.ROLE_FROM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.AnswerRequest_PortFourniConfig <em>Answer Request Port Fourni Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.AnswerRequest_PortFourniConfig
	 * @see hADLM1.HADLM1Package#getAnswerRequest_PortFourniConfig()
	 * @generated
	 */
	public static final int ANSWER_REQUEST_PORT_FOURNI_CONFIG = 40;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANSWER_REQUEST_PORT_FOURNI_CONFIG__OBSERVER = InterfacesPackage.PORT_FOURNI_CONFIG__OBSERVER;

	/**
	 * The number of structural features of the '<em>Answer Request Port Fourni Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANSWER_REQUEST_PORT_FOURNI_CONFIG_FEATURE_COUNT = InterfacesPackage.PORT_FOURNI_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANSWER_REQUEST_PORT_FOURNI_CONFIG___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_FOURNI_CONFIG___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Answer Request Port Fourni Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANSWER_REQUEST_PORT_FOURNI_CONFIG_OPERATION_COUNT = InterfacesPackage.PORT_FOURNI_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.caller_RoleFrom <em>caller Role From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.caller_RoleFrom
	 * @see hADLM1.HADLM1Package#getcaller_RoleFrom()
	 * @generated
	 */
	public static final int CALLER_ROLE_FROM = 41;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLER_ROLE_FROM__OBSERVER = RolesPackage.ROLE_FROM__OBSERVER;

	/**
	 * The number of structural features of the '<em>caller Role From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLER_ROLE_FROM_FEATURE_COUNT = RolesPackage.ROLE_FROM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLER_ROLE_FROM___NOTIFY_CONFIG__OBJECT = RolesPackage.ROLE_FROM___NOTIFY_CONFIG__OBJECT;

	/**
	 * The operation id for the '<em>Fonct Liaison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLER_ROLE_FROM___FONCT_LIAISON__ROLE_ROLE = RolesPackage.ROLE_FROM___FONCT_LIAISON__ROLE_ROLE;

	/**
	 * The number of operations of the '<em>caller Role From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALLER_ROLE_FROM_OPERATION_COUNT = RolesPackage.ROLE_FROM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.LienAttachementX1 <em>Lien Attachement X1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.LienAttachementX1
	 * @see hADLM1.HADLM1Package#getLienAttachementX1()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT_X1 = 42;

	/**
	 * The feature id for the '<em><b>Portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X1__PORTFOURNI = LiensPackage.LIEN_ATTACHEMENT_PFRF__PORTFOURNI;

	/**
	 * The feature id for the '<em><b>Rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X1__ROLEFROM = LiensPackage.LIEN_ATTACHEMENT_PFRF__ROLEFROM;

	/**
	 * The feature id for the '<em><b>Securitymanagement portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X1__SECURITYMANAGEMENT_PORTFOURNI = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Securityquery rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X1__SECURITYQUERY_ROLEFROM = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Attachement X1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X1_FEATURE_COUNT = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Attachement X1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X1_OPERATION_COUNT = LiensPackage.LIEN_ATTACHEMENT_PFRF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.CQuery_PortRequis <em>CQuery Port Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.CQuery_PortRequis
	 * @see hADLM1.HADLM1Package#getCQuery_PortRequis()
	 * @generated
	 */
	public static final int CQUERY_PORT_REQUIS = 43;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CQUERY_PORT_REQUIS__OBSERVER = InterfacesPackage.PORT_REQUIS_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>CQuery Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CQUERY_PORT_REQUIS_FEATURE_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CQUERY_PORT_REQUIS___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_REQUIS_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>CQuery Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CQUERY_PORT_REQUIS_OPERATION_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.SQLRequest_RoleTo <em>SQL Request Role To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.SQLRequest_RoleTo
	 * @see hADLM1.HADLM1Package#getSQLRequest_RoleTo()
	 * @generated
	 */
	public static final int SQL_REQUEST_ROLE_TO = 44;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_ROLE_TO__OBSERVER = RolesPackage.ROLE_TO__OBSERVER;

	/**
	 * The number of structural features of the '<em>SQL Request Role To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_ROLE_TO_FEATURE_COUNT = RolesPackage.ROLE_TO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_ROLE_TO___NOTIFY_CONFIG__OBJECT = RolesPackage.ROLE_TO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The operation id for the '<em>Fonct Liaison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_ROLE_TO___FONCT_LIAISON__ROLE_ROLE = RolesPackage.ROLE_TO___FONCT_LIAISON__ROLE_ROLE;

	/**
	 * The number of operations of the '<em>SQL Request Role To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_REQUEST_ROLE_TO_OPERATION_COUNT = RolesPackage.ROLE_TO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.SecurityQuery_RoleTo <em>Security Query Role To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.SecurityQuery_RoleTo
	 * @see hADLM1.HADLM1Package#getSecurityQuery_RoleTo()
	 * @generated
	 */
	public static final int SECURITY_QUERY_ROLE_TO = 45;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_ROLE_TO__OBSERVER = RolesPackage.ROLE_TO__OBSERVER;

	/**
	 * The number of structural features of the '<em>Security Query Role To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_ROLE_TO_FEATURE_COUNT = RolesPackage.ROLE_TO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_ROLE_TO___NOTIFY_CONFIG__OBJECT = RolesPackage.ROLE_TO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The operation id for the '<em>Fonct Liaison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_ROLE_TO___FONCT_LIAISON__ROLE_ROLE = RolesPackage.ROLE_TO___FONCT_LIAISON__ROLE_ROLE;

	/**
	 * The number of operations of the '<em>Security Query Role To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_ROLE_TO_OPERATION_COUNT = RolesPackage.ROLE_TO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.LienAttachementX3 <em>Lien Attachement X3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.LienAttachementX3
	 * @see hADLM1.HADLM1Package#getLienAttachementX3()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT_X3 = 46;

	/**
	 * The feature id for the '<em><b>Portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X3__PORTFOURNI = LiensPackage.LIEN_ATTACHEMENT_PFRF__PORTFOURNI;

	/**
	 * The feature id for the '<em><b>Rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X3__ROLEFROM = LiensPackage.LIEN_ATTACHEMENT_PFRF__ROLEFROM;

	/**
	 * The feature id for the '<em><b>Cquery portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X3__CQUERY_PORTFOURNI = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Securityquery rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X3__SECURITYQUERY_ROLEFROM = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Attachement X3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X3_FEATURE_COUNT = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Attachement X3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X3_OPERATION_COUNT = LiensPackage.LIEN_ATTACHEMENT_PFRF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.SecurityQuery_RoleFrom <em>Security Query Role From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.SecurityQuery_RoleFrom
	 * @see hADLM1.HADLM1Package#getSecurityQuery_RoleFrom()
	 * @generated
	 */
	public static final int SECURITY_QUERY_ROLE_FROM = 47;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_ROLE_FROM__OBSERVER = RolesPackage.ROLE_FROM__OBSERVER;

	/**
	 * The number of structural features of the '<em>Security Query Role From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_ROLE_FROM_FEATURE_COUNT = RolesPackage.ROLE_FROM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_ROLE_FROM___NOTIFY_CONFIG__OBJECT = RolesPackage.ROLE_FROM___NOTIFY_CONFIG__OBJECT;

	/**
	 * The operation id for the '<em>Fonct Liaison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_ROLE_FROM___FONCT_LIAISON__ROLE_ROLE = RolesPackage.ROLE_FROM___FONCT_LIAISON__ROLE_ROLE;

	/**
	 * The number of operations of the '<em>Security Query Role From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_QUERY_ROLE_FROM_OPERATION_COUNT = RolesPackage.ROLE_FROM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.AnswerRequest_PortFourniCompo <em>Answer Request Port Fourni Compo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.AnswerRequest_PortFourniCompo
	 * @see hADLM1.HADLM1Package#getAnswerRequest_PortFourniCompo()
	 * @generated
	 */
	public static final int ANSWER_REQUEST_PORT_FOURNI_COMPO = 48;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANSWER_REQUEST_PORT_FOURNI_COMPO__OBSERVER = InterfacesPackage.PORT_FOURNI_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>Answer Request Port Fourni Compo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANSWER_REQUEST_PORT_FOURNI_COMPO_FEATURE_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANSWER_REQUEST_PORT_FOURNI_COMPO___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_FOURNI_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Answer Request Port Fourni Compo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANSWER_REQUEST_PORT_FOURNI_COMPO_OPERATION_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.LienAttachementY5 <em>Lien Attachement Y5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.LienAttachementY5
	 * @see hADLM1.HADLM1Package#getLienAttachementY5()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT_Y5 = 49;

	/**
	 * The feature id for the '<em><b>Portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y5__PORTREQUIS = LiensPackage.LIEN_ATTACHEMENT_PRRT__PORTREQUIS;

	/**
	 * The feature id for the '<em><b>Roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y5__ROLETO = LiensPackage.LIEN_ATTACHEMENT_PRRT__ROLETO;

	/**
	 * The feature id for the '<em><b>Cquery portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y5__CQUERY_PORTREQUIS = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Securityquery roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y5__SECURITYQUERY_ROLETO = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Attachement Y5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y5_FEATURE_COUNT = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Attachement Y5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_Y5_OPERATION_COUNT = LiensPackage.LIEN_ATTACHEMENT_PRRT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.SecurityManager_Composant <em>Security Manager Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.SecurityManager_Composant
	 * @see hADLM1.HADLM1Package#getSecurityManager_Composant()
	 * @generated
	 */
	public static final int SECURITY_MANAGER_COMPOSANT = 50;

	/**
	 * The feature id for the '<em><b>Child Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT__CHILD_CONFIGURATION = ComposantPackage.COMPOSANT__CHILD_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Child Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT__CHILD_COMPOSANT = ComposantPackage.COMPOSANT__CHILD_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Child Connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT__CHILD_CONNECTEUR = ComposantPackage.COMPOSANT__CHILD_CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Propriete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT__PROPRIETE = ComposantPackage.COMPOSANT__PROPRIETE;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT__CONTRAINTES = ComposantPackage.COMPOSANT__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Portrequiscompo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT__PORTREQUISCOMPO = ComposantPackage.COMPOSANT__PORTREQUISCOMPO;

	/**
	 * The feature id for the '<em><b>Portfournicompo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT__PORTFOURNICOMPO = ComposantPackage.COMPOSANT__PORTFOURNICOMPO;

	/**
	 * The feature id for the '<em><b>Lienbindingrequis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT__LIENBINDINGREQUIS = ComposantPackage.COMPOSANT__LIENBINDINGREQUIS;

	/**
	 * The feature id for the '<em><b>Lienbindingfourni</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT__LIENBINDINGFOURNI = ComposantPackage.COMPOSANT__LIENBINDINGFOURNI;

	/**
	 * The feature id for the '<em><b>Cquery portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT__CQUERY_PORTFOURNI = ComposantPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Securityauth portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT__SECURITYAUTH_PORTREQUIS = ComposantPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cquery portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT__CQUERY_PORTREQUIS = ComposantPackage.COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Securityauth portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT__SECURITYAUTH_PORTFOURNI = ComposantPackage.COMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Security Manager Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT_FEATURE_COUNT = ComposantPackage.COMPOSANT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT___ACTION_VIA_ROLE__ROLETO_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_ROLE__ROLETO_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT;

	/**
	 * The number of operations of the '<em>Security Manager Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGER_COMPOSANT_OPERATION_COUNT = ComposantPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.ConnectionManager_Composant <em>Connection Manager Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.ConnectionManager_Composant
	 * @see hADLM1.HADLM1Package#getConnectionManager_Composant()
	 * @generated
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT = 51;

	/**
	 * The feature id for the '<em><b>Child Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT__CHILD_CONFIGURATION = ComposantPackage.COMPOSANT__CHILD_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Child Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT__CHILD_COMPOSANT = ComposantPackage.COMPOSANT__CHILD_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Child Connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT__CHILD_CONNECTEUR = ComposantPackage.COMPOSANT__CHILD_CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Propriete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT__PROPRIETE = ComposantPackage.COMPOSANT__PROPRIETE;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT__CONTRAINTES = ComposantPackage.COMPOSANT__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Portrequiscompo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT__PORTREQUISCOMPO = ComposantPackage.COMPOSANT__PORTREQUISCOMPO;

	/**
	 * The feature id for the '<em><b>Portfournicompo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT__PORTFOURNICOMPO = ComposantPackage.COMPOSANT__PORTFOURNICOMPO;

	/**
	 * The feature id for the '<em><b>Lienbindingrequis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT__LIENBINDINGREQUIS = ComposantPackage.COMPOSANT__LIENBINDINGREQUIS;

	/**
	 * The feature id for the '<em><b>Lienbindingfourni</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT__LIENBINDINGFOURNI = ComposantPackage.COMPOSANT__LIENBINDINGFOURNI;

	/**
	 * The feature id for the '<em><b>Externalsocket portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT__EXTERNALSOCKET_PORTREQUIS = ComposantPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Securitycheck portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT__SECURITYCHECK_PORTFOURNI = ComposantPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dbquery portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT__DBQUERY_PORTFOURNI = ComposantPackage.COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dbquery portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT__DBQUERY_PORTREQUIS = ComposantPackage.COMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Securitycheck portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT__SECURITYCHECK_PORTREQUIS = ComposantPackage.COMPOSANT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Externalsocket portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT__EXTERNALSOCKET_PORTFOURNI = ComposantPackage.COMPOSANT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Connection Manager Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT_FEATURE_COUNT = ComposantPackage.COMPOSANT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT___ACTION_VIA_ROLE__ROLETO_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_ROLE__ROLETO_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT;

	/**
	 * The number of operations of the '<em>Connection Manager Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_MANAGER_COMPOSANT_OPERATION_COUNT = ComposantPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.bindingRequisServeurConfig <em>binding Requis Serveur Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.bindingRequisServeurConfig
	 * @see hADLM1.HADLM1Package#getbindingRequisServeurConfig()
	 * @generated
	 */
	public static final int BINDING_REQUIS_SERVEUR_CONFIG = 52;

	/**
	 * The feature id for the '<em><b>Portrequiscompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_REQUIS_SERVEUR_CONFIG__PORTREQUISCOMPO = LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCOMPO;

	/**
	 * The feature id for the '<em><b>Portrequisconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_REQUIS_SERVEUR_CONFIG__PORTREQUISCONFIG = LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCONFIG;

	/**
	 * The feature id for the '<em><b>Receiverequestrequisconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_REQUIS_SERVEUR_CONFIG__RECEIVEREQUESTREQUISCONFIG = LiensPackage.LIEN_BINDING_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receive request portrequiscompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_REQUIS_SERVEUR_CONFIG__RECEIVE_REQUEST_PORTREQUISCOMPO = LiensPackage.LIEN_BINDING_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>binding Requis Serveur Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_REQUIS_SERVEUR_CONFIG_FEATURE_COUNT = LiensPackage.LIEN_BINDING_REQUIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>binding Requis Serveur Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_REQUIS_SERVEUR_CONFIG_OPERATION_COUNT = LiensPackage.LIEN_BINDING_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.SecurityManagement_PortRequis <em>Security Management Port Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.SecurityManagement_PortRequis
	 * @see hADLM1.HADLM1Package#getSecurityManagement_PortRequis()
	 * @generated
	 */
	public static final int SECURITY_MANAGEMENT_PORT_REQUIS = 53;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGEMENT_PORT_REQUIS__OBSERVER = InterfacesPackage.PORT_REQUIS_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>Security Management Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGEMENT_PORT_REQUIS_FEATURE_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGEMENT_PORT_REQUIS___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_REQUIS_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Security Management Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_MANAGEMENT_PORT_REQUIS_OPERATION_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.LienAttachementX2 <em>Lien Attachement X2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.LienAttachementX2
	 * @see hADLM1.HADLM1Package#getLienAttachementX2()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT_X2 = 54;

	/**
	 * The feature id for the '<em><b>Portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X2__PORTFOURNI = LiensPackage.LIEN_ATTACHEMENT_PFRF__PORTFOURNI;

	/**
	 * The feature id for the '<em><b>Rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X2__ROLEFROM = LiensPackage.LIEN_ATTACHEMENT_PFRF__ROLEFROM;

	/**
	 * The feature id for the '<em><b>Queryint portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X2__QUERYINT_PORTFOURNI = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sqlrequest rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X2__SQLREQUEST_ROLEFROM = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Attachement X2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X2_FEATURE_COUNT = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Attachement X2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X2_OPERATION_COUNT = LiensPackage.LIEN_ATTACHEMENT_PFRF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.LienAttachementYRequest <em>Lien Attachement YRequest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.LienAttachementYRequest
	 * @see hADLM1.HADLM1Package#getLienAttachementYRequest()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT_YREQUEST = 55;

	/**
	 * The feature id for the '<em><b>Portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_YREQUEST__PORTREQUIS = LiensPackage.LIEN_ATTACHEMENT_PRRT__PORTREQUIS;

	/**
	 * The feature id for the '<em><b>Roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_YREQUEST__ROLETO = LiensPackage.LIEN_ATTACHEMENT_PRRT__ROLETO;

	/**
	 * The feature id for the '<em><b>Called roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_YREQUEST__CALLED_ROLETO = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receive request portrequiscompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_YREQUEST__RECEIVE_REQUEST_PORTREQUISCOMPO = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Attachement YRequest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_YREQUEST_FEATURE_COUNT = LiensPackage.LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Attachement YRequest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_YREQUEST_OPERATION_COUNT = LiensPackage.LIEN_ATTACHEMENT_PRRT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.Systeme_Configuration <em>Systeme Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.Systeme_Configuration
	 * @see hADLM1.HADLM1Package#getSysteme_Configuration()
	 * @generated
	 */
	public static final int SYSTEME_CONFIGURATION = 56;

	/**
	 * The feature id for the '<em><b>Child Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__CHILD_CONFIGURATION = ConfigurationPackage.CONFIGURATION__CHILD_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Child Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__CHILD_COMPOSANT = ConfigurationPackage.CONFIGURATION__CHILD_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Child Connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__CHILD_CONNECTEUR = ConfigurationPackage.CONFIGURATION__CHILD_CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Portrequisconfig</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__PORTREQUISCONFIG = ConfigurationPackage.CONFIGURATION__PORTREQUISCONFIG;

	/**
	 * The feature id for the '<em><b>Portfourniconfig</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__PORTFOURNICONFIG = ConfigurationPackage.CONFIGURATION__PORTFOURNICONFIG;

	/**
	 * The feature id for the '<em><b>Lienbindingrequis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__LIENBINDINGREQUIS = ConfigurationPackage.CONFIGURATION__LIENBINDINGREQUIS;

	/**
	 * The feature id for the '<em><b>Lienbindingfourni</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__LIENBINDINGFOURNI = ConfigurationPackage.CONFIGURATION__LIENBINDINGFOURNI;

	/**
	 * The feature id for the '<em><b>Lienattachementprrt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__LIENATTACHEMENTPRRT = ConfigurationPackage.CONFIGURATION__LIENATTACHEMENTPRRT;

	/**
	 * The feature id for the '<em><b>Lienattachementpfrf</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__LIENATTACHEMENTPFRF = ConfigurationPackage.CONFIGURATION__LIENATTACHEMENTPFRF;

	/**
	 * The feature id for the '<em><b>Client composant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__CLIENT_COMPOSANT = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Serveur composant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__SERVEUR_COMPOSANT = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rpc connectorexplicite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__RPC_CONNECTOREXPLICITE = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lienattachementx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__LIENATTACHEMENTX = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lienattachementy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__LIENATTACHEMENTY = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sendrequest portrequisconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__SENDREQUEST_PORTREQUISCONFIG = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Answerrequest portfourniconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__ANSWERREQUEST_PORTFOURNICONFIG = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Externalbindinganswerrequest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__EXTERNALBINDINGANSWERREQUEST = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Externalbindingsendrequest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__EXTERNALBINDINGSENDREQUEST = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Lienattachementxanswer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__LIENATTACHEMENTXANSWER = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Lienattachementyanswer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION__LIENATTACHEMENTYANSWER = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Systeme Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION_FEATURE_COUNT = ConfigurationPackage.CONFIGURATION_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT = ConfigurationPackage.CONFIGURATION___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION___ACTION_VIA_ROLE__ROLETO_OBJECT = ConfigurationPackage.CONFIGURATION___ACTION_VIA_ROLE__ROLETO_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT = ConfigurationPackage.CONFIGURATION___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT = ConfigurationPackage.CONFIGURATION___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT = ConfigurationPackage.CONFIGURATION___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT;

	/**
	 * The number of operations of the '<em>Systeme Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEME_CONFIGURATION_OPERATION_COUNT = ConfigurationPackage.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.LienAttachementXAnswer <em>Lien Attachement XAnswer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.LienAttachementXAnswer
	 * @see hADLM1.HADLM1Package#getLienAttachementXAnswer()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT_XANSWER = 57;

	/**
	 * The feature id for the '<em><b>Portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_XANSWER__PORTFOURNI = LiensPackage.LIEN_ATTACHEMENT_PFRF__PORTFOURNI;

	/**
	 * The feature id for the '<em><b>Rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_XANSWER__ROLEFROM = LiensPackage.LIEN_ATTACHEMENT_PFRF__ROLEFROM;

	/**
	 * The feature id for the '<em><b>Calleranswer rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_XANSWER__CALLERANSWER_ROLEFROM = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Answerrequest portfournicompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_XANSWER__ANSWERREQUEST_PORTFOURNICOMPO = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Attachement XAnswer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_XANSWER_FEATURE_COUNT = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Attachement XAnswer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_XANSWER_OPERATION_COUNT = LiensPackage.LIEN_ATTACHEMENT_PFRF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.bindingRequisServeurDetails <em>binding Requis Serveur Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.bindingRequisServeurDetails
	 * @see hADLM1.HADLM1Package#getbindingRequisServeurDetails()
	 * @generated
	 */
	public static final int BINDING_REQUIS_SERVEUR_DETAILS = 58;

	/**
	 * The feature id for the '<em><b>Portrequiscompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_REQUIS_SERVEUR_DETAILS__PORTREQUISCOMPO = LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCOMPO;

	/**
	 * The feature id for the '<em><b>Portrequisconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_REQUIS_SERVEUR_DETAILS__PORTREQUISCONFIG = LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCONFIG;

	/**
	 * The feature id for the '<em><b>Receive request portrequiscompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_REQUIS_SERVEUR_DETAILS__RECEIVE_REQUEST_PORTREQUISCOMPO = LiensPackage.LIEN_BINDING_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Externalsocket portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_REQUIS_SERVEUR_DETAILS__EXTERNALSOCKET_PORTREQUIS = LiensPackage.LIEN_BINDING_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>binding Requis Serveur Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_REQUIS_SERVEUR_DETAILS_FEATURE_COUNT = LiensPackage.LIEN_BINDING_REQUIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>binding Requis Serveur Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_REQUIS_SERVEUR_DETAILS_OPERATION_COUNT = LiensPackage.LIEN_BINDING_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.LienAttachementX4 <em>Lien Attachement X4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.LienAttachementX4
	 * @see hADLM1.HADLM1Package#getLienAttachementX4()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT_X4 = 59;

	/**
	 * The feature id for the '<em><b>Portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X4__PORTFOURNI = LiensPackage.LIEN_ATTACHEMENT_PFRF__PORTFOURNI;

	/**
	 * The feature id for the '<em><b>Rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X4__ROLEFROM = LiensPackage.LIEN_ATTACHEMENT_PFRF__ROLEFROM;

	/**
	 * The feature id for the '<em><b>Securityauth portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X4__SECURITYAUTH_PORTFOURNI = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clearencerequest rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X4__CLEARENCEREQUEST_ROLEFROM = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Attachement X4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X4_FEATURE_COUNT = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Attachement X4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X4_OPERATION_COUNT = LiensPackage.LIEN_ATTACHEMENT_PFRF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.Database_Composant <em>Database Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.Database_Composant
	 * @see hADLM1.HADLM1Package#getDatabase_Composant()
	 * @generated
	 */
	public static final int DATABASE_COMPOSANT = 60;

	/**
	 * The feature id for the '<em><b>Child Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT__CHILD_CONFIGURATION = ComposantPackage.COMPOSANT__CHILD_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Child Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT__CHILD_COMPOSANT = ComposantPackage.COMPOSANT__CHILD_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Child Connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT__CHILD_CONNECTEUR = ComposantPackage.COMPOSANT__CHILD_CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Propriete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT__PROPRIETE = ComposantPackage.COMPOSANT__PROPRIETE;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT__CONTRAINTES = ComposantPackage.COMPOSANT__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Portrequiscompo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT__PORTREQUISCOMPO = ComposantPackage.COMPOSANT__PORTREQUISCOMPO;

	/**
	 * The feature id for the '<em><b>Portfournicompo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT__PORTFOURNICOMPO = ComposantPackage.COMPOSANT__PORTFOURNICOMPO;

	/**
	 * The feature id for the '<em><b>Lienbindingrequis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT__LIENBINDINGREQUIS = ComposantPackage.COMPOSANT__LIENBINDINGREQUIS;

	/**
	 * The feature id for the '<em><b>Lienbindingfourni</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT__LIENBINDINGFOURNI = ComposantPackage.COMPOSANT__LIENBINDINGFOURNI;

	/**
	 * The feature id for the '<em><b>Queryint portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT__QUERYINT_PORTREQUIS = ComposantPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Securitymanagement portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT__SECURITYMANAGEMENT_PORTREQUIS = ComposantPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Queryint portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT__QUERYINT_PORTFOURNI = ComposantPackage.COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Securitymanagement portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT__SECURITYMANAGEMENT_PORTFOURNI = ComposantPackage.COMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Database Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT_FEATURE_COUNT = ComposantPackage.COMPOSANT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT___ACTION_VIA_ROLE__ROLETO_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_ROLE__ROLETO_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT = ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT;

	/**
	 * The number of operations of the '<em>Database Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_COMPOSANT_OPERATION_COUNT = ComposantPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.CQuery_PortFourni <em>CQuery Port Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.CQuery_PortFourni
	 * @see hADLM1.HADLM1Package#getCQuery_PortFourni()
	 * @generated
	 */
	public static final int CQUERY_PORT_FOURNI = 61;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CQUERY_PORT_FOURNI__OBSERVER = InterfacesPackage.PORT_FOURNI_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>CQuery Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CQUERY_PORT_FOURNI_FEATURE_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CQUERY_PORT_FOURNI___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_FOURNI_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>CQuery Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CQUERY_PORT_FOURNI_OPERATION_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.LienAttachementX5 <em>Lien Attachement X5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.LienAttachementX5
	 * @see hADLM1.HADLM1Package#getLienAttachementX5()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT_X5 = 62;

	/**
	 * The feature id for the '<em><b>Portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X5__PORTFOURNI = LiensPackage.LIEN_ATTACHEMENT_PFRF__PORTFOURNI;

	/**
	 * The feature id for the '<em><b>Rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X5__ROLEFROM = LiensPackage.LIEN_ATTACHEMENT_PFRF__ROLEFROM;

	/**
	 * The feature id for the '<em><b>Dbquery portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X5__DBQUERY_PORTFOURNI = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sqlrequest rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X5__SQLREQUEST_ROLEFROM = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Attachement X5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X5_FEATURE_COUNT = LiensPackage.LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Attachement X5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_X5_OPERATION_COUNT = LiensPackage.LIEN_ATTACHEMENT_PFRF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.ReceiveRequestRequisConfig <em>Receive Request Requis Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.ReceiveRequestRequisConfig
	 * @see hADLM1.HADLM1Package#getReceiveRequestRequisConfig()
	 * @generated
	 */
	public static final int RECEIVE_REQUEST_REQUIS_CONFIG = 63;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVE_REQUEST_REQUIS_CONFIG__OBSERVER = InterfacesPackage.PORT_REQUIS_CONFIG__OBSERVER;

	/**
	 * The number of structural features of the '<em>Receive Request Requis Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVE_REQUEST_REQUIS_CONFIG_FEATURE_COUNT = InterfacesPackage.PORT_REQUIS_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVE_REQUEST_REQUIS_CONFIG___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_REQUIS_CONFIG___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Receive Request Requis Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVE_REQUEST_REQUIS_CONFIG_OPERATION_COUNT = InterfacesPackage.PORT_REQUIS_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.ExternalBindingAnswerRequest <em>External Binding Answer Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.ExternalBindingAnswerRequest
	 * @see hADLM1.HADLM1Package#getExternalBindingAnswerRequest()
	 * @generated
	 */
	public static final int EXTERNAL_BINDING_ANSWER_REQUEST = 64;

	/**
	 * The feature id for the '<em><b>Portfournicompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_BINDING_ANSWER_REQUEST__PORTFOURNICOMPO = LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICOMPO;

	/**
	 * The feature id for the '<em><b>Portfourniconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_BINDING_ANSWER_REQUEST__PORTFOURNICONFIG = LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICONFIG;

	/**
	 * The feature id for the '<em><b>Answerrequest portfourniconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_BINDING_ANSWER_REQUEST__ANSWERREQUEST_PORTFOURNICONFIG = LiensPackage.LIEN_BINDING_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Externalportfourniclientanswerrequest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_BINDING_ANSWER_REQUEST__EXTERNALPORTFOURNICLIENTANSWERREQUEST = LiensPackage.LIEN_BINDING_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Binding Answer Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_BINDING_ANSWER_REQUEST_FEATURE_COUNT = LiensPackage.LIEN_BINDING_FOURNI_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>External Binding Answer Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_BINDING_ANSWER_REQUEST_OPERATION_COUNT = LiensPackage.LIEN_BINDING_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.ExternalPortRequisClientSendRequest <em>External Port Requis Client Send Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.ExternalPortRequisClientSendRequest
	 * @see hADLM1.HADLM1Package#getExternalPortRequisClientSendRequest()
	 * @generated
	 */
	public static final int EXTERNAL_PORT_REQUIS_CLIENT_SEND_REQUEST = 65;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_PORT_REQUIS_CLIENT_SEND_REQUEST__OBSERVER = InterfacesPackage.PORT_REQUIS_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>External Port Requis Client Send Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_PORT_REQUIS_CLIENT_SEND_REQUEST_FEATURE_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_PORT_REQUIS_CLIENT_SEND_REQUEST___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_REQUIS_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>External Port Requis Client Send Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_PORT_REQUIS_CLIENT_SEND_REQUEST_OPERATION_COUNT = InterfacesPackage.PORT_REQUIS_COMPO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADLM1.ExternalPortFourniClientAnswerRequest <em>External Port Fourni Client Answer Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADLM1.ExternalPortFourniClientAnswerRequest
	 * @see hADLM1.HADLM1Package#getExternalPortFourniClientAnswerRequest()
	 * @generated
	 */
	public static final int EXTERNAL_PORT_FOURNI_CLIENT_ANSWER_REQUEST = 66;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_PORT_FOURNI_CLIENT_ANSWER_REQUEST__OBSERVER = InterfacesPackage.PORT_FOURNI_COMPO__OBSERVER;

	/**
	 * The number of structural features of the '<em>External Port Fourni Client Answer Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_PORT_FOURNI_CLIENT_ANSWER_REQUEST_FEATURE_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_PORT_FOURNI_CLIENT_ANSWER_REQUEST___NOTIFY_CONFIG__OBJECT = InterfacesPackage.PORT_FOURNI_COMPO___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>External Port Fourni Client Answer Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_PORT_FOURNI_CLIENT_ANSWER_REQUEST_OPERATION_COUNT = InterfacesPackage.PORT_FOURNI_COMPO_OPERATION_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityCheck_PortFourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalSocket_PortFourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementY6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serveur_ComposantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryInt_PortRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementY4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementX6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalBindingSendRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass client_ComposantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receive_request_PortRequisCompoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendRequest_PortRequisConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearenceRequest_RoleToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlRequest_ConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass send_request_PortFourniCompoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityManagement_PortFourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementY2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callerAnswer_RoleFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serveurDetails_ConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityAuth_PortRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerRequest_PortRequisCompoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementY1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpC_ConnectorExpliciteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementY3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingServeurFourniCompoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryInt_PortFourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass called_RoleToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearenceRequest_ConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementXRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityAuth_PortFourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerRequest_PortFourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityQuery_ConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalSocket_PortRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearenceRequest_RoleFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbQuery_PortFourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbQuery_PortRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingServeurFOurniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementYAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calledAnswer_RoleToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityCheck_PortRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlRequest_RoleFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerRequest_PortFourniConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caller_RoleFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementX1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cQuery_PortRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlRequest_RoleToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityQuery_RoleToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementX3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityQuery_RoleFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerRequest_PortFourniCompoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementY5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityManager_ComposantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionManager_ComposantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingRequisServeurConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityManagement_PortRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementX2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementYRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systeme_ConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementXAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingRequisServeurDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementX4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass database_ComposantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cQuery_PortFourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementX5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveRequestRequisConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalBindingAnswerRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalPortRequisClientSendRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalPortFourniClientAnswerRequestEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hADLM1.HADLM1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HADLM1Package() {
		super(eNS_URI, HADLM1Factory.INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HADLM1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HADLM1Package init() {
		if (isInited) return (HADLM1Package)EPackage.Registry.INSTANCE.getEPackage(HADLM1Package.eNS_URI);

		// Obtain or create and register package
		HADLM1Package theHADLM1Package = (HADLM1Package)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HADLM1Package ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HADLM1Package());

		isInited = true;

		// Obtain or create and register interdependencies
		HADLPackage theHADLPackage = (HADLPackage)(EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI) instanceof HADLPackage ? EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI) : HADLPackage.eINSTANCE);
		ConnecteursPackage theConnecteursPackage = (ConnecteursPackage)(EPackage.Registry.INSTANCE.getEPackage(ConnecteursPackage.eNS_URI) instanceof ConnecteursPackage ? EPackage.Registry.INSTANCE.getEPackage(ConnecteursPackage.eNS_URI) : ConnecteursPackage.eINSTANCE);
		ComposantPackage theComposantPackage = (ComposantPackage)(EPackage.Registry.INSTANCE.getEPackage(ComposantPackage.eNS_URI) instanceof ComposantPackage ? EPackage.Registry.INSTANCE.getEPackage(ComposantPackage.eNS_URI) : ComposantPackage.eINSTANCE);
		LiensPackage theLiensPackage = (LiensPackage)(EPackage.Registry.INSTANCE.getEPackage(LiensPackage.eNS_URI) instanceof LiensPackage ? EPackage.Registry.INSTANCE.getEPackage(LiensPackage.eNS_URI) : LiensPackage.eINSTANCE);
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)(EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI) instanceof InterfacesPackage ? EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI) : InterfacesPackage.eINSTANCE);
		RolesPackage theRolesPackage = (RolesPackage)(EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI) instanceof RolesPackage ? EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI) : RolesPackage.eINSTANCE);
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackage ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) : ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theHADLM1Package.createPackageContents();
		theHADLPackage.createPackageContents();
		theConnecteursPackage.createPackageContents();
		theComposantPackage.createPackageContents();
		theLiensPackage.createPackageContents();
		theInterfacesPackage.createPackageContents();
		theRolesPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theHADLM1Package.initializePackageContents();
		theHADLPackage.initializePackageContents();
		theConnecteursPackage.initializePackageContents();
		theComposantPackage.initializePackageContents();
		theLiensPackage.initializePackageContents();
		theInterfacesPackage.initializePackageContents();
		theRolesPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHADLM1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HADLM1Package.eNS_URI, theHADLM1Package);
		return theHADLM1Package;
	}


	/**
	 * Returns the meta object for class '{@link hADLM1.SecurityCheck_PortFourni <em>Security Check Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Check Port Fourni</em>'.
	 * @see hADLM1.SecurityCheck_PortFourni
	 * @generated
	 */
	public EClass getSecurityCheck_PortFourni() {
		return securityCheck_PortFourniEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.ExternalSocket_PortFourni <em>External Socket Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Socket Port Fourni</em>'.
	 * @see hADLM1.ExternalSocket_PortFourni
	 * @generated
	 */
	public EClass getExternalSocket_PortFourni() {
		return externalSocket_PortFourniEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.LienAttachementY6 <em>Lien Attachement Y6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement Y6</em>'.
	 * @see hADLM1.LienAttachementY6
	 * @generated
	 */
	public EClass getLienAttachementY6() {
		return lienAttachementY6EClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementY6#getDbquery_portrequis <em>Dbquery portrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dbquery portrequis</em>'.
	 * @see hADLM1.LienAttachementY6#getDbquery_portrequis()
	 * @see #getLienAttachementY6()
	 * @generated
	 */
	public EReference getLienAttachementY6_Dbquery_portrequis() {
		return (EReference)lienAttachementY6EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementY6#getSqlrequest_roleto <em>Sqlrequest roleto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sqlrequest roleto</em>'.
	 * @see hADLM1.LienAttachementY6#getSqlrequest_roleto()
	 * @see #getLienAttachementY6()
	 * @generated
	 */
	public EReference getLienAttachementY6_Sqlrequest_roleto() {
		return (EReference)lienAttachementY6EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.Serveur_Composant <em>Serveur Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serveur Composant</em>'.
	 * @see hADLM1.Serveur_Composant
	 * @generated
	 */
	public EClass getServeur_Composant() {
		return serveur_ComposantEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Serveur_Composant#getReceive_request_port <em>Receive request port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive request port</em>'.
	 * @see hADLM1.Serveur_Composant#getReceive_request_port()
	 * @see #getServeur_Composant()
	 * @generated
	 */
	public EReference getServeur_Composant_Receive_request_port() {
		return (EReference)serveur_ComposantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Serveur_Composant#getServeurdetails_configuration <em>Serveurdetails configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serveurdetails configuration</em>'.
	 * @see hADLM1.Serveur_Composant#getServeurdetails_configuration()
	 * @see #getServeur_Composant()
	 * @generated
	 */
	public EReference getServeur_Composant_Serveurdetails_configuration() {
		return (EReference)serveur_ComposantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Serveur_Composant#getAnswerrequest_portfournicompo <em>Answerrequest portfournicompo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Answerrequest portfournicompo</em>'.
	 * @see hADLM1.Serveur_Composant#getAnswerrequest_portfournicompo()
	 * @see #getServeur_Composant()
	 * @generated
	 */
	public EReference getServeur_Composant_Answerrequest_portfournicompo() {
		return (EReference)serveur_ComposantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Serveur_Composant#getBindingrequisserveurconfig <em>Bindingrequisserveurconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bindingrequisserveurconfig</em>'.
	 * @see hADLM1.Serveur_Composant#getBindingrequisserveurconfig()
	 * @see #getServeur_Composant()
	 * @generated
	 */
	public EReference getServeur_Composant_Bindingrequisserveurconfig() {
		return (EReference)serveur_ComposantEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Serveur_Composant#getBindingserveurfournicompo <em>Bindingserveurfournicompo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bindingserveurfournicompo</em>'.
	 * @see hADLM1.Serveur_Composant#getBindingserveurfournicompo()
	 * @see #getServeur_Composant()
	 * @generated
	 */
	public EReference getServeur_Composant_Bindingserveurfournicompo() {
		return (EReference)serveur_ComposantEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for class '{@link hADLM1.QueryInt_PortRequis <em>Query Int Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Int Port Requis</em>'.
	 * @see hADLM1.QueryInt_PortRequis
	 * @generated
	 */
	public EClass getQueryInt_PortRequis() {
		return queryInt_PortRequisEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.LienAttachementY4 <em>Lien Attachement Y4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement Y4</em>'.
	 * @see hADLM1.LienAttachementY4
	 * @generated
	 */
	public EClass getLienAttachementY4() {
		return lienAttachementY4EClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementY4#getSecuritycheck_portrequis <em>Securitycheck portrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securitycheck portrequis</em>'.
	 * @see hADLM1.LienAttachementY4#getSecuritycheck_portrequis()
	 * @see #getLienAttachementY4()
	 * @generated
	 */
	public EReference getLienAttachementY4_Securitycheck_portrequis() {
		return (EReference)lienAttachementY4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementY4#getClearencerequest_roleto <em>Clearencerequest roleto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clearencerequest roleto</em>'.
	 * @see hADLM1.LienAttachementY4#getClearencerequest_roleto()
	 * @see #getLienAttachementY4()
	 * @generated
	 */
	public EReference getLienAttachementY4_Clearencerequest_roleto() {
		return (EReference)lienAttachementY4EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.LienAttachementX6 <em>Lien Attachement X6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement X6</em>'.
	 * @see hADLM1.LienAttachementX6
	 * @generated
	 */
	public EClass getLienAttachementX6() {
		return lienAttachementX6EClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementX6#getSecuritycheck_portfourni <em>Securitycheck portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securitycheck portfourni</em>'.
	 * @see hADLM1.LienAttachementX6#getSecuritycheck_portfourni()
	 * @see #getLienAttachementX6()
	 * @generated
	 */
	public EReference getLienAttachementX6_Securitycheck_portfourni() {
		return (EReference)lienAttachementX6EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementX6#getClearencerequest_rolefrom <em>Clearencerequest rolefrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clearencerequest rolefrom</em>'.
	 * @see hADLM1.LienAttachementX6#getClearencerequest_rolefrom()
	 * @see #getLienAttachementX6()
	 * @generated
	 */
	public EReference getLienAttachementX6_Clearencerequest_rolefrom() {
		return (EReference)lienAttachementX6EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.ExternalBindingSendRequest <em>External Binding Send Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Binding Send Request</em>'.
	 * @see hADLM1.ExternalBindingSendRequest
	 * @generated
	 */
	public EClass getExternalBindingSendRequest() {
		return externalBindingSendRequestEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ExternalBindingSendRequest#getSendrequest_portrequisconfig <em>Sendrequest portrequisconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sendrequest portrequisconfig</em>'.
	 * @see hADLM1.ExternalBindingSendRequest#getSendrequest_portrequisconfig()
	 * @see #getExternalBindingSendRequest()
	 * @generated
	 */
	public EReference getExternalBindingSendRequest_Sendrequest_portrequisconfig() {
		return (EReference)externalBindingSendRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ExternalBindingSendRequest#getExternalportrequisclientsendrequest <em>Externalportrequisclientsendrequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Externalportrequisclientsendrequest</em>'.
	 * @see hADLM1.ExternalBindingSendRequest#getExternalportrequisclientsendrequest()
	 * @see #getExternalBindingSendRequest()
	 * @generated
	 */
	public EReference getExternalBindingSendRequest_Externalportrequisclientsendrequest() {
		return (EReference)externalBindingSendRequestEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link hADLM1.Client_Composant <em>Client Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client Composant</em>'.
	 * @see hADLM1.Client_Composant
	 * @generated
	 */
	public EClass getClient_Composant() {
		return client_ComposantEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Client_Composant#getSend_request_port <em>Send request port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Send request port</em>'.
	 * @see hADLM1.Client_Composant#getSend_request_port()
	 * @see #getClient_Composant()
	 * @generated
	 */
	public EReference getClient_Composant_Send_request_port() {
		return (EReference)client_ComposantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Client_Composant#getAnswerrequest_portrequiscompo <em>Answerrequest portrequiscompo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Answerrequest portrequiscompo</em>'.
	 * @see hADLM1.Client_Composant#getAnswerrequest_portrequiscompo()
	 * @see #getClient_Composant()
	 * @generated
	 */
	public EReference getClient_Composant_Answerrequest_portrequiscompo() {
		return (EReference)client_ComposantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Client_Composant#getExternalportfourniclientanswerrequest <em>Externalportfourniclientanswerrequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Externalportfourniclientanswerrequest</em>'.
	 * @see hADLM1.Client_Composant#getExternalportfourniclientanswerrequest()
	 * @see #getClient_Composant()
	 * @generated
	 */
	public EReference getClient_Composant_Externalportfourniclientanswerrequest() {
		return (EReference)client_ComposantEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Client_Composant#getExternalportrequisclientsendrequest <em>Externalportrequisclientsendrequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Externalportrequisclientsendrequest</em>'.
	 * @see hADLM1.Client_Composant#getExternalportrequisclientsendrequest()
	 * @see #getClient_Composant()
	 * @generated
	 */
	public EReference getClient_Composant_Externalportrequisclientsendrequest() {
		return (EReference)client_ComposantEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for class '{@link hADLM1.Receive_request_PortRequisCompo <em>Receive request Port Requis Compo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive request Port Requis Compo</em>'.
	 * @see hADLM1.Receive_request_PortRequisCompo
	 * @generated
	 */
	public EClass getReceive_request_PortRequisCompo() {
		return receive_request_PortRequisCompoEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.SendRequest_PortRequisConfig <em>Send Request Port Requis Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Request Port Requis Config</em>'.
	 * @see hADLM1.SendRequest_PortRequisConfig
	 * @generated
	 */
	public EClass getSendRequest_PortRequisConfig() {
		return sendRequest_PortRequisConfigEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.ClearenceRequest_RoleTo <em>Clearence Request Role To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clearence Request Role To</em>'.
	 * @see hADLM1.ClearenceRequest_RoleTo
	 * @generated
	 */
	public EClass getClearenceRequest_RoleTo() {
		return clearenceRequest_RoleToEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.SQLRequest_Connector <em>SQL Request Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Request Connector</em>'.
	 * @see hADLM1.SQLRequest_Connector
	 * @generated
	 */
	public EClass getSQLRequest_Connector() {
		return sqlRequest_ConnectorEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.SQLRequest_Connector#getSqlrequest_roleto <em>Sqlrequest roleto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sqlrequest roleto</em>'.
	 * @see hADLM1.SQLRequest_Connector#getSqlrequest_roleto()
	 * @see #getSQLRequest_Connector()
	 * @generated
	 */
	public EReference getSQLRequest_Connector_Sqlrequest_roleto() {
		return (EReference)sqlRequest_ConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.SQLRequest_Connector#getSqlrequest_rolefrom <em>Sqlrequest rolefrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sqlrequest rolefrom</em>'.
	 * @see hADLM1.SQLRequest_Connector#getSqlrequest_rolefrom()
	 * @see #getSQLRequest_Connector()
	 * @generated
	 */
	public EReference getSQLRequest_Connector_Sqlrequest_rolefrom() {
		return (EReference)sqlRequest_ConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.Send_request_PortFourniCompo <em>Send request Port Fourni Compo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send request Port Fourni Compo</em>'.
	 * @see hADLM1.Send_request_PortFourniCompo
	 * @generated
	 */
	public EClass getSend_request_PortFourniCompo() {
		return send_request_PortFourniCompoEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.SecurityManagement_PortFourni <em>Security Management Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Management Port Fourni</em>'.
	 * @see hADLM1.SecurityManagement_PortFourni
	 * @generated
	 */
	public EClass getSecurityManagement_PortFourni() {
		return securityManagement_PortFourniEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.LienAttachementY2 <em>Lien Attachement Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement Y2</em>'.
	 * @see hADLM1.LienAttachementY2
	 * @generated
	 */
	public EClass getLienAttachementY2() {
		return lienAttachementY2EClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementY2#getQueryint_portrequis <em>Queryint portrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Queryint portrequis</em>'.
	 * @see hADLM1.LienAttachementY2#getQueryint_portrequis()
	 * @see #getLienAttachementY2()
	 * @generated
	 */
	public EReference getLienAttachementY2_Queryint_portrequis() {
		return (EReference)lienAttachementY2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementY2#getSqlrequest_roleto <em>Sqlrequest roleto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sqlrequest roleto</em>'.
	 * @see hADLM1.LienAttachementY2#getSqlrequest_roleto()
	 * @see #getLienAttachementY2()
	 * @generated
	 */
	public EReference getLienAttachementY2_Sqlrequest_roleto() {
		return (EReference)lienAttachementY2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.callerAnswer_RoleFrom <em>caller Answer Role From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>caller Answer Role From</em>'.
	 * @see hADLM1.callerAnswer_RoleFrom
	 * @generated
	 */
	public EClass getcallerAnswer_RoleFrom() {
		return callerAnswer_RoleFromEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.ServeurDetails_Configuration <em>Serveur Details Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serveur Details Configuration</em>'.
	 * @see hADLM1.ServeurDetails_Configuration
	 * @generated
	 */
	public EClass getServeurDetails_Configuration() {
		return serveurDetails_ConfigurationEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getConnectionmanager_composant <em>Connectionmanager composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connectionmanager composant</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getConnectionmanager_composant()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Connectionmanager_composant() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getSecuritymanager_composant <em>Securitymanager composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securitymanager composant</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getSecuritymanager_composant()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Securitymanager_composant() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getDatabase_composant <em>Database composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database composant</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getDatabase_composant()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Database_composant() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getClearencerequest_connector <em>Clearencerequest connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clearencerequest connector</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getClearencerequest_connector()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Clearencerequest_connector() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getSqlrequest_connector <em>Sqlrequest connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sqlrequest connector</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getSqlrequest_connector()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Sqlrequest_connector() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getSecurityquery_connector <em>Securityquery connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityquery connector</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getSecurityquery_connector()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Securityquery_connector() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getLienattachementx1 <em>Lienattachementx1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lienattachementx1</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getLienattachementx1()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Lienattachementx1() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getLienattachementx2 <em>Lienattachementx2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lienattachementx2</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getLienattachementx2()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Lienattachementx2() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getLienattachementx3 <em>Lienattachementx3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lienattachementx3</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getLienattachementx3()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Lienattachementx3() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getLienattachementx4 <em>Lienattachementx4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lienattachementx4</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getLienattachementx4()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Lienattachementx4() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getLienattachementx5 <em>Lienattachementx5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lienattachementx5</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getLienattachementx5()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Lienattachementx5() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getLienattachementx6 <em>Lienattachementx6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lienattachementx6</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getLienattachementx6()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Lienattachementx6() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getLienattachementy1 <em>Lienattachementy1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lienattachementy1</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getLienattachementy1()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Lienattachementy1() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getLienattachementy2 <em>Lienattachementy2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lienattachementy2</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getLienattachementy2()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Lienattachementy2() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getLienattachementy3 <em>Lienattachementy3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lienattachementy3</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getLienattachementy3()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Lienattachementy3() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getLienattachementy6 <em>Lienattachementy6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lienattachementy6</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getLienattachementy6()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Lienattachementy6() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(15);
	}


	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getLienattachementy4 <em>Lienattachementy4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lienattachementy4</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getLienattachementy4()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Lienattachementy4() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getLienattachementy5 <em>Lienattachementy5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lienattachementy5</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getLienattachementy5()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Lienattachementy5() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getReceiverequestrequisconfig <em>Receiverequestrequisconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receiverequestrequisconfig</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getReceiverequestrequisconfig()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Receiverequestrequisconfig() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getAnswerrequest_portfourni <em>Answerrequest portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Answerrequest portfourni</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getAnswerrequest_portfourni()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Answerrequest_portfourni() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getBindingserveurfourni <em>Bindingserveurfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bindingserveurfourni</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getBindingserveurfourni()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Bindingserveurfourni() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(20);
	}


	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ServeurDetails_Configuration#getBindingrequisserveurdetails <em>Bindingrequisserveurdetails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bindingrequisserveurdetails</em>'.
	 * @see hADLM1.ServeurDetails_Configuration#getBindingrequisserveurdetails()
	 * @see #getServeurDetails_Configuration()
	 * @generated
	 */
	public EReference getServeurDetails_Configuration_Bindingrequisserveurdetails() {
		return (EReference)serveurDetails_ConfigurationEClass.getEStructuralFeatures().get(21);
	}


	/**
	 * Returns the meta object for class '{@link hADLM1.SecurityAuth_PortRequis <em>Security Auth Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Auth Port Requis</em>'.
	 * @see hADLM1.SecurityAuth_PortRequis
	 * @generated
	 */
	public EClass getSecurityAuth_PortRequis() {
		return securityAuth_PortRequisEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.AnswerRequest_PortRequisCompo <em>Answer Request Port Requis Compo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer Request Port Requis Compo</em>'.
	 * @see hADLM1.AnswerRequest_PortRequisCompo
	 * @generated
	 */
	public EClass getAnswerRequest_PortRequisCompo() {
		return answerRequest_PortRequisCompoEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.LienAttachementY1 <em>Lien Attachement Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement Y1</em>'.
	 * @see hADLM1.LienAttachementY1
	 * @generated
	 */
	public EClass getLienAttachementY1() {
		return lienAttachementY1EClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementY1#getSecuritymanagement_portrequis <em>Securitymanagement portrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securitymanagement portrequis</em>'.
	 * @see hADLM1.LienAttachementY1#getSecuritymanagement_portrequis()
	 * @see #getLienAttachementY1()
	 * @generated
	 */
	public EReference getLienAttachementY1_Securitymanagement_portrequis() {
		return (EReference)lienAttachementY1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementY1#getSecurityquery_roleto <em>Securityquery roleto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityquery roleto</em>'.
	 * @see hADLM1.LienAttachementY1#getSecurityquery_roleto()
	 * @see #getLienAttachementY1()
	 * @generated
	 */
	public EReference getLienAttachementY1_Securityquery_roleto() {
		return (EReference)lienAttachementY1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.RPC_ConnectorExplicite <em>RPC Connector Explicite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPC Connector Explicite</em>'.
	 * @see hADLM1.RPC_ConnectorExplicite
	 * @generated
	 */
	public EClass getRPC_ConnectorExplicite() {
		return rpC_ConnectorExpliciteEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.RPC_ConnectorExplicite#getCaller_role <em>Caller role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caller role</em>'.
	 * @see hADLM1.RPC_ConnectorExplicite#getCaller_role()
	 * @see #getRPC_ConnectorExplicite()
	 * @generated
	 */
	public EReference getRPC_ConnectorExplicite_Caller_role() {
		return (EReference)rpC_ConnectorExpliciteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.RPC_ConnectorExplicite#getCalled_roleto <em>Called roleto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Called roleto</em>'.
	 * @see hADLM1.RPC_ConnectorExplicite#getCalled_roleto()
	 * @see #getRPC_ConnectorExplicite()
	 * @generated
	 */
	public EReference getRPC_ConnectorExplicite_Called_roleto() {
		return (EReference)rpC_ConnectorExpliciteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.RPC_ConnectorExplicite#getCalledanswer_roleto <em>Calledanswer roleto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calledanswer roleto</em>'.
	 * @see hADLM1.RPC_ConnectorExplicite#getCalledanswer_roleto()
	 * @see #getRPC_ConnectorExplicite()
	 * @generated
	 */
	public EReference getRPC_ConnectorExplicite_Calledanswer_roleto() {
		return (EReference)rpC_ConnectorExpliciteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.RPC_ConnectorExplicite#getCalleranswer_rolefrom <em>Calleranswer rolefrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calleranswer rolefrom</em>'.
	 * @see hADLM1.RPC_ConnectorExplicite#getCalleranswer_rolefrom()
	 * @see #getRPC_ConnectorExplicite()
	 * @generated
	 */
	public EReference getRPC_ConnectorExplicite_Calleranswer_rolefrom() {
		return (EReference)rpC_ConnectorExpliciteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.LienAttachementY3 <em>Lien Attachement Y3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement Y3</em>'.
	 * @see hADLM1.LienAttachementY3
	 * @generated
	 */
	public EClass getLienAttachementY3() {
		return lienAttachementY3EClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementY3#getSecurityauth_portrequis <em>Securityauth portrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityauth portrequis</em>'.
	 * @see hADLM1.LienAttachementY3#getSecurityauth_portrequis()
	 * @see #getLienAttachementY3()
	 * @generated
	 */
	public EReference getLienAttachementY3_Securityauth_portrequis() {
		return (EReference)lienAttachementY3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementY3#getClearencerequest_roleto <em>Clearencerequest roleto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clearencerequest roleto</em>'.
	 * @see hADLM1.LienAttachementY3#getClearencerequest_roleto()
	 * @see #getLienAttachementY3()
	 * @generated
	 */
	public EReference getLienAttachementY3_Clearencerequest_roleto() {
		return (EReference)lienAttachementY3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.BindingServeurFourniCompo <em>Binding Serveur Fourni Compo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Serveur Fourni Compo</em>'.
	 * @see hADLM1.BindingServeurFourniCompo
	 * @generated
	 */
	public EClass getBindingServeurFourniCompo() {
		return bindingServeurFourniCompoEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.BindingServeurFourniCompo#getAnswerrequest_portfourni <em>Answerrequest portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Answerrequest portfourni</em>'.
	 * @see hADLM1.BindingServeurFourniCompo#getAnswerrequest_portfourni()
	 * @see #getBindingServeurFourniCompo()
	 * @generated
	 */
	public EReference getBindingServeurFourniCompo_Answerrequest_portfourni() {
		return (EReference)bindingServeurFourniCompoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.BindingServeurFourniCompo#getAnswerrequest_portfournicompo <em>Answerrequest portfournicompo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Answerrequest portfournicompo</em>'.
	 * @see hADLM1.BindingServeurFourniCompo#getAnswerrequest_portfournicompo()
	 * @see #getBindingServeurFourniCompo()
	 * @generated
	 */
	public EReference getBindingServeurFourniCompo_Answerrequest_portfournicompo() {
		return (EReference)bindingServeurFourniCompoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.QueryInt_PortFourni <em>Query Int Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Int Port Fourni</em>'.
	 * @see hADLM1.QueryInt_PortFourni
	 * @generated
	 */
	public EClass getQueryInt_PortFourni() {
		return queryInt_PortFourniEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.called_RoleTo <em>called Role To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>called Role To</em>'.
	 * @see hADLM1.called_RoleTo
	 * @generated
	 */
	public EClass getcalled_RoleTo() {
		return called_RoleToEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.ClearenceRequest_Connector <em>Clearence Request Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clearence Request Connector</em>'.
	 * @see hADLM1.ClearenceRequest_Connector
	 * @generated
	 */
	public EClass getClearenceRequest_Connector() {
		return clearenceRequest_ConnectorEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ClearenceRequest_Connector#getClearencerequest_roleto <em>Clearencerequest roleto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clearencerequest roleto</em>'.
	 * @see hADLM1.ClearenceRequest_Connector#getClearencerequest_roleto()
	 * @see #getClearenceRequest_Connector()
	 * @generated
	 */
	public EReference getClearenceRequest_Connector_Clearencerequest_roleto() {
		return (EReference)clearenceRequest_ConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ClearenceRequest_Connector#getClearencerequest_rolefrom <em>Clearencerequest rolefrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clearencerequest rolefrom</em>'.
	 * @see hADLM1.ClearenceRequest_Connector#getClearencerequest_rolefrom()
	 * @see #getClearenceRequest_Connector()
	 * @generated
	 */
	public EReference getClearenceRequest_Connector_Clearencerequest_rolefrom() {
		return (EReference)clearenceRequest_ConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.LienAttachementXRequest <em>Lien Attachement XRequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement XRequest</em>'.
	 * @see hADLM1.LienAttachementXRequest
	 * @generated
	 */
	public EClass getLienAttachementXRequest() {
		return lienAttachementXRequestEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementXRequest#getCaller_rolefrom <em>Caller rolefrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caller rolefrom</em>'.
	 * @see hADLM1.LienAttachementXRequest#getCaller_rolefrom()
	 * @see #getLienAttachementXRequest()
	 * @generated
	 */
	public EReference getLienAttachementXRequest_Caller_rolefrom() {
		return (EReference)lienAttachementXRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementXRequest#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>W</em>'.
	 * @see hADLM1.LienAttachementXRequest#getW()
	 * @see #getLienAttachementXRequest()
	 * @generated
	 */
	public EReference getLienAttachementXRequest_W() {
		return (EReference)lienAttachementXRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.SecurityAuth_PortFourni <em>Security Auth Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Auth Port Fourni</em>'.
	 * @see hADLM1.SecurityAuth_PortFourni
	 * @generated
	 */
	public EClass getSecurityAuth_PortFourni() {
		return securityAuth_PortFourniEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.AnswerRequest_PortFourni <em>Answer Request Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer Request Port Fourni</em>'.
	 * @see hADLM1.AnswerRequest_PortFourni
	 * @generated
	 */
	public EClass getAnswerRequest_PortFourni() {
		return answerRequest_PortFourniEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.SecurityQuery_Connector <em>Security Query Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Query Connector</em>'.
	 * @see hADLM1.SecurityQuery_Connector
	 * @generated
	 */
	public EClass getSecurityQuery_Connector() {
		return securityQuery_ConnectorEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.SecurityQuery_Connector#getSecurityquery_roleto <em>Securityquery roleto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityquery roleto</em>'.
	 * @see hADLM1.SecurityQuery_Connector#getSecurityquery_roleto()
	 * @see #getSecurityQuery_Connector()
	 * @generated
	 */
	public EReference getSecurityQuery_Connector_Securityquery_roleto() {
		return (EReference)securityQuery_ConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.SecurityQuery_Connector#getSecurityquery_rolefrom <em>Securityquery rolefrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityquery rolefrom</em>'.
	 * @see hADLM1.SecurityQuery_Connector#getSecurityquery_rolefrom()
	 * @see #getSecurityQuery_Connector()
	 * @generated
	 */
	public EReference getSecurityQuery_Connector_Securityquery_rolefrom() {
		return (EReference)securityQuery_ConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.ExternalSocket_PortRequis <em>External Socket Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Socket Port Requis</em>'.
	 * @see hADLM1.ExternalSocket_PortRequis
	 * @generated
	 */
	public EClass getExternalSocket_PortRequis() {
		return externalSocket_PortRequisEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.ClearenceRequest_RoleFrom <em>Clearence Request Role From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clearence Request Role From</em>'.
	 * @see hADLM1.ClearenceRequest_RoleFrom
	 * @generated
	 */
	public EClass getClearenceRequest_RoleFrom() {
		return clearenceRequest_RoleFromEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.DBQuery_PortFourni <em>DB Query Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Query Port Fourni</em>'.
	 * @see hADLM1.DBQuery_PortFourni
	 * @generated
	 */
	public EClass getDBQuery_PortFourni() {
		return dbQuery_PortFourniEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.DBQuery_PortRequis <em>DB Query Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Query Port Requis</em>'.
	 * @see hADLM1.DBQuery_PortRequis
	 * @generated
	 */
	public EClass getDBQuery_PortRequis() {
		return dbQuery_PortRequisEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.BindingServeurFOurni <em>Binding Serveur FOurni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Serveur FOurni</em>'.
	 * @see hADLM1.BindingServeurFOurni
	 * @generated
	 */
	public EClass getBindingServeurFOurni() {
		return bindingServeurFOurniEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.BindingServeurFOurni#getExternalsocket_portfourni <em>Externalsocket portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Externalsocket portfourni</em>'.
	 * @see hADLM1.BindingServeurFOurni#getExternalsocket_portfourni()
	 * @see #getBindingServeurFOurni()
	 * @generated
	 */
	public EReference getBindingServeurFOurni_Externalsocket_portfourni() {
		return (EReference)bindingServeurFOurniEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.BindingServeurFOurni#getAnswerrequest_portfourni <em>Answerrequest portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Answerrequest portfourni</em>'.
	 * @see hADLM1.BindingServeurFOurni#getAnswerrequest_portfourni()
	 * @see #getBindingServeurFOurni()
	 * @generated
	 */
	public EReference getBindingServeurFOurni_Answerrequest_portfourni() {
		return (EReference)bindingServeurFOurniEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.LienAttachementYAnswer <em>Lien Attachement YAnswer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement YAnswer</em>'.
	 * @see hADLM1.LienAttachementYAnswer
	 * @generated
	 */
	public EClass getLienAttachementYAnswer() {
		return lienAttachementYAnswerEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementYAnswer#getCalledanswer_roleto <em>Calledanswer roleto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calledanswer roleto</em>'.
	 * @see hADLM1.LienAttachementYAnswer#getCalledanswer_roleto()
	 * @see #getLienAttachementYAnswer()
	 * @generated
	 */
	public EReference getLienAttachementYAnswer_Calledanswer_roleto() {
		return (EReference)lienAttachementYAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementYAnswer#getAnswerrequest_portrequiscompo <em>Answerrequest portrequiscompo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Answerrequest portrequiscompo</em>'.
	 * @see hADLM1.LienAttachementYAnswer#getAnswerrequest_portrequiscompo()
	 * @see #getLienAttachementYAnswer()
	 * @generated
	 */
	public EReference getLienAttachementYAnswer_Answerrequest_portrequiscompo() {
		return (EReference)lienAttachementYAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.calledAnswer_RoleTo <em>called Answer Role To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>called Answer Role To</em>'.
	 * @see hADLM1.calledAnswer_RoleTo
	 * @generated
	 */
	public EClass getcalledAnswer_RoleTo() {
		return calledAnswer_RoleToEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.SecurityCheck_PortRequis <em>Security Check Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Check Port Requis</em>'.
	 * @see hADLM1.SecurityCheck_PortRequis
	 * @generated
	 */
	public EClass getSecurityCheck_PortRequis() {
		return securityCheck_PortRequisEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.SQLRequest_RoleFrom <em>SQL Request Role From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Request Role From</em>'.
	 * @see hADLM1.SQLRequest_RoleFrom
	 * @generated
	 */
	public EClass getSQLRequest_RoleFrom() {
		return sqlRequest_RoleFromEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.AnswerRequest_PortFourniConfig <em>Answer Request Port Fourni Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer Request Port Fourni Config</em>'.
	 * @see hADLM1.AnswerRequest_PortFourniConfig
	 * @generated
	 */
	public EClass getAnswerRequest_PortFourniConfig() {
		return answerRequest_PortFourniConfigEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.caller_RoleFrom <em>caller Role From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>caller Role From</em>'.
	 * @see hADLM1.caller_RoleFrom
	 * @generated
	 */
	public EClass getcaller_RoleFrom() {
		return caller_RoleFromEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.LienAttachementX1 <em>Lien Attachement X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement X1</em>'.
	 * @see hADLM1.LienAttachementX1
	 * @generated
	 */
	public EClass getLienAttachementX1() {
		return lienAttachementX1EClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementX1#getSecuritymanagement_portfourni <em>Securitymanagement portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securitymanagement portfourni</em>'.
	 * @see hADLM1.LienAttachementX1#getSecuritymanagement_portfourni()
	 * @see #getLienAttachementX1()
	 * @generated
	 */
	public EReference getLienAttachementX1_Securitymanagement_portfourni() {
		return (EReference)lienAttachementX1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementX1#getSecurityquery_rolefrom <em>Securityquery rolefrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityquery rolefrom</em>'.
	 * @see hADLM1.LienAttachementX1#getSecurityquery_rolefrom()
	 * @see #getLienAttachementX1()
	 * @generated
	 */
	public EReference getLienAttachementX1_Securityquery_rolefrom() {
		return (EReference)lienAttachementX1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.CQuery_PortRequis <em>CQuery Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CQuery Port Requis</em>'.
	 * @see hADLM1.CQuery_PortRequis
	 * @generated
	 */
	public EClass getCQuery_PortRequis() {
		return cQuery_PortRequisEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.SQLRequest_RoleTo <em>SQL Request Role To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Request Role To</em>'.
	 * @see hADLM1.SQLRequest_RoleTo
	 * @generated
	 */
	public EClass getSQLRequest_RoleTo() {
		return sqlRequest_RoleToEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.SecurityQuery_RoleTo <em>Security Query Role To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Query Role To</em>'.
	 * @see hADLM1.SecurityQuery_RoleTo
	 * @generated
	 */
	public EClass getSecurityQuery_RoleTo() {
		return securityQuery_RoleToEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.LienAttachementX3 <em>Lien Attachement X3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement X3</em>'.
	 * @see hADLM1.LienAttachementX3
	 * @generated
	 */
	public EClass getLienAttachementX3() {
		return lienAttachementX3EClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementX3#getCquery_portfourni <em>Cquery portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cquery portfourni</em>'.
	 * @see hADLM1.LienAttachementX3#getCquery_portfourni()
	 * @see #getLienAttachementX3()
	 * @generated
	 */
	public EReference getLienAttachementX3_Cquery_portfourni() {
		return (EReference)lienAttachementX3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementX3#getSecurityquery_rolefrom <em>Securityquery rolefrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityquery rolefrom</em>'.
	 * @see hADLM1.LienAttachementX3#getSecurityquery_rolefrom()
	 * @see #getLienAttachementX3()
	 * @generated
	 */
	public EReference getLienAttachementX3_Securityquery_rolefrom() {
		return (EReference)lienAttachementX3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.SecurityQuery_RoleFrom <em>Security Query Role From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Query Role From</em>'.
	 * @see hADLM1.SecurityQuery_RoleFrom
	 * @generated
	 */
	public EClass getSecurityQuery_RoleFrom() {
		return securityQuery_RoleFromEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.AnswerRequest_PortFourniCompo <em>Answer Request Port Fourni Compo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer Request Port Fourni Compo</em>'.
	 * @see hADLM1.AnswerRequest_PortFourniCompo
	 * @generated
	 */
	public EClass getAnswerRequest_PortFourniCompo() {
		return answerRequest_PortFourniCompoEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.LienAttachementY5 <em>Lien Attachement Y5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement Y5</em>'.
	 * @see hADLM1.LienAttachementY5
	 * @generated
	 */
	public EClass getLienAttachementY5() {
		return lienAttachementY5EClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementY5#getCquery_portrequis <em>Cquery portrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cquery portrequis</em>'.
	 * @see hADLM1.LienAttachementY5#getCquery_portrequis()
	 * @see #getLienAttachementY5()
	 * @generated
	 */
	public EReference getLienAttachementY5_Cquery_portrequis() {
		return (EReference)lienAttachementY5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementY5#getSecurityquery_roleto <em>Securityquery roleto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityquery roleto</em>'.
	 * @see hADLM1.LienAttachementY5#getSecurityquery_roleto()
	 * @see #getLienAttachementY5()
	 * @generated
	 */
	public EReference getLienAttachementY5_Securityquery_roleto() {
		return (EReference)lienAttachementY5EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.SecurityManager_Composant <em>Security Manager Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Manager Composant</em>'.
	 * @see hADLM1.SecurityManager_Composant
	 * @generated
	 */
	public EClass getSecurityManager_Composant() {
		return securityManager_ComposantEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.SecurityManager_Composant#getCquery_portfourni <em>Cquery portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cquery portfourni</em>'.
	 * @see hADLM1.SecurityManager_Composant#getCquery_portfourni()
	 * @see #getSecurityManager_Composant()
	 * @generated
	 */
	public EReference getSecurityManager_Composant_Cquery_portfourni() {
		return (EReference)securityManager_ComposantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.SecurityManager_Composant#getSecurityauth_portrequis <em>Securityauth portrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityauth portrequis</em>'.
	 * @see hADLM1.SecurityManager_Composant#getSecurityauth_portrequis()
	 * @see #getSecurityManager_Composant()
	 * @generated
	 */
	public EReference getSecurityManager_Composant_Securityauth_portrequis() {
		return (EReference)securityManager_ComposantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.SecurityManager_Composant#getCquery_portrequis <em>Cquery portrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cquery portrequis</em>'.
	 * @see hADLM1.SecurityManager_Composant#getCquery_portrequis()
	 * @see #getSecurityManager_Composant()
	 * @generated
	 */
	public EReference getSecurityManager_Composant_Cquery_portrequis() {
		return (EReference)securityManager_ComposantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.SecurityManager_Composant#getSecurityauth_portfourni <em>Securityauth portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityauth portfourni</em>'.
	 * @see hADLM1.SecurityManager_Composant#getSecurityauth_portfourni()
	 * @see #getSecurityManager_Composant()
	 * @generated
	 */
	public EReference getSecurityManager_Composant_Securityauth_portfourni() {
		return (EReference)securityManager_ComposantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.ConnectionManager_Composant <em>Connection Manager Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Manager Composant</em>'.
	 * @see hADLM1.ConnectionManager_Composant
	 * @generated
	 */
	public EClass getConnectionManager_Composant() {
		return connectionManager_ComposantEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ConnectionManager_Composant#getExternalsocket_portrequis <em>Externalsocket portrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Externalsocket portrequis</em>'.
	 * @see hADLM1.ConnectionManager_Composant#getExternalsocket_portrequis()
	 * @see #getConnectionManager_Composant()
	 * @generated
	 */
	public EReference getConnectionManager_Composant_Externalsocket_portrequis() {
		return (EReference)connectionManager_ComposantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ConnectionManager_Composant#getSecuritycheck_portfourni <em>Securitycheck portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securitycheck portfourni</em>'.
	 * @see hADLM1.ConnectionManager_Composant#getSecuritycheck_portfourni()
	 * @see #getConnectionManager_Composant()
	 * @generated
	 */
	public EReference getConnectionManager_Composant_Securitycheck_portfourni() {
		return (EReference)connectionManager_ComposantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ConnectionManager_Composant#getDbquery_portfourni <em>Dbquery portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dbquery portfourni</em>'.
	 * @see hADLM1.ConnectionManager_Composant#getDbquery_portfourni()
	 * @see #getConnectionManager_Composant()
	 * @generated
	 */
	public EReference getConnectionManager_Composant_Dbquery_portfourni() {
		return (EReference)connectionManager_ComposantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ConnectionManager_Composant#getDbquery_portrequis <em>Dbquery portrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dbquery portrequis</em>'.
	 * @see hADLM1.ConnectionManager_Composant#getDbquery_portrequis()
	 * @see #getConnectionManager_Composant()
	 * @generated
	 */
	public EReference getConnectionManager_Composant_Dbquery_portrequis() {
		return (EReference)connectionManager_ComposantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ConnectionManager_Composant#getSecuritycheck_portrequis <em>Securitycheck portrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securitycheck portrequis</em>'.
	 * @see hADLM1.ConnectionManager_Composant#getSecuritycheck_portrequis()
	 * @see #getConnectionManager_Composant()
	 * @generated
	 */
	public EReference getConnectionManager_Composant_Securitycheck_portrequis() {
		return (EReference)connectionManager_ComposantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ConnectionManager_Composant#getExternalsocket_portfourni <em>Externalsocket portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Externalsocket portfourni</em>'.
	 * @see hADLM1.ConnectionManager_Composant#getExternalsocket_portfourni()
	 * @see #getConnectionManager_Composant()
	 * @generated
	 */
	public EReference getConnectionManager_Composant_Externalsocket_portfourni() {
		return (EReference)connectionManager_ComposantEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.bindingRequisServeurConfig <em>binding Requis Serveur Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>binding Requis Serveur Config</em>'.
	 * @see hADLM1.bindingRequisServeurConfig
	 * @generated
	 */
	public EClass getbindingRequisServeurConfig() {
		return bindingRequisServeurConfigEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.bindingRequisServeurConfig#getReceiverequestrequisconfig <em>Receiverequestrequisconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receiverequestrequisconfig</em>'.
	 * @see hADLM1.bindingRequisServeurConfig#getReceiverequestrequisconfig()
	 * @see #getbindingRequisServeurConfig()
	 * @generated
	 */
	public EReference getbindingRequisServeurConfig_Receiverequestrequisconfig() {
		return (EReference)bindingRequisServeurConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.bindingRequisServeurConfig#getReceive_request_portrequiscompo <em>Receive request portrequiscompo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive request portrequiscompo</em>'.
	 * @see hADLM1.bindingRequisServeurConfig#getReceive_request_portrequiscompo()
	 * @see #getbindingRequisServeurConfig()
	 * @generated
	 */
	public EReference getbindingRequisServeurConfig_Receive_request_portrequiscompo() {
		return (EReference)bindingRequisServeurConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.SecurityManagement_PortRequis <em>Security Management Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Management Port Requis</em>'.
	 * @see hADLM1.SecurityManagement_PortRequis
	 * @generated
	 */
	public EClass getSecurityManagement_PortRequis() {
		return securityManagement_PortRequisEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.LienAttachementX2 <em>Lien Attachement X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement X2</em>'.
	 * @see hADLM1.LienAttachementX2
	 * @generated
	 */
	public EClass getLienAttachementX2() {
		return lienAttachementX2EClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementX2#getQueryint_portfourni <em>Queryint portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Queryint portfourni</em>'.
	 * @see hADLM1.LienAttachementX2#getQueryint_portfourni()
	 * @see #getLienAttachementX2()
	 * @generated
	 */
	public EReference getLienAttachementX2_Queryint_portfourni() {
		return (EReference)lienAttachementX2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementX2#getSqlrequest_rolefrom <em>Sqlrequest rolefrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sqlrequest rolefrom</em>'.
	 * @see hADLM1.LienAttachementX2#getSqlrequest_rolefrom()
	 * @see #getLienAttachementX2()
	 * @generated
	 */
	public EReference getLienAttachementX2_Sqlrequest_rolefrom() {
		return (EReference)lienAttachementX2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.LienAttachementYRequest <em>Lien Attachement YRequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement YRequest</em>'.
	 * @see hADLM1.LienAttachementYRequest
	 * @generated
	 */
	public EClass getLienAttachementYRequest() {
		return lienAttachementYRequestEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementYRequest#getCalled_roleto <em>Called roleto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Called roleto</em>'.
	 * @see hADLM1.LienAttachementYRequest#getCalled_roleto()
	 * @see #getLienAttachementYRequest()
	 * @generated
	 */
	public EReference getLienAttachementYRequest_Called_roleto() {
		return (EReference)lienAttachementYRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementYRequest#getReceive_request_portrequiscompo <em>Receive request portrequiscompo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive request portrequiscompo</em>'.
	 * @see hADLM1.LienAttachementYRequest#getReceive_request_portrequiscompo()
	 * @see #getLienAttachementYRequest()
	 * @generated
	 */
	public EReference getLienAttachementYRequest_Receive_request_portrequiscompo() {
		return (EReference)lienAttachementYRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.Systeme_Configuration <em>Systeme Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systeme Configuration</em>'.
	 * @see hADLM1.Systeme_Configuration
	 * @generated
	 */
	public EClass getSysteme_Configuration() {
		return systeme_ConfigurationEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Systeme_Configuration#getClient_composant <em>Client composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client composant</em>'.
	 * @see hADLM1.Systeme_Configuration#getClient_composant()
	 * @see #getSysteme_Configuration()
	 * @generated
	 */
	public EReference getSysteme_Configuration_Client_composant() {
		return (EReference)systeme_ConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Systeme_Configuration#getServeur_composant <em>Serveur composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serveur composant</em>'.
	 * @see hADLM1.Systeme_Configuration#getServeur_composant()
	 * @see #getSysteme_Configuration()
	 * @generated
	 */
	public EReference getSysteme_Configuration_Serveur_composant() {
		return (EReference)systeme_ConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Systeme_Configuration#getRpc_connectorexplicite <em>Rpc connectorexplicite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rpc connectorexplicite</em>'.
	 * @see hADLM1.Systeme_Configuration#getRpc_connectorexplicite()
	 * @see #getSysteme_Configuration()
	 * @generated
	 */
	public EReference getSysteme_Configuration_Rpc_connectorexplicite() {
		return (EReference)systeme_ConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Systeme_Configuration#getLienattachementx <em>Lienattachementx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lienattachementx</em>'.
	 * @see hADLM1.Systeme_Configuration#getLienattachementx()
	 * @see #getSysteme_Configuration()
	 * @generated
	 */
	public EReference getSysteme_Configuration_Lienattachementx() {
		return (EReference)systeme_ConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Systeme_Configuration#getLienattachementy <em>Lienattachementy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lienattachementy</em>'.
	 * @see hADLM1.Systeme_Configuration#getLienattachementy()
	 * @see #getSysteme_Configuration()
	 * @generated
	 */
	public EReference getSysteme_Configuration_Lienattachementy() {
		return (EReference)systeme_ConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Systeme_Configuration#getSendrequest_portrequisconfig <em>Sendrequest portrequisconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sendrequest portrequisconfig</em>'.
	 * @see hADLM1.Systeme_Configuration#getSendrequest_portrequisconfig()
	 * @see #getSysteme_Configuration()
	 * @generated
	 */
	public EReference getSysteme_Configuration_Sendrequest_portrequisconfig() {
		return (EReference)systeme_ConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Systeme_Configuration#getAnswerrequest_portfourniconfig <em>Answerrequest portfourniconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Answerrequest portfourniconfig</em>'.
	 * @see hADLM1.Systeme_Configuration#getAnswerrequest_portfourniconfig()
	 * @see #getSysteme_Configuration()
	 * @generated
	 */
	public EReference getSysteme_Configuration_Answerrequest_portfourniconfig() {
		return (EReference)systeme_ConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Systeme_Configuration#getExternalbindinganswerrequest <em>Externalbindinganswerrequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Externalbindinganswerrequest</em>'.
	 * @see hADLM1.Systeme_Configuration#getExternalbindinganswerrequest()
	 * @see #getSysteme_Configuration()
	 * @generated
	 */
	public EReference getSysteme_Configuration_Externalbindinganswerrequest() {
		return (EReference)systeme_ConfigurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Systeme_Configuration#getExternalbindingsendrequest <em>Externalbindingsendrequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Externalbindingsendrequest</em>'.
	 * @see hADLM1.Systeme_Configuration#getExternalbindingsendrequest()
	 * @see #getSysteme_Configuration()
	 * @generated
	 */
	public EReference getSysteme_Configuration_Externalbindingsendrequest() {
		return (EReference)systeme_ConfigurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Systeme_Configuration#getLienattachementxanswer <em>Lienattachementxanswer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lienattachementxanswer</em>'.
	 * @see hADLM1.Systeme_Configuration#getLienattachementxanswer()
	 * @see #getSysteme_Configuration()
	 * @generated
	 */
	public EReference getSysteme_Configuration_Lienattachementxanswer() {
		return (EReference)systeme_ConfigurationEClass.getEStructuralFeatures().get(9);
	}


	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Systeme_Configuration#getLienattachementyanswer <em>Lienattachementyanswer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lienattachementyanswer</em>'.
	 * @see hADLM1.Systeme_Configuration#getLienattachementyanswer()
	 * @see #getSysteme_Configuration()
	 * @generated
	 */
	public EReference getSysteme_Configuration_Lienattachementyanswer() {
		return (EReference)systeme_ConfigurationEClass.getEStructuralFeatures().get(10);
	}


	/**
	 * Returns the meta object for class '{@link hADLM1.LienAttachementXAnswer <em>Lien Attachement XAnswer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement XAnswer</em>'.
	 * @see hADLM1.LienAttachementXAnswer
	 * @generated
	 */
	public EClass getLienAttachementXAnswer() {
		return lienAttachementXAnswerEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementXAnswer#getCalleranswer_rolefrom <em>Calleranswer rolefrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calleranswer rolefrom</em>'.
	 * @see hADLM1.LienAttachementXAnswer#getCalleranswer_rolefrom()
	 * @see #getLienAttachementXAnswer()
	 * @generated
	 */
	public EReference getLienAttachementXAnswer_Calleranswer_rolefrom() {
		return (EReference)lienAttachementXAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementXAnswer#getAnswerrequest_portfournicompo <em>Answerrequest portfournicompo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Answerrequest portfournicompo</em>'.
	 * @see hADLM1.LienAttachementXAnswer#getAnswerrequest_portfournicompo()
	 * @see #getLienAttachementXAnswer()
	 * @generated
	 */
	public EReference getLienAttachementXAnswer_Answerrequest_portfournicompo() {
		return (EReference)lienAttachementXAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.bindingRequisServeurDetails <em>binding Requis Serveur Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>binding Requis Serveur Details</em>'.
	 * @see hADLM1.bindingRequisServeurDetails
	 * @generated
	 */
	public EClass getbindingRequisServeurDetails() {
		return bindingRequisServeurDetailsEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.bindingRequisServeurDetails#getReceive_request_portrequiscompo <em>Receive request portrequiscompo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive request portrequiscompo</em>'.
	 * @see hADLM1.bindingRequisServeurDetails#getReceive_request_portrequiscompo()
	 * @see #getbindingRequisServeurDetails()
	 * @generated
	 */
	public EReference getbindingRequisServeurDetails_Receive_request_portrequiscompo() {
		return (EReference)bindingRequisServeurDetailsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.bindingRequisServeurDetails#getExternalsocket_portrequis <em>Externalsocket portrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Externalsocket portrequis</em>'.
	 * @see hADLM1.bindingRequisServeurDetails#getExternalsocket_portrequis()
	 * @see #getbindingRequisServeurDetails()
	 * @generated
	 */
	public EReference getbindingRequisServeurDetails_Externalsocket_portrequis() {
		return (EReference)bindingRequisServeurDetailsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.LienAttachementX4 <em>Lien Attachement X4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement X4</em>'.
	 * @see hADLM1.LienAttachementX4
	 * @generated
	 */
	public EClass getLienAttachementX4() {
		return lienAttachementX4EClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementX4#getSecurityauth_portfourni <em>Securityauth portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securityauth portfourni</em>'.
	 * @see hADLM1.LienAttachementX4#getSecurityauth_portfourni()
	 * @see #getLienAttachementX4()
	 * @generated
	 */
	public EReference getLienAttachementX4_Securityauth_portfourni() {
		return (EReference)lienAttachementX4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementX4#getClearencerequest_rolefrom <em>Clearencerequest rolefrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clearencerequest rolefrom</em>'.
	 * @see hADLM1.LienAttachementX4#getClearencerequest_rolefrom()
	 * @see #getLienAttachementX4()
	 * @generated
	 */
	public EReference getLienAttachementX4_Clearencerequest_rolefrom() {
		return (EReference)lienAttachementX4EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.Database_Composant <em>Database Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Composant</em>'.
	 * @see hADLM1.Database_Composant
	 * @generated
	 */
	public EClass getDatabase_Composant() {
		return database_ComposantEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Database_Composant#getQueryint_portrequis <em>Queryint portrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Queryint portrequis</em>'.
	 * @see hADLM1.Database_Composant#getQueryint_portrequis()
	 * @see #getDatabase_Composant()
	 * @generated
	 */
	public EReference getDatabase_Composant_Queryint_portrequis() {
		return (EReference)database_ComposantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Database_Composant#getSecuritymanagement_portrequis <em>Securitymanagement portrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securitymanagement portrequis</em>'.
	 * @see hADLM1.Database_Composant#getSecuritymanagement_portrequis()
	 * @see #getDatabase_Composant()
	 * @generated
	 */
	public EReference getDatabase_Composant_Securitymanagement_portrequis() {
		return (EReference)database_ComposantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Database_Composant#getQueryint_portfourni <em>Queryint portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Queryint portfourni</em>'.
	 * @see hADLM1.Database_Composant#getQueryint_portfourni()
	 * @see #getDatabase_Composant()
	 * @generated
	 */
	public EReference getDatabase_Composant_Queryint_portfourni() {
		return (EReference)database_ComposantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.Database_Composant#getSecuritymanagement_portfourni <em>Securitymanagement portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securitymanagement portfourni</em>'.
	 * @see hADLM1.Database_Composant#getSecuritymanagement_portfourni()
	 * @see #getDatabase_Composant()
	 * @generated
	 */
	public EReference getDatabase_Composant_Securitymanagement_portfourni() {
		return (EReference)database_ComposantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.CQuery_PortFourni <em>CQuery Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CQuery Port Fourni</em>'.
	 * @see hADLM1.CQuery_PortFourni
	 * @generated
	 */
	public EClass getCQuery_PortFourni() {
		return cQuery_PortFourniEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.LienAttachementX5 <em>Lien Attachement X5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement X5</em>'.
	 * @see hADLM1.LienAttachementX5
	 * @generated
	 */
	public EClass getLienAttachementX5() {
		return lienAttachementX5EClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementX5#getDbquery_portfourni <em>Dbquery portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dbquery portfourni</em>'.
	 * @see hADLM1.LienAttachementX5#getDbquery_portfourni()
	 * @see #getLienAttachementX5()
	 * @generated
	 */
	public EReference getLienAttachementX5_Dbquery_portfourni() {
		return (EReference)lienAttachementX5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.LienAttachementX5#getSqlrequest_rolefrom <em>Sqlrequest rolefrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sqlrequest rolefrom</em>'.
	 * @see hADLM1.LienAttachementX5#getSqlrequest_rolefrom()
	 * @see #getLienAttachementX5()
	 * @generated
	 */
	public EReference getLienAttachementX5_Sqlrequest_rolefrom() {
		return (EReference)lienAttachementX5EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.ReceiveRequestRequisConfig <em>Receive Request Requis Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Request Requis Config</em>'.
	 * @see hADLM1.ReceiveRequestRequisConfig
	 * @generated
	 */
	public EClass getReceiveRequestRequisConfig() {
		return receiveRequestRequisConfigEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADLM1.ExternalBindingAnswerRequest <em>External Binding Answer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Binding Answer Request</em>'.
	 * @see hADLM1.ExternalBindingAnswerRequest
	 * @generated
	 */
	public EClass getExternalBindingAnswerRequest() {
		return externalBindingAnswerRequestEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ExternalBindingAnswerRequest#getAnswerrequest_portfourniconfig <em>Answerrequest portfourniconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Answerrequest portfourniconfig</em>'.
	 * @see hADLM1.ExternalBindingAnswerRequest#getAnswerrequest_portfourniconfig()
	 * @see #getExternalBindingAnswerRequest()
	 * @generated
	 */
	public EReference getExternalBindingAnswerRequest_Answerrequest_portfourniconfig() {
		return (EReference)externalBindingAnswerRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADLM1.ExternalBindingAnswerRequest#getExternalportfourniclientanswerrequest <em>Externalportfourniclientanswerrequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Externalportfourniclientanswerrequest</em>'.
	 * @see hADLM1.ExternalBindingAnswerRequest#getExternalportfourniclientanswerrequest()
	 * @see #getExternalBindingAnswerRequest()
	 * @generated
	 */
	public EReference getExternalBindingAnswerRequest_Externalportfourniclientanswerrequest() {
		return (EReference)externalBindingAnswerRequestEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link hADLM1.ExternalPortRequisClientSendRequest <em>External Port Requis Client Send Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Port Requis Client Send Request</em>'.
	 * @see hADLM1.ExternalPortRequisClientSendRequest
	 * @generated
	 */
	public EClass getExternalPortRequisClientSendRequest() {
		return externalPortRequisClientSendRequestEClass;
	}


	/**
	 * Returns the meta object for class '{@link hADLM1.ExternalPortFourniClientAnswerRequest <em>External Port Fourni Client Answer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Port Fourni Client Answer Request</em>'.
	 * @see hADLM1.ExternalPortFourniClientAnswerRequest
	 * @generated
	 */
	public EClass getExternalPortFourniClientAnswerRequest() {
		return externalPortFourniClientAnswerRequestEClass;
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public HADLM1Factory getHADLM1Factory() {
		return (HADLM1Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		securityCheck_PortFourniEClass = createEClass(SECURITY_CHECK_PORT_FOURNI);

		externalSocket_PortFourniEClass = createEClass(EXTERNAL_SOCKET_PORT_FOURNI);

		lienAttachementY6EClass = createEClass(LIEN_ATTACHEMENT_Y6);
		createEReference(lienAttachementY6EClass, LIEN_ATTACHEMENT_Y6__DBQUERY_PORTREQUIS);
		createEReference(lienAttachementY6EClass, LIEN_ATTACHEMENT_Y6__SQLREQUEST_ROLETO);

		serveur_ComposantEClass = createEClass(SERVEUR_COMPOSANT);
		createEReference(serveur_ComposantEClass, SERVEUR_COMPOSANT__RECEIVE_REQUEST_PORT);
		createEReference(serveur_ComposantEClass, SERVEUR_COMPOSANT__SERVEURDETAILS_CONFIGURATION);
		createEReference(serveur_ComposantEClass, SERVEUR_COMPOSANT__ANSWERREQUEST_PORTFOURNICOMPO);
		createEReference(serveur_ComposantEClass, SERVEUR_COMPOSANT__BINDINGREQUISSERVEURCONFIG);
		createEReference(serveur_ComposantEClass, SERVEUR_COMPOSANT__BINDINGSERVEURFOURNICOMPO);

		queryInt_PortRequisEClass = createEClass(QUERY_INT_PORT_REQUIS);

		lienAttachementY4EClass = createEClass(LIEN_ATTACHEMENT_Y4);
		createEReference(lienAttachementY4EClass, LIEN_ATTACHEMENT_Y4__SECURITYCHECK_PORTREQUIS);
		createEReference(lienAttachementY4EClass, LIEN_ATTACHEMENT_Y4__CLEARENCEREQUEST_ROLETO);

		lienAttachementX6EClass = createEClass(LIEN_ATTACHEMENT_X6);
		createEReference(lienAttachementX6EClass, LIEN_ATTACHEMENT_X6__SECURITYCHECK_PORTFOURNI);
		createEReference(lienAttachementX6EClass, LIEN_ATTACHEMENT_X6__CLEARENCEREQUEST_ROLEFROM);

		externalBindingSendRequestEClass = createEClass(EXTERNAL_BINDING_SEND_REQUEST);
		createEReference(externalBindingSendRequestEClass, EXTERNAL_BINDING_SEND_REQUEST__SENDREQUEST_PORTREQUISCONFIG);
		createEReference(externalBindingSendRequestEClass, EXTERNAL_BINDING_SEND_REQUEST__EXTERNALPORTREQUISCLIENTSENDREQUEST);

		client_ComposantEClass = createEClass(CLIENT_COMPOSANT);
		createEReference(client_ComposantEClass, CLIENT_COMPOSANT__SEND_REQUEST_PORT);
		createEReference(client_ComposantEClass, CLIENT_COMPOSANT__ANSWERREQUEST_PORTREQUISCOMPO);
		createEReference(client_ComposantEClass, CLIENT_COMPOSANT__EXTERNALPORTFOURNICLIENTANSWERREQUEST);
		createEReference(client_ComposantEClass, CLIENT_COMPOSANT__EXTERNALPORTREQUISCLIENTSENDREQUEST);

		receive_request_PortRequisCompoEClass = createEClass(RECEIVE_REQUEST_PORT_REQUIS_COMPO);

		sendRequest_PortRequisConfigEClass = createEClass(SEND_REQUEST_PORT_REQUIS_CONFIG);

		clearenceRequest_RoleToEClass = createEClass(CLEARENCE_REQUEST_ROLE_TO);

		sqlRequest_ConnectorEClass = createEClass(SQL_REQUEST_CONNECTOR);
		createEReference(sqlRequest_ConnectorEClass, SQL_REQUEST_CONNECTOR__SQLREQUEST_ROLETO);
		createEReference(sqlRequest_ConnectorEClass, SQL_REQUEST_CONNECTOR__SQLREQUEST_ROLEFROM);

		send_request_PortFourniCompoEClass = createEClass(SEND_REQUEST_PORT_FOURNI_COMPO);

		securityManagement_PortFourniEClass = createEClass(SECURITY_MANAGEMENT_PORT_FOURNI);

		lienAttachementY2EClass = createEClass(LIEN_ATTACHEMENT_Y2);
		createEReference(lienAttachementY2EClass, LIEN_ATTACHEMENT_Y2__QUERYINT_PORTREQUIS);
		createEReference(lienAttachementY2EClass, LIEN_ATTACHEMENT_Y2__SQLREQUEST_ROLETO);

		callerAnswer_RoleFromEClass = createEClass(CALLER_ANSWER_ROLE_FROM);

		serveurDetails_ConfigurationEClass = createEClass(SERVEUR_DETAILS_CONFIGURATION);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__CONNECTIONMANAGER_COMPOSANT);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__SECURITYMANAGER_COMPOSANT);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__DATABASE_COMPOSANT);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__CLEARENCEREQUEST_CONNECTOR);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__SQLREQUEST_CONNECTOR);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__SECURITYQUERY_CONNECTOR);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX1);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX2);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX3);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX4);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX5);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX6);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY1);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY2);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY3);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY6);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY4);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY5);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__RECEIVEREQUESTREQUISCONFIG);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__ANSWERREQUEST_PORTFOURNI);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__BINDINGSERVEURFOURNI);
		createEReference(serveurDetails_ConfigurationEClass, SERVEUR_DETAILS_CONFIGURATION__BINDINGREQUISSERVEURDETAILS);

		securityAuth_PortRequisEClass = createEClass(SECURITY_AUTH_PORT_REQUIS);

		answerRequest_PortRequisCompoEClass = createEClass(ANSWER_REQUEST_PORT_REQUIS_COMPO);

		lienAttachementY1EClass = createEClass(LIEN_ATTACHEMENT_Y1);
		createEReference(lienAttachementY1EClass, LIEN_ATTACHEMENT_Y1__SECURITYMANAGEMENT_PORTREQUIS);
		createEReference(lienAttachementY1EClass, LIEN_ATTACHEMENT_Y1__SECURITYQUERY_ROLETO);

		rpC_ConnectorExpliciteEClass = createEClass(RPC_CONNECTOR_EXPLICITE);
		createEReference(rpC_ConnectorExpliciteEClass, RPC_CONNECTOR_EXPLICITE__CALLER_ROLE);
		createEReference(rpC_ConnectorExpliciteEClass, RPC_CONNECTOR_EXPLICITE__CALLED_ROLETO);
		createEReference(rpC_ConnectorExpliciteEClass, RPC_CONNECTOR_EXPLICITE__CALLEDANSWER_ROLETO);
		createEReference(rpC_ConnectorExpliciteEClass, RPC_CONNECTOR_EXPLICITE__CALLERANSWER_ROLEFROM);

		lienAttachementY3EClass = createEClass(LIEN_ATTACHEMENT_Y3);
		createEReference(lienAttachementY3EClass, LIEN_ATTACHEMENT_Y3__SECURITYAUTH_PORTREQUIS);
		createEReference(lienAttachementY3EClass, LIEN_ATTACHEMENT_Y3__CLEARENCEREQUEST_ROLETO);

		bindingServeurFourniCompoEClass = createEClass(BINDING_SERVEUR_FOURNI_COMPO);
		createEReference(bindingServeurFourniCompoEClass, BINDING_SERVEUR_FOURNI_COMPO__ANSWERREQUEST_PORTFOURNI);
		createEReference(bindingServeurFourniCompoEClass, BINDING_SERVEUR_FOURNI_COMPO__ANSWERREQUEST_PORTFOURNICOMPO);

		queryInt_PortFourniEClass = createEClass(QUERY_INT_PORT_FOURNI);

		called_RoleToEClass = createEClass(CALLED_ROLE_TO);

		clearenceRequest_ConnectorEClass = createEClass(CLEARENCE_REQUEST_CONNECTOR);
		createEReference(clearenceRequest_ConnectorEClass, CLEARENCE_REQUEST_CONNECTOR__CLEARENCEREQUEST_ROLETO);
		createEReference(clearenceRequest_ConnectorEClass, CLEARENCE_REQUEST_CONNECTOR__CLEARENCEREQUEST_ROLEFROM);

		lienAttachementXRequestEClass = createEClass(LIEN_ATTACHEMENT_XREQUEST);
		createEReference(lienAttachementXRequestEClass, LIEN_ATTACHEMENT_XREQUEST__CALLER_ROLEFROM);
		createEReference(lienAttachementXRequestEClass, LIEN_ATTACHEMENT_XREQUEST__W);

		securityAuth_PortFourniEClass = createEClass(SECURITY_AUTH_PORT_FOURNI);

		answerRequest_PortFourniEClass = createEClass(ANSWER_REQUEST_PORT_FOURNI);

		securityQuery_ConnectorEClass = createEClass(SECURITY_QUERY_CONNECTOR);
		createEReference(securityQuery_ConnectorEClass, SECURITY_QUERY_CONNECTOR__SECURITYQUERY_ROLETO);
		createEReference(securityQuery_ConnectorEClass, SECURITY_QUERY_CONNECTOR__SECURITYQUERY_ROLEFROM);

		externalSocket_PortRequisEClass = createEClass(EXTERNAL_SOCKET_PORT_REQUIS);

		clearenceRequest_RoleFromEClass = createEClass(CLEARENCE_REQUEST_ROLE_FROM);

		dbQuery_PortFourniEClass = createEClass(DB_QUERY_PORT_FOURNI);

		dbQuery_PortRequisEClass = createEClass(DB_QUERY_PORT_REQUIS);

		bindingServeurFOurniEClass = createEClass(BINDING_SERVEUR_FOURNI);
		createEReference(bindingServeurFOurniEClass, BINDING_SERVEUR_FOURNI__EXTERNALSOCKET_PORTFOURNI);
		createEReference(bindingServeurFOurniEClass, BINDING_SERVEUR_FOURNI__ANSWERREQUEST_PORTFOURNI);

		lienAttachementYAnswerEClass = createEClass(LIEN_ATTACHEMENT_YANSWER);
		createEReference(lienAttachementYAnswerEClass, LIEN_ATTACHEMENT_YANSWER__CALLEDANSWER_ROLETO);
		createEReference(lienAttachementYAnswerEClass, LIEN_ATTACHEMENT_YANSWER__ANSWERREQUEST_PORTREQUISCOMPO);

		calledAnswer_RoleToEClass = createEClass(CALLED_ANSWER_ROLE_TO);

		securityCheck_PortRequisEClass = createEClass(SECURITY_CHECK_PORT_REQUIS);

		sqlRequest_RoleFromEClass = createEClass(SQL_REQUEST_ROLE_FROM);

		answerRequest_PortFourniConfigEClass = createEClass(ANSWER_REQUEST_PORT_FOURNI_CONFIG);

		caller_RoleFromEClass = createEClass(CALLER_ROLE_FROM);

		lienAttachementX1EClass = createEClass(LIEN_ATTACHEMENT_X1);
		createEReference(lienAttachementX1EClass, LIEN_ATTACHEMENT_X1__SECURITYMANAGEMENT_PORTFOURNI);
		createEReference(lienAttachementX1EClass, LIEN_ATTACHEMENT_X1__SECURITYQUERY_ROLEFROM);

		cQuery_PortRequisEClass = createEClass(CQUERY_PORT_REQUIS);

		sqlRequest_RoleToEClass = createEClass(SQL_REQUEST_ROLE_TO);

		securityQuery_RoleToEClass = createEClass(SECURITY_QUERY_ROLE_TO);

		lienAttachementX3EClass = createEClass(LIEN_ATTACHEMENT_X3);
		createEReference(lienAttachementX3EClass, LIEN_ATTACHEMENT_X3__CQUERY_PORTFOURNI);
		createEReference(lienAttachementX3EClass, LIEN_ATTACHEMENT_X3__SECURITYQUERY_ROLEFROM);

		securityQuery_RoleFromEClass = createEClass(SECURITY_QUERY_ROLE_FROM);

		answerRequest_PortFourniCompoEClass = createEClass(ANSWER_REQUEST_PORT_FOURNI_COMPO);

		lienAttachementY5EClass = createEClass(LIEN_ATTACHEMENT_Y5);
		createEReference(lienAttachementY5EClass, LIEN_ATTACHEMENT_Y5__CQUERY_PORTREQUIS);
		createEReference(lienAttachementY5EClass, LIEN_ATTACHEMENT_Y5__SECURITYQUERY_ROLETO);

		securityManager_ComposantEClass = createEClass(SECURITY_MANAGER_COMPOSANT);
		createEReference(securityManager_ComposantEClass, SECURITY_MANAGER_COMPOSANT__CQUERY_PORTFOURNI);
		createEReference(securityManager_ComposantEClass, SECURITY_MANAGER_COMPOSANT__SECURITYAUTH_PORTREQUIS);
		createEReference(securityManager_ComposantEClass, SECURITY_MANAGER_COMPOSANT__CQUERY_PORTREQUIS);
		createEReference(securityManager_ComposantEClass, SECURITY_MANAGER_COMPOSANT__SECURITYAUTH_PORTFOURNI);

		connectionManager_ComposantEClass = createEClass(CONNECTION_MANAGER_COMPOSANT);
		createEReference(connectionManager_ComposantEClass, CONNECTION_MANAGER_COMPOSANT__EXTERNALSOCKET_PORTREQUIS);
		createEReference(connectionManager_ComposantEClass, CONNECTION_MANAGER_COMPOSANT__SECURITYCHECK_PORTFOURNI);
		createEReference(connectionManager_ComposantEClass, CONNECTION_MANAGER_COMPOSANT__DBQUERY_PORTFOURNI);
		createEReference(connectionManager_ComposantEClass, CONNECTION_MANAGER_COMPOSANT__DBQUERY_PORTREQUIS);
		createEReference(connectionManager_ComposantEClass, CONNECTION_MANAGER_COMPOSANT__SECURITYCHECK_PORTREQUIS);
		createEReference(connectionManager_ComposantEClass, CONNECTION_MANAGER_COMPOSANT__EXTERNALSOCKET_PORTFOURNI);

		bindingRequisServeurConfigEClass = createEClass(BINDING_REQUIS_SERVEUR_CONFIG);
		createEReference(bindingRequisServeurConfigEClass, BINDING_REQUIS_SERVEUR_CONFIG__RECEIVEREQUESTREQUISCONFIG);
		createEReference(bindingRequisServeurConfigEClass, BINDING_REQUIS_SERVEUR_CONFIG__RECEIVE_REQUEST_PORTREQUISCOMPO);

		securityManagement_PortRequisEClass = createEClass(SECURITY_MANAGEMENT_PORT_REQUIS);

		lienAttachementX2EClass = createEClass(LIEN_ATTACHEMENT_X2);
		createEReference(lienAttachementX2EClass, LIEN_ATTACHEMENT_X2__QUERYINT_PORTFOURNI);
		createEReference(lienAttachementX2EClass, LIEN_ATTACHEMENT_X2__SQLREQUEST_ROLEFROM);

		lienAttachementYRequestEClass = createEClass(LIEN_ATTACHEMENT_YREQUEST);
		createEReference(lienAttachementYRequestEClass, LIEN_ATTACHEMENT_YREQUEST__CALLED_ROLETO);
		createEReference(lienAttachementYRequestEClass, LIEN_ATTACHEMENT_YREQUEST__RECEIVE_REQUEST_PORTREQUISCOMPO);

		systeme_ConfigurationEClass = createEClass(SYSTEME_CONFIGURATION);
		createEReference(systeme_ConfigurationEClass, SYSTEME_CONFIGURATION__CLIENT_COMPOSANT);
		createEReference(systeme_ConfigurationEClass, SYSTEME_CONFIGURATION__SERVEUR_COMPOSANT);
		createEReference(systeme_ConfigurationEClass, SYSTEME_CONFIGURATION__RPC_CONNECTOREXPLICITE);
		createEReference(systeme_ConfigurationEClass, SYSTEME_CONFIGURATION__LIENATTACHEMENTX);
		createEReference(systeme_ConfigurationEClass, SYSTEME_CONFIGURATION__LIENATTACHEMENTY);
		createEReference(systeme_ConfigurationEClass, SYSTEME_CONFIGURATION__SENDREQUEST_PORTREQUISCONFIG);
		createEReference(systeme_ConfigurationEClass, SYSTEME_CONFIGURATION__ANSWERREQUEST_PORTFOURNICONFIG);
		createEReference(systeme_ConfigurationEClass, SYSTEME_CONFIGURATION__EXTERNALBINDINGANSWERREQUEST);
		createEReference(systeme_ConfigurationEClass, SYSTEME_CONFIGURATION__EXTERNALBINDINGSENDREQUEST);
		createEReference(systeme_ConfigurationEClass, SYSTEME_CONFIGURATION__LIENATTACHEMENTXANSWER);
		createEReference(systeme_ConfigurationEClass, SYSTEME_CONFIGURATION__LIENATTACHEMENTYANSWER);

		lienAttachementXAnswerEClass = createEClass(LIEN_ATTACHEMENT_XANSWER);
		createEReference(lienAttachementXAnswerEClass, LIEN_ATTACHEMENT_XANSWER__CALLERANSWER_ROLEFROM);
		createEReference(lienAttachementXAnswerEClass, LIEN_ATTACHEMENT_XANSWER__ANSWERREQUEST_PORTFOURNICOMPO);

		bindingRequisServeurDetailsEClass = createEClass(BINDING_REQUIS_SERVEUR_DETAILS);
		createEReference(bindingRequisServeurDetailsEClass, BINDING_REQUIS_SERVEUR_DETAILS__RECEIVE_REQUEST_PORTREQUISCOMPO);
		createEReference(bindingRequisServeurDetailsEClass, BINDING_REQUIS_SERVEUR_DETAILS__EXTERNALSOCKET_PORTREQUIS);

		lienAttachementX4EClass = createEClass(LIEN_ATTACHEMENT_X4);
		createEReference(lienAttachementX4EClass, LIEN_ATTACHEMENT_X4__SECURITYAUTH_PORTFOURNI);
		createEReference(lienAttachementX4EClass, LIEN_ATTACHEMENT_X4__CLEARENCEREQUEST_ROLEFROM);

		database_ComposantEClass = createEClass(DATABASE_COMPOSANT);
		createEReference(database_ComposantEClass, DATABASE_COMPOSANT__QUERYINT_PORTREQUIS);
		createEReference(database_ComposantEClass, DATABASE_COMPOSANT__SECURITYMANAGEMENT_PORTREQUIS);
		createEReference(database_ComposantEClass, DATABASE_COMPOSANT__QUERYINT_PORTFOURNI);
		createEReference(database_ComposantEClass, DATABASE_COMPOSANT__SECURITYMANAGEMENT_PORTFOURNI);

		cQuery_PortFourniEClass = createEClass(CQUERY_PORT_FOURNI);

		lienAttachementX5EClass = createEClass(LIEN_ATTACHEMENT_X5);
		createEReference(lienAttachementX5EClass, LIEN_ATTACHEMENT_X5__DBQUERY_PORTFOURNI);
		createEReference(lienAttachementX5EClass, LIEN_ATTACHEMENT_X5__SQLREQUEST_ROLEFROM);

		receiveRequestRequisConfigEClass = createEClass(RECEIVE_REQUEST_REQUIS_CONFIG);

		externalBindingAnswerRequestEClass = createEClass(EXTERNAL_BINDING_ANSWER_REQUEST);
		createEReference(externalBindingAnswerRequestEClass, EXTERNAL_BINDING_ANSWER_REQUEST__ANSWERREQUEST_PORTFOURNICONFIG);
		createEReference(externalBindingAnswerRequestEClass, EXTERNAL_BINDING_ANSWER_REQUEST__EXTERNALPORTFOURNICLIENTANSWERREQUEST);

		externalPortRequisClientSendRequestEClass = createEClass(EXTERNAL_PORT_REQUIS_CLIENT_SEND_REQUEST);

		externalPortFourniClientAnswerRequestEClass = createEClass(EXTERNAL_PORT_FOURNI_CLIENT_ANSWER_REQUEST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		LiensPackage theLiensPackage = (LiensPackage)EPackage.Registry.INSTANCE.getEPackage(LiensPackage.eNS_URI);
		ComposantPackage theComposantPackage = (ComposantPackage)EPackage.Registry.INSTANCE.getEPackage(ComposantPackage.eNS_URI);
		ConnecteursPackage theConnecteursPackage = (ConnecteursPackage)EPackage.Registry.INSTANCE.getEPackage(ConnecteursPackage.eNS_URI);
		RolesPackage theRolesPackage = (RolesPackage)EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI);
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		securityCheck_PortFourniEClass.getESuperTypes().add(theInterfacesPackage.getPortFourniCompo());
		externalSocket_PortFourniEClass.getESuperTypes().add(theInterfacesPackage.getPortFourniCompo());
		lienAttachementY6EClass.getESuperTypes().add(theLiensPackage.getLienAttachementPRRT());
		serveur_ComposantEClass.getESuperTypes().add(theComposantPackage.getComposant());
		queryInt_PortRequisEClass.getESuperTypes().add(theInterfacesPackage.getPortRequisCompo());
		lienAttachementY4EClass.getESuperTypes().add(theLiensPackage.getLienAttachementPRRT());
		lienAttachementX6EClass.getESuperTypes().add(theLiensPackage.getLienAttachementPFRF());
		externalBindingSendRequestEClass.getESuperTypes().add(theLiensPackage.getLienBindingRequis());
		client_ComposantEClass.getESuperTypes().add(theComposantPackage.getComposant());
		receive_request_PortRequisCompoEClass.getESuperTypes().add(theInterfacesPackage.getPortRequisCompo());
		sendRequest_PortRequisConfigEClass.getESuperTypes().add(theInterfacesPackage.getPortRequisConfig());
		clearenceRequest_RoleToEClass.getESuperTypes().add(this.getcalled_RoleTo());
		sqlRequest_ConnectorEClass.getESuperTypes().add(theConnecteursPackage.getConnecteurExplicite());
		send_request_PortFourniCompoEClass.getESuperTypes().add(theInterfacesPackage.getPortFourniCompo());
		securityManagement_PortFourniEClass.getESuperTypes().add(theInterfacesPackage.getPortFourniCompo());
		lienAttachementY2EClass.getESuperTypes().add(theLiensPackage.getLienAttachementPRRT());
		callerAnswer_RoleFromEClass.getESuperTypes().add(theRolesPackage.getRoleFrom());
		serveurDetails_ConfigurationEClass.getESuperTypes().add(theConfigurationPackage.getConfiguration());
		securityAuth_PortRequisEClass.getESuperTypes().add(theInterfacesPackage.getPortRequisCompo());
		answerRequest_PortRequisCompoEClass.getESuperTypes().add(theInterfacesPackage.getPortRequisCompo());
		lienAttachementY1EClass.getESuperTypes().add(theLiensPackage.getLienAttachementPRRT());
		rpC_ConnectorExpliciteEClass.getESuperTypes().add(theConnecteursPackage.getConnecteurExplicite());
		lienAttachementY3EClass.getESuperTypes().add(theLiensPackage.getLienAttachementPRRT());
		bindingServeurFourniCompoEClass.getESuperTypes().add(theLiensPackage.getLienBindingFourni());
		queryInt_PortFourniEClass.getESuperTypes().add(theInterfacesPackage.getPortFourniCompo());
		called_RoleToEClass.getESuperTypes().add(theRolesPackage.getRoleTo());
		clearenceRequest_ConnectorEClass.getESuperTypes().add(theConnecteursPackage.getConnecteurExplicite());
		lienAttachementXRequestEClass.getESuperTypes().add(theLiensPackage.getLienAttachementPFRF());
		securityAuth_PortFourniEClass.getESuperTypes().add(theInterfacesPackage.getPortFourniCompo());
		answerRequest_PortFourniEClass.getESuperTypes().add(theInterfacesPackage.getPortFourniConfig());
		securityQuery_ConnectorEClass.getESuperTypes().add(theConnecteursPackage.getConnecteurExplicite());
		externalSocket_PortRequisEClass.getESuperTypes().add(theInterfacesPackage.getPortRequisCompo());
		clearenceRequest_RoleFromEClass.getESuperTypes().add(theRolesPackage.getRoleFrom());
		dbQuery_PortFourniEClass.getESuperTypes().add(theInterfacesPackage.getPortFourniCompo());
		dbQuery_PortRequisEClass.getESuperTypes().add(theInterfacesPackage.getPortRequisCompo());
		bindingServeurFOurniEClass.getESuperTypes().add(theLiensPackage.getLienBindingFourni());
		lienAttachementYAnswerEClass.getESuperTypes().add(theLiensPackage.getLienAttachementPRRT());
		calledAnswer_RoleToEClass.getESuperTypes().add(theRolesPackage.getRoleTo());
		securityCheck_PortRequisEClass.getESuperTypes().add(theInterfacesPackage.getPortRequisCompo());
		sqlRequest_RoleFromEClass.getESuperTypes().add(theRolesPackage.getRoleFrom());
		answerRequest_PortFourniConfigEClass.getESuperTypes().add(theInterfacesPackage.getPortFourniConfig());
		caller_RoleFromEClass.getESuperTypes().add(theRolesPackage.getRoleFrom());
		lienAttachementX1EClass.getESuperTypes().add(theLiensPackage.getLienAttachementPFRF());
		cQuery_PortRequisEClass.getESuperTypes().add(theInterfacesPackage.getPortRequisCompo());
		sqlRequest_RoleToEClass.getESuperTypes().add(theRolesPackage.getRoleTo());
		securityQuery_RoleToEClass.getESuperTypes().add(theRolesPackage.getRoleTo());
		lienAttachementX3EClass.getESuperTypes().add(theLiensPackage.getLienAttachementPFRF());
		securityQuery_RoleFromEClass.getESuperTypes().add(theRolesPackage.getRoleFrom());
		answerRequest_PortFourniCompoEClass.getESuperTypes().add(theInterfacesPackage.getPortFourniCompo());
		lienAttachementY5EClass.getESuperTypes().add(theLiensPackage.getLienAttachementPRRT());
		securityManager_ComposantEClass.getESuperTypes().add(theComposantPackage.getComposant());
		connectionManager_ComposantEClass.getESuperTypes().add(theComposantPackage.getComposant());
		bindingRequisServeurConfigEClass.getESuperTypes().add(theLiensPackage.getLienBindingRequis());
		securityManagement_PortRequisEClass.getESuperTypes().add(theInterfacesPackage.getPortRequisCompo());
		lienAttachementX2EClass.getESuperTypes().add(theLiensPackage.getLienAttachementPFRF());
		lienAttachementYRequestEClass.getESuperTypes().add(theLiensPackage.getLienAttachementPRRT());
		systeme_ConfigurationEClass.getESuperTypes().add(theConfigurationPackage.getConfiguration());
		lienAttachementXAnswerEClass.getESuperTypes().add(theLiensPackage.getLienAttachementPFRF());
		bindingRequisServeurDetailsEClass.getESuperTypes().add(theLiensPackage.getLienBindingRequis());
		lienAttachementX4EClass.getESuperTypes().add(theLiensPackage.getLienAttachementPFRF());
		database_ComposantEClass.getESuperTypes().add(theComposantPackage.getComposant());
		cQuery_PortFourniEClass.getESuperTypes().add(theInterfacesPackage.getPortFourniCompo());
		lienAttachementX5EClass.getESuperTypes().add(theLiensPackage.getLienAttachementPFRF());
		receiveRequestRequisConfigEClass.getESuperTypes().add(theInterfacesPackage.getPortRequisConfig());
		externalBindingAnswerRequestEClass.getESuperTypes().add(theLiensPackage.getLienBindingFourni());
		externalPortRequisClientSendRequestEClass.getESuperTypes().add(theInterfacesPackage.getPortRequisCompo());
		externalPortFourniClientAnswerRequestEClass.getESuperTypes().add(theInterfacesPackage.getPortFourniCompo());

		// Initialize classes, features, and operations; add parameters
		initEClass(securityCheck_PortFourniEClass, SecurityCheck_PortFourni.class, "SecurityCheck_PortFourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalSocket_PortFourniEClass, ExternalSocket_PortFourni.class, "ExternalSocket_PortFourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lienAttachementY6EClass, LienAttachementY6.class, "LienAttachementY6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienAttachementY6_Dbquery_portrequis(), this.getDBQuery_PortRequis(), null, "dbquery_portrequis", null, 1, 1, LienAttachementY6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienAttachementY6_Sqlrequest_roleto(), this.getSQLRequest_RoleTo(), null, "sqlrequest_roleto", null, 1, 1, LienAttachementY6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serveur_ComposantEClass, Serveur_Composant.class, "Serveur_Composant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServeur_Composant_Receive_request_port(), this.getReceive_request_PortRequisCompo(), null, "receive_request_port", null, 1, 1, Serveur_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Composant_Serveurdetails_configuration(), this.getServeurDetails_Configuration(), null, "serveurdetails_configuration", null, 1, 1, Serveur_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Composant_Answerrequest_portfournicompo(), this.getAnswerRequest_PortFourniCompo(), null, "answerrequest_portfournicompo", null, 1, 1, Serveur_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Composant_Bindingrequisserveurconfig(), this.getbindingRequisServeurConfig(), null, "bindingrequisserveurconfig", null, 1, 1, Serveur_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeur_Composant_Bindingserveurfournicompo(), this.getBindingServeurFourniCompo(), null, "bindingserveurfournicompo", null, 1, 1, Serveur_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryInt_PortRequisEClass, QueryInt_PortRequis.class, "QueryInt_PortRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lienAttachementY4EClass, LienAttachementY4.class, "LienAttachementY4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienAttachementY4_Securitycheck_portrequis(), this.getSecurityCheck_PortRequis(), null, "securitycheck_portrequis", null, 1, 1, LienAttachementY4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienAttachementY4_Clearencerequest_roleto(), this.getClearenceRequest_RoleTo(), null, "clearencerequest_roleto", null, 1, 1, LienAttachementY4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lienAttachementX6EClass, LienAttachementX6.class, "LienAttachementX6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienAttachementX6_Securitycheck_portfourni(), this.getSecurityCheck_PortFourni(), null, "securitycheck_portfourni", null, 1, 1, LienAttachementX6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienAttachementX6_Clearencerequest_rolefrom(), this.getClearenceRequest_RoleFrom(), null, "clearencerequest_rolefrom", null, 1, 1, LienAttachementX6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalBindingSendRequestEClass, ExternalBindingSendRequest.class, "ExternalBindingSendRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalBindingSendRequest_Sendrequest_portrequisconfig(), this.getSendRequest_PortRequisConfig(), null, "sendrequest_portrequisconfig", null, 1, 1, ExternalBindingSendRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalBindingSendRequest_Externalportrequisclientsendrequest(), this.getExternalPortRequisClientSendRequest(), null, "externalportrequisclientsendrequest", null, 1, 1, ExternalBindingSendRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(client_ComposantEClass, Client_Composant.class, "Client_Composant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClient_Composant_Send_request_port(), this.getSend_request_PortFourniCompo(), null, "send_request_port", null, 1, 1, Client_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Composant_Answerrequest_portrequiscompo(), this.getAnswerRequest_PortRequisCompo(), null, "answerrequest_portrequiscompo", null, 1, 1, Client_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Composant_Externalportfourniclientanswerrequest(), this.getExternalPortFourniClientAnswerRequest(), null, "externalportfourniclientanswerrequest", null, 1, 1, Client_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Composant_Externalportrequisclientsendrequest(), this.getExternalPortRequisClientSendRequest(), null, "externalportrequisclientsendrequest", null, 1, 1, Client_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receive_request_PortRequisCompoEClass, Receive_request_PortRequisCompo.class, "Receive_request_PortRequisCompo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sendRequest_PortRequisConfigEClass, SendRequest_PortRequisConfig.class, "SendRequest_PortRequisConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clearenceRequest_RoleToEClass, ClearenceRequest_RoleTo.class, "ClearenceRequest_RoleTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqlRequest_ConnectorEClass, SQLRequest_Connector.class, "SQLRequest_Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSQLRequest_Connector_Sqlrequest_roleto(), this.getSQLRequest_RoleTo(), null, "sqlrequest_roleto", null, 1, 1, SQLRequest_Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSQLRequest_Connector_Sqlrequest_rolefrom(), this.getSQLRequest_RoleFrom(), null, "sqlrequest_rolefrom", null, 1, 1, SQLRequest_Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(send_request_PortFourniCompoEClass, Send_request_PortFourniCompo.class, "Send_request_PortFourniCompo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityManagement_PortFourniEClass, SecurityManagement_PortFourni.class, "SecurityManagement_PortFourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lienAttachementY2EClass, LienAttachementY2.class, "LienAttachementY2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienAttachementY2_Queryint_portrequis(), this.getQueryInt_PortRequis(), null, "queryint_portrequis", null, 1, 1, LienAttachementY2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienAttachementY2_Sqlrequest_roleto(), this.getSQLRequest_RoleTo(), null, "sqlrequest_roleto", null, 1, 1, LienAttachementY2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callerAnswer_RoleFromEClass, callerAnswer_RoleFrom.class, "callerAnswer_RoleFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serveurDetails_ConfigurationEClass, ServeurDetails_Configuration.class, "ServeurDetails_Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServeurDetails_Configuration_Connectionmanager_composant(), this.getConnectionManager_Composant(), null, "connectionmanager_composant", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Securitymanager_composant(), this.getSecurityManager_Composant(), null, "securitymanager_composant", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Database_composant(), this.getDatabase_Composant(), null, "database_composant", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Clearencerequest_connector(), this.getClearenceRequest_Connector(), null, "clearencerequest_connector", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Sqlrequest_connector(), this.getSQLRequest_Connector(), null, "sqlrequest_connector", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Securityquery_connector(), this.getSecurityQuery_Connector(), null, "securityquery_connector", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Lienattachementx1(), this.getLienAttachementX1(), null, "lienattachementx1", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Lienattachementx2(), this.getLienAttachementX2(), null, "lienattachementx2", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Lienattachementx3(), this.getLienAttachementX3(), null, "lienattachementx3", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Lienattachementx4(), this.getLienAttachementX4(), null, "lienattachementx4", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Lienattachementx5(), this.getLienAttachementX5(), null, "lienattachementx5", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Lienattachementx6(), this.getLienAttachementX6(), null, "lienattachementx6", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Lienattachementy1(), this.getLienAttachementY1(), null, "lienattachementy1", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Lienattachementy2(), this.getLienAttachementY2(), null, "lienattachementy2", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Lienattachementy3(), this.getLienAttachementY3(), null, "lienattachementy3", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Lienattachementy6(), this.getLienAttachementY6(), null, "lienattachementy6", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Lienattachementy4(), this.getLienAttachementY4(), null, "lienattachementy4", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Lienattachementy5(), this.getLienAttachementY5(), null, "lienattachementy5", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Receiverequestrequisconfig(), this.getReceiveRequestRequisConfig(), null, "receiverequestrequisconfig", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Answerrequest_portfourni(), this.getAnswerRequest_PortFourni(), null, "answerrequest_portfourni", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Bindingserveurfourni(), this.getBindingServeurFOurni(), null, "bindingserveurfourni", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetails_Configuration_Bindingrequisserveurdetails(), this.getbindingRequisServeurDetails(), null, "bindingrequisserveurdetails", null, 1, 1, ServeurDetails_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityAuth_PortRequisEClass, SecurityAuth_PortRequis.class, "SecurityAuth_PortRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(answerRequest_PortRequisCompoEClass, AnswerRequest_PortRequisCompo.class, "AnswerRequest_PortRequisCompo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lienAttachementY1EClass, LienAttachementY1.class, "LienAttachementY1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienAttachementY1_Securitymanagement_portrequis(), this.getSecurityManagement_PortRequis(), null, "securitymanagement_portrequis", null, 1, 1, LienAttachementY1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienAttachementY1_Securityquery_roleto(), this.getSecurityQuery_RoleTo(), null, "securityquery_roleto", null, 1, 1, LienAttachementY1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rpC_ConnectorExpliciteEClass, RPC_ConnectorExplicite.class, "RPC_ConnectorExplicite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPC_ConnectorExplicite_Caller_role(), this.getcaller_RoleFrom(), null, "caller_role", null, 1, 1, RPC_ConnectorExplicite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_ConnectorExplicite_Called_roleto(), this.getcalled_RoleTo(), null, "called_roleto", null, 1, 1, RPC_ConnectorExplicite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_ConnectorExplicite_Calledanswer_roleto(), this.getcalledAnswer_RoleTo(), null, "calledanswer_roleto", null, 1, 1, RPC_ConnectorExplicite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_ConnectorExplicite_Calleranswer_rolefrom(), this.getcallerAnswer_RoleFrom(), null, "calleranswer_rolefrom", null, 1, 1, RPC_ConnectorExplicite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lienAttachementY3EClass, LienAttachementY3.class, "LienAttachementY3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienAttachementY3_Securityauth_portrequis(), this.getSecurityAuth_PortRequis(), null, "securityauth_portrequis", null, 1, 1, LienAttachementY3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienAttachementY3_Clearencerequest_roleto(), this.getClearenceRequest_RoleTo(), null, "clearencerequest_roleto", null, 1, 1, LienAttachementY3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingServeurFourniCompoEClass, BindingServeurFourniCompo.class, "BindingServeurFourniCompo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingServeurFourniCompo_Answerrequest_portfourni(), this.getAnswerRequest_PortFourni(), null, "answerrequest_portfourni", null, 1, 1, BindingServeurFourniCompo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingServeurFourniCompo_Answerrequest_portfournicompo(), this.getAnswerRequest_PortFourniCompo(), null, "answerrequest_portfournicompo", null, 1, 1, BindingServeurFourniCompo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryInt_PortFourniEClass, QueryInt_PortFourni.class, "QueryInt_PortFourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(called_RoleToEClass, called_RoleTo.class, "called_RoleTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clearenceRequest_ConnectorEClass, ClearenceRequest_Connector.class, "ClearenceRequest_Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClearenceRequest_Connector_Clearencerequest_roleto(), this.getClearenceRequest_RoleTo(), null, "clearencerequest_roleto", null, 1, 1, ClearenceRequest_Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClearenceRequest_Connector_Clearencerequest_rolefrom(), this.getClearenceRequest_RoleFrom(), null, "clearencerequest_rolefrom", null, 1, 1, ClearenceRequest_Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lienAttachementXRequestEClass, LienAttachementXRequest.class, "LienAttachementXRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienAttachementXRequest_Caller_rolefrom(), this.getcaller_RoleFrom(), null, "caller_rolefrom", null, 1, 1, LienAttachementXRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienAttachementXRequest_W(), this.getSend_request_PortFourniCompo(), null, "w", null, 1, 1, LienAttachementXRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityAuth_PortFourniEClass, SecurityAuth_PortFourni.class, "SecurityAuth_PortFourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(answerRequest_PortFourniEClass, AnswerRequest_PortFourni.class, "AnswerRequest_PortFourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityQuery_ConnectorEClass, SecurityQuery_Connector.class, "SecurityQuery_Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityQuery_Connector_Securityquery_roleto(), this.getSecurityQuery_RoleTo(), null, "securityquery_roleto", null, 1, 1, SecurityQuery_Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityQuery_Connector_Securityquery_rolefrom(), this.getSecurityQuery_RoleFrom(), null, "securityquery_rolefrom", null, 1, 1, SecurityQuery_Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalSocket_PortRequisEClass, ExternalSocket_PortRequis.class, "ExternalSocket_PortRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clearenceRequest_RoleFromEClass, ClearenceRequest_RoleFrom.class, "ClearenceRequest_RoleFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dbQuery_PortFourniEClass, DBQuery_PortFourni.class, "DBQuery_PortFourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dbQuery_PortRequisEClass, DBQuery_PortRequis.class, "DBQuery_PortRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingServeurFOurniEClass, BindingServeurFOurni.class, "BindingServeurFOurni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingServeurFOurni_Externalsocket_portfourni(), this.getExternalSocket_PortFourni(), null, "externalsocket_portfourni", null, 1, 1, BindingServeurFOurni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingServeurFOurni_Answerrequest_portfourni(), this.getAnswerRequest_PortFourni(), null, "answerrequest_portfourni", null, 1, 1, BindingServeurFOurni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lienAttachementYAnswerEClass, LienAttachementYAnswer.class, "LienAttachementYAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienAttachementYAnswer_Calledanswer_roleto(), this.getcalledAnswer_RoleTo(), null, "calledanswer_roleto", null, 1, 1, LienAttachementYAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienAttachementYAnswer_Answerrequest_portrequiscompo(), this.getAnswerRequest_PortRequisCompo(), null, "answerrequest_portrequiscompo", null, 1, 1, LienAttachementYAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calledAnswer_RoleToEClass, calledAnswer_RoleTo.class, "calledAnswer_RoleTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityCheck_PortRequisEClass, SecurityCheck_PortRequis.class, "SecurityCheck_PortRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqlRequest_RoleFromEClass, SQLRequest_RoleFrom.class, "SQLRequest_RoleFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(answerRequest_PortFourniConfigEClass, AnswerRequest_PortFourniConfig.class, "AnswerRequest_PortFourniConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(caller_RoleFromEClass, caller_RoleFrom.class, "caller_RoleFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lienAttachementX1EClass, LienAttachementX1.class, "LienAttachementX1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienAttachementX1_Securitymanagement_portfourni(), this.getSecurityManagement_PortFourni(), null, "securitymanagement_portfourni", null, 1, 1, LienAttachementX1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienAttachementX1_Securityquery_rolefrom(), this.getSecurityQuery_RoleFrom(), null, "securityquery_rolefrom", null, 1, 1, LienAttachementX1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cQuery_PortRequisEClass, CQuery_PortRequis.class, "CQuery_PortRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqlRequest_RoleToEClass, SQLRequest_RoleTo.class, "SQLRequest_RoleTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityQuery_RoleToEClass, SecurityQuery_RoleTo.class, "SecurityQuery_RoleTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lienAttachementX3EClass, LienAttachementX3.class, "LienAttachementX3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienAttachementX3_Cquery_portfourni(), this.getCQuery_PortFourni(), null, "cquery_portfourni", null, 1, 1, LienAttachementX3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienAttachementX3_Securityquery_rolefrom(), this.getSecurityQuery_RoleFrom(), null, "securityquery_rolefrom", null, 1, 1, LienAttachementX3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityQuery_RoleFromEClass, SecurityQuery_RoleFrom.class, "SecurityQuery_RoleFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(answerRequest_PortFourniCompoEClass, AnswerRequest_PortFourniCompo.class, "AnswerRequest_PortFourniCompo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lienAttachementY5EClass, LienAttachementY5.class, "LienAttachementY5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienAttachementY5_Cquery_portrequis(), this.getCQuery_PortRequis(), null, "cquery_portrequis", null, 1, 1, LienAttachementY5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienAttachementY5_Securityquery_roleto(), this.getSecurityQuery_RoleTo(), null, "securityquery_roleto", null, 1, 1, LienAttachementY5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityManager_ComposantEClass, SecurityManager_Composant.class, "SecurityManager_Composant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityManager_Composant_Cquery_portfourni(), this.getCQuery_PortFourni(), null, "cquery_portfourni", null, 1, 1, SecurityManager_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityManager_Composant_Securityauth_portrequis(), this.getSecurityAuth_PortRequis(), null, "securityauth_portrequis", null, 1, 1, SecurityManager_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityManager_Composant_Cquery_portrequis(), this.getCQuery_PortRequis(), null, "cquery_portrequis", null, 1, 1, SecurityManager_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityManager_Composant_Securityauth_portfourni(), this.getSecurityAuth_PortFourni(), null, "securityauth_portfourni", null, 1, 1, SecurityManager_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionManager_ComposantEClass, ConnectionManager_Composant.class, "ConnectionManager_Composant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionManager_Composant_Externalsocket_portrequis(), this.getExternalSocket_PortRequis(), null, "externalsocket_portrequis", null, 1, 1, ConnectionManager_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Composant_Securitycheck_portfourni(), this.getSecurityCheck_PortFourni(), null, "securitycheck_portfourni", null, 1, 1, ConnectionManager_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Composant_Dbquery_portfourni(), this.getDBQuery_PortFourni(), null, "dbquery_portfourni", null, 1, 1, ConnectionManager_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Composant_Dbquery_portrequis(), this.getDBQuery_PortRequis(), null, "dbquery_portrequis", null, 1, 1, ConnectionManager_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Composant_Securitycheck_portrequis(), this.getSecurityCheck_PortRequis(), null, "securitycheck_portrequis", null, 1, 1, ConnectionManager_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionManager_Composant_Externalsocket_portfourni(), this.getExternalSocket_PortFourni(), null, "externalsocket_portfourni", null, 1, 1, ConnectionManager_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingRequisServeurConfigEClass, bindingRequisServeurConfig.class, "bindingRequisServeurConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getbindingRequisServeurConfig_Receiverequestrequisconfig(), this.getReceiveRequestRequisConfig(), null, "receiverequestrequisconfig", null, 1, 1, bindingRequisServeurConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getbindingRequisServeurConfig_Receive_request_portrequiscompo(), this.getReceive_request_PortRequisCompo(), null, "receive_request_portrequiscompo", null, 1, 1, bindingRequisServeurConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityManagement_PortRequisEClass, SecurityManagement_PortRequis.class, "SecurityManagement_PortRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lienAttachementX2EClass, LienAttachementX2.class, "LienAttachementX2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienAttachementX2_Queryint_portfourni(), this.getQueryInt_PortFourni(), null, "queryint_portfourni", null, 1, 1, LienAttachementX2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienAttachementX2_Sqlrequest_rolefrom(), this.getSQLRequest_RoleFrom(), null, "sqlrequest_rolefrom", null, 1, 1, LienAttachementX2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lienAttachementYRequestEClass, LienAttachementYRequest.class, "LienAttachementYRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienAttachementYRequest_Called_roleto(), this.getcalled_RoleTo(), null, "called_roleto", null, 1, 1, LienAttachementYRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienAttachementYRequest_Receive_request_portrequiscompo(), this.getReceive_request_PortRequisCompo(), null, "receive_request_portrequiscompo", null, 1, 1, LienAttachementYRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systeme_ConfigurationEClass, Systeme_Configuration.class, "Systeme_Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSysteme_Configuration_Client_composant(), this.getClient_Composant(), null, "client_composant", null, 1, 1, Systeme_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSysteme_Configuration_Serveur_composant(), this.getServeur_Composant(), null, "serveur_composant", null, 1, 1, Systeme_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSysteme_Configuration_Rpc_connectorexplicite(), this.getRPC_ConnectorExplicite(), null, "rpc_connectorexplicite", null, 1, 1, Systeme_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSysteme_Configuration_Lienattachementx(), this.getLienAttachementXRequest(), null, "lienattachementx", null, 1, 1, Systeme_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSysteme_Configuration_Lienattachementy(), this.getLienAttachementYRequest(), null, "lienattachementy", null, 1, 1, Systeme_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSysteme_Configuration_Sendrequest_portrequisconfig(), this.getSendRequest_PortRequisConfig(), null, "sendrequest_portrequisconfig", null, 1, 1, Systeme_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSysteme_Configuration_Answerrequest_portfourniconfig(), this.getAnswerRequest_PortFourniConfig(), null, "answerrequest_portfourniconfig", null, 1, 1, Systeme_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSysteme_Configuration_Externalbindinganswerrequest(), this.getExternalBindingAnswerRequest(), null, "externalbindinganswerrequest", null, 1, 1, Systeme_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSysteme_Configuration_Externalbindingsendrequest(), this.getExternalBindingSendRequest(), null, "externalbindingsendrequest", null, 1, 1, Systeme_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSysteme_Configuration_Lienattachementxanswer(), this.getLienAttachementXAnswer(), null, "lienattachementxanswer", null, 1, 1, Systeme_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSysteme_Configuration_Lienattachementyanswer(), this.getLienAttachementYAnswer(), null, "lienattachementyanswer", null, 1, 1, Systeme_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lienAttachementXAnswerEClass, LienAttachementXAnswer.class, "LienAttachementXAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienAttachementXAnswer_Calleranswer_rolefrom(), this.getcallerAnswer_RoleFrom(), null, "calleranswer_rolefrom", null, 1, 1, LienAttachementXAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienAttachementXAnswer_Answerrequest_portfournicompo(), this.getAnswerRequest_PortFourniCompo(), null, "answerrequest_portfournicompo", null, 1, 1, LienAttachementXAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingRequisServeurDetailsEClass, bindingRequisServeurDetails.class, "bindingRequisServeurDetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getbindingRequisServeurDetails_Receive_request_portrequiscompo(), this.getReceiveRequestRequisConfig(), null, "receive_request_portrequiscompo", null, 1, 1, bindingRequisServeurDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getbindingRequisServeurDetails_Externalsocket_portrequis(), this.getExternalSocket_PortRequis(), null, "externalsocket_portrequis", null, 1, 1, bindingRequisServeurDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lienAttachementX4EClass, LienAttachementX4.class, "LienAttachementX4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienAttachementX4_Securityauth_portfourni(), this.getSecurityAuth_PortFourni(), null, "securityauth_portfourni", null, 1, 1, LienAttachementX4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienAttachementX4_Clearencerequest_rolefrom(), this.getClearenceRequest_RoleFrom(), null, "clearencerequest_rolefrom", null, 1, 1, LienAttachementX4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(database_ComposantEClass, Database_Composant.class, "Database_Composant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabase_Composant_Queryint_portrequis(), this.getQueryInt_PortRequis(), null, "queryint_portrequis", null, 1, 1, Database_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Composant_Securitymanagement_portrequis(), this.getSecurityManagement_PortRequis(), null, "securitymanagement_portrequis", null, 1, 1, Database_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Composant_Queryint_portfourni(), this.getQueryInt_PortFourni(), null, "queryint_portfourni", null, 1, 1, Database_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Composant_Securitymanagement_portfourni(), this.getSecurityManagement_PortFourni(), null, "securitymanagement_portfourni", null, 1, 1, Database_Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cQuery_PortFourniEClass, CQuery_PortFourni.class, "CQuery_PortFourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lienAttachementX5EClass, LienAttachementX5.class, "LienAttachementX5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienAttachementX5_Dbquery_portfourni(), this.getDBQuery_PortFourni(), null, "dbquery_portfourni", null, 1, 1, LienAttachementX5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienAttachementX5_Sqlrequest_rolefrom(), this.getSQLRequest_RoleFrom(), null, "sqlrequest_rolefrom", null, 1, 1, LienAttachementX5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receiveRequestRequisConfigEClass, ReceiveRequestRequisConfig.class, "ReceiveRequestRequisConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalBindingAnswerRequestEClass, ExternalBindingAnswerRequest.class, "ExternalBindingAnswerRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalBindingAnswerRequest_Answerrequest_portfourniconfig(), this.getAnswerRequest_PortFourniConfig(), null, "answerrequest_portfourniconfig", null, 1, 1, ExternalBindingAnswerRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalBindingAnswerRequest_Externalportfourniclientanswerrequest(), this.getExternalPortFourniClientAnswerRequest(), null, "externalportfourniclientanswerrequest", null, 1, 1, ExternalBindingAnswerRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalPortRequisClientSendRequestEClass, ExternalPortRequisClientSendRequest.class, "ExternalPortRequisClientSendRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalPortFourniClientAnswerRequestEClass, ExternalPortFourniClientAnswerRequest.class, "ExternalPortFourniClientAnswerRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (serveur_ComposantEClass, 
		   source, 
		   new String[] {
			 "name", "Serveur"
		   });	
		addAnnotation
		  (getBindingServeurFOurni_Answerrequest_portfourni(), 
		   source, 
		   new String[] {
			 "kind", "group"
		   });	
		addAnnotation
		  (answerRequest_PortFourniCompoEClass, 
		   source, 
		   new String[] {
			 "name", "Answer_PortFourniCompo"
		   });
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link hADLM1.SecurityCheck_PortFourni <em>Security Check Port Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.SecurityCheck_PortFourni
		 * @see hADLM1.HADLM1Package#getSecurityCheck_PortFourni()
		 * @generated
		 */
		public static final EClass SECURITY_CHECK_PORT_FOURNI = eINSTANCE.getSecurityCheck_PortFourni();

		/**
		 * The meta object literal for the '{@link hADLM1.ExternalSocket_PortFourni <em>External Socket Port Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.ExternalSocket_PortFourni
		 * @see hADLM1.HADLM1Package#getExternalSocket_PortFourni()
		 * @generated
		 */
		public static final EClass EXTERNAL_SOCKET_PORT_FOURNI = eINSTANCE.getExternalSocket_PortFourni();

		/**
		 * The meta object literal for the '{@link hADLM1.LienAttachementY6 <em>Lien Attachement Y6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.LienAttachementY6
		 * @see hADLM1.HADLM1Package#getLienAttachementY6()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT_Y6 = eINSTANCE.getLienAttachementY6();

		/**
		 * The meta object literal for the '<em><b>Dbquery portrequis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_Y6__DBQUERY_PORTREQUIS = eINSTANCE.getLienAttachementY6_Dbquery_portrequis();

		/**
		 * The meta object literal for the '<em><b>Sqlrequest roleto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_Y6__SQLREQUEST_ROLETO = eINSTANCE.getLienAttachementY6_Sqlrequest_roleto();

		/**
		 * The meta object literal for the '{@link hADLM1.Serveur_Composant <em>Serveur Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.Serveur_Composant
		 * @see hADLM1.HADLM1Package#getServeur_Composant()
		 * @generated
		 */
		public static final EClass SERVEUR_COMPOSANT = eINSTANCE.getServeur_Composant();

		/**
		 * The meta object literal for the '<em><b>Receive request port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_COMPOSANT__RECEIVE_REQUEST_PORT = eINSTANCE.getServeur_Composant_Receive_request_port();

		/**
		 * The meta object literal for the '<em><b>Serveurdetails configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_COMPOSANT__SERVEURDETAILS_CONFIGURATION = eINSTANCE.getServeur_Composant_Serveurdetails_configuration();

		/**
		 * The meta object literal for the '<em><b>Answerrequest portfournicompo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_COMPOSANT__ANSWERREQUEST_PORTFOURNICOMPO = eINSTANCE.getServeur_Composant_Answerrequest_portfournicompo();

		/**
		 * The meta object literal for the '<em><b>Bindingrequisserveurconfig</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_COMPOSANT__BINDINGREQUISSERVEURCONFIG = eINSTANCE.getServeur_Composant_Bindingrequisserveurconfig();

		/**
		 * The meta object literal for the '<em><b>Bindingserveurfournicompo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_COMPOSANT__BINDINGSERVEURFOURNICOMPO = eINSTANCE.getServeur_Composant_Bindingserveurfournicompo();

		/**
		 * The meta object literal for the '{@link hADLM1.QueryInt_PortRequis <em>Query Int Port Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.QueryInt_PortRequis
		 * @see hADLM1.HADLM1Package#getQueryInt_PortRequis()
		 * @generated
		 */
		public static final EClass QUERY_INT_PORT_REQUIS = eINSTANCE.getQueryInt_PortRequis();

		/**
		 * The meta object literal for the '{@link hADLM1.LienAttachementY4 <em>Lien Attachement Y4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.LienAttachementY4
		 * @see hADLM1.HADLM1Package#getLienAttachementY4()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT_Y4 = eINSTANCE.getLienAttachementY4();

		/**
		 * The meta object literal for the '<em><b>Securitycheck portrequis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_Y4__SECURITYCHECK_PORTREQUIS = eINSTANCE.getLienAttachementY4_Securitycheck_portrequis();

		/**
		 * The meta object literal for the '<em><b>Clearencerequest roleto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_Y4__CLEARENCEREQUEST_ROLETO = eINSTANCE.getLienAttachementY4_Clearencerequest_roleto();

		/**
		 * The meta object literal for the '{@link hADLM1.LienAttachementX6 <em>Lien Attachement X6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.LienAttachementX6
		 * @see hADLM1.HADLM1Package#getLienAttachementX6()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT_X6 = eINSTANCE.getLienAttachementX6();

		/**
		 * The meta object literal for the '<em><b>Securitycheck portfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_X6__SECURITYCHECK_PORTFOURNI = eINSTANCE.getLienAttachementX6_Securitycheck_portfourni();

		/**
		 * The meta object literal for the '<em><b>Clearencerequest rolefrom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_X6__CLEARENCEREQUEST_ROLEFROM = eINSTANCE.getLienAttachementX6_Clearencerequest_rolefrom();

		/**
		 * The meta object literal for the '{@link hADLM1.ExternalBindingSendRequest <em>External Binding Send Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.ExternalBindingSendRequest
		 * @see hADLM1.HADLM1Package#getExternalBindingSendRequest()
		 * @generated
		 */
		public static final EClass EXTERNAL_BINDING_SEND_REQUEST = eINSTANCE.getExternalBindingSendRequest();

		/**
		 * The meta object literal for the '<em><b>Sendrequest portrequisconfig</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EXTERNAL_BINDING_SEND_REQUEST__SENDREQUEST_PORTREQUISCONFIG = eINSTANCE.getExternalBindingSendRequest_Sendrequest_portrequisconfig();

		/**
		 * The meta object literal for the '<em><b>Externalportrequisclientsendrequest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EXTERNAL_BINDING_SEND_REQUEST__EXTERNALPORTREQUISCLIENTSENDREQUEST = eINSTANCE.getExternalBindingSendRequest_Externalportrequisclientsendrequest();

		/**
		 * The meta object literal for the '{@link hADLM1.Client_Composant <em>Client Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.Client_Composant
		 * @see hADLM1.HADLM1Package#getClient_Composant()
		 * @generated
		 */
		public static final EClass CLIENT_COMPOSANT = eINSTANCE.getClient_Composant();

		/**
		 * The meta object literal for the '<em><b>Send request port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CLIENT_COMPOSANT__SEND_REQUEST_PORT = eINSTANCE.getClient_Composant_Send_request_port();

		/**
		 * The meta object literal for the '<em><b>Answerrequest portrequiscompo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CLIENT_COMPOSANT__ANSWERREQUEST_PORTREQUISCOMPO = eINSTANCE.getClient_Composant_Answerrequest_portrequiscompo();

		/**
		 * The meta object literal for the '<em><b>Externalportfourniclientanswerrequest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CLIENT_COMPOSANT__EXTERNALPORTFOURNICLIENTANSWERREQUEST = eINSTANCE.getClient_Composant_Externalportfourniclientanswerrequest();

		/**
		 * The meta object literal for the '<em><b>Externalportrequisclientsendrequest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CLIENT_COMPOSANT__EXTERNALPORTREQUISCLIENTSENDREQUEST = eINSTANCE.getClient_Composant_Externalportrequisclientsendrequest();

		/**
		 * The meta object literal for the '{@link hADLM1.Receive_request_PortRequisCompo <em>Receive request Port Requis Compo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.Receive_request_PortRequisCompo
		 * @see hADLM1.HADLM1Package#getReceive_request_PortRequisCompo()
		 * @generated
		 */
		public static final EClass RECEIVE_REQUEST_PORT_REQUIS_COMPO = eINSTANCE.getReceive_request_PortRequisCompo();

		/**
		 * The meta object literal for the '{@link hADLM1.SendRequest_PortRequisConfig <em>Send Request Port Requis Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.SendRequest_PortRequisConfig
		 * @see hADLM1.HADLM1Package#getSendRequest_PortRequisConfig()
		 * @generated
		 */
		public static final EClass SEND_REQUEST_PORT_REQUIS_CONFIG = eINSTANCE.getSendRequest_PortRequisConfig();

		/**
		 * The meta object literal for the '{@link hADLM1.ClearenceRequest_RoleTo <em>Clearence Request Role To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.ClearenceRequest_RoleTo
		 * @see hADLM1.HADLM1Package#getClearenceRequest_RoleTo()
		 * @generated
		 */
		public static final EClass CLEARENCE_REQUEST_ROLE_TO = eINSTANCE.getClearenceRequest_RoleTo();

		/**
		 * The meta object literal for the '{@link hADLM1.SQLRequest_Connector <em>SQL Request Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.SQLRequest_Connector
		 * @see hADLM1.HADLM1Package#getSQLRequest_Connector()
		 * @generated
		 */
		public static final EClass SQL_REQUEST_CONNECTOR = eINSTANCE.getSQLRequest_Connector();

		/**
		 * The meta object literal for the '<em><b>Sqlrequest roleto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SQL_REQUEST_CONNECTOR__SQLREQUEST_ROLETO = eINSTANCE.getSQLRequest_Connector_Sqlrequest_roleto();

		/**
		 * The meta object literal for the '<em><b>Sqlrequest rolefrom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SQL_REQUEST_CONNECTOR__SQLREQUEST_ROLEFROM = eINSTANCE.getSQLRequest_Connector_Sqlrequest_rolefrom();

		/**
		 * The meta object literal for the '{@link hADLM1.Send_request_PortFourniCompo <em>Send request Port Fourni Compo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.Send_request_PortFourniCompo
		 * @see hADLM1.HADLM1Package#getSend_request_PortFourniCompo()
		 * @generated
		 */
		public static final EClass SEND_REQUEST_PORT_FOURNI_COMPO = eINSTANCE.getSend_request_PortFourniCompo();

		/**
		 * The meta object literal for the '{@link hADLM1.SecurityManagement_PortFourni <em>Security Management Port Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.SecurityManagement_PortFourni
		 * @see hADLM1.HADLM1Package#getSecurityManagement_PortFourni()
		 * @generated
		 */
		public static final EClass SECURITY_MANAGEMENT_PORT_FOURNI = eINSTANCE.getSecurityManagement_PortFourni();

		/**
		 * The meta object literal for the '{@link hADLM1.LienAttachementY2 <em>Lien Attachement Y2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.LienAttachementY2
		 * @see hADLM1.HADLM1Package#getLienAttachementY2()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT_Y2 = eINSTANCE.getLienAttachementY2();

		/**
		 * The meta object literal for the '<em><b>Queryint portrequis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_Y2__QUERYINT_PORTREQUIS = eINSTANCE.getLienAttachementY2_Queryint_portrequis();

		/**
		 * The meta object literal for the '<em><b>Sqlrequest roleto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_Y2__SQLREQUEST_ROLETO = eINSTANCE.getLienAttachementY2_Sqlrequest_roleto();

		/**
		 * The meta object literal for the '{@link hADLM1.callerAnswer_RoleFrom <em>caller Answer Role From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.callerAnswer_RoleFrom
		 * @see hADLM1.HADLM1Package#getcallerAnswer_RoleFrom()
		 * @generated
		 */
		public static final EClass CALLER_ANSWER_ROLE_FROM = eINSTANCE.getcallerAnswer_RoleFrom();

		/**
		 * The meta object literal for the '{@link hADLM1.ServeurDetails_Configuration <em>Serveur Details Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.ServeurDetails_Configuration
		 * @see hADLM1.HADLM1Package#getServeurDetails_Configuration()
		 * @generated
		 */
		public static final EClass SERVEUR_DETAILS_CONFIGURATION = eINSTANCE.getServeurDetails_Configuration();

		/**
		 * The meta object literal for the '<em><b>Connectionmanager composant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__CONNECTIONMANAGER_COMPOSANT = eINSTANCE.getServeurDetails_Configuration_Connectionmanager_composant();

		/**
		 * The meta object literal for the '<em><b>Securitymanager composant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__SECURITYMANAGER_COMPOSANT = eINSTANCE.getServeurDetails_Configuration_Securitymanager_composant();

		/**
		 * The meta object literal for the '<em><b>Database composant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__DATABASE_COMPOSANT = eINSTANCE.getServeurDetails_Configuration_Database_composant();

		/**
		 * The meta object literal for the '<em><b>Clearencerequest connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__CLEARENCEREQUEST_CONNECTOR = eINSTANCE.getServeurDetails_Configuration_Clearencerequest_connector();

		/**
		 * The meta object literal for the '<em><b>Sqlrequest connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__SQLREQUEST_CONNECTOR = eINSTANCE.getServeurDetails_Configuration_Sqlrequest_connector();

		/**
		 * The meta object literal for the '<em><b>Securityquery connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__SECURITYQUERY_CONNECTOR = eINSTANCE.getServeurDetails_Configuration_Securityquery_connector();

		/**
		 * The meta object literal for the '<em><b>Lienattachementx1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX1 = eINSTANCE.getServeurDetails_Configuration_Lienattachementx1();

		/**
		 * The meta object literal for the '<em><b>Lienattachementx2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX2 = eINSTANCE.getServeurDetails_Configuration_Lienattachementx2();

		/**
		 * The meta object literal for the '<em><b>Lienattachementx3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX3 = eINSTANCE.getServeurDetails_Configuration_Lienattachementx3();

		/**
		 * The meta object literal for the '<em><b>Lienattachementx4</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX4 = eINSTANCE.getServeurDetails_Configuration_Lienattachementx4();

		/**
		 * The meta object literal for the '<em><b>Lienattachementx5</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX5 = eINSTANCE.getServeurDetails_Configuration_Lienattachementx5();

		/**
		 * The meta object literal for the '<em><b>Lienattachementx6</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX6 = eINSTANCE.getServeurDetails_Configuration_Lienattachementx6();

		/**
		 * The meta object literal for the '<em><b>Lienattachementy1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY1 = eINSTANCE.getServeurDetails_Configuration_Lienattachementy1();

		/**
		 * The meta object literal for the '<em><b>Lienattachementy2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY2 = eINSTANCE.getServeurDetails_Configuration_Lienattachementy2();

		/**
		 * The meta object literal for the '<em><b>Lienattachementy3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY3 = eINSTANCE.getServeurDetails_Configuration_Lienattachementy3();

		/**
		 * The meta object literal for the '<em><b>Lienattachementy6</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY6 = eINSTANCE.getServeurDetails_Configuration_Lienattachementy6();

		/**
		 * The meta object literal for the '<em><b>Lienattachementy4</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY4 = eINSTANCE.getServeurDetails_Configuration_Lienattachementy4();

		/**
		 * The meta object literal for the '<em><b>Lienattachementy5</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY5 = eINSTANCE.getServeurDetails_Configuration_Lienattachementy5();

		/**
		 * The meta object literal for the '<em><b>Receiverequestrequisconfig</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__RECEIVEREQUESTREQUISCONFIG = eINSTANCE.getServeurDetails_Configuration_Receiverequestrequisconfig();

		/**
		 * The meta object literal for the '<em><b>Answerrequest portfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__ANSWERREQUEST_PORTFOURNI = eINSTANCE.getServeurDetails_Configuration_Answerrequest_portfourni();

		/**
		 * The meta object literal for the '<em><b>Bindingserveurfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__BINDINGSERVEURFOURNI = eINSTANCE.getServeurDetails_Configuration_Bindingserveurfourni();

		/**
		 * The meta object literal for the '<em><b>Bindingrequisserveurdetails</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVEUR_DETAILS_CONFIGURATION__BINDINGREQUISSERVEURDETAILS = eINSTANCE.getServeurDetails_Configuration_Bindingrequisserveurdetails();

		/**
		 * The meta object literal for the '{@link hADLM1.SecurityAuth_PortRequis <em>Security Auth Port Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.SecurityAuth_PortRequis
		 * @see hADLM1.HADLM1Package#getSecurityAuth_PortRequis()
		 * @generated
		 */
		public static final EClass SECURITY_AUTH_PORT_REQUIS = eINSTANCE.getSecurityAuth_PortRequis();

		/**
		 * The meta object literal for the '{@link hADLM1.AnswerRequest_PortRequisCompo <em>Answer Request Port Requis Compo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.AnswerRequest_PortRequisCompo
		 * @see hADLM1.HADLM1Package#getAnswerRequest_PortRequisCompo()
		 * @generated
		 */
		public static final EClass ANSWER_REQUEST_PORT_REQUIS_COMPO = eINSTANCE.getAnswerRequest_PortRequisCompo();

		/**
		 * The meta object literal for the '{@link hADLM1.LienAttachementY1 <em>Lien Attachement Y1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.LienAttachementY1
		 * @see hADLM1.HADLM1Package#getLienAttachementY1()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT_Y1 = eINSTANCE.getLienAttachementY1();

		/**
		 * The meta object literal for the '<em><b>Securitymanagement portrequis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_Y1__SECURITYMANAGEMENT_PORTREQUIS = eINSTANCE.getLienAttachementY1_Securitymanagement_portrequis();

		/**
		 * The meta object literal for the '<em><b>Securityquery roleto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_Y1__SECURITYQUERY_ROLETO = eINSTANCE.getLienAttachementY1_Securityquery_roleto();

		/**
		 * The meta object literal for the '{@link hADLM1.RPC_ConnectorExplicite <em>RPC Connector Explicite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.RPC_ConnectorExplicite
		 * @see hADLM1.HADLM1Package#getRPC_ConnectorExplicite()
		 * @generated
		 */
		public static final EClass RPC_CONNECTOR_EXPLICITE = eINSTANCE.getRPC_ConnectorExplicite();

		/**
		 * The meta object literal for the '<em><b>Caller role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RPC_CONNECTOR_EXPLICITE__CALLER_ROLE = eINSTANCE.getRPC_ConnectorExplicite_Caller_role();

		/**
		 * The meta object literal for the '<em><b>Called roleto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RPC_CONNECTOR_EXPLICITE__CALLED_ROLETO = eINSTANCE.getRPC_ConnectorExplicite_Called_roleto();

		/**
		 * The meta object literal for the '<em><b>Calledanswer roleto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RPC_CONNECTOR_EXPLICITE__CALLEDANSWER_ROLETO = eINSTANCE.getRPC_ConnectorExplicite_Calledanswer_roleto();

		/**
		 * The meta object literal for the '<em><b>Calleranswer rolefrom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RPC_CONNECTOR_EXPLICITE__CALLERANSWER_ROLEFROM = eINSTANCE.getRPC_ConnectorExplicite_Calleranswer_rolefrom();

		/**
		 * The meta object literal for the '{@link hADLM1.LienAttachementY3 <em>Lien Attachement Y3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.LienAttachementY3
		 * @see hADLM1.HADLM1Package#getLienAttachementY3()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT_Y3 = eINSTANCE.getLienAttachementY3();

		/**
		 * The meta object literal for the '<em><b>Securityauth portrequis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_Y3__SECURITYAUTH_PORTREQUIS = eINSTANCE.getLienAttachementY3_Securityauth_portrequis();

		/**
		 * The meta object literal for the '<em><b>Clearencerequest roleto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_Y3__CLEARENCEREQUEST_ROLETO = eINSTANCE.getLienAttachementY3_Clearencerequest_roleto();

		/**
		 * The meta object literal for the '{@link hADLM1.BindingServeurFourniCompo <em>Binding Serveur Fourni Compo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.BindingServeurFourniCompo
		 * @see hADLM1.HADLM1Package#getBindingServeurFourniCompo()
		 * @generated
		 */
		public static final EClass BINDING_SERVEUR_FOURNI_COMPO = eINSTANCE.getBindingServeurFourniCompo();

		/**
		 * The meta object literal for the '<em><b>Answerrequest portfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BINDING_SERVEUR_FOURNI_COMPO__ANSWERREQUEST_PORTFOURNI = eINSTANCE.getBindingServeurFourniCompo_Answerrequest_portfourni();

		/**
		 * The meta object literal for the '<em><b>Answerrequest portfournicompo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BINDING_SERVEUR_FOURNI_COMPO__ANSWERREQUEST_PORTFOURNICOMPO = eINSTANCE.getBindingServeurFourniCompo_Answerrequest_portfournicompo();

		/**
		 * The meta object literal for the '{@link hADLM1.QueryInt_PortFourni <em>Query Int Port Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.QueryInt_PortFourni
		 * @see hADLM1.HADLM1Package#getQueryInt_PortFourni()
		 * @generated
		 */
		public static final EClass QUERY_INT_PORT_FOURNI = eINSTANCE.getQueryInt_PortFourni();

		/**
		 * The meta object literal for the '{@link hADLM1.called_RoleTo <em>called Role To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.called_RoleTo
		 * @see hADLM1.HADLM1Package#getcalled_RoleTo()
		 * @generated
		 */
		public static final EClass CALLED_ROLE_TO = eINSTANCE.getcalled_RoleTo();

		/**
		 * The meta object literal for the '{@link hADLM1.ClearenceRequest_Connector <em>Clearence Request Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.ClearenceRequest_Connector
		 * @see hADLM1.HADLM1Package#getClearenceRequest_Connector()
		 * @generated
		 */
		public static final EClass CLEARENCE_REQUEST_CONNECTOR = eINSTANCE.getClearenceRequest_Connector();

		/**
		 * The meta object literal for the '<em><b>Clearencerequest roleto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CLEARENCE_REQUEST_CONNECTOR__CLEARENCEREQUEST_ROLETO = eINSTANCE.getClearenceRequest_Connector_Clearencerequest_roleto();

		/**
		 * The meta object literal for the '<em><b>Clearencerequest rolefrom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CLEARENCE_REQUEST_CONNECTOR__CLEARENCEREQUEST_ROLEFROM = eINSTANCE.getClearenceRequest_Connector_Clearencerequest_rolefrom();

		/**
		 * The meta object literal for the '{@link hADLM1.LienAttachementXRequest <em>Lien Attachement XRequest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.LienAttachementXRequest
		 * @see hADLM1.HADLM1Package#getLienAttachementXRequest()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT_XREQUEST = eINSTANCE.getLienAttachementXRequest();

		/**
		 * The meta object literal for the '<em><b>Caller rolefrom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_XREQUEST__CALLER_ROLEFROM = eINSTANCE.getLienAttachementXRequest_Caller_rolefrom();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_XREQUEST__W = eINSTANCE.getLienAttachementXRequest_W();

		/**
		 * The meta object literal for the '{@link hADLM1.SecurityAuth_PortFourni <em>Security Auth Port Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.SecurityAuth_PortFourni
		 * @see hADLM1.HADLM1Package#getSecurityAuth_PortFourni()
		 * @generated
		 */
		public static final EClass SECURITY_AUTH_PORT_FOURNI = eINSTANCE.getSecurityAuth_PortFourni();

		/**
		 * The meta object literal for the '{@link hADLM1.AnswerRequest_PortFourni <em>Answer Request Port Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.AnswerRequest_PortFourni
		 * @see hADLM1.HADLM1Package#getAnswerRequest_PortFourni()
		 * @generated
		 */
		public static final EClass ANSWER_REQUEST_PORT_FOURNI = eINSTANCE.getAnswerRequest_PortFourni();

		/**
		 * The meta object literal for the '{@link hADLM1.SecurityQuery_Connector <em>Security Query Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.SecurityQuery_Connector
		 * @see hADLM1.HADLM1Package#getSecurityQuery_Connector()
		 * @generated
		 */
		public static final EClass SECURITY_QUERY_CONNECTOR = eINSTANCE.getSecurityQuery_Connector();

		/**
		 * The meta object literal for the '<em><b>Securityquery roleto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SECURITY_QUERY_CONNECTOR__SECURITYQUERY_ROLETO = eINSTANCE.getSecurityQuery_Connector_Securityquery_roleto();

		/**
		 * The meta object literal for the '<em><b>Securityquery rolefrom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SECURITY_QUERY_CONNECTOR__SECURITYQUERY_ROLEFROM = eINSTANCE.getSecurityQuery_Connector_Securityquery_rolefrom();

		/**
		 * The meta object literal for the '{@link hADLM1.ExternalSocket_PortRequis <em>External Socket Port Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.ExternalSocket_PortRequis
		 * @see hADLM1.HADLM1Package#getExternalSocket_PortRequis()
		 * @generated
		 */
		public static final EClass EXTERNAL_SOCKET_PORT_REQUIS = eINSTANCE.getExternalSocket_PortRequis();

		/**
		 * The meta object literal for the '{@link hADLM1.ClearenceRequest_RoleFrom <em>Clearence Request Role From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.ClearenceRequest_RoleFrom
		 * @see hADLM1.HADLM1Package#getClearenceRequest_RoleFrom()
		 * @generated
		 */
		public static final EClass CLEARENCE_REQUEST_ROLE_FROM = eINSTANCE.getClearenceRequest_RoleFrom();

		/**
		 * The meta object literal for the '{@link hADLM1.DBQuery_PortFourni <em>DB Query Port Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.DBQuery_PortFourni
		 * @see hADLM1.HADLM1Package#getDBQuery_PortFourni()
		 * @generated
		 */
		public static final EClass DB_QUERY_PORT_FOURNI = eINSTANCE.getDBQuery_PortFourni();

		/**
		 * The meta object literal for the '{@link hADLM1.DBQuery_PortRequis <em>DB Query Port Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.DBQuery_PortRequis
		 * @see hADLM1.HADLM1Package#getDBQuery_PortRequis()
		 * @generated
		 */
		public static final EClass DB_QUERY_PORT_REQUIS = eINSTANCE.getDBQuery_PortRequis();

		/**
		 * The meta object literal for the '{@link hADLM1.BindingServeurFOurni <em>Binding Serveur FOurni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.BindingServeurFOurni
		 * @see hADLM1.HADLM1Package#getBindingServeurFOurni()
		 * @generated
		 */
		public static final EClass BINDING_SERVEUR_FOURNI = eINSTANCE.getBindingServeurFOurni();

		/**
		 * The meta object literal for the '<em><b>Externalsocket portfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BINDING_SERVEUR_FOURNI__EXTERNALSOCKET_PORTFOURNI = eINSTANCE.getBindingServeurFOurni_Externalsocket_portfourni();

		/**
		 * The meta object literal for the '<em><b>Answerrequest portfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BINDING_SERVEUR_FOURNI__ANSWERREQUEST_PORTFOURNI = eINSTANCE.getBindingServeurFOurni_Answerrequest_portfourni();

		/**
		 * The meta object literal for the '{@link hADLM1.LienAttachementYAnswer <em>Lien Attachement YAnswer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.LienAttachementYAnswer
		 * @see hADLM1.HADLM1Package#getLienAttachementYAnswer()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT_YANSWER = eINSTANCE.getLienAttachementYAnswer();

		/**
		 * The meta object literal for the '<em><b>Calledanswer roleto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_YANSWER__CALLEDANSWER_ROLETO = eINSTANCE.getLienAttachementYAnswer_Calledanswer_roleto();

		/**
		 * The meta object literal for the '<em><b>Answerrequest portrequiscompo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_YANSWER__ANSWERREQUEST_PORTREQUISCOMPO = eINSTANCE.getLienAttachementYAnswer_Answerrequest_portrequiscompo();

		/**
		 * The meta object literal for the '{@link hADLM1.calledAnswer_RoleTo <em>called Answer Role To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.calledAnswer_RoleTo
		 * @see hADLM1.HADLM1Package#getcalledAnswer_RoleTo()
		 * @generated
		 */
		public static final EClass CALLED_ANSWER_ROLE_TO = eINSTANCE.getcalledAnswer_RoleTo();

		/**
		 * The meta object literal for the '{@link hADLM1.SecurityCheck_PortRequis <em>Security Check Port Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.SecurityCheck_PortRequis
		 * @see hADLM1.HADLM1Package#getSecurityCheck_PortRequis()
		 * @generated
		 */
		public static final EClass SECURITY_CHECK_PORT_REQUIS = eINSTANCE.getSecurityCheck_PortRequis();

		/**
		 * The meta object literal for the '{@link hADLM1.SQLRequest_RoleFrom <em>SQL Request Role From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.SQLRequest_RoleFrom
		 * @see hADLM1.HADLM1Package#getSQLRequest_RoleFrom()
		 * @generated
		 */
		public static final EClass SQL_REQUEST_ROLE_FROM = eINSTANCE.getSQLRequest_RoleFrom();

		/**
		 * The meta object literal for the '{@link hADLM1.AnswerRequest_PortFourniConfig <em>Answer Request Port Fourni Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.AnswerRequest_PortFourniConfig
		 * @see hADLM1.HADLM1Package#getAnswerRequest_PortFourniConfig()
		 * @generated
		 */
		public static final EClass ANSWER_REQUEST_PORT_FOURNI_CONFIG = eINSTANCE.getAnswerRequest_PortFourniConfig();

		/**
		 * The meta object literal for the '{@link hADLM1.caller_RoleFrom <em>caller Role From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.caller_RoleFrom
		 * @see hADLM1.HADLM1Package#getcaller_RoleFrom()
		 * @generated
		 */
		public static final EClass CALLER_ROLE_FROM = eINSTANCE.getcaller_RoleFrom();

		/**
		 * The meta object literal for the '{@link hADLM1.LienAttachementX1 <em>Lien Attachement X1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.LienAttachementX1
		 * @see hADLM1.HADLM1Package#getLienAttachementX1()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT_X1 = eINSTANCE.getLienAttachementX1();

		/**
		 * The meta object literal for the '<em><b>Securitymanagement portfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_X1__SECURITYMANAGEMENT_PORTFOURNI = eINSTANCE.getLienAttachementX1_Securitymanagement_portfourni();

		/**
		 * The meta object literal for the '<em><b>Securityquery rolefrom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_X1__SECURITYQUERY_ROLEFROM = eINSTANCE.getLienAttachementX1_Securityquery_rolefrom();

		/**
		 * The meta object literal for the '{@link hADLM1.CQuery_PortRequis <em>CQuery Port Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.CQuery_PortRequis
		 * @see hADLM1.HADLM1Package#getCQuery_PortRequis()
		 * @generated
		 */
		public static final EClass CQUERY_PORT_REQUIS = eINSTANCE.getCQuery_PortRequis();

		/**
		 * The meta object literal for the '{@link hADLM1.SQLRequest_RoleTo <em>SQL Request Role To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.SQLRequest_RoleTo
		 * @see hADLM1.HADLM1Package#getSQLRequest_RoleTo()
		 * @generated
		 */
		public static final EClass SQL_REQUEST_ROLE_TO = eINSTANCE.getSQLRequest_RoleTo();

		/**
		 * The meta object literal for the '{@link hADLM1.SecurityQuery_RoleTo <em>Security Query Role To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.SecurityQuery_RoleTo
		 * @see hADLM1.HADLM1Package#getSecurityQuery_RoleTo()
		 * @generated
		 */
		public static final EClass SECURITY_QUERY_ROLE_TO = eINSTANCE.getSecurityQuery_RoleTo();

		/**
		 * The meta object literal for the '{@link hADLM1.LienAttachementX3 <em>Lien Attachement X3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.LienAttachementX3
		 * @see hADLM1.HADLM1Package#getLienAttachementX3()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT_X3 = eINSTANCE.getLienAttachementX3();

		/**
		 * The meta object literal for the '<em><b>Cquery portfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_X3__CQUERY_PORTFOURNI = eINSTANCE.getLienAttachementX3_Cquery_portfourni();

		/**
		 * The meta object literal for the '<em><b>Securityquery rolefrom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_X3__SECURITYQUERY_ROLEFROM = eINSTANCE.getLienAttachementX3_Securityquery_rolefrom();

		/**
		 * The meta object literal for the '{@link hADLM1.SecurityQuery_RoleFrom <em>Security Query Role From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.SecurityQuery_RoleFrom
		 * @see hADLM1.HADLM1Package#getSecurityQuery_RoleFrom()
		 * @generated
		 */
		public static final EClass SECURITY_QUERY_ROLE_FROM = eINSTANCE.getSecurityQuery_RoleFrom();

		/**
		 * The meta object literal for the '{@link hADLM1.AnswerRequest_PortFourniCompo <em>Answer Request Port Fourni Compo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.AnswerRequest_PortFourniCompo
		 * @see hADLM1.HADLM1Package#getAnswerRequest_PortFourniCompo()
		 * @generated
		 */
		public static final EClass ANSWER_REQUEST_PORT_FOURNI_COMPO = eINSTANCE.getAnswerRequest_PortFourniCompo();

		/**
		 * The meta object literal for the '{@link hADLM1.LienAttachementY5 <em>Lien Attachement Y5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.LienAttachementY5
		 * @see hADLM1.HADLM1Package#getLienAttachementY5()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT_Y5 = eINSTANCE.getLienAttachementY5();

		/**
		 * The meta object literal for the '<em><b>Cquery portrequis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_Y5__CQUERY_PORTREQUIS = eINSTANCE.getLienAttachementY5_Cquery_portrequis();

		/**
		 * The meta object literal for the '<em><b>Securityquery roleto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_Y5__SECURITYQUERY_ROLETO = eINSTANCE.getLienAttachementY5_Securityquery_roleto();

		/**
		 * The meta object literal for the '{@link hADLM1.SecurityManager_Composant <em>Security Manager Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.SecurityManager_Composant
		 * @see hADLM1.HADLM1Package#getSecurityManager_Composant()
		 * @generated
		 */
		public static final EClass SECURITY_MANAGER_COMPOSANT = eINSTANCE.getSecurityManager_Composant();

		/**
		 * The meta object literal for the '<em><b>Cquery portfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SECURITY_MANAGER_COMPOSANT__CQUERY_PORTFOURNI = eINSTANCE.getSecurityManager_Composant_Cquery_portfourni();

		/**
		 * The meta object literal for the '<em><b>Securityauth portrequis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SECURITY_MANAGER_COMPOSANT__SECURITYAUTH_PORTREQUIS = eINSTANCE.getSecurityManager_Composant_Securityauth_portrequis();

		/**
		 * The meta object literal for the '<em><b>Cquery portrequis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SECURITY_MANAGER_COMPOSANT__CQUERY_PORTREQUIS = eINSTANCE.getSecurityManager_Composant_Cquery_portrequis();

		/**
		 * The meta object literal for the '<em><b>Securityauth portfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SECURITY_MANAGER_COMPOSANT__SECURITYAUTH_PORTFOURNI = eINSTANCE.getSecurityManager_Composant_Securityauth_portfourni();

		/**
		 * The meta object literal for the '{@link hADLM1.ConnectionManager_Composant <em>Connection Manager Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.ConnectionManager_Composant
		 * @see hADLM1.HADLM1Package#getConnectionManager_Composant()
		 * @generated
		 */
		public static final EClass CONNECTION_MANAGER_COMPOSANT = eINSTANCE.getConnectionManager_Composant();

		/**
		 * The meta object literal for the '<em><b>Externalsocket portrequis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONNECTION_MANAGER_COMPOSANT__EXTERNALSOCKET_PORTREQUIS = eINSTANCE.getConnectionManager_Composant_Externalsocket_portrequis();

		/**
		 * The meta object literal for the '<em><b>Securitycheck portfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONNECTION_MANAGER_COMPOSANT__SECURITYCHECK_PORTFOURNI = eINSTANCE.getConnectionManager_Composant_Securitycheck_portfourni();

		/**
		 * The meta object literal for the '<em><b>Dbquery portfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONNECTION_MANAGER_COMPOSANT__DBQUERY_PORTFOURNI = eINSTANCE.getConnectionManager_Composant_Dbquery_portfourni();

		/**
		 * The meta object literal for the '<em><b>Dbquery portrequis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONNECTION_MANAGER_COMPOSANT__DBQUERY_PORTREQUIS = eINSTANCE.getConnectionManager_Composant_Dbquery_portrequis();

		/**
		 * The meta object literal for the '<em><b>Securitycheck portrequis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONNECTION_MANAGER_COMPOSANT__SECURITYCHECK_PORTREQUIS = eINSTANCE.getConnectionManager_Composant_Securitycheck_portrequis();

		/**
		 * The meta object literal for the '<em><b>Externalsocket portfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONNECTION_MANAGER_COMPOSANT__EXTERNALSOCKET_PORTFOURNI = eINSTANCE.getConnectionManager_Composant_Externalsocket_portfourni();

		/**
		 * The meta object literal for the '{@link hADLM1.bindingRequisServeurConfig <em>binding Requis Serveur Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.bindingRequisServeurConfig
		 * @see hADLM1.HADLM1Package#getbindingRequisServeurConfig()
		 * @generated
		 */
		public static final EClass BINDING_REQUIS_SERVEUR_CONFIG = eINSTANCE.getbindingRequisServeurConfig();

		/**
		 * The meta object literal for the '<em><b>Receiverequestrequisconfig</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BINDING_REQUIS_SERVEUR_CONFIG__RECEIVEREQUESTREQUISCONFIG = eINSTANCE.getbindingRequisServeurConfig_Receiverequestrequisconfig();

		/**
		 * The meta object literal for the '<em><b>Receive request portrequiscompo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BINDING_REQUIS_SERVEUR_CONFIG__RECEIVE_REQUEST_PORTREQUISCOMPO = eINSTANCE.getbindingRequisServeurConfig_Receive_request_portrequiscompo();

		/**
		 * The meta object literal for the '{@link hADLM1.SecurityManagement_PortRequis <em>Security Management Port Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.SecurityManagement_PortRequis
		 * @see hADLM1.HADLM1Package#getSecurityManagement_PortRequis()
		 * @generated
		 */
		public static final EClass SECURITY_MANAGEMENT_PORT_REQUIS = eINSTANCE.getSecurityManagement_PortRequis();

		/**
		 * The meta object literal for the '{@link hADLM1.LienAttachementX2 <em>Lien Attachement X2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.LienAttachementX2
		 * @see hADLM1.HADLM1Package#getLienAttachementX2()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT_X2 = eINSTANCE.getLienAttachementX2();

		/**
		 * The meta object literal for the '<em><b>Queryint portfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_X2__QUERYINT_PORTFOURNI = eINSTANCE.getLienAttachementX2_Queryint_portfourni();

		/**
		 * The meta object literal for the '<em><b>Sqlrequest rolefrom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_X2__SQLREQUEST_ROLEFROM = eINSTANCE.getLienAttachementX2_Sqlrequest_rolefrom();

		/**
		 * The meta object literal for the '{@link hADLM1.LienAttachementYRequest <em>Lien Attachement YRequest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.LienAttachementYRequest
		 * @see hADLM1.HADLM1Package#getLienAttachementYRequest()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT_YREQUEST = eINSTANCE.getLienAttachementYRequest();

		/**
		 * The meta object literal for the '<em><b>Called roleto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_YREQUEST__CALLED_ROLETO = eINSTANCE.getLienAttachementYRequest_Called_roleto();

		/**
		 * The meta object literal for the '<em><b>Receive request portrequiscompo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_YREQUEST__RECEIVE_REQUEST_PORTREQUISCOMPO = eINSTANCE.getLienAttachementYRequest_Receive_request_portrequiscompo();

		/**
		 * The meta object literal for the '{@link hADLM1.Systeme_Configuration <em>Systeme Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.Systeme_Configuration
		 * @see hADLM1.HADLM1Package#getSysteme_Configuration()
		 * @generated
		 */
		public static final EClass SYSTEME_CONFIGURATION = eINSTANCE.getSysteme_Configuration();

		/**
		 * The meta object literal for the '<em><b>Client composant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYSTEME_CONFIGURATION__CLIENT_COMPOSANT = eINSTANCE.getSysteme_Configuration_Client_composant();

		/**
		 * The meta object literal for the '<em><b>Serveur composant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYSTEME_CONFIGURATION__SERVEUR_COMPOSANT = eINSTANCE.getSysteme_Configuration_Serveur_composant();

		/**
		 * The meta object literal for the '<em><b>Rpc connectorexplicite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYSTEME_CONFIGURATION__RPC_CONNECTOREXPLICITE = eINSTANCE.getSysteme_Configuration_Rpc_connectorexplicite();

		/**
		 * The meta object literal for the '<em><b>Lienattachementx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYSTEME_CONFIGURATION__LIENATTACHEMENTX = eINSTANCE.getSysteme_Configuration_Lienattachementx();

		/**
		 * The meta object literal for the '<em><b>Lienattachementy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYSTEME_CONFIGURATION__LIENATTACHEMENTY = eINSTANCE.getSysteme_Configuration_Lienattachementy();

		/**
		 * The meta object literal for the '<em><b>Sendrequest portrequisconfig</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYSTEME_CONFIGURATION__SENDREQUEST_PORTREQUISCONFIG = eINSTANCE.getSysteme_Configuration_Sendrequest_portrequisconfig();

		/**
		 * The meta object literal for the '<em><b>Answerrequest portfourniconfig</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYSTEME_CONFIGURATION__ANSWERREQUEST_PORTFOURNICONFIG = eINSTANCE.getSysteme_Configuration_Answerrequest_portfourniconfig();

		/**
		 * The meta object literal for the '<em><b>Externalbindinganswerrequest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYSTEME_CONFIGURATION__EXTERNALBINDINGANSWERREQUEST = eINSTANCE.getSysteme_Configuration_Externalbindinganswerrequest();

		/**
		 * The meta object literal for the '<em><b>Externalbindingsendrequest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYSTEME_CONFIGURATION__EXTERNALBINDINGSENDREQUEST = eINSTANCE.getSysteme_Configuration_Externalbindingsendrequest();

		/**
		 * The meta object literal for the '<em><b>Lienattachementxanswer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYSTEME_CONFIGURATION__LIENATTACHEMENTXANSWER = eINSTANCE.getSysteme_Configuration_Lienattachementxanswer();

		/**
		 * The meta object literal for the '<em><b>Lienattachementyanswer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYSTEME_CONFIGURATION__LIENATTACHEMENTYANSWER = eINSTANCE.getSysteme_Configuration_Lienattachementyanswer();

		/**
		 * The meta object literal for the '{@link hADLM1.LienAttachementXAnswer <em>Lien Attachement XAnswer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.LienAttachementXAnswer
		 * @see hADLM1.HADLM1Package#getLienAttachementXAnswer()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT_XANSWER = eINSTANCE.getLienAttachementXAnswer();

		/**
		 * The meta object literal for the '<em><b>Calleranswer rolefrom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_XANSWER__CALLERANSWER_ROLEFROM = eINSTANCE.getLienAttachementXAnswer_Calleranswer_rolefrom();

		/**
		 * The meta object literal for the '<em><b>Answerrequest portfournicompo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_XANSWER__ANSWERREQUEST_PORTFOURNICOMPO = eINSTANCE.getLienAttachementXAnswer_Answerrequest_portfournicompo();

		/**
		 * The meta object literal for the '{@link hADLM1.bindingRequisServeurDetails <em>binding Requis Serveur Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.bindingRequisServeurDetails
		 * @see hADLM1.HADLM1Package#getbindingRequisServeurDetails()
		 * @generated
		 */
		public static final EClass BINDING_REQUIS_SERVEUR_DETAILS = eINSTANCE.getbindingRequisServeurDetails();

		/**
		 * The meta object literal for the '<em><b>Receive request portrequiscompo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BINDING_REQUIS_SERVEUR_DETAILS__RECEIVE_REQUEST_PORTREQUISCOMPO = eINSTANCE.getbindingRequisServeurDetails_Receive_request_portrequiscompo();

		/**
		 * The meta object literal for the '<em><b>Externalsocket portrequis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BINDING_REQUIS_SERVEUR_DETAILS__EXTERNALSOCKET_PORTREQUIS = eINSTANCE.getbindingRequisServeurDetails_Externalsocket_portrequis();

		/**
		 * The meta object literal for the '{@link hADLM1.LienAttachementX4 <em>Lien Attachement X4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.LienAttachementX4
		 * @see hADLM1.HADLM1Package#getLienAttachementX4()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT_X4 = eINSTANCE.getLienAttachementX4();

		/**
		 * The meta object literal for the '<em><b>Securityauth portfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_X4__SECURITYAUTH_PORTFOURNI = eINSTANCE.getLienAttachementX4_Securityauth_portfourni();

		/**
		 * The meta object literal for the '<em><b>Clearencerequest rolefrom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_X4__CLEARENCEREQUEST_ROLEFROM = eINSTANCE.getLienAttachementX4_Clearencerequest_rolefrom();

		/**
		 * The meta object literal for the '{@link hADLM1.Database_Composant <em>Database Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.Database_Composant
		 * @see hADLM1.HADLM1Package#getDatabase_Composant()
		 * @generated
		 */
		public static final EClass DATABASE_COMPOSANT = eINSTANCE.getDatabase_Composant();

		/**
		 * The meta object literal for the '<em><b>Queryint portrequis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DATABASE_COMPOSANT__QUERYINT_PORTREQUIS = eINSTANCE.getDatabase_Composant_Queryint_portrequis();

		/**
		 * The meta object literal for the '<em><b>Securitymanagement portrequis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DATABASE_COMPOSANT__SECURITYMANAGEMENT_PORTREQUIS = eINSTANCE.getDatabase_Composant_Securitymanagement_portrequis();

		/**
		 * The meta object literal for the '<em><b>Queryint portfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DATABASE_COMPOSANT__QUERYINT_PORTFOURNI = eINSTANCE.getDatabase_Composant_Queryint_portfourni();

		/**
		 * The meta object literal for the '<em><b>Securitymanagement portfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DATABASE_COMPOSANT__SECURITYMANAGEMENT_PORTFOURNI = eINSTANCE.getDatabase_Composant_Securitymanagement_portfourni();

		/**
		 * The meta object literal for the '{@link hADLM1.CQuery_PortFourni <em>CQuery Port Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.CQuery_PortFourni
		 * @see hADLM1.HADLM1Package#getCQuery_PortFourni()
		 * @generated
		 */
		public static final EClass CQUERY_PORT_FOURNI = eINSTANCE.getCQuery_PortFourni();

		/**
		 * The meta object literal for the '{@link hADLM1.LienAttachementX5 <em>Lien Attachement X5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.LienAttachementX5
		 * @see hADLM1.HADLM1Package#getLienAttachementX5()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT_X5 = eINSTANCE.getLienAttachementX5();

		/**
		 * The meta object literal for the '<em><b>Dbquery portfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_X5__DBQUERY_PORTFOURNI = eINSTANCE.getLienAttachementX5_Dbquery_portfourni();

		/**
		 * The meta object literal for the '<em><b>Sqlrequest rolefrom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_X5__SQLREQUEST_ROLEFROM = eINSTANCE.getLienAttachementX5_Sqlrequest_rolefrom();

		/**
		 * The meta object literal for the '{@link hADLM1.ReceiveRequestRequisConfig <em>Receive Request Requis Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.ReceiveRequestRequisConfig
		 * @see hADLM1.HADLM1Package#getReceiveRequestRequisConfig()
		 * @generated
		 */
		public static final EClass RECEIVE_REQUEST_REQUIS_CONFIG = eINSTANCE.getReceiveRequestRequisConfig();

		/**
		 * The meta object literal for the '{@link hADLM1.ExternalBindingAnswerRequest <em>External Binding Answer Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.ExternalBindingAnswerRequest
		 * @see hADLM1.HADLM1Package#getExternalBindingAnswerRequest()
		 * @generated
		 */
		public static final EClass EXTERNAL_BINDING_ANSWER_REQUEST = eINSTANCE.getExternalBindingAnswerRequest();

		/**
		 * The meta object literal for the '<em><b>Answerrequest portfourniconfig</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EXTERNAL_BINDING_ANSWER_REQUEST__ANSWERREQUEST_PORTFOURNICONFIG = eINSTANCE.getExternalBindingAnswerRequest_Answerrequest_portfourniconfig();

		/**
		 * The meta object literal for the '<em><b>Externalportfourniclientanswerrequest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EXTERNAL_BINDING_ANSWER_REQUEST__EXTERNALPORTFOURNICLIENTANSWERREQUEST = eINSTANCE.getExternalBindingAnswerRequest_Externalportfourniclientanswerrequest();

		/**
		 * The meta object literal for the '{@link hADLM1.ExternalPortRequisClientSendRequest <em>External Port Requis Client Send Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.ExternalPortRequisClientSendRequest
		 * @see hADLM1.HADLM1Package#getExternalPortRequisClientSendRequest()
		 * @generated
		 */
		public static final EClass EXTERNAL_PORT_REQUIS_CLIENT_SEND_REQUEST = eINSTANCE.getExternalPortRequisClientSendRequest();

		/**
		 * The meta object literal for the '{@link hADLM1.ExternalPortFourniClientAnswerRequest <em>External Port Fourni Client Answer Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADLM1.ExternalPortFourniClientAnswerRequest
		 * @see hADLM1.HADLM1Package#getExternalPortFourniClientAnswerRequest()
		 * @generated
		 */
		public static final EClass EXTERNAL_PORT_FOURNI_CLIENT_ANSWER_REQUEST = eINSTANCE.getExternalPortFourniClientAnswerRequest();

	}

} //HADLM1Package
