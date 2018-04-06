/**
 */
package scenario.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import scenario.Possibility;
import scenario.ScenarioFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Possibility</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PossibilityTest extends TestCase {

	/**
	 * The fixture for this Possibility test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Possibility fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PossibilityTest.class);
	}

	/**
	 * Constructs a new Possibility test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibilityTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Possibility test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Possibility fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Possibility test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Possibility getFixture() {
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
		setFixture(ScenarioFactory.eINSTANCE.createPossibility());
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

} //PossibilityTest
