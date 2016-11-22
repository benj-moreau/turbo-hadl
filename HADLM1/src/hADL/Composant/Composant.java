/**
 */
package hADL.Composant;

import hADL.Configuration.Configuration;
import hADL.Configuration.ConfigurationPackage;
import hADL.Configuration.Observer;
import hADL.Connecteurs.Connecteur;
import hADL.Element;

import hADL.Interfaces.PortFourniCompo;
import hADL.Interfaces.PortFourniConfig;
import hADL.Interfaces.PortRequisCompo;

import hADL.Interfaces.PortRequisConfig;
import hADL.Liens.LienAttachementPFRF;
import hADL.Liens.LienAttachementPRRT;
import hADL.Liens.LienBindingFourni;
import hADL.Liens.LienBindingRequis;
import hADL.Roles.RoleFrom;
import hADL.Roles.RoleTo;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.List;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADL.Composant.Composant#getProprieteList <em>Propriete</em>}</li>
 *   <li>{@link hADL.Composant.Composant#getContraintesList <em>Contraintes</em>}</li>
 *   <li>{@link hADL.Composant.Composant#getPortrequiscompoList <em>Portrequiscompo</em>}</li>
 *   <li>{@link hADL.Composant.Composant#getPortfournicompoList <em>Portfournicompo</em>}</li>
 *   <li>{@link hADL.Composant.Composant#getLienbindingrequisList <em>Lienbindingrequis</em>}</li>
 *   <li>{@link hADL.Composant.Composant#getLienbindingfourniList <em>Lienbindingfourni</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Composant extends Element implements Observer {
	/**
	 * The cached value of the '{@link #getProprieteList() <em>Propriete</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProprieteList()
	 * @generated
	 * @ordered
	 */
	protected EList<Propriete> propriete;

	/**
	 * The empty value for the '{@link #getPropriete() <em>Propriete</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropriete()
	 * @generated
	 * @ordered
	 */
	protected static final Propriete[] PROPRIETE_EEMPTY_ARRAY = new Propriete [0];

	/**
	 * The cached value of the '{@link #getContraintesList() <em>Contraintes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraintesList()
	 * @generated
	 * @ordered
	 */
	protected EList<Contraintes> contraintes;

	/**
	 * The empty value for the '{@link #getContraintes() <em>Contraintes</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraintes()
	 * @generated
	 * @ordered
	 */
	protected static final Contraintes[] CONTRAINTES_EEMPTY_ARRAY = new Contraintes [0];

	/**
	 * The cached value of the '{@link #getPortrequiscompoList() <em>Portrequiscompo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequiscompoList()
	 * @generated
	 * @ordered
	 */
	protected EList<PortRequisCompo> portrequiscompo;

	/**
	 * The empty value for the '{@link #getPortrequiscompo() <em>Portrequiscompo</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequiscompo()
	 * @generated
	 * @ordered
	 */
	protected static final PortRequisCompo[] PORTREQUISCOMPO_EEMPTY_ARRAY = new PortRequisCompo [0];

	/**
	 * The cached value of the '{@link #getPortfournicompoList() <em>Portfournicompo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournicompoList()
	 * @generated
	 * @ordered
	 */
	protected EList<PortFourniCompo> portfournicompo;

	/**
	 * The empty value for the '{@link #getPortfournicompo() <em>Portfournicompo</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournicompo()
	 * @generated
	 * @ordered
	 */
	protected static final PortFourniCompo[] PORTFOURNICOMPO_EEMPTY_ARRAY = new PortFourniCompo [0];

	/**
	 * The cached value of the '{@link #getLienbindingrequisList() <em>Lienbindingrequis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienbindingrequisList()
	 * @generated
	 * @ordered
	 */
	protected EList<LienBindingRequis> lienbindingrequis;

	/**
	 * The empty value for the '{@link #getLienbindingrequis() <em>Lienbindingrequis</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienbindingrequis()
	 * @generated
	 * @ordered
	 */
	protected static final LienBindingRequis[] LIENBINDINGREQUIS_EEMPTY_ARRAY = new LienBindingRequis [0];

	/**
	 * The cached value of the '{@link #getLienbindingfourniList() <em>Lienbindingfourni</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienbindingfourniList()
	 * @generated
	 * @ordered
	 */
	protected EList<LienBindingFourni> lienbindingfourni;

	/**
	 * The empty value for the '{@link #getLienbindingfourni() <em>Lienbindingfourni</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienbindingfourni()
	 * @generated
	 * @ordered
	 */
	protected static final LienBindingFourni[] LIENBINDINGFOURNI_EEMPTY_ARRAY = new LienBindingFourni [0];

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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propriete</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propriete[] getPropriete() {
		if (propriete == null || propriete.isEmpty()) return PROPRIETE_EEMPTY_ARRAY;
		BasicEList<Propriete> list = (BasicEList<Propriete>)propriete;
		list.shrink();
		return (Propriete[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propriete getPropriete(int index) {
		return getProprieteList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProprieteLength() {
		return propriete == null ? 0 : propriete.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropriete(Propriete[] newPropriete) {
		((BasicEList<Propriete>)getProprieteList()).setData(newPropriete.length, newPropriete);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropriete(int index, Propriete element) {
		getProprieteList().set(index, element);
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
	 * @generated
	 */
	public List<Propriete> getProprieteList() {
		if (propriete == null) {
			propriete = new BasicInternalEList<Propriete>(Propriete.class);
		}
		return propriete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contraintes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contraintes[] getContraintes() {
		if (contraintes == null || contraintes.isEmpty()) return CONTRAINTES_EEMPTY_ARRAY;
		BasicEList<Contraintes> list = (BasicEList<Contraintes>)contraintes;
		list.shrink();
		return (Contraintes[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contraintes getContraintes(int index) {
		return getContraintesList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getContraintesLength() {
		return contraintes == null ? 0 : contraintes.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContraintes(Contraintes[] newContraintes) {
		((BasicEList<Contraintes>)getContraintesList()).setData(newContraintes.length, newContraintes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContraintes(int index, Contraintes element) {
		getContraintesList().set(index, element);
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
	 * @generated
	 */
	public List<Contraintes> getContraintesList() {
		if (contraintes == null) {
			contraintes = new BasicInternalEList<Contraintes>(Contraintes.class);
		}
		return contraintes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequiscompo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisCompo[] getPortrequiscompo() {
		if (portrequiscompo == null || portrequiscompo.isEmpty()) return PORTREQUISCOMPO_EEMPTY_ARRAY;
		BasicEList<PortRequisCompo> list = (BasicEList<PortRequisCompo>)portrequiscompo;
		list.shrink();
		return (PortRequisCompo[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisCompo getPortrequiscompo(int index) {
		return getPortrequiscompoList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPortrequiscompoLength() {
		return portrequiscompo == null ? 0 : portrequiscompo.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequiscompo(PortRequisCompo[] newPortrequiscompo) {
		((BasicEList<PortRequisCompo>)getPortrequiscompoList()).setData(newPortrequiscompo.length, newPortrequiscompo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequiscompo(int index, PortRequisCompo element) {
		getPortrequiscompoList().set(index, element);
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
	 * @generated
	 */
	public List<PortRequisCompo> getPortrequiscompoList() {
		if (portrequiscompo == null) {
			portrequiscompo = new BasicInternalEList<PortRequisCompo>(PortRequisCompo.class);
		}
		return portrequiscompo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfournicompo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniCompo[] getPortfournicompo() {
		if (portfournicompo == null || portfournicompo.isEmpty()) return PORTFOURNICOMPO_EEMPTY_ARRAY;
		BasicEList<PortFourniCompo> list = (BasicEList<PortFourniCompo>)portfournicompo;
		list.shrink();
		return (PortFourniCompo[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniCompo getPortfournicompo(int index) {
		return getPortfournicompoList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPortfournicompoLength() {
		return portfournicompo == null ? 0 : portfournicompo.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfournicompo(PortFourniCompo[] newPortfournicompo) {
		((BasicEList<PortFourniCompo>)getPortfournicompoList()).setData(newPortfournicompo.length, newPortfournicompo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfournicompo(int index, PortFourniCompo element) {
		getPortfournicompoList().set(index, element);
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
	 * @generated
	 */
	public List<PortFourniCompo> getPortfournicompoList() {
		if (portfournicompo == null) {
			portfournicompo = new BasicInternalEList<PortFourniCompo>(PortFourniCompo.class);
		}
		return portfournicompo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienBindingRequis[] getLienbindingrequis() {
		if (lienbindingrequis == null || lienbindingrequis.isEmpty()) return LIENBINDINGREQUIS_EEMPTY_ARRAY;
		BasicEList<LienBindingRequis> list = (BasicEList<LienBindingRequis>)lienbindingrequis;
		list.shrink();
		return (LienBindingRequis[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienBindingRequis getLienbindingrequis(int index) {
		return getLienbindingrequisList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLienbindingrequisLength() {
		return lienbindingrequis == null ? 0 : lienbindingrequis.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLienbindingrequis(LienBindingRequis[] newLienbindingrequis) {
		((BasicEList<LienBindingRequis>)getLienbindingrequisList()).setData(newLienbindingrequis.length, newLienbindingrequis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLienbindingrequis(int index, LienBindingRequis element) {
		getLienbindingrequisList().set(index, element);
	}

	/**
	 * Returns the value of the '<em><b>Lienbindingrequis</b></em>' containment reference list.
	 * The list contents are of type {@link hADL.Liens.LienBindingRequis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienbindingrequis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienbindingrequis</em>' containment reference list.
	 * @generated
	 */
	public List<LienBindingRequis> getLienbindingrequisList() {
		if (lienbindingrequis == null) {
			lienbindingrequis = new BasicInternalEList<LienBindingRequis>(LienBindingRequis.class);
		}
		return lienbindingrequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienBindingFourni[] getLienbindingfourni() {
		if (lienbindingfourni == null || lienbindingfourni.isEmpty()) return LIENBINDINGFOURNI_EEMPTY_ARRAY;
		BasicEList<LienBindingFourni> list = (BasicEList<LienBindingFourni>)lienbindingfourni;
		list.shrink();
		return (LienBindingFourni[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienBindingFourni getLienbindingfourni(int index) {
		return getLienbindingfourniList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLienbindingfourniLength() {
		return lienbindingfourni == null ? 0 : lienbindingfourni.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLienbindingfourni(LienBindingFourni[] newLienbindingfourni) {
		((BasicEList<LienBindingFourni>)getLienbindingfourniList()).setData(newLienbindingfourni.length, newLienbindingfourni);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLienbindingfourni(int index, LienBindingFourni element) {
		getLienbindingfourniList().set(index, element);
	}

	/**
	 * Returns the value of the '<em><b>Lienbindingfourni</b></em>' containment reference list.
	 * The list contents are of type {@link hADL.Liens.LienBindingFourni}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienbindingfourni</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienbindingfourni</em>' containment reference list.
	 * @generated
	 */
	public List<LienBindingFourni> getLienbindingfourniList() {
		if (lienbindingfourni == null) {
			lienbindingfourni = new BasicInternalEList<LienBindingFourni>(LienBindingFourni.class);
		}
		return lienbindingfourni;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComposantPackage.COMPOSANT__PROPRIETE:
				return getProprieteList();
			case ComposantPackage.COMPOSANT__CONTRAINTES:
				return getContraintesList();
			case ComposantPackage.COMPOSANT__PORTREQUISCOMPO:
				return getPortrequiscompoList();
			case ComposantPackage.COMPOSANT__PORTFOURNICOMPO:
				return getPortfournicompoList();
			case ComposantPackage.COMPOSANT__LIENBINDINGREQUIS:
				return getLienbindingrequisList();
			case ComposantPackage.COMPOSANT__LIENBINDINGFOURNI:
				return getLienbindingfourniList();
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
				getProprieteList().clear();
				getProprieteList().addAll((Collection<? extends Propriete>)newValue);
				return;
			case ComposantPackage.COMPOSANT__CONTRAINTES:
				getContraintesList().clear();
				getContraintesList().addAll((Collection<? extends Contraintes>)newValue);
				return;
			case ComposantPackage.COMPOSANT__PORTREQUISCOMPO:
				getPortrequiscompoList().clear();
				getPortrequiscompoList().addAll((Collection<? extends PortRequisCompo>)newValue);
				return;
			case ComposantPackage.COMPOSANT__PORTFOURNICOMPO:
				getPortfournicompoList().clear();
				getPortfournicompoList().addAll((Collection<? extends PortFourniCompo>)newValue);
				return;
			case ComposantPackage.COMPOSANT__LIENBINDINGREQUIS:
				getLienbindingrequisList().clear();
				getLienbindingrequisList().addAll((Collection<? extends LienBindingRequis>)newValue);
				return;
			case ComposantPackage.COMPOSANT__LIENBINDINGFOURNI:
				getLienbindingfourniList().clear();
				getLienbindingfourniList().addAll((Collection<? extends LienBindingFourni>)newValue);
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
				getProprieteList().clear();
				return;
			case ComposantPackage.COMPOSANT__CONTRAINTES:
				getContraintesList().clear();
				return;
			case ComposantPackage.COMPOSANT__PORTREQUISCOMPO:
				getPortrequiscompoList().clear();
				return;
			case ComposantPackage.COMPOSANT__PORTFOURNICOMPO:
				getPortfournicompoList().clear();
				return;
			case ComposantPackage.COMPOSANT__LIENBINDINGREQUIS:
				getLienbindingrequisList().clear();
				return;
			case ComposantPackage.COMPOSANT__LIENBINDINGFOURNI:
				getLienbindingfourniList().clear();
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
			case ComposantPackage.COMPOSANT__LIENBINDINGREQUIS:
				return lienbindingrequis != null && !lienbindingrequis.isEmpty();
			case ComposantPackage.COMPOSANT__LIENBINDINGFOURNI:
				return lienbindingfourni != null && !lienbindingfourni.isEmpty();
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
				case ConfigurationPackage.OBSERVER___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT: return ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT;
				case ConfigurationPackage.OBSERVER___ACTION_VIA_ROLE__ROLETO_OBJECT: return ComposantPackage.COMPOSANT___ACTION_VIA_ROLE__ROLETO_OBJECT;
				case ConfigurationPackage.OBSERVER___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT: return ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT;
				case ConfigurationPackage.OBSERVER___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT: return ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT;
				case ConfigurationPackage.OBSERVER___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT: return ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT;
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
			case ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT:
				actionViaPort((PortFourniConfig)arguments.get(0), arguments.get(1));
				return null;
			case ComposantPackage.COMPOSANT___ACTION_VIA_ROLE__ROLETO_OBJECT:
				actionViaRole((RoleTo)arguments.get(0), arguments.get(1));
				return null;
			case ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT:
				actionViaPort((PortRequisCompo)arguments.get(0), arguments.get(1));
				return null;
			case ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT:
				actionViaPort((PortRequisConfig)arguments.get(0), arguments.get(1));
				return null;
			case ComposantPackage.COMPOSANT___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT:
				actionViaPort((PortFourniCompo)arguments.get(0), arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public void notify(PortRequisCompo portrequis, Object data) {
		//implementé dans M1
	}

	public void notify(PortFourniCompo portDestinataire, Object data) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public void actionViaPort(PortRequisCompo port, Object data) {
			//cherche bindings
			PortRequisConfig portDestinataire= null;
			for (LienBindingRequis lien : lienbindingrequis) {
				if(port.equals(lien.getPortCompo())){
					portDestinataire = (PortRequisConfig) lien.getPortConfig();
					break;
				}
			}
			if(portDestinataire!=null){
				for(Configuration config: childConfiguration){
					for(PortRequisConfig portrequisCourant: config.getPortrequisconfig()){
						if(portDestinataire.equals(portrequisCourant)){
							config.actionViaPort(portDestinataire, data);
							return;
						}
					}
				}
			}	
	}
	/**
	 * @generated NOT
	 */
	@Override
	public void actionViaPort(PortRequisConfig port, Object data) {
			PortRequisCompo portDestinataire= null;
			for (LienBindingRequis lien : lienbindingrequis) {
				if(port.equals(lien.getPortConfig())){
					portDestinataire = (PortRequisCompo) lien.getPortCompo();
					break;
				}
			}
			for(Composant compo : childComposant){
				for(PortRequisCompo portrequisCourant: compo.getPortrequiscompo()){
					if(portDestinataire.equals(portrequisCourant)){
						compo.notify(portDestinataire, data);
						return;
					}
				}
			}
		}

	/**
	 * @generated NOT
	 */
	@Override
	public void actionViaPort(PortFourniCompo port, Object data) {
		//on cherche d'abord les liens d'attachments, si pas trouvé on cherche les bindings
		RoleFrom roleDestinataire = null;
		for (LienAttachementPFRF lien : lienattachementpfrf) {
			if (port.equals(lien.getTo())){
				roleDestinataire = (RoleFrom) lien.getFrom();
				break;
			}
		}
		if(roleDestinataire!=null){
			for(Connecteur connecteur : childConnecteur){
				for(RoleFrom roleFrom: connecteur.getRolefrom()){
					if(roleDestinataire.equals(roleFrom)){
						connecteur.notify(roleFrom, data);
						return;
					}
				}
			}
		}else{// pas d'attachement, il faut trouver un binding
			PortFourniCompo portDestinataire= null;
			for (LienBindingFourni lien : lienbindingfourni) {
				if(port.equals(lien.getPortConfig())){
					portDestinataire = (PortFourniCompo) lien.getPortCompo();
					break;
				}
			}
			for(Composant compo : childComposant){
				for(PortFourniCompo portFourniCourant: compo.getPortfournicompo()){
					if(portDestinataire.equals(portFourniCourant)){
						compo.notify(portDestinataire, data);
						return;
					}
				}
			}
			if(portDestinataire==null){
				System.out.println("erreur: non trouvé, peut etre que c'est un binding composant->config");
			}
		}
	}
					
				
	/**
	 * @generated NOT
	 */
	@Override
	public void actionViaPort(PortFourniConfig port, Object data) {				
		PortFourniConfig portDestinataire= null;
		for (LienBindingFourni lien : lienbindingfourni) {
			if(port.equals(lien.getPortCompo())){
				portDestinataire = (PortFourniConfig) lien.getPortConfig();
				break;
			}
		}
		if(portDestinataire!=null){
			for(Configuration config: childConfiguration){
				for(PortRequisConfig portrequisCourant: config.getPortrequisconfig()){
					if(portDestinataire.equals(portrequisCourant)){
						config.notify(portDestinataire, data);
						return;
					}
				}
			}
		}	
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public void actionViaRole(RoleTo role, Object data) {
		PortRequisCompo portrequis = null;
		for (LienAttachementPRRT lien : lienattachementprrt) {
				if (role.equals(lien.getFrom())){
					portrequis = (PortRequisCompo) lien.getTo();
					break;
				}
		}
		if(portrequis != null){
			for(Composant compo : childComposant){
					for(PortRequisCompo portrequisCourant: compo.getPortrequiscompo()){
						if(portrequis.equals(portrequisCourant)){
							compo.notify(portrequis, data);
							return;
						}
					}
			}
		}		
	}

} // Composant
