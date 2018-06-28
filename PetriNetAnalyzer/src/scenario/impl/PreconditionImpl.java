/**
 */
package scenario.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import scenario.Precondition;
import scenario.ScenarioPackage;
import scenario.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precondition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scenario.impl.PreconditionImpl#getPreconditionStateConnection <em>Precondition State Connection</em>}</li>
 *   <li>{@link scenario.impl.PreconditionImpl#isExists <em>Exists</em>}</li>
 *   <li>{@link scenario.impl.PreconditionImpl#isConsumed <em>Consumed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreconditionImpl extends MinimalEObjectImpl.Container implements Precondition {
	/**
	 * The cached value of the '{@link #getPreconditionStateConnection() <em>Precondition State Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditionStateConnection()
	 * @generated
	 * @ordered
	 */
	protected State preconditionStateConnection;

	/**
	 * The default value of the '{@link #isExists() <em>Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExists()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXISTS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isExists() <em>Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExists()
	 * @generated
	 * @ordered
	 */
	protected boolean exists = EXISTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isConsumed() <em>Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConsumed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSUMED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isConsumed() <em>Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConsumed()
	 * @generated
	 * @ordered
	 */
	protected boolean consumed = CONSUMED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreconditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.PRECONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getPreconditionStateConnection() {
		if (preconditionStateConnection != null && preconditionStateConnection.eIsProxy()) {
			InternalEObject oldPreconditionStateConnection = (InternalEObject)preconditionStateConnection;
			preconditionStateConnection = (State)eResolveProxy(oldPreconditionStateConnection);
			if (preconditionStateConnection != oldPreconditionStateConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioPackage.PRECONDITION__PRECONDITION_STATE_CONNECTION, oldPreconditionStateConnection, preconditionStateConnection));
			}
		}
		return preconditionStateConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetPreconditionStateConnection() {
		return preconditionStateConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreconditionStateConnection(State newPreconditionStateConnection) {
		State oldPreconditionStateConnection = preconditionStateConnection;
		preconditionStateConnection = newPreconditionStateConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.PRECONDITION__PRECONDITION_STATE_CONNECTION, oldPreconditionStateConnection, preconditionStateConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExists() {
		return exists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExists(boolean newExists) {
		boolean oldExists = exists;
		exists = newExists;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.PRECONDITION__EXISTS, oldExists, exists));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsumed() {
		return consumed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumed(boolean newConsumed) {
		boolean oldConsumed = consumed;
		consumed = newConsumed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.PRECONDITION__CONSUMED, oldConsumed, consumed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenarioPackage.PRECONDITION__PRECONDITION_STATE_CONNECTION:
				if (resolve) return getPreconditionStateConnection();
				return basicGetPreconditionStateConnection();
			case ScenarioPackage.PRECONDITION__EXISTS:
				return isExists();
			case ScenarioPackage.PRECONDITION__CONSUMED:
				return isConsumed();
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
			case ScenarioPackage.PRECONDITION__PRECONDITION_STATE_CONNECTION:
				setPreconditionStateConnection((State)newValue);
				return;
			case ScenarioPackage.PRECONDITION__EXISTS:
				setExists((Boolean)newValue);
				return;
			case ScenarioPackage.PRECONDITION__CONSUMED:
				setConsumed((Boolean)newValue);
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
			case ScenarioPackage.PRECONDITION__PRECONDITION_STATE_CONNECTION:
				setPreconditionStateConnection((State)null);
				return;
			case ScenarioPackage.PRECONDITION__EXISTS:
				setExists(EXISTS_EDEFAULT);
				return;
			case ScenarioPackage.PRECONDITION__CONSUMED:
				setConsumed(CONSUMED_EDEFAULT);
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
			case ScenarioPackage.PRECONDITION__PRECONDITION_STATE_CONNECTION:
				return preconditionStateConnection != null;
			case ScenarioPackage.PRECONDITION__EXISTS:
				return exists != EXISTS_EDEFAULT;
			case ScenarioPackage.PRECONDITION__CONSUMED:
				return consumed != CONSUMED_EDEFAULT;
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
		result.append(" (Exists: ");
		result.append(exists);
		result.append(", Consumed: ");
		result.append(consumed);
		result.append(')');
		return result.toString();
	}

} //PreconditionImpl
