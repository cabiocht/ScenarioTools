package petriNet;

import java.util.ArrayList;

import petriNet.marking.Marking;
import petriNet.marking.PetriNetMarking;
import scenario.Scenario;
import scenario.State;

public class PetriNet {

	private static Scenario scenario;
	
	private ArrayList<Place> places;
	private ArrayList<Transition> transitions;

	private PetriNetMarking initialMarking;

	private static PetriNet pn;

	public PetriNet(Scenario s) {
		this.setScenario(s);

		setPlaces(new ArrayList<Place>());
		setTransitions(new ArrayList<Transition>());

		initialMarking = new PetriNetMarking();
		
		if(pn == null)
		{
			pn = this;
		}
	}

	public PetriNet getInstance()
	{
		return pn;
	}
	public ArrayList<Place> getPlaces() {
		return places;
	}

	public void setPlaces(ArrayList<Place> places) {
		this.places = places;
	}

	public void addPlace(Place place) {
		this.places.add(place);
	}

	public ArrayList<Transition> getTransitions() {
		return transitions;
	}

	public void setTransitions(ArrayList<Transition> transitions) {
		this.transitions = transitions;
	}

	public Place getPlace(State s) {
		for (Place p : places) {
			if (p.getState() == s)
				return p;
		}

		return null;
	}

	public PetriNetMarking getInitialMarking() {
		return initialMarking;
	}

	public void setInitialMarking(PetriNetMarking initialMarking) {
		this.initialMarking = initialMarking;
	}

	public ArrayList<Transition> getFireableTransitions(PetriNetMarking pnm) {
		ArrayList<Transition> fireableTransitions = new ArrayList<Transition>();
		for (Transition t : getTransitions()) {
			if (t.canBeFired(pnm)) {
				fireableTransitions.add(t);
			}
		}
		return fireableTransitions;
	}

	@Override
	public String toString() {
		String str = "";

		for (Transition t : this.getTransitions()) {
			str += t.toString() + "\n";
		}

		for (Marking m : initialMarking.getPNMarking().values()) {
			str += m.toString();
		}

		return str;

	}

	public static Scenario getScenario() {
		return scenario;
	}

	public static void setScenario(Scenario s) {
		PetriNet.scenario = s;
	}
}
