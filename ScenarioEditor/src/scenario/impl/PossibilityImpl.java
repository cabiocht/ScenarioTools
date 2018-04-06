/**
 */
package scenario.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import scenario.EventAction;
import scenario.Possibility;
import scenario.ScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Possibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scenario.impl.PossibilityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link scenario.impl.PossibilityImpl#getPossibilityEventActionConnection <em>Possibility Event Action Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PossibilityImpl extends MinimalEObjectImpl.Container implements Possibility {
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
	 * The cached value of the '{@link #getPossibilityEventActionConnection() <em>Possibility Event Action Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibilityEventActionConnection()
	 * @generated
	 * @ordered
	 */
	protected EventAction possibilityEventActionConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PossibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.POSSIBILITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.POSSIBILITY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventAction getPossibilityEventActionConnection() {
		if (possibilityEventActionConnection != null && possibilityEventActionConnection.eIsProxy()) {
			InternalEObject oldPossibilityEventActionConnection = (InternalEObject)possibilityEventActionConnection;
			possibilityEventActionConnection = (EventAction)eResolveProxy(oldPossibilityEventActionConnection);
			if (possibilityEventActionConnection != oldPossibilityEventActionConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioPackage.POSSIBILITY__POSSIBILITY_EVENT_ACTION_CONNECTION, oldPossibilityEventActionConnection, possibilityEventActionConnection));
			}
		}
		return possibilityEventActionConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventAction basicGetPossibilityEventActionConnection() {
		return possibilityEventActionConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPossibilityEventActionConnection(EventAction newPossibilityEventActionConnection) {
		EventAction oldPossibilityEventActionConnection = possibilityEventActionConnection;
		possibilityEventActionConnection = newPossibilityEventActionConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.POSSIBILITY__POSSIBILITY_EVENT_ACTION_CONNECTION, oldPossibilityEventActionConnection, possibilityEventActionConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenarioPackage.POSSIBILITY__DESCRIPTION:
				return getDescription();
			case ScenarioPackage.POSSIBILITY__POSSIBILITY_EVENT_ACTION_CONNECTION:
				if (resolve) return getPossibilityEventActionConnection();
				return basicGetPossibilityEventActionConnection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScenarioPackage.POSSIBILITY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ScenarioPackage.POSSIBILITY__POSSIBILITY_EVENT_ACTION_CONNECTION:
				setPossibilityEventActionConnection((EventAction)newValue);
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
			case ScenarioPackage.POSSIBILITY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ScenarioPackage.POSSIBILITY__POSSIBILITY_EVENT_ACTION_CONNECTION:
				setPossibilityEventActionConnection((EventAction)null);
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
			case ScenarioPackage.POSSIBILITY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ScenarioPackage.POSSIBILITY__POSSIBILITY_EVENT_ACTION_CONNECTION:
				return possibilityEventActionConnection != null;
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
		result.append(" (Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //PossibilityImpl
