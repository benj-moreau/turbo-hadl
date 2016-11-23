/**
 */
package hADL.Connecteurs;

import hADL.Element;
import hADL.Roles.RoleFrom;

import hADL.Roles.RoleTo;
import java.util.Collection;

import java.util.List;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connecteur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADL.Connecteurs.Connecteur#getRolefromList <em>Rolefrom</em>}</li>
 *   <li>{@link hADL.Connecteurs.Connecteur#getRoletoList <em>Roleto</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Connecteur extends Element {
	/**
	 * The cached value of the '{@link #getRolefromList() <em>Rolefrom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefromList()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleFrom> rolefrom;
	/**
	 * The empty value for the '{@link #getRolefrom() <em>Rolefrom</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefrom()
	 * @generated
	 * @ordered
	 */
	protected static final RoleFrom[] ROLEFROM_EEMPTY_ARRAY = new RoleFrom [0];
	/**
	 * The cached value of the '{@link #getRoletoList() <em>Roleto</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoletoList()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleTo> roleto;
	/**
	 * The empty value for the '{@link #getRoleto() <em>Roleto</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleto()
	 * @generated
	 * @ordered
	 */
	protected static final RoleTo[] ROLETO_EEMPTY_ARRAY = new RoleTo [0];
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Connecteur() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnecteursPackage.Literals.CONNECTEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFrom[] getRolefrom() {
		if (rolefrom == null || rolefrom.isEmpty()) return ROLEFROM_EEMPTY_ARRAY;
		BasicEList<RoleFrom> list = (BasicEList<RoleFrom>)rolefrom;
		list.shrink();
		return (RoleFrom[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFrom getRolefrom(int index) {
		return getRolefromList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRolefromLength() {
		return rolefrom == null ? 0 : rolefrom.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefrom(RoleFrom[] newRolefrom) {
		((BasicEList<RoleFrom>)getRolefromList()).setData(newRolefrom.length, newRolefrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefrom(int index, RoleFrom element) {
		getRolefromList().set(index, element);
	}

	/**
	 * Returns the value of the '<em><b>Rolefrom</b></em>' containment reference list.
	 * The list contents are of type {@link hADL.Roles.RoleFrom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolefrom</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolefrom</em>' containment reference list.
	 * @generated
	 */
	public List<RoleFrom> getRolefromList() {
		if (rolefrom == null) {
			rolefrom = new BasicInternalEList<RoleFrom>(RoleFrom.class);
		}
		return rolefrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTo[] getRoleto() {
		if (roleto == null || roleto.isEmpty()) return ROLETO_EEMPTY_ARRAY;
		BasicEList<RoleTo> list = (BasicEList<RoleTo>)roleto;
		list.shrink();
		return (RoleTo[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTo getRoleto(int index) {
		return getRoletoList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoletoLength() {
		return roleto == null ? 0 : roleto.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleto(RoleTo[] newRoleto) {
		((BasicEList<RoleTo>)getRoletoList()).setData(newRoleto.length, newRoleto);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleto(int index, RoleTo element) {
		getRoletoList().set(index, element);
	}

	/**
	 * Returns the value of the '<em><b>Roleto</b></em>' containment reference list.
	 * The list contents are of type {@link hADL.Roles.RoleTo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roleto</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roleto</em>' containment reference list.
	 * @generated
	 */
	public List<RoleTo> getRoletoList() {
		if (roleto == null) {
			roleto = new BasicInternalEList<RoleTo>(RoleTo.class);
		}
		return roleto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConnecteursPackage.CONNECTEUR__ROLEFROM:
				return getRolefromList();
			case ConnecteursPackage.CONNECTEUR__ROLETO:
				return getRoletoList();
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
			case ConnecteursPackage.CONNECTEUR__ROLEFROM:
				getRolefromList().clear();
				getRolefromList().addAll((Collection<? extends RoleFrom>)newValue);
				return;
			case ConnecteursPackage.CONNECTEUR__ROLETO:
				getRoletoList().clear();
				getRoletoList().addAll((Collection<? extends RoleTo>)newValue);
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
			case ConnecteursPackage.CONNECTEUR__ROLEFROM:
				getRolefromList().clear();
				return;
			case ConnecteursPackage.CONNECTEUR__ROLETO:
				getRoletoList().clear();
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
			case ConnecteursPackage.CONNECTEUR__ROLEFROM:
				return rolefrom != null && !rolefrom.isEmpty();
			case ConnecteursPackage.CONNECTEUR__ROLETO:
				return roleto != null && !roleto.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	
	public void notify(RoleFrom roleFrom, Object data) {
		// TODO Auto-generated method stub
		
	}

} // Connecteur
