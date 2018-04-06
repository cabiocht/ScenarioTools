package scenario.graph;

import scenario.State;
import scenario.AtomType;

/**
 * <b>Atom est la classe repr�sentant une ressource pr�sente dans un
 * GameState</b>
 * <p>
 * Un Atom est caract�ris� par les informations suivantes :
 * </p>
 * <ul>
 * <li>Un �tat, repr�sentant l'�tat qui lui est associ�.</li>
 * <li>Un type d'�tat, permettant de savoir si l'atom doit/peut �tre consomm� ou
 * s'il est infini.</li>
 * <li>Un temps min et max correspondants aux dates minimum et maximum de
 * cr�ation de l'atom.</li>
 * </ul>
 * 
 * @see GameState
 * 
 * @author Thomas Cabioch
 * @version 1.0
 */
public class Atom {
	/**
	 * L'�tat associ� � l'Atom
	 * 
	 * @see Atom#setState(State)
	 * @see Atom#getState()
	 */
	private State state;

	/**
	 * Le type d'atom, permettant de savoir si celui ci doit �tre consomm�, peut
	 * �tre consomm� ou est infini.
	 * 
	 * @see Atom#setAtomType(AtomType)
	 * @see Atom#getAtomType()
	 */
	private AtomType atomType;

	/**
	 * La "date" au plus t�t de cr�ation de l'Atom.
	 * 
	 * @see Atom#setMinCreationTime(int)
	 * @see Atom#getMinCreationTime()
	 */
	private int minCreationTime;

	/**
	 * La "date" au plus tard de cr�ation de l'Atom.
	 * 
	 * @see Atom#setMaxCreationTime(int)
	 * @see Atom#getMaxCreationTime()
	 */
	private int maxCreationTime;

	/**
	 * Constructeur Atom.
	 * <p>
	 * A la construction d'un Atom, on fixe l'�tat qui lui est associ�, le type
	 * d'atom qu'il est ainsi que les dates de cr�ation minimum et maximum de cet
	 * Atom.
	 * </p>
	 * 
	 * @param state
	 *            L''�tat associ� � l'Atom.
	 * @param atomType
	 *            Le type d'Atom.
	 * @param minCreationTime
	 *            La date au plus t�t de la cr�ation de l'atom.
	 * @param maxCreationTime
	 *            La date au plus tard de la cr�ation de l'atom.
	 * @see Atom#state
	 * @see Atom#atomType
	 * @see Atom#minCreationTime
	 * @see Atom#maxCreationTime
	 */
	public Atom(State state, AtomType atomType, int minCreationTime, int maxCreationTime) {
		this.state = state;
		this.atomType = atomType;
		this.minCreationTime = minCreationTime;
		this.maxCreationTime = maxCreationTime;
	}

	/**
	 * Constructeur de copie d'Atom.
	 * <p>
	 * Cr�� une copie profonde d'un Atom.
	 * </p>
	 * 
	 * @param atom
	 *            L'Atom � copier.
	 * @see Atom#state
	 * @see Atom#atomType
	 * @see Atom#minCreationTime
	 * @see Atom#maxCreationTime
	 */
	public Atom(Atom atom) {
		this(atom.state, atom.atomType, atom.minCreationTime, atom.maxCreationTime);
	}

	/* GETTERS & SETTERS */

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public AtomType getAtomType() {
		return atomType;
	}

	public void setAtomType(AtomType atomType) {
		this.atomType = atomType;
	}

	public int getMinCreationTime() {
		return minCreationTime;
	}

	public void setMinCreationTime(int minCreationTime) {
		this.minCreationTime = minCreationTime;
	}

	public int getMaxCreationTime() {
		return maxCreationTime;
	}

	public void setMaxCreationTime(int maxCreationTime) {
		this.maxCreationTime = maxCreationTime;
	}

	@Override
	public boolean equals(Object other) {
		if (other == null)
			return false;
		if (other == this)
			return true;
		if (!(other instanceof Atom))
			return false;
		Atom otherAtom = (Atom) other;

		if (!this.getState().equals(otherAtom.getState()))
			return false;

		if (!this.getAtomType().equals(otherAtom.getAtomType()))
			return false;

		return true;
	}
}
