/**
 */
package hADL.Liens.util;

import hADL.Liens.*;

import hADL.Objet;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hADL.Liens.LiensPackage
 * @generated
 */
public class LiensAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LiensPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiensAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LiensPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiensSwitch<Adapter> modelSwitch =
		new LiensSwitch<Adapter>() {
			@Override
			public Adapter caseLienBindingFourni(LienBindingFourni object) {
				return createLienBindingFourniAdapter();
			}
			@Override
			public Adapter caseLienBindingRequis(LienBindingRequis object) {
				return createLienBindingRequisAdapter();
			}
			@Override
			public Adapter caseLienAttachement(LienAttachement object) {
				return createLienAttachementAdapter();
			}
			@Override
			public Adapter caseLienAttachementPFRF(LienAttachementPFRF object) {
				return createLienAttachementPFRFAdapter();
			}
			@Override
			public Adapter caseLien(Lien object) {
				return createLienAdapter();
			}
			@Override
			public Adapter caseLienBinding(LienBinding object) {
				return createLienBindingAdapter();
			}
			@Override
			public Adapter caseLienAttachementPRRT(LienAttachementPRRT object) {
				return createLienAttachementPRRTAdapter();
			}
			@Override
			public Adapter caseObjet(Objet object) {
				return createObjetAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hADL.Liens.LienBindingFourni <em>Lien Binding Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Liens.LienBindingFourni
	 * @generated
	 */
	public Adapter createLienBindingFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Liens.LienBindingRequis <em>Lien Binding Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Liens.LienBindingRequis
	 * @generated
	 */
	public Adapter createLienBindingRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Liens.LienAttachement <em>Lien Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Liens.LienAttachement
	 * @generated
	 */
	public Adapter createLienAttachementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Liens.LienAttachementPFRF <em>Lien Attachement PFRF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Liens.LienAttachementPFRF
	 * @generated
	 */
	public Adapter createLienAttachementPFRFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Liens.Lien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Liens.Lien
	 * @generated
	 */
	public Adapter createLienAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Liens.LienBinding <em>Lien Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Liens.LienBinding
	 * @generated
	 */
	public Adapter createLienBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Liens.LienAttachementPRRT <em>Lien Attachement PRRT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Liens.LienAttachementPRRT
	 * @generated
	 */
	public Adapter createLienAttachementPRRTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hADL.Objet <em>Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hADL.Objet
	 * @generated
	 */
	public Adapter createObjetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LiensAdapterFactory
