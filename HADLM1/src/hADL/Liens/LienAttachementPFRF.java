/**
 */
package hADL.Liens;

import hADL.Interfaces.Interface;
import hADL.Interfaces.PortFourniCompo;

import hADL.Roles.RoleFrom;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Attachement PFRF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADL.Liens.LienAttachementPFRF#getPortfourni <em>Portfourni</em>}</li>
 *   <li>{@link hADL.Liens.LienAttachementPFRF#getRolefrom <em>Rolefrom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienAttachementPFRF extends LienAttachement {
	/**
	 * The cached value of the '{@link #getPortfourni() <em>Portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfourni()
	 * @generated
	 * @ordered
	 */
	protected PortFourniCompo portfourni;

	/**
	 * The cached value of the '{@link #getRolefrom() <em>Rolefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefrom()
	 * @generated
	 * @ordered
	 */
	protected RoleFrom rolefrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienAttachementPFRF() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LiensPackage.Literals.LIEN_ATTACHEMENT_PFRF;
	}

	/**
	 * Returns the value of the '<em><b>Portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfourni</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfourni</em>' containment reference.
	 * @see #setPortfourni(PortFourniCompo)
	 * @generated
	 */
	public PortFourniCompo getPortfourni() {
		return portfourni;
	}

	/**
	 * Sets the value of the '{@link hADL.Liens.LienAttachementPFRF#getPortfourni <em>Portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portfourni</em>' containment reference.
	 * @see #getPortfourni()
	 * @generated
	 */
	public void setPortfourni(PortFourniCompo newPortfourni) {
		portfourni = newPortfourni;
	}

	/**
	 * Returns the value of the '<em><b>Rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolefrom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolefrom</em>' containment reference.
	 * @see #setRolefrom(RoleFrom)
	 * @generated
	 */
	public RoleFrom getRolefrom() {
		return rolefrom;
	}

	/**
	 * Sets the value of the '{@link hADL.Liens.LienAttachementPFRF#getRolefrom <em>Rolefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolefrom</em>' containment reference.
	 * @see #getRolefrom()
	 * @generated
	 */
	public void setRolefrom(RoleFrom newRolefrom) {
		rolefrom = newRolefrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LiensPackage.LIEN_ATTACHEMENT_PFRF__PORTFOURNI:
				return getPortfourni();
			case LiensPackage.LIEN_ATTACHEMENT_PFRF__ROLEFROM:
				return getRolefrom();
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
			case LiensPackage.LIEN_ATTACHEMENT_PFRF__PORTFOURNI:
				setPortfourni((PortFourniCompo)newValue);
				return;
			case LiensPackage.LIEN_ATTACHEMENT_PFRF__ROLEFROM:
				setRolefrom((RoleFrom)newValue);
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
			case LiensPackage.LIEN_ATTACHEMENT_PFRF__PORTFOURNI:
				setPortfourni((PortFourniCompo)null);
				return;
			case LiensPackage.LIEN_ATTACHEMENT_PFRF__ROLEFROM:
				setRolefrom((RoleFrom)null);
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
			case LiensPackage.LIEN_ATTACHEMENT_PFRF__PORTFOURNI:
				return portfourni != null;
			case LiensPackage.LIEN_ATTACHEMENT_PFRF__ROLEFROM:
				return rolefrom != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Interface getFrom() {
		return portfourni;
	}

	@Override
	public Interface getTo() {
		// TODO Auto-generated method stub
		return rolefrom;
	}

} // LienAttachementPFRF
