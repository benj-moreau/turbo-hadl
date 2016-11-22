/**
 */
package hADL.Configuration;

import hADL.Interfaces.PortFourniCompo;
import hADL.Interfaces.PortFourniConfig;
import hADL.Interfaces.PortRequisCompo;
import hADL.Interfaces.PortRequisConfig;
import hADL.Roles.RoleTo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @generated
 */
public interface Observer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void actionViaPort(PortFourniConfig port, Object data);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void actionViaRole(RoleTo role, Object data);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void actionViaPort(PortRequisCompo port, Object data);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void actionViaPort(PortRequisConfig port, Object data);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void actionViaPort(PortFourniCompo port, Object data);

} // Observer
