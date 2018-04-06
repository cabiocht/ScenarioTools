package scenario.graph;

import java.util.ArrayList;

import scenario.Choice;
import scenario.Effect;
import scenario.EventAction;
import scenario.Outcome;
import scenario.Possibility;
import scenario.Precondition;
import scenario.Scenario;
import scenario.State;
import scenario.AtomType;

/**
 * <b>GameState est la classe représentant l'état actuel de la branche courante
 * du déroulement d'un scénario</b>
 * <p>
 * Un GameState est caractérisé par les informations suivantes :
 * </p>
 * <ul>
 * <li>Un scénario, étant une référence vers le scénario dont il fait
 * partie.</li>
 * <li>Une liste d'Atom, contenant les différents Atom présents dans l'état
 * courant.</li>
 * <li>Une liste d'EventAction, contenant les différents EventAction disponibles
 * dans l'état courant.</li>
 * </ul>
 * 
 * @see Atom
 * 
 * @author Thomas Cabioch
 * @version 1.0
 */
public class GameState {
	/**
	 * Le scénario dont fait partie ce GameState
	 * 
	 * @see GameState#setScenario(Scenario)
	 * @see GameState#getScenario()
	 */
	private Scenario scenario;

	/**
	 * La liste d'Atom présents dans l'état courant
	 * 
	 * @see GameState#setAtoms(ArrayList)
	 * @see GameState#getAtoms()
	 * @see GameState#addAtom(Atom)
	 * @see GameState#getAtom(State)
	 */
	private ArrayList<Atom> atoms;

	/**
	 * La liste d'EventAction présents dans l'état courant
	 * 
	 * @see GameState#setEvents(ArrayList)
	 * @see GameState#getEvents()
	 * @see GameState#getPossibleEventActions()
	 */
	private ArrayList<EventAction> events;

	/**
	 * Constructeur GameState.
	 * <p>
	 * A la construction d'un GameState, on associe le scénario dont fait partie ce
	 * GameState.
	 * </p>
	 * 
	 * @param scenario
	 *            Le scénario dont fait partie le GameState courant.
	 */
	public GameState(Scenario scenario) {
		this.scenario = scenario;
		atoms = new ArrayList<Atom>();
		events = new ArrayList<EventAction>();
	}

	/**
	 * Constructeur GameState enfant.
	 * <p>
	 * A la construction d'un GameState enfant, on associe le scénario dont fait
	 * partie ce GameState ainsi que le GameState qui permet d'arriver à ce
	 * GameState en lancant une action.
	 * </p>
	 * 
	 * @param parentGameState
	 *            Le GameState parent permettant d'arriver à ce GameState en lancant
	 *            une action.
	 * @param scenario
	 *            Le scénario dont fait partie le GameState courant.
	 */
	public GameState(GameState parentGameState, Scenario scenario) {
		this(scenario);
		for (Atom a : parentGameState.getAtoms()) {
			this.addAtom(new Atom(a));
		}
		for (EventAction ea : parentGameState.getEvents()) {
			this.addEvent(ea);
		}
	}

	/**
	 * Vérifie si un état (State) existe dans le GameState courant.
	 * 
	 * @param state
	 *            Le State dont on vérifie l'existence dans le GameState courant.
	 * 
	 * @return Un booléen indiquant si l'état est associé à un des Atom du GameState
	 *         courant.
	 */
	public boolean stateExists(State state) {
		for (Atom a : atoms) {
			if (a.getState().equals(state)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Renvoie la liste des états associés aux Atom du GameState courant.
	 * 
	 * @return La liste des états présents.
	 */
	public ArrayList<State> getAvailableStates() {
		ArrayList<State> availableStates = new ArrayList<State>();
		for (Atom a : this.getAtoms()) {
			availableStates.add(a.getState());
		}
		return availableStates;
	}

	/**
	 * Renvoie la liste des événements franchissables depuis le GameState courant.
	 * 
	 * @return La liste des événements franchissables.
	 */
	public ArrayList<EventAction> getPossibleEventActions() {

		ArrayList<EventAction> possibleEventActions = new ArrayList<EventAction>();

		boolean isPossibleEventAction;

		// On parcourt chaque eventAction
		for (EventAction currentEventAction : getEvents()) {
			isPossibleEventAction = true;
			// On parcourt chaque états des préconditions de l'eventAction

			for (Precondition p : currentEventAction.getGameStatesPreconditions()) {
				// On compare avec les états courants
				if (p.isExists() && !this.stateExists(p.getPreconditionStateConnection())
						|| !p.isExists() && this.stateExists(p.getPreconditionStateConnection())) {
					isPossibleEventAction = false;
					break;
				}
			}

			// Si l'action est possible on l'ajoute à la liste que l'on va renvoyer
			if (isPossibleEventAction)
				possibleEventActions.add(currentEventAction);

		}
		return possibleEventActions;
	}

	/**
	 * Lance un EventAction dans le GameState courant.
	 * 
	 * @param eventAction
	 *            L'EventAction à lancer.
	 * 
	 */
	public void fireEvent(EventAction eventAction) {

		Atom currentAtom;
		State currentState;

		for (Precondition p : eventAction.getGameStatesPreconditions()) {
			State s = p.getPreconditionStateConnection();

			if (p.isConsumed()) {
				currentAtom = this.getAtom(s);
				if (!currentAtom.getAtomType().equals(AtomType.INFINITE)) {
					this.atoms.remove(currentAtom);
				}
			}
		}

		for (Effect e : eventAction.getEventActionEffect()) {

			currentState = e.getEffectStateConnection();

			if (this.getAtom(currentState) == null) {
				int maxTime = 0;
				int minTime = 0;
				maxTime = this.getMaxTime();
				minTime = this.getMinTime();

				Atom a = new Atom(currentState, e.getType(), minTime + eventAction.getMinTimeBeforeReached(),
						maxTime + eventAction.getMaxTimeBeforeReached());
				System.out.println(minTime + "  " + maxTime);
				this.addAtom(a);
			}
		}

		Choice c = scenario.getChoice(eventAction);
		if (c != null) {
			for (Possibility p : c.getChoicePossibility()) {
				this.events.remove(p.getPossibilityEventActionConnection());
			}
		} else {
			this.events.remove(eventAction);
		}
	}

	/**
	 * Lance un EventAction dans le GameState courant.
	 * 
	 * @param state
	 *            L'état dont on veut récupérer l'Atom le contenant.
	 * @return Renvoie l'Atom contenant le State voulu, renvoie null si il n'y en à
	 *         pas.
	 */
	public Atom getAtom(State state) {
		for (Atom atom : this.getAtoms()) {
			if (atom.getState().equals(state)) {
				return atom;
			}
		}
		return null;
	}

	/**
	 * Renvoie l'Outcome correspondant à cet état final si il en existe un.
	 * 
	 * @return Renvoie un Outcome dont les conditions sont respectés dans l'état
	 *         final actuel.
	 */
	public Outcome getOutcome() {
		ArrayList<State> verifiedStates = new ArrayList<State>();
		Outcome outcome = null;
		for (Outcome o : scenario.getOutcomes()) {
			for (State s : o.getOutcomeStateConnection()) {
				if (!this.stateExists(s)) {
					return null;
				}
				verifiedStates.add(s);
			}
			outcome = o;
		}
		return outcome;
	}

	/**
	 * Vérifie si le GameState final actuel respecte le temps visé
	 * 
	 * @return Renvoie un booléen indiquant si le GameState final actuel respecte le
	 *         temps visé.
	 */
	public boolean respectAimedTime() {
		return (this.scenario.getAimedDuration() >= this.getMinTime()
				&& this.scenario.getAimedDuration() <= this.getMaxTime());
	}

	/**
	 * Vérifie si le GameState final actuel est un succès ou non.
	 * 
	 * @return Renvoie un booléen indiquant si le GameState final actuel rempli les
	 *         conditions pour être un succès.
	 */
	public boolean isSuccess() {
		System.out.println(this.scenario.getAimedDuration() >= this.getMinTime()
				&& this.scenario.getAimedDuration() <= this.getMaxTime());
		return getOutcome() != null && respectAimedTime();
	}

	/**
	 * Renvoie le temps maximum auquel ce GameState à été créé.
	 * 
	 * @return Le temps maximum de création de ce GameState.
	 */
	public int getMaxTime() {
		Atom maxTimeAtom = null;

		if (this.getAtoms().size() > 0) {
			maxTimeAtom = this.getAtoms().get(0);

			for (Atom a : this.getAtoms()) {
				if (maxTimeAtom.getMaxCreationTime() < a.getMaxCreationTime()) {
					maxTimeAtom = a;
				}
			}
		} else {
			return 0;
		}

		return maxTimeAtom.getMaxCreationTime();
	}

	/**
	 * Renvoie le temps minimum auquel ce GameState à été créé.
	 * 
	 * @return Le temps minimum de création de ce GameState.
	 */
	public int getMinTime() {
		Atom minTimeAtom = null;
		if (this.getAtoms().size() > 0) {
			for (Atom a : this.getAtoms()) {
				minTimeAtom = this.getAtoms().get(0);
				if (minTimeAtom.getMinCreationTime() < a.getMinCreationTime()) {
					minTimeAtom = a;
				}
			}
		} else {
			return 0;
		}

		return minTimeAtom.getMinCreationTime();
	}

	public void addAtom(Atom atom) {
		this.atoms.add(atom);
	}

	public void addEvent(EventAction ea) {
		this.events.add(ea);
	}

	/* GETTERS & SETTERS */

	public ArrayList<Atom> getAtoms() {
		return atoms;
	}

	public void setAtoms(ArrayList<Atom> atoms) {
		this.atoms = atoms;
	}

	public ArrayList<EventAction> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<EventAction> events) {
		this.events = events;
	}

	public Scenario getScenario() {
		return scenario;
	}

	public void setScenario(Scenario s) {
		this.scenario = s;
	}

	@Override
	public boolean equals(Object other) {
		if (other == null)
			return false;
		if (other == this)
			return true;
		if (!(other instanceof GameState))
			return false;
		GameState otherGameState = (GameState) other;

		if (this.getAtoms().size() != otherGameState.getAtoms().size())
			return false;

		if (!this.getAtoms().containsAll(otherGameState.getAtoms()))
			return false;

		if (this.getEvents().size() != otherGameState.getEvents().size())
			return false;

		if (!this.getEvents().containsAll(otherGameState.getEvents()))
			return false;

		if (this.getMaxTime() != otherGameState.getMaxTime())
			return false;

		if (this.getMinTime() != otherGameState.getMinTime())
			return false;

		return true;
	}

}
