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
 * <b>GameState est la classe repr�sentant l'�tat actuel de la branche courante
 * du d�roulement d'un sc�nario</b>
 * <p>
 * Un GameState est caract�ris� par les informations suivantes :
 * </p>
 * <ul>
 * <li>Un sc�nario, �tant une r�f�rence vers le sc�nario dont il fait
 * partie.</li>
 * <li>Une liste d'Atom, contenant les diff�rents Atom pr�sents dans l'�tat
 * courant.</li>
 * <li>Une liste d'EventAction, contenant les diff�rents EventAction disponibles
 * dans l'�tat courant.</li>
 * </ul>
 * 
 * @see Atom
 * 
 * @author Thomas Cabioch
 * @version 1.0
 */
public class GameState {
	/**
	 * Le sc�nario dont fait partie ce GameState
	 * 
	 * @see GameState#setScenario(Scenario)
	 * @see GameState#getScenario()
	 */
	private Scenario scenario;

	/**
	 * La liste d'Atom pr�sents dans l'�tat courant
	 * 
	 * @see GameState#setAtoms(ArrayList)
	 * @see GameState#getAtoms()
	 * @see GameState#addAtom(Atom)
	 * @see GameState#getAtom(State)
	 */
	private ArrayList<Atom> atoms;

	/**
	 * La liste d'EventAction pr�sents dans l'�tat courant
	 * 
	 * @see GameState#setEvents(ArrayList)
	 * @see GameState#getEvents()
	 * @see GameState#getPossibleEventActions()
	 */
	private ArrayList<EventAction> events;

	/**
	 * Constructeur GameState.
	 * <p>
	 * A la construction d'un GameState, on associe le sc�nario dont fait partie ce
	 * GameState.
	 * </p>
	 * 
	 * @param scenario
	 *            Le sc�nario dont fait partie le GameState courant.
	 */
	public GameState(Scenario scenario) {
		this.scenario = scenario;
		atoms = new ArrayList<Atom>();
		events = new ArrayList<EventAction>();
	}

	/**
	 * Constructeur GameState enfant.
	 * <p>
	 * A la construction d'un GameState enfant, on associe le sc�nario dont fait
	 * partie ce GameState ainsi que le GameState qui permet d'arriver � ce
	 * GameState en lancant une action.
	 * </p>
	 * 
	 * @param parentGameState
	 *            Le GameState parent permettant d'arriver � ce GameState en lancant
	 *            une action.
	 * @param scenario
	 *            Le sc�nario dont fait partie le GameState courant.
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
	 * V�rifie si un �tat (State) existe dans le GameState courant.
	 * 
	 * @param state
	 *            Le State dont on v�rifie l'existence dans le GameState courant.
	 * 
	 * @return Un bool�en indiquant si l'�tat est associ� � un des Atom du GameState
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
	 * Renvoie la liste des �tats associ�s aux Atom du GameState courant.
	 * 
	 * @return La liste des �tats pr�sents.
	 */
	public ArrayList<State> getAvailableStates() {
		ArrayList<State> availableStates = new ArrayList<State>();
		for (Atom a : this.getAtoms()) {
			availableStates.add(a.getState());
		}
		return availableStates;
	}

	/**
	 * Renvoie la liste des �v�nements franchissables depuis le GameState courant.
	 * 
	 * @return La liste des �v�nements franchissables.
	 */
	public ArrayList<EventAction> getPossibleEventActions() {

		ArrayList<EventAction> possibleEventActions = new ArrayList<EventAction>();

		boolean isPossibleEventAction;

		// On parcourt chaque eventAction
		for (EventAction currentEventAction : getEvents()) {
			isPossibleEventAction = true;
			// On parcourt chaque �tats des pr�conditions de l'eventAction

			for (Precondition p : currentEventAction.getGameStatesPreconditions()) {
				// On compare avec les �tats courants
				if (p.isExists() && !this.stateExists(p.getPreconditionStateConnection())
						|| !p.isExists() && this.stateExists(p.getPreconditionStateConnection())) {
					isPossibleEventAction = false;
					break;
				}
			}

			// Si l'action est possible on l'ajoute � la liste que l'on va renvoyer
			if (isPossibleEventAction)
				possibleEventActions.add(currentEventAction);

		}
		return possibleEventActions;
	}

	/**
	 * Lance un EventAction dans le GameState courant.
	 * 
	 * @param eventAction
	 *            L'EventAction � lancer.
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
	 *            L'�tat dont on veut r�cup�rer l'Atom le contenant.
	 * @return Renvoie l'Atom contenant le State voulu, renvoie null si il n'y en �
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
	 * Renvoie l'Outcome correspondant � cet �tat final si il en existe un.
	 * 
	 * @return Renvoie un Outcome dont les conditions sont respect�s dans l'�tat
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
	 * V�rifie si le GameState final actuel respecte le temps vis�
	 * 
	 * @return Renvoie un bool�en indiquant si le GameState final actuel respecte le
	 *         temps vis�.
	 */
	public boolean respectAimedTime() {
		return (this.scenario.getAimedDuration() >= this.getMinTime()
				&& this.scenario.getAimedDuration() <= this.getMaxTime());
	}

	/**
	 * V�rifie si le GameState final actuel est un succ�s ou non.
	 * 
	 * @return Renvoie un bool�en indiquant si le GameState final actuel rempli les
	 *         conditions pour �tre un succ�s.
	 */
	public boolean isSuccess() {
		System.out.println(this.scenario.getAimedDuration() >= this.getMinTime()
				&& this.scenario.getAimedDuration() <= this.getMaxTime());
		return getOutcome() != null && respectAimedTime();
	}

	/**
	 * Renvoie le temps maximum auquel ce GameState � �t� cr��.
	 * 
	 * @return Le temps maximum de cr�ation de ce GameState.
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
	 * Renvoie le temps minimum auquel ce GameState � �t� cr��.
	 * 
	 * @return Le temps minimum de cr�ation de ce GameState.
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
