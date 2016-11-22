/**
 */
package hADL.Liens;

import hADL.Interfaces.Port;
import hADL.Interfaces.PortRequisCompo;
import hADL.Interfaces.PortRequisConfig;
import org.eclipse.emf.ecore.EClass;

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
	 * @generated
	 */
	public PortRequisCompo getPortrequiscompo() {
		return portrequiscompo;
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
		portrequiscompo = newPortrequiscompo;
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
	 * @generated
	 */
	public PortRequisConfig getPortrequisconfig() {
		return portrequisconfig;
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
		portrequisconfig = newPortrequisconfig;
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

	@Override
	public Port getPortCompo() {
		return portrequiscompo;
	}

	@Override
	public Port getPortConfig() {
		return portrequisconfig;
	}

} // LienBindingRequis
