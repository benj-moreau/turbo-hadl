/**
 */
package hADLM1;

import hADL.Connecteurs.ConnecteurExplicite;
import hADL.Roles.RoleFrom;

import java.util.logging.Logger;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPC Connector Explicite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.RPC_ConnectorExplicite#getCaller_role <em>Caller role</em>}</li>
 *   <li>{@link hADLM1.RPC_ConnectorExplicite#getCalled_roleto <em>Called roleto</em>}</li>
 *   <li>{@link hADLM1.RPC_ConnectorExplicite#getCalledanswer_roleto <em>Calledanswer roleto</em>}</li>
 *   <li>{@link hADLM1.RPC_ConnectorExplicite#getCalleranswer_rolefrom <em>Calleranswer rolefrom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPC_ConnectorExplicite extends ConnecteurExplicite {
	/**
	 * The cached value of the '{@link #getCaller_role() <em>Caller role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaller_role()
	 * @generated
	 * @ordered
	 */
	protected caller_RoleFrom caller_role;

	/**
	 * The cached value of the '{@link #getCalled_roleto() <em>Called roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalled_roleto()
	 * @generated
	 * @ordered
	 */
	protected called_RoleTo called_roleto;

	/**
	 * The cached value of the '{@link #getCalledanswer_roleto() <em>Calledanswer roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledanswer_roleto()
	 * @generated
	 * @ordered
	 */
	protected calledAnswer_RoleTo calledanswer_roleto;

	/**
	 * The cached value of the '{@link #getCalleranswer_rolefrom() <em>Calleranswer rolefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalleranswer_rolefrom()
	 * @generated
	 * @ordered
	 */
	protected callerAnswer_RoleFrom calleranswer_rolefrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPC_ConnectorExplicite() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.RPC_CONNECTOR_EXPLICITE;
	}

	/**
	 * Returns the value of the '<em><b>Caller role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caller role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caller role</em>' containment reference.
	 * @see #setCaller_role(caller_RoleFrom)
	 * @generated
	 */
	public caller_RoleFrom getCaller_role() {
		return caller_role;
	}

	/**
	 * Sets the value of the '{@link hADLM1.RPC_ConnectorExplicite#getCaller_role <em>Caller role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caller role</em>' containment reference.
	 * @see #getCaller_role()
	 * @generated
	 */
	public void setCaller_role(caller_RoleFrom newCaller_role) {
		caller_role = newCaller_role;
	}

	/**
	 * Returns the value of the '<em><b>Called roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called roleto</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called roleto</em>' containment reference.
	 * @see #setCalled_roleto(called_RoleTo)
	 * @generated
	 */
	public called_RoleTo getCalled_roleto() {
		return called_roleto;
	}

	/**
	 * Sets the value of the '{@link hADLM1.RPC_ConnectorExplicite#getCalled_roleto <em>Called roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called roleto</em>' containment reference.
	 * @see #getCalled_roleto()
	 * @generated
	 */
	public void setCalled_roleto(called_RoleTo newCalled_roleto) {
		called_roleto = newCalled_roleto;
	}

	/**
	 * Returns the value of the '<em><b>Calledanswer roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calledanswer roleto</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calledanswer roleto</em>' containment reference.
	 * @see #setCalledanswer_roleto(calledAnswer_RoleTo)
	 * @generated
	 */
	public calledAnswer_RoleTo getCalledanswer_roleto() {
		return calledanswer_roleto;
	}

	/**
	 * Sets the value of the '{@link hADLM1.RPC_ConnectorExplicite#getCalledanswer_roleto <em>Calledanswer roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calledanswer roleto</em>' containment reference.
	 * @see #getCalledanswer_roleto()
	 * @generated
	 */
	public void setCalledanswer_roleto(calledAnswer_RoleTo newCalledanswer_roleto) {
		calledanswer_roleto = newCalledanswer_roleto;
	}

	/**
	 * Returns the value of the '<em><b>Calleranswer rolefrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calleranswer rolefrom</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calleranswer rolefrom</em>' containment reference.
	 * @see #setCalleranswer_rolefrom(callerAnswer_RoleFrom)
	 * @generated
	 */
	public callerAnswer_RoleFrom getCalleranswer_rolefrom() {
		return calleranswer_rolefrom;
	}

	/**
	 * Sets the value of the '{@link hADLM1.RPC_ConnectorExplicite#getCalleranswer_rolefrom <em>Calleranswer rolefrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calleranswer rolefrom</em>' containment reference.
	 * @see #getCalleranswer_rolefrom()
	 * @generated
	 */
	public void setCalleranswer_rolefrom(callerAnswer_RoleFrom newCalleranswer_rolefrom) {
		calleranswer_rolefrom = newCalleranswer_rolefrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.RPC_CONNECTOR_EXPLICITE__CALLER_ROLE:
				return getCaller_role();
			case HADLM1Package.RPC_CONNECTOR_EXPLICITE__CALLED_ROLETO:
				return getCalled_roleto();
			case HADLM1Package.RPC_CONNECTOR_EXPLICITE__CALLEDANSWER_ROLETO:
				return getCalledanswer_roleto();
			case HADLM1Package.RPC_CONNECTOR_EXPLICITE__CALLERANSWER_ROLEFROM:
				return getCalleranswer_rolefrom();
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
			case HADLM1Package.RPC_CONNECTOR_EXPLICITE__CALLER_ROLE:
				setCaller_role((caller_RoleFrom)newValue);
				return;
			case HADLM1Package.RPC_CONNECTOR_EXPLICITE__CALLED_ROLETO:
				setCalled_roleto((called_RoleTo)newValue);
				return;
			case HADLM1Package.RPC_CONNECTOR_EXPLICITE__CALLEDANSWER_ROLETO:
				setCalledanswer_roleto((calledAnswer_RoleTo)newValue);
				return;
			case HADLM1Package.RPC_CONNECTOR_EXPLICITE__CALLERANSWER_ROLEFROM:
				setCalleranswer_rolefrom((callerAnswer_RoleFrom)newValue);
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
			case HADLM1Package.RPC_CONNECTOR_EXPLICITE__CALLER_ROLE:
				setCaller_role((caller_RoleFrom)null);
				return;
			case HADLM1Package.RPC_CONNECTOR_EXPLICITE__CALLED_ROLETO:
				setCalled_roleto((called_RoleTo)null);
				return;
			case HADLM1Package.RPC_CONNECTOR_EXPLICITE__CALLEDANSWER_ROLETO:
				setCalledanswer_roleto((calledAnswer_RoleTo)null);
				return;
			case HADLM1Package.RPC_CONNECTOR_EXPLICITE__CALLERANSWER_ROLEFROM:
				setCalleranswer_rolefrom((callerAnswer_RoleFrom)null);
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
			case HADLM1Package.RPC_CONNECTOR_EXPLICITE__CALLER_ROLE:
				return caller_role != null;
			case HADLM1Package.RPC_CONNECTOR_EXPLICITE__CALLED_ROLETO:
				return called_roleto != null;
			case HADLM1Package.RPC_CONNECTOR_EXPLICITE__CALLEDANSWER_ROLETO:
				return calledanswer_roleto != null;
			case HADLM1Package.RPC_CONNECTOR_EXPLICITE__CALLERANSWER_ROLEFROM:
				return calleranswer_rolefrom != null;
		}
		return super.eIsSet(featureID);
	}
	/**
	 * @generated NOT
	 */
	private static final Logger LOGGER = Logger.getAnonymousLogger();
	/**
	 * @generated NOT
	 */
	public void notify(RoleFrom roleFrom, Object data) {
		if(caller_role.equals(roleFrom)){
			LOGGER.info("Reception requete "+ data);
			called_roleto.notifyConfig(data);
		}else if(calleranswer_rolefrom.equals(roleFrom)){
			LOGGER.info("Reception reponse "+ data);
		}
		
	}
	

} // RPC_ConnectorExplicite
