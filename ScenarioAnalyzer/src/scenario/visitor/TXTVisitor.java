package scenario.visitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import scenario.Effect;
import scenario.EventAction;
import scenario.Outcome;
import scenario.Precondition;
import scenario.Scenario;
import scenario.State;
import scenario.graph.Node;

public class TXTVisitor implements Visitor {

	FileWriter fw;
	Scenario s;

	public TXTVisitor(Scenario scenario) {
		s = scenario;
		try {
			new File("out/").mkdirs();
			fw = new FileWriter(System.getProperty("user.dir") + "\\"  + "\\out\\out.txt");
			System.out.println(System.getProperty("user.dir") + "\\"  + "\\out\\out.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void visit(Node node) {
		ArrayList<Node> leafs = node.getLeafs();
		ArrayList<State> unusedStates = new ArrayList<State>();

		for (State state : s.getStates()) {
			boolean found = false;
			for (EventAction ea : s.getEventsActions()) {
				for (Precondition p : ea.getEventActionPrecondition()) {
					if (p.getPreconditionStateConnection() == state) {
						found = true;
						break;
					}
				}

				if (found)
					break;

				for (Effect e : ea.getEventActionEffect()) {
					if (e.getEffectStateConnection() == state) {
						found = true;
						break;
					}
				}

				if (found)
					break;
			}

			if (!found)
				unusedStates.add(state);

			found = false;
		}

		int discoursReussis = 0;
		ArrayList<Node> successLeaf = new ArrayList<Node>();
		ArrayList<Node> failLeaf = new ArrayList<Node>();
		for (Node n : leafs) {
			if (n.getGameState().isSuccess()) {
				successLeaf.add(n);
				discoursReussis++;
			} else {
				failLeaf.add(n);
			}
		}

		try {
			fw.write("Il y a " + unusedStates.size() + " état(s) n'aparaissant dans aucun EventAction :\n");
			for (State s : unusedStates) {
				try {
					fw.write("\t- " + s.getName() + "\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			fw.write("\nIl y a " + discoursReussis + " discours réussis, " + (leafs.size() - discoursReussis)
					+ " discours ratés pour un total de " + leafs.size() + " discours, soit "
					+ 100 * discoursReussis / leafs.size() + "% de réussite\n\n");

			int branche = 1;
			fw.write("Liste des discours réussis : \n\n");
			for (Node leaf : successLeaf) {
				Outcome o = leaf.getGameState().getOutcome();
				fw.write("\tBranche " + branche + " : \n\n");
				fw.write("\t\tFin obtenue : \n\t\t\t" + o.getName() + " : " + o.getDescription() + "\n\n");
				fw.write("\t\t" + leaf.getPath() + "\n\n");
				fw.write("\t\tEtats finaux disponibles : \n\t\t\t");
				for (State a : leaf.getCurrentStates()) {
					fw.write(a.getName() + " ");
				}
				fw.write("\n\n");
				fw.write("\t\tDurée estimée de la branche : \n");
				fw.write("\t\t\tMin : " + leaf.getGameState().getMinTime() + "\n");
				fw.write("\t\t\tMax : " + leaf.getGameState().getMaxTime() + "\n");
				fw.write("\n");
				branche++;
			}
			fw.write("Liste des discours ratés : \n\n");
			for (Node leaf : failLeaf) {
				Outcome o = leaf.getGameState().getOutcome();
				fw.write("\tBranche " + branche + " : \n\n");
				if (o != null)
					fw.write("\t\tFin obtenue : \n\t\t\t" + o.getName() + " : " + o.getDescription() + "\n\n");
				fw.write("\t\tRaison(s) de l'échec :\n");
				if (o == null)
					fw.write("\t\t\tCe discours n'abouti à aucune fin\n");
				if (!leaf.getGameState().respectAimedTime())
					fw.write("\t\t\tCe discours ne respecte pas la contrainte de temps\n");
				fw.write("\n");
				fw.write("\t\t" + leaf.getPath() + "\n\n");
				fw.write("\t\tEtats finaux disponibles : \n\t\t\t");
				for (State a : leaf.getCurrentStates()) {
					fw.write(a.getName() + " ");
				}
				fw.write("\n\n");
				fw.write("\t\tDurée estimée de la branche : \n");
				fw.write("\t\t\tMin : " + leaf.getGameState().getMinTime() + "\n");
				fw.write("\t\t\tMax : " + leaf.getGameState().getMaxTime() + "\n");
				fw.write("\n");
				branche++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void close(Node n) {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
