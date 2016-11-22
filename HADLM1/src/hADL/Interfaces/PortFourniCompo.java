/**
 */
package hADL.Interfaces;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Fourni Compo</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @generated
 */
public class PortFourniCompo extends Port {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortFourniCompo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public void notifyConfig(Object data) {
		observer.actionViaPort(this, data);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterfacesPackage.Literals.PORT_FOURNI_COMPO;
	}

} // PortFourniCompo
