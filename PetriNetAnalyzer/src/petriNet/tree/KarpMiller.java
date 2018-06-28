package petriNet.tree;

import java.util.ArrayList;

import petriNet.PetriNet;
import petriNet.Place;
import petriNet.Transition;
import petriNet.marking.OmegaMarking;
import petriNet.marking.PetriNetMarking;
import scenario.Choice;
import scenario.EventAction;
import scenario.Possibility;

public class KarpMiller {

	private PetriNet petriNet;

	// X
	private ArrayList<Node> activeNodes;
	private ArrayList<Node> inactiveNodes;

	public KarpMiller(PetriNet petriNet) {
		activeNodes = new ArrayList<Node>();
		inactiveNodes = new ArrayList<Node>();
		this.petriNet = petriNet;
	}

	public PNTree execute() {

		PNTree tree = new PNTree(this);
		ArrayList<NodeTransitionAssociation> wait = new ArrayList<NodeTransitionAssociation>();

		// x0
		Node x0 = new Node(petriNet.getInitialMarking(), null);

		tree.getNodes().add(x0);
		tree.setRoot(x0);
		activeNodes.add(x0);
		for (Transition t : petriNet.getFireableTransitions(x0.getMarking())) {
			NodeTransitionAssociation toVisit = new NodeTransitionAssociation(x0, t);
			wait.add(toVisit);

		}

		while (!wait.isEmpty()) {
			/*
			 * System.out.println(wait.size() + " : "); for (NodeTransitionAssociation nta :
			 * wait) { System.out.println(nta.getTransition().getEventAction().getName() +
			 * "\n"); }
			 */

			System.out.println(wait.size());
			NodeTransitionAssociation toVisit = wait.get(0);

			wait.remove(0);

			// System.out.println(toVisit.getNode().getMarking());
			if (activeNodes.contains(toVisit.getNode())) {
				PetriNetMarking pnm = toVisit.getTransition().fire(toVisit.getNode().getMarking());
				// System.out.println(" \n\n\n" + pnm);
				Node currentNode = toVisit.getNode();

				// Get active ancestors
				ArrayList<PetriNetMarking> activeAncestorsMarkings = new ArrayList<PetriNetMarking>();

				while (currentNode.getParent() != null) {
					currentNode = currentNode.getParent();
					if (activeNodes.contains(currentNode)) {
						activeAncestorsMarkings.add(currentNode.getMarking());
					}
				}

				Node newNode = new Node(Acc(activeAncestorsMarkings, pnm), toVisit.getNode());

				tree.getNodes().add(newNode);
				Relation r = new Relation(toVisit.getNode(), newNode, toVisit.getTransition());
				tree.getRelations().add(r);

				boolean inferiorOrEqual = false;

				for (Node n : activeNodes) {
					if (newNode.getMarking().isInferiorOrEqual(n.getMarking())) {
						inferiorOrEqual = true;
					}
				}

				if (!inferiorOrEqual) {

					ArrayList<Node> nodesToRemove = new ArrayList<Node>();

					for (Node x : activeNodes) {
						for (Node y : x.getAncestors()) {
							if ((y.getMarking().isInferiorOrEqual(newNode.getMarking()))
									&& ((activeNodes.contains(y) || (!newNode.getAncestors().contains(y))))) {
								nodesToRemove.add(x);
							}
						}
					}

					for (Node toRemove : nodesToRemove) {
						inactiveNodes.add(toRemove);
						activeNodes.remove(toRemove);
					}

					activeNodes.add(newNode);
					
					/*
					 * ArrayList<Transition> transitionsPast = new ArrayList<Transition>();
					 * 
					 * for (Node n : newNode.getAncestors()) { for (Relation rel :
					 * tree.getRelations()) { if (n.equals(rel.getSource())) {
					 * transitionsPast.add(rel.getTransition());
					 * System.out.println(rel.getTransition().getEventAction().getName() +
					 * "\n\n\n"); } } }
					 */

					ArrayList<Node> nodesToVisit = new ArrayList<Node>();
					nodesToVisit.addAll(newNode.getAncestors());
					nodesToVisit.add(newNode);
					ArrayList<EventAction> usedActions = new ArrayList<EventAction>();
					Choice c = null;
					for (Node node : nodesToVisit) {
						//System.out.println(PetriNet.getScenario());
						if(node.getParent()!=null)
						{
							usedActions.add(tree.getTransition(node.getParent(), node).getEventAction());
							c = PetriNet.getScenario().getChoice(tree.getTransition(node.getParent(), node).getEventAction());
							if (c != null) {
								for (Possibility p : c.getChoicePossibility()) {
									if (!usedActions.contains(p.getPossibilityEventActionConnection()))
										usedActions.add(p.getPossibilityEventActionConnection());
								}

							}
						}

						System.out.println("\n\n");
					}
					
					for (Transition t : petriNet.getFireableTransitions(newNode.getMarking())) {
						if (t.getEventAction().isInfinite() || !usedActions.contains(t.getEventAction())) {
							NodeTransitionAssociation waits = new NodeTransitionAssociation(newNode, t);
							wait.add(waits);
						}
					}
				}
			}
		}
		return tree;
	}

	public PetriNetMarking Acc(ArrayList<PetriNetMarking> markings, PetriNetMarking pnm) {

		boolean isInferior = true;

		PetriNetMarking newMarking = new PetriNetMarking(pnm);

		// ArrayList<Place> toOmega = new ArrayList<Place>();

		for (PetriNetMarking marking : markings) {
			isInferior = marking.isInferior(pnm);
			if (isInferior) {
				for (Place p : marking.getPNMarking().keySet()) {
					if (marking.getPNMarking().get(p).compareTo(pnm.getPNMarking().get(p)) == -1) {
						OmegaMarking om = new OmegaMarking(pnm.getPNMarking().get(p).getMinTime(),
								pnm.getPNMarking().get(p).getMaxTime());
						newMarking.getPNMarking().replace(p, om);
					}
				}
			}
		}
		/*
		 * if (isInferior) {
		 * 
		 * for (PetriNetMarking marking : markings) { for (Place p :
		 * marking.getPNMarking().keySet()) { if (pnm.getPNMarking().get(p) instanceof
		 * NormalMarking) { OmegaMarking om = new
		 * OmegaMarking(pnm.getPNMarking().get(p).getMinTime(),
		 * pnm.getPNMarking().get(p).getMaxTime()); newMarking.getPNMarking().replace(p,
		 * om); } } } }
		 */
		return newMarking;
	}

	public ArrayList<Node> getActiveNodes() {
		return activeNodes;
	}

	public void setActiveNodes(ArrayList<Node> activeNodes) {
		this.activeNodes = activeNodes;
	}

	public ArrayList<Node> getInactiveNodes() {
		return inactiveNodes;
	}

	public void setInactiveNodes(ArrayList<Node> inactiveNodes) {
		this.inactiveNodes = inactiveNodes;
	}
}
