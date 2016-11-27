/**
 */
package hADLM1;

import hADL.Configuration.Configuration;
import hADL.Interfaces.PortFourniConfig;

import java.util.logging.Logger;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serveur Details Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getConnectionmanager_composant <em>Connectionmanager composant</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getSecuritymanager_composant <em>Securitymanager composant</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getDatabase_composant <em>Database composant</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getClearencerequest_connector <em>Clearencerequest connector</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getSqlrequest_connector <em>Sqlrequest connector</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getSecurityquery_connector <em>Securityquery connector</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getLienattachementx1 <em>Lienattachementx1</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getLienattachementx2 <em>Lienattachementx2</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getLienattachementx3 <em>Lienattachementx3</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getLienattachementx4 <em>Lienattachementx4</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getLienattachementx5 <em>Lienattachementx5</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getLienattachementx6 <em>Lienattachementx6</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getLienattachementy1 <em>Lienattachementy1</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getLienattachementy2 <em>Lienattachementy2</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getLienattachementy3 <em>Lienattachementy3</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getLienattachementy6 <em>Lienattachementy6</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getLienattachementy4 <em>Lienattachementy4</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getLienattachementy5 <em>Lienattachementy5</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getReceiverequestrequisconfig <em>Receiverequestrequisconfig</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getAnswerrequest_portfourni <em>Answerrequest portfourni</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getBindingserveurfourni <em>Bindingserveurfourni</em>}</li>
 *   <li>{@link hADLM1.ServeurDetails_Configuration#getBindingrequisserveurdetails <em>Bindingrequisserveurdetails</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServeurDetails_Configuration extends Configuration {
	/**
	 * The cached value of the '{@link #getConnectionmanager_composant() <em>Connectionmanager composant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionmanager_composant()
	 * @generated
	 * @ordered
	 */
	protected ConnectionManager_Composant connectionmanager_composant;

	/**
	 * The cached value of the '{@link #getSecuritymanager_composant() <em>Securitymanager composant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritymanager_composant()
	 * @generated
	 * @ordered
	 */
	protected SecurityManager_Composant securitymanager_composant;

	/**
	 * The cached value of the '{@link #getDatabase_composant() <em>Database composant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase_composant()
	 * @generated
	 * @ordered
	 */
	protected Database_Composant database_composant;

	/**
	 * The cached value of the '{@link #getClearencerequest_connector() <em>Clearencerequest connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearencerequest_connector()
	 * @generated
	 * @ordered
	 */
	protected ClearenceRequest_Connector clearencerequest_connector;

	/**
	 * The cached value of the '{@link #getSqlrequest_connector() <em>Sqlrequest connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlrequest_connector()
	 * @generated
	 * @ordered
	 */
	protected SQLRequest_Connector sqlrequest_connector;

	/**
	 * The cached value of the '{@link #getSecurityquery_connector() <em>Securityquery connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityquery_connector()
	 * @generated
	 * @ordered
	 */
	protected SecurityQuery_Connector securityquery_connector;

	/**
	 * The cached value of the '{@link #getLienattachementx1() <em>Lienattachementx1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementx1()
	 * @generated
	 * @ordered
	 */
	protected LienAttachementX1 lienattachementx1;

	/**
	 * The cached value of the '{@link #getLienattachementx2() <em>Lienattachementx2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementx2()
	 * @generated
	 * @ordered
	 */
	protected LienAttachementX2 lienattachementx2;

	/**
	 * The cached value of the '{@link #getLienattachementx3() <em>Lienattachementx3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementx3()
	 * @generated
	 * @ordered
	 */
	protected LienAttachementX3 lienattachementx3;

	/**
	 * The cached value of the '{@link #getLienattachementx4() <em>Lienattachementx4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementx4()
	 * @generated
	 * @ordered
	 */
	protected LienAttachementX4 lienattachementx4;

	/**
	 * The cached value of the '{@link #getLienattachementx5() <em>Lienattachementx5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementx5()
	 * @generated
	 * @ordered
	 */
	protected LienAttachementX5 lienattachementx5;

	/**
	 * The cached value of the '{@link #getLienattachementx6() <em>Lienattachementx6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementx6()
	 * @generated
	 * @ordered
	 */
	protected LienAttachementX6 lienattachementx6;

	/**
	 * The cached value of the '{@link #getLienattachementy1() <em>Lienattachementy1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementy1()
	 * @generated
	 * @ordered
	 */
	protected LienAttachementY1 lienattachementy1;

	/**
	 * The cached value of the '{@link #getLienattachementy2() <em>Lienattachementy2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementy2()
	 * @generated
	 * @ordered
	 */
	protected LienAttachementY2 lienattachementy2;

	/**
	 * The cached value of the '{@link #getLienattachementy3() <em>Lienattachementy3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementy3()
	 * @generated
	 * @ordered
	 */
	protected LienAttachementY3 lienattachementy3;

	/**
	 * The cached value of the '{@link #getLienattachementy6() <em>Lienattachementy6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementy6()
	 * @generated
	 * @ordered
	 */
	protected LienAttachementY6 lienattachementy6;

	/**
	 * The cached value of the '{@link #getLienattachementy4() <em>Lienattachementy4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementy4()
	 * @generated
	 * @ordered
	 */
	protected LienAttachementY4 lienattachementy4;

	/**
	 * The cached value of the '{@link #getLienattachementy5() <em>Lienattachementy5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienattachementy5()
	 * @generated
	 * @ordered
	 */
	protected LienAttachementY5 lienattachementy5;

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
	 * The cached value of the '{@link #getAnswerrequest_portfourni() <em>Answerrequest portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerrequest_portfourni()
	 * @generated
	 * @ordered
	 */
	protected AnswerRequest_PortFourni answerrequest_portfourni;

	/**
	 * The cached value of the '{@link #getBindingserveurfourni() <em>Bindingserveurfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingserveurfourni()
	 * @generated
	 * @ordered
	 */
	protected BindingServeurFOurni bindingserveurfourni;

	/**
	 * The cached value of the '{@link #getBindingrequisserveurdetails() <em>Bindingrequisserveurdetails</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingrequisserveurdetails()
	 * @generated
	 * @ordered
	 */
	protected bindingRequisServeurDetails bindingrequisserveurdetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServeurDetails_Configuration() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.SERVEUR_DETAILS_CONFIGURATION;
	}

	/**
	 * Returns the value of the '<em><b>Connectionmanager composant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectionmanager composant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectionmanager composant</em>' containment reference.
	 * @see #setConnectionmanager_composant(ConnectionManager_Composant)
	 * @generated
	 */
	public ConnectionManager_Composant getConnectionmanager_composant() {
		return connectionmanager_composant;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getConnectionmanager_composant <em>Connectionmanager composant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectionmanager composant</em>' containment reference.
	 * @see #getConnectionmanager_composant()
	 * @generated
	 */
	public void setConnectionmanager_composant(ConnectionManager_Composant newConnectionmanager_composant) {
		connectionmanager_composant = newConnectionmanager_composant;
	}

	/**
	 * Returns the value of the '<em><b>Securitymanager composant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitymanager composant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitymanager composant</em>' containment reference.
	 * @see #setSecuritymanager_composant(SecurityManager_Composant)
	 * @generated
	 */
	public SecurityManager_Composant getSecuritymanager_composant() {
		return securitymanager_composant;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getSecuritymanager_composant <em>Securitymanager composant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securitymanager composant</em>' containment reference.
	 * @see #getSecuritymanager_composant()
	 * @generated
	 */
	public void setSecuritymanager_composant(SecurityManager_Composant newSecuritymanager_composant) {
		securitymanager_composant = newSecuritymanager_composant;
	}

	/**
	 * Returns the value of the '<em><b>Database composant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database composant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database composant</em>' containment reference.
	 * @see #setDatabase_composant(Database_Composant)
	 * @generated
	 */
	public Database_Composant getDatabase_composant() {
		return database_composant;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getDatabase_composant <em>Database composant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database composant</em>' containment reference.
	 * @see #getDatabase_composant()
	 * @generated
	 */
	public void setDatabase_composant(Database_Composant newDatabase_composant) {
		database_composant = newDatabase_composant;
	}

	/**
	 * Returns the value of the '<em><b>Clearencerequest connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clearencerequest connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clearencerequest connector</em>' containment reference.
	 * @see #setClearencerequest_connector(ClearenceRequest_Connector)
	 * @generated
	 */
	public ClearenceRequest_Connector getClearencerequest_connector() {
		return clearencerequest_connector;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getClearencerequest_connector <em>Clearencerequest connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clearencerequest connector</em>' containment reference.
	 * @see #getClearencerequest_connector()
	 * @generated
	 */
	public void setClearencerequest_connector(ClearenceRequest_Connector newClearencerequest_connector) {
		clearencerequest_connector = newClearencerequest_connector;
	}

	/**
	 * Returns the value of the '<em><b>Sqlrequest connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sqlrequest connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sqlrequest connector</em>' containment reference.
	 * @see #setSqlrequest_connector(SQLRequest_Connector)
	 * @generated
	 */
	public SQLRequest_Connector getSqlrequest_connector() {
		return sqlrequest_connector;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getSqlrequest_connector <em>Sqlrequest connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sqlrequest connector</em>' containment reference.
	 * @see #getSqlrequest_connector()
	 * @generated
	 */
	public void setSqlrequest_connector(SQLRequest_Connector newSqlrequest_connector) {
		sqlrequest_connector = newSqlrequest_connector;
	}

	/**
	 * Returns the value of the '<em><b>Securityquery connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityquery connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityquery connector</em>' containment reference.
	 * @see #setSecurityquery_connector(SecurityQuery_Connector)
	 * @generated
	 */
	public SecurityQuery_Connector getSecurityquery_connector() {
		return securityquery_connector;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getSecurityquery_connector <em>Securityquery connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityquery connector</em>' containment reference.
	 * @see #getSecurityquery_connector()
	 * @generated
	 */
	public void setSecurityquery_connector(SecurityQuery_Connector newSecurityquery_connector) {
		securityquery_connector = newSecurityquery_connector;
	}

	/**
	 * Returns the value of the '<em><b>Lienattachementx1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachementx1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachementx1</em>' containment reference.
	 * @see #setLienattachementx1(LienAttachementX1)
	 * @generated
	 */
	public LienAttachementX1 getLienattachementx1() {
		return lienattachementx1;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getLienattachementx1 <em>Lienattachementx1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lienattachementx1</em>' containment reference.
	 * @see #getLienattachementx1()
	 * @generated
	 */
	public void setLienattachementx1(LienAttachementX1 newLienattachementx1) {
		lienattachementx1 = newLienattachementx1;
	}

	/**
	 * Returns the value of the '<em><b>Lienattachementx2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachementx2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachementx2</em>' containment reference.
	 * @see #setLienattachementx2(LienAttachementX2)
	 * @generated
	 */
	public LienAttachementX2 getLienattachementx2() {
		return lienattachementx2;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getLienattachementx2 <em>Lienattachementx2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lienattachementx2</em>' containment reference.
	 * @see #getLienattachementx2()
	 * @generated
	 */
	public void setLienattachementx2(LienAttachementX2 newLienattachementx2) {
		lienattachementx2 = newLienattachementx2;
	}

	/**
	 * Returns the value of the '<em><b>Lienattachementx3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachementx3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachementx3</em>' containment reference.
	 * @see #setLienattachementx3(LienAttachementX3)
	 * @generated
	 */
	public LienAttachementX3 getLienattachementx3() {
		return lienattachementx3;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getLienattachementx3 <em>Lienattachementx3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lienattachementx3</em>' containment reference.
	 * @see #getLienattachementx3()
	 * @generated
	 */
	public void setLienattachementx3(LienAttachementX3 newLienattachementx3) {
		lienattachementx3 = newLienattachementx3;
	}

	/**
	 * Returns the value of the '<em><b>Lienattachementx4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachementx4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachementx4</em>' containment reference.
	 * @see #setLienattachementx4(LienAttachementX4)
	 * @generated
	 */
	public LienAttachementX4 getLienattachementx4() {
		return lienattachementx4;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getLienattachementx4 <em>Lienattachementx4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lienattachementx4</em>' containment reference.
	 * @see #getLienattachementx4()
	 * @generated
	 */
	public void setLienattachementx4(LienAttachementX4 newLienattachementx4) {
		lienattachementx4 = newLienattachementx4;
	}

	/**
	 * Returns the value of the '<em><b>Lienattachementx5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachementx5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachementx5</em>' containment reference.
	 * @see #setLienattachementx5(LienAttachementX5)
	 * @generated
	 */
	public LienAttachementX5 getLienattachementx5() {
		return lienattachementx5;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getLienattachementx5 <em>Lienattachementx5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lienattachementx5</em>' containment reference.
	 * @see #getLienattachementx5()
	 * @generated
	 */
	public void setLienattachementx5(LienAttachementX5 newLienattachementx5) {
		lienattachementx5 = newLienattachementx5;
	}

	/**
	 * Returns the value of the '<em><b>Lienattachementx6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachementx6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachementx6</em>' containment reference.
	 * @see #setLienattachementx6(LienAttachementX6)
	 * @generated
	 */
	public LienAttachementX6 getLienattachementx6() {
		return lienattachementx6;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getLienattachementx6 <em>Lienattachementx6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lienattachementx6</em>' containment reference.
	 * @see #getLienattachementx6()
	 * @generated
	 */
	public void setLienattachementx6(LienAttachementX6 newLienattachementx6) {
		lienattachementx6 = newLienattachementx6;
	}

	/**
	 * Returns the value of the '<em><b>Lienattachementy1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachementy1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachementy1</em>' containment reference.
	 * @see #setLienattachementy1(LienAttachementY1)
	 * @generated
	 */
	public LienAttachementY1 getLienattachementy1() {
		return lienattachementy1;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getLienattachementy1 <em>Lienattachementy1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lienattachementy1</em>' containment reference.
	 * @see #getLienattachementy1()
	 * @generated
	 */
	public void setLienattachementy1(LienAttachementY1 newLienattachementy1) {
		lienattachementy1 = newLienattachementy1;
	}

	/**
	 * Returns the value of the '<em><b>Lienattachementy2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachementy2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachementy2</em>' containment reference.
	 * @see #setLienattachementy2(LienAttachementY2)
	 * @generated
	 */
	public LienAttachementY2 getLienattachementy2() {
		return lienattachementy2;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getLienattachementy2 <em>Lienattachementy2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lienattachementy2</em>' containment reference.
	 * @see #getLienattachementy2()
	 * @generated
	 */
	public void setLienattachementy2(LienAttachementY2 newLienattachementy2) {
		lienattachementy2 = newLienattachementy2;
	}

	/**
	 * Returns the value of the '<em><b>Lienattachementy3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachementy3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachementy3</em>' containment reference.
	 * @see #setLienattachementy3(LienAttachementY3)
	 * @generated
	 */
	public LienAttachementY3 getLienattachementy3() {
		return lienattachementy3;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getLienattachementy3 <em>Lienattachementy3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lienattachementy3</em>' containment reference.
	 * @see #getLienattachementy3()
	 * @generated
	 */
	public void setLienattachementy3(LienAttachementY3 newLienattachementy3) {
		lienattachementy3 = newLienattachementy3;
	}

	/**
	 * Returns the value of the '<em><b>Lienattachementy6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachementy6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachementy6</em>' containment reference.
	 * @see #setLienattachementy6(LienAttachementY6)
	 * @generated
	 */
	public LienAttachementY6 getLienattachementy6() {
		return lienattachementy6;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getLienattachementy6 <em>Lienattachementy6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lienattachementy6</em>' containment reference.
	 * @see #getLienattachementy6()
	 * @generated
	 */
	public void setLienattachementy6(LienAttachementY6 newLienattachementy6) {
		lienattachementy6 = newLienattachementy6;
	}

	/**
	 * Returns the value of the '<em><b>Lienattachementy4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachementy4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachementy4</em>' containment reference.
	 * @see #setLienattachementy4(LienAttachementY4)
	 * @generated
	 */
	public LienAttachementY4 getLienattachementy4() {
		return lienattachementy4;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getLienattachementy4 <em>Lienattachementy4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lienattachementy4</em>' containment reference.
	 * @see #getLienattachementy4()
	 * @generated
	 */
	public void setLienattachementy4(LienAttachementY4 newLienattachementy4) {
		lienattachementy4 = newLienattachementy4;
	}

	/**
	 * Returns the value of the '<em><b>Lienattachementy5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lienattachementy5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lienattachementy5</em>' containment reference.
	 * @see #setLienattachementy5(LienAttachementY5)
	 * @generated
	 */
	public LienAttachementY5 getLienattachementy5() {
		return lienattachementy5;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getLienattachementy5 <em>Lienattachementy5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lienattachementy5</em>' containment reference.
	 * @see #getLienattachementy5()
	 * @generated
	 */
	public void setLienattachementy5(LienAttachementY5 newLienattachementy5) {
		lienattachementy5 = newLienattachementy5;
	}

	/**
	 * Returns the value of the '<em><b>Receiverequestrequisconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiverequestrequisconfig</em>' containment reference list isn't clear,
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
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getReceiverequestrequisconfig <em>Receiverequestrequisconfig</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Answerrequest portfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answerrequest portfourni</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answerrequest portfourni</em>' containment reference.
	 * @see #setAnswerrequest_portfourni(AnswerRequest_PortFourni)
	 * @generated
	 */
	public AnswerRequest_PortFourni getAnswerrequest_portfourni() {
		return answerrequest_portfourni;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getAnswerrequest_portfourni <em>Answerrequest portfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answerrequest portfourni</em>' containment reference.
	 * @see #getAnswerrequest_portfourni()
	 * @generated
	 */
	public void setAnswerrequest_portfourni(AnswerRequest_PortFourni newAnswerrequest_portfourni) {
		answerrequest_portfourni = newAnswerrequest_portfourni;
	}

	/**
	 * Returns the value of the '<em><b>Bindingserveurfourni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindingserveurfourni</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindingserveurfourni</em>' containment reference.
	 * @see #setBindingserveurfourni(BindingServeurFOurni)
	 * @generated
	 */
	public BindingServeurFOurni getBindingserveurfourni() {
		return bindingserveurfourni;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getBindingserveurfourni <em>Bindingserveurfourni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindingserveurfourni</em>' containment reference.
	 * @see #getBindingserveurfourni()
	 * @generated
	 */
	public void setBindingserveurfourni(BindingServeurFOurni newBindingserveurfourni) {
		bindingserveurfourni = newBindingserveurfourni;
	}

	/**
	 * Returns the value of the '<em><b>Bindingrequisserveurdetails</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindingrequisserveurdetails</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindingrequisserveurdetails</em>' containment reference.
	 * @see #setBindingrequisserveurdetails(bindingRequisServeurDetails)
	 * @generated
	 */
	public bindingRequisServeurDetails getBindingrequisserveurdetails() {
		return bindingrequisserveurdetails;
	}

	/**
	 * Sets the value of the '{@link hADLM1.ServeurDetails_Configuration#getBindingrequisserveurdetails <em>Bindingrequisserveurdetails</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindingrequisserveurdetails</em>' containment reference.
	 * @see #getBindingrequisserveurdetails()
	 * @generated
	 */
	public void setBindingrequisserveurdetails(bindingRequisServeurDetails newBindingrequisserveurdetails) {
		bindingrequisserveurdetails = newBindingrequisserveurdetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__CONNECTIONMANAGER_COMPOSANT:
				return getConnectionmanager_composant();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__SECURITYMANAGER_COMPOSANT:
				return getSecuritymanager_composant();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__DATABASE_COMPOSANT:
				return getDatabase_composant();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__CLEARENCEREQUEST_CONNECTOR:
				return getClearencerequest_connector();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__SQLREQUEST_CONNECTOR:
				return getSqlrequest_connector();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__SECURITYQUERY_CONNECTOR:
				return getSecurityquery_connector();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX1:
				return getLienattachementx1();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX2:
				return getLienattachementx2();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX3:
				return getLienattachementx3();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX4:
				return getLienattachementx4();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX5:
				return getLienattachementx5();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX6:
				return getLienattachementx6();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY1:
				return getLienattachementy1();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY2:
				return getLienattachementy2();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY3:
				return getLienattachementy3();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY6:
				return getLienattachementy6();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY4:
				return getLienattachementy4();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY5:
				return getLienattachementy5();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__RECEIVEREQUESTREQUISCONFIG:
				return getReceiverequestrequisconfig();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__ANSWERREQUEST_PORTFOURNI:
				return getAnswerrequest_portfourni();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__BINDINGSERVEURFOURNI:
				return getBindingserveurfourni();
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__BINDINGREQUISSERVEURDETAILS:
				return getBindingrequisserveurdetails();
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
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__CONNECTIONMANAGER_COMPOSANT:
				setConnectionmanager_composant((ConnectionManager_Composant)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__SECURITYMANAGER_COMPOSANT:
				setSecuritymanager_composant((SecurityManager_Composant)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__DATABASE_COMPOSANT:
				setDatabase_composant((Database_Composant)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__CLEARENCEREQUEST_CONNECTOR:
				setClearencerequest_connector((ClearenceRequest_Connector)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__SQLREQUEST_CONNECTOR:
				setSqlrequest_connector((SQLRequest_Connector)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__SECURITYQUERY_CONNECTOR:
				setSecurityquery_connector((SecurityQuery_Connector)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX1:
				setLienattachementx1((LienAttachementX1)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX2:
				setLienattachementx2((LienAttachementX2)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX3:
				setLienattachementx3((LienAttachementX3)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX4:
				setLienattachementx4((LienAttachementX4)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX5:
				setLienattachementx5((LienAttachementX5)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX6:
				setLienattachementx6((LienAttachementX6)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY1:
				setLienattachementy1((LienAttachementY1)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY2:
				setLienattachementy2((LienAttachementY2)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY3:
				setLienattachementy3((LienAttachementY3)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY6:
				setLienattachementy6((LienAttachementY6)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY4:
				setLienattachementy4((LienAttachementY4)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY5:
				setLienattachementy5((LienAttachementY5)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__RECEIVEREQUESTREQUISCONFIG:
				setReceiverequestrequisconfig((ReceiveRequestRequisConfig)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__ANSWERREQUEST_PORTFOURNI:
				setAnswerrequest_portfourni((AnswerRequest_PortFourni)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__BINDINGSERVEURFOURNI:
				setBindingserveurfourni((BindingServeurFOurni)newValue);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__BINDINGREQUISSERVEURDETAILS:
				setBindingrequisserveurdetails((bindingRequisServeurDetails)newValue);
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
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__CONNECTIONMANAGER_COMPOSANT:
				setConnectionmanager_composant((ConnectionManager_Composant)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__SECURITYMANAGER_COMPOSANT:
				setSecuritymanager_composant((SecurityManager_Composant)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__DATABASE_COMPOSANT:
				setDatabase_composant((Database_Composant)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__CLEARENCEREQUEST_CONNECTOR:
				setClearencerequest_connector((ClearenceRequest_Connector)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__SQLREQUEST_CONNECTOR:
				setSqlrequest_connector((SQLRequest_Connector)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__SECURITYQUERY_CONNECTOR:
				setSecurityquery_connector((SecurityQuery_Connector)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX1:
				setLienattachementx1((LienAttachementX1)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX2:
				setLienattachementx2((LienAttachementX2)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX3:
				setLienattachementx3((LienAttachementX3)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX4:
				setLienattachementx4((LienAttachementX4)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX5:
				setLienattachementx5((LienAttachementX5)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX6:
				setLienattachementx6((LienAttachementX6)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY1:
				setLienattachementy1((LienAttachementY1)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY2:
				setLienattachementy2((LienAttachementY2)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY3:
				setLienattachementy3((LienAttachementY3)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY6:
				setLienattachementy6((LienAttachementY6)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY4:
				setLienattachementy4((LienAttachementY4)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY5:
				setLienattachementy5((LienAttachementY5)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__RECEIVEREQUESTREQUISCONFIG:
				setReceiverequestrequisconfig((ReceiveRequestRequisConfig)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__ANSWERREQUEST_PORTFOURNI:
				setAnswerrequest_portfourni((AnswerRequest_PortFourni)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__BINDINGSERVEURFOURNI:
				setBindingserveurfourni((BindingServeurFOurni)null);
				return;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__BINDINGREQUISSERVEURDETAILS:
				setBindingrequisserveurdetails((bindingRequisServeurDetails)null);
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
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__CONNECTIONMANAGER_COMPOSANT:
				return connectionmanager_composant != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__SECURITYMANAGER_COMPOSANT:
				return securitymanager_composant != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__DATABASE_COMPOSANT:
				return database_composant != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__CLEARENCEREQUEST_CONNECTOR:
				return clearencerequest_connector != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__SQLREQUEST_CONNECTOR:
				return sqlrequest_connector != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__SECURITYQUERY_CONNECTOR:
				return securityquery_connector != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX1:
				return lienattachementx1 != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX2:
				return lienattachementx2 != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX3:
				return lienattachementx3 != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX4:
				return lienattachementx4 != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX5:
				return lienattachementx5 != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTX6:
				return lienattachementx6 != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY1:
				return lienattachementy1 != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY2:
				return lienattachementy2 != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY3:
				return lienattachementy3 != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY6:
				return lienattachementy6 != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY4:
				return lienattachementy4 != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__LIENATTACHEMENTY5:
				return lienattachementy5 != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__RECEIVEREQUESTREQUISCONFIG:
				return receiverequestrequisconfig != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__ANSWERREQUEST_PORTFOURNI:
				return answerrequest_portfourni != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__BINDINGSERVEURFOURNI:
				return bindingserveurfourni != null;
			case HADLM1Package.SERVEUR_DETAILS_CONFIGURATION__BINDINGREQUISSERVEURDETAILS:
				return bindingrequisserveurdetails != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	private static final Logger LOGGER = Logger.getAnonymousLogger();
	/**
	 * @param data 
	 * @generated NOT
	 */
	protected void notify(PortFourniConfig portDestinataire, Object data) {
		if (portDestinataire.equals(answerrequest_portfourni)) {
			LOGGER.info("Passage par Serveur Details Configuration");
			portDestinataire.notifyConfig(data);
		}else{
			LOGGER.warning("mauvais port");
		}
		
	}
} // ServeurDetails_Configuration
