/**
 */
package scenario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenario.Choice#getDescription <em>Description</em>}</li>
 *   <li>{@link scenario.Choice#getChoicePossibility <em>Choice Possibility</em>}</li>
 * </ul>
 *
 * @see scenario.ScenarioPackage#getChoice()
 * @model
 * @generated
 */
public interface Choice extends EObject {
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
	 * @see scenario.ScenarioPackage#getChoice_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link scenario.Choice#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Choice Possibility</b></em>' containment reference list.
	 * The list contents are of type {@link scenario.Possibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice Possibility</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice Possibility</em>' containment reference list.
	 * @see scenario.ScenarioPackage#getChoice_ChoicePossibility()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Possibility> getChoicePossibility();

} // Choice
