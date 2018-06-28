package scenario.util;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import scenario.Scenario;
import scenario.ScenarioPackage;

public class EMFModelLoad {
    public Scenario load(String path) {
        // Initialize the model
        ScenarioPackage.eINSTANCE.eClass();

        // Register the XMI resource factory for the .scenario extension

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("scenario", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();
        // Get the resource
        Resource resource = resSet.getResource(URI
                .createURI("scenario.scenario"), true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        Scenario scenario = (Scenario) resource.getContents().get(0);
        return scenario;
    }
}
