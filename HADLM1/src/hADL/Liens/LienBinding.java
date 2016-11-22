/**
 */
package hADL.Liens;

import org.eclipse.emf.ecore.EClass;

import hADL.Interfaces.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @generated
 */
public abstract class LienBinding extends Lien {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienBinding() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LiensPackage.Literals.LIEN_BINDING;
	}
	public abstract Port getPortCompo();
	public abstract Port getPortConfig();

} // LienBinding
