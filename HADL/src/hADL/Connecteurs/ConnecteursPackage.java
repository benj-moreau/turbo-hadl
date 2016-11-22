/**
 */
package hADL.Connecteurs;

import hADL.Composant.ComposantPackage;

import hADL.Configuration.ConfigurationPackage;

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
 * @see hADL.Connecteurs.ConnecteursFactory
 * @model kind="package"
 * @generated
 */
public class ConnecteursPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "Connecteurs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "Connecteurs";

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
	public static final ConnecteursPackage eINSTANCE = hADL.Connecteurs.ConnecteursPackage.init();

	/**
	 * The meta object id for the '{@link hADL.Connecteurs.Connecteur <em>Connecteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Connecteurs.Connecteur
	 * @see hADL.Connecteurs.ConnecteursPackage#getConnecteur()
	 * @generated
	 */
	public static final int CONNECTEUR = 3;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTEUR__CHILD = HADLPackage.ELEMENT__CHILD;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTEUR__ROLES = HADLPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTEUR_FEATURE_COUNT = HADLPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTEUR_OPERATION_COUNT = HADLPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Connecteurs.ConnecteurImplicite <em>Connecteur Implicite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Connecteurs.ConnecteurImplicite
	 * @see hADL.Connecteurs.ConnecteursPackage#getConnecteurImplicite()
	 * @generated
	 */
	public static final int CONNECTEUR_IMPLICITE = 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTEUR_IMPLICITE__CHILD = CONNECTEUR__CHILD;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTEUR_IMPLICITE__ROLES = CONNECTEUR__ROLES;

	/**
	 * The number of structural features of the '<em>Connecteur Implicite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTEUR_IMPLICITE_FEATURE_COUNT = CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connecteur Implicite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTEUR_IMPLICITE_OPERATION_COUNT = CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Connecteurs.ConnecteurEnumere <em>Connecteur Enumere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Connecteurs.ConnecteurEnumere
	 * @see hADL.Connecteurs.ConnecteursPackage#getConnecteurEnumere()
	 * @generated
	 */
	public static final int CONNECTEUR_ENUMERE = 1;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTEUR_ENUMERE__CHILD = CONNECTEUR__CHILD;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTEUR_ENUMERE__ROLES = CONNECTEUR__ROLES;

	/**
	 * The number of structural features of the '<em>Connecteur Enumere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTEUR_ENUMERE_FEATURE_COUNT = CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connecteur Enumere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTEUR_ENUMERE_OPERATION_COUNT = CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Connecteurs.ConnecteurExplicite <em>Connecteur Explicite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Connecteurs.ConnecteurExplicite
	 * @see hADL.Connecteurs.ConnecteursPackage#getConnecteurExplicite()
	 * @generated
	 */
	public static final int CONNECTEUR_EXPLICITE = 2;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTEUR_EXPLICITE__CHILD = CONNECTEUR__CHILD;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTEUR_EXPLICITE__ROLES = CONNECTEUR__ROLES;

	/**
	 * The number of structural features of the '<em>Connecteur Explicite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTEUR_EXPLICITE_FEATURE_COUNT = CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connecteur Explicite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTEUR_EXPLICITE_OPERATION_COUNT = CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connecteurImpliciteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connecteurEnumereEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connecteurExpliciteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connecteurEClass = null;

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
	 * @see hADL.Connecteurs.ConnecteursPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConnecteursPackage() {
		super(eNS_URI, ConnecteursFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConnecteursPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConnecteursPackage init() {
		if (isInited) return (ConnecteursPackage)EPackage.Registry.INSTANCE.getEPackage(ConnecteursPackage.eNS_URI);

		// Obtain or create and register package
		ConnecteursPackage theConnecteursPackage = (ConnecteursPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConnecteursPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConnecteursPackage());

		isInited = true;

		// Obtain or create and register interdependencies
		HADLPackage theHADLPackage = (HADLPackage)(EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI) instanceof HADLPackage ? EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI) : HADLPackage.eINSTANCE);
		ComposantPackage theComposantPackage = (ComposantPackage)(EPackage.Registry.INSTANCE.getEPackage(ComposantPackage.eNS_URI) instanceof ComposantPackage ? EPackage.Registry.INSTANCE.getEPackage(ComposantPackage.eNS_URI) : ComposantPackage.eINSTANCE);
		LiensPackage theLiensPackage = (LiensPackage)(EPackage.Registry.INSTANCE.getEPackage(LiensPackage.eNS_URI) instanceof LiensPackage ? EPackage.Registry.INSTANCE.getEPackage(LiensPackage.eNS_URI) : LiensPackage.eINSTANCE);
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)(EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI) instanceof InterfacesPackage ? EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI) : InterfacesPackage.eINSTANCE);
		RolesPackage theRolesPackage = (RolesPackage)(EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI) instanceof RolesPackage ? EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI) : RolesPackage.eINSTANCE);
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackage ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) : ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theConnecteursPackage.createPackageContents();
		theHADLPackage.createPackageContents();
		theComposantPackage.createPackageContents();
		theLiensPackage.createPackageContents();
		theInterfacesPackage.createPackageContents();
		theRolesPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theConnecteursPackage.initializePackageContents();
		theHADLPackage.initializePackageContents();
		theComposantPackage.initializePackageContents();
		theLiensPackage.initializePackageContents();
		theInterfacesPackage.initializePackageContents();
		theRolesPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConnecteursPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConnecteursPackage.eNS_URI, theConnecteursPackage);
		return theConnecteursPackage;
	}


	/**
	 * Returns the meta object for class '{@link hADL.Connecteurs.ConnecteurImplicite <em>Connecteur Implicite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connecteur Implicite</em>'.
	 * @see hADL.Connecteurs.ConnecteurImplicite
	 * @generated
	 */
	public EClass getConnecteurImplicite() {
		return connecteurImpliciteEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADL.Connecteurs.ConnecteurEnumere <em>Connecteur Enumere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connecteur Enumere</em>'.
	 * @see hADL.Connecteurs.ConnecteurEnumere
	 * @generated
	 */
	public EClass getConnecteurEnumere() {
		return connecteurEnumereEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADL.Connecteurs.ConnecteurExplicite <em>Connecteur Explicite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connecteur Explicite</em>'.
	 * @see hADL.Connecteurs.ConnecteurExplicite
	 * @generated
	 */
	public EClass getConnecteurExplicite() {
		return connecteurExpliciteEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADL.Connecteurs.Connecteur <em>Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connecteur</em>'.
	 * @see hADL.Connecteurs.Connecteur
	 * @generated
	 */
	public EClass getConnecteur() {
		return connecteurEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link hADL.Connecteurs.Connecteur#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see hADL.Connecteurs.Connecteur#getRoles()
	 * @see #getConnecteur()
	 * @generated
	 */
	public EReference getConnecteur_Roles() {
		return (EReference)connecteurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public ConnecteursFactory getConnecteursFactory() {
		return (ConnecteursFactory)getEFactoryInstance();
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
		connecteurImpliciteEClass = createEClass(CONNECTEUR_IMPLICITE);

		connecteurEnumereEClass = createEClass(CONNECTEUR_ENUMERE);

		connecteurExpliciteEClass = createEClass(CONNECTEUR_EXPLICITE);

		connecteurEClass = createEClass(CONNECTEUR);
		createEReference(connecteurEClass, CONNECTEUR__ROLES);
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
		RolesPackage theRolesPackage = (RolesPackage)EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		connecteurImpliciteEClass.getESuperTypes().add(this.getConnecteur());
		connecteurEnumereEClass.getESuperTypes().add(this.getConnecteur());
		connecteurExpliciteEClass.getESuperTypes().add(this.getConnecteur());
		connecteurEClass.getESuperTypes().add(theHADLPackage.getElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(connecteurImpliciteEClass, ConnecteurImplicite.class, "ConnecteurImplicite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connecteurEnumereEClass, ConnecteurEnumere.class, "ConnecteurEnumere", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connecteurExpliciteEClass, ConnecteurExplicite.class, "ConnecteurExplicite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connecteurEClass, Connecteur.class, "Connecteur", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnecteur_Roles(), theRolesPackage.getRole(), null, "roles", null, 2, -1, Connecteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		 * The meta object literal for the '{@link hADL.Connecteurs.ConnecteurImplicite <em>Connecteur Implicite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Connecteurs.ConnecteurImplicite
		 * @see hADL.Connecteurs.ConnecteursPackage#getConnecteurImplicite()
		 * @generated
		 */
		public static final EClass CONNECTEUR_IMPLICITE = eINSTANCE.getConnecteurImplicite();

		/**
		 * The meta object literal for the '{@link hADL.Connecteurs.ConnecteurEnumere <em>Connecteur Enumere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Connecteurs.ConnecteurEnumere
		 * @see hADL.Connecteurs.ConnecteursPackage#getConnecteurEnumere()
		 * @generated
		 */
		public static final EClass CONNECTEUR_ENUMERE = eINSTANCE.getConnecteurEnumere();

		/**
		 * The meta object literal for the '{@link hADL.Connecteurs.ConnecteurExplicite <em>Connecteur Explicite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Connecteurs.ConnecteurExplicite
		 * @see hADL.Connecteurs.ConnecteursPackage#getConnecteurExplicite()
		 * @generated
		 */
		public static final EClass CONNECTEUR_EXPLICITE = eINSTANCE.getConnecteurExplicite();

		/**
		 * The meta object literal for the '{@link hADL.Connecteurs.Connecteur <em>Connecteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Connecteurs.Connecteur
		 * @see hADL.Connecteurs.ConnecteursPackage#getConnecteur()
		 * @generated
		 */
		public static final EClass CONNECTEUR = eINSTANCE.getConnecteur();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONNECTEUR__ROLES = eINSTANCE.getConnecteur_Roles();

	}

} //ConnecteursPackage
