/**
 */
package hADL.Interfaces;

import hADL.Composant.ComposantPackage;

import hADL.Configuration.ConfigurationPackage;

import hADL.Connecteurs.ConnecteursPackage;

import hADL.HADLPackage;

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
 * @see hADL.Interfaces.InterfacesFactory
 * @generated
 */
public class InterfacesPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "Interfaces";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "Interfaces";

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
	public static final InterfacesPackage eINSTANCE = hADL.Interfaces.InterfacesPackage.init();

	/**
	 * The meta object id for the '{@link hADL.Interfaces.Interface <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Interfaces.Interface
	 * @see hADL.Interfaces.InterfacesPackage#getInterface()
	 * @generated
	 */
	public static final int INTERFACE = 5;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_FEATURE_COUNT = HADLPackage.OBJET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE___NOTIFY_CONFIG__OBJECT = HADLPackage.OBJET_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_OPERATION_COUNT = HADLPackage.OBJET_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link hADL.Interfaces.Port <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Interfaces.Port
	 * @see hADL.Interfaces.InterfacesPackage#getPort()
	 * @generated
	 */
	public static final int PORT = 2;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT__OBSERVER = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT___NOTIFY_CONFIG__OBJECT = INTERFACE___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Interfaces.PortFourniCompo <em>Port Fourni Compo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Interfaces.PortFourniCompo
	 * @see hADL.Interfaces.InterfacesPackage#getPortFourniCompo()
	 * @generated
	 */
	public static final int PORT_FOURNI_COMPO = 0;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT_FOURNI_COMPO__OBSERVER = PORT__OBSERVER;

	/**
	 * The number of structural features of the '<em>Port Fourni Compo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT_FOURNI_COMPO_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT_FOURNI_COMPO___NOTIFY_CONFIG__OBJECT = PORT___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Port Fourni Compo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT_FOURNI_COMPO_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Interfaces.PortRequisConfig <em>Port Requis Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Interfaces.PortRequisConfig
	 * @see hADL.Interfaces.InterfacesPackage#getPortRequisConfig()
	 * @generated
	 */
	public static final int PORT_REQUIS_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT_REQUIS_CONFIG__OBSERVER = PORT__OBSERVER;

	/**
	 * The number of structural features of the '<em>Port Requis Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT_REQUIS_CONFIG_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT_REQUIS_CONFIG___NOTIFY_CONFIG__OBJECT = PORT___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Port Requis Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT_REQUIS_CONFIG_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Interfaces.Service <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Interfaces.Service
	 * @see hADL.Interfaces.InterfacesPackage#getService()
	 * @generated
	 */
	public static final int SERVICE = 6;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE___NOTIFY_CONFIG__OBJECT = INTERFACE___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Interfaces.ServiceRequis <em>Service Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Interfaces.ServiceRequis
	 * @see hADL.Interfaces.InterfacesPackage#getServiceRequis()
	 * @generated
	 */
	public static final int SERVICE_REQUIS = 3;

	/**
	 * The number of structural features of the '<em>Service Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_REQUIS_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_REQUIS___NOTIFY_CONFIG__OBJECT = SERVICE___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Service Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_REQUIS_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Interfaces.ServiceFourni <em>Service Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Interfaces.ServiceFourni
	 * @see hADL.Interfaces.InterfacesPackage#getServiceFourni()
	 * @generated
	 */
	public static final int SERVICE_FOURNI = 4;

	/**
	 * The number of structural features of the '<em>Service Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_FOURNI_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_FOURNI___NOTIFY_CONFIG__OBJECT = SERVICE___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Service Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_FOURNI_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Interfaces.PortFourniConfig <em>Port Fourni Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Interfaces.PortFourniConfig
	 * @see hADL.Interfaces.InterfacesPackage#getPortFourniConfig()
	 * @generated
	 */
	public static final int PORT_FOURNI_CONFIG = 7;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT_FOURNI_CONFIG__OBSERVER = PORT__OBSERVER;

	/**
	 * The number of structural features of the '<em>Port Fourni Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT_FOURNI_CONFIG_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT_FOURNI_CONFIG___NOTIFY_CONFIG__OBJECT = PORT___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Port Fourni Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT_FOURNI_CONFIG_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Interfaces.PortRequisCompo <em>Port Requis Compo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Interfaces.PortRequisCompo
	 * @see hADL.Interfaces.InterfacesPackage#getPortRequisCompo()
	 * @generated
	 */
	public static final int PORT_REQUIS_COMPO = 8;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT_REQUIS_COMPO__OBSERVER = PORT__OBSERVER;

	/**
	 * The number of structural features of the '<em>Port Requis Compo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT_REQUIS_COMPO_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT_REQUIS_COMPO___NOTIFY_CONFIG__OBJECT = PORT___NOTIFY_CONFIG__OBJECT;

	/**
	 * The number of operations of the '<em>Port Requis Compo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PORT_REQUIS_COMPO_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portFourniCompoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRequisConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceFourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portFourniConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRequisCompoEClass = null;

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
	 * @see hADL.Interfaces.InterfacesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InterfacesPackage() {
		super(eNS_URI, InterfacesFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link InterfacesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InterfacesPackage init() {
		if (isInited) return (InterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);

		// Obtain or create and register package
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InterfacesPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InterfacesPackage());

		isInited = true;

		// Obtain or create and register interdependencies
		HADLM1Package theHADLM1Package = (HADLM1Package)(EPackage.Registry.INSTANCE.getEPackage(HADLM1Package.eNS_URI) instanceof HADLM1Package ? EPackage.Registry.INSTANCE.getEPackage(HADLM1Package.eNS_URI) : HADLM1Package.eINSTANCE);
		HADLPackage theHADLPackage = (HADLPackage)(EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI) instanceof HADLPackage ? EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI) : HADLPackage.eINSTANCE);
		ConnecteursPackage theConnecteursPackage = (ConnecteursPackage)(EPackage.Registry.INSTANCE.getEPackage(ConnecteursPackage.eNS_URI) instanceof ConnecteursPackage ? EPackage.Registry.INSTANCE.getEPackage(ConnecteursPackage.eNS_URI) : ConnecteursPackage.eINSTANCE);
		ComposantPackage theComposantPackage = (ComposantPackage)(EPackage.Registry.INSTANCE.getEPackage(ComposantPackage.eNS_URI) instanceof ComposantPackage ? EPackage.Registry.INSTANCE.getEPackage(ComposantPackage.eNS_URI) : ComposantPackage.eINSTANCE);
		LiensPackage theLiensPackage = (LiensPackage)(EPackage.Registry.INSTANCE.getEPackage(LiensPackage.eNS_URI) instanceof LiensPackage ? EPackage.Registry.INSTANCE.getEPackage(LiensPackage.eNS_URI) : LiensPackage.eINSTANCE);
		RolesPackage theRolesPackage = (RolesPackage)(EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI) instanceof RolesPackage ? EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI) : RolesPackage.eINSTANCE);
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackage ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) : ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theInterfacesPackage.createPackageContents();
		theHADLM1Package.createPackageContents();
		theHADLPackage.createPackageContents();
		theConnecteursPackage.createPackageContents();
		theComposantPackage.createPackageContents();
		theLiensPackage.createPackageContents();
		theRolesPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theInterfacesPackage.initializePackageContents();
		theHADLM1Package.initializePackageContents();
		theHADLPackage.initializePackageContents();
		theConnecteursPackage.initializePackageContents();
		theComposantPackage.initializePackageContents();
		theLiensPackage.initializePackageContents();
		theRolesPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInterfacesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InterfacesPackage.eNS_URI, theInterfacesPackage);
		return theInterfacesPackage;
	}


	/**
	 * Returns the meta object for class '{@link hADL.Interfaces.PortFourniCompo <em>Port Fourni Compo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fourni Compo</em>'.
	 * @see hADL.Interfaces.PortFourniCompo
	 * @generated
	 */
	public EClass getPortFourniCompo() {
		return portFourniCompoEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADL.Interfaces.PortRequisConfig <em>Port Requis Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Config</em>'.
	 * @see hADL.Interfaces.PortRequisConfig
	 * @generated
	 */
	public EClass getPortRequisConfig() {
		return portRequisConfigEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADL.Interfaces.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see hADL.Interfaces.Port
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADL.Interfaces.Port#getObserver <em>Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Observer</em>'.
	 * @see hADL.Interfaces.Port#getObserver()
	 * @see #getPort()
	 * @generated
	 */
	public EReference getPort_Observer() {
		return (EReference)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link hADL.Interfaces.ServiceRequis <em>Service Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Requis</em>'.
	 * @see hADL.Interfaces.ServiceRequis
	 * @generated
	 */
	public EClass getServiceRequis() {
		return serviceRequisEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADL.Interfaces.ServiceFourni <em>Service Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Fourni</em>'.
	 * @see hADL.Interfaces.ServiceFourni
	 * @generated
	 */
	public EClass getServiceFourni() {
		return serviceFourniEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADL.Interfaces.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see hADL.Interfaces.Interface
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * Returns the meta object for the '{@link hADL.Interfaces.Interface#notifyConfig(java.lang.Object) <em>Notify Config</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Notify Config</em>' operation.
	 * @see hADL.Interfaces.Interface#notifyConfig(java.lang.Object)
	 * @generated
	 */
	public EOperation getInterface__NotifyConfig__Object() {
		return interfaceEClass.getEOperations().get(0);
	}


	/**
	 * Returns the meta object for class '{@link hADL.Interfaces.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see hADL.Interfaces.Service
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADL.Interfaces.PortFourniConfig <em>Port Fourni Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fourni Config</em>'.
	 * @see hADL.Interfaces.PortFourniConfig
	 * @generated
	 */
	public EClass getPortFourniConfig() {
		return portFourniConfigEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADL.Interfaces.PortRequisCompo <em>Port Requis Compo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Compo</em>'.
	 * @see hADL.Interfaces.PortRequisCompo
	 * @generated
	 */
	public EClass getPortRequisCompo() {
		return portRequisCompoEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public InterfacesFactory getInterfacesFactory() {
		return (InterfacesFactory)getEFactoryInstance();
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
		portFourniCompoEClass = createEClass(PORT_FOURNI_COMPO);

		portRequisConfigEClass = createEClass(PORT_REQUIS_CONFIG);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__OBSERVER);

		serviceRequisEClass = createEClass(SERVICE_REQUIS);

		serviceFourniEClass = createEClass(SERVICE_FOURNI);

		interfaceEClass = createEClass(INTERFACE);
		createEOperation(interfaceEClass, INTERFACE___NOTIFY_CONFIG__OBJECT);

		serviceEClass = createEClass(SERVICE);

		portFourniConfigEClass = createEClass(PORT_FOURNI_CONFIG);

		portRequisCompoEClass = createEClass(PORT_REQUIS_COMPO);
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
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);
		HADLPackage theHADLPackage = (HADLPackage)EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		portFourniCompoEClass.getESuperTypes().add(this.getPort());
		portRequisConfigEClass.getESuperTypes().add(this.getPort());
		portEClass.getESuperTypes().add(this.getInterface());
		serviceRequisEClass.getESuperTypes().add(this.getService());
		serviceFourniEClass.getESuperTypes().add(this.getService());
		interfaceEClass.getESuperTypes().add(theHADLPackage.getObjet());
		serviceEClass.getESuperTypes().add(this.getInterface());
		portFourniConfigEClass.getESuperTypes().add(this.getPort());
		portRequisCompoEClass.getESuperTypes().add(this.getPort());

		// Initialize classes, features, and operations; add parameters
		initEClass(portFourniCompoEClass, PortFourniCompo.class, "PortFourniCompo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portRequisConfigEClass, PortRequisConfig.class, "PortRequisConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Observer(), theConfigurationPackage.getObserver(), null, "observer", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceRequisEClass, ServiceRequis.class, "ServiceRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceFourniEClass, ServiceFourni.class, "ServiceFourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceEClass, Interface.class, "Interface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getInterface__NotifyConfig__Object(), null, "notifyConfig", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portFourniConfigEClass, PortFourniConfig.class, "PortFourniConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portRequisCompoEClass, PortRequisCompo.class, "PortRequisCompo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link hADL.Interfaces.PortFourniCompo <em>Port Fourni Compo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Interfaces.PortFourniCompo
		 * @see hADL.Interfaces.InterfacesPackage#getPortFourniCompo()
		 * @generated
		 */
		public static final EClass PORT_FOURNI_COMPO = eINSTANCE.getPortFourniCompo();

		/**
		 * The meta object literal for the '{@link hADL.Interfaces.PortRequisConfig <em>Port Requis Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Interfaces.PortRequisConfig
		 * @see hADL.Interfaces.InterfacesPackage#getPortRequisConfig()
		 * @generated
		 */
		public static final EClass PORT_REQUIS_CONFIG = eINSTANCE.getPortRequisConfig();

		/**
		 * The meta object literal for the '{@link hADL.Interfaces.Port <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Interfaces.Port
		 * @see hADL.Interfaces.InterfacesPackage#getPort()
		 * @generated
		 */
		public static final EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Observer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PORT__OBSERVER = eINSTANCE.getPort_Observer();

		/**
		 * The meta object literal for the '{@link hADL.Interfaces.ServiceRequis <em>Service Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Interfaces.ServiceRequis
		 * @see hADL.Interfaces.InterfacesPackage#getServiceRequis()
		 * @generated
		 */
		public static final EClass SERVICE_REQUIS = eINSTANCE.getServiceRequis();

		/**
		 * The meta object literal for the '{@link hADL.Interfaces.ServiceFourni <em>Service Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Interfaces.ServiceFourni
		 * @see hADL.Interfaces.InterfacesPackage#getServiceFourni()
		 * @generated
		 */
		public static final EClass SERVICE_FOURNI = eINSTANCE.getServiceFourni();

		/**
		 * The meta object literal for the '{@link hADL.Interfaces.Interface <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Interfaces.Interface
		 * @see hADL.Interfaces.InterfacesPackage#getInterface()
		 * @generated
		 */
		public static final EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Notify Config</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation INTERFACE___NOTIFY_CONFIG__OBJECT = eINSTANCE.getInterface__NotifyConfig__Object();

		/**
		 * The meta object literal for the '{@link hADL.Interfaces.Service <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Interfaces.Service
		 * @see hADL.Interfaces.InterfacesPackage#getService()
		 * @generated
		 */
		public static final EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '{@link hADL.Interfaces.PortFourniConfig <em>Port Fourni Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Interfaces.PortFourniConfig
		 * @see hADL.Interfaces.InterfacesPackage#getPortFourniConfig()
		 * @generated
		 */
		public static final EClass PORT_FOURNI_CONFIG = eINSTANCE.getPortFourniConfig();

		/**
		 * The meta object literal for the '{@link hADL.Interfaces.PortRequisCompo <em>Port Requis Compo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Interfaces.PortRequisCompo
		 * @see hADL.Interfaces.InterfacesPackage#getPortRequisCompo()
		 * @generated
		 */
		public static final EClass PORT_REQUIS_COMPO = eINSTANCE.getPortRequisCompo();

	}

} //InterfacesPackage
