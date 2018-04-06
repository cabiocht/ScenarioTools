/**
 */
package scenario.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import scenario.EventAction;
import scenario.ScenarioFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventActionTest extends TestCase {

	/**
	 * The fixture for this Event Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventAction fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EventActionTest.class);
	}

	/**
	 * Constructs a new Event Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventActionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Event Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EventAction fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Event Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventAction getFixture() {
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
		setFixture(ScenarioFactory.eINSTANCE.createEventAction());
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

} //EventActionTest
