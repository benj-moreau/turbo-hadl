/**
 */
package hADL.Liens.util;

import hADL.Liens.*;

import hADL.Objet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hADL.Liens.LiensPackage
 * @generated
 */
public class LiensSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LiensPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiensSwitch() {
		if (modelPackage == null) {
			modelPackage = LiensPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LiensPackage.LIEN_BINDING_FOURNI: {
				LienBindingFourni lienBindingFourni = (LienBindingFourni)theEObject;
				T result = caseLienBindingFourni(lienBindingFourni);
				if (result == null) result = caseLienBinding(lienBindingFourni);
				if (result == null) result = caseLien(lienBindingFourni);
				if (result == null) result = caseObjet(lienBindingFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiensPackage.LIEN_BINDING_REQUIS: {
				LienBindingRequis lienBindingRequis = (LienBindingRequis)theEObject;
				T result = caseLienBindingRequis(lienBindingRequis);
				if (result == null) result = caseLienBinding(lienBindingRequis);
				if (result == null) result = caseLien(lienBindingRequis);
				if (result == null) result = caseObjet(lienBindingRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiensPackage.LIEN_ATTACHEMENT: {
				LienAttachement lienAttachement = (LienAttachement)theEObject;
				T result = caseLienAttachement(lienAttachement);
				if (result == null) result = caseLien(lienAttachement);
				if (result == null) result = caseObjet(lienAttachement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiensPackage.LIEN_ATTACHEMENT_PFRF: {
				LienAttachementPFRF lienAttachementPFRF = (LienAttachementPFRF)theEObject;
				T result = caseLienAttachementPFRF(lienAttachementPFRF);
				if (result == null) result = caseLienAttachement(lienAttachementPFRF);
				if (result == null) result = caseLien(lienAttachementPFRF);
				if (result == null) result = caseObjet(lienAttachementPFRF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiensPackage.LIEN: {
				Lien lien = (Lien)theEObject;
				T result = caseLien(lien);
				if (result == null) result = caseObjet(lien);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiensPackage.LIEN_BINDING: {
				LienBinding lienBinding = (LienBinding)theEObject;
				T result = caseLienBinding(lienBinding);
				if (result == null) result = caseLien(lienBinding);
				if (result == null) result = caseObjet(lienBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LiensPackage.LIEN_ATTACHEMENT_PRRT: {
				LienAttachementPRRT lienAttachementPRRT = (LienAttachementPRRT)theEObject;
				T result = caseLienAttachementPRRT(lienAttachementPRRT);
				if (result == null) result = caseLienAttachement(lienAttachementPRRT);
				if (result == null) result = caseLien(lienAttachementPRRT);
				if (result == null) result = caseObjet(lienAttachementPRRT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Binding Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Binding Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienBindingFourni(LienBindingFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Binding Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Binding Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienBindingRequis(LienBindingRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachement(LienAttachement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement PFRF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement PFRF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementPFRF(LienAttachementPFRF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLien(Lien object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienBinding(LienBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Attachement PRRT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Attachement PRRT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienAttachementPRRT(LienAttachementPRRT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjet(Objet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LiensSwitch
