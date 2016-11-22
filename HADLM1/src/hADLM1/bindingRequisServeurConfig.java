/**
 */
package hADLM1;

import hADL.Liens.LienBindingRequis;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>binding Requis Serveur Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.bindingRequisServeurConfig#getReceiverequestrequisconfig <em>Receiverequestrequisconfig</em>}</li>
 *   <li>{@link hADLM1.bindingRequisServeurConfig#getReceive_request_portrequiscompo <em>Receive request portrequiscompo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class bindingRequisServeurConfig extends LienBindingRequis {
	/**
	 * The cached value of the '{@link #getReceiverequestrequisconfig() <em>Receiverequestrequisconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverequestrequisconfig()
	 * @generated
	 * @ordered
	 */
	protected ReceiveRequestRequisConfig receiverequestrequisconfig;

	/**
	 * The cached value of the '{@link #getReceive_request_portrequiscompo() <em>Receive request portrequiscompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceive_request_portrequiscompo()
	 * @generated
	 * @ordered
	 */
	protected Receive_request_PortRequisCompo receive_request_portrequiscompo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected bindingRequisServeurConfig() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.BINDING_REQUIS_SERVEUR_CONFIG;
	}

	/**
	 * Returns the value of the '<em><b>Receiverequestrequisconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiverequestrequisconfig</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiverequestrequisconfig</em>' containment reference.
	 * @see #setReceiverequestrequisconfig(ReceiveRequestRequisConfig)
	 * @generated
	 */
	public ReceiveRequestRequisConfig getReceiverequestrequisconfig() {
		return receiverequestrequisconfig;
	}

	/**
	 * Sets the value of the '{@link hADLM1.bindingRequisServeurConfig#getReceiverequestrequisconfig <em>Receiverequestrequisconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiverequestrequisconfig</em>' containment reference.
	 * @see #getReceiverequestrequisconfig()
	 * @generated
	 */
	public void setReceiverequestrequisconfig(ReceiveRequestRequisConfig newReceiverequestrequisconfig) {
		receiverequestrequisconfig = newReceiverequestrequisconfig;
	}

	/**
	 * Returns the value of the '<em><b>Receive request portrequiscompo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive request portrequiscompo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive request portrequiscompo</em>' containment reference.
	 * @see #setReceive_request_portrequiscompo(Receive_request_PortRequisCompo)
	 * @generated
	 */
	public Receive_request_PortRequisCompo getReceive_request_portrequiscompo() {
		return receive_request_portrequiscompo;
	}

	/**
	 * Sets the value of the '{@link hADLM1.bindingRequisServeurConfig#getReceive_request_portrequiscompo <em>Receive request portrequiscompo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive request portrequiscompo</em>' containment reference.
	 * @see #getReceive_request_portrequiscompo()
	 * @generated
	 */
	public void setReceive_request_portrequiscompo(Receive_request_PortRequisCompo newReceive_request_portrequiscompo) {
		receive_request_portrequiscompo = newReceive_request_portrequiscompo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.BINDING_REQUIS_SERVEUR_CONFIG__RECEIVEREQUESTREQUISCONFIG:
				return getReceiverequestrequisconfig();
			case HADLM1Package.BINDING_REQUIS_SERVEUR_CONFIG__RECEIVE_REQUEST_PORTREQUISCOMPO:
				return getReceive_request_portrequiscompo();
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
			case HADLM1Package.BINDING_REQUIS_SERVEUR_CONFIG__RECEIVEREQUESTREQUISCONFIG:
				setReceiverequestrequisconfig((ReceiveRequestRequisConfig)newValue);
				return;
			case HADLM1Package.BINDING_REQUIS_SERVEUR_CONFIG__RECEIVE_REQUEST_PORTREQUISCOMPO:
				setReceive_request_portrequiscompo((Receive_request_PortRequisCompo)newValue);
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
			case HADLM1Package.BINDING_REQUIS_SERVEUR_CONFIG__RECEIVEREQUESTREQUISCONFIG:
				setReceiverequestrequisconfig((ReceiveRequestRequisConfig)null);
				return;
			case HADLM1Package.BINDING_REQUIS_SERVEUR_CONFIG__RECEIVE_REQUEST_PORTREQUISCOMPO:
				setReceive_request_portrequiscompo((Receive_request_PortRequisCompo)null);
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
			case HADLM1Package.BINDING_REQUIS_SERVEUR_CONFIG__RECEIVEREQUESTREQUISCONFIG:
				return receiverequestrequisconfig != null;
			case HADLM1Package.BINDING_REQUIS_SERVEUR_CONFIG__RECEIVE_REQUEST_PORTREQUISCOMPO:
				return receive_request_portrequiscompo != null;
		}
		return super.eIsSet(featureID);
	}

} // bindingRequisServeurConfig
