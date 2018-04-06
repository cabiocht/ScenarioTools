/**
 */
package scenario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Important Game State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenario.ImportantGameState#getName <em>Name</em>}</li>
 *   <li>{@link scenario.ImportantGameState#getDescription <em>Description</em>}</li>
 *   <li>{@link scenario.ImportantGameState#getImportantGameStateConnection <em>Important Game State Connection</em>}</li>
 * </ul>
 *
 * @see scenario.ScenarioPackage#getImportantGameState()
 * @model
 * @generated
 */
public interface ImportantGameState extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see scenario.ScenarioPackage#getImportantGameState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link scenario.ImportantGameState#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see scenario.ScenarioPackage#getImportantGameState_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link scenario.ImportantGameState#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Important Game State Connection</b></em>' reference list.
	 * The list contents are of type {@link scenario.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Important Game State Connection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Important Game State Connection</em>' reference list.
	 * @see scenario.ScenarioPackage#getImportantGameState_ImportantGameStateConnection()
	 * @model required="true"
	 * @generated
	 */
	EList<State> getImportantGameStateConnection();

} // ImportantGameState
