/**
 */
package hADL.Interfaces;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Requis Compo</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @generated
 */
public class PortRequisCompo extends Port {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortRequisCompo() {
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
		return InterfacesPackage.Literals.PORT_REQUIS_COMPO;
	}

} // PortRequisCompo
