/**
 */
package hADLM1;

import hADL.Liens.LienAttachementPRRT;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Attachement YAnswer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.LienAttachementYAnswer#getCalledanswer_roleto <em>Calledanswer roleto</em>}</li>
 *   <li>{@link hADLM1.LienAttachementYAnswer#getAnswerrequest_portrequiscompo <em>Answerrequest portrequiscompo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienAttachementYAnswer extends LienAttachementPRRT {
	/**
	 * The cached value of the '{@link #getCalledanswer_roleto() <em>Calledanswer roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledanswer_roleto()
	 * @generated
	 * @ordered
	 */
	protected calledAnswer_RoleTo calledanswer_roleto;

	/**
	 * The cached value of the '{@link #getAnswerrequest_portrequiscompo() <em>Answerrequest portrequiscompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerrequest_portrequiscompo()
	 * @generated
	 * @ordered
	 */
	protected AnswerRequest_PortRequisCompo answerrequest_portrequiscompo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienAttachementYAnswer() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.LIEN_ATTACHEMENT_YANSWER;
	}

	/**
	 * Returns the value of the '<em><b>Calledanswer roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calledanswer roleto</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calledanswer roleto</em>' containment reference.
	 * @see #setCalledanswer_roleto(calledAnswer_RoleTo)
	 * @generated
	 */
	public calledAnswer_RoleTo getCalledanswer_roleto() {
		return calledanswer_roleto;
	}

	/**
	 * Sets the value of the '{@link hADLM1.LienAttachementYAnswer#getCalledanswer_roleto <em>Calledanswer roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calledanswer roleto</em>' containment reference.
	 * @see #getCalledanswer_roleto()
	 * @generated
	 */
	public void setCalledanswer_roleto(calledAnswer_RoleTo newCalledanswer_roleto) {
		calledanswer_roleto = newCalledanswer_roleto;
	}

	/**
	 * Returns the value of the '<em><b>Answerrequest portrequiscompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answerrequest portrequiscompo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answerrequest portrequiscompo</em>' containment reference.
	 * @see #setAnswerrequest_portrequiscompo(AnswerRequest_PortRequisCompo)
	 * @generated
	 */
	public AnswerRequest_PortRequisCompo getAnswerrequest_portrequiscompo() {
		return answerrequest_portrequiscompo;
	}

	/**
	 * Sets the value of the '{@link hADLM1.LienAttachementYAnswer#getAnswerrequest_portrequiscompo <em>Answerrequest portrequiscompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answerrequest portrequiscompo</em>' containment reference.
	 * @see #getAnswerrequest_portrequiscompo()
	 * @generated
	 */
	public void setAnswerrequest_portrequiscompo(AnswerRequest_PortRequisCompo newAnswerrequest_portrequiscompo) {
		answerrequest_portrequiscompo = newAnswerrequest_portrequiscompo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.LIEN_ATTACHEMENT_YANSWER__CALLEDANSWER_ROLETO:
				return getCalledanswer_roleto();
			case HADLM1Package.LIEN_ATTACHEMENT_YANSWER__ANSWERREQUEST_PORTREQUISCOMPO:
				return getAnswerrequest_portrequiscompo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HADLM1Package.LIEN_ATTACHEMENT_YANSWER__CALLEDANSWER_ROLETO:
				setCalledanswer_roleto((calledAnswer_RoleTo)newValue);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_YANSWER__ANSWERREQUEST_PORTREQUISCOMPO:
				setAnswerrequest_portrequiscompo((AnswerRequest_PortRequisCompo)newValue);
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
			case HADLM1Package.LIEN_ATTACHEMENT_YANSWER__CALLEDANSWER_ROLETO:
				setCalledanswer_roleto((calledAnswer_RoleTo)null);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_YANSWER__ANSWERREQUEST_PORTREQUISCOMPO:
				setAnswerrequest_portrequiscompo((AnswerRequest_PortRequisCompo)null);
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
			case HADLM1Package.LIEN_ATTACHEMENT_YANSWER__CALLEDANSWER_ROLETO:
				return calledanswer_roleto != null;
			case HADLM1Package.LIEN_ATTACHEMENT_YANSWER__ANSWERREQUEST_PORTREQUISCOMPO:
				return answerrequest_portrequiscompo != null;
		}
		return super.eIsSet(featureID);
	}

} // LienAttachementYAnswer
