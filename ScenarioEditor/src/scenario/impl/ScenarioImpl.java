/**
 */
package scenario.impl;

import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scenario.Choice;
import scenario.EventAction;
import scenario.GameState;
import scenario.ImportantGameState;
import scenario.Outcome;
import scenario.Possibility;
import scenario.Scenario;
import scenario.ScenarioPackage;
import scenario.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scenario.impl.ScenarioImpl#getOutcomes <em>Outcomes</em>}</li>
 *   <li>{@link scenario.impl.ScenarioImpl#getStates <em>States</em>}</li>
 *   <li>{@link scenario.impl.ScenarioImpl#getChoices <em>Choices</em>}</li>
 *   <li>{@link scenario.impl.ScenarioImpl#getEventsActions <em>Events Actions</em>}</li>
 *   <li>{@link scenario.impl.ScenarioImpl#getImportantGameStates <em>Important Game States</em>}</li>
 *   <li>{@link scenario.impl.ScenarioImpl#getAimedDuration <em>Aimed Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The cached value of the '{@link #getOutcomes() <em>Outcomes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomes()
	 * @generated
	 * @ordered
	 */
	protected EList<Outcome> outcomes;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getChoices() <em>Choices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoices()
	 * @generated
	 * @ordered
	 */
	protected EList<Choice> choices;

	/**
	 * The cached value of the '{@link #getEventsActions() <em>Events Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventsActions()
	 * @generated
	 * @ordered
	 */
	protected EList<EventAction> eventsActions;

	/**
	 * The cached value of the '{@link #getImportantGameStates() <em>Important Game States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportantGameStates()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportantGameState> importantGameStates;

	/**
	 * The default value of the '{@link #getAimedDuration() <em>Aimed Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAimedDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int AIMED_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAimedDuration() <em>Aimed Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAimedDuration()
	 * @generated
	 * @ordered
	 */
	protected int aimedDuration = AIMED_DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Outcome> getOutcomes() {
		if (outcomes == null) {
			outcomes = new EObjectContainmentEList<Outcome>(Outcome.class, this, ScenarioPackage.SCENARIO__OUTCOMES);
		}
		return outcomes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, ScenarioPackage.SCENARIO__STATES);
		}
		return states;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Renvoie l'ensemble des états initiaux
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ArrayList<GameState> getInitialAvailableStates() {
		ArrayList<GameState> gameStates = getGameStates();
		ArrayList<GameState> initialAvailableStates = new ArrayList<GameState>();
		
		//On parcourt tous les états
		for(GameState gs : gameStates)
		{	
			if(gs.isIsInitialAvailableState())
			{
				initialAvailableStates.add(gs);
			}
		}
		return initialAvailableStates;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Renvoie l'ensemble des états internes du jeu (GameState)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ArrayList<GameState> getGameStates() {
		ArrayList<GameState> gs = new ArrayList<GameState>();
		for(State s : getStates())
		{
			if(s instanceof GameState)
			{
				gs.add((GameState) s);
			}
		}
		return gs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Renvoie l'ensemble des transitions franchissables à partir des états actuels
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ArrayList<EventAction> getPossibleEventActions(ArrayList<State> currentStates) {
		
		ArrayList<EventAction> possibleEventActions = new ArrayList<EventAction>();
		EventAction currentEventAction;
		
		boolean isPossibleEventAction = true;
		boolean isAvailableState = false;
		//On parcourt chaque eventAction
		for(int i=0; i < this.getEventsActions().size(); i++)
		{
			currentEventAction = getEventsActions().get(i);
			
			//On parcourt chaque états des préconditions de l'eventAction
			
			for(int j=0; j < currentEventAction.getEventActionPrecondition().size(); j++)
			{
				//On compare avec les états courants
				for(int k = 0; k < currentStates.size(); k++)
				{
					if(currentStates.get(k).equals(currentEventAction.getEventActionPrecondition().get(j).getPreconditionStateConnection()))
					{
						isAvailableState = true;
						break;
					}
				}
				
				//Si un des états n'est pas disponible alors l'action n'est pas possible
				if(!isAvailableState)
				{
					isPossibleEventAction = false;
					break;
				}
				
				isAvailableState = false;
			}
			
			//Si l'action est possible on l'ajoute à la liste que l'on va renvoyer
			if(isPossibleEventAction)
				possibleEventActions.add(currentEventAction);
			
			isPossibleEventAction = false;
		}
		return possibleEventActions;
	}
	

	
	/**
	 * <!-- begin-user-doc -->
	 * Renvoie l'action ayant la plus grande priorité d'exécution (celle ayant le plus petit PriorityOrder)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EventAction getHighestPriorityEventAction(ArrayList<EventAction> eventActions) {
		
		EventAction highestPriorityEventAction = eventActions.get(0);
		EventAction currentEventAction;
		
		for(int i=0;i < eventActions.size(); i++)
		{
			currentEventAction = eventActions.get(i);
			
			if(currentEventAction.getEventActionPriorityOrder() < highestPriorityEventAction.getEventActionPriorityOrder())
				highestPriorityEventAction = currentEventAction;
		}
		
		return highestPriorityEventAction;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Renvoie la liste des états disponibles après avoir franchi l'event Action
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ArrayList<State> getStatesAfterTransition(EventAction eventAction, ArrayList<State> states) {
		
		ArrayList<State> statesAfterTransition = new ArrayList<State>();
		
		//On enlève les états des préconditions
		/*
		for(int i =0; i < eventAction.getEventActionPrecondition().getPreconditionStateConnection().size();i++)
		{
			removeState(eventAction.getEventActionPrecondition().getPreconditionStateConnection().get(i), this.getStates());
		}
		
		//On ajoute les états des effets
		for(int j = 0; j < eventAction.getEventActionEffect().getEffectStateConnection().size();j++)
		{
			statesAfterTransition.add(eventAction.getEventActionEffect().getEffectStateConnection().get(j));
		}
		*/
		return statesAfterTransition;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Renvoie le Choice associé à l'eventAction ou null s'il n'y en a pas
	 * <!-- end-user-doc -->
	 * @return 
	 * @generated NOT
	 */
	public Choice getChoice(EventAction eventAction) {
		Choice currentChoice;
		
		Possibility currentPossibility;
		
		for(int i =0; i < this.getChoices().size();i++)
		{
			 currentChoice = choices.get(i);
			 for(int j=0; j <currentChoice.getChoicePossibility().size();j++)
			 {
				 currentPossibility = currentChoice.getChoicePossibility().get(j);
				 if(currentPossibility.getPossibilityEventActionConnection() == eventAction)
				 {
					 return currentChoice;
				 }
			 }
		}
		
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Renvoie la liste des états disponibles après avoir franchi l'event Action
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeState(State state, EList<State> eList) {
		for(int i =0; i < eList.size();i++)
		{
			if(state == eList.get(i))
			{
				eList.remove(i);
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choice> getChoices() {
		if (choices == null) {
			choices = new EObjectContainmentEList<Choice>(Choice.class, this, ScenarioPackage.SCENARIO__CHOICES);
		}
		return choices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventAction> getEventsActions() {
		if (eventsActions == null) {
			eventsActions = new EObjectContainmentEList<EventAction>(EventAction.class, this, ScenarioPackage.SCENARIO__EVENTS_ACTIONS);
		}
		return eventsActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportantGameState> getImportantGameStates() {
		if (importantGameStates == null) {
			importantGameStates = new EObjectContainmentEList<ImportantGameState>(ImportantGameState.class, this, ScenarioPackage.SCENARIO__IMPORTANT_GAME_STATES);
		}
		return importantGameStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAimedDuration() {
		return aimedDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAimedDuration(int newAimedDuration) {
		int oldAimedDuration = aimedDuration;
		aimedDuration = newAimedDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.SCENARIO__AIMED_DURATION, oldAimedDuration, aimedDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioPackage.SCENARIO__OUTCOMES:
				return ((InternalEList<?>)getOutcomes()).basicRemove(otherEnd, msgs);
			case ScenarioPackage.SCENARIO__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case ScenarioPackage.SCENARIO__CHOICES:
				return ((InternalEList<?>)getChoices()).basicRemove(otherEnd, msgs);
			case ScenarioPackage.SCENARIO__EVENTS_ACTIONS:
				return ((InternalEList<?>)getEventsActions()).basicRemove(otherEnd, msgs);
			case ScenarioPackage.SCENARIO__IMPORTANT_GAME_STATES:
				return ((InternalEList<?>)getImportantGameStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenarioPackage.SCENARIO__OUTCOMES:
				return getOutcomes();
			case ScenarioPackage.SCENARIO__STATES:
				return getStates();
			case ScenarioPackage.SCENARIO__CHOICES:
				return getChoices();
			case ScenarioPackage.SCENARIO__EVENTS_ACTIONS:
				return getEventsActions();
			case ScenarioPackage.SCENARIO__IMPORTANT_GAME_STATES:
				return getImportantGameStates();
			case ScenarioPackage.SCENARIO__AIMED_DURATION:
				return getAimedDuration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScenarioPackage.SCENARIO__OUTCOMES:
				getOutcomes().clear();
				getOutcomes().addAll((Collection<? extends Outcome>)newValue);
				return;
			case ScenarioPackage.SCENARIO__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case ScenarioPackage.SCENARIO__CHOICES:
				getChoices().clear();
				getChoices().addAll((Collection<? extends Choice>)newValue);
				return;
			case ScenarioPackage.SCENARIO__EVENTS_ACTIONS:
				getEventsActions().clear();
				getEventsActions().addAll((Collection<? extends EventAction>)newValue);
				return;
			case ScenarioPackage.SCENARIO__IMPORTANT_GAME_STATES:
				getImportantGameStates().clear();
				getImportantGameStates().addAll((Collection<? extends ImportantGameState>)newValue);
				return;
			case ScenarioPackage.SCENARIO__AIMED_DURATION:
				setAimedDuration((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScenarioPackage.SCENARIO__OUTCOMES:
				getOutcomes().clear();
				return;
			case ScenarioPackage.SCENARIO__STATES:
				getStates().clear();
				return;
			case ScenarioPackage.SCENARIO__CHOICES:
				getChoices().clear();
				return;
			case ScenarioPackage.SCENARIO__EVENTS_ACTIONS:
				getEventsActions().clear();
				return;
			case ScenarioPackage.SCENARIO__IMPORTANT_GAME_STATES:
				getImportantGameStates().clear();
				return;
			case ScenarioPackage.SCENARIO__AIMED_DURATION:
				setAimedDuration(AIMED_DURATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScenarioPackage.SCENARIO__OUTCOMES:
				return outcomes != null && !outcomes.isEmpty();
			case ScenarioPackage.SCENARIO__STATES:
				return states != null && !states.isEmpty();
			case ScenarioPackage.SCENARIO__CHOICES:
				return choices != null && !choices.isEmpty();
			case ScenarioPackage.SCENARIO__EVENTS_ACTIONS:
				return eventsActions != null && !eventsActions.isEmpty();
			case ScenarioPackage.SCENARIO__IMPORTANT_GAME_STATES:
				return importantGameStates != null && !importantGameStates.isEmpty();
			case ScenarioPackage.SCENARIO__AIMED_DURATION:
				return aimedDuration != AIMED_DURATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (aimedDuration: ");
		result.append(aimedDuration);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
