/**
 */
package scenario;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Possibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenario.Possibility#getDescription <em>Description</em>}</li>
 *   <li>{@link scenario.Possibility#getPossibilityEventActionConnection <em>Possibility Event Action Connection</em>}</li>
 * </ul>
 *
 * @see scenario.ScenarioPackage#getPossibility()
 * @model
 * @generated
 */
public interface Possibility extends EObject {
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
	 * @see scenario.ScenarioPackage#getPossibility_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link scenario.Possibility#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Possibility Event Action Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possibility Event Action Connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possibility Event Action Connection</em>' reference.
	 * @see #setPossibilityEventActionConnection(EventAction)
	 * @see scenario.ScenarioPackage#getPossibility_PossibilityEventActionConnection()
	 * @model required="true"
	 * @generated
	 */
	EventAction getPossibilityEventActionConnection();

	/**
	 * Sets the value of the '{@link scenario.Possibility#getPossibilityEventActionConnection <em>Possibility Event Action Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Possibility Event Action Connection</em>' reference.
	 * @see #getPossibilityEventActionConnection()
	 * @generated
	 */
	void setPossibilityEventActionConnection(EventAction value);

} // Possibility
