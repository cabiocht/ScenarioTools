package petriNet.tree;

import java.util.ArrayList;

import petriNet.Transition;
import visitor.Visitable;
import visitor.Visitor;

public class PNTree implements Visitable {

	private KarpMiller km;
	private static PNTree instance;

	// X
	private ArrayList<Node> nodes;

	// B
	private ArrayList<Relation> relations;

	// x0
	private Node root;
/*
	public PNTree(KarpMiller karpMiller) {
		this.setKm(karpMiller);
		
		if (instance == null) {
			instance = this;
		}

		this.nodes = new ArrayList<Node>();
		this.relations = new ArrayList<Relation>();
	}*/

	public PNTree(KarpMiller karpMiller) {
		this.km = karpMiller;
		
		if (instance == null) {
			instance = this;
		}

		this.nodes = new ArrayList<Node>();
		this.relations = new ArrayList<Relation>();
	}

	public ArrayList<Node> getNodes() {
		return nodes;
	}

	public void setNodes(ArrayList<Node> nodes) {
		this.nodes = nodes;
	}

	public ArrayList<Relation> getRelations() {
		return relations;
	}

	public void setRelations(ArrayList<Relation> relations) {
		this.relations = relations;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public PNTree getInstance() {
		return instance;
	}

	public ArrayList<Node> getLeafs() {
		ArrayList<Node> leafs = new ArrayList<Node>();
		for (Node n : nodes) {
			if (n.getChildren().isEmpty()) {
				leafs.add(n);
			}
		}
		return leafs;
	}

	public Transition getTransition(Node from, Node to) {
		for (Relation r : this.getRelations()) {
			if (r.getSource() == from && r.getTo() == to) {
				return r.getTransition();
			}
		}

		return null;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	public KarpMiller getKm() {
		return km;
	}

	public void setKm(KarpMiller km) {
		this.km = km;
	}
}
