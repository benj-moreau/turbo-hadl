/**
 */
package hADL.Liens;

import hADL.Interfaces.Port;
import hADL.Interfaces.PortFourniCompo;
import hADL.Interfaces.PortFourniConfig;
import org.eclipse.emf.ecore.EClass;

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
	 * @generated
	 */
	public PortFourniCompo getPortfournicompo() {
		return portfournicompo;
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
		portfournicompo = newPortfournicompo;
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
	 * @generated
	 */
	public PortFourniConfig getPortfourniconfig() {
		return portfourniconfig;
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
		portfourniconfig = newPortfourniconfig;
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

	@Override
	public Port getPortCompo() {
		return portfournicompo;
	}

	@Override
	public Port getPortConfig() {
		return portfourniconfig;
	}



} // LienBindingFourni
