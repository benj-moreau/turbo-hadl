/**
 */
package hADL.Interfaces;

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
 * @see hADL.Interfaces.InterfacesPackage
 * @generated
 */
public class InterfacesFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InterfacesFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterfacesFactory init() {
		try {
			InterfacesFactory theInterfacesFactory = (InterfacesFactory)EPackage.Registry.INSTANCE.getEFactory(InterfacesPackage.eNS_URI);
			if (theInterfacesFactory != null) {
				return theInterfacesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InterfacesFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesFactory() {
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
			case InterfacesPackage.PORT_FOURNI_COMPO: return createPortFourniCompo();
			case InterfacesPackage.PORT_REQUIS_CONFIG: return createPortRequisConfig();
			case InterfacesPackage.SERVICE_REQUIS: return createServiceRequis();
			case InterfacesPackage.SERVICE_FOURNI: return createServiceFourni();
			case InterfacesPackage.PORT_FOURNI_CONFIG: return createPortFourniConfig();
			case InterfacesPackage.PORT_REQUIS_COMPO: return createPortRequisCompo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniCompo createPortFourniCompo() {
		PortFourniCompo portFourniCompo = new PortFourniCompo();
		return portFourniCompo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisConfig createPortRequisConfig() {
		PortRequisConfig portRequisConfig = new PortRequisConfig();
		return portRequisConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequis createServiceRequis() {
		ServiceRequis serviceRequis = new ServiceRequis();
		return serviceRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFourni createServiceFourni() {
		ServiceFourni serviceFourni = new ServiceFourni();
		return serviceFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniConfig createPortFourniConfig() {
		PortFourniConfig portFourniConfig = new PortFourniConfig();
		return portFourniConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisCompo createPortRequisCompo() {
		PortRequisCompo portRequisCompo = new PortRequisCompo();
		return portRequisCompo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesPackage getInterfacesPackage() {
		return (InterfacesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InterfacesPackage getPackage() {
		return InterfacesPackage.eINSTANCE;
	}

} //InterfacesFactory
