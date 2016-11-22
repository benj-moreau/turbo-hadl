/**
 */
package hADLM1;

import hADL.Liens.LienAttachementPRRT;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Attachement YRequest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.LienAttachementYRequest#getCalled_roleto <em>Called roleto</em>}</li>
 *   <li>{@link hADLM1.LienAttachementYRequest#getReceive_request_portrequiscompo <em>Receive request portrequiscompo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienAttachementYRequest extends LienAttachementPRRT {
	/**
	 * The cached value of the '{@link #getCalled_roleto() <em>Called roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalled_roleto()
	 * @generated
	 * @ordered
	 */
	protected called_RoleTo called_roleto;

	/**
	 * The cached value of the '{@link #getReceive_request_portrequiscompo() <em>Receive request portrequiscompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceive_request_portrequiscompo()
	 * @generated
	 * @ordered
	 */
	protected Receive_request_PortRequisCompo receive_request_portrequiscompo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienAttachementYRequest() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.LIEN_ATTACHEMENT_YREQUEST;
	}

	/**
	 * Returns the value of the '<em><b>Called roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called roleto</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called roleto</em>' containment reference.
	 * @see #setCalled_roleto(called_RoleTo)
	 * @generated
	 */
	public called_RoleTo getCalled_roleto() {
		return called_roleto;
	}

	/**
	 * Sets the value of the '{@link hADLM1.LienAttachementYRequest#getCalled_roleto <em>Called roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called roleto</em>' containment reference.
	 * @see #getCalled_roleto()
	 * @generated
	 */
	public void setCalled_roleto(called_RoleTo newCalled_roleto) {
		called_roleto = newCalled_roleto;
	}

	/**
	 * Returns the value of the '<em><b>Receive request portrequiscompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive request portrequiscompo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive request portrequiscompo</em>' containment reference.
	 * @see #setReceive_request_portrequiscompo(Receive_request_PortRequisCompo)
	 * @generated
	 */
	public Receive_request_PortRequisCompo getReceive_request_portrequiscompo() {
		return receive_request_portrequiscompo;
	}

	/**
	 * Sets the value of the '{@link hADLM1.LienAttachementYRequest#getReceive_request_portrequiscompo <em>Receive request portrequiscompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive request portrequiscompo</em>' containment reference.
	 * @see #getReceive_request_portrequiscompo()
	 * @generated
	 */
	public void setReceive_request_portrequiscompo(Receive_request_PortRequisCompo newReceive_request_portrequiscompo) {
		receive_request_portrequiscompo = newReceive_request_portrequiscompo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.LIEN_ATTACHEMENT_YREQUEST__CALLED_ROLETO:
				return getCalled_roleto();
			case HADLM1Package.LIEN_ATTACHEMENT_YREQUEST__RECEIVE_REQUEST_PORTREQUISCOMPO:
				return getReceive_request_portrequiscompo();
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
			case HADLM1Package.LIEN_ATTACHEMENT_YREQUEST__CALLED_ROLETO:
				setCalled_roleto((called_RoleTo)newValue);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_YREQUEST__RECEIVE_REQUEST_PORTREQUISCOMPO:
				setReceive_request_portrequiscompo((Receive_request_PortRequisCompo)newValue);
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
			case HADLM1Package.LIEN_ATTACHEMENT_YREQUEST__CALLED_ROLETO:
				setCalled_roleto((called_RoleTo)null);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_YREQUEST__RECEIVE_REQUEST_PORTREQUISCOMPO:
				setReceive_request_portrequiscompo((Receive_request_PortRequisCompo)null);
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
			case HADLM1Package.LIEN_ATTACHEMENT_YREQUEST__CALLED_ROLETO:
				return called_roleto != null;
			case HADLM1Package.LIEN_ATTACHEMENT_YREQUEST__RECEIVE_REQUEST_PORTREQUISCOMPO:
				return receive_request_portrequiscompo != null;
		}
		return super.eIsSet(featureID);
	}

} // LienAttachementYRequest
