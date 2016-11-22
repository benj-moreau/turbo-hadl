/**
 */
package hADL.Roles;

import hADL.Configuration.Observer;

import hADL.Interfaces.Interface;

import hADL.Objet;

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
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADL.Roles.Role#getObserver <em>Observer</em>}</li>
 * </ul>
 *
 * @see hADL.Roles.RolesPackage#getRole()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class Role extends Objet implements Interface, Glue {
	/**
	 * The cached value of the '{@link #getObserver() <em>Observer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserver()
	 * @generated
	 * @ordered
	 */
	protected EList<Observer> observer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Role() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RolesPackage.Literals.ROLE;
	}

	/**
	 * Returns the value of the '<em><b>Observer</b></em>' containment reference list.
	 * The list contents are of type {@link hADL.Configuration.Observer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observer</em>' containment reference list.
	 * @see hADL.Roles.RolesPackage#getRole_Observer()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Observer> getObserver() {
		if (observer == null) {
			observer = new EObjectContainmentEList<Observer>(Observer.class, this, RolesPackage.ROLE__OBSERVER);
		}
		return observer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	public void fonctLiaison(Role role1, Role role2) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	public void notifyConfig() {
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
			case RolesPackage.ROLE__OBSERVER:
				return ((InternalEList<?>)getObserver()).basicRemove(otherEnd, msgs);
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
			case RolesPackage.ROLE__OBSERVER:
				return getObserver();
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
			case RolesPackage.ROLE__OBSERVER:
				getObserver().clear();
				getObserver().addAll((Collection<? extends Observer>)newValue);
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
			case RolesPackage.ROLE__OBSERVER:
				getObserver().clear();
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
			case RolesPackage.ROLE__OBSERVER:
				return observer != null && !observer.isEmpty();
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
		if (baseClass == Glue.class) {
			switch (baseOperationID) {
				case RolesPackage.GLUE___FONCT_LIAISON__ROLE_ROLE: return RolesPackage.ROLE___FONCT_LIAISON__ROLE_ROLE;
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
			case RolesPackage.ROLE___FONCT_LIAISON__ROLE_ROLE:
				fonctLiaison((Role)arguments.get(0), (Role)arguments.get(1));
				return null;
			case RolesPackage.ROLE___NOTIFY_CONFIG:
				notifyConfig();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} // Role
