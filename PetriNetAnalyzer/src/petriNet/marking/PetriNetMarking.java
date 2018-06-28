package petriNet.marking;

import java.util.HashMap;

import petriNet.Place;

public class PetriNetMarking {

	private HashMap<Place, Marking> PNMarking;

	public PetriNetMarking() {
		this.PNMarking = new HashMap<Place, Marking>();
	}

	public PetriNetMarking(PetriNetMarking toClone) {
		this();

		for (Place p : toClone.getPNMarking().keySet()) {
			Marking m = toClone.getPNMarking().get(p);
			if (m instanceof NormalMarking) {
				this.PNMarking.put(p, new NormalMarking((NormalMarking) m));
			} else {
				this.PNMarking.put(p, new OmegaMarking((OmegaMarking) m));
			}

		}
	}

	public HashMap<Place, Marking> getPNMarking() {
		return PNMarking;
	}

	public void setPNMarking(HashMap<Place, Marking> pNMarking) {
		PNMarking = pNMarking;
	}

	public String toString() {
		String str = "";
		for (Place p : PNMarking.keySet()) {
			str += p.getState().getName() + " : \n";
			str += PNMarking.get(p).toString() + "\n";
		}
		return str;
	}

	public boolean isInferior(PetriNetMarking pnm) {

		boolean hasInferior = false;
		
		for (Place p : pnm.getPNMarking().keySet()) {

			if(this.getPNMarking().get(p).compareTo(pnm.getPNMarking().get(p)) == -1)
			{
				hasInferior = true;
			}
			if (this.getPNMarking().get(p).compareTo(pnm.getPNMarking().get(p)) > 0) {
				return false;
			}
		}
		return hasInferior;
	}

	public boolean isInferiorOrEqual(PetriNetMarking pnm) {

		for (Place p : pnm.getPNMarking().keySet()) {

			if (this.getPNMarking().get(p).compareTo(pnm.getPNMarking().get(p)) > 0) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public boolean equals(Object pnm) {

		PetriNetMarking marking = (PetriNetMarking) pnm;
		for (Place p : marking.getPNMarking().keySet()) {

			if (this.getPNMarking().get(p).compareTo(marking.getPNMarking().get(p)) != 0) {
				return false;
			}
		}
		return true;
	}
}
