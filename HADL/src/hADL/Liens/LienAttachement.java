/**
 */
package hADL.Liens;

import org.eclipse.emf.ecore.EClass;

import hADL.Interfaces.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Attachement</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see hADL.Liens.LiensPackage#getLienAttachement()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class LienAttachement extends Lien {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienAttachement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LiensPackage.Literals.LIEN_ATTACHEMENT;
	}

	public abstract Interface getFrom();
} // LienAttachement
