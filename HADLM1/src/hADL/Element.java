/**
 */
package hADL;

import hADL.Composant.Composant;
import hADL.Configuration.Configuration;
import hADL.Connecteurs.Connecteur;
import java.util.Collection;

import java.util.List;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADL.Element#getChildConfigurationList <em>Child Configuration</em>}</li>
 *   <li>{@link hADL.Element#getChildComposantList <em>Child Composant</em>}</li>
 *   <li>{@link hADL.Element#getChildConnecteurList <em>Child Connecteur</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Element extends Objet {
	/**
	 * The cached value of the '{@link #getChildConfigurationList() <em>Child Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildConfigurationList()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> childConfiguration;

	/**
	 * The empty value for the '{@link #getChildConfiguration() <em>Child Configuration</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final Configuration[] CHILD_CONFIGURATION_EEMPTY_ARRAY = new Configuration [0];

	/**
	 * The cached value of the '{@link #getChildComposantList() <em>Child Composant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildComposantList()
	 * @generated
	 * @ordered
	 */
	protected EList<Composant> childComposant;

	/**
	 * The empty value for the '{@link #getChildComposant() <em>Child Composant</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildComposant()
	 * @generated
	 * @ordered
	 */
	protected static final Composant[] CHILD_COMPOSANT_EEMPTY_ARRAY = new Composant [0];

	/**
	 * The cached value of the '{@link #getChildConnecteurList() <em>Child Connecteur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildConnecteurList()
	 * @generated
	 * @ordered
	 */
	protected EList<Connecteur> childConnecteur;

	/**
	 * The empty value for the '{@link #getChildConnecteur() <em>Child Connecteur</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildConnecteur()
	 * @generated
	 * @ordered
	 */
	protected static final Connecteur[] CHILD_CONNECTEUR_EEMPTY_ARRAY = new Connecteur [0];

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration[] getChildConfiguration() {
		if (childConfiguration == null || childConfiguration.isEmpty()) return CHILD_CONFIGURATION_EEMPTY_ARRAY;
		BasicEList<Configuration> list = (BasicEList<Configuration>)childConfiguration;
		list.shrink();
		return (Configuration[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getChildConfiguration(int index) {
		return getChildConfigurationList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChildConfigurationLength() {
		return childConfiguration == null ? 0 : childConfiguration.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildConfiguration(Configuration[] newChildConfiguration) {
		((BasicEList<Configuration>)getChildConfigurationList()).setData(newChildConfiguration.length, newChildConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildConfiguration(int index, Configuration element) {
		getChildConfigurationList().set(index, element);
	}

	/**
	 * Returns the value of the '<em><b>Child Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link hADL.Configuration.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Configuration</em>' containment reference list.
	 * @generated
	 */
	public List<Configuration> getChildConfigurationList() {
		if (childConfiguration == null) {
			childConfiguration = new BasicInternalEList<Configuration>(Configuration.class);
		}
		return childConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composant[] getChildComposant() {
		if (childComposant == null || childComposant.isEmpty()) return CHILD_COMPOSANT_EEMPTY_ARRAY;
		BasicEList<Composant> list = (BasicEList<Composant>)childComposant;
		list.shrink();
		return (Composant[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composant getChildComposant(int index) {
		return getChildComposantList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChildComposantLength() {
		return childComposant == null ? 0 : childComposant.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildComposant(Composant[] newChildComposant) {
		((BasicEList<Composant>)getChildComposantList()).setData(newChildComposant.length, newChildComposant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildComposant(int index, Composant element) {
		getChildComposantList().set(index, element);
	}

	/**
	 * Returns the value of the '<em><b>Child Composant</b></em>' containment reference list.
	 * The list contents are of type {@link hADL.Composant.Composant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Composant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Composant</em>' containment reference list.
	 * @generated
	 */
	public List<Composant> getChildComposantList() {
		if (childComposant == null) {
			childComposant = new BasicInternalEList<Composant>(Composant.class);
		}
		return childComposant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur[] getChildConnecteur() {
		if (childConnecteur == null || childConnecteur.isEmpty()) return CHILD_CONNECTEUR_EEMPTY_ARRAY;
		BasicEList<Connecteur> list = (BasicEList<Connecteur>)childConnecteur;
		list.shrink();
		return (Connecteur[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur getChildConnecteur(int index) {
		return getChildConnecteurList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChildConnecteurLength() {
		return childConnecteur == null ? 0 : childConnecteur.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildConnecteur(Connecteur[] newChildConnecteur) {
		((BasicEList<Connecteur>)getChildConnecteurList()).setData(newChildConnecteur.length, newChildConnecteur);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildConnecteur(int index, Connecteur element) {
		getChildConnecteurList().set(index, element);
	}

	/**
	 * Returns the value of the '<em><b>Child Connecteur</b></em>' containment reference list.
	 * The list contents are of type {@link hADL.Connecteurs.Connecteur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Connecteur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Connecteur</em>' containment reference list.
	 * @generated
	 */
	public List<Connecteur> getChildConnecteurList() {
		if (childConnecteur == null) {
			childConnecteur = new BasicInternalEList<Connecteur>(Connecteur.class);
		}
		return childConnecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLPackage.ELEMENT__CHILD_CONFIGURATION:
				return getChildConfigurationList();
			case HADLPackage.ELEMENT__CHILD_COMPOSANT:
				return getChildComposantList();
			case HADLPackage.ELEMENT__CHILD_CONNECTEUR:
				return getChildConnecteurList();
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
			case HADLPackage.ELEMENT__CHILD_CONFIGURATION:
				getChildConfigurationList().clear();
				getChildConfigurationList().addAll((Collection<? extends Configuration>)newValue);
				return;
			case HADLPackage.ELEMENT__CHILD_COMPOSANT:
				getChildComposantList().clear();
				getChildComposantList().addAll((Collection<? extends Composant>)newValue);
				return;
			case HADLPackage.ELEMENT__CHILD_CONNECTEUR:
				getChildConnecteurList().clear();
				getChildConnecteurList().addAll((Collection<? extends Connecteur>)newValue);
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
			case HADLPackage.ELEMENT__CHILD_CONFIGURATION:
				getChildConfigurationList().clear();
				return;
			case HADLPackage.ELEMENT__CHILD_COMPOSANT:
				getChildComposantList().clear();
				return;
			case HADLPackage.ELEMENT__CHILD_CONNECTEUR:
				getChildConnecteurList().clear();
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
			case HADLPackage.ELEMENT__CHILD_CONFIGURATION:
				return childConfiguration != null && !childConfiguration.isEmpty();
			case HADLPackage.ELEMENT__CHILD_COMPOSANT:
				return childComposant != null && !childComposant.isEmpty();
			case HADLPackage.ELEMENT__CHILD_CONNECTEUR:
				return childConnecteur != null && !childConnecteur.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Element
