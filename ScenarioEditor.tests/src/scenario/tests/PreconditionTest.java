/**
 */
package scenario.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import scenario.Precondition;
import scenario.ScenarioFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Precondition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PreconditionTest extends TestCase {

	/**
	 * The fixture for this Precondition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Precondition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PreconditionTest.class);
	}

	/**
	 * Constructs a new Precondition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreconditionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Precondition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Precondition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Precondition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Precondition getFixture() {
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
		setFixture(ScenarioFactory.eINSTANCE.createPrecondition());
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

} //PreconditionTest
