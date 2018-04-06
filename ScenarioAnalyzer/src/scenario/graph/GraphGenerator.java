package scenario.graph;

import java.util.ArrayList;

import scenario.EventAction;
import scenario.Scenario;
import scenario.AtomType;

/**
 * <b>GraphGenerator est la classe permettant de générer le graphe des preuves
 * du scénario. </b>
 * <p>
 * Le GraphGenerator est composé des informations suivantes :
 * </p>
 * <ul>
 * <li>Un scénario, étant une référence vers le scénario dont il doit générer le
 * graphe des preuves.</li>
 * <li>Une liste de Node, contenant les différents Node généré jusqu'a
 * présent.</li>
 * </ul>
 * 
 * @see Node
 * 
 * @author Thomas Cabioch
 * @version 1.0
 */
public class GraphGenerator {
	/**
	 * Le scénario dont le graphe des preuves doit être généré
	 */
	private Scenario s;

	/**
	 * La liste des nœuds générés pendant la preuve.
	 */
	private ArrayList<Node> nodes;

	/**
	 * Constructeur GraphGenerator.
	 * <p>
	 * A la construction du GraphGenerator on lui donne une référence vers le
	 * scénario à prouver.
	 * </p>
	 * 
	 * @param scenario
	 *            Le scénario à prouver.
	 */
	public GraphGenerator(Scenario scenario) {
		nodes = new ArrayList<Node>();
		this.s = scenario;
	}

	/**
	 * Génère la preuve du scénario sous forme de graphe. ²
	 * 
	 * @return Renvoie le noeud (Node) initial du graphe.
	 */
	public Node generateGraph() {
		// On créé le noeud initial contenant les états disponibles de base
		GameState initialGameState = new GameState(s);

		for (scenario.GameState gs : s.getInitialAvailableStates()) {
			Atom a = new Atom(gs, AtomType.CAN_BE_CONSUMED, 0, 0);
			initialGameState.addAtom(a);
		}

		for (EventAction ea : s.getEventsActions()) {
			initialGameState.addEvent(ea);

		}

		Node initialNode = new Node(null, initialGameState);

		generateNode(initialNode);

		return initialNode;
	}

	/**
	 * Génère les noeuds depuis le noeud parent.
	 * 
	 * @param parent
	 *            Le noeud parent.
	 * 
	 */
	public void generateNode(Node parent) {
		GameState parentGameState = parent.getGameState();

		for (EventAction ea : parentGameState.getPossibleEventActions()) {
			GameState newGs = new GameState(parentGameState, s);

			newGs.fireEvent(ea);
			Node node = new Node(parent, newGs);

			parent.addChildren(node, ea);
			nodes.add(node);

			generateNode(node);
		}
	}

}