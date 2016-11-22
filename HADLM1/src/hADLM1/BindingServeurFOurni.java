/**
 */
package hADLM1;

import hADL.Liens.LienBindingFourni;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Serveur FOurni</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.BindingServeurFOurni#getExternalsocket_portfourni <em>Externalsocket portfourni</em>}</li>
 *   <li>{@link hADLM1.BindingServeurFOurni#getAnswerrequest_portfourni <em>Answerrequest portfourni</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingServeurFOurni extends LienBindingFourni {
	/**
	 * The cached value of the '{@link #getExternalsocket_portfourni() <em>Externalsocket portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalsocket_portfourni()
	 * @generated
	 * @ordered
	 */
	protected ExternalSocket_PortFourni externalsocket_portfourni;

	/**
	 * The cached value of the '{@link #getAnswerrequest_portfourni() <em>Answerrequest portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerrequest_portfourni()
	 * @generated
	 * @ordered
	 */
	protected AnswerRequest_PortFourni answerrequest_portfourni;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingServeurFOurni() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.BINDING_SERVEUR_FOURNI;
	}

	/**
	 * Returns the value of the '<em><b>Externalsocket portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Externalsocket portfourni</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externalsocket portfourni</em>' containment reference.
	 * @see #setExternalsocket_portfourni(ExternalSocket_PortFourni)
	 * @generated
	 */
	public ExternalSocket_PortFourni getExternalsocket_portfourni() {
		return externalsocket_portfourni;
	}

	/**
	 * Sets the value of the '{@link hADLM1.BindingServeurFOurni#getExternalsocket_portfourni <em>Externalsocket portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Externalsocket portfourni</em>' containment reference.
	 * @see #getExternalsocket_portfourni()
	 * @generated
	 */
	public void setExternalsocket_portfourni(ExternalSocket_PortFourni newExternalsocket_portfourni) {
		externalsocket_portfourni = newExternalsocket_portfourni;
	}

	/**
	 * Returns the value of the '<em><b>Answerrequest portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answerrequest portfourni</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answerrequest portfourni</em>' containment reference.
	 * @see #setAnswerrequest_portfourni(AnswerRequest_PortFourni)
	 * @generated
	 */
	public AnswerRequest_PortFourni getAnswerrequest_portfourni() {
		return answerrequest_portfourni;
	}

	/**
	 * Sets the value of the '{@link hADLM1.BindingServeurFOurni#getAnswerrequest_portfourni <em>Answerrequest portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answerrequest portfourni</em>' containment reference.
	 * @see #getAnswerrequest_portfourni()
	 * @generated
	 */
	public void setAnswerrequest_portfourni(AnswerRequest_PortFourni newAnswerrequest_portfourni) {
		answerrequest_portfourni = newAnswerrequest_portfourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.BINDING_SERVEUR_FOURNI__EXTERNALSOCKET_PORTFOURNI:
				return getExternalsocket_portfourni();
			case HADLM1Package.BINDING_SERVEUR_FOURNI__ANSWERREQUEST_PORTFOURNI:
				return getAnswerrequest_portfourni();
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
			case HADLM1Package.BINDING_SERVEUR_FOURNI__EXTERNALSOCKET_PORTFOURNI:
				setExternalsocket_portfourni((ExternalSocket_PortFourni)newValue);
				return;
			case HADLM1Package.BINDING_SERVEUR_FOURNI__ANSWERREQUEST_PORTFOURNI:
				setAnswerrequest_portfourni((AnswerRequest_PortFourni)newValue);
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
			case HADLM1Package.BINDING_SERVEUR_FOURNI__EXTERNALSOCKET_PORTFOURNI:
				setExternalsocket_portfourni((ExternalSocket_PortFourni)null);
				return;
			case HADLM1Package.BINDING_SERVEUR_FOURNI__ANSWERREQUEST_PORTFOURNI:
				setAnswerrequest_portfourni((AnswerRequest_PortFourni)null);
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
			case HADLM1Package.BINDING_SERVEUR_FOURNI__EXTERNALSOCKET_PORTFOURNI:
				return externalsocket_portfourni != null;
			case HADLM1Package.BINDING_SERVEUR_FOURNI__ANSWERREQUEST_PORTFOURNI:
				return answerrequest_portfourni != null;
		}
		return super.eIsSet(featureID);
	}

} // BindingServeurFOurni
