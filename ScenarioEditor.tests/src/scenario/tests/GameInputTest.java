/**
 */
package scenario.tests;

import junit.textui.TestRunner;

import scenario.GameInput;
import scenario.ScenarioFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Game Input</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameInputTest extends StateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GameInputTest.class);
	}

	/**
	 * Constructs a new Game Input test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameInputTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Game Input test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GameInput getFixture() {
		return (GameInput)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScenarioFactory.eINSTANCE.createGameInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //GameInputTest
