/**
 */
package hADL.Configuration;

import hADL.Element;
import hADL.Composant.Composant;
import hADL.Connecteurs.Connecteur;
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
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADL.Configuration.Configuration#getPortrequisconfigList <em>Portrequisconfig</em>}</li>
 *   <li>{@link hADL.Configuration.Configuration#getPortfourniconfigList <em>Portfourniconfig</em>}</li>
 *   <li>{@link hADL.Configuration.Configuration#getLienbindingrequisList <em>Lienbindingrequis</em>}</li>
 *   <li>{@link hADL.Configuration.Configuration#getLienbindingfourniList <em>Lienbindingfourni</em>}</li>
 *   <li>{@link hADL.Configuration.Configuration#getLienattachementprrtList <em>Lienattachementprrt</em>}</li>
 *   <li>{@link hADL.Configuration.Configuration#getLienattachementpfrfList <em>Lienattachementpfrf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Configuration extends Element implements Observer {
	/**
	 * The cached value of the '{@link #getPortrequisconfigList() <em>Portrequisconfig</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequisconfigList()
	 * @generated
	 * @ordered
	 */
	protected EList<PortRequisConfig> portrequisconfig;

	/**
	 * The empty value for the '{@link #getPortrequisconfig() <em>Portrequisconfig</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequisconfig()
	 * @generated
	 * @ordered
	 */
	protected static final PortRequisConfig[] PORTREQUISCONFIG_EEMPTY_ARRAY = new PortRequisConfig [0];

	/**
	 * The cached value of the '{@link #getPortfourniconfigList() <em>Portfourniconfig</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfourniconfigList()
	 * @generated
	 * @ordered
	 */
	protected EList<PortFourniConfig> portfourniconfig;

	/**
	 * The empty value for the '{@link #getPortfourniconfig() <em>Portfourniconfig</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfourniconfig()
	 * @generated
	 * @ordered
	 */
	protected static final PortFourniConfig[] PORTFOURNICONFIG_EEMPTY_ARRAY = new PortFourniConfig [0];

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
	 * The cached value of the '{@link #getLienattachementprrtList() <em>Lienattachementprrt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementprrtList()
	 * @generated
	 * @ordered
	 */
	protected EList<LienAttachementPRRT> lienattachementprrt;

	/**
	 * The empty value for the '{@link #getLienattachementprrt() <em>Lienattachementprrt</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementprrt()
	 * @generated
	 * @ordered
	 */
	protected static final LienAttachementPRRT[] LIENATTACHEMENTPRRT_EEMPTY_ARRAY = new LienAttachementPRRT [0];

	/**
	 * The cached value of the '{@link #getLienattachementpfrfList() <em>Lienattachementpfrf</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementpfrfList()
	 * @generated
	 * @ordered
	 */
	protected EList<LienAttachementPFRF> lienattachementpfrf;

	/**
	 * The empty value for the '{@link #getLienattachementpfrf() <em>Lienattachementpfrf</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementpfrf()
	 * @generated
	 * @ordered
	 */
	protected static final LienAttachementPFRF[] LIENATTACHEMENTPFRF_EEMPTY_ARRAY = new LienAttachementPFRF [0];

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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequisconfig</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisConfig[] getPortrequisconfig() {
		if (portrequisconfig == null || portrequisconfig.isEmpty()) return PORTREQUISCONFIG_EEMPTY_ARRAY;
		BasicEList<PortRequisConfig> list = (BasicEList<PortRequisConfig>)portrequisconfig;
		list.shrink();
		return (PortRequisConfig[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisConfig getPortrequisconfig(int index) {
		return getPortrequisconfigList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPortrequisconfigLength() {
		return portrequisconfig == null ? 0 : portrequisconfig.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequisconfig(PortRequisConfig[] newPortrequisconfig) {
		((BasicEList<PortRequisConfig>)getPortrequisconfigList()).setData(newPortrequisconfig.length, newPortrequisconfig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequisconfig(int index, PortRequisConfig element) {
		getPortrequisconfigList().set(index, element);
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
	 * @generated
	 */
	public List<PortRequisConfig> getPortrequisconfigList() {
		if (portrequisconfig == null) {
			portrequisconfig = new BasicInternalEList<PortRequisConfig>(PortRequisConfig.class);
		}
		return portrequisconfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfourniconfig</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniConfig[] getPortfourniconfig() {
		if (portfourniconfig == null || portfourniconfig.isEmpty()) return PORTFOURNICONFIG_EEMPTY_ARRAY;
		BasicEList<PortFourniConfig> list = (BasicEList<PortFourniConfig>)portfourniconfig;
		list.shrink();
		return (PortFourniConfig[])list.data();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFourniConfig getPortfourniconfig(int index) {
		return getPortfourniconfigList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPortfourniconfigLength() {
		return portfourniconfig == null ? 0 : portfourniconfig.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfourniconfig(PortFourniConfig[] newPortfourniconfig) {
		((BasicEList<PortFourniConfig>)getPortfourniconfigList()).setData(newPortfourniconfig.length, newPortfourniconfig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfourniconfig(int index, PortFourniConfig element) {
		getPortfourniconfigList().set(index, element);
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
	 * @generated
	 */
	public List<PortFourniConfig> getPortfourniconfigList() {
		if (portfourniconfig == null) {
			portfourniconfig = new BasicInternalEList<PortFourniConfig>(PortFourniConfig.class);
		}
		return portfourniconfig;
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
	public LienAttachementPRRT[] getLienattachementprrt() {
		if (lienattachementprrt == null || lienattachementprrt.isEmpty()) return LIENATTACHEMENTPRRT_EEMPTY_ARRAY;
		BasicEList<LienAttachementPRRT> list = (BasicEList<LienAttachementPRRT>)lienattachementprrt;
		list.shrink();
		return (LienAttachementPRRT[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementPRRT getLienattachementprrt(int index) {
		return getLienattachementprrtList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLienattachementprrtLength() {
		return lienattachementprrt == null ? 0 : lienattachementprrt.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLienattachementprrt(LienAttachementPRRT[] newLienattachementprrt) {
		((BasicEList<LienAttachementPRRT>)getLienattachementprrtList()).setData(newLienattachementprrt.length, newLienattachementprrt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLienattachementprrt(int index, LienAttachementPRRT element) {
		getLienattachementprrtList().set(index, element);
	}

	/**
	 * Returns the value of the '<em><b>Lienattachementprrt</b></em>' containment reference list.
	 * The list contents are of type {@link hADL.Liens.LienAttachementPRRT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachementprrt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachementprrt</em>' containment reference list.
	 * @generated
	 */
	public List<LienAttachementPRRT> getLienattachementprrtList() {
		if (lienattachementprrt == null) {
			lienattachementprrt = new BasicInternalEList<LienAttachementPRRT>(LienAttachementPRRT.class);
		}
		return lienattachementprrt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementPFRF[] getLienattachementpfrf() {
		if (lienattachementpfrf == null || lienattachementpfrf.isEmpty()) return LIENATTACHEMENTPFRF_EEMPTY_ARRAY;
		BasicEList<LienAttachementPFRF> list = (BasicEList<LienAttachementPFRF>)lienattachementpfrf;
		list.shrink();
		return (LienAttachementPFRF[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienAttachementPFRF getLienattachementpfrf(int index) {
		return getLienattachementpfrfList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLienattachementpfrfLength() {
		return lienattachementpfrf == null ? 0 : lienattachementpfrf.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLienattachementpfrf(LienAttachementPFRF[] newLienattachementpfrf) {
		((BasicEList<LienAttachementPFRF>)getLienattachementpfrfList()).setData(newLienattachementpfrf.length, newLienattachementpfrf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLienattachementpfrf(int index, LienAttachementPFRF element) {
		getLienattachementpfrfList().set(index, element);
	}

	/**
	 * Returns the value of the '<em><b>Lienattachementpfrf</b></em>' containment reference list.
	 * The list contents are of type {@link hADL.Liens.LienAttachementPFRF}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachementpfrf</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachementpfrf</em>' containment reference list.
	 * @generated
	 */
	public List<LienAttachementPFRF> getLienattachementpfrfList() {
		if (lienattachementpfrf == null) {
			lienattachementpfrf = new BasicInternalEList<LienAttachementPFRF>(LienAttachementPFRF.class);
		}
		return lienattachementpfrf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.CONFIGURATION__PORTREQUISCONFIG:
				return getPortrequisconfigList();
			case ConfigurationPackage.CONFIGURATION__PORTFOURNICONFIG:
				return getPortfourniconfigList();
			case ConfigurationPackage.CONFIGURATION__LIENBINDINGREQUIS:
				return getLienbindingrequisList();
			case ConfigurationPackage.CONFIGURATION__LIENBINDINGFOURNI:
				return getLienbindingfourniList();
			case ConfigurationPackage.CONFIGURATION__LIENATTACHEMENTPRRT:
				return getLienattachementprrtList();
			case ConfigurationPackage.CONFIGURATION__LIENATTACHEMENTPFRF:
				return getLienattachementpfrfList();
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
			case ConfigurationPackage.CONFIGURATION__PORTREQUISCONFIG:
				getPortrequisconfigList().clear();
				getPortrequisconfigList().addAll((Collection<? extends PortRequisConfig>)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION__PORTFOURNICONFIG:
				getPortfourniconfigList().clear();
				getPortfourniconfigList().addAll((Collection<? extends PortFourniConfig>)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION__LIENBINDINGREQUIS:
				getLienbindingrequisList().clear();
				getLienbindingrequisList().addAll((Collection<? extends LienBindingRequis>)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION__LIENBINDINGFOURNI:
				getLienbindingfourniList().clear();
				getLienbindingfourniList().addAll((Collection<? extends LienBindingFourni>)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION__LIENATTACHEMENTPRRT:
				getLienattachementprrtList().clear();
				getLienattachementprrtList().addAll((Collection<? extends LienAttachementPRRT>)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION__LIENATTACHEMENTPFRF:
				getLienattachementpfrfList().clear();
				getLienattachementpfrfList().addAll((Collection<? extends LienAttachementPFRF>)newValue);
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
			case ConfigurationPackage.CONFIGURATION__PORTREQUISCONFIG:
				getPortrequisconfigList().clear();
				return;
			case ConfigurationPackage.CONFIGURATION__PORTFOURNICONFIG:
				getPortfourniconfigList().clear();
				return;
			case ConfigurationPackage.CONFIGURATION__LIENBINDINGREQUIS:
				getLienbindingrequisList().clear();
				return;
			case ConfigurationPackage.CONFIGURATION__LIENBINDINGFOURNI:
				getLienbindingfourniList().clear();
				return;
			case ConfigurationPackage.CONFIGURATION__LIENATTACHEMENTPRRT:
				getLienattachementprrtList().clear();
				return;
			case ConfigurationPackage.CONFIGURATION__LIENATTACHEMENTPFRF:
				getLienattachementpfrfList().clear();
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
			case ConfigurationPackage.CONFIGURATION__PORTREQUISCONFIG:
				return portrequisconfig != null && !portrequisconfig.isEmpty();
			case ConfigurationPackage.CONFIGURATION__PORTFOURNICONFIG:
				return portfourniconfig != null && !portfourniconfig.isEmpty();
			case ConfigurationPackage.CONFIGURATION__LIENBINDINGREQUIS:
				return lienbindingrequis != null && !lienbindingrequis.isEmpty();
			case ConfigurationPackage.CONFIGURATION__LIENBINDINGFOURNI:
				return lienbindingfourni != null && !lienbindingfourni.isEmpty();
			case ConfigurationPackage.CONFIGURATION__LIENATTACHEMENTPRRT:
				return lienattachementprrt != null && !lienattachementprrt.isEmpty();
			case ConfigurationPackage.CONFIGURATION__LIENATTACHEMENTPFRF:
				return lienattachementpfrf != null && !lienattachementpfrf.isEmpty();
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
				case ConfigurationPackage.OBSERVER___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT: return ConfigurationPackage.CONFIGURATION___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT;
				case ConfigurationPackage.OBSERVER___ACTION_VIA_ROLE__ROLETO_OBJECT: return ConfigurationPackage.CONFIGURATION___ACTION_VIA_ROLE__ROLETO_OBJECT;
				case ConfigurationPackage.OBSERVER___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT: return ConfigurationPackage.CONFIGURATION___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT;
				case ConfigurationPackage.OBSERVER___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT: return ConfigurationPackage.CONFIGURATION___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT;
				case ConfigurationPackage.OBSERVER___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT: return ConfigurationPackage.CONFIGURATION___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT;
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
			case ConfigurationPackage.CONFIGURATION___ACTION_VIA_PORT__PORTFOURNICONFIG_OBJECT:
				actionViaPort((PortFourniConfig)arguments.get(0), arguments.get(1));
				return null;
			case ConfigurationPackage.CONFIGURATION___ACTION_VIA_ROLE__ROLETO_OBJECT:
				actionViaRole((RoleTo)arguments.get(0), arguments.get(1));
				return null;
			case ConfigurationPackage.CONFIGURATION___ACTION_VIA_PORT__PORTREQUISCOMPO_OBJECT:
				actionViaPort((PortRequisCompo)arguments.get(0), arguments.get(1));
				return null;
			case ConfigurationPackage.CONFIGURATION___ACTION_VIA_PORT__PORTREQUISCONFIG_OBJECT:
				actionViaPort((PortRequisConfig)arguments.get(0), arguments.get(1));
				return null;
			case ConfigurationPackage.CONFIGURATION___ACTION_VIA_PORT__PORTFOURNICOMPO_OBJECT:
				actionViaPort((PortFourniCompo)arguments.get(0), arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
							/*//search binding
							compo.actionViaPort(portrequis, data);*/
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
	public void actionViaPort(PortRequisCompo port, Object data) {
			//cherche bindings
			PortRequisConfig portDestinataire= null;
			boolean find = false;
			for (LienBindingRequis lien : lienbindingrequis) {
				if(port.equals(lien.getPortCompo())){
					portDestinataire = (PortRequisConfig) lien.getPortConfig();
					break;
				}
			}
			if(portDestinataire!=null){
				for(PortRequisConfig portrequisCourant: getPortrequisconfig()){
					if(portDestinataire.equals(portrequisCourant)){
						actionViaPort(portDestinataire, data);
						return;
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
			if (port.equals(lien.getFrom())){
				roleDestinataire = (RoleFrom) lien.getTo();
				break;
			}
		}
		if(roleDestinataire!=null){
			for(Connecteur connecteur : childConnecteur){
				for(RoleFrom roleFrom: connecteur.getRolefrom()){
					if(roleDestinataire.equals(roleFrom)){
						System.out.println("trouve "+ roleFrom);
						connecteur.notify(roleFrom, data);
						return;
					}
				}
			}
		}else{// pas d'attachement, il faut trouver un binding
			PortFourniConfig portDestinataire= null;
			for (LienBindingFourni lien : lienbindingfourni) {
				if(port.equals(lien.getPortCompo())){
					portDestinataire = (PortFourniConfig) lien.getPortConfig();
					break;
				}
			}

			for(PortFourniConfig portFourniCourant: this.portfourniconfig){
				if(portFourniCourant.equals(portDestinataire)){
					notify(portDestinataire, data);
					return;
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
	 * @param data 
	 * @generated NOT
	 */
	protected void notify(PortFourniConfig portDestinataire, Object data) {
		// TODO Auto-generated method stub
		
	}





} // Configuration
