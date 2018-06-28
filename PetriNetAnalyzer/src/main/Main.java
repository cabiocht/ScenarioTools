package main;


import petriNet.PetriNet;
import petriNet.tree.KarpMiller;
import petriNet.tree.PNTree;
import scenario.Scenario;
import scenario.util.EMFModelLoad;
import scenarioToPetriNet.PetriNetBuilder;
import visitor.PNVisitor;

public class Main {
	
	//Argument = Location of GraphViz
	public static void main(String[] args) {

		/*CHARGEMENT DU SCENARIO*/
		
		System.out.println("Chargement du scénario");
		EMFModelLoad emf = new EMFModelLoad();
		Scenario s = emf.load(System.getProperty("user.dir") + "\\");
		
		/*CONSTRUCTION DU GRAPH*/
		PetriNetBuilder pnb = new PetriNetBuilder(s);
		
		PetriNet pn = pnb.buildPetriNet();
		
		KarpMiller km = new KarpMiller(pn);
		PNTree tree = km.execute();
		System.out.println("Fin");
		
		PNVisitor visitor = new PNVisitor(pn, args[0]);
		tree.accept(visitor);
		visitor.close(tree, System.getProperty("user.dir")+"\\out\\");
		System.out.println("end");
		
	}
}
