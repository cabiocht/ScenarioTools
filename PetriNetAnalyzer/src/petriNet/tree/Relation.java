package petriNet.tree;

import petriNet.Transition;

public class Relation {
	private Node source;
	private Node to;
	private Transition transition;

	public Relation(Node from, Node to, Transition t) {
		this.setSource(from);
		this.setTo(to);
		this.setTransition(t);
	}

	public Node getSource() {
		return source;
	}

	public void setSource(Node source) {
		this.source = source;
	}

	public Node getTo() {
		return to;
	}

	public void setTo(Node to) {
		this.to = to;
	}

	public Transition getTransition() {
		return transition;
	}

	public void setTransition(Transition transition) {
		this.transition = transition;
	}
}
