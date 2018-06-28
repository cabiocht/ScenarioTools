package petriNet.tree;

import petriNet.Transition;

public class NodeTransitionAssociation {

	private Node node;
	private Transition transition;

	public NodeTransitionAssociation(Node node, Transition transition) {
		super();
		this.node = node;
		this.transition = transition;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public Transition getTransition() {
		return transition;
	}

	public void setTransition(Transition transition) {
		this.transition = transition;
	}
}
