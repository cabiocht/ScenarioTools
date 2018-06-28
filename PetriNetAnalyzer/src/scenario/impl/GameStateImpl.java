/**
 */
package scenario.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import scenario.GameState;
import scenario.ScenarioPackage;
import visitor.PNVisitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Game
 * State</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link scenario.impl.GameStateImpl#isIsInitialAvailableState <em>Is
 * Initial Available State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameStateImpl extends StateImpl implements GameState {
	/**
	 * The default value of the '{@link #isIsInitialAvailableState() <em>Is Initial
	 * Available State</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isIsInitialAvailableState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INITIAL_AVAILABLE_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInitialAvailableState() <em>Is Initial
	 * Available State</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isIsInitialAvailableState()
	 * @generated
	 * @ordered
	 */
	protected boolean isInitialAvailableState = IS_INITIAL_AVAILABLE_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GameStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.GAME_STATE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isIsInitialAvailableState() {
		return isInitialAvailableState;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIsInitialAvailableState(boolean newIsInitialAvailableState) {
		boolean oldIsInitialAvailableState = isInitialAvailableState;
		isInitialAvailableState = newIsInitialAvailableState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScenarioPackage.GAME_STATE__IS_INITIAL_AVAILABLE_STATE, oldIsInitialAvailableState,
					isInitialAvailableState));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ScenarioPackage.GAME_STATE__IS_INITIAL_AVAILABLE_STATE:
			return isIsInitialAvailableState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ScenarioPackage.GAME_STATE__IS_INITIAL_AVAILABLE_STATE:
			setIsInitialAvailableState((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ScenarioPackage.GAME_STATE__IS_INITIAL_AVAILABLE_STATE:
			setIsInitialAvailableState(IS_INITIAL_AVAILABLE_STATE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ScenarioPackage.GAME_STATE__IS_INITIAL_AVAILABLE_STATE:
			return isInitialAvailableState != IS_INITIAL_AVAILABLE_STATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (IsInitialAvailableState: ");
		result.append(isInitialAvailableState);
		result.append(')');
		return result.toString();
	}

	@Override
	public void accept(PNVisitor visitor) {
		visitor.visit(this);

	}

} // GameStateImpl
