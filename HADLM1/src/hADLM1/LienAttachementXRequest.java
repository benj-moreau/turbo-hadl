/**
 */
package hADLM1;

import hADL.Liens.LienAttachementPFRF;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Attachement XRequest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.LienAttachementXRequest#getCaller_rolefrom <em>Caller rolefrom</em>}</li>
 *   <li>{@link hADLM1.LienAttachementXRequest#getW <em>W</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienAttachementXRequest extends LienAttachementPFRF {
	/**
	 * The cached value of the '{@link #getCaller_rolefrom() <em>Caller rolefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaller_rolefrom()
	 * @generated
	 * @ordered
	 */
	protected caller_RoleFrom caller_rolefrom;

	/**
	 * The cached value of the '{@link #getW() <em>W</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected Send_request_PortFourniCompo w;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienAttachementXRequest() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.LIEN_ATTACHEMENT_XREQUEST;
	}

	/**
	 * Returns the value of the '<em><b>Caller rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caller rolefrom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caller rolefrom</em>' containment reference.
	 * @see #setCaller_rolefrom(caller_RoleFrom)
	 * @generated
	 */
	public caller_RoleFrom getCaller_rolefrom() {
		return caller_rolefrom;
	}

	/**
	 * Sets the value of the '{@link hADLM1.LienAttachementXRequest#getCaller_rolefrom <em>Caller rolefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caller rolefrom</em>' containment reference.
	 * @see #getCaller_rolefrom()
	 * @generated
	 */
	public void setCaller_rolefrom(caller_RoleFrom newCaller_rolefrom) {
		caller_rolefrom = newCaller_rolefrom;
	}

	/**
	 * Returns the value of the '<em><b>W</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>W</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>W</em>' containment reference.
	 * @see #setW(Send_request_PortFourniCompo)
	 * @generated
	 */
	public Send_request_PortFourniCompo getW() {
		return w;
	}

	/**
	 * Sets the value of the '{@link hADLM1.LienAttachementXRequest#getW <em>W</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>W</em>' containment reference.
	 * @see #getW()
	 * @generated
	 */
	public void setW(Send_request_PortFourniCompo newW) {
		w = newW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.LIEN_ATTACHEMENT_XREQUEST__CALLER_ROLEFROM:
				return getCaller_rolefrom();
			case HADLM1Package.LIEN_ATTACHEMENT_XREQUEST__W:
				return getW();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HADLM1Package.LIEN_ATTACHEMENT_XREQUEST__CALLER_ROLEFROM:
				setCaller_rolefrom((caller_RoleFrom)newValue);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_XREQUEST__W:
				setW((Send_request_PortFourniCompo)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HADLM1Package.LIEN_ATTACHEMENT_XREQUEST__CALLER_ROLEFROM:
				setCaller_rolefrom((caller_RoleFrom)null);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_XREQUEST__W:
				setW((Send_request_PortFourniCompo)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HADLM1Package.LIEN_ATTACHEMENT_XREQUEST__CALLER_ROLEFROM:
				return caller_rolefrom != null;
			case HADLM1Package.LIEN_ATTACHEMENT_XREQUEST__W:
				return w != null;
		}
		return super.eIsSet(featureID);
	}

} // LienAttachementXRequest
