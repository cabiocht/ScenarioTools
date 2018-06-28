package scenarioToPetriNet;

import petriNet.PetriNet;
import petriNet.Place;
import petriNet.Transition;
import scenario.Effect;
import scenario.EventAction;
import scenario.Precondition;
import scenario.Scenario;
import scenario.State;
import visitor.PNVisitor;

public class PetriNetBuilder {

	private Scenario scenario;
	
	public PetriNetBuilder(Scenario s)
	{
		setScenario(s);
	}

	public Scenario getScenario() {
		return scenario;
	}

	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}
	
	public PetriNet buildPetriNet()
	{
		PetriNet pn = new PetriNet(scenario);
		PNVisitor visitor = new PNVisitor(pn, null);
		
		for(State s : scenario.getStates())
		{
			s.accept(visitor);
		}
		
		for(EventAction ea : scenario.getEventsActions())
		{
			Transition t = new Transition(ea);
			for(Precondition p : ea.getEventActionPrecondition())
			{
				Place place = pn.getPlace(p.getPreconditionStateConnection());
				
				t.getInputs().put(place, t.getInputs().getOrDefault(place, 0) + 1);
				
				
				if(!p.isConsumed())
				{
					t.getOutputs().put(place, t.getOutputs().getOrDefault(place, 0) + 1);
				}
			}
			
			for(Effect e : ea.getEventActionEffect())
			{
				Place place = pn.getPlace(e.getEffectStateConnection());
				t.getOutputs().put(place, t.getOutputs().getOrDefault(place, 0) + 1);
			}
			pn.getTransitions().add(t);
		}
		
		
		
		return pn;
	}
}
