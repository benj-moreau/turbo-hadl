/**
 */
package hADL.Composant;

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
 * @see hADL.Composant.ComposantFactory
 * @model kind="package"
 * @generated
 */
public class ComposantPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "Composant";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "Composant";

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
	public static final ComposantPackage eINSTANCE = hADL.Composant.ComposantPackage.init();

	/**
	 * The meta object id for the '{@link hADL.Composant.Composant <em>Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Composant.Composant
	 * @see hADL.Composant.ComposantPackage#getComposant()
	 * @generated
	 */
	public static final int COMPOSANT = 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSANT__CHILD = HADLPackage.ELEMENT__CHILD;

	/**
	 * The feature id for the '<em><b>Propriete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSANT__PROPRIETE = HADLPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSANT__CONTRAINTES = HADLPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Portrequiscompo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSANT__PORTREQUISCOMPO = HADLPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Portfournicompo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSANT__PORTFOURNICOMPO = HADLPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSANT_FEATURE_COUNT = HADLPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSANT_OPERATION_COUNT = HADLPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Composant.Contraintes <em>Contraintes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Composant.Contraintes
	 * @see hADL.Composant.ComposantPackage#getContraintes()
	 * @generated
	 */
	public static final int CONTRAINTES = 1;

	/**
	 * The number of structural features of the '<em>Contraintes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTRAINTES_FEATURE_COUNT = HADLPackage.OBJET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contraintes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTRAINTES_OPERATION_COUNT = HADLPackage.OBJET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Composant.Propriete <em>Propriete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Composant.Propriete
	 * @see hADL.Composant.ComposantPackage#getPropriete()
	 * @generated
	 */
	public static final int PROPRIETE = 3;

	/**
	 * The number of structural features of the '<em>Propriete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPRIETE_FEATURE_COUNT = HADLPackage.OBJET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Propriete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPRIETE_OPERATION_COUNT = HADLPackage.OBJET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Composant.ProprieteNonFonc <em>Propriete Non Fonc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Composant.ProprieteNonFonc
	 * @see hADL.Composant.ComposantPackage#getProprieteNonFonc()
	 * @generated
	 */
	public static final int PROPRIETE_NON_FONC = 2;

	/**
	 * The number of structural features of the '<em>Propriete Non Fonc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPRIETE_NON_FONC_FEATURE_COUNT = PROPRIETE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Propriete Non Fonc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPRIETE_NON_FONC_OPERATION_COUNT = PROPRIETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Composant.ProprieteFonc <em>Propriete Fonc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Composant.ProprieteFonc
	 * @see hADL.Composant.ComposantPackage#getProprieteFonc()
	 * @generated
	 */
	public static final int PROPRIETE_FONC = 4;

	/**
	 * The number of structural features of the '<em>Propriete Fonc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPRIETE_FONC_FEATURE_COUNT = PROPRIETE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Propriete Fonc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPRIETE_FONC_OPERATION_COUNT = PROPRIETE_OPERATION_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contraintesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proprieteNonFoncEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proprieteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proprieteFoncEClass = null;

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
	 * @see hADL.Composant.ComposantPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComposantPackage() {
		super(eNS_URI, ComposantFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComposantPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComposantPackage init() {
		if (isInited) return (ComposantPackage)EPackage.Registry.INSTANCE.getEPackage(ComposantPackage.eNS_URI);

		// Obtain or create and register package
		ComposantPackage theComposantPackage = (ComposantPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComposantPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComposantPackage());

		isInited = true;

		// Obtain or create and register interdependencies
		HADLPackage theHADLPackage = (HADLPackage)(EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI) instanceof HADLPackage ? EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI) : HADLPackage.eINSTANCE);
		ConnecteursPackage theConnecteursPackage = (ConnecteursPackage)(EPackage.Registry.INSTANCE.getEPackage(ConnecteursPackage.eNS_URI) instanceof ConnecteursPackage ? EPackage.Registry.INSTANCE.getEPackage(ConnecteursPackage.eNS_URI) : ConnecteursPackage.eINSTANCE);
		LiensPackage theLiensPackage = (LiensPackage)(EPackage.Registry.INSTANCE.getEPackage(LiensPackage.eNS_URI) instanceof LiensPackage ? EPackage.Registry.INSTANCE.getEPackage(LiensPackage.eNS_URI) : LiensPackage.eINSTANCE);
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)(EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI) instanceof InterfacesPackage ? EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI) : InterfacesPackage.eINSTANCE);
		RolesPackage theRolesPackage = (RolesPackage)(EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI) instanceof RolesPackage ? EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI) : RolesPackage.eINSTANCE);
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackage ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) : ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theComposantPackage.createPackageContents();
		theHADLPackage.createPackageContents();
		theConnecteursPackage.createPackageContents();
		theLiensPackage.createPackageContents();
		theInterfacesPackage.createPackageContents();
		theRolesPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theComposantPackage.initializePackageContents();
		theHADLPackage.initializePackageContents();
		theConnecteursPackage.initializePackageContents();
		theLiensPackage.initializePackageContents();
		theInterfacesPackage.initializePackageContents();
		theRolesPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComposantPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComposantPackage.eNS_URI, theComposantPackage);
		return theComposantPackage;
	}


	/**
	 * Returns the meta object for class '{@link hADL.Composant.Composant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composant</em>'.
	 * @see hADL.Composant.Composant
	 * @generated
	 */
	public EClass getComposant() {
		return composantEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link hADL.Composant.Composant#getPropriete <em>Propriete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propriete</em>'.
	 * @see hADL.Composant.Composant#getPropriete()
	 * @see #getComposant()
	 * @generated
	 */
	public EReference getComposant_Propriete() {
		return (EReference)composantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link hADL.Composant.Composant#getContraintes <em>Contraintes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contraintes</em>'.
	 * @see hADL.Composant.Composant#getContraintes()
	 * @see #getComposant()
	 * @generated
	 */
	public EReference getComposant_Contraintes() {
		return (EReference)composantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link hADL.Composant.Composant#getPortrequiscompo <em>Portrequiscompo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portrequiscompo</em>'.
	 * @see hADL.Composant.Composant#getPortrequiscompo()
	 * @see #getComposant()
	 * @generated
	 */
	public EReference getComposant_Portrequiscompo() {
		return (EReference)composantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link hADL.Composant.Composant#getPortfournicompo <em>Portfournicompo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portfournicompo</em>'.
	 * @see hADL.Composant.Composant#getPortfournicompo()
	 * @see #getComposant()
	 * @generated
	 */
	public EReference getComposant_Portfournicompo() {
		return (EReference)composantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link hADL.Composant.Contraintes <em>Contraintes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contraintes</em>'.
	 * @see hADL.Composant.Contraintes
	 * @generated
	 */
	public EClass getContraintes() {
		return contraintesEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADL.Composant.ProprieteNonFonc <em>Propriete Non Fonc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propriete Non Fonc</em>'.
	 * @see hADL.Composant.ProprieteNonFonc
	 * @generated
	 */
	public EClass getProprieteNonFonc() {
		return proprieteNonFoncEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADL.Composant.Propriete <em>Propriete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propriete</em>'.
	 * @see hADL.Composant.Propriete
	 * @generated
	 */
	public EClass getPropriete() {
		return proprieteEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADL.Composant.ProprieteFonc <em>Propriete Fonc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propriete Fonc</em>'.
	 * @see hADL.Composant.ProprieteFonc
	 * @generated
	 */
	public EClass getProprieteFonc() {
		return proprieteFoncEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public ComposantFactory getComposantFactory() {
		return (ComposantFactory)getEFactoryInstance();
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
		composantEClass = createEClass(COMPOSANT);
		createEReference(composantEClass, COMPOSANT__PROPRIETE);
		createEReference(composantEClass, COMPOSANT__CONTRAINTES);
		createEReference(composantEClass, COMPOSANT__PORTREQUISCOMPO);
		createEReference(composantEClass, COMPOSANT__PORTFOURNICOMPO);

		contraintesEClass = createEClass(CONTRAINTES);

		proprieteNonFoncEClass = createEClass(PROPRIETE_NON_FONC);

		proprieteEClass = createEClass(PROPRIETE);

		proprieteFoncEClass = createEClass(PROPRIETE_FONC);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		composantEClass.getESuperTypes().add(theHADLPackage.getElement());
		contraintesEClass.getESuperTypes().add(theHADLPackage.getObjet());
		proprieteNonFoncEClass.getESuperTypes().add(this.getPropriete());
		proprieteEClass.getESuperTypes().add(theHADLPackage.getObjet());
		proprieteFoncEClass.getESuperTypes().add(this.getPropriete());

		// Initialize classes, features, and operations; add parameters
		initEClass(composantEClass, Composant.class, "Composant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposant_Propriete(), this.getPropriete(), null, "propriete", null, 0, -1, Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposant_Contraintes(), this.getContraintes(), null, "contraintes", null, 0, -1, Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposant_Portrequiscompo(), theInterfacesPackage.getPortRequisCompo(), null, "portrequiscompo", null, 0, -1, Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposant_Portfournicompo(), theInterfacesPackage.getPortFourniCompo(), null, "portfournicompo", null, 0, -1, Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contraintesEClass, Contraintes.class, "Contraintes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(proprieteNonFoncEClass, ProprieteNonFonc.class, "ProprieteNonFonc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(proprieteEClass, Propriete.class, "Propriete", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(proprieteFoncEClass, ProprieteFonc.class, "ProprieteFonc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link hADL.Composant.Composant <em>Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Composant.Composant
		 * @see hADL.Composant.ComposantPackage#getComposant()
		 * @generated
		 */
		public static final EClass COMPOSANT = eINSTANCE.getComposant();

		/**
		 * The meta object literal for the '<em><b>Propriete</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPOSANT__PROPRIETE = eINSTANCE.getComposant_Propriete();

		/**
		 * The meta object literal for the '<em><b>Contraintes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPOSANT__CONTRAINTES = eINSTANCE.getComposant_Contraintes();

		/**
		 * The meta object literal for the '<em><b>Portrequiscompo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPOSANT__PORTREQUISCOMPO = eINSTANCE.getComposant_Portrequiscompo();

		/**
		 * The meta object literal for the '<em><b>Portfournicompo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPOSANT__PORTFOURNICOMPO = eINSTANCE.getComposant_Portfournicompo();

		/**
		 * The meta object literal for the '{@link hADL.Composant.Contraintes <em>Contraintes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Composant.Contraintes
		 * @see hADL.Composant.ComposantPackage#getContraintes()
		 * @generated
		 */
		public static final EClass CONTRAINTES = eINSTANCE.getContraintes();

		/**
		 * The meta object literal for the '{@link hADL.Composant.ProprieteNonFonc <em>Propriete Non Fonc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Composant.ProprieteNonFonc
		 * @see hADL.Composant.ComposantPackage#getProprieteNonFonc()
		 * @generated
		 */
		public static final EClass PROPRIETE_NON_FONC = eINSTANCE.getProprieteNonFonc();

		/**
		 * The meta object literal for the '{@link hADL.Composant.Propriete <em>Propriete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Composant.Propriete
		 * @see hADL.Composant.ComposantPackage#getPropriete()
		 * @generated
		 */
		public static final EClass PROPRIETE = eINSTANCE.getPropriete();

		/**
		 * The meta object literal for the '{@link hADL.Composant.ProprieteFonc <em>Propriete Fonc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Composant.ProprieteFonc
		 * @see hADL.Composant.ComposantPackage#getProprieteFonc()
		 * @generated
		 */
		public static final EClass PROPRIETE_FONC = eINSTANCE.getProprieteFonc();

	}

} //ComposantPackage
