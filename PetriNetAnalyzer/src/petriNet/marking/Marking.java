package petriNet.marking;

public abstract class Marking {

	public abstract int getTokenAmount();
	public abstract int compareTo(Marking m);
	public abstract int getMinTime();
	public abstract int getMaxTime();
}

