package petriNet;

import java.util.HashMap;

import petriNet.marking.Marking;
import petriNet.marking.NormalMarking;
import petriNet.marking.OmegaMarking;
import petriNet.marking.PetriNetMarking;
import petriNet.marking.Token;
import scenario.EventAction;

public class Transition {

	private EventAction ea;

	private HashMap<Place, Integer> inputs;
	private HashMap<Place, Integer> outputs;

	public Transition(EventAction ea) {
		setEventAction(ea);

		inputs = new HashMap<Place, Integer>();
		outputs = new HashMap<Place, Integer>();
	}

	public EventAction getEventAction() {
		return ea;
	}

	public void setEventAction(EventAction ea) {
		this.ea = ea;
	}

	public HashMap<Place, Integer> getInputs() {
		return inputs;
	}

	public void setInputs(HashMap<Place, Integer> inputs) {
		this.inputs = inputs;
	}

	public HashMap<Place, Integer> getOutputs() {
		return outputs;
	}

	public void setOutputs(HashMap<Place, Integer> outputs) {
		this.outputs = outputs;
	}

	public void addInput(Place p, Integer poids) {
		inputs.put(p, poids);
	}

	public void addOutput(Place p, Integer poids) {
		outputs.put(p, poids);
	}

	public boolean canBeFired(PetriNetMarking pnm) {
		for (Place p : inputs.keySet()) {
			/*
			 * if(!(pnm.getPNMarking().get(p) instanceof OmegaMarking)) { NormalMarking nm =
			 * (NormalMarking) pnm.getPNMarking().get(p);
			 * 
			 * if(nm.getTokens().size() < inputs.get(p)) { return false; } }
			 *
			 **/
			inputs.get(p);

			if (pnm.getPNMarking().get(p).getTokenAmount() < inputs.get(p)) {
				return false;
			}
		}
		return true;
	}

	public PetriNetMarking fire(PetriNetMarking pnm) {
		PetriNetMarking newPNm = new PetriNetMarking(pnm);
		//System.out.println("Fire " + this.getEventAction().getName());
		int minTime = Integer.MIN_VALUE;
		int maxTime = Integer.MIN_VALUE;

		for (Place p : pnm.getPNMarking().keySet()) {
			Marking m = newPNm.getPNMarking().get(p);
			if (m instanceof NormalMarking) {
				NormalMarking nm = (NormalMarking) m;
				for (Token t : nm.getTokens()) {
					if (t.getMinTime() > minTime)
						minTime = t.getMinTime();
					if (t.getMaxTime() > maxTime)
						maxTime = t.getMaxTime();
				}
			} else {
				OmegaMarking om = (OmegaMarking) m;
				if (om.getMinTime() > minTime)
					minTime = om.getMinTime();
				if (om.getMaxTime() > maxTime)
					maxTime = om.getMaxTime();
			}
		}
		
		for (Place p : inputs.keySet()) {
			Marking m = newPNm.getPNMarking().get(p);
			/*
			 * if (m.getTokenAmount() != Integer.MAX_VALUE)
			 * System.out.println(p.getState().getName() + " : " + m.getTokenAmount()); else
			 * System.out.println(p.getState().getName() + " : OMEGA");
			 */

			if (m instanceof NormalMarking) {
				NormalMarking nm = (NormalMarking) m;
				nm.removeToken(this.getInputs().get(p));
			}
		}

		for (Place p : outputs.keySet()) {
			Marking m = newPNm.getPNMarking().get(p);
			if (m instanceof NormalMarking) {
				NormalMarking nm = (NormalMarking) m;
				for (int i = 0; i < this.getOutputs().get(p); i++) {
					Token t = new Token(minTime + this.getEventAction().getMinTimeBeforeReached(),
							maxTime + this.getEventAction().getMaxTimeBeforeReached());
					nm.addToken(t);
				}
			}
		}

		return newPNm;
	}

	@Override
	public String toString() {
		String str = "Transition : " + this.getEventAction().getName();
		str += "Inputs:\n";
		for (Place p : inputs.keySet()) {
			str += p.toString() + " " + inputs.get(p) + " \n";
		}
		str += "Effects:\n";
		for (Place p : outputs.keySet()) {
			str += p.toString() + " " + outputs.get(p) + " \n";
		}
		return str;
	}
}
