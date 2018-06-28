package petriNet.marking;

public class Token {

	private int minTime;
	private int maxTime;

	public Token(int minTime, int maxTime) {
		super();
		this.minTime = minTime;
		this.maxTime = maxTime;
	}

	public Token(Token t) {
		this(t.minTime,t.maxTime);
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

	public String toString() {
		return minTime + " " + maxTime + "\n";
	}
}
