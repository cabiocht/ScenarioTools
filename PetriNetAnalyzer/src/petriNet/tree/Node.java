package petriNet.tree;

import java.util.ArrayList;

import petriNet.marking.PetriNetMarking;
import visitor.PNVisitor;

public class Node {
	private PetriNetMarking pn;
	private static PNTree tree;
	private Node parent;

	public Node(PetriNetMarking pn, Node parent) {
		if (tree == null)
			tree = new PNTree(null).getInstance();

		this.setMarking(pn);
		this.parent = parent;
	}

	public PetriNetMarking getMarking() {
		return pn;
	}

	public void setMarking(PetriNetMarking pn) {
		this.pn = pn;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public ArrayList<Node> getAncestors() {
		ArrayList<Node> ancestors = new ArrayList<Node>();
		Node currentNode = this;

		while (currentNode.getParent() != null) {
			currentNode = currentNode.getParent();
			ancestors.add(currentNode);
		}

		return ancestors;
	}

	public ArrayList<Node> getChildren() {
		ArrayList<Node> children = new ArrayList<Node>();

		for (Relation r : tree.getRelations()) {
			if (r.getSource() == this) {
				children.add(r.getTo());
			}
		}

		return children;

	}

	public String getPath() {
			if (this.getParent() != null) {
				return this.getParent().getPath() + "->" + tree.getTransition(this.getParent(), this).getEventAction().getName();
			}
		return "init";
	}

	public void accept(PNVisitor visitor) {
		visitor.visit(this);
		
	}
}
