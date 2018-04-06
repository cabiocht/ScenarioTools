/**
 */
package scenario;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenario.Scenario#getOutcomes <em>Outcomes</em>}</li>
 *   <li>{@link scenario.Scenario#getStates <em>States</em>}</li>
 *   <li>{@link scenario.Scenario#getChoices <em>Choices</em>}</li>
 *   <li>{@link scenario.Scenario#getEventsActions <em>Events Actions</em>}</li>
 *   <li>{@link scenario.Scenario#getImportantGameStates <em>Important Game States</em>}</li>
 *   <li>{@link scenario.Scenario#getAimedDuration <em>Aimed Duration</em>}</li>
 * </ul>
 *
 * @see scenario.ScenarioPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Outcomes</b></em>' containment reference list.
	 * The list contents are of type {@link scenario.Outcome}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcomes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcomes</em>' containment reference list.
	 * @see scenario.ScenarioPackage#getScenario_Outcomes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Outcome> getOutcomes();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link scenario.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see scenario.ScenarioPackage#getScenario_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Choices</b></em>' containment reference list.
	 * The list contents are of type {@link scenario.Choice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choices</em>' containment reference list.
	 * @see scenario.ScenarioPackage#getScenario_Choices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Choice> getChoices();

	/**
	 * Returns the value of the '<em><b>Events Actions</b></em>' containment reference list.
	 * The list contents are of type {@link scenario.EventAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events Actions</em>' containment reference list.
	 * @see scenario.ScenarioPackage#getScenario_EventsActions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EventAction> getEventsActions();

	/**
	 * Returns the value of the '<em><b>Important Game States</b></em>' containment reference list.
	 * The list contents are of type {@link scenario.ImportantGameState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Important Game States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Important Game States</em>' containment reference list.
	 * @see scenario.ScenarioPackage#getScenario_ImportantGameStates()
	 * @model containment="true"
	 * @generated
	 */
	
	EList<ImportantGameState> getImportantGameStates();
	/**
	 * Returns the value of the '<em><b>Aimed Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aimed Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aimed Duration</em>' attribute.
	 * @see #setAimedDuration(int)
	 * @see scenario.ScenarioPackage#getScenario_AimedDuration()
	 * @model
	 * @generated
	 */
	int getAimedDuration();

	/**
	 * Sets the value of the '{@link scenario.Scenario#getAimedDuration <em>Aimed Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aimed Duration</em>' attribute.
	 * @see #getAimedDuration()
	 * @generated
	 */
	void setAimedDuration(int value);

	/**
	 * Returns all the '<em><b>States</b></em>' that have IsAvailableState set to "true".
	 * The list contents are of type {@link scenario.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Available States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Available States</em>' containment reference list.
	 * @see scenario.ScenarioPackage#getScenario_States()
	 * @model containment="true"
	 * @generated NOT
	 */
	ArrayList<GameState> getInitialAvailableStates();
	
	/**
	 * Returns all the '<em><b>EventActions</b></em>' that can be reached from the current states.
	 * The list contents are of type {@link scenario.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PossibleEventActions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PossibleEventActions</em>' containment reference list.
	 * @see scenario.ScenarioPackage#getScenario_EventActions()
	 * @model containment="true"
	 * @generated NOT
	 */
	ArrayList<EventAction> getPossibleEventActions(ArrayList<State> initialAvailableStates);
	
	/**
	 * Returns the '<em><b>EventAction</b></em>' with the highest priority.
	 * The list contents are of type {@link scenario.EventAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HighestPriorityEventAction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HighestPriorityEventAction</em>' containment reference list.
	 * @see scenario.ScenarioPackage#getScenario_EventActions()
	 * @model containment="true"
	 * @generated NOT
	 */
	EventAction getHighestPriorityEventAction(ArrayList<EventAction> possibleEventActions);

	/**
	 * Returns the '<em><b>States</b></em>' after an eventAction has been fired.
	 * The list contents are of type {@link scenario.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>StatesAfterTransition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>StatesAfterTransition</em>' containment reference list.
	 * @see scenario.ScenarioPackage#getScenario_State()
	 * @model containment="true"
	 * @generated NOT
	 */
	ArrayList<State> getStatesAfterTransition(EventAction highestPriorityEventAction, ArrayList<State> initialAvailableStates);

	/**
	 * Returns the '<em><b>Choice</b></em>' containing the current eventAction.
	 * The list contents are of type {@link scenario.Choice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>choice</em>' containment reference list.
	 * @see scenario.ScenarioPackage#getScenario_State()
	 * @model containment="true"
	 * @generated NOT
	 */
	Choice getChoice(EventAction highestPriorityEventAction);

} // Scenario
