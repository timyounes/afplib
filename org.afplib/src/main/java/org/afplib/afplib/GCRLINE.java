/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GCRLINE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.GCRLINE#getRg <em>Rg</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getGCRLINE()
 * @model
 * @generated
 */
public interface GCRLINE extends Triplet {
	/**
	 * Returns the value of the '<em><b>Rg</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.afplib.GCRLINERG}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rg</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getGCRLINE_Rg()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<GCRLINERG> getRg();

} // GCRLINE
