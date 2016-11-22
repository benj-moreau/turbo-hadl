/**
 */
package hADL.Configuration;

import hADL.Composant.ComposantPackage;

import hADL.Connecteurs.ConnecteursPackage;

import hADL.HADLPackage;

import hADL.Interfaces.InterfacesPackage;

import hADL.Liens.LiensPackage;

import hADL.Roles.RolesPackage;

import hADLM1.HADLM1Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see hADL.Configuration.ConfigurationFactory
 * @generated
 */
public class ConfigurationPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "Configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "Configuration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "com.alma";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ConfigurationPackage eINSTANCE = hADL.Configuration.ConfigurationPackage.init();

	/**
	 * The meta object id for the '{@link hADL.Configuration.Configuration <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Configuration.Configuration
	 * @see hADL.Configuration.ConfigurationPackage#getConfiguration()
	 * @generated
	 */
	public static final int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Child Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION__CHILD_CONFIGURATION = HADLPackage.ELEMENT__CHILD_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Child Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION__CHILD_COMPOSANT = HADLPackage.ELEMENT__CHILD_COMPOSANT;

	/**
	 * The feature id for the '<em><b>Child Connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION__CHILD_CONNECTEUR = HADLPackage.ELEMENT__CHILD_CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Portrequisconfig</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION__PORTREQUISCONFIG = HADLPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portfourniconfig</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION__PORTFOURNICONFIG = HADLPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lienbindingrequis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION__LIENBINDINGREQUIS = HADLPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lienbindingfourni</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION__LIENBINDINGFOURNI = HADLPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lienattachementprrt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION__LIENATTACHEMENTPRRT = HADLPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lienattachementpfrf</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION__LIENATTACHEMENTPFRF = HADLPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION_FEATURE_COUNT = HADLPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT = HADLPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Action Via Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION___ACTION_VIA_ROLE__ROLETO_OBJECT = HADLPackage.ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT = HADLPackage.ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT = HADLPackage.ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT = HADLPackage.ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION_OPERATION_COUNT = HADLPackage.ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link hADL.Configuration.Observer <em>Observer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Configuration.Observer
	 * @see hADL.Configuration.ConfigurationPackage#getObserver()
	 * @generated
	 */
	public static final int OBSERVER = 1;

	/**
	 * The number of structural features of the '<em>Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVER_FEATURE_COUNT = HADLPackage.OBJET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVER___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT = HADLPackage.OBJET_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Action Via Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVER___ACTION_VIA_ROLE__ROLETO_OBJECT = HADLPackage.OBJET_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVER___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT = HADLPackage.OBJET_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVER___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT = HADLPackage.OBJET_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Action Via Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVER___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT = HADLPackage.OBJET_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVER_OPERATION_COUNT = HADLPackage.OBJET_OPERATION_COUNT + 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observerEClass = null;

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
	 * @see hADL.Configuration.ConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigurationPackage() {
		super(eNS_URI, ConfigurationFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link ConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigurationPackage init() {
		if (isInited) return (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfigurationPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfigurationPackage());

		isInited = true;

		// Obtain or create and register interdependencies
		HADLM1Package theHADLM1Package = (HADLM1Package)(EPackage.Registry.INSTANCE.getEPackage(HADLM1Package.eNS_URI) instanceof HADLM1Package ? EPackage.Registry.INSTANCE.getEPackage(HADLM1Package.eNS_URI) : HADLM1Package.eINSTANCE);
		HADLPackage theHADLPackage = (HADLPackage)(EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI) instanceof HADLPackage ? EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI) : HADLPackage.eINSTANCE);
		ConnecteursPackage theConnecteursPackage = (ConnecteursPackage)(EPackage.Registry.INSTANCE.getEPackage(ConnecteursPackage.eNS_URI) instanceof ConnecteursPackage ? EPackage.Registry.INSTANCE.getEPackage(ConnecteursPackage.eNS_URI) : ConnecteursPackage.eINSTANCE);
		ComposantPackage theComposantPackage = (ComposantPackage)(EPackage.Registry.INSTANCE.getEPackage(ComposantPackage.eNS_URI) instanceof ComposantPackage ? EPackage.Registry.INSTANCE.getEPackage(ComposantPackage.eNS_URI) : ComposantPackage.eINSTANCE);
		LiensPackage theLiensPackage = (LiensPackage)(EPackage.Registry.INSTANCE.getEPackage(LiensPackage.eNS_URI) instanceof LiensPackage ? EPackage.Registry.INSTANCE.getEPackage(LiensPackage.eNS_URI) : LiensPackage.eINSTANCE);
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)(EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI) instanceof InterfacesPackage ? EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI) : InterfacesPackage.eINSTANCE);
		RolesPackage theRolesPackage = (RolesPackage)(EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI) instanceof RolesPackage ? EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI) : RolesPackage.eINSTANCE);

		// Create package meta-data objects
		theConfigurationPackage.createPackageContents();
		theHADLM1Package.createPackageContents();
		theHADLPackage.createPackageContents();
		theConnecteursPackage.createPackageContents();
		theComposantPackage.createPackageContents();
		theLiensPackage.createPackageContents();
		theInterfacesPackage.createPackageContents();
		theRolesPackage.createPackageContents();

		// Initialize created meta-data
		theConfigurationPackage.initializePackageContents();
		theHADLM1Package.initializePackageContents();
		theHADLPackage.initializePackageContents();
		theConnecteursPackage.initializePackageContents();
		theComposantPackage.initializePackageContents();
		theLiensPackage.initializePackageContents();
		theInterfacesPackage.initializePackageContents();
		theRolesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigurationPackage.eNS_URI, theConfigurationPackage);
		return theConfigurationPackage;
	}


	/**
	 * Returns the meta object for class '{@link hADL.Configuration.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see hADL.Configuration.Configuration
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link hADL.Configuration.Configuration#getPortrequisconfigList <em>Portrequisconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portrequisconfig</em>'.
	 * @see hADL.Configuration.Configuration#getPortrequisconfigList()
	 * @see #getConfiguration()
	 * @generated
	 */
	public EReference getConfiguration_Portrequisconfig() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link hADL.Configuration.Configuration#getPortfourniconfigList <em>Portfourniconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portfourniconfig</em>'.
	 * @see hADL.Configuration.Configuration#getPortfourniconfigList()
	 * @see #getConfiguration()
	 * @generated
	 */
	public EReference getConfiguration_Portfourniconfig() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link hADL.Configuration.Configuration#getLienbindingrequisList <em>Lienbindingrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lienbindingrequis</em>'.
	 * @see hADL.Configuration.Configuration#getLienbindingrequisList()
	 * @see #getConfiguration()
	 * @generated
	 */
	public EReference getConfiguration_Lienbindingrequis() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link hADL.Configuration.Configuration#getLienbindingfourniList <em>Lienbindingfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lienbindingfourni</em>'.
	 * @see hADL.Configuration.Configuration#getLienbindingfourniList()
	 * @see #getConfiguration()
	 * @generated
	 */
	public EReference getConfiguration_Lienbindingfourni() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link hADL.Configuration.Configuration#getLienattachementprrtList <em>Lienattachementprrt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lienattachementprrt</em>'.
	 * @see hADL.Configuration.Configuration#getLienattachementprrtList()
	 * @see #getConfiguration()
	 * @generated
	 */
	public EReference getConfiguration_Lienattachementprrt() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link hADL.Configuration.Configuration#getLienattachementpfrfList <em>Lienattachementpfrf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lienattachementpfrf</em>'.
	 * @see hADL.Configuration.Configuration#getLienattachementpfrfList()
	 * @see #getConfiguration()
	 * @generated
	 */
	public EReference getConfiguration_Lienattachementpfrf() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for class '{@link hADL.Configuration.Observer <em>Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observer</em>'.
	 * @see hADL.Configuration.Observer
	 * @generated
	 */
	public EClass getObserver() {
		return observerEClass;
	}

	/**
	 * Returns the meta object for the '{@link hADL.Configuration.Observer#actionViaPort(hADL.Interfaces.PortFourniConfig, java.lang.Object) <em>Action Via Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Action Via Port</em>' operation.
	 * @see hADL.Configuration.Observer#actionViaPort(hADL.Interfaces.PortFourniConfig, java.lang.Object)
	 * @generated
	 */
	public EOperation getObserver__ActionViaPort__PortFourniConfig_Object() {
		return observerEClass.getEOperations().get(0);
	}


	/**
	 * Returns the meta object for the '{@link hADL.Configuration.Observer#actionViaRole(hADL.Roles.RoleTo, java.lang.Object) <em>Action Via Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Action Via Role</em>' operation.
	 * @see hADL.Configuration.Observer#actionViaRole(hADL.Roles.RoleTo, java.lang.Object)
	 * @generated
	 */
	public EOperation getObserver__ActionViaRole__RoleTo_Object() {
		return observerEClass.getEOperations().get(1);
	}


	/**
	 * Returns the meta object for the '{@link hADL.Configuration.Observer#actionViaPort(hADL.Interfaces.PortRequisCompo, java.lang.Object) <em>Action Via Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Action Via Port</em>' operation.
	 * @see hADL.Configuration.Observer#actionViaPort(hADL.Interfaces.PortRequisCompo, java.lang.Object)
	 * @generated
	 */
	public EOperation getObserver__ActionViaPort__PortRequisCompo_Object() {
		return observerEClass.getEOperations().get(2);
	}


	/**
	 * Returns the meta object for the '{@link hADL.Configuration.Observer#actionViaPort(hADL.Interfaces.PortRequisConfig, java.lang.Object) <em>Action Via Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Action Via Port</em>' operation.
	 * @see hADL.Configuration.Observer#actionViaPort(hADL.Interfaces.PortRequisConfig, java.lang.Object)
	 * @generated
	 */
	public EOperation getObserver__ActionViaPort__PortRequisConfig_Object() {
		return observerEClass.getEOperations().get(3);
	}


	/**
	 * Returns the meta object for the '{@link hADL.Configuration.Observer#actionViaPort(hADL.Interfaces.PortFourniCompo, java.lang.Object) <em>Action Via Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Action Via Port</em>' operation.
	 * @see hADL.Configuration.Observer#actionViaPort(hADL.Interfaces.PortFourniCompo, java.lang.Object)
	 * @generated
	 */
	public EOperation getObserver__ActionViaPort__PortFourniCompo_Object() {
		return observerEClass.getEOperations().get(4);
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public ConfigurationFactory getConfigurationFactory() {
		return (ConfigurationFactory)getEFactoryInstance();
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
		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__PORTREQUISCONFIG);
		createEReference(configurationEClass, CONFIGURATION__PORTFOURNICONFIG);
		createEReference(configurationEClass, CONFIGURATION__LIENBINDINGREQUIS);
		createEReference(configurationEClass, CONFIGURATION__LIENBINDINGFOURNI);
		createEReference(configurationEClass, CONFIGURATION__LIENATTACHEMENTPRRT);
		createEReference(configurationEClass, CONFIGURATION__LIENATTACHEMENTPFRF);

		observerEClass = createEClass(OBSERVER);
		createEOperation(observerEClass, OBSERVER___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT);
		createEOperation(observerEClass, OBSERVER___ACTION_VIA_ROLE__ROLETO_OBJECT);
		createEOperation(observerEClass, OBSERVER___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT);
		createEOperation(observerEClass, OBSERVER___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT);
		createEOperation(observerEClass, OBSERVER___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT);
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
		HADLPackage theHADLPackage = (HADLPackage)EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI);
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		LiensPackage theLiensPackage = (LiensPackage)EPackage.Registry.INSTANCE.getEPackage(LiensPackage.eNS_URI);
		RolesPackage theRolesPackage = (RolesPackage)EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		configurationEClass.getESuperTypes().add(theHADLPackage.getElement());
		configurationEClass.getESuperTypes().add(this.getObserver());
		observerEClass.getESuperTypes().add(theHADLPackage.getObjet());

		// Initialize classes, features, and operations; add parameters
		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Portrequisconfig(), theInterfacesPackage.getPortRequisConfig(), null, "portrequisconfig", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Portfourniconfig(), theInterfacesPackage.getPortFourniConfig(), null, "portfourniconfig", null, 1, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Lienbindingrequis(), theLiensPackage.getLienBindingRequis(), null, "lienbindingrequis", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Lienbindingfourni(), theLiensPackage.getLienBindingFourni(), null, "lienbindingfourni", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Lienattachementprrt(), theLiensPackage.getLienAttachementPRRT(), null, "lienattachementprrt", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Lienattachementpfrf(), theLiensPackage.getLienAttachementPFRF(), null, "lienattachementpfrf", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observerEClass, Observer.class, "Observer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getObserver__ActionViaPort__PortFourniConfig_Object(), null, "actionViaPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInterfacesPackage.getPortFourniConfig(), "port", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObserver__ActionViaRole__RoleTo_Object(), null, "actionViaRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRolesPackage.getRoleTo(), "role", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObserver__ActionViaPort__PortRequisCompo_Object(), null, "actionViaPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInterfacesPackage.getPortRequisCompo(), "port", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObserver__ActionViaPort__PortRequisConfig_Object(), null, "actionViaPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInterfacesPackage.getPortRequisConfig(), "port", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObserver__ActionViaPort__PortFourniCompo_Object(), null, "actionViaPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theInterfacesPackage.getPortFourniCompo(), "port", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);
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
		 * The meta object literal for the '{@link hADL.Configuration.Configuration <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Configuration.Configuration
		 * @see hADL.Configuration.ConfigurationPackage#getConfiguration()
		 * @generated
		 */
		public static final EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Portrequisconfig</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONFIGURATION__PORTREQUISCONFIG = eINSTANCE.getConfiguration_Portrequisconfig();

		/**
		 * The meta object literal for the '<em><b>Portfourniconfig</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONFIGURATION__PORTFOURNICONFIG = eINSTANCE.getConfiguration_Portfourniconfig();

		/**
		 * The meta object literal for the '<em><b>Lienbindingrequis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONFIGURATION__LIENBINDINGREQUIS = eINSTANCE.getConfiguration_Lienbindingrequis();

		/**
		 * The meta object literal for the '<em><b>Lienbindingfourni</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONFIGURATION__LIENBINDINGFOURNI = eINSTANCE.getConfiguration_Lienbindingfourni();

		/**
		 * The meta object literal for the '<em><b>Lienattachementprrt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONFIGURATION__LIENATTACHEMENTPRRT = eINSTANCE.getConfiguration_Lienattachementprrt();

		/**
		 * The meta object literal for the '<em><b>Lienattachementpfrf</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONFIGURATION__LIENATTACHEMENTPFRF = eINSTANCE.getConfiguration_Lienattachementpfrf();

		/**
		 * The meta object literal for the '{@link hADL.Configuration.Observer <em>Observer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Configuration.Observer
		 * @see hADL.Configuration.ConfigurationPackage#getObserver()
		 * @generated
		 */
		public static final EClass OBSERVER = eINSTANCE.getObserver();

		/**
		 * The meta object literal for the '<em><b>Action Via Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation OBSERVER___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT = eINSTANCE.getObserver__ActionViaPort__PortFourniConfig_Object();

		/**
		 * The meta object literal for the '<em><b>Action Via Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation OBSERVER___ACTION_VIA_ROLE__ROLETO_OBJECT = eINSTANCE.getObserver__ActionViaRole__RoleTo_Object();

		/**
		 * The meta object literal for the '<em><b>Action Via Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation OBSERVER___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT = eINSTANCE.getObserver__ActionViaPort__PortRequisCompo_Object();

		/**
		 * The meta object literal for the '<em><b>Action Via Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation OBSERVER___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT = eINSTANCE.getObserver__ActionViaPort__PortRequisConfig_Object();

		/**
		 * The meta object literal for the '<em><b>Action Via Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation OBSERVER___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT = eINSTANCE.getObserver__ActionViaPort__PortFourniCompo_Object();

	}

} //ConfigurationPackage
