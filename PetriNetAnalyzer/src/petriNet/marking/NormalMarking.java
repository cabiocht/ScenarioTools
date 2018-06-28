package petriNet.marking;

import java.util.ArrayList;

public class NormalMarking extends Marking {
	private ArrayList<Token> tokens;
	private int minTime;
	private int maxTime;

	public NormalMarking() {
		setTokens(new ArrayList<Token>());
	}

	public NormalMarking(NormalMarking toClone) {
		this();
		for (Token t : toClone.getTokens()) {
			addToken(new Token(t));
		}
	}

	public ArrayList<Token> getTokens() {
		return tokens;
	}

	public void setTokens(ArrayList<Token> tokens) {
		this.tokens = tokens;
	}

	public void addToken(Token token) {
		this.tokens.add(token);
	}

	public void removeToken(int nombre) {
		for (int i = 0; i < nombre; i++) {
			// CHANGEMENTS A FAIRE ICI HEIN TU M'ECOUTES?
			tokens.remove(i);
		}
	}

	@Override
	public int getTokenAmount() {
		return tokens.size();
	}

	public String toString() {
		String str = "";
		for (Token t : tokens) {
			str += "\t" + "• : (" + t.getMinTime() + ", " + t.getMaxTime() + ")";
		}
		return str;
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
	public int compareTo(Marking m) {
		if (m instanceof NormalMarking) {
			if(this.getTokenAmount() > m.getTokenAmount())
				return 1;
			else if(this.getTokenAmount() == m.getTokenAmount())
				return 0;
		}
		return -1;
	}

}
