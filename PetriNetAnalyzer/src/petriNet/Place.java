package petriNet;

import java.util.ArrayList;

import scenario.GameState;
import scenario.State;

public class Place {

	private State state;

	private boolean isOmega;
	private ArrayList<Transition> transitionsAval;

	public Place() {
		setTransitionsAval(new ArrayList<Transition>());
		isOmega = false;
	}

	public Place(State s) {
		
		
		this();
		setState(s);
	}

	public Place(GameState s) {
		this((State) s);
		/*
		 * if (s.isIsInitialAvailableState()) { Token t = new Token(0, 0);
		 * this.addToken(t); }
		 */
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public boolean isOmega() {
		return isOmega;
	}

	public void setOmega(boolean isOmega) {
		this.isOmega = isOmega;
	}

	public ArrayList<Transition> getTransitionsAval() {
		return transitionsAval;
	}

	public void setTransitionsAval(ArrayList<Transition> transitionsAval) {
		this.transitionsAval = transitionsAval;
	}

	public void addTransitionAval(Transition t) {
		this.transitionsAval.add(t);
	}

	@Override
	public String toString() {
		String str = "Place : " + this.getState().getName() + "\n";

		return str;
	}
}
