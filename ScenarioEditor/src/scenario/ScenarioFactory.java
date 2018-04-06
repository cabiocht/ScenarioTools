/**
 */
package scenario;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see scenario.ScenarioPackage
 * @generated
 */
public interface ScenarioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScenarioFactory eINSTANCE = scenario.impl.ScenarioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outcome</em>'.
	 * @generated
	 */
	Outcome createOutcome();

	/**
	 * Returns a new object of class '<em>Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precondition</em>'.
	 * @generated
	 */
	Precondition createPrecondition();

	/**
	 * Returns a new object of class '<em>Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect</em>'.
	 * @generated
	 */
	Effect createEffect();

	/**
	 * Returns a new object of class '<em>Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Action</em>'.
	 * @generated
	 */
	EventAction createEventAction();

	/**
	 * Returns a new object of class '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice</em>'.
	 * @generated
	 */
	Choice createChoice();

	/**
	 * Returns a new object of class '<em>Possibility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Possibility</em>'.
	 * @generated
	 */
	Possibility createPossibility();

	/**
	 * Returns a new object of class '<em>Important Game State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Important Game State</em>'.
	 * @generated
	 */
	ImportantGameState createImportantGameState();

	/**
	 * Returns a new object of class '<em>Game State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game State</em>'.
	 * @generated
	 */
	GameState createGameState();

	/**
	 * Returns a new object of class '<em>Game Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Input</em>'.
	 * @generated
	 */
	GameInput createGameInput();

	/**
	 * Returns a new object of class '<em>GM Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GM Input</em>'.
	 * @generated
	 */
	GMInput createGMInput();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScenarioPackage getScenarioPackage();

} //ScenarioFactory
