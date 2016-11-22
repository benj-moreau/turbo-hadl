/**
 */
package hADLM1;

import hADL.Liens.LienBindingFourni;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Serveur Fourni Compo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.BindingServeurFourniCompo#getAnswerrequest_portfourni <em>Answerrequest portfourni</em>}</li>
 *   <li>{@link hADLM1.BindingServeurFourniCompo#getAnswerrequest_portfournicompo <em>Answerrequest portfournicompo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingServeurFourniCompo extends LienBindingFourni {
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
	 * The cached value of the '{@link #getAnswerrequest_portfournicompo() <em>Answerrequest portfournicompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerrequest_portfournicompo()
	 * @generated
	 * @ordered
	 */
	protected AnswerRequest_PortFourniCompo answerrequest_portfournicompo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingServeurFourniCompo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.BINDING_SERVEUR_FOURNI_COMPO;
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
	 * Sets the value of the '{@link hADLM1.BindingServeurFourniCompo#getAnswerrequest_portfourni <em>Answerrequest portfourni</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Answerrequest portfournicompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answerrequest portfournicompo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answerrequest portfournicompo</em>' containment reference.
	 * @see #setAnswerrequest_portfournicompo(AnswerRequest_PortFourniCompo)
	 * @generated
	 */
	public AnswerRequest_PortFourniCompo getAnswerrequest_portfournicompo() {
		return answerrequest_portfournicompo;
	}

	/**
	 * Sets the value of the '{@link hADLM1.BindingServeurFourniCompo#getAnswerrequest_portfournicompo <em>Answerrequest portfournicompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answerrequest portfournicompo</em>' containment reference.
	 * @see #getAnswerrequest_portfournicompo()
	 * @generated
	 */
	public void setAnswerrequest_portfournicompo(AnswerRequest_PortFourniCompo newAnswerrequest_portfournicompo) {
		answerrequest_portfournicompo = newAnswerrequest_portfournicompo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.BINDING_SERVEUR_FOURNI_COMPO__ANSWERREQUEST_PORTFOURNI:
				return getAnswerrequest_portfourni();
			case HADLM1Package.BINDING_SERVEUR_FOURNI_COMPO__ANSWERREQUEST_PORTFOURNICOMPO:
				return getAnswerrequest_portfournicompo();
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
			case HADLM1Package.BINDING_SERVEUR_FOURNI_COMPO__ANSWERREQUEST_PORTFOURNI:
				setAnswerrequest_portfourni((AnswerRequest_PortFourni)newValue);
				return;
			case HADLM1Package.BINDING_SERVEUR_FOURNI_COMPO__ANSWERREQUEST_PORTFOURNICOMPO:
				setAnswerrequest_portfournicompo((AnswerRequest_PortFourniCompo)newValue);
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
			case HADLM1Package.BINDING_SERVEUR_FOURNI_COMPO__ANSWERREQUEST_PORTFOURNI:
				setAnswerrequest_portfourni((AnswerRequest_PortFourni)null);
				return;
			case HADLM1Package.BINDING_SERVEUR_FOURNI_COMPO__ANSWERREQUEST_PORTFOURNICOMPO:
				setAnswerrequest_portfournicompo((AnswerRequest_PortFourniCompo)null);
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
			case HADLM1Package.BINDING_SERVEUR_FOURNI_COMPO__ANSWERREQUEST_PORTFOURNI:
				return answerrequest_portfourni != null;
			case HADLM1Package.BINDING_SERVEUR_FOURNI_COMPO__ANSWERREQUEST_PORTFOURNICOMPO:
				return answerrequest_portfournicompo != null;
		}
		return super.eIsSet(featureID);
	}

} // BindingServeurFourniCompo
