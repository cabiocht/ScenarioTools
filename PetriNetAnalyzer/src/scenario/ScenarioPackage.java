/**
 */
package scenario;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see scenario.ScenarioFactory
 * @model kind="package"
 * @generated
 */
public interface ScenarioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scenario";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "scenario";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scenario";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScenarioPackage eINSTANCE = scenario.impl.ScenarioPackageImpl.init();

	/**
	 * The meta object id for the '{@link scenario.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenario.impl.ScenarioImpl
	 * @see scenario.impl.ScenarioPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Outcomes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__OUTCOMES = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__STATES = 1;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CHOICES = 2;

	/**
	 * The feature id for the '<em><b>Events Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__EVENTS_ACTIONS = 3;

	/**
	 * The feature id for the '<em><b>Important Game States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__IMPORTANT_GAME_STATES = 4;

	/**
	 * The feature id for the '<em><b>Aimed Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__AIMED_DURATION = 5;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenario.impl.OutcomeImpl <em>Outcome</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenario.impl.OutcomeImpl
	 * @see scenario.impl.ScenarioPackageImpl#getOutcome()
	 * @generated
	 */
	int OUTCOME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Outcome State Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__OUTCOME_STATE_CONNECTION = 2;

	/**
	 * The number of structural features of the '<em>Outcome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Outcome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenario.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenario.impl.StateImpl
	 * @see scenario.impl.ScenarioPackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenario.impl.PreconditionImpl <em>Precondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenario.impl.PreconditionImpl
	 * @see scenario.impl.ScenarioPackageImpl#getPrecondition()
	 * @generated
	 */
	int PRECONDITION = 3;

	/**
	 * The feature id for the '<em><b>Precondition State Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__PRECONDITION_STATE_CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Exists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__EXISTS = 1;

	/**
	 * The feature id for the '<em><b>Consumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__CONSUMED = 2;

	/**
	 * The number of structural features of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenario.impl.EffectImpl <em>Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenario.impl.EffectImpl
	 * @see scenario.impl.ScenarioPackageImpl#getEffect()
	 * @generated
	 */
	int EFFECT = 4;

	/**
	 * The feature id for the '<em><b>Effect State Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__EFFECT_STATE_CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenario.impl.EventActionImpl <em>Event Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenario.impl.EventActionImpl
	 * @see scenario.impl.ScenarioPackageImpl#getEventAction()
	 * @generated
	 */
	int EVENT_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Event Action Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__EVENT_ACTION_PRECONDITION = 2;

	/**
	 * The feature id for the '<em><b>Event Action Effect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__EVENT_ACTION_EFFECT = 3;

	/**
	 * The feature id for the '<em><b>Min Time Before Reached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__MIN_TIME_BEFORE_REACHED = 4;

	/**
	 * The feature id for the '<em><b>Max Time Before Reached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__MAX_TIME_BEFORE_REACHED = 5;

	/**
	 * The feature id for the '<em><b>Infinite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__INFINITE = 6;

	/**
	 * The number of structural features of the '<em>Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenario.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenario.impl.ChoiceImpl
	 * @see scenario.impl.ScenarioPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Choice Possibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CHOICE_POSSIBILITY = 1;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenario.impl.PossibilityImpl <em>Possibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenario.impl.PossibilityImpl
	 * @see scenario.impl.ScenarioPackageImpl#getPossibility()
	 * @generated
	 */
	int POSSIBILITY = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBILITY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Possibility Event Action Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBILITY__POSSIBILITY_EVENT_ACTION_CONNECTION = 1;

	/**
	 * The number of structural features of the '<em>Possibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBILITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Possibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenario.impl.ImportantGameStateImpl <em>Important Game State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenario.impl.ImportantGameStateImpl
	 * @see scenario.impl.ScenarioPackageImpl#getImportantGameState()
	 * @generated
	 */
	int IMPORTANT_GAME_STATE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANT_GAME_STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANT_GAME_STATE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Important Game State Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANT_GAME_STATE__IMPORTANT_GAME_STATE_CONNECTION = 2;

	/**
	 * The number of structural features of the '<em>Important Game State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANT_GAME_STATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Important Game State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANT_GAME_STATE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link scenario.impl.GameStateImpl <em>Game State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenario.impl.GameStateImpl
	 * @see scenario.impl.ScenarioPackageImpl#getGameState()
	 * @generated
	 */
	int GAME_STATE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATE__DESCRIPTION = STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Initial Available State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATE__IS_INITIAL_AVAILABLE_STATE = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Game State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Game State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenario.impl.GameInputImpl <em>Game Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenario.impl.GameInputImpl
	 * @see scenario.impl.ScenarioPackageImpl#getGameInput()
	 * @generated
	 */
	int GAME_INPUT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_INPUT__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_INPUT__DESCRIPTION = STATE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Game Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_INPUT_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Game Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_INPUT_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenario.impl.GMInputImpl <em>GM Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenario.impl.GMInputImpl
	 * @see scenario.impl.ScenarioPackageImpl#getGMInput()
	 * @generated
	 */
	int GM_INPUT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_INPUT__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_INPUT__DESCRIPTION = STATE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>GM Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_INPUT_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GM Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_INPUT_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenario.AtomType <em>Atom Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenario.AtomType
	 * @see scenario.impl.ScenarioPackageImpl#getAtomType()
	 * @generated
	 */
	int ATOM_TYPE = 12;

	/**
	 * Returns the meta object for class '{@link scenario.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see scenario.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link scenario.Scenario#getOutcomes <em>Outcomes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outcomes</em>'.
	 * @see scenario.Scenario#getOutcomes()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Outcomes();

	/**
	 * Returns the meta object for the containment reference list '{@link scenario.Scenario#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see scenario.Scenario#getStates()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_States();

	/**
	 * Returns the meta object for the containment reference list '{@link scenario.Scenario#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choices</em>'.
	 * @see scenario.Scenario#getChoices()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Choices();

	/**
	 * Returns the meta object for the containment reference list '{@link scenario.Scenario#getEventsActions <em>Events Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events Actions</em>'.
	 * @see scenario.Scenario#getEventsActions()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_EventsActions();

	/**
	 * Returns the meta object for the containment reference list '{@link scenario.Scenario#getImportantGameStates <em>Important Game States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Important Game States</em>'.
	 * @see scenario.Scenario#getImportantGameStates()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ImportantGameStates();

	/**
	 * Returns the meta object for the attribute '{@link scenario.Scenario#getAimedDuration <em>Aimed Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aimed Duration</em>'.
	 * @see scenario.Scenario#getAimedDuration()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_AimedDuration();

	/**
	 * Returns the meta object for class '{@link scenario.Outcome <em>Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outcome</em>'.
	 * @see scenario.Outcome
	 * @generated
	 */
	EClass getOutcome();

	/**
	 * Returns the meta object for the attribute '{@link scenario.Outcome#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see scenario.Outcome#getName()
	 * @see #getOutcome()
	 * @generated
	 */
	EAttribute getOutcome_Name();

	/**
	 * Returns the meta object for the attribute '{@link scenario.Outcome#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see scenario.Outcome#getDescription()
	 * @see #getOutcome()
	 * @generated
	 */
	EAttribute getOutcome_Description();

	/**
	 * Returns the meta object for the reference list '{@link scenario.Outcome#getOutcomeStateConnection <em>Outcome State Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outcome State Connection</em>'.
	 * @see scenario.Outcome#getOutcomeStateConnection()
	 * @see #getOutcome()
	 * @generated
	 */
	EReference getOutcome_OutcomeStateConnection();

	/**
	 * Returns the meta object for class '{@link scenario.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see scenario.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link scenario.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see scenario.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the attribute '{@link scenario.State#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see scenario.State#getDescription()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Description();

	/**
	 * Returns the meta object for class '{@link scenario.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precondition</em>'.
	 * @see scenario.Precondition
	 * @generated
	 */
	EClass getPrecondition();

	/**
	 * Returns the meta object for the reference '{@link scenario.Precondition#getPreconditionStateConnection <em>Precondition State Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precondition State Connection</em>'.
	 * @see scenario.Precondition#getPreconditionStateConnection()
	 * @see #getPrecondition()
	 * @generated
	 */
	EReference getPrecondition_PreconditionStateConnection();

	/**
	 * Returns the meta object for the attribute '{@link scenario.Precondition#isExists <em>Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exists</em>'.
	 * @see scenario.Precondition#isExists()
	 * @see #getPrecondition()
	 * @generated
	 */
	EAttribute getPrecondition_Exists();

	/**
	 * Returns the meta object for the attribute '{@link scenario.Precondition#isConsumed <em>Consumed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumed</em>'.
	 * @see scenario.Precondition#isConsumed()
	 * @see #getPrecondition()
	 * @generated
	 */
	EAttribute getPrecondition_Consumed();

	/**
	 * Returns the meta object for class '{@link scenario.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect</em>'.
	 * @see scenario.Effect
	 * @generated
	 */
	EClass getEffect();

	/**
	 * Returns the meta object for the reference '{@link scenario.Effect#getEffectStateConnection <em>Effect State Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effect State Connection</em>'.
	 * @see scenario.Effect#getEffectStateConnection()
	 * @see #getEffect()
	 * @generated
	 */
	EReference getEffect_EffectStateConnection();

	/**
	 * Returns the meta object for the attribute '{@link scenario.Effect#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see scenario.Effect#getType()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Type();

	/**
	 * Returns the meta object for class '{@link scenario.EventAction <em>Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Action</em>'.
	 * @see scenario.EventAction
	 * @generated
	 */
	EClass getEventAction();

	/**
	 * Returns the meta object for the attribute '{@link scenario.EventAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see scenario.EventAction#getName()
	 * @see #getEventAction()
	 * @generated
	 */
	EAttribute getEventAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link scenario.EventAction#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see scenario.EventAction#getDescription()
	 * @see #getEventAction()
	 * @generated
	 */
	EAttribute getEventAction_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link scenario.EventAction#getEventActionPrecondition <em>Event Action Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Action Precondition</em>'.
	 * @see scenario.EventAction#getEventActionPrecondition()
	 * @see #getEventAction()
	 * @generated
	 */
	EReference getEventAction_EventActionPrecondition();

	/**
	 * Returns the meta object for the containment reference list '{@link scenario.EventAction#getEventActionEffect <em>Event Action Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Action Effect</em>'.
	 * @see scenario.EventAction#getEventActionEffect()
	 * @see #getEventAction()
	 * @generated
	 */
	EReference getEventAction_EventActionEffect();

	/**
	 * Returns the meta object for the attribute '{@link scenario.EventAction#getMinTimeBeforeReached <em>Min Time Before Reached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Time Before Reached</em>'.
	 * @see scenario.EventAction#getMinTimeBeforeReached()
	 * @see #getEventAction()
	 * @generated
	 */
	EAttribute getEventAction_MinTimeBeforeReached();

	/**
	 * Returns the meta object for the attribute '{@link scenario.EventAction#getMaxTimeBeforeReached <em>Max Time Before Reached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time Before Reached</em>'.
	 * @see scenario.EventAction#getMaxTimeBeforeReached()
	 * @see #getEventAction()
	 * @generated
	 */
	EAttribute getEventAction_MaxTimeBeforeReached();

	/**
	 * Returns the meta object for the attribute '{@link scenario.EventAction#isInfinite <em>Infinite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infinite</em>'.
	 * @see scenario.EventAction#isInfinite()
	 * @see #getEventAction()
	 * @generated
	 */
	EAttribute getEventAction_Infinite();

	/**
	 * Returns the meta object for class '{@link scenario.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see scenario.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute '{@link scenario.Choice#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see scenario.Choice#getDescription()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link scenario.Choice#getChoicePossibility <em>Choice Possibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choice Possibility</em>'.
	 * @see scenario.Choice#getChoicePossibility()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_ChoicePossibility();

	/**
	 * Returns the meta object for class '{@link scenario.Possibility <em>Possibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possibility</em>'.
	 * @see scenario.Possibility
	 * @generated
	 */
	EClass getPossibility();

	/**
	 * Returns the meta object for the attribute '{@link scenario.Possibility#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see scenario.Possibility#getDescription()
	 * @see #getPossibility()
	 * @generated
	 */
	EAttribute getPossibility_Description();

	/**
	 * Returns the meta object for the reference '{@link scenario.Possibility#getPossibilityEventActionConnection <em>Possibility Event Action Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Possibility Event Action Connection</em>'.
	 * @see scenario.Possibility#getPossibilityEventActionConnection()
	 * @see #getPossibility()
	 * @generated
	 */
	EReference getPossibility_PossibilityEventActionConnection();

	/**
	 * Returns the meta object for class '{@link scenario.ImportantGameState <em>Important Game State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Important Game State</em>'.
	 * @see scenario.ImportantGameState
	 * @generated
	 */
	EClass getImportantGameState();

	/**
	 * Returns the meta object for the attribute '{@link scenario.ImportantGameState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see scenario.ImportantGameState#getName()
	 * @see #getImportantGameState()
	 * @generated
	 */
	EAttribute getImportantGameState_Name();

	/**
	 * Returns the meta object for the attribute '{@link scenario.ImportantGameState#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see scenario.ImportantGameState#getDescription()
	 * @see #getImportantGameState()
	 * @generated
	 */
	EAttribute getImportantGameState_Description();

	/**
	 * Returns the meta object for the reference list '{@link scenario.ImportantGameState#getImportantGameStateConnection <em>Important Game State Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Important Game State Connection</em>'.
	 * @see scenario.ImportantGameState#getImportantGameStateConnection()
	 * @see #getImportantGameState()
	 * @generated
	 */
	EReference getImportantGameState_ImportantGameStateConnection();

	/**
	 * Returns the meta object for class '{@link scenario.GameState <em>Game State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game State</em>'.
	 * @see scenario.GameState
	 * @generated
	 */
	EClass getGameState();

	/**
	 * Returns the meta object for the attribute '{@link scenario.GameState#isIsInitialAvailableState <em>Is Initial Available State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial Available State</em>'.
	 * @see scenario.GameState#isIsInitialAvailableState()
	 * @see #getGameState()
	 * @generated
	 */
	EAttribute getGameState_IsInitialAvailableState();

	/**
	 * Returns the meta object for class '{@link scenario.GameInput <em>Game Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Input</em>'.
	 * @see scenario.GameInput
	 * @generated
	 */
	EClass getGameInput();

	/**
	 * Returns the meta object for class '{@link scenario.GMInput <em>GM Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GM Input</em>'.
	 * @see scenario.GMInput
	 * @generated
	 */
	EClass getGMInput();

	/**
	 * Returns the meta object for enum '{@link scenario.AtomType <em>Atom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Atom Type</em>'.
	 * @see scenario.AtomType
	 * @generated
	 */
	EEnum getAtomType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScenarioFactory getScenarioFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link scenario.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenario.impl.ScenarioImpl
		 * @see scenario.impl.ScenarioPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Outcomes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__OUTCOMES = eINSTANCE.getScenario_Outcomes();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__STATES = eINSTANCE.getScenario_States();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__CHOICES = eINSTANCE.getScenario_Choices();

		/**
		 * The meta object literal for the '<em><b>Events Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__EVENTS_ACTIONS = eINSTANCE.getScenario_EventsActions();

		/**
		 * The meta object literal for the '<em><b>Important Game States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__IMPORTANT_GAME_STATES = eINSTANCE.getScenario_ImportantGameStates();

		/**
		 * The meta object literal for the '<em><b>Aimed Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__AIMED_DURATION = eINSTANCE.getScenario_AimedDuration();

		/**
		 * The meta object literal for the '{@link scenario.impl.OutcomeImpl <em>Outcome</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenario.impl.OutcomeImpl
		 * @see scenario.impl.ScenarioPackageImpl#getOutcome()
		 * @generated
		 */
		EClass OUTCOME = eINSTANCE.getOutcome();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTCOME__NAME = eINSTANCE.getOutcome_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTCOME__DESCRIPTION = eINSTANCE.getOutcome_Description();

		/**
		 * The meta object literal for the '<em><b>Outcome State Connection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTCOME__OUTCOME_STATE_CONNECTION = eINSTANCE.getOutcome_OutcomeStateConnection();

		/**
		 * The meta object literal for the '{@link scenario.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenario.impl.StateImpl
		 * @see scenario.impl.ScenarioPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__DESCRIPTION = eINSTANCE.getState_Description();

		/**
		 * The meta object literal for the '{@link scenario.impl.PreconditionImpl <em>Precondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenario.impl.PreconditionImpl
		 * @see scenario.impl.ScenarioPackageImpl#getPrecondition()
		 * @generated
		 */
		EClass PRECONDITION = eINSTANCE.getPrecondition();

		/**
		 * The meta object literal for the '<em><b>Precondition State Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECONDITION__PRECONDITION_STATE_CONNECTION = eINSTANCE.getPrecondition_PreconditionStateConnection();

		/**
		 * The meta object literal for the '<em><b>Exists</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECONDITION__EXISTS = eINSTANCE.getPrecondition_Exists();

		/**
		 * The meta object literal for the '<em><b>Consumed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECONDITION__CONSUMED = eINSTANCE.getPrecondition_Consumed();

		/**
		 * The meta object literal for the '{@link scenario.impl.EffectImpl <em>Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenario.impl.EffectImpl
		 * @see scenario.impl.ScenarioPackageImpl#getEffect()
		 * @generated
		 */
		EClass EFFECT = eINSTANCE.getEffect();

		/**
		 * The meta object literal for the '<em><b>Effect State Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT__EFFECT_STATE_CONNECTION = eINSTANCE.getEffect_EffectStateConnection();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__TYPE = eINSTANCE.getEffect_Type();

		/**
		 * The meta object literal for the '{@link scenario.impl.EventActionImpl <em>Event Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenario.impl.EventActionImpl
		 * @see scenario.impl.ScenarioPackageImpl#getEventAction()
		 * @generated
		 */
		EClass EVENT_ACTION = eINSTANCE.getEventAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_ACTION__NAME = eINSTANCE.getEventAction_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_ACTION__DESCRIPTION = eINSTANCE.getEventAction_Description();

		/**
		 * The meta object literal for the '<em><b>Event Action Precondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_ACTION__EVENT_ACTION_PRECONDITION = eINSTANCE.getEventAction_EventActionPrecondition();

		/**
		 * The meta object literal for the '<em><b>Event Action Effect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_ACTION__EVENT_ACTION_EFFECT = eINSTANCE.getEventAction_EventActionEffect();

		/**
		 * The meta object literal for the '<em><b>Min Time Before Reached</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_ACTION__MIN_TIME_BEFORE_REACHED = eINSTANCE.getEventAction_MinTimeBeforeReached();

		/**
		 * The meta object literal for the '<em><b>Max Time Before Reached</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_ACTION__MAX_TIME_BEFORE_REACHED = eINSTANCE.getEventAction_MaxTimeBeforeReached();

		/**
		 * The meta object literal for the '<em><b>Infinite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_ACTION__INFINITE = eINSTANCE.getEventAction_Infinite();

		/**
		 * The meta object literal for the '{@link scenario.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenario.impl.ChoiceImpl
		 * @see scenario.impl.ScenarioPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__DESCRIPTION = eINSTANCE.getChoice_Description();

		/**
		 * The meta object literal for the '<em><b>Choice Possibility</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__CHOICE_POSSIBILITY = eINSTANCE.getChoice_ChoicePossibility();

		/**
		 * The meta object literal for the '{@link scenario.impl.PossibilityImpl <em>Possibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenario.impl.PossibilityImpl
		 * @see scenario.impl.ScenarioPackageImpl#getPossibility()
		 * @generated
		 */
		EClass POSSIBILITY = eINSTANCE.getPossibility();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSIBILITY__DESCRIPTION = eINSTANCE.getPossibility_Description();

		/**
		 * The meta object literal for the '<em><b>Possibility Event Action Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBILITY__POSSIBILITY_EVENT_ACTION_CONNECTION = eINSTANCE.getPossibility_PossibilityEventActionConnection();

		/**
		 * The meta object literal for the '{@link scenario.impl.ImportantGameStateImpl <em>Important Game State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenario.impl.ImportantGameStateImpl
		 * @see scenario.impl.ScenarioPackageImpl#getImportantGameState()
		 * @generated
		 */
		EClass IMPORTANT_GAME_STATE = eINSTANCE.getImportantGameState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTANT_GAME_STATE__NAME = eINSTANCE.getImportantGameState_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTANT_GAME_STATE__DESCRIPTION = eINSTANCE.getImportantGameState_Description();

		/**
		 * The meta object literal for the '<em><b>Important Game State Connection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTANT_GAME_STATE__IMPORTANT_GAME_STATE_CONNECTION = eINSTANCE.getImportantGameState_ImportantGameStateConnection();

		/**
		 * The meta object literal for the '{@link scenario.impl.GameStateImpl <em>Game State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenario.impl.GameStateImpl
		 * @see scenario.impl.ScenarioPackageImpl#getGameState()
		 * @generated
		 */
		EClass GAME_STATE = eINSTANCE.getGameState();

		/**
		 * The meta object literal for the '<em><b>Is Initial Available State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_STATE__IS_INITIAL_AVAILABLE_STATE = eINSTANCE.getGameState_IsInitialAvailableState();

		/**
		 * The meta object literal for the '{@link scenario.impl.GameInputImpl <em>Game Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenario.impl.GameInputImpl
		 * @see scenario.impl.ScenarioPackageImpl#getGameInput()
		 * @generated
		 */
		EClass GAME_INPUT = eINSTANCE.getGameInput();

		/**
		 * The meta object literal for the '{@link scenario.impl.GMInputImpl <em>GM Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenario.impl.GMInputImpl
		 * @see scenario.impl.ScenarioPackageImpl#getGMInput()
		 * @generated
		 */
		EClass GM_INPUT = eINSTANCE.getGMInput();

		/**
		 * The meta object literal for the '{@link scenario.AtomType <em>Atom Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenario.AtomType
		 * @see scenario.impl.ScenarioPackageImpl#getAtomType()
		 * @generated
		 */
		EEnum ATOM_TYPE = eINSTANCE.getAtomType();

	}

} //ScenarioPackage
