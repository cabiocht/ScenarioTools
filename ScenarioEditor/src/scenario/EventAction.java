/**
 */
package scenario;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenario.EventAction#getName <em>Name</em>}</li>
 *   <li>{@link scenario.EventAction#getDescription <em>Description</em>}</li>
 *   <li>{@link scenario.EventAction#getEventActionPrecondition <em>Event Action Precondition</em>}</li>
 *   <li>{@link scenario.EventAction#getEventActionEffect <em>Event Action Effect</em>}</li>
 *   <li>{@link scenario.EventAction#getEventActionPriorityOrder <em>Event Action Priority Order</em>}</li>
 *   <li>{@link scenario.EventAction#getMinTimeBeforeReached <em>Min Time Before Reached</em>}</li>
 *   <li>{@link scenario.EventAction#getMaxTimeBeforeReached <em>Max Time Before Reached</em>}</li>
 * </ul>
 *
 * @see scenario.ScenarioPackage#getEventAction()
 * @model
 * @generated
 */
public interface EventAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see scenario.ScenarioPackage#getEventAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link scenario.EventAction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see scenario.ScenarioPackage#getEventAction_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link scenario.EventAction#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Event Action Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link scenario.Precondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Action Precondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Action Precondition</em>' containment reference list.
	 * @see scenario.ScenarioPackage#getEventAction_EventActionPrecondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Precondition> getEventActionPrecondition();

	/**
	 * Returns the value of the '<em><b>Event Action Effect</b></em>' containment reference list.
	 * The list contents are of type {@link scenario.Effect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Action Effect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Action Effect</em>' containment reference list.
	 * @see scenario.ScenarioPackage#getEventAction_EventActionEffect()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Effect> getEventActionEffect();

	/**
	 * Returns the value of the '<em><b>Event Action Priority Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Action Priority Order</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Action Priority Order</em>' attribute.
	 * @see #setEventActionPriorityOrder(int)
	 * @see scenario.ScenarioPackage#getEventAction_EventActionPriorityOrder()
	 * @model
	 * @generated
	 */
	int getEventActionPriorityOrder();

	/**
	 * Sets the value of the '{@link scenario.EventAction#getEventActionPriorityOrder <em>Event Action Priority Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Action Priority Order</em>' attribute.
	 * @see #getEventActionPriorityOrder()
	 * @generated
	 */
	void setEventActionPriorityOrder(int value);

	/**
	 * Returns the value of the '<em><b>Min Time Before Reached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Time Before Reached</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time Before Reached</em>' attribute.
	 * @see #setMinTimeBeforeReached(int)
	 * @see scenario.ScenarioPackage#getEventAction_MinTimeBeforeReached()
	 * @model
	 * @generated
	 */
	int getMinTimeBeforeReached();

	/**
	 * Sets the value of the '{@link scenario.EventAction#getMinTimeBeforeReached <em>Min Time Before Reached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time Before Reached</em>' attribute.
	 * @see #getMinTimeBeforeReached()
	 * @generated
	 */
	void setMinTimeBeforeReached(int value);

	/**
	 * Returns the value of the '<em><b>Max Time Before Reached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Time Before Reached</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time Before Reached</em>' attribute.
	 * @see #setMaxTimeBeforeReached(int)
	 * @see scenario.ScenarioPackage#getEventAction_MaxTimeBeforeReached()
	 * @model
	 * @generated
	 */
	int getMaxTimeBeforeReached();

	/**
	 * Sets the value of the '{@link scenario.EventAction#getMaxTimeBeforeReached <em>Max Time Before Reached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time Before Reached</em>' attribute.
	 * @see #getMaxTimeBeforeReached()
	 * @generated
	 */
	void setMaxTimeBeforeReached(int value);

	ArrayList<Precondition> getGameStatesPreconditions();

} // EventAction
