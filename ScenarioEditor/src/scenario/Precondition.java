/**
 */
package scenario;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenario.Precondition#getPreconditionStateConnection <em>Precondition State Connection</em>}</li>
 *   <li>{@link scenario.Precondition#isExists <em>Exists</em>}</li>
 *   <li>{@link scenario.Precondition#isConsumed <em>Consumed</em>}</li>
 * </ul>
 *
 * @see scenario.ScenarioPackage#getPrecondition()
 * @model
 * @generated
 */
public interface Precondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Precondition State Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition State Connection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition State Connection</em>' reference.
	 * @see #setPreconditionStateConnection(State)
	 * @see scenario.ScenarioPackage#getPrecondition_PreconditionStateConnection()
	 * @model required="true"
	 * @generated
	 */
	State getPreconditionStateConnection();

	/**
	 * Sets the value of the '{@link scenario.Precondition#getPreconditionStateConnection <em>Precondition State Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition State Connection</em>' reference.
	 * @see #getPreconditionStateConnection()
	 * @generated
	 */
	void setPreconditionStateConnection(State value);

	/**
	 * Returns the value of the '<em><b>Exists</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exists</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exists</em>' attribute.
	 * @see #setExists(boolean)
	 * @see scenario.ScenarioPackage#getPrecondition_Exists()
	 * @model default="true"
	 * @generated
	 */
	boolean isExists();

	/**
	 * Sets the value of the '{@link scenario.Precondition#isExists <em>Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exists</em>' attribute.
	 * @see #isExists()
	 * @generated
	 */
	void setExists(boolean value);

	/**
	 * Returns the value of the '<em><b>Consumed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumed</em>' attribute.
	 * @see #setConsumed(boolean)
	 * @see scenario.ScenarioPackage#getPrecondition_Consumed()
	 * @model default="true"
	 * @generated
	 */
	boolean isConsumed();

	/**
	 * Sets the value of the '{@link scenario.Precondition#isConsumed <em>Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumed</em>' attribute.
	 * @see #isConsumed()
	 * @generated
	 */
	void setConsumed(boolean value);

} // Precondition
