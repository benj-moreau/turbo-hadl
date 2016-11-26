/**
 */
package hADL.Interfaces;

import org.eclipse.emf.ecore.EClass;

import hADLM1.AnswerRequest_PortFourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Fourni Config</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @generated
 */
public class PortFourniConfig extends Port {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortFourniConfig() {
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
		return InterfacesPackage.Literals.PORT_FOURNI_CONFIG;
	}

} // PortFourniConfig
