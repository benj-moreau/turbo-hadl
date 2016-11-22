/**
 */
package hADL.Configuration;

import hADL.Element;

import hADL.Interfaces.PortFourniConfig;
import hADL.Interfaces.PortRequisConfig;

import hADL.Liens.LienAttachement;
import hADL.Liens.LienBinding;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADL.Configuration.Configuration#getLienbinding <em>Lienbinding</em>}</li>
 *   <li>{@link hADL.Configuration.Configuration#getLienattachement <em>Lienattachement</em>}</li>
 *   <li>{@link hADL.Configuration.Configuration#getPortrequisconfig <em>Portrequisconfig</em>}</li>
 *   <li>{@link hADL.Configuration.Configuration#getPortfourniconfig <em>Portfourniconfig</em>}</li>
 * </ul>
 *
 * @see hADL.Configuration.ConfigurationPackage#getConfiguration()
 * @model kind="class"
 * @generated
 */
public class Configuration extends Element implements Observer {
	/**
	 * The cached value of the '{@link #getLienbinding() <em>Lienbinding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienbinding()
	 * @generated
	 * @ordered
	 */
	protected EList<LienBinding> lienbinding;

	/**
	 * The cached value of the '{@link #getLienattachement() <em>Lienattachement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachement()
	 * @generated
	 * @ordered
	 */
	protected EList<LienAttachement> lienattachement;

	/**
	 * The cached value of the '{@link #getPortrequisconfig() <em>Portrequisconfig</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequisconfig()
	 * @generated
	 * @ordered
	 */
	protected EList<PortRequisConfig> portrequisconfig;

	/**
	 * The cached value of the '{@link #getPortfourniconfig() <em>Portfourniconfig</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfourniconfig()
	 * @generated
	 * @ordered
	 */
	protected EList<PortFourniConfig> portfourniconfig;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Configuration() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.CONFIGURATION;
	}

	/**
	 * Returns the value of the '<em><b>Lienbinding</b></em>' containment reference list.
	 * The list contents are of type {@link hADL.Liens.LienBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienbinding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienbinding</em>' containment reference list.
	 * @see hADL.Configuration.ConfigurationPackage#getConfiguration_Lienbinding()
	 * @model containment="true"
	 * @generated
	 */
	public EList<LienBinding> getLienbinding() {
		if (lienbinding == null) {
			lienbinding = new EObjectContainmentEList<LienBinding>(LienBinding.class, this, ConfigurationPackage.CONFIGURATION__LIENBINDING);
		}
		return lienbinding;
	}

	/**
	 * Returns the value of the '<em><b>Lienattachement</b></em>' containment reference list.
	 * The list contents are of type {@link hADL.Liens.LienAttachement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachement</em>' containment reference list.
	 * @see hADL.Configuration.ConfigurationPackage#getConfiguration_Lienattachement()
	 * @model containment="true"
	 * @generated
	 */
	public EList<LienAttachement> getLienattachement() {
		if (lienattachement == null) {
			lienattachement = new EObjectContainmentEList<LienAttachement>(LienAttachement.class, this, ConfigurationPackage.CONFIGURATION__LIENATTACHEMENT);
		}
		return lienattachement;
	}

	/**
	 * Returns the value of the '<em><b>Portrequisconfig</b></em>' containment reference list.
	 * The list contents are of type {@link hADL.Interfaces.PortRequisConfig}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequisconfig</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequisconfig</em>' containment reference list.
	 * @see hADL.Configuration.ConfigurationPackage#getConfiguration_Portrequisconfig()
	 * @model containment="true"
	 * @generated
	 */
	public EList<PortRequisConfig> getPortrequisconfig() {
		if (portrequisconfig == null) {
			portrequisconfig = new EObjectContainmentEList<PortRequisConfig>(PortRequisConfig.class, this, ConfigurationPackage.CONFIGURATION__PORTREQUISCONFIG);
		}
		return portrequisconfig;
	}

	/**
	 * Returns the value of the '<em><b>Portfourniconfig</b></em>' containment reference list.
	 * The list contents are of type {@link hADL.Interfaces.PortFourniConfig}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfourniconfig</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfourniconfig</em>' containment reference list.
	 * @see hADL.Configuration.ConfigurationPackage#getConfiguration_Portfourniconfig()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public EList<PortFourniConfig> getPortfourniconfig() {
		if (portfourniconfig == null) {
			portfourniconfig = new EObjectContainmentEList<PortFourniConfig>(PortFourniConfig.class, this, ConfigurationPackage.CONFIGURATION__PORTFOURNICONFIG);
		}
		return portfourniconfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	public void action() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.CONFIGURATION__LIENBINDING:
				return ((InternalEList<?>)getLienbinding()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.CONFIGURATION__LIENATTACHEMENT:
				return ((InternalEList<?>)getLienattachement()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.CONFIGURATION__PORTREQUISCONFIG:
				return ((InternalEList<?>)getPortrequisconfig()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.CONFIGURATION__PORTFOURNICONFIG:
				return ((InternalEList<?>)getPortfourniconfig()).basicRemove(otherEnd, msgs);
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
			case ConfigurationPackage.CONFIGURATION__LIENBINDING:
				return getLienbinding();
			case ConfigurationPackage.CONFIGURATION__LIENATTACHEMENT:
				return getLienattachement();
			case ConfigurationPackage.CONFIGURATION__PORTREQUISCONFIG:
				return getPortrequisconfig();
			case ConfigurationPackage.CONFIGURATION__PORTFOURNICONFIG:
				return getPortfourniconfig();
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
			case ConfigurationPackage.CONFIGURATION__LIENBINDING:
				getLienbinding().clear();
				getLienbinding().addAll((Collection<? extends LienBinding>)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION__LIENATTACHEMENT:
				getLienattachement().clear();
				getLienattachement().addAll((Collection<? extends LienAttachement>)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION__PORTREQUISCONFIG:
				getPortrequisconfig().clear();
				getPortrequisconfig().addAll((Collection<? extends PortRequisConfig>)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION__PORTFOURNICONFIG:
				getPortfourniconfig().clear();
				getPortfourniconfig().addAll((Collection<? extends PortFourniConfig>)newValue);
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
			case ConfigurationPackage.CONFIGURATION__LIENBINDING:
				getLienbinding().clear();
				return;
			case ConfigurationPackage.CONFIGURATION__LIENATTACHEMENT:
				getLienattachement().clear();
				return;
			case ConfigurationPackage.CONFIGURATION__PORTREQUISCONFIG:
				getPortrequisconfig().clear();
				return;
			case ConfigurationPackage.CONFIGURATION__PORTFOURNICONFIG:
				getPortfourniconfig().clear();
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
			case ConfigurationPackage.CONFIGURATION__LIENBINDING:
				return lienbinding != null && !lienbinding.isEmpty();
			case ConfigurationPackage.CONFIGURATION__LIENATTACHEMENT:
				return lienattachement != null && !lienattachement.isEmpty();
			case ConfigurationPackage.CONFIGURATION__PORTREQUISCONFIG:
				return portrequisconfig != null && !portrequisconfig.isEmpty();
			case ConfigurationPackage.CONFIGURATION__PORTFOURNICONFIG:
				return portfourniconfig != null && !portfourniconfig.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Observer.class) {
			switch (baseOperationID) {
				case ConfigurationPackage.OBSERVER___ACTION: return ConfigurationPackage.CONFIGURATION___ACTION;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ConfigurationPackage.CONFIGURATION___ACTION:
				action();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} // Configuration
