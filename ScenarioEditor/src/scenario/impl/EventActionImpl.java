/**
 */
package scenario.impl;

import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import scenario.Effect;
import scenario.EventAction;
import scenario.GameState;
import scenario.Precondition;
import scenario.ScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scenario.impl.EventActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link scenario.impl.EventActionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link scenario.impl.EventActionImpl#getEventActionPrecondition <em>Event Action Precondition</em>}</li>
 *   <li>{@link scenario.impl.EventActionImpl#getEventActionEffect <em>Event Action Effect</em>}</li>
 *   <li>{@link scenario.impl.EventActionImpl#getEventActionPriorityOrder <em>Event Action Priority Order</em>}</li>
 *   <li>{@link scenario.impl.EventActionImpl#getMinTimeBeforeReached <em>Min Time Before Reached</em>}</li>
 *   <li>{@link scenario.impl.EventActionImpl#getMaxTimeBeforeReached <em>Max Time Before Reached</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventActionImpl extends MinimalEObjectImpl.Container implements EventAction {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEventActionPrecondition() <em>Event Action Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventActionPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Precondition> eventActionPrecondition;

	/**
	 * The cached value of the '{@link #getEventActionEffect() <em>Event Action Effect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventActionEffect()
	 * @generated
	 * @ordered
	 */
	protected EList<Effect> eventActionEffect;

	/**
	 * The default value of the '{@link #getEventActionPriorityOrder() <em>Event Action Priority Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventActionPriorityOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int EVENT_ACTION_PRIORITY_ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEventActionPriorityOrder() <em>Event Action Priority Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventActionPriorityOrder()
	 * @generated
	 * @ordered
	 */
	protected int eventActionPriorityOrder = EVENT_ACTION_PRIORITY_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTimeBeforeReached() <em>Min Time Before Reached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTimeBeforeReached()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_TIME_BEFORE_REACHED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinTimeBeforeReached() <em>Min Time Before Reached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTimeBeforeReached()
	 * @generated
	 * @ordered
	 */
	protected int minTimeBeforeReached = MIN_TIME_BEFORE_REACHED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTimeBeforeReached() <em>Max Time Before Reached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTimeBeforeReached()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TIME_BEFORE_REACHED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxTimeBeforeReached() <em>Max Time Before Reached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTimeBeforeReached()
	 * @generated
	 * @ordered
	 */
	protected int maxTimeBeforeReached = MAX_TIME_BEFORE_REACHED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.EVENT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.EVENT_ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.EVENT_ACTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Precondition> getEventActionPrecondition() {
		if (eventActionPrecondition == null) {
			eventActionPrecondition = new EObjectContainmentEList<Precondition>(Precondition.class, this, ScenarioPackage.EVENT_ACTION__EVENT_ACTION_PRECONDITION);
		}
		return eventActionPrecondition;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Effect> getEventActionEffect() {
		if (eventActionEffect == null) {
			eventActionEffect = new EObjectContainmentEList<Effect>(Effect.class, this, ScenarioPackage.EVENT_ACTION__EVENT_ACTION_EFFECT);
		}
		return eventActionEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEventActionPriorityOrder() {
		return eventActionPriorityOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventActionPriorityOrder(int newEventActionPriorityOrder) {
		int oldEventActionPriorityOrder = eventActionPriorityOrder;
		eventActionPriorityOrder = newEventActionPriorityOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.EVENT_ACTION__EVENT_ACTION_PRIORITY_ORDER, oldEventActionPriorityOrder, eventActionPriorityOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinTimeBeforeReached() {
		return minTimeBeforeReached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTimeBeforeReached(int newMinTimeBeforeReached) {
		int oldMinTimeBeforeReached = minTimeBeforeReached;
		minTimeBeforeReached = newMinTimeBeforeReached;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.EVENT_ACTION__MIN_TIME_BEFORE_REACHED, oldMinTimeBeforeReached, minTimeBeforeReached));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxTimeBeforeReached() {
		return maxTimeBeforeReached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTimeBeforeReached(int newMaxTimeBeforeReached) {
		int oldMaxTimeBeforeReached = maxTimeBeforeReached;
		maxTimeBeforeReached = newMaxTimeBeforeReached;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.EVENT_ACTION__MAX_TIME_BEFORE_REACHED, oldMaxTimeBeforeReached, maxTimeBeforeReached));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioPackage.EVENT_ACTION__EVENT_ACTION_PRECONDITION:
				return ((InternalEList<?>)getEventActionPrecondition()).basicRemove(otherEnd, msgs);
			case ScenarioPackage.EVENT_ACTION__EVENT_ACTION_EFFECT:
				return ((InternalEList<?>)getEventActionEffect()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenarioPackage.EVENT_ACTION__NAME:
				return getName();
			case ScenarioPackage.EVENT_ACTION__DESCRIPTION:
				return getDescription();
			case ScenarioPackage.EVENT_ACTION__EVENT_ACTION_PRECONDITION:
				return getEventActionPrecondition();
			case ScenarioPackage.EVENT_ACTION__EVENT_ACTION_EFFECT:
				return getEventActionEffect();
			case ScenarioPackage.EVENT_ACTION__EVENT_ACTION_PRIORITY_ORDER:
				return getEventActionPriorityOrder();
			case ScenarioPackage.EVENT_ACTION__MIN_TIME_BEFORE_REACHED:
				return getMinTimeBeforeReached();
			case ScenarioPackage.EVENT_ACTION__MAX_TIME_BEFORE_REACHED:
				return getMaxTimeBeforeReached();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScenarioPackage.EVENT_ACTION__NAME:
				setName((String)newValue);
				return;
			case ScenarioPackage.EVENT_ACTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ScenarioPackage.EVENT_ACTION__EVENT_ACTION_PRECONDITION:
				getEventActionPrecondition().clear();
				getEventActionPrecondition().addAll((Collection<? extends Precondition>)newValue);
				return;
			case ScenarioPackage.EVENT_ACTION__EVENT_ACTION_EFFECT:
				getEventActionEffect().clear();
				getEventActionEffect().addAll((Collection<? extends Effect>)newValue);
				return;
			case ScenarioPackage.EVENT_ACTION__EVENT_ACTION_PRIORITY_ORDER:
				setEventActionPriorityOrder((Integer)newValue);
				return;
			case ScenarioPackage.EVENT_ACTION__MIN_TIME_BEFORE_REACHED:
				setMinTimeBeforeReached((Integer)newValue);
				return;
			case ScenarioPackage.EVENT_ACTION__MAX_TIME_BEFORE_REACHED:
				setMaxTimeBeforeReached((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScenarioPackage.EVENT_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ScenarioPackage.EVENT_ACTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ScenarioPackage.EVENT_ACTION__EVENT_ACTION_PRECONDITION:
				getEventActionPrecondition().clear();
				return;
			case ScenarioPackage.EVENT_ACTION__EVENT_ACTION_EFFECT:
				getEventActionEffect().clear();
				return;
			case ScenarioPackage.EVENT_ACTION__EVENT_ACTION_PRIORITY_ORDER:
				setEventActionPriorityOrder(EVENT_ACTION_PRIORITY_ORDER_EDEFAULT);
				return;
			case ScenarioPackage.EVENT_ACTION__MIN_TIME_BEFORE_REACHED:
				setMinTimeBeforeReached(MIN_TIME_BEFORE_REACHED_EDEFAULT);
				return;
			case ScenarioPackage.EVENT_ACTION__MAX_TIME_BEFORE_REACHED:
				setMaxTimeBeforeReached(MAX_TIME_BEFORE_REACHED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScenarioPackage.EVENT_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ScenarioPackage.EVENT_ACTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ScenarioPackage.EVENT_ACTION__EVENT_ACTION_PRECONDITION:
				return eventActionPrecondition != null && !eventActionPrecondition.isEmpty();
			case ScenarioPackage.EVENT_ACTION__EVENT_ACTION_EFFECT:
				return eventActionEffect != null && !eventActionEffect.isEmpty();
			case ScenarioPackage.EVENT_ACTION__EVENT_ACTION_PRIORITY_ORDER:
				return eventActionPriorityOrder != EVENT_ACTION_PRIORITY_ORDER_EDEFAULT;
			case ScenarioPackage.EVENT_ACTION__MIN_TIME_BEFORE_REACHED:
				return minTimeBeforeReached != MIN_TIME_BEFORE_REACHED_EDEFAULT;
			case ScenarioPackage.EVENT_ACTION__MAX_TIME_BEFORE_REACHED:
				return maxTimeBeforeReached != MAX_TIME_BEFORE_REACHED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", Description: ");
		result.append(description);
		result.append(", EventActionPriorityOrder: ");
		result.append(eventActionPriorityOrder);
		result.append(", minTimeBeforeReached: ");
		result.append(minTimeBeforeReached);
		result.append(", maxTimeBeforeReached: ");
		result.append(maxTimeBeforeReached);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ArrayList<Precondition> getGameStatesPreconditions() {
		ArrayList<Precondition> gameStates = new ArrayList<Precondition>();
		for(Precondition gs : getEventActionPrecondition())
		{
			if(gs.getPreconditionStateConnection() instanceof GameState)
			{
				gameStates.add(gs);
			}
		}
		return gameStates;
	}

} //EventActionImpl
