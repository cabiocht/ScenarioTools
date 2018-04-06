package scenario.graph;

import java.util.ArrayList;

import java.util.HashMap;

import scenario.EventAction;
import scenario.State;
import scenario.visitor.Visitable;
import scenario.visitor.Visitor;

/**
 * <b>Node est la classe représentant un noeud dans le graphe des preuves</b>
 * <p>
 * Un Node est caractérisé par les informations suivantes :
 * </p>
 * <ul>
 * <li>Un noeud (Node) parent dont il est l'enfant.</li>
 * <li>Une HashMap liant les noeuds enfants à l'EventAction qui à permis de les
 * générer</li>
 * <li>Un GameState contenant toutes les informations sur le noeud courant.</li>
 * </ul>
 * 
 * @see GameState
 * 
 * @author Thomas Cabioch
 * @version 1.0
 */
public class Node implements Visitable {

	/**
	 * Le noeud parent.
	 */
	private Node parent;

	/**
	 * L'ensemble des noeuds enfants associés aux EventAction permettant de les
	 * atteindre.
	 */
	private HashMap<Node, EventAction> children;

	/**
	 * Le GameState que représente ce Node.
	 */
	private GameState gameState;

	/**
	 * Constructeur Node.
	 * <p>
	 * A la construction d'un Node, on lui donne une référence vers son noeud
	 * parent, et on lui attribue un GameState.
	 * </p>
	 * 
	 * @param parent
	 *            Le noeud parent
	 * @param gameState
	 *            Le GameState à associer à ce Node
	 */
	public Node(Node parent, GameState gameState) {
		this.children = new HashMap<Node, EventAction>();

		this.gameState = gameState;

		setParent(parent);
	}

	public String getPath()
	{
		if(this.getParent() != null)
		{
			return this.getParent().getPath() + "->" + this.getParent().getChildren().get(this).getName();
		}
		return "init";
	}
	
	public ArrayList<Node> getLeafs()
	{
		ArrayList<Node> leafs = new ArrayList<Node>();
		for(Node n : this.getChildren().keySet())
		{
			leafs.addAll(n.getLeafs());
		}
		if(this.getChildren().isEmpty())
		{
			leafs.add(this);
		}
		return leafs;

	}
	
	public void addChildren(Node node, EventAction eventAction) {
		if (!children.containsKey(node))
			children.put(node, eventAction);
	}

	public HashMap<Node, EventAction> getChildren() {
		return children;
	}

	public void setChildren(HashMap<Node, EventAction> children) {
		this.children = children;
	}

	public ArrayList<State> getCurrentStates() {
		return this.getGameState().getAvailableStates();
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public GameState getGameState() {
		return gameState;
	}

	public void setGameState(GameState gameState) {
		this.gameState = gameState;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

	@Override
	public boolean equals(Object other) {
		if (other == null)
			return false;
		if (other == this)
			return true;
		if (!(other instanceof Node))
			return false;
		Node otherNode = (Node) other;

		if (!this.getGameState().equals(otherNode.getGameState()))
			return false;

		return true;
	}
}
