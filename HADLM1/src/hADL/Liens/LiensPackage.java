/**
 */
package hADL.Liens;

import hADL.Composant.ComposantPackage;

import hADL.Configuration.ConfigurationPackage;

import hADL.Connecteurs.ConnecteursPackage;

import hADL.HADLPackage;

import hADL.Interfaces.InterfacesPackage;

import hADL.Roles.RolesPackage;

import hADLM1.HADLM1Package;

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
 * @see hADL.Liens.LiensFactory
 * @generated
 */
public class LiensPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "Liens";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "Liens";

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
	public static final LiensPackage eINSTANCE = hADL.Liens.LiensPackage.init();

	/**
	 * The meta object id for the '{@link hADL.Liens.Lien <em>Lien</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Liens.Lien
	 * @see hADL.Liens.LiensPackage#getLien()
	 * @generated
	 */
	public static final int LIEN = 4;

	/**
	 * The number of structural features of the '<em>Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_FEATURE_COUNT = HADLPackage.OBJET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_OPERATION_COUNT = HADLPackage.OBJET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Liens.LienBinding <em>Lien Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Liens.LienBinding
	 * @see hADL.Liens.LiensPackage#getLienBinding()
	 * @generated
	 */
	public static final int LIEN_BINDING = 5;

	/**
	 * The number of structural features of the '<em>Lien Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_BINDING_FEATURE_COUNT = LIEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lien Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_BINDING_OPERATION_COUNT = LIEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Liens.LienBindingFourni <em>Lien Binding Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Liens.LienBindingFourni
	 * @see hADL.Liens.LiensPackage#getLienBindingFourni()
	 * @generated
	 */
	public static final int LIEN_BINDING_FOURNI = 0;

	/**
	 * The feature id for the '<em><b>Portfournicompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_BINDING_FOURNI__PORTFOURNICOMPO = LIEN_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portfourniconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_BINDING_FOURNI__PORTFOURNICONFIG = LIEN_BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Binding Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_BINDING_FOURNI_FEATURE_COUNT = LIEN_BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Binding Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_BINDING_FOURNI_OPERATION_COUNT = LIEN_BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Liens.LienBindingRequis <em>Lien Binding Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Liens.LienBindingRequis
	 * @see hADL.Liens.LiensPackage#getLienBindingRequis()
	 * @generated
	 */
	public static final int LIEN_BINDING_REQUIS = 1;

	/**
	 * The feature id for the '<em><b>Portrequiscompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_BINDING_REQUIS__PORTREQUISCOMPO = LIEN_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portrequisconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_BINDING_REQUIS__PORTREQUISCONFIG = LIEN_BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Binding Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_BINDING_REQUIS_FEATURE_COUNT = LIEN_BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Binding Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_BINDING_REQUIS_OPERATION_COUNT = LIEN_BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Liens.LienAttachement <em>Lien Attachement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Liens.LienAttachement
	 * @see hADL.Liens.LiensPackage#getLienAttachement()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT = 2;

	/**
	 * The number of structural features of the '<em>Lien Attachement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_FEATURE_COUNT = LIEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lien Attachement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_OPERATION_COUNT = LIEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Liens.LienAttachementPFRF <em>Lien Attachement PFRF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Liens.LienAttachementPFRF
	 * @see hADL.Liens.LiensPackage#getLienAttachementPFRF()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT_PFRF = 3;

	/**
	 * The feature id for the '<em><b>Portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_PFRF__PORTFOURNI = LIEN_ATTACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_PFRF__ROLEFROM = LIEN_ATTACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Attachement PFRF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_PFRF_FEATURE_COUNT = LIEN_ATTACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Attachement PFRF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_PFRF_OPERATION_COUNT = LIEN_ATTACHEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hADL.Liens.LienAttachementPRRT <em>Lien Attachement PRRT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hADL.Liens.LienAttachementPRRT
	 * @see hADL.Liens.LiensPackage#getLienAttachementPRRT()
	 * @generated
	 */
	public static final int LIEN_ATTACHEMENT_PRRT = 6;

	/**
	 * The feature id for the '<em><b>Portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_PRRT__PORTREQUIS = LIEN_ATTACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_PRRT__ROLETO = LIEN_ATTACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lien Attachement PRRT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_PRRT_FEATURE_COUNT = LIEN_ATTACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lien Attachement PRRT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIEN_ATTACHEMENT_PRRT_OPERATION_COUNT = LIEN_ATTACHEMENT_OPERATION_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienBindingFourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienBindingRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementPFRFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienAttachementPRRTEClass = null;

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
	 * @see hADL.Liens.LiensPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LiensPackage() {
		super(eNS_URI, LiensFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link LiensPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LiensPackage init() {
		if (isInited) return (LiensPackage)EPackage.Registry.INSTANCE.getEPackage(LiensPackage.eNS_URI);

		// Obtain or create and register package
		LiensPackage theLiensPackage = (LiensPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LiensPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LiensPackage());

		isInited = true;

		// Obtain or create and register interdependencies
		HADLM1Package theHADLM1Package = (HADLM1Package)(EPackage.Registry.INSTANCE.getEPackage(HADLM1Package.eNS_URI) instanceof HADLM1Package ? EPackage.Registry.INSTANCE.getEPackage(HADLM1Package.eNS_URI) : HADLM1Package.eINSTANCE);
		HADLPackage theHADLPackage = (HADLPackage)(EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI) instanceof HADLPackage ? EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI) : HADLPackage.eINSTANCE);
		ConnecteursPackage theConnecteursPackage = (ConnecteursPackage)(EPackage.Registry.INSTANCE.getEPackage(ConnecteursPackage.eNS_URI) instanceof ConnecteursPackage ? EPackage.Registry.INSTANCE.getEPackage(ConnecteursPackage.eNS_URI) : ConnecteursPackage.eINSTANCE);
		ComposantPackage theComposantPackage = (ComposantPackage)(EPackage.Registry.INSTANCE.getEPackage(ComposantPackage.eNS_URI) instanceof ComposantPackage ? EPackage.Registry.INSTANCE.getEPackage(ComposantPackage.eNS_URI) : ComposantPackage.eINSTANCE);
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)(EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI) instanceof InterfacesPackage ? EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI) : InterfacesPackage.eINSTANCE);
		RolesPackage theRolesPackage = (RolesPackage)(EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI) instanceof RolesPackage ? EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI) : RolesPackage.eINSTANCE);
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackage ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) : ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theLiensPackage.createPackageContents();
		theHADLM1Package.createPackageContents();
		theHADLPackage.createPackageContents();
		theConnecteursPackage.createPackageContents();
		theComposantPackage.createPackageContents();
		theInterfacesPackage.createPackageContents();
		theRolesPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theLiensPackage.initializePackageContents();
		theHADLM1Package.initializePackageContents();
		theHADLPackage.initializePackageContents();
		theConnecteursPackage.initializePackageContents();
		theComposantPackage.initializePackageContents();
		theInterfacesPackage.initializePackageContents();
		theRolesPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLiensPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LiensPackage.eNS_URI, theLiensPackage);
		return theLiensPackage;
	}


	/**
	 * Returns the meta object for class '{@link hADL.Liens.LienBindingFourni <em>Lien Binding Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Binding Fourni</em>'.
	 * @see hADL.Liens.LienBindingFourni
	 * @generated
	 */
	public EClass getLienBindingFourni() {
		return lienBindingFourniEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADL.Liens.LienBindingFourni#getPortfournicompo <em>Portfournicompo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portfournicompo</em>'.
	 * @see hADL.Liens.LienBindingFourni#getPortfournicompo()
	 * @see #getLienBindingFourni()
	 * @generated
	 */
	public EReference getLienBindingFourni_Portfournicompo() {
		return (EReference)lienBindingFourniEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADL.Liens.LienBindingFourni#getPortfourniconfig <em>Portfourniconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portfourniconfig</em>'.
	 * @see hADL.Liens.LienBindingFourni#getPortfourniconfig()
	 * @see #getLienBindingFourni()
	 * @generated
	 */
	public EReference getLienBindingFourni_Portfourniconfig() {
		return (EReference)lienBindingFourniEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADL.Liens.LienBindingRequis <em>Lien Binding Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Binding Requis</em>'.
	 * @see hADL.Liens.LienBindingRequis
	 * @generated
	 */
	public EClass getLienBindingRequis() {
		return lienBindingRequisEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADL.Liens.LienBindingRequis#getPortrequiscompo <em>Portrequiscompo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portrequiscompo</em>'.
	 * @see hADL.Liens.LienBindingRequis#getPortrequiscompo()
	 * @see #getLienBindingRequis()
	 * @generated
	 */
	public EReference getLienBindingRequis_Portrequiscompo() {
		return (EReference)lienBindingRequisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADL.Liens.LienBindingRequis#getPortrequisconfig <em>Portrequisconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portrequisconfig</em>'.
	 * @see hADL.Liens.LienBindingRequis#getPortrequisconfig()
	 * @see #getLienBindingRequis()
	 * @generated
	 */
	public EReference getLienBindingRequis_Portrequisconfig() {
		return (EReference)lienBindingRequisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADL.Liens.LienAttachement <em>Lien Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement</em>'.
	 * @see hADL.Liens.LienAttachement
	 * @generated
	 */
	public EClass getLienAttachement() {
		return lienAttachementEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADL.Liens.LienAttachementPFRF <em>Lien Attachement PFRF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement PFRF</em>'.
	 * @see hADL.Liens.LienAttachementPFRF
	 * @generated
	 */
	public EClass getLienAttachementPFRF() {
		return lienAttachementPFRFEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADL.Liens.LienAttachementPFRF#getPortfourni <em>Portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portfourni</em>'.
	 * @see hADL.Liens.LienAttachementPFRF#getPortfourni()
	 * @see #getLienAttachementPFRF()
	 * @generated
	 */
	public EReference getLienAttachementPFRF_Portfourni() {
		return (EReference)lienAttachementPFRFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADL.Liens.LienAttachementPFRF#getRolefrom <em>Rolefrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolefrom</em>'.
	 * @see hADL.Liens.LienAttachementPFRF#getRolefrom()
	 * @see #getLienAttachementPFRF()
	 * @generated
	 */
	public EReference getLienAttachementPFRF_Rolefrom() {
		return (EReference)lienAttachementPFRFEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link hADL.Liens.Lien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien</em>'.
	 * @see hADL.Liens.Lien
	 * @generated
	 */
	public EClass getLien() {
		return lienEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADL.Liens.LienBinding <em>Lien Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Binding</em>'.
	 * @see hADL.Liens.LienBinding
	 * @generated
	 */
	public EClass getLienBinding() {
		return lienBindingEClass;
	}

	/**
	 * Returns the meta object for class '{@link hADL.Liens.LienAttachementPRRT <em>Lien Attachement PRRT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Attachement PRRT</em>'.
	 * @see hADL.Liens.LienAttachementPRRT
	 * @generated
	 */
	public EClass getLienAttachementPRRT() {
		return lienAttachementPRRTEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADL.Liens.LienAttachementPRRT#getPortrequis <em>Portrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portrequis</em>'.
	 * @see hADL.Liens.LienAttachementPRRT#getPortrequis()
	 * @see #getLienAttachementPRRT()
	 * @generated
	 */
	public EReference getLienAttachementPRRT_Portrequis() {
		return (EReference)lienAttachementPRRTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link hADL.Liens.LienAttachementPRRT#getRoleto <em>Roleto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Roleto</em>'.
	 * @see hADL.Liens.LienAttachementPRRT#getRoleto()
	 * @see #getLienAttachementPRRT()
	 * @generated
	 */
	public EReference getLienAttachementPRRT_Roleto() {
		return (EReference)lienAttachementPRRTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public LiensFactory getLiensFactory() {
		return (LiensFactory)getEFactoryInstance();
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
		lienBindingFourniEClass = createEClass(LIEN_BINDING_FOURNI);
		createEReference(lienBindingFourniEClass, LIEN_BINDING_FOURNI__PORTFOURNICOMPO);
		createEReference(lienBindingFourniEClass, LIEN_BINDING_FOURNI__PORTFOURNICONFIG);

		lienBindingRequisEClass = createEClass(LIEN_BINDING_REQUIS);
		createEReference(lienBindingRequisEClass, LIEN_BINDING_REQUIS__PORTREQUISCOMPO);
		createEReference(lienBindingRequisEClass, LIEN_BINDING_REQUIS__PORTREQUISCONFIG);

		lienAttachementEClass = createEClass(LIEN_ATTACHEMENT);

		lienAttachementPFRFEClass = createEClass(LIEN_ATTACHEMENT_PFRF);
		createEReference(lienAttachementPFRFEClass, LIEN_ATTACHEMENT_PFRF__PORTFOURNI);
		createEReference(lienAttachementPFRFEClass, LIEN_ATTACHEMENT_PFRF__ROLEFROM);

		lienEClass = createEClass(LIEN);

		lienBindingEClass = createEClass(LIEN_BINDING);

		lienAttachementPRRTEClass = createEClass(LIEN_ATTACHEMENT_PRRT);
		createEReference(lienAttachementPRRTEClass, LIEN_ATTACHEMENT_PRRT__PORTREQUIS);
		createEReference(lienAttachementPRRTEClass, LIEN_ATTACHEMENT_PRRT__ROLETO);
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
		RolesPackage theRolesPackage = (RolesPackage)EPackage.Registry.INSTANCE.getEPackage(RolesPackage.eNS_URI);
		HADLPackage theHADLPackage = (HADLPackage)EPackage.Registry.INSTANCE.getEPackage(HADLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		lienBindingFourniEClass.getESuperTypes().add(this.getLienBinding());
		lienBindingRequisEClass.getESuperTypes().add(this.getLienBinding());
		lienAttachementEClass.getESuperTypes().add(this.getLien());
		lienAttachementPFRFEClass.getESuperTypes().add(this.getLienAttachement());
		lienEClass.getESuperTypes().add(theHADLPackage.getObjet());
		lienBindingEClass.getESuperTypes().add(this.getLien());
		lienAttachementPRRTEClass.getESuperTypes().add(this.getLienAttachement());

		// Initialize classes, features, and operations; add parameters
		initEClass(lienBindingFourniEClass, LienBindingFourni.class, "LienBindingFourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienBindingFourni_Portfournicompo(), theInterfacesPackage.getPortFourniCompo(), null, "portfournicompo", null, 1, 1, LienBindingFourni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienBindingFourni_Portfourniconfig(), theInterfacesPackage.getPortFourniConfig(), null, "portfourniconfig", null, 1, 1, LienBindingFourni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lienBindingRequisEClass, LienBindingRequis.class, "LienBindingRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienBindingRequis_Portrequiscompo(), theInterfacesPackage.getPortRequisCompo(), null, "portrequiscompo", null, 1, 1, LienBindingRequis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienBindingRequis_Portrequisconfig(), theInterfacesPackage.getPortRequisConfig(), null, "portrequisconfig", null, 1, 1, LienBindingRequis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lienAttachementEClass, LienAttachement.class, "LienAttachement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lienAttachementPFRFEClass, LienAttachementPFRF.class, "LienAttachementPFRF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienAttachementPFRF_Portfourni(), theInterfacesPackage.getPortFourniCompo(), null, "portfourni", null, 1, 1, LienAttachementPFRF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienAttachementPFRF_Rolefrom(), theRolesPackage.getRoleFrom(), null, "rolefrom", null, 1, 1, LienAttachementPFRF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lienEClass, Lien.class, "Lien", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lienBindingEClass, LienBinding.class, "LienBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lienAttachementPRRTEClass, LienAttachementPRRT.class, "LienAttachementPRRT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienAttachementPRRT_Portrequis(), theInterfacesPackage.getPortRequisCompo(), null, "portrequis", null, 1, 1, LienAttachementPRRT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienAttachementPRRT_Roleto(), theRolesPackage.getRoleTo(), null, "roleto", null, 1, 1, LienAttachementPRRT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getLienAttachementPRRT_Portrequis(), 
		   source, 
		   new String[] {
			 "namespace", ""
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
		 * The meta object literal for the '{@link hADL.Liens.LienBindingFourni <em>Lien Binding Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Liens.LienBindingFourni
		 * @see hADL.Liens.LiensPackage#getLienBindingFourni()
		 * @generated
		 */
		public static final EClass LIEN_BINDING_FOURNI = eINSTANCE.getLienBindingFourni();

		/**
		 * The meta object literal for the '<em><b>Portfournicompo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_BINDING_FOURNI__PORTFOURNICOMPO = eINSTANCE.getLienBindingFourni_Portfournicompo();

		/**
		 * The meta object literal for the '<em><b>Portfourniconfig</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_BINDING_FOURNI__PORTFOURNICONFIG = eINSTANCE.getLienBindingFourni_Portfourniconfig();

		/**
		 * The meta object literal for the '{@link hADL.Liens.LienBindingRequis <em>Lien Binding Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Liens.LienBindingRequis
		 * @see hADL.Liens.LiensPackage#getLienBindingRequis()
		 * @generated
		 */
		public static final EClass LIEN_BINDING_REQUIS = eINSTANCE.getLienBindingRequis();

		/**
		 * The meta object literal for the '<em><b>Portrequiscompo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_BINDING_REQUIS__PORTREQUISCOMPO = eINSTANCE.getLienBindingRequis_Portrequiscompo();

		/**
		 * The meta object literal for the '<em><b>Portrequisconfig</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_BINDING_REQUIS__PORTREQUISCONFIG = eINSTANCE.getLienBindingRequis_Portrequisconfig();

		/**
		 * The meta object literal for the '{@link hADL.Liens.LienAttachement <em>Lien Attachement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Liens.LienAttachement
		 * @see hADL.Liens.LiensPackage#getLienAttachement()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT = eINSTANCE.getLienAttachement();

		/**
		 * The meta object literal for the '{@link hADL.Liens.LienAttachementPFRF <em>Lien Attachement PFRF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Liens.LienAttachementPFRF
		 * @see hADL.Liens.LiensPackage#getLienAttachementPFRF()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT_PFRF = eINSTANCE.getLienAttachementPFRF();

		/**
		 * The meta object literal for the '<em><b>Portfourni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_PFRF__PORTFOURNI = eINSTANCE.getLienAttachementPFRF_Portfourni();

		/**
		 * The meta object literal for the '<em><b>Rolefrom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_PFRF__ROLEFROM = eINSTANCE.getLienAttachementPFRF_Rolefrom();

		/**
		 * The meta object literal for the '{@link hADL.Liens.Lien <em>Lien</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Liens.Lien
		 * @see hADL.Liens.LiensPackage#getLien()
		 * @generated
		 */
		public static final EClass LIEN = eINSTANCE.getLien();

		/**
		 * The meta object literal for the '{@link hADL.Liens.LienBinding <em>Lien Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Liens.LienBinding
		 * @see hADL.Liens.LiensPackage#getLienBinding()
		 * @generated
		 */
		public static final EClass LIEN_BINDING = eINSTANCE.getLienBinding();

		/**
		 * The meta object literal for the '{@link hADL.Liens.LienAttachementPRRT <em>Lien Attachement PRRT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hADL.Liens.LienAttachementPRRT
		 * @see hADL.Liens.LiensPackage#getLienAttachementPRRT()
		 * @generated
		 */
		public static final EClass LIEN_ATTACHEMENT_PRRT = eINSTANCE.getLienAttachementPRRT();

		/**
		 * The meta object literal for the '<em><b>Portrequis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_PRRT__PORTREQUIS = eINSTANCE.getLienAttachementPRRT_Portrequis();

		/**
		 * The meta object literal for the '<em><b>Roleto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIEN_ATTACHEMENT_PRRT__ROLETO = eINSTANCE.getLienAttachementPRRT_Roleto();

	}

} //LiensPackage
