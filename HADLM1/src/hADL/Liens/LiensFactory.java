/**
 */
package hADL.Liens;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiensFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LiensFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LiensFactory INSTANCE = hADL.Liens.LiensFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LiensFactory init() {
		try {
			LiensFactory theLiensFactory = (LiensFactory)EPackage.Registry.INSTANCE.getEFactory(LiensPackage.eNS_URI);
			if (theLiensFactory != null) {
				return theLiensFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LiensFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiensFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LiensPackage.LIEN_BINDING_FOURNI: return createLienBindingFourni();
			case LiensPackage.LIEN_BINDING_REQUIS: return createLienBindingRequis();
			case LiensPackage.LIEN_ATTACHEMENT_PFRF: return createLienAttachementPFRF();
			case LiensPackage.LIEN_ATTACHEMENT_PRRT: return createLienAttachementPRRT();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienBindingFourni createLienBindingFourni() {
		LienBindingFourni lienBindingFourni = new LienBindingFourni();
		return lienBindingFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienBindingRequis createLienBindingRequis() {
		LienBindingRequis lienBindingRequis = new LienBindingRequis();
		return lienBindingRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementPFRF createLienAttachementPFRF() {
		LienAttachementPFRF lienAttachementPFRF = new LienAttachementPFRF();
		return lienAttachementPFRF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementPRRT createLienAttachementPRRT() {
		LienAttachementPRRT lienAttachementPRRT = new LienAttachementPRRT();
		return lienAttachementPRRT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiensPackage getLiensPackage() {
		return (LiensPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LiensPackage getPackage() {
		return LiensPackage.eINSTANCE;
	}

} //LiensFactory
