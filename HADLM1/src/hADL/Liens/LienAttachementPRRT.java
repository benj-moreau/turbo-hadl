/**
 */
package hADL.Liens;

import hADL.Interfaces.Interface;
import hADL.Interfaces.PortRequisCompo;

import hADL.Roles.RoleTo;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Attachement PRRT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADL.Liens.LienAttachementPRRT#getPortrequis <em>Portrequis</em>}</li>
 *   <li>{@link hADL.Liens.LienAttachementPRRT#getRoleto <em>Roleto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienAttachementPRRT extends LienAttachement {
	/**
	 * The cached value of the '{@link #getPortrequis() <em>Portrequis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequis()
	 * @generated
	 * @ordered
	 */
	protected PortRequisCompo portrequis;

	/**
	 * The cached value of the '{@link #getRoleto() <em>Roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleto()
	 * @generated
	 * @ordered
	 */
	protected RoleTo roleto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienAttachementPRRT() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LiensPackage.Literals.LIEN_ATTACHEMENT_PRRT;
	}

	/**
	 * Returns the value of the '<em><b>Portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequis</em>' containment reference.
	 * @see #setPortrequis(PortRequisCompo)
	 * @generated
	 */
	public PortRequisCompo getPortrequis() {
		return portrequis;
	}

	/**
	 * Sets the value of the '{@link hADL.Liens.LienAttachementPRRT#getPortrequis <em>Portrequis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portrequis</em>' containment reference.
	 * @see #getPortrequis()
	 * @generated
	 */
	public void setPortrequis(PortRequisCompo newPortrequis) {
		portrequis = newPortrequis;
	}

	/**
	 * Returns the value of the '<em><b>Roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roleto</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roleto</em>' containment reference.
	 * @see #setRoleto(RoleTo)
	 * @generated
	 */
	public RoleTo getRoleto() {
		return roleto;
	}

	/**
	 * Sets the value of the '{@link hADL.Liens.LienAttachementPRRT#getRoleto <em>Roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roleto</em>' containment reference.
	 * @see #getRoleto()
	 * @generated
	 */
	public void setRoleto(RoleTo newRoleto) {
		roleto = newRoleto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LiensPackage.LIEN_ATTACHEMENT_PRRT__PORTREQUIS:
				return getPortrequis();
			case LiensPackage.LIEN_ATTACHEMENT_PRRT__ROLETO:
				return getRoleto();
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
			case LiensPackage.LIEN_ATTACHEMENT_PRRT__PORTREQUIS:
				setPortrequis((PortRequisCompo)newValue);
				return;
			case LiensPackage.LIEN_ATTACHEMENT_PRRT__ROLETO:
				setRoleto((RoleTo)newValue);
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
			case LiensPackage.LIEN_ATTACHEMENT_PRRT__PORTREQUIS:
				setPortrequis((PortRequisCompo)null);
				return;
			case LiensPackage.LIEN_ATTACHEMENT_PRRT__ROLETO:
				setRoleto((RoleTo)null);
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
			case LiensPackage.LIEN_ATTACHEMENT_PRRT__PORTREQUIS:
				return portrequis != null;
			case LiensPackage.LIEN_ATTACHEMENT_PRRT__ROLETO:
				return roleto != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Interface getFrom() {
		
		return roleto;
	}

	@Override
	public Interface getTo() {
		return portrequis;
	}

} // LienAttachementPRRT
