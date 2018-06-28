package visitor;

import java.io.File;
import java.util.ArrayList;

import petriNet.PetriNet;
import petriNet.Place;
import petriNet.marking.NormalMarking;
import petriNet.marking.PetriNetMarking;
import petriNet.marking.Token;
import petriNet.tree.Node;
import petriNet.tree.PNTree;
import scenario.GameInput;
import scenario.GameState;
import scenario.State;
import scenario.graphviz.GraphViz;

public class PNVisitor implements Visitor {
	private PetriNet pn;
	private GraphViz gv;
	private String exec;
	private PNTree tree;

	private ArrayList<Node> visitedNodes = new ArrayList<Node>();

	public PNVisitor(PetriNet pn, String exec) {
		this.exec = exec;
		this.pn = pn;
	}

	public void visit(GameState gs) {
		Place p = createMarking(gs);
		if (gs.isIsInitialAvailableState()) {
			Token t = new Token(0, 0);
			((NormalMarking) pn.getInitialMarking().getPNMarking().get(p)).addToken(t);
		}
	}

	public void visit(GameInput gi) {
		PetriNetMarking pnm = pn.getInitialMarking();
		Place p = new Place(gi);
		pn.addPlace(p);
		Token t = new Token(0, 0);
		NormalMarking nm = new NormalMarking();
		nm.addToken(t);
		pnm.getPNMarking().put(p, nm);
	}

	public void visit(State s) {
		createMarking(s);
	}

	@Override
	public void visit(Place p) {

	}

	public Place createMarking(State s) {
		PetriNetMarking pnm = pn.getInitialMarking();
		Place p = new Place(s);
		pn.addPlace(p);
		NormalMarking nm = new NormalMarking();
		pnm.getPNMarking().put(p, nm);
		return p;
	}

	@Override
	public void visit(PNTree tree) {
		this.tree = tree;
		File f = new File("tmp/");
		f.mkdirs();

		this.gv = new GraphViz(exec, f.getPath());

		f = new File("out/");
		f.mkdirs();
		gv.addln(gv.start_graph());
		String dest = System.getProperty("user.dir") + "\\out\\";

		for (Node node : tree.getLeafs()) {
			if (tree.getKm().getActiveNodes().contains(node))
				visit(node);
		}

		close(tree, dest);
	}

	@Override
	public void visit(Node node) {
		if (!visitedNodes.contains(node)) {
			String label = "";
			String tooltip = "";
			if (node.getParent() != null)
				label = tree.getTransition(node.getParent(), node).getEventAction().getName();
			else
				label = "init";

			label = this.generateLabel(label);
			if (tree.getKm().getActiveNodes().contains(node)) {
				tooltip = "active";
			} else {
				tooltip = "inactive";
			}
			tooltip = this.generateTooltip(tooltip);
			gv.addln(node.hashCode() + this.generateNodeAttributes(label, tooltip));
			/*
			 * if (node.getChildren().size() == 0 && node.getParent() != null) {
			 * gv.addln(node.hashCode() + " -> " + node.hashCode() +
			 * node.getParent().hashCode() + ";"); } else { for (Node child :
			 * node.getChildren()) { gv.addln(node.hashCode() + " -> " + child.hashCode() +
			 * ";"); visit(child); } }
			 */

			if (node.getParent() != null) {
				gv.addln(node.getParent().hashCode() + " -> " + node.hashCode() + ";");
				visit(node.getParent());
			}

			visitedNodes.add(node);
		}
	}

	public void close(PNTree tree, String dest) {
		System.out.println("Closing file");
		String line;
		line = "{rank = same;";

		String label;
		String xlabel;
		String tooltip;
		String color;
/*
		for (Node leaf : tree.getLeafs()) {
			if(tree.getKm().getActiveNodes().contains(leaf))
			{
			label = "";
			xlabel = "";
			tooltip = "";
			color = "";

			tooltip = leaf.getPath();

			label = this.generateLabel(label); // xlabel = this.generateXlabel(xlabel);
			//color = this.generateColor(color); tooltip =
					tooltip = this.generateTooltip(tooltip);

			line += "" + leaf.hashCode() + ";";
			}
		}*/

		line += "}";

		gv.addln(line);
		String type = "svg";
		String representationType = "dot";
		gv.addln(gv.end_graph());

		gv.decreaseDpi();
		gv.decreaseDpi();
		gv.decreaseDpi();

		File out = new File(dest + "out." + type); // Windows
		// System.out.println(gv.getDotSource());
		System.out.println("Creating SVG");
		gv.writeGraphToFile(gv.getGraph(gv.getDotSource(), type, representationType), out);
	}

	private String generateLabel(String label) {
		return "label=\"" + label + "\"";
	}

	private String generateNodeAttributes(String label, String tooltip) {
		return "[" + label + tooltip + "]";
	}

	private String generateTooltip(String tooltip) {
		return "tooltip=\"" + tooltip + "\"";
	}

}
