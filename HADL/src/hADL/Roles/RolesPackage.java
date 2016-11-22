/**
 */
package hADL.Roles;

import hADL.Composant.ComposantPackage;

import hADL.Configuration.ConfigurationPackage;

import hADL.Connecteurs.ConnecteursPackage;

import hADL.HADLPackage;

import hADL.Interfaces.InterfacesPackage;

import hADL.Liens.LiensPackage;

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
 * @see hADL.Roles.RolesFactory
 * @model kind="package"
 * @generated
 */
public class RolesPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "Roles";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "Roles";

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
	public static final RolesPackage eINSTANCE = hADL.Roles.RolesPackage.init();

	/**
	 * The meta object id for the '{@link hADL.Roles.Role <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Roles.Role
	 * @see hADL.Roles.RolesPackage#getRole()
	 * @generated
	 */
	public static final int ROLE = 1;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROLE__OBSERVER = InterfacesPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_FEATURE_COUNT = InterfacesPackage.INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROLE___NOTIFY_CONFIG = InterfacesPackage.INTERFACE___NOTIFY_CONFIG;

	/**
	 * The operation id for the '<em>Fonct Liaison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROLE___FONCT_LIAISON__ROLE_ROLE = InterfacesPackage.INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_OPERATION_COUNT = InterfacesPackage.INTERFACE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link hADL.Roles.RoleTo <em>Role To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Roles.RoleTo
	 * @see hADL.Roles.RolesPackage#getRoleTo()
	 * @generated
	 */
	public static final int ROLE_TO = 0;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_TO__OBSERVER = ROLE__OBSERVER;

	/**
	 * The number of structural features of the '<em>Role To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_TO_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_TO___NOTIFY_CONFIG = ROLE___NOTIFY_CONFIG;

	/**
	 * The operation id for the '<em>Fonct Liaison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_TO___FONCT_LIAISON__ROLE_ROLE = ROLE___FONCT_LIAISON__ROLE_ROLE;

	/**
	 * The number of operations of the '<em>Role To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_TO_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Roles.RoleFrom <em>Role From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Roles.RoleFrom
	 * @see hADL.Roles.RolesPackage#getRoleFrom()
	 * @generated
	 */
	public static final int ROLE_FROM = 2;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_FROM__OBSERVER = ROLE__OBSERVER;

	/**
	 * The number of structural features of the '<em>Role From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_FROM_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_FROM___NOTIFY_CONFIG = ROLE___NOTIFY_CONFIG;

	/**
	 * The operation id for the '<em>Fonct Liaison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_FROM___FONCT_LIAISON__ROLE_ROLE = ROLE___FONCT_LIAISON__ROLE_ROLE;

	/**
	 * The number of operations of the '<em>Role From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_FROM_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Roles.Glue <em>Glue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Roles.Glue
	 * @see hADL.Roles.RolesPackage#getGlue()
	 * @generated
	 */
	public static final int GLUE = 3;

	/**
	 * The number of structural features of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GLUE_FEATURE_COUNT = HADLPackage.OBJET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Fonct Liaison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GLUE___FONCT_LIAISON__ROLE_ROLE = HADLPackage.OBJET_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GLUE_OPERATION_COUNT = HADLPackage.OBJET_OPERATION_COUNT + 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glueEClass = null;

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
	 * @see hADL.Roles.RolesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RolesPackage() {
		super(eNS_URI, RolesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RolesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RolesPackage init() {
		if (isInited) return (RolesPackage)EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI);

		// Obtain or create and register package
		RolesPackage theRolesPackage = (RolesPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RolesPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RolesPackage());

		isInited = true;

		// Obtain or create and register interdependencies
		HADLPackage theHADLPackage = (HADLPackage)(EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI) instanceof HADLPackage ? EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI) : HADLPackage.eINSTANCE);
		ConnecteursPackage theConnecteursPackage = (ConnecteursPackage)(EPackage.Registry.INSTANCE.getEPackage(ConnecteursPackage.eNS_URI) instanceof ConnecteursPackage ? EPackage.Registry.INSTANCE.getEPackage(ConnecteursPackage.eNS_URI) : ConnecteursPackage.eINSTANCE);
		ComposantPackage theComposantPackage = (ComposantPackage)(EPackage.Registry.INSTANCE.getEPackage(ComposantPackage.eNS_URI) instanceof ComposantPackage ? EPackage.Registry.INSTANCE.getEPackage(ComposantPackage.eNS_URI) : ComposantPackage.eINSTANCE);
		LiensPackage theLiensPackage = (LiensPackage)(EPackage.Registry.INSTANCE.getEPackage(LiensPackage.eNS_URI) instanceof LiensPackage ? EPackage.Registry.INSTANCE.getEPackage(LiensPackage.eNS_URI) : LiensPackage.eINSTANCE);
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)(EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI) instanceof InterfacesPackage ? EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI) : InterfacesPackage.eINSTANCE);
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackage ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) : ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theRolesPackage.createPackageContents();
		theHADLPackage.createPackageContents();
		theConnecteursPackage.createPackageContents();
		theComposantPackage.createPackageContents();
		theLiensPackage.createPackageContents();
		theInterfacesPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theRolesPackage.initializePackageContents();
		theHADLPackage.initializePackageContents();
		theConnecteursPackage.initializePackageContents();
		theComposantPackage.initializePackageContents();
		theLiensPackage.initializePackageContents();
		theInterfacesPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRolesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RolesPackage.eNS_URI, theRolesPackage);
		return theRolesPackage;
	}


	/**
	 * Returns the meta object for class '{@link hADL.Roles.RoleTo <em>Role To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role To</em>'.
	 * @see hADL.Roles.RoleTo
	 * @generated
	 */
	public EClass getRoleTo() {
		return roleToEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADL.Roles.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see hADL.Roles.Role
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link hADL.Roles.Role#getObserver <em>Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Observer</em>'.
	 * @see hADL.Roles.Role#getObserver()
	 * @see #getRole()
	 * @generated
	 */
	public EReference getRole_Observer() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link hADL.Roles.RoleFrom <em>Role From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role From</em>'.
	 * @see hADL.Roles.RoleFrom
	 * @generated
	 */
	public EClass getRoleFrom() {
		return roleFromEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADL.Roles.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue</em>'.
	 * @see hADL.Roles.Glue
	 * @generated
	 */
	public EClass getGlue() {
		return glueEClass;
	}

	/**
	 * Returns the meta object for the '{@link hADL.Roles.Glue#fonctLiaison(hADL.Roles.Role, hADL.Roles.Role) <em>Fonct Liaison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fonct Liaison</em>' operation.
	 * @see hADL.Roles.Glue#fonctLiaison(hADL.Roles.Role, hADL.Roles.Role)
	 * @generated
	 */
	public EOperation getGlue__FonctLiaison__Role_Role() {
		return glueEClass.getEOperations().get(0);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RolesFactory getRolesFactory() {
		return (RolesFactory)getEFactoryInstance();
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
		roleToEClass = createEClass(ROLE_TO);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__OBSERVER);

		roleFromEClass = createEClass(ROLE_FROM);

		glueEClass = createEClass(GLUE);
		createEOperation(glueEClass, GLUE___FONCT_LIAISON__ROLE_ROLE);
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
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);
		HADLPackage theHADLPackage = (HADLPackage)EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roleToEClass.getESuperTypes().add(this.getRole());
		roleEClass.getESuperTypes().add(theInterfacesPackage.getInterface());
		roleEClass.getESuperTypes().add(this.getGlue());
		roleFromEClass.getESuperTypes().add(this.getRole());
		glueEClass.getESuperTypes().add(theHADLPackage.getObjet());

		// Initialize classes, features, and operations; add parameters
		initEClass(roleToEClass, RoleTo.class, "RoleTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleEClass, Role.class, "Role", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Observer(), theConfigurationPackage.getObserver(), null, "observer", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleFromEClass, RoleFrom.class, "RoleFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(glueEClass, Glue.class, "Glue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getGlue__FonctLiaison__Role_Role(), null, "fonctLiaison", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRole(), "role1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRole(), "role2", 0, 1, IS_UNIQUE, IS_ORDERED);
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
		 * The meta object literal for the '{@link hADL.Roles.RoleTo <em>Role To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Roles.RoleTo
		 * @see hADL.Roles.RolesPackage#getRoleTo()
		 * @generated
		 */
		public static final EClass ROLE_TO = eINSTANCE.getRoleTo();

		/**
		 * The meta object literal for the '{@link hADL.Roles.Role <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Roles.Role
		 * @see hADL.Roles.RolesPackage#getRole()
		 * @generated
		 */
		public static final EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Observer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ROLE__OBSERVER = eINSTANCE.getRole_Observer();

		/**
		 * The meta object literal for the '{@link hADL.Roles.RoleFrom <em>Role From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Roles.RoleFrom
		 * @see hADL.Roles.RolesPackage#getRoleFrom()
		 * @generated
		 */
		public static final EClass ROLE_FROM = eINSTANCE.getRoleFrom();

		/**
		 * The meta object literal for the '{@link hADL.Roles.Glue <em>Glue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Roles.Glue
		 * @see hADL.Roles.RolesPackage#getGlue()
		 * @generated
		 */
		public static final EClass GLUE = eINSTANCE.getGlue();

		/**
		 * The meta object literal for the '<em><b>Fonct Liaison</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation GLUE___FONCT_LIAISON__ROLE_ROLE = eINSTANCE.getGlue__FonctLiaison__Role_Role();

	}

} //RolesPackage
