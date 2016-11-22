/**
 */
package hADL.Liens;

import hADL.Interfaces.PortFourniCompo;
import hADL.Interfaces.PortFourniConfig;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Binding Fourni</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADL.Liens.LienBindingFourni#getPortfournicompo <em>Portfournicompo</em>}</li>
 *   <li>{@link hADL.Liens.LienBindingFourni#getPortfourniconfig <em>Portfourniconfig</em>}</li>
 * </ul>
 *
 * @see hADL.Liens.LiensPackage#getLienBindingFourni()
 * @model kind="class"
 * @generated
 */
public class LienBindingFourni extends LienBinding {
	/**
	 * The cached value of the '{@link #getPortfournicompo() <em>Portfournicompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournicompo()
	 * @generated
	 * @ordered
	 */
	protected PortFourniCompo portfournicompo;

	/**
	 * The cached value of the '{@link #getPortfourniconfig() <em>Portfourniconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfourniconfig()
	 * @generated
	 * @ordered
	 */
	protected PortFourniConfig portfourniconfig;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienBindingFourni() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LiensPackage.Literals.LIEN_BINDING_FOURNI;
	}

	/**
	 * Returns the value of the '<em><b>Portfournicompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfournicompo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfournicompo</em>' containment reference.
	 * @see #setPortfournicompo(PortFourniCompo)
	 * @see hADL.Liens.LiensPackage#getLienBindingFourni_Portfournicompo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public PortFourniCompo getPortfournicompo() {
		return portfournicompo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortfournicompo(PortFourniCompo newPortfournicompo, NotificationChain msgs) {
		PortFourniCompo oldPortfournicompo = portfournicompo;
		portfournicompo = newPortfournicompo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICOMPO, oldPortfournicompo, newPortfournicompo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link hADL.Liens.LienBindingFourni#getPortfournicompo <em>Portfournicompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portfournicompo</em>' containment reference.
	 * @see #getPortfournicompo()
	 * @generated
	 */
	public void setPortfournicompo(PortFourniCompo newPortfournicompo) {
		if (newPortfournicompo != portfournicompo) {
			NotificationChain msgs = null;
			if (portfournicompo != null)
				msgs = ((InternalEObject)portfournicompo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICOMPO, null, msgs);
			if (newPortfournicompo != null)
				msgs = ((InternalEObject)newPortfournicompo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICOMPO, null, msgs);
			msgs = basicSetPortfournicompo(newPortfournicompo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICOMPO, newPortfournicompo, newPortfournicompo));
	}

	/**
	 * Returns the value of the '<em><b>Portfourniconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfourniconfig</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfourniconfig</em>' containment reference.
	 * @see #setPortfourniconfig(PortFourniConfig)
	 * @see hADL.Liens.LiensPackage#getLienBindingFourni_Portfourniconfig()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public PortFourniConfig getPortfourniconfig() {
		return portfourniconfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortfourniconfig(PortFourniConfig newPortfourniconfig, NotificationChain msgs) {
		PortFourniConfig oldPortfourniconfig = portfourniconfig;
		portfourniconfig = newPortfourniconfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICONFIG, oldPortfourniconfig, newPortfourniconfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link hADL.Liens.LienBindingFourni#getPortfourniconfig <em>Portfourniconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portfourniconfig</em>' containment reference.
	 * @see #getPortfourniconfig()
	 * @generated
	 */
	public void setPortfourniconfig(PortFourniConfig newPortfourniconfig) {
		if (newPortfourniconfig != portfourniconfig) {
			NotificationChain msgs = null;
			if (portfourniconfig != null)
				msgs = ((InternalEObject)portfourniconfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICONFIG, null, msgs);
			if (newPortfourniconfig != null)
				msgs = ((InternalEObject)newPortfourniconfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICONFIG, null, msgs);
			msgs = basicSetPortfourniconfig(newPortfourniconfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICONFIG, newPortfourniconfig, newPortfourniconfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICOMPO:
				return basicSetPortfournicompo(null, msgs);
			case LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICONFIG:
				return basicSetPortfourniconfig(null, msgs);
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
			case LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICOMPO:
				return getPortfournicompo();
			case LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICONFIG:
				return getPortfourniconfig();
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
			case LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICOMPO:
				setPortfournicompo((PortFourniCompo)newValue);
				return;
			case LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICONFIG:
				setPortfourniconfig((PortFourniConfig)newValue);
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
			case LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICOMPO:
				setPortfournicompo((PortFourniCompo)null);
				return;
			case LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICONFIG:
				setPortfourniconfig((PortFourniConfig)null);
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
			case LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICOMPO:
				return portfournicompo != null;
			case LiensPackage.LIEN_BINDING_FOURNI__PORTFOURNICONFIG:
				return portfourniconfig != null;
		}
		return super.eIsSet(featureID);
	}

} // LienBindingFourni
