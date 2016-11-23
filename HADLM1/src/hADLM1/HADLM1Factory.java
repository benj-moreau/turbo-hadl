/**
 */
package hADLM1;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import hADL.Composant.Composant;
import hADL.Configuration.Configuration;
import hADL.Configuration.Observer;
import hADL.Connecteurs.Connecteur;
import hADL.Interfaces.PortFourniCompo;
import hADL.Interfaces.PortFourniConfig;
import hADL.Interfaces.PortRequisCompo;
import hADL.Interfaces.PortRequisConfig;
import hADL.Liens.LienAttachementPFRF;
import hADL.Liens.LienAttachementPRRT;
import hADL.Liens.LienBindingFourni;
import hADL.Liens.LienBindingRequis;
import hADL.Roles.RoleFrom;
import hADL.Roles.RoleTo;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public class HADLM1Factory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HADLM1Factory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HADLM1Factory INSTANCE = hADLM1.HADLM1Factory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HADLM1Factory init() {
		try {
			HADLM1Factory theHADLM1Factory = (HADLM1Factory)EPackage.Registry.INSTANCE.getEFactory(HADLM1Package.eNS_URI);
			if (theHADLM1Factory != null) {
				return theHADLM1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HADLM1Factory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HADLM1Factory() {
		super();
	}

	
	/**
	 * @generated NOT
	 */
	public ConnectionManager_Composant createConnectionManagerPerso(Observer observer){
		
		//1-creation des port
		ExternalSocket_PortFourni externalSocket_PortFourni = createExternalSocket_PortFourni();
		externalSocket_PortFourni.setObserver(observer);
		ExternalSocket_PortRequis externalSocket_PortRequis = createExternalSocket_PortRequis();
		externalSocket_PortRequis.setObserver(observer);
		SecurityCheck_PortFourni check_PortFourni = createSecurityCheck_PortFourni();
		check_PortFourni.setObserver(observer);
		SecurityCheck_PortRequis check_PortRequis = createSecurityCheck_PortRequis();
		check_PortRequis.setObserver(observer);
		DBQuery_PortFourni dbQuery_PortFourni = createDBQuery_PortFourni();
		dbQuery_PortFourni.setObserver(observer);
		DBQuery_PortRequis dbQuery_PortRequis = createDBQuery_PortRequis();
		dbQuery_PortRequis.setObserver(observer);
		
		//2- creation du composant
		ConnectionManager_Composant connectionManager_Composant = createConnectionManager_Composant();
		
		//3-affectation des port au composant
		connectionManager_Composant.setExternalsocket_portfourni(externalSocket_PortFourni);
		connectionManager_Composant.setSecuritycheck_portfourni(check_PortFourni);
		connectionManager_Composant.setDbquery_portfourni(dbQuery_PortFourni);
		
		connectionManager_Composant.setExternalsocket_portrequis(externalSocket_PortRequis);
		connectionManager_Composant.setSecuritycheck_portrequis(check_PortRequis);
		connectionManager_Composant.setDbquery_portrequis(dbQuery_PortRequis);
		
		//4-creation des liste de ports dans le composants
		PortFourniCompo[] portsFournis = new PortFourniCompo[3];
		portsFournis[0] = externalSocket_PortFourni;
		portsFournis[1] = check_PortFourni;
		portsFournis[2] = dbQuery_PortFourni;
		
		PortRequisCompo[] portsRequis = new PortRequisCompo[3];
		portsRequis[0] = externalSocket_PortRequis;
		portsRequis[1] = check_PortRequis;
		portsRequis[2] = dbQuery_PortRequis;
		
		//5-affectation des listes
		connectionManager_Composant.setPortfournicompo(portsFournis);
		connectionManager_Composant.setPortrequiscompo(portsRequis);
		
		return connectionManager_Composant;
	}
	
	/**
	 * @generated NOT
	 */
	public SecurityManager_Composant createSecurityManagerPerso(Observer observer){
		//1-creation des port
		SecurityAuth_PortFourni securityAuth_PortFourni= createSecurityAuth_PortFourni();
		securityAuth_PortFourni.setObserver(observer);
		SecurityAuth_PortRequis securityAuth_PortRequis = createSecurityAuth_PortRequis();
		securityAuth_PortRequis.setObserver(observer);
		CQuery_PortFourni cQuery_PortFourni = createCQuery_PortFourni();
		cQuery_PortFourni.setObserver(observer);
		CQuery_PortRequis cQuery_PortRequis = createCQuery_PortRequis();
		cQuery_PortRequis.setObserver(observer);
		
		//2- creation du composant
		SecurityManager_Composant  securityManager_Composant = createSecurityManager_Composant();
		
		//3-affectation des port au composant
		securityManager_Composant.setSecurityauth_portfourni(securityAuth_PortFourni);
		securityManager_Composant.setCquery_portfourni(cQuery_PortFourni);
		
		securityManager_Composant.setSecurityauth_portrequis(securityAuth_PortRequis);
		securityManager_Composant.setCquery_portrequis(cQuery_PortRequis);
		
		//4-creation des liste de ports dans le composants
		PortFourniCompo[] portsFournis = new PortFourniCompo[2];
		portsFournis[0] = securityAuth_PortFourni;
		portsFournis[1] = cQuery_PortFourni;
		
		PortRequisCompo[] portsRequis = new PortRequisCompo[2];
		portsRequis[0] = securityAuth_PortRequis;
		portsRequis[1] = cQuery_PortRequis;
		
		//5-affectation des listes
		securityManager_Composant.setPortfournicompo(portsFournis);
		securityManager_Composant.setPortrequiscompo(portsRequis);
		
		return securityManager_Composant;
	}
	
	/**
	 * @generated NOT
	 */
	public Database_Composant createDatabaseComposantPerso(Observer observer){
		//1-creation des port
		QueryInt_PortFourni queryInt_PortFourni = createQueryInt_PortFourni();
		queryInt_PortFourni.setObserver(observer);
		SecurityManagement_PortFourni securityManagement_PortFourni = createSecurityManagement_PortFourni();
		securityManagement_PortFourni.setObserver(observer);
		QueryInt_PortRequis queryInt_PortRequis = createQueryInt_PortRequis();
		queryInt_PortRequis.setObserver(observer);
		SecurityManagement_PortRequis securityManagement_PortRequis = createSecurityManagement_PortRequis();
		securityManagement_PortRequis.setObserver(observer);
		
		//2- creation du composant
		Database_Composant  database_Composant= createDatabase_Composant();
		
		//3-affectation des port au composant
		database_Composant.setQueryint_portfourni(queryInt_PortFourni);
		database_Composant.setQueryint_portrequis(queryInt_PortRequis);
		
		database_Composant.setSecuritymanagement_portfourni(securityManagement_PortFourni);
		database_Composant.setSecuritymanagement_portrequis(securityManagement_PortRequis);
		
		//4-creation des liste de ports dans le composants
		PortFourniCompo[] portsFournis = new PortFourniCompo[2];
		portsFournis[0] = queryInt_PortFourni;
		portsFournis[1] = securityManagement_PortFourni;
		
		PortRequisCompo[] portsRequis = new PortRequisCompo[2];
		portsRequis[0] = queryInt_PortRequis;
		portsRequis[1] = securityManagement_PortRequis;
		
		//5-affectation des listes
		database_Composant.setPortfournicompo(portsFournis);
		database_Composant.setPortrequiscompo(portsRequis);
		
		return database_Composant;
	}
	
	/**
	 * @generated NOT
	 */
	public ClearenceRequest_Connector createClearenceRequestConnectorPerso(Observer observer){
		//1-creation des Roles
		ClearenceRequest_RoleTo roleTo = createClearenceRequest_RoleTo();
		ClearenceRequest_RoleFrom roleFrom = createClearenceRequest_RoleFrom();
		roleTo.setObserver(observer);
		roleFrom.setObserver(observer);
		
		//2- creation du connecteur
		ClearenceRequest_Connector  clearenceRequest_Connector= createClearenceRequest_Connector();
		
		//3-affectation des roles au connector
		clearenceRequest_Connector.setClearencerequest_roleto(roleTo);
		clearenceRequest_Connector.setClearencerequest_rolefrom(roleFrom);
		//4-creation des liste des roles
		RoleTo[] rolesTo = new RoleTo[1];
		rolesTo[0] = roleTo;
		
		RoleFrom[] rolesFrom = new RoleFrom[1];
		rolesFrom[0] = roleFrom;
		
		//5-affectation des listes
		clearenceRequest_Connector.setRoleto(rolesTo);
		clearenceRequest_Connector.setRolefrom(rolesFrom);
		
		return clearenceRequest_Connector;
	}
	
	/**
	 * @generated NOT
	 */
	public SQLRequest_Connector createSQLRequestConnectorPerso(Observer observer){
		//1-creation des Roles
		SQLRequest_RoleFrom roleFrom = createSQLRequest_RoleFrom();
		SQLRequest_RoleTo roleTo = createSQLRequest_RoleTo();
		roleTo.setObserver(observer);
		roleFrom.setObserver(observer);
		
		
		//2- creation du connecteur
		SQLRequest_Connector  connector= createSQLRequest_Connector();
		
		//3-affectation des roles au connector
		connector.setSqlrequest_roleto(roleTo);
		connector.setSqlrequest_rolefrom(roleFrom);
		//4-creation des liste des roles
		RoleTo[] rolesTo = new RoleTo[1];
		rolesTo[0] = roleTo;
		
		RoleFrom[] rolesFrom = new RoleFrom[1];
		rolesFrom[0] = roleFrom;
		
		//5-affectation des listes
		connector.setRoleto(rolesTo);
		connector.setRolefrom(rolesFrom);
		
		return connector;
	}
	
	/**
	 * @generated NOT
	 */
	public SecurityQuery_Connector createSecurityQueryConnectorPerso(Observer observer){
		//1-creation des Roles
		SecurityQuery_RoleFrom roleFrom = createSecurityQuery_RoleFrom();
		SecurityQuery_RoleTo roleTo = createSecurityQuery_RoleTo();
		roleTo.setObserver(observer);
		roleFrom.setObserver(observer);
		
		
		//2- creation du connecteur
		SecurityQuery_Connector  connector= createSecurityQuery_Connector();
		
		//3-affectation des roles au connector
		connector.setSecurityquery_roleto(roleTo);
		connector.setSecurityquery_rolefrom(roleFrom);
		//4-creation des liste des roles
		RoleTo[] rolesTo = new RoleTo[1];
		rolesTo[0] = roleTo;
		
		RoleFrom[] rolesFrom = new RoleFrom[1];
		rolesFrom[0] = roleFrom;
		
		//5-affectation des listes
		connector.setRoleto(rolesTo);
		connector.setRolefrom(rolesFrom);
		
		return connector;
	}
	/**
	 * @generated NOT
	 */
	public ServeurDetails_Configuration createServeurDetailPerso(Observer observer){
		//0-creation de la config
		ServeurDetails_Configuration configuration = createServeurDetails_Configuration();
		//1-creation des composants
		ConnectionManager_Composant connectionManager_Composant = createConnectionManagerPerso(configuration);
		SecurityManager_Composant securityManager_Composant = createSecurityManagerPerso(configuration);
		Database_Composant database_Composant = createDatabaseComposantPerso(configuration);
		
		
		//2-creation des connecteurs
		ClearenceRequest_Connector clearenceRequest_Connector= createClearenceRequestConnectorPerso(configuration);
		SQLRequest_Connector sqlRequest_Connector = createSQLRequestConnectorPerso(configuration);
		SecurityQuery_Connector securityQuery_Connector = createSecurityQueryConnectorPerso(configuration);
		
		
		//3-creation des liens d'attachements
		LienAttachementX1 attachementX1 = createLienAttachementX1();
		attachementX1.setRolefrom(securityQuery_Connector.getSecurityquery_rolefrom());
		attachementX1.setPortfourni(database_Composant.getSecuritymanagement_portfourni());
		attachementX1.setSecuritymanagement_portfourni(database_Composant.getSecuritymanagement_portfourni());
		attachementX1.setSecurityquery_rolefrom(securityQuery_Connector.getSecurityquery_rolefrom());
		LienAttachementX2 attachementX2 = createLienAttachementX2();
		attachementX2.setQueryint_portfourni(database_Composant.getQueryint_portfourni());
		attachementX2.setSqlrequest_rolefrom(sqlRequest_Connector.getSqlrequest_rolefrom());
		attachementX2.setRolefrom(sqlRequest_Connector.getSqlrequest_rolefrom());
		attachementX2.setPortfourni(database_Composant.getQueryint_portfourni());
		LienAttachementX3 attachementX3 = createLienAttachementX3();
		attachementX3.setSecurityquery_rolefrom(securityQuery_Connector.getSecurityquery_rolefrom());
		attachementX3.setCquery_portfourni(securityManager_Composant.getCquery_portfourni());
		attachementX3.setRolefrom(securityQuery_Connector.getSecurityquery_rolefrom());
		attachementX3.setPortfourni(securityManager_Composant.getCquery_portfourni());
		LienAttachementX4 attachementX4 = createLienAttachementX4();
		attachementX4.setSecurityauth_portfourni(securityManager_Composant.getSecurityauth_portfourni());
		attachementX4.setClearencerequest_rolefrom(clearenceRequest_Connector.getClearencerequest_rolefrom());
		attachementX4.setRolefrom(clearenceRequest_Connector.getClearencerequest_rolefrom());
		attachementX4.setPortfourni(securityManager_Composant.getSecurityauth_portfourni());
		LienAttachementX5 attachementX5 = createLienAttachementX5();
		attachementX5.setDbquery_portfourni(connectionManager_Composant.getDbquery_portfourni());
		attachementX5.setSqlrequest_rolefrom(sqlRequest_Connector.getSqlrequest_rolefrom());
		attachementX5.setRolefrom(sqlRequest_Connector.getSqlrequest_rolefrom());
		attachementX5.setPortfourni(connectionManager_Composant.getDbquery_portfourni());
		LienAttachementX6 attachementX6 = createLienAttachementX6();
		attachementX6.setClearencerequest_rolefrom(clearenceRequest_Connector.getClearencerequest_rolefrom());
		attachementX6.setSecuritycheck_portfourni(connectionManager_Composant.getSecuritycheck_portfourni());
		attachementX6.setRolefrom(clearenceRequest_Connector.getClearencerequest_rolefrom());
		attachementX6.setPortfourni(connectionManager_Composant.getSecuritycheck_portfourni());
		
		LienAttachementY1 attachementY1 = createLienAttachementY1();
		attachementY1.setPortrequis(database_Composant.getSecuritymanagement_portrequis());
		attachementY1.setRoleto(securityQuery_Connector.getSecurityquery_roleto());
		attachementY1.setSecuritymanagement_portrequis(database_Composant.getSecuritymanagement_portrequis());
		attachementY1.setSecurityquery_roleto(securityQuery_Connector.getSecurityquery_roleto());
		LienAttachementY2 attachementY2 = createLienAttachementY2();
		attachementY2.setPortrequis(database_Composant.getQueryint_portrequis());
		attachementY2.setRoleto(sqlRequest_Connector.getSqlrequest_roleto());
		attachementY2.setQueryint_portrequis(database_Composant.getQueryint_portrequis());
		attachementY2.setSqlrequest_roleto(sqlRequest_Connector.getSqlrequest_roleto());
		LienAttachementY3 attachementY3 = createLienAttachementY3();
		attachementY3.setPortrequis(securityManager_Composant.getSecurityauth_portrequis());
		attachementY3.setRoleto(clearenceRequest_Connector.getClearencerequest_roleto());
		attachementY3.setClearencerequest_roleto(clearenceRequest_Connector.getClearencerequest_roleto());
		attachementY3.setSecurityauth_portrequis(securityManager_Composant.getSecurityauth_portrequis());
		LienAttachementY4 attachementY4 = createLienAttachementY4();
		attachementY4.setPortrequis(connectionManager_Composant.getSecuritycheck_portrequis());
		attachementY4.setRoleto(clearenceRequest_Connector.getClearencerequest_roleto());
		attachementY4.setClearencerequest_roleto(clearenceRequest_Connector.getClearencerequest_roleto());
		attachementY4.setSecuritycheck_portrequis(connectionManager_Composant.getSecuritycheck_portrequis());
		LienAttachementY5 attachementY5 = createLienAttachementY5();
		attachementY5.setPortrequis(securityManager_Composant.getCquery_portrequis());
		attachementY5.setRoleto(securityQuery_Connector.getSecurityquery_roleto());
		attachementY5.setCquery_portrequis(securityManager_Composant.getCquery_portrequis());
		attachementY5.setSecurityquery_roleto(securityQuery_Connector.getSecurityquery_roleto());
		LienAttachementY6 attachementY6 = createLienAttachementY6();
		attachementY6.setPortrequis(connectionManager_Composant.getDbquery_portrequis());
		attachementY6.setRoleto(sqlRequest_Connector.getSqlrequest_roleto());
		attachementY6.setDbquery_portrequis(connectionManager_Composant.getDbquery_portrequis());
		attachementY6.setSqlrequest_roleto(sqlRequest_Connector.getSqlrequest_roleto());
		
		configuration.setLienattachementx1(attachementX1);
		configuration.setLienattachementx2(attachementX2);
		configuration.setLienattachementx3(attachementX3);
		configuration.setLienattachementx4(attachementX4);
		configuration.setLienattachementx5(attachementX5);
		configuration.setLienattachementx6(attachementX6);
		
		configuration.setLienattachementy1(attachementY1);
		configuration.setLienattachementy2(attachementY2);
		configuration.setLienattachementy3(attachementY3);
		configuration.setLienattachementy4(attachementY4);
		configuration.setLienattachementy5(attachementY5);
		configuration.setLienattachementy6(attachementY6);
		
		LienAttachementPFRF[] lienspfrf = new LienAttachementPFRF[6];
		LienAttachementPRRT[] liensprrt = new LienAttachementPRRT[6];
		
		lienspfrf[0] = attachementX1;
		lienspfrf[1] = attachementX2;
		lienspfrf[2] = attachementX3;
		lienspfrf[3] = attachementX4;
		lienspfrf[4] = attachementX5;
		lienspfrf[5] = attachementX6;
		
		liensprrt[0] = attachementY1;
		liensprrt[1] = attachementY2;
		liensprrt[2] = attachementY3;
		liensprrt[3] = attachementY4;
		liensprrt[4] = attachementY5;
		liensprrt[5] = attachementY6;
		
		configuration.setLienattachementpfrf(lienspfrf);
		configuration.setLienattachementprrt(liensprrt);
		//4-creation des ports
		ReceiveRequestRequisConfig receiveRequestRequisConfig = createReceiveRequestRequisConfig();
		AnswerRequest_PortFourni answerRequest_PortFourniConfig = createAnswerRequest_PortFourni();
		receiveRequestRequisConfig.setObserver(observer);
		answerRequest_PortFourniConfig.setObserver(observer);
		
		configuration.setReceiverequestrequisconfig(receiveRequestRequisConfig);
		configuration.setAnswerrequest_portfourni(answerRequest_PortFourniConfig);
		//5-creation des liens binding
		BindingServeurFOurni bindingServeurFOurni = createBindingServeurFOurni();
		bindingRequisServeurDetails bindingRequisServeurDetails = createbindingRequisServeurDetails();
		
		bindingServeurFOurni.setAnswerrequest_portfourni(answerRequest_PortFourniConfig);
		bindingServeurFOurni.setExternalsocket_portfourni(connectionManager_Composant.getExternalsocket_portfourni());
		bindingServeurFOurni.setPortfournicompo(connectionManager_Composant.getExternalsocket_portfourni());
		bindingServeurFOurni.setPortfourniconfig(answerRequest_PortFourniConfig);
		
		bindingRequisServeurDetails.setExternalsocket_portrequis(connectionManager_Composant.getExternalsocket_portrequis());
		bindingRequisServeurDetails.setPortrequiscompo(connectionManager_Composant.getExternalsocket_portrequis());
		bindingRequisServeurDetails.setPortrequisconfig(receiveRequestRequisConfig);
		bindingRequisServeurDetails.setReceive_request_portrequiscompo(receiveRequestRequisConfig);
		
		LienBindingRequis[] bindingsRequis = new LienBindingRequis[1];
		bindingsRequis[0]=bindingRequisServeurDetails;
		LienBindingFourni[] bindingsFournis = new LienBindingFourni[1];
		bindingsFournis[0]= bindingServeurFOurni;
		
		configuration.setBindingrequisserveurdetails(bindingRequisServeurDetails);
		configuration.setBindingserveurfourni(bindingServeurFOurni);
		configuration.setLienbindingfourni(bindingsFournis);
		configuration.setLienbindingrequis(bindingsRequis);
		
		//6-lien avec la config
		configuration.setConnectionmanager_composant(connectionManager_Composant);
		configuration.setSecuritymanager_composant(securityManager_Composant);
		configuration.setDatabase_composant(database_Composant);
		
		Composant[] childComposants = new Composant[3];
		childComposants[0] = connectionManager_Composant;
		childComposants[1] = securityManager_Composant;
		childComposants[2] = database_Composant;
		
		configuration.setChildComposant(childComposants);
		//--------
		configuration.setClearencerequest_connector(clearenceRequest_Connector);
		configuration.setSqlrequest_connector(sqlRequest_Connector);
		configuration.setSecurityquery_connector(securityQuery_Connector);
		
		Connecteur[] childConnecteurs= new Connecteur[3];
		childConnecteurs[0] = clearenceRequest_Connector;
		childConnecteurs[1] = sqlRequest_Connector;
		childConnecteurs[2] = securityQuery_Connector;
		
		configuration.setChildConnecteur(childConnecteurs);
		
		return configuration;
	}
	
	/**
	 * @generated NOT
	 */
	public Serveur_Composant createServeurComposantPerso(Observer observer){
		
		//1-creation des ports
		Receive_request_PortRequisCompo receive_request_PortRequisCompo = createReceive_request_PortRequisCompo();
		receive_request_PortRequisCompo.setObserver(observer);
		AnswerRequest_PortFourniCompo answerRequest_PortFourniCompo = createAnswerRequest_PortFourniCompo();
		answerRequest_PortFourniCompo.setObserver(observer);
		
		//2- creation du composant
		Serveur_Composant  composant = createServeur_Composant();
		
		//3-affectation des port au composant
		composant.setReceive_request_port(receive_request_PortRequisCompo);
		composant.setAnswerrequest_portfournicompo(answerRequest_PortFourniCompo);
		
	
		
		//4-creation des liste de ports dans le composants
		PortFourniCompo[] portsFournis = new PortFourniCompo[1];
		portsFournis[0] = answerRequest_PortFourniCompo;
		
		PortRequisCompo[] portsRequis = new PortRequisCompo[1];
		portsRequis[0] = receive_request_PortRequisCompo;
		
		//5-affectation des listes
		composant.setPortfournicompo(portsFournis);
		composant.setPortrequiscompo(portsRequis);
		
		ServeurDetails_Configuration serveurDetails_Configuration = createServeurDetailPerso(composant);
		
		
		composant.setServeurdetails_configuration(serveurDetails_Configuration);
		Configuration[] configurations = new Configuration[1];
		configurations[0] = serveurDetails_Configuration;
		composant.setChildConfiguration(configurations);
		
		//Creation des bindings
		bindingRequisServeurConfig bindingRequisServeurConfig = createbindingRequisServeurConfig();
		BindingServeurFourniCompo bindingServeurFourniCompo = createBindingServeurFourniCompo();
		
		bindingRequisServeurConfig.setPortrequiscompo(receive_request_PortRequisCompo);
		bindingRequisServeurConfig.setPortrequisconfig(serveurDetails_Configuration.getReceiverequestrequisconfig());
		bindingRequisServeurConfig.setReceive_request_portrequiscompo(receive_request_PortRequisCompo);
		bindingRequisServeurConfig.setReceiverequestrequisconfig(serveurDetails_Configuration.getReceiverequestrequisconfig());
		
		bindingServeurFourniCompo.setAnswerrequest_portfourni(serveurDetails_Configuration.getAnswerrequest_portfourni());
		bindingServeurFourniCompo.setAnswerrequest_portfournicompo(answerRequest_PortFourniCompo);
		bindingServeurFourniCompo.setPortfournicompo(answerRequest_PortFourniCompo);
		bindingServeurFourniCompo.setPortfourniconfig(serveurDetails_Configuration.getAnswerrequest_portfourni());
		
		composant.setBindingrequisserveurconfig(bindingRequisServeurConfig);
		composant.setBindingserveurfournicompo(bindingServeurFourniCompo);
		
		LienBindingRequis[] bindingsRequis = new LienBindingRequis[1];
		bindingsRequis[0]=bindingRequisServeurConfig;
		LienBindingFourni[] bindingsFournis = new LienBindingFourni[1];
		bindingsFournis[0]= bindingServeurFourniCompo;
		
		composant.setLienbindingfourni(bindingsFournis);
		composant.setLienbindingrequis(bindingsRequis);
		
		return composant;
		
	}
	
	/**
	 * @generated NOT
	 */
	public Client_Composant createClientComposantPerso(Observer observer){
		
		//1-creation des ports
		Send_request_PortFourniCompo send_request_PortFourniCompo= createSend_request_PortFourniCompo();
		send_request_PortFourniCompo.setObserver(observer);
		AnswerRequest_PortRequisCompo answerRequest_PortRequisCompo = createAnswerRequest_PortRequisCompo();
		answerRequest_PortRequisCompo.setObserver(observer);
		ExternalPortFourniClientAnswerRequest externalPortFourniClientAnswerRequest = createExternalPortFourniClientAnswerRequest();
		externalPortFourniClientAnswerRequest.setObserver(observer);
		ExternalPortRequisClientSendRequest externalPortRequisClientSendRequest = createExternalPortRequisClientSendRequest();
		externalPortRequisClientSendRequest.setObserver(observer);
		
		//2- creation du composant
		Client_Composant  composant = createClient_Composant();
		
		//3-affectation des port au composant
		composant.setSend_request_port(send_request_PortFourniCompo);
		composant.setAnswerrequest_portrequiscompo(answerRequest_PortRequisCompo);
		composant.setExternalportfourniclientanswerrequest(externalPortFourniClientAnswerRequest);
		composant.setExternalportrequisclientsendrequest(externalPortRequisClientSendRequest);
		 
		//4-creation des liste de ports dans le composants
		PortFourniCompo[] portsFournis = new PortFourniCompo[2];
		portsFournis[0] = send_request_PortFourniCompo;
		portsFournis[1] = externalPortFourniClientAnswerRequest;
		
		PortRequisCompo[] portsRequis = new PortRequisCompo[2];
		portsRequis[0] = answerRequest_PortRequisCompo;
		portsRequis[1] = externalPortRequisClientSendRequest;
		
		//5-affectation des listes
		composant.setPortfournicompo(portsFournis);
		composant.setPortrequiscompo(portsRequis);
		
		return composant;
		
	}
	
	/**
	 * @generated NOT
	 */
	public RPC_ConnectorExplicite createSecurityRPCConnectorExplicitePerso(Observer observer){
		//1-creation des Roles
		called_RoleTo called_RoleTo = createcalled_RoleTo();
		caller_RoleFrom caller_RoleFrom = createcaller_RoleFrom();
		calledAnswer_RoleTo calledAnswer_RoleTo = createcalledAnswer_RoleTo();
		callerAnswer_RoleFrom callerAnswer_RoleFrom = createcallerAnswer_RoleFrom();
		
		called_RoleTo.setObserver(observer);
		caller_RoleFrom.setObserver(observer);
		calledAnswer_RoleTo.setObserver(observer);
		callerAnswer_RoleFrom.setObserver(observer);
		
		
		//2- creation du connecteur
		RPC_ConnectorExplicite  connector= createRPC_ConnectorExplicite();
		
		//3-affectation des roles au connector
		connector.setCalled_roleto(called_RoleTo);
		connector.setCaller_role(caller_RoleFrom);
		connector.setCalledanswer_roleto(calledAnswer_RoleTo);
		connector.setCalleranswer_rolefrom(callerAnswer_RoleFrom);
		
		//4-creation des liste des roles
		RoleTo[] rolesTo = new RoleTo[2];
		rolesTo[0] = called_RoleTo;
		rolesTo[1] = calledAnswer_RoleTo;
		
		RoleFrom[] rolesFrom = new RoleFrom[2];
		rolesFrom[0] = caller_RoleFrom;
		rolesFrom[1] = callerAnswer_RoleFrom;
		
		//5-affectation des listes
		connector.setRoleto(rolesTo);
		connector.setRolefrom(rolesFrom);
		
		return connector;
	}
	
	/**
	 * @generated NOT
	 */
	public Systeme_Configuration createSystemeConfigurationPerso(Observer observer){
		
		//0-creation de la config
		Systeme_Configuration configuration = createSysteme_Configuration();
		//1-creation des composants
		Client_Composant client_Composant = createClientComposantPerso(configuration);
		Serveur_Composant serveur_Composant = createServeurComposantPerso(configuration);
		
		//2-creation des connecteurs
		RPC_ConnectorExplicite rpc_ConnectorExplicite = createSecurityRPCConnectorExplicitePerso(configuration);
		
		
		//3-creation des liens d'attachements
		LienAttachementXAnswer attachementX1 = createLienAttachementXAnswer();
		attachementX1.setRolefrom(rpc_ConnectorExplicite.getCalleranswer_rolefrom());
		attachementX1.setPortfourni(serveur_Composant.getAnswerrequest_portfournicompo());
		attachementX1.setAnswerrequest_portfournicompo(serveur_Composant.getAnswerrequest_portfournicompo());
		attachementX1.setCalleranswer_rolefrom(rpc_ConnectorExplicite.getCalleranswer_rolefrom());
		LienAttachementXRequest attachementX2 = createLienAttachementXRequest();
		attachementX2.setCaller_rolefrom(rpc_ConnectorExplicite.getCaller_role());
		attachementX2.setW(client_Composant.getSend_request_port());
		attachementX2.setRolefrom(rpc_ConnectorExplicite.getCaller_role());
		attachementX2.setPortfourni(client_Composant.getSend_request_port());
		
		LienAttachementYAnswer attachementY1 = createLienAttachementYAnswer();
		attachementY1.setPortrequis(client_Composant.getAnswerrequest_portrequiscompo());
		attachementY1.setRoleto(rpc_ConnectorExplicite.getCalledanswer_roleto());
		attachementY1.setAnswerrequest_portrequiscompo(client_Composant.getAnswerrequest_portrequiscompo());
		attachementY1.setCalledanswer_roleto(rpc_ConnectorExplicite.getCalledanswer_roleto());
		LienAttachementYRequest attachementY2 = createLienAttachementYRequest();
		attachementY2.setPortrequis(serveur_Composant.getReceive_request_port());
		attachementY2.setRoleto(rpc_ConnectorExplicite.getCalled_roleto());
		attachementY2.setCalled_roleto(rpc_ConnectorExplicite.getCalled_roleto());
		attachementY2.setPortrequis(serveur_Composant.getReceive_request_port());
		
		configuration.setLienattachementx(attachementX2);
		configuration.setLienattachementxanswer(attachementX1);

		
		configuration.setLienattachementy(attachementY2);
		configuration.setLienattachementyanswer(attachementY1);

		
		LienAttachementPFRF[] lienspfrf = new LienAttachementPFRF[2];
		LienAttachementPRRT[] liensprrt = new LienAttachementPRRT[2];
		
		lienspfrf[0] = attachementX1;
		lienspfrf[1] = attachementX2;

		
		liensprrt[0] = attachementY1;
		liensprrt[1] = attachementY2;

		
		configuration.setLienattachementpfrf(lienspfrf);
		configuration.setLienattachementprrt(liensprrt);
		
		//4-creation des ports
		AnswerRequest_PortFourniConfig answerRequest_PortFourniConfig = createAnswerRequest_PortFourniConfig();
		SendRequest_PortRequisConfig sendRequest_PortRequisConfig = createSendRequest_PortRequisConfig();
		answerRequest_PortFourniConfig.setObserver(observer);
		sendRequest_PortRequisConfig.setObserver(observer);
		
		configuration.setAnswerrequest_portfourniconfig(answerRequest_PortFourniConfig);
		configuration.setSendrequest_portrequisconfig(sendRequest_PortRequisConfig);
		
		PortFourniConfig[] fournis = new PortFourniConfig[1];
		fournis[0] = answerRequest_PortFourniConfig;
		PortRequisConfig[] requis = new PortRequisConfig[1];
		requis[0] = sendRequest_PortRequisConfig;
		
		configuration.setPortfourniconfig(fournis);
		configuration.setPortrequisconfig(requis);
		
		//5-creation des liens binding
		ExternalBindingAnswerRequest externalBindingAnswerRequest = createExternalBindingAnswerRequest();
		ExternalBindingSendRequest externalBindingSendRequest = createExternalBindingSendRequest();
		
		externalBindingAnswerRequest.setAnswerrequest_portfourniconfig(answerRequest_PortFourniConfig);
		externalBindingAnswerRequest.setExternalportfourniclientanswerrequest(client_Composant.getExternalportfourniclientanswerrequest());
		externalBindingAnswerRequest.setPortfournicompo(client_Composant.getExternalportfourniclientanswerrequest());
		externalBindingAnswerRequest.setPortfourniconfig(answerRequest_PortFourniConfig);
		
		externalBindingSendRequest.setExternalportrequisclientsendrequest(client_Composant.getExternalportrequisclientsendrequest());
		externalBindingSendRequest.setPortrequiscompo(client_Composant.getExternalportrequisclientsendrequest());
		externalBindingSendRequest.setPortrequisconfig(sendRequest_PortRequisConfig);
		externalBindingSendRequest.setSendrequest_portrequisconfig(sendRequest_PortRequisConfig);
		
		LienBindingRequis[] bindingsRequis = new LienBindingRequis[1];
		bindingsRequis[0]=externalBindingSendRequest;
		LienBindingFourni[] bindingsFournis = new LienBindingFourni[1];
		bindingsFournis[0]= externalBindingAnswerRequest;
		
		configuration.setExternalbindinganswerrequest(externalBindingAnswerRequest);
		configuration.setExternalbindingsendrequest(externalBindingSendRequest);
		configuration.setLienbindingfourni(bindingsFournis);
		configuration.setLienbindingrequis(bindingsRequis);
		
		//6-lien avec la config
		configuration.setClient_composant(client_Composant);
		configuration.setServeur_composant(serveur_Composant);
		
		Composant[] childComposants = new Composant[2];
		childComposants[0] = client_Composant;
		childComposants[1] = serveur_Composant;
		
		configuration.setChildComposant(childComposants);
		//--------
		configuration.setRpc_connectorexplicite(rpc_ConnectorExplicite);

		
		Connecteur[] childConnecteurs= new Connecteur[1];
		childConnecteurs[0] = rpc_ConnectorExplicite;

		
		configuration.setChildConnecteur(childConnecteurs);
		
		return configuration;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HADLM1Package.SECURITY_CHECK_PORT_FOURNI: return createSecurityCheck_PortFourni();
			case HADLM1Package.EXTERNAL_SOCKET_PORT_FOURNI: return createExternalSocket_PortFourni();
			case HADLM1Package.LIEN_ATTACHEMENT_Y6: return createLienAttachementY6();
			case HADLM1Package.SERVEUR_COMPOSANT: return createServeur_Composant();
			case HADLM1Package.QUERY_INT_PORT_REQUIS: return createQueryInt_PortRequis();
			case HADLM1Package.LIEN_ATTACHEMENT_Y4: return createLienAttachementY4();
			case HADLM1Package.LIEN_ATTACHEMENT_X6: return createLienAttachementX6();
			case HADLM1Package.EXTERNAL_BINDING_SEND_REQUEST: return createExternalBindingSendRequest();
			case HADLM1Package.CLIENT_COMPOSANT: return createClient_Composant();
			case HADLM1Package.RECEIVE_REQUEST_PORT_REQUIS_COMPO: return createReceive_request_PortRequisCompo();
			case HADLM1Package.SEND_REQUEST_PORT_REQUIS_CONFIG: return createSendRequest_PortRequisConfig();
			case HADLM1Package.CLEARENCE_REQUEST_ROLE_TO: return createClearenceRequest_RoleTo();
			case HADLM1Package.SQL_REQUEST_CONNECTOR: return createSQLRequest_Connector();
			case HADLM1Package.SEND_REQUEST_PORT_FOURNI_COMPO: return createSend_request_PortFourniCompo();
			case HADLM1Package.SECURITY_MANAGEMENT_PORT_FOURNI: return createSecurityManagement_PortFourni();
			case HADLM1Package.LIEN_ATTACHEMENT_Y2: return createLienAttachementY2();
			case HADLM1Package.CALLER_ANSWER_ROLE_FROM: return createcallerAnswer_RoleFrom();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION: return createServeurDetails_Configuration();
			case HADLM1Package.SECURITY_AUTH_PORT_REQUIS: return createSecurityAuth_PortRequis();
			case HADLM1Package.ANSWER_REQUEST_PORT_REQUIS_COMPO: return createAnswerRequest_PortRequisCompo();
			case HADLM1Package.LIEN_ATTACHEMENT_Y1: return createLienAttachementY1();
			case HADLM1Package.RPC_CONNECTOR_EXPLICITE: return createRPC_ConnectorExplicite();
			case HADLM1Package.LIEN_ATTACHEMENT_Y3: return createLienAttachementY3();
			case HADLM1Package.BINDING_SERVEUR_FOURNI_COMPO: return createBindingServeurFourniCompo();
			case HADLM1Package.QUERY_INT_PORT_FOURNI: return createQueryInt_PortFourni();
			case HADLM1Package.CALLED_ROLE_TO: return createcalled_RoleTo();
			case HADLM1Package.CLEARENCE_REQUEST_CONNECTOR: return createClearenceRequest_Connector();
			case HADLM1Package.LIEN_ATTACHEMENT_XREQUEST: return createLienAttachementXRequest();
			case HADLM1Package.SECURITY_AUTH_PORT_FOURNI: return createSecurityAuth_PortFourni();
			case HADLM1Package.ANSWER_REQUEST_PORT_FOURNI: return createAnswerRequest_PortFourni();
			case HADLM1Package.SECURITY_QUERY_CONNECTOR: return createSecurityQuery_Connector();
			case HADLM1Package.EXTERNAL_SOCKET_PORT_REQUIS: return createExternalSocket_PortRequis();
			case HADLM1Package.CLEARENCE_REQUEST_ROLE_FROM: return createClearenceRequest_RoleFrom();
			case HADLM1Package.DB_QUERY_PORT_FOURNI: return createDBQuery_PortFourni();
			case HADLM1Package.DB_QUERY_PORT_REQUIS: return createDBQuery_PortRequis();
			case HADLM1Package.BINDING_SERVEUR_FOURNI: return createBindingServeurFOurni();
			case HADLM1Package.LIEN_ATTACHEMENT_YANSWER: return createLienAttachementYAnswer();
			case HADLM1Package.CALLED_ANSWER_ROLE_TO: return createcalledAnswer_RoleTo();
			case HADLM1Package.SECURITY_CHECK_PORT_REQUIS: return createSecurityCheck_PortRequis();
			case HADLM1Package.SQL_REQUEST_ROLE_FROM: return createSQLRequest_RoleFrom();
			case HADLM1Package.ANSWER_REQUEST_PORT_FOURNI_CONFIG: return createAnswerRequest_PortFourniConfig();
			case HADLM1Package.CALLER_ROLE_FROM: return createcaller_RoleFrom();
			case HADLM1Package.LIEN_ATTACHEMENT_X1: return createLienAttachementX1();
			case HADLM1Package.CQUERY_PORT_REQUIS: return createCQuery_PortRequis();
			case HADLM1Package.SQL_REQUEST_ROLE_TO: return createSQLRequest_RoleTo();
			case HADLM1Package.SECURITY_QUERY_ROLE_TO: return createSecurityQuery_RoleTo();
			case HADLM1Package.LIEN_ATTACHEMENT_X3: return createLienAttachementX3();
			case HADLM1Package.SECURITY_QUERY_ROLE_FROM: return createSecurityQuery_RoleFrom();
			case HADLM1Package.ANSWER_REQUEST_PORT_FOURNI_COMPO: return createAnswerRequest_PortFourniCompo();
			case HADLM1Package.LIEN_ATTACHEMENT_Y5: return createLienAttachementY5();
			case HADLM1Package.SECURITY_MANAGER_COMPOSANT: return createSecurityManager_Composant();
			case HADLM1Package.CONNECTION_MANAGER_COMPOSANT: return createConnectionManager_Composant();
			case HADLM1Package.BINDING_REQUIS_SERVEUR_CONFIG: return createbindingRequisServeurConfig();
			case HADLM1Package.SECURITY_MANAGEMENT_PORT_REQUIS: return createSecurityManagement_PortRequis();
			case HADLM1Package.LIEN_ATTACHEMENT_X2: return createLienAttachementX2();
			case HADLM1Package.LIEN_ATTACHEMENT_YREQUEST: return createLienAttachementYRequest();
			case HADLM1Package.SYSTEME_CONFIGURATION: return createSysteme_Configuration();
			case HADLM1Package.LIEN_ATTACHEMENT_XANSWER: return createLienAttachementXAnswer();
			case HADLM1Package.BINDING_REQUIS_SERVEUR_DETAILS: return createbindingRequisServeurDetails();
			case HADLM1Package.LIEN_ATTACHEMENT_X4: return createLienAttachementX4();
			case HADLM1Package.DATABASE_COMPOSANT: return createDatabase_Composant();
			case HADLM1Package.CQUERY_PORT_FOURNI: return createCQuery_PortFourni();
			case HADLM1Package.LIEN_ATTACHEMENT_X5: return createLienAttachementX5();
			case HADLM1Package.RECEIVE_REQUEST_REQUIS_CONFIG: return createReceiveRequestRequisConfig();
			case HADLM1Package.EXTERNAL_BINDING_ANSWER_REQUEST: return createExternalBindingAnswerRequest();
			case HADLM1Package.EXTERNAL_PORT_REQUIS_CLIENT_SEND_REQUEST: return createExternalPortRequisClientSendRequest();
			case HADLM1Package.EXTERNAL_PORT_FOURNI_CLIENT_ANSWER_REQUEST: return createExternalPortFourniClientAnswerRequest();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityCheck_PortFourni createSecurityCheck_PortFourni() {
		SecurityCheck_PortFourni securityCheck_PortFourni = new SecurityCheck_PortFourni();
		return securityCheck_PortFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalSocket_PortFourni createExternalSocket_PortFourni() {
		ExternalSocket_PortFourni externalSocket_PortFourni = new ExternalSocket_PortFourni();
		return externalSocket_PortFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementY6 createLienAttachementY6() {
		LienAttachementY6 lienAttachementY6 = new LienAttachementY6();
		return lienAttachementY6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serveur_Composant createServeur_Composant() {
		Serveur_Composant serveur_Composant = new Serveur_Composant();
		return serveur_Composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryInt_PortRequis createQueryInt_PortRequis() {
		QueryInt_PortRequis queryInt_PortRequis = new QueryInt_PortRequis();
		return queryInt_PortRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementY4 createLienAttachementY4() {
		LienAttachementY4 lienAttachementY4 = new LienAttachementY4();
		return lienAttachementY4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementX6 createLienAttachementX6() {
		LienAttachementX6 lienAttachementX6 = new LienAttachementX6();
		return lienAttachementX6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalBindingSendRequest createExternalBindingSendRequest() {
		ExternalBindingSendRequest externalBindingSendRequest = new ExternalBindingSendRequest();
		return externalBindingSendRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client_Composant createClient_Composant() {
		Client_Composant client_Composant = new Client_Composant();
		return client_Composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receive_request_PortRequisCompo createReceive_request_PortRequisCompo() {
		Receive_request_PortRequisCompo receive_request_PortRequisCompo = new Receive_request_PortRequisCompo();
		return receive_request_PortRequisCompo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendRequest_PortRequisConfig createSendRequest_PortRequisConfig() {
		SendRequest_PortRequisConfig sendRequest_PortRequisConfig = new SendRequest_PortRequisConfig();
		return sendRequest_PortRequisConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearenceRequest_RoleTo createClearenceRequest_RoleTo() {
		ClearenceRequest_RoleTo clearenceRequest_RoleTo = new ClearenceRequest_RoleTo();
		return clearenceRequest_RoleTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLRequest_Connector createSQLRequest_Connector() {
		SQLRequest_Connector sqlRequest_Connector = new SQLRequest_Connector();
		return sqlRequest_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Send_request_PortFourniCompo createSend_request_PortFourniCompo() {
		Send_request_PortFourniCompo send_request_PortFourniCompo = new Send_request_PortFourniCompo();
		return send_request_PortFourniCompo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityManagement_PortFourni createSecurityManagement_PortFourni() {
		SecurityManagement_PortFourni securityManagement_PortFourni = new SecurityManagement_PortFourni();
		return securityManagement_PortFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementY2 createLienAttachementY2() {
		LienAttachementY2 lienAttachementY2 = new LienAttachementY2();
		return lienAttachementY2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public callerAnswer_RoleFrom createcallerAnswer_RoleFrom() {
		callerAnswer_RoleFrom callerAnswer_RoleFrom = new callerAnswer_RoleFrom();
		return callerAnswer_RoleFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServeurDetails_Configuration createServeurDetails_Configuration() {
		ServeurDetails_Configuration serveurDetails_Configuration = new ServeurDetails_Configuration();
		return serveurDetails_Configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityAuth_PortRequis createSecurityAuth_PortRequis() {
		SecurityAuth_PortRequis securityAuth_PortRequis = new SecurityAuth_PortRequis();
		return securityAuth_PortRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerRequest_PortRequisCompo createAnswerRequest_PortRequisCompo() {
		AnswerRequest_PortRequisCompo answerRequest_PortRequisCompo = new AnswerRequest_PortRequisCompo();
		return answerRequest_PortRequisCompo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementY1 createLienAttachementY1() {
		LienAttachementY1 lienAttachementY1 = new LienAttachementY1();
		return lienAttachementY1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPC_ConnectorExplicite createRPC_ConnectorExplicite() {
		RPC_ConnectorExplicite rpC_ConnectorExplicite = new RPC_ConnectorExplicite();
		return rpC_ConnectorExplicite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementY3 createLienAttachementY3() {
		LienAttachementY3 lienAttachementY3 = new LienAttachementY3();
		return lienAttachementY3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingServeurFourniCompo createBindingServeurFourniCompo() {
		BindingServeurFourniCompo bindingServeurFourniCompo = new BindingServeurFourniCompo();
		return bindingServeurFourniCompo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryInt_PortFourni createQueryInt_PortFourni() {
		QueryInt_PortFourni queryInt_PortFourni = new QueryInt_PortFourni();
		return queryInt_PortFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public called_RoleTo createcalled_RoleTo() {
		called_RoleTo called_RoleTo = new called_RoleTo();
		return called_RoleTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearenceRequest_Connector createClearenceRequest_Connector() {
		ClearenceRequest_Connector clearenceRequest_Connector = new ClearenceRequest_Connector();
		return clearenceRequest_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementXRequest createLienAttachementXRequest() {
		LienAttachementXRequest lienAttachementXRequest = new LienAttachementXRequest();
		return lienAttachementXRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityAuth_PortFourni createSecurityAuth_PortFourni() {
		SecurityAuth_PortFourni securityAuth_PortFourni = new SecurityAuth_PortFourni();
		return securityAuth_PortFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerRequest_PortFourni createAnswerRequest_PortFourni() {
		AnswerRequest_PortFourni answerRequest_PortFourni = new AnswerRequest_PortFourni();
		return answerRequest_PortFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityQuery_Connector createSecurityQuery_Connector() {
		SecurityQuery_Connector securityQuery_Connector = new SecurityQuery_Connector();
		return securityQuery_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalSocket_PortRequis createExternalSocket_PortRequis() {
		ExternalSocket_PortRequis externalSocket_PortRequis = new ExternalSocket_PortRequis();
		return externalSocket_PortRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearenceRequest_RoleFrom createClearenceRequest_RoleFrom() {
		ClearenceRequest_RoleFrom clearenceRequest_RoleFrom = new ClearenceRequest_RoleFrom();
		return clearenceRequest_RoleFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBQuery_PortFourni createDBQuery_PortFourni() {
		DBQuery_PortFourni dbQuery_PortFourni = new DBQuery_PortFourni();
		return dbQuery_PortFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBQuery_PortRequis createDBQuery_PortRequis() {
		DBQuery_PortRequis dbQuery_PortRequis = new DBQuery_PortRequis();
		return dbQuery_PortRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingServeurFOurni createBindingServeurFOurni() {
		BindingServeurFOurni bindingServeurFOurni = new BindingServeurFOurni();
		return bindingServeurFOurni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementYAnswer createLienAttachementYAnswer() {
		LienAttachementYAnswer lienAttachementYAnswer = new LienAttachementYAnswer();
		return lienAttachementYAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public calledAnswer_RoleTo createcalledAnswer_RoleTo() {
		calledAnswer_RoleTo calledAnswer_RoleTo = new calledAnswer_RoleTo();
		return calledAnswer_RoleTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityCheck_PortRequis createSecurityCheck_PortRequis() {
		SecurityCheck_PortRequis securityCheck_PortRequis = new SecurityCheck_PortRequis();
		return securityCheck_PortRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLRequest_RoleFrom createSQLRequest_RoleFrom() {
		SQLRequest_RoleFrom sqlRequest_RoleFrom = new SQLRequest_RoleFrom();
		return sqlRequest_RoleFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerRequest_PortFourniConfig createAnswerRequest_PortFourniConfig() {
		AnswerRequest_PortFourniConfig answerRequest_PortFourniConfig = new AnswerRequest_PortFourniConfig();
		return answerRequest_PortFourniConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public caller_RoleFrom createcaller_RoleFrom() {
		caller_RoleFrom caller_RoleFrom = new caller_RoleFrom();
		return caller_RoleFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementX1 createLienAttachementX1() {
		LienAttachementX1 lienAttachementX1 = new LienAttachementX1();
		return lienAttachementX1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CQuery_PortRequis createCQuery_PortRequis() {
		CQuery_PortRequis cQuery_PortRequis = new CQuery_PortRequis();
		return cQuery_PortRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLRequest_RoleTo createSQLRequest_RoleTo() {
		SQLRequest_RoleTo sqlRequest_RoleTo = new SQLRequest_RoleTo();
		return sqlRequest_RoleTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityQuery_RoleTo createSecurityQuery_RoleTo() {
		SecurityQuery_RoleTo securityQuery_RoleTo = new SecurityQuery_RoleTo();
		return securityQuery_RoleTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementX3 createLienAttachementX3() {
		LienAttachementX3 lienAttachementX3 = new LienAttachementX3();
		return lienAttachementX3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityQuery_RoleFrom createSecurityQuery_RoleFrom() {
		SecurityQuery_RoleFrom securityQuery_RoleFrom = new SecurityQuery_RoleFrom();
		return securityQuery_RoleFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerRequest_PortFourniCompo createAnswerRequest_PortFourniCompo() {
		AnswerRequest_PortFourniCompo answerRequest_PortFourniCompo = new AnswerRequest_PortFourniCompo();
		return answerRequest_PortFourniCompo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementY5 createLienAttachementY5() {
		LienAttachementY5 lienAttachementY5 = new LienAttachementY5();
		return lienAttachementY5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityManager_Composant createSecurityManager_Composant() {
		SecurityManager_Composant securityManager_Composant = new SecurityManager_Composant();
		return securityManager_Composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionManager_Composant createConnectionManager_Composant() {
		ConnectionManager_Composant connectionManager_Composant = new ConnectionManager_Composant();
		return connectionManager_Composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public bindingRequisServeurConfig createbindingRequisServeurConfig() {
		bindingRequisServeurConfig bindingRequisServeurConfig = new bindingRequisServeurConfig();
		return bindingRequisServeurConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityManagement_PortRequis createSecurityManagement_PortRequis() {
		SecurityManagement_PortRequis securityManagement_PortRequis = new SecurityManagement_PortRequis();
		return securityManagement_PortRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementX2 createLienAttachementX2() {
		LienAttachementX2 lienAttachementX2 = new LienAttachementX2();
		return lienAttachementX2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementYRequest createLienAttachementYRequest() {
		LienAttachementYRequest lienAttachementYRequest = new LienAttachementYRequest();
		return lienAttachementYRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Systeme_Configuration createSysteme_Configuration() {
		Systeme_Configuration systeme_Configuration = new Systeme_Configuration();
		return systeme_Configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementXAnswer createLienAttachementXAnswer() {
		LienAttachementXAnswer lienAttachementXAnswer = new LienAttachementXAnswer();
		return lienAttachementXAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public bindingRequisServeurDetails createbindingRequisServeurDetails() {
		bindingRequisServeurDetails bindingRequisServeurDetails = new bindingRequisServeurDetails();
		return bindingRequisServeurDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementX4 createLienAttachementX4() {
		LienAttachementX4 lienAttachementX4 = new LienAttachementX4();
		return lienAttachementX4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database_Composant createDatabase_Composant() {
		Database_Composant database_Composant = new Database_Composant();
		return database_Composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CQuery_PortFourni createCQuery_PortFourni() {
		CQuery_PortFourni cQuery_PortFourni = new CQuery_PortFourni();
		return cQuery_PortFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementX5 createLienAttachementX5() {
		LienAttachementX5 lienAttachementX5 = new LienAttachementX5();
		return lienAttachementX5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveRequestRequisConfig createReceiveRequestRequisConfig() {
		ReceiveRequestRequisConfig receiveRequestRequisConfig = new ReceiveRequestRequisConfig();
		return receiveRequestRequisConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalBindingAnswerRequest createExternalBindingAnswerRequest() {
		ExternalBindingAnswerRequest externalBindingAnswerRequest = new ExternalBindingAnswerRequest();
		return externalBindingAnswerRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalPortRequisClientSendRequest createExternalPortRequisClientSendRequest() {
		ExternalPortRequisClientSendRequest externalPortRequisClientSendRequest = new ExternalPortRequisClientSendRequest();
		return externalPortRequisClientSendRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalPortFourniClientAnswerRequest createExternalPortFourniClientAnswerRequest() {
		ExternalPortFourniClientAnswerRequest externalPortFourniClientAnswerRequest = new ExternalPortFourniClientAnswerRequest();
		return externalPortFourniClientAnswerRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HADLM1Package getHADLM1Package() {
		return (HADLM1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HADLM1Package getPackage() {
		return HADLM1Package.eINSTANCE;
	}

} //HADLM1Factory
