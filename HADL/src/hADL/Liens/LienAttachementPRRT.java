/**
 */
package hADL.Liens;

import hADL.Interfaces.Interface;
import hADL.Interfaces.PortRequisCompo;
import hADL.Roles.RoleTo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 * @see hADL.Liens.LiensPackage#getLienAttachementPRRT()
 * @model kind="class"
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
	 * @see hADL.Liens.LiensPackage#getLienAttachementPRRT_Portrequis()
	 * @model containment="true" required="true"
	 *        extendedMetaData="namespace=''"
	 * @generated
	 */
	public PortRequisCompo getPortrequis() {
		return portrequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortrequis(PortRequisCompo newPortrequis, NotificationChain msgs) {
		PortRequisCompo oldPortrequis = portrequis;
		portrequis = newPortrequis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LiensPackage.LIEN_ATTACHEMENT_PRRT__PORTREQUIS, oldPortrequis, newPortrequis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
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
		if (newPortrequis != portrequis) {
			NotificationChain msgs = null;
			if (portrequis != null)
				msgs = ((InternalEObject)portrequis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LiensPackage.LIEN_ATTACHEMENT_PRRT__PORTREQUIS, null, msgs);
			if (newPortrequis != null)
				msgs = ((InternalEObject)newPortrequis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LiensPackage.LIEN_ATTACHEMENT_PRRT__PORTREQUIS, null, msgs);
			msgs = basicSetPortrequis(newPortrequis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LiensPackage.LIEN_ATTACHEMENT_PRRT__PORTREQUIS, newPortrequis, newPortrequis));
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
	 * @see hADL.Liens.LiensPackage#getLienAttachementPRRT_Roleto()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public RoleTo getRoleto() {
		return roleto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleto(RoleTo newRoleto, NotificationChain msgs) {
		RoleTo oldRoleto = roleto;
		roleto = newRoleto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LiensPackage.LIEN_ATTACHEMENT_PRRT__ROLETO, oldRoleto, newRoleto);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
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
		if (newRoleto != roleto) {
			NotificationChain msgs = null;
			if (roleto != null)
				msgs = ((InternalEObject)roleto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LiensPackage.LIEN_ATTACHEMENT_PRRT__ROLETO, null, msgs);
			if (newRoleto != null)
				msgs = ((InternalEObject)newRoleto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LiensPackage.LIEN_ATTACHEMENT_PRRT__ROLETO, null, msgs);
			msgs = basicSetRoleto(newRoleto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LiensPackage.LIEN_ATTACHEMENT_PRRT__ROLETO, newRoleto, newRoleto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LiensPackage.LIEN_ATTACHEMENT_PRRT__PORTREQUIS:
				return basicSetPortrequis(null, msgs);
			case LiensPackage.LIEN_ATTACHEMENT_PRRT__ROLETO:
				return basicSetRoleto(null, msgs);
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
		return portrequis;
	}

} // LienAttachementPRRT
