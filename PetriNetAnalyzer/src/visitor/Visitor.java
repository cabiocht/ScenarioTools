package visitor;

import petriNet.Place;
import petriNet.tree.Node;
import petriNet.tree.PNTree;
import scenario.GameState;
import scenario.State;

public interface Visitor {
	public void visit(Place p);
	public void visit(State s);
	public void visit(GameState gs);
	public void visit (Node node);
	public void visit(PNTree tree);
}
