/**
 */
package scenario;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenario.GameState#isIsInitialAvailableState <em>Is Initial Available State</em>}</li>
 * </ul>
 *
 * @see scenario.ScenarioPackage#getGameState()
 * @model
 * @generated
 */
public interface GameState extends State {
	/**
	 * Returns the value of the '<em><b>Is Initial Available State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Initial Available State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial Available State</em>' attribute.
	 * @see #setIsInitialAvailableState(boolean)
	 * @see scenario.ScenarioPackage#getGameState_IsInitialAvailableState()
	 * @model
	 * @generated
	 */
	boolean isIsInitialAvailableState();

	/**
	 * Sets the value of the '{@link scenario.GameState#isIsInitialAvailableState <em>Is Initial Available State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial Available State</em>' attribute.
	 * @see #isIsInitialAvailableState()
	 * @generated
	 */
	void setIsInitialAvailableState(boolean value);

} // GameState
