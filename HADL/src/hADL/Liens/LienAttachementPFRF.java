/**
 */
package hADL.Liens;

import hADL.Interfaces.Interface;
import hADL.Interfaces.PortFourniCompo;

import hADL.Roles.RoleFrom;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 * @see hADL.Liens.LiensPackage#getLienAttachementPFRF()
 * @model kind="class"
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
	 * @see hADL.Liens.LiensPackage#getLienAttachementPFRF_Portfourni()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public PortFourniCompo getPortfourni() {
		return portfourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortfourni(PortFourniCompo newPortfourni, NotificationChain msgs) {
		PortFourniCompo oldPortfourni = portfourni;
		portfourni = newPortfourni;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LiensPackage.LIEN_ATTACHEMENT_PFRF__PORTFOURNI, oldPortfourni, newPortfourni);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
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
		if (newPortfourni != portfourni) {
			NotificationChain msgs = null;
			if (portfourni != null)
				msgs = ((InternalEObject)portfourni).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LiensPackage.LIEN_ATTACHEMENT_PFRF__PORTFOURNI, null, msgs);
			if (newPortfourni != null)
				msgs = ((InternalEObject)newPortfourni).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LiensPackage.LIEN_ATTACHEMENT_PFRF__PORTFOURNI, null, msgs);
			msgs = basicSetPortfourni(newPortfourni, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LiensPackage.LIEN_ATTACHEMENT_PFRF__PORTFOURNI, newPortfourni, newPortfourni));
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
	 * @see hADL.Liens.LiensPackage#getLienAttachementPFRF_Rolefrom()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public RoleFrom getRolefrom() {
		return rolefrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolefrom(RoleFrom newRolefrom, NotificationChain msgs) {
		RoleFrom oldRolefrom = rolefrom;
		rolefrom = newRolefrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LiensPackage.LIEN_ATTACHEMENT_PFRF__ROLEFROM, oldRolefrom, newRolefrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
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
		if (newRolefrom != rolefrom) {
			NotificationChain msgs = null;
			if (rolefrom != null)
				msgs = ((InternalEObject)rolefrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LiensPackage.LIEN_ATTACHEMENT_PFRF__ROLEFROM, null, msgs);
			if (newRolefrom != null)
				msgs = ((InternalEObject)newRolefrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LiensPackage.LIEN_ATTACHEMENT_PFRF__ROLEFROM, null, msgs);
			msgs = basicSetRolefrom(newRolefrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LiensPackage.LIEN_ATTACHEMENT_PFRF__ROLEFROM, newRolefrom, newRolefrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LiensPackage.LIEN_ATTACHEMENT_PFRF__PORTFOURNI:
				return basicSetPortfourni(null, msgs);
			case LiensPackage.LIEN_ATTACHEMENT_PFRF__ROLEFROM:
				return basicSetRolefrom(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		return rolefrom;
	}

} // LienAttachementPFRF
