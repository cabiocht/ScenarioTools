/**
 */
package scenario.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import scenario.Outcome;
import scenario.ScenarioFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Outcome</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutcomeTest extends TestCase {

	/**
	 * The fixture for this Outcome test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Outcome fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OutcomeTest.class);
	}

	/**
	 * Constructs a new Outcome test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutcomeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Outcome test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Outcome fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Outcome test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Outcome getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScenarioFactory.eINSTANCE.createOutcome());
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

} //OutcomeTest
