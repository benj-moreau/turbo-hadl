/**
 */
package hADL.Composant;

import hADL.Element;

import hADL.Interfaces.PortFourniCompo;
import hADL.Interfaces.PortRequisCompo;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADL.Composant.Composant#getPropriete <em>Propriete</em>}</li>
 *   <li>{@link hADL.Composant.Composant#getContraintes <em>Contraintes</em>}</li>
 *   <li>{@link hADL.Composant.Composant#getPortrequiscompo <em>Portrequiscompo</em>}</li>
 *   <li>{@link hADL.Composant.Composant#getPortfournicompo <em>Portfournicompo</em>}</li>
 * </ul>
 *
 * @see hADL.Composant.ComposantPackage#getComposant()
 * @model kind="class"
 * @generated
 */
public class Composant extends Element {
	/**
	 * The cached value of the '{@link #getPropriete() <em>Propriete</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropriete()
	 * @generated
	 * @ordered
	 */
	protected EList<Propriete> propriete;

	/**
	 * The cached value of the '{@link #getContraintes() <em>Contraintes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraintes()
	 * @generated
	 * @ordered
	 */
	protected EList<Contraintes> contraintes;

	/**
	 * The cached value of the '{@link #getPortrequiscompo() <em>Portrequiscompo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequiscompo()
	 * @generated
	 * @ordered
	 */
	protected EList<PortRequisCompo> portrequiscompo;

	/**
	 * The cached value of the '{@link #getPortfournicompo() <em>Portfournicompo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournicompo()
	 * @generated
	 * @ordered
	 */
	protected EList<PortFourniCompo> portfournicompo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Composant() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComposantPackage.Literals.COMPOSANT;
	}

	/**
	 * Returns the value of the '<em><b>Propriete</b></em>' containment reference list.
	 * The list contents are of type {@link hADL.Composant.Propriete}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propriete</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propriete</em>' containment reference list.
	 * @see hADL.Composant.ComposantPackage#getComposant_Propriete()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Propriete> getPropriete() {
		if (propriete == null) {
			propriete = new EObjectContainmentEList<Propriete>(Propriete.class, this, ComposantPackage.COMPOSANT__PROPRIETE);
		}
		return propriete;
	}

	/**
	 * Returns the value of the '<em><b>Contraintes</b></em>' containment reference list.
	 * The list contents are of type {@link hADL.Composant.Contraintes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contraintes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contraintes</em>' containment reference list.
	 * @see hADL.Composant.ComposantPackage#getComposant_Contraintes()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Contraintes> getContraintes() {
		if (contraintes == null) {
			contraintes = new EObjectContainmentEList<Contraintes>(Contraintes.class, this, ComposantPackage.COMPOSANT__CONTRAINTES);
		}
		return contraintes;
	}

	/**
	 * Returns the value of the '<em><b>Portrequiscompo</b></em>' containment reference list.
	 * The list contents are of type {@link hADL.Interfaces.PortRequisCompo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequiscompo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequiscompo</em>' containment reference list.
	 * @see hADL.Composant.ComposantPackage#getComposant_Portrequiscompo()
	 * @model containment="true"
	 * @generated
	 */
	public EList<PortRequisCompo> getPortrequiscompo() {
		if (portrequiscompo == null) {
			portrequiscompo = new EObjectContainmentEList<PortRequisCompo>(PortRequisCompo.class, this, ComposantPackage.COMPOSANT__PORTREQUISCOMPO);
		}
		return portrequiscompo;
	}

	/**
	 * Returns the value of the '<em><b>Portfournicompo</b></em>' containment reference list.
	 * The list contents are of type {@link hADL.Interfaces.PortFourniCompo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfournicompo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfournicompo</em>' containment reference list.
	 * @see hADL.Composant.ComposantPackage#getComposant_Portfournicompo()
	 * @model containment="true"
	 * @generated
	 */
	public EList<PortFourniCompo> getPortfournicompo() {
		if (portfournicompo == null) {
			portfournicompo = new EObjectContainmentEList<PortFourniCompo>(PortFourniCompo.class, this, ComposantPackage.COMPOSANT__PORTFOURNICOMPO);
		}
		return portfournicompo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComposantPackage.COMPOSANT__PROPRIETE:
				return ((InternalEList<?>)getPropriete()).basicRemove(otherEnd, msgs);
			case ComposantPackage.COMPOSANT__CONTRAINTES:
				return ((InternalEList<?>)getContraintes()).basicRemove(otherEnd, msgs);
			case ComposantPackage.COMPOSANT__PORTREQUISCOMPO:
				return ((InternalEList<?>)getPortrequiscompo()).basicRemove(otherEnd, msgs);
			case ComposantPackage.COMPOSANT__PORTFOURNICOMPO:
				return ((InternalEList<?>)getPortfournicompo()).basicRemove(otherEnd, msgs);
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
			case ComposantPackage.COMPOSANT__PROPRIETE:
				return getPropriete();
			case ComposantPackage.COMPOSANT__CONTRAINTES:
				return getContraintes();
			case ComposantPackage.COMPOSANT__PORTREQUISCOMPO:
				return getPortrequiscompo();
			case ComposantPackage.COMPOSANT__PORTFOURNICOMPO:
				return getPortfournicompo();
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
			case ComposantPackage.COMPOSANT__PROPRIETE:
				getPropriete().clear();
				getPropriete().addAll((Collection<? extends Propriete>)newValue);
				return;
			case ComposantPackage.COMPOSANT__CONTRAINTES:
				getContraintes().clear();
				getContraintes().addAll((Collection<? extends Contraintes>)newValue);
				return;
			case ComposantPackage.COMPOSANT__PORTREQUISCOMPO:
				getPortrequiscompo().clear();
				getPortrequiscompo().addAll((Collection<? extends PortRequisCompo>)newValue);
				return;
			case ComposantPackage.COMPOSANT__PORTFOURNICOMPO:
				getPortfournicompo().clear();
				getPortfournicompo().addAll((Collection<? extends PortFourniCompo>)newValue);
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
			case ComposantPackage.COMPOSANT__PROPRIETE:
				getPropriete().clear();
				return;
			case ComposantPackage.COMPOSANT__CONTRAINTES:
				getContraintes().clear();
				return;
			case ComposantPackage.COMPOSANT__PORTREQUISCOMPO:
				getPortrequiscompo().clear();
				return;
			case ComposantPackage.COMPOSANT__PORTFOURNICOMPO:
				getPortfournicompo().clear();
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
			case ComposantPackage.COMPOSANT__PROPRIETE:
				return propriete != null && !propriete.isEmpty();
			case ComposantPackage.COMPOSANT__CONTRAINTES:
				return contraintes != null && !contraintes.isEmpty();
			case ComposantPackage.COMPOSANT__PORTREQUISCOMPO:
				return portrequiscompo != null && !portrequiscompo.isEmpty();
			case ComposantPackage.COMPOSANT__PORTFOURNICOMPO:
				return portfournicompo != null && !portfournicompo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Composant
