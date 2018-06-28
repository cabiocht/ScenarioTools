/**
 */
package scenario.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import scenario.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see scenario.ScenarioPackage
 * @generated
 */
public class ScenarioAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScenarioPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ScenarioPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioSwitch<Adapter> modelSwitch =
		new ScenarioSwitch<Adapter>() {
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseOutcome(Outcome object) {
				return createOutcomeAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter casePrecondition(Precondition object) {
				return createPreconditionAdapter();
			}
			@Override
			public Adapter caseEffect(Effect object) {
				return createEffectAdapter();
			}
			@Override
			public Adapter caseEventAction(EventAction object) {
				return createEventActionAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter casePossibility(Possibility object) {
				return createPossibilityAdapter();
			}
			@Override
			public Adapter caseImportantGameState(ImportantGameState object) {
				return createImportantGameStateAdapter();
			}
			@Override
			public Adapter caseGameState(GameState object) {
				return createGameStateAdapter();
			}
			@Override
			public Adapter caseGameInput(GameInput object) {
				return createGameInputAdapter();
			}
			@Override
			public Adapter caseGMInput(GMInput object) {
				return createGMInputAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link scenario.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenario.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenario.Outcome <em>Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenario.Outcome
	 * @generated
	 */
	public Adapter createOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenario.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenario.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenario.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenario.Precondition
	 * @generated
	 */
	public Adapter createPreconditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenario.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenario.Effect
	 * @generated
	 */
	public Adapter createEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenario.EventAction <em>Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenario.EventAction
	 * @generated
	 */
	public Adapter createEventActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenario.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenario.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenario.Possibility <em>Possibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenario.Possibility
	 * @generated
	 */
	public Adapter createPossibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenario.ImportantGameState <em>Important Game State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenario.ImportantGameState
	 * @generated
	 */
	public Adapter createImportantGameStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenario.GameState <em>Game State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenario.GameState
	 * @generated
	 */
	public Adapter createGameStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenario.GameInput <em>Game Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenario.GameInput
	 * @generated
	 */
	public Adapter createGameInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenario.GMInput <em>GM Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenario.GMInput
	 * @generated
	 */
	public Adapter createGMInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ScenarioAdapterFactory
