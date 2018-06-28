/**
 */
package scenario;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenario.Effect#getEffectStateConnection <em>Effect State Connection</em>}</li>
 *   <li>{@link scenario.Effect#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see scenario.ScenarioPackage#getEffect()
 * @model
 * @generated
 */
public interface Effect extends EObject {
	/**
	 * Returns the value of the '<em><b>Effect State Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect State Connection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect State Connection</em>' reference.
	 * @see #setEffectStateConnection(GameState)
	 * @see scenario.ScenarioPackage#getEffect_EffectStateConnection()
	 * @model required="true"
	 * @generated
	 */
	GameState getEffectStateConnection();

	/**
	 * Sets the value of the '{@link scenario.Effect#getEffectStateConnection <em>Effect State Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect State Connection</em>' reference.
	 * @see #getEffectStateConnection()
	 * @generated
	 */
	void setEffectStateConnection(GameState value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link scenario.AtomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see scenario.AtomType
	 * @see #setType(AtomType)
	 * @see scenario.ScenarioPackage#getEffect_Type()
	 * @model
	 * @generated
	 */
	AtomType getType();

	/**
	 * Sets the value of the '{@link scenario.Effect#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see scenario.AtomType
	 * @see #getType()
	 * @generated
	 */
	void setType(AtomType value);

} // Effect
