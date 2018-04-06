package scenario.analyzer;

import java.io.FileNotFoundException;

import scenario.Scenario;
import scenario.graph.GraphGenerator;
import scenario.graph.Node;
import scenario.util.EMFModelLoad;
import scenario.visitor.DOTVisitor;
import scenario.visitor.TXTVisitor;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		/*CHARGEMENT DU SCENARIO*/
		EMFModelLoad emf = new EMFModelLoad();
		Scenario s = emf.load(System.getProperty("user.dir") + "\\");
		
		/*GENERATION DU GRAPH DES PREUVES*/
		GraphGenerator gg = new GraphGenerator(s);
		Node n = gg.generateGraph();
		
		/*GENERATION DU FICHIER DE VISUALISATION DU GRAPH*/
		DOTVisitor dv = new DOTVisitor(args[0]);
		dv.visit(n);
		dv.close(n);
		
		TXTVisitor tv = new TXTVisitor(s);
		tv.visit(n);
		tv.close(n);
	}
}
