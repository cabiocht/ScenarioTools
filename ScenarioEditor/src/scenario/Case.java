/**
 */
package scenario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenario.Case#getDescription <em>Description</em>}</li>
 *   <li>{@link scenario.Case#getCaseStateConnection <em>Case State Connection</em>}</li>
 * </ul>
 *
 * @see scenario.ScenarioPackage#getCase()
 * @model
 * @generated
 */
public interface Case extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see scenario.ScenarioPackage#getCase_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link scenario.Case#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Case State Connection</b></em>' reference list.
	 * The list contents are of type {@link scenario.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case State Connection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case State Connection</em>' reference list.
	 * @see scenario.ScenarioPackage#getCase_CaseStateConnection()
	 * @model required="true"
	 * @generated
	 */
	EList<State> getCaseStateConnection();

} // Case
