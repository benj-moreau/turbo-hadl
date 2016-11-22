/**
 */
package hADLM1;

import hADL.Liens.LienAttachementPFRF;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Attachement XAnswer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.LienAttachementXAnswer#getCalleranswer_rolefrom <em>Calleranswer rolefrom</em>}</li>
 *   <li>{@link hADLM1.LienAttachementXAnswer#getAnswerrequest_portfournicompo <em>Answerrequest portfournicompo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienAttachementXAnswer extends LienAttachementPFRF {
	/**
	 * The cached value of the '{@link #getCalleranswer_rolefrom() <em>Calleranswer rolefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalleranswer_rolefrom()
	 * @generated
	 * @ordered
	 */
	protected callerAnswer_RoleFrom calleranswer_rolefrom;

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
	protected LienAttachementXAnswer() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.LIEN_ATTACHEMENT_XANSWER;
	}

	/**
	 * Returns the value of the '<em><b>Calleranswer rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calleranswer rolefrom</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calleranswer rolefrom</em>' containment reference.
	 * @see #setCalleranswer_rolefrom(callerAnswer_RoleFrom)
	 * @generated
	 */
	public callerAnswer_RoleFrom getCalleranswer_rolefrom() {
		return calleranswer_rolefrom;
	}

	/**
	 * Sets the value of the '{@link hADLM1.LienAttachementXAnswer#getCalleranswer_rolefrom <em>Calleranswer rolefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calleranswer rolefrom</em>' containment reference.
	 * @see #getCalleranswer_rolefrom()
	 * @generated
	 */
	public void setCalleranswer_rolefrom(callerAnswer_RoleFrom newCalleranswer_rolefrom) {
		calleranswer_rolefrom = newCalleranswer_rolefrom;
	}

	/**
	 * Returns the value of the '<em><b>Answerrequest portfournicompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answerrequest portfournicompo</em>' containment reference list isn't clear,
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
	 * Sets the value of the '{@link hADLM1.LienAttachementXAnswer#getAnswerrequest_portfournicompo <em>Answerrequest portfournicompo</em>}' containment reference.
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
			case HADLM1Package.LIEN_ATTACHEMENT_XANSWER__CALLERANSWER_ROLEFROM:
				return getCalleranswer_rolefrom();
			case HADLM1Package.LIEN_ATTACHEMENT_XANSWER__ANSWERREQUEST_PORTFOURNICOMPO:
				return getAnswerrequest_portfournicompo();
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
			case HADLM1Package.LIEN_ATTACHEMENT_XANSWER__CALLERANSWER_ROLEFROM:
				setCalleranswer_rolefrom((callerAnswer_RoleFrom)newValue);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_XANSWER__ANSWERREQUEST_PORTFOURNICOMPO:
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
			case HADLM1Package.LIEN_ATTACHEMENT_XANSWER__CALLERANSWER_ROLEFROM:
				setCalleranswer_rolefrom((callerAnswer_RoleFrom)null);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_XANSWER__ANSWERREQUEST_PORTFOURNICOMPO:
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
			case HADLM1Package.LIEN_ATTACHEMENT_XANSWER__CALLERANSWER_ROLEFROM:
				return calleranswer_rolefrom != null;
			case HADLM1Package.LIEN_ATTACHEMENT_XANSWER__ANSWERREQUEST_PORTFOURNICOMPO:
				return answerrequest_portfournicompo != null;
		}
		return super.eIsSet(featureID);
	}

} // LienAttachementXAnswer
