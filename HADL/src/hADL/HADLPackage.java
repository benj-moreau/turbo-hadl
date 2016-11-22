/**
 */
package hADL;

import hADL.Composant.ComposantPackage;

import hADL.Configuration.ConfigurationPackage;

import hADL.Connecteurs.ConnecteursPackage;

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
 * @see hADL.HADLFactory
 * @model kind="package"
 * @generated
 */
public class HADLPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "hADL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.example.org/hADL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "hADL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HADLPackage eINSTANCE = hADL.HADLPackage.init();

	/**
	 * The meta object id for the '{@link hADL.Objet <em>Objet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Objet
	 * @see hADL.HADLPackage#getObjet()
	 * @generated
	 */
	public static final int OBJET = 1;

	/**
	 * The number of structural features of the '<em>Objet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OBJET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Objet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OBJET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hADL.Element <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Element
	 * @see hADL.HADLPackage#getElement()
	 * @generated
	 */
	public static final int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENT__CHILD = OBJET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENT_FEATURE_COUNT = OBJET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENT_OPERATION_COUNT = OBJET_OPERATION_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objetEClass = null;

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
	 * @see hADL.HADLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HADLPackage() {
		super(eNS_URI, HADLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HADLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HADLPackage init() {
		if (isInited) return (HADLPackage)EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI);

		// Obtain or create and register package
		HADLPackage theHADLPackage = (HADLPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HADLPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HADLPackage());

		isInited = true;

		// Obtain or create and register interdependencies
		ConnecteursPackage theConnecteursPackage = (ConnecteursPackage)(EPackage.Registry.INSTANCE.getEPackage(ConnecteursPackage.eNS_URI) instanceof ConnecteursPackage ? EPackage.Registry.INSTANCE.getEPackage(ConnecteursPackage.eNS_URI) : ConnecteursPackage.eINSTANCE);
		ComposantPackage theComposantPackage = (ComposantPackage)(EPackage.Registry.INSTANCE.getEPackage(ComposantPackage.eNS_URI) instanceof ComposantPackage ? EPackage.Registry.INSTANCE.getEPackage(ComposantPackage.eNS_URI) : ComposantPackage.eINSTANCE);
		LiensPackage theLiensPackage = (LiensPackage)(EPackage.Registry.INSTANCE.getEPackage(LiensPackage.eNS_URI) instanceof LiensPackage ? EPackage.Registry.INSTANCE.getEPackage(LiensPackage.eNS_URI) : LiensPackage.eINSTANCE);
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)(EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI) instanceof InterfacesPackage ? EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI) : InterfacesPackage.eINSTANCE);
		RolesPackage theRolesPackage = (RolesPackage)(EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI) instanceof RolesPackage ? EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI) : RolesPackage.eINSTANCE);
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackage ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) : ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theHADLPackage.createPackageContents();
		theConnecteursPackage.createPackageContents();
		theComposantPackage.createPackageContents();
		theLiensPackage.createPackageContents();
		theInterfacesPackage.createPackageContents();
		theRolesPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theHADLPackage.initializePackageContents();
		theConnecteursPackage.initializePackageContents();
		theComposantPackage.initializePackageContents();
		theLiensPackage.initializePackageContents();
		theInterfacesPackage.initializePackageContents();
		theRolesPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHADLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HADLPackage.eNS_URI, theHADLPackage);
		return theHADLPackage;
	}


	/**
	 * Returns the meta object for class '{@link hADL.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see hADL.Element
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link hADL.Element#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see hADL.Element#getChild()
	 * @see #getElement()
	 * @generated
	 */
	public EReference getElement_Child() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link hADL.Objet <em>Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objet</em>'.
	 * @see hADL.Objet
	 * @generated
	 */
	public EClass getObjet() {
		return objetEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public HADLFactory getHADLFactory() {
		return (HADLFactory)getEFactoryInstance();
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
		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__CHILD);

		objetEClass = createEClass(OBJET);
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
		ConnecteursPackage theConnecteursPackage = (ConnecteursPackage)EPackage.Registry.INSTANCE.getEPackage(ConnecteursPackage.eNS_URI);
		ComposantPackage theComposantPackage = (ComposantPackage)EPackage.Registry.INSTANCE.getEPackage(ComposantPackage.eNS_URI);
		LiensPackage theLiensPackage = (LiensPackage)EPackage.Registry.INSTANCE.getEPackage(LiensPackage.eNS_URI);
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		RolesPackage theRolesPackage = (RolesPackage)EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI);
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theConnecteursPackage);
		getESubpackages().add(theComposantPackage);
		getESubpackages().add(theLiensPackage);
		getESubpackages().add(theInterfacesPackage);
		getESubpackages().add(theRolesPackage);
		getESubpackages().add(theConfigurationPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementEClass.getESuperTypes().add(this.getObjet());

		// Initialize classes, features, and operations; add parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Child(), this.getElement(), null, "child", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objetEClass, Objet.class, "Objet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
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
		 * The meta object literal for the '{@link hADL.Element <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Element
		 * @see hADL.HADLPackage#getElement()
		 * @generated
		 */
		public static final EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ELEMENT__CHILD = eINSTANCE.getElement_Child();

		/**
		 * The meta object literal for the '{@link hADL.Objet <em>Objet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Objet
		 * @see hADL.HADLPackage#getObjet()
		 * @generated
		 */
		public static final EClass OBJET = eINSTANCE.getObjet();

	}

} //HADLPackage
