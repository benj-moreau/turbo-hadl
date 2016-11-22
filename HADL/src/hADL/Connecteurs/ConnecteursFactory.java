/**
 */
package hADL.Connecteurs;

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
 * @see hADL.Connecteurs.ConnecteursPackage
 * @generated
 */
public class ConnecteursFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ConnecteursFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnecteursFactory init() {
		try {
			ConnecteursFactory theConnecteursFactory = (ConnecteursFactory)EPackage.Registry.INSTANCE.getEFactory(ConnecteursPackage.eNS_URI);
			if (theConnecteursFactory != null) {
				return theConnecteursFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConnecteursFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnecteursFactory() {
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
			case ConnecteursPackage.CONNECTEUR_IMPLICITE: return createConnecteurImplicite();
			case ConnecteursPackage.CONNECTEUR_ENUMERE: return createConnecteurEnumere();
			case ConnecteursPackage.CONNECTEUR_EXPLICITE: return createConnecteurExplicite();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnecteurImplicite createConnecteurImplicite() {
		ConnecteurImplicite connecteurImplicite = new ConnecteurImplicite();
		return connecteurImplicite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnecteurEnumere createConnecteurEnumere() {
		ConnecteurEnumere connecteurEnumere = new ConnecteurEnumere();
		return connecteurEnumere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnecteurExplicite createConnecteurExplicite() {
		ConnecteurExplicite connecteurExplicite = new ConnecteurExplicite();
		return connecteurExplicite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnecteursPackage getConnecteursPackage() {
		return (ConnecteursPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConnecteursPackage getPackage() {
		return ConnecteursPackage.eINSTANCE;
	}

} //ConnecteursFactory
