package scenario.visitor;

import java.io.File;
import java.io.FileNotFoundException;

import scenario.State;
import scenario.graph.Node;
import scenario.graphviz.GraphViz;


public class DOTVisitor implements Visitor {
	
	private GraphViz gv;
	private String dest;
	
	public DOTVisitor (String executable) throws FileNotFoundException
	{
		File f = new File("tmp/");
		f.mkdirs();
		gv = new GraphViz(executable, f.getPath());
		gv.addln(gv.start_graph());
		this.dest = System.getProperty("user.dir")+"\\out\\";
		System.out.println(dest);

	}
	
	@Override
	public void visit(Node node) {
		
		String label = "";
		String tooltip = "";
		
		if(node.getParent()!=null)	
			label = node.getParent().getChildren().get(node).getName();
		else
			label = "init";	
		
		for(State a : node.getCurrentStates())
		{
			tooltip += a.getName() + " ";
		}
		
		label = this.generateLabel(label);
		tooltip = this.generateTooltip(tooltip);
		
		gv.addln(node.hashCode() + this.generateNodeAttributes(label, "", tooltip, ""));
		
		if(node.getChildren().keySet().size() == 0 && node.getParent()!=null)
		{
			gv.addln(node.hashCode() + " -> " + node.hashCode()+node.getParent().hashCode()+";");
		}
		else
		{
			for(Node child : node.getChildren().keySet())
			{
				gv.addln(node.hashCode() + " -> " + child.hashCode()+";");
				visit(child);
			}
		}
	}
	
	public void close(Node node)
	{
		String line;
		line = "{rank = same;";
		
		String label;
		String xlabel;
		String tooltip;
		String color;
		boolean success;
		for(Node leaf : node.getLeafs())
		{
			label = "";
			xlabel = "";
			tooltip = "";
			color = "";
			
			success = leaf.getGameState().isSuccess();
			if(success)
				label += "SUCCES";
			
			else
				label += "FAILURE";
			
			xlabel += leaf.getGameState().getMinTime() + " - " + leaf.getGameState().getMaxTime();
			
			tooltip = leaf.getPath();
			
			if(!success)
			{
				tooltip += "->failure";
				color = "red";
			}
			else
			{
				tooltip += "->success";
				color = "green";
			}
			
			label = this.generateLabel(label);
			xlabel = this.generateXlabel(xlabel);
			color = this.generateColor(color);
			tooltip = this.generateTooltip(tooltip);
			
			if(node.getParent()!=null)
				line += "" +leaf.hashCode()+leaf.getParent().hashCode() + this.generateNodeAttributes(label, xlabel, tooltip, color) + ";";
		}
		
		line += "}";
		
		gv.addln(line);
		
		String type = "svg";
		String representationType = "dot";
		gv.addln(gv.end_graph());
		
		gv.decreaseDpi();
		gv.decreaseDpi();
		gv.decreaseDpi();
		
		File out = new File(dest + "out." + type);    // Windows
		System.out.println(dest+ "out." + type);
		gv.writeGraphToFile( gv.getGraph(gv.getDotSource(), type, representationType), out );
	}
	
	private String generateLabel(String label)
	{
		return "label=\"" + label + "\"";
	}
	
	private String generateTooltip(String tooltip)
	{
		return "tooltip=\"" + tooltip + "\"";
	}
	
	private String generateColor(String color)
	{
		return "fontcolor=\"" + color + "\" color=\"" + color + "\"";
	}
	
	private String generateXlabel(String xlabel)
	{
		return "xlabel=<" + xlabel + ">";
	}
	
	private String generateNodeAttributes(String label, String xlabel, String tooltip, String color)
	{
		return "[" + label + xlabel + tooltip + color + "]";
	}

}
