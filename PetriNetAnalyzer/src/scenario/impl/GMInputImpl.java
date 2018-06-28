/**
 */
package scenario.impl;

import org.eclipse.emf.ecore.EClass;

import scenario.GMInput;
import scenario.ScenarioPackage;
import visitor.PNVisitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>GM
 * Input</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class GMInputImpl extends StateImpl implements GMInput {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GMInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.GM_INPUT;
	}

	@Override
	public void accept(PNVisitor visitor) {
		visitor.visit(this);

	}

} // GMInputImpl
