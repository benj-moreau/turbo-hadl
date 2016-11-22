/**
 */
package hADL.Liens;

import hADL.Interfaces.PortRequisCompo;
import hADL.Interfaces.PortRequisConfig;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Binding Requis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADL.Liens.LienBindingRequis#getPortrequiscompo <em>Portrequiscompo</em>}</li>
 *   <li>{@link hADL.Liens.LienBindingRequis#getPortrequisconfig <em>Portrequisconfig</em>}</li>
 * </ul>
 *
 * @see hADL.Liens.LiensPackage#getLienBindingRequis()
 * @model kind="class"
 * @generated
 */
public class LienBindingRequis extends LienBinding {
	/**
	 * The cached value of the '{@link #getPortrequiscompo() <em>Portrequiscompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequiscompo()
	 * @generated
	 * @ordered
	 */
	protected PortRequisCompo portrequiscompo;

	/**
	 * The cached value of the '{@link #getPortrequisconfig() <em>Portrequisconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequisconfig()
	 * @generated
	 * @ordered
	 */
	protected PortRequisConfig portrequisconfig;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienBindingRequis() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LiensPackage.Literals.LIEN_BINDING_REQUIS;
	}

	/**
	 * Returns the value of the '<em><b>Portrequiscompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequiscompo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequiscompo</em>' containment reference.
	 * @see #setPortrequiscompo(PortRequisCompo)
	 * @see hADL.Liens.LiensPackage#getLienBindingRequis_Portrequiscompo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public PortRequisCompo getPortrequiscompo() {
		return portrequiscompo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortrequiscompo(PortRequisCompo newPortrequiscompo, NotificationChain msgs) {
		PortRequisCompo oldPortrequiscompo = portrequiscompo;
		portrequiscompo = newPortrequiscompo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCOMPO, oldPortrequiscompo, newPortrequiscompo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link hADL.Liens.LienBindingRequis#getPortrequiscompo <em>Portrequiscompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portrequiscompo</em>' containment reference.
	 * @see #getPortrequiscompo()
	 * @generated
	 */
	public void setPortrequiscompo(PortRequisCompo newPortrequiscompo) {
		if (newPortrequiscompo != portrequiscompo) {
			NotificationChain msgs = null;
			if (portrequiscompo != null)
				msgs = ((InternalEObject)portrequiscompo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCOMPO, null, msgs);
			if (newPortrequiscompo != null)
				msgs = ((InternalEObject)newPortrequiscompo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCOMPO, null, msgs);
			msgs = basicSetPortrequiscompo(newPortrequiscompo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCOMPO, newPortrequiscompo, newPortrequiscompo));
	}

	/**
	 * Returns the value of the '<em><b>Portrequisconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequisconfig</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequisconfig</em>' containment reference.
	 * @see #setPortrequisconfig(PortRequisConfig)
	 * @see hADL.Liens.LiensPackage#getLienBindingRequis_Portrequisconfig()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public PortRequisConfig getPortrequisconfig() {
		return portrequisconfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortrequisconfig(PortRequisConfig newPortrequisconfig, NotificationChain msgs) {
		PortRequisConfig oldPortrequisconfig = portrequisconfig;
		portrequisconfig = newPortrequisconfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCONFIG, oldPortrequisconfig, newPortrequisconfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link hADL.Liens.LienBindingRequis#getPortrequisconfig <em>Portrequisconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portrequisconfig</em>' containment reference.
	 * @see #getPortrequisconfig()
	 * @generated
	 */
	public void setPortrequisconfig(PortRequisConfig newPortrequisconfig) {
		if (newPortrequisconfig != portrequisconfig) {
			NotificationChain msgs = null;
			if (portrequisconfig != null)
				msgs = ((InternalEObject)portrequisconfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCONFIG, null, msgs);
			if (newPortrequisconfig != null)
				msgs = ((InternalEObject)newPortrequisconfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCONFIG, null, msgs);
			msgs = basicSetPortrequisconfig(newPortrequisconfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCONFIG, newPortrequisconfig, newPortrequisconfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCOMPO:
				return basicSetPortrequiscompo(null, msgs);
			case LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCONFIG:
				return basicSetPortrequisconfig(null, msgs);
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
			case LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCOMPO:
				return getPortrequiscompo();
			case LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCONFIG:
				return getPortrequisconfig();
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
			case LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCOMPO:
				setPortrequiscompo((PortRequisCompo)newValue);
				return;
			case LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCONFIG:
				setPortrequisconfig((PortRequisConfig)newValue);
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
			case LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCOMPO:
				setPortrequiscompo((PortRequisCompo)null);
				return;
			case LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCONFIG:
				setPortrequisconfig((PortRequisConfig)null);
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
			case LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCOMPO:
				return portrequiscompo != null;
			case LiensPackage.LIEN_BINDING_REQUIS__PORTREQUISCONFIG:
				return portrequisconfig != null;
		}
		return super.eIsSet(featureID);
	}

} // LienBindingRequis
