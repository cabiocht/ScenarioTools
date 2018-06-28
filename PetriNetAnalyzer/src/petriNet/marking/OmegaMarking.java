package petriNet.marking;

public class OmegaMarking extends Marking {

	private int minTime;
	private int maxTime;

	public OmegaMarking(int minTime, int maxTime) {
		setMinTime(minTime);
		setMaxTime(maxTime);
	}

	public OmegaMarking(OmegaMarking toClone) {
		this(toClone.minTime,toClone.maxTime);
	}

	public int getMinTime() {
		return minTime;
	}

	public void setMinTime(int minTime) {
		this.minTime = minTime;
	}

	public int getMaxTime() {
		return maxTime;
	}

	public void setMaxTime(int maxTime) {
		this.maxTime = maxTime;
	}

	@Override
	public int getTokenAmount() {
		return Integer.MAX_VALUE;
	}

	public String toString() {
		return "OMEGA\n";
	}
	
	@Override
	public int compareTo(Marking m) {
		if (m instanceof OmegaMarking) {
				return 0;
		}
		return 1;
	}
}
