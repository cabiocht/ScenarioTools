package scenario.graph;

import java.util.ArrayList;

import scenario.EventAction;
import scenario.Scenario;
import scenario.AtomType;

/**
 * <b>GraphGenerator est la classe permettant de g�n�rer le graphe des preuves
 * du sc�nario. </b>
 * <p>
 * Le GraphGenerator est compos� des informations suivantes :
 * </p>
 * <ul>
 * <li>Un sc�nario, �tant une r�f�rence vers le sc�nario dont il doit g�n�rer le
 * graphe des preuves.</li>
 * <li>Une liste de Node, contenant les diff�rents Node g�n�r� jusqu'a
 * pr�sent.</li>
 * </ul>
 * 
 * @see Node
 * 
 * @author Thomas Cabioch
 * @version 1.0
 */
public class GraphGenerator {
	/**
	 * Le sc�nario dont le graphe des preuves doit �tre g�n�r�
	 */
	private Scenario s;

	/**
	 * La liste des n�uds g�n�r�s pendant la preuve.
	 */
	private ArrayList<Node> nodes;

	/**
	 * Constructeur GraphGenerator.
	 * <p>
	 * A la construction du GraphGenerator on lui donne une r�f�rence vers le
	 * sc�nario � prouver.
	 * </p>
	 * 
	 * @param scenario
	 *            Le sc�nario � prouver.
	 */
	public GraphGenerator(Scenario scenario) {
		nodes = new ArrayList<Node>();
		this.s = scenario;
	}

	/**
	 * G�n�re la preuve du sc�nario sous forme de graphe. �
	 * 
	 * @return Renvoie le noeud (Node) initial du graphe.
	 */
	public Node generateGraph() {
		// On cr�� le noeud initial contenant les �tats disponibles de base
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
	 * G�n�re les noeuds depuis le noeud parent.
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