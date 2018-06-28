/**
 */
package scenario.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import scenario.AtomType;
import scenario.Effect;
import scenario.GameState;
import scenario.ScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scenario.impl.EffectImpl#getEffectStateConnection <em>Effect State Connection</em>}</li>
 *   <li>{@link scenario.impl.EffectImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectImpl extends MinimalEObjectImpl.Container implements Effect {
	/**
	 * The cached value of the '{@link #getEffectStateConnection() <em>Effect State Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectStateConnection()
	 * @generated
	 * @ordered
	 */
	protected GameState effectStateConnection;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final AtomType TYPE_EDEFAULT = AtomType.CAN_BE_CONSUMED;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AtomType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameState getEffectStateConnection() {
		if (effectStateConnection != null && effectStateConnection.eIsProxy()) {
			InternalEObject oldEffectStateConnection = (InternalEObject)effectStateConnection;
			effectStateConnection = (GameState)eResolveProxy(oldEffectStateConnection);
			if (effectStateConnection != oldEffectStateConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioPackage.EFFECT__EFFECT_STATE_CONNECTION, oldEffectStateConnection, effectStateConnection));
			}
		}
		return effectStateConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameState basicGetEffectStateConnection() {
		return effectStateConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectStateConnection(GameState newEffectStateConnection) {
		GameState oldEffectStateConnection = effectStateConnection;
		effectStateConnection = newEffectStateConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.EFFECT__EFFECT_STATE_CONNECTION, oldEffectStateConnection, effectStateConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AtomType newType) {
		AtomType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.EFFECT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenarioPackage.EFFECT__EFFECT_STATE_CONNECTION:
				if (resolve) return getEffectStateConnection();
				return basicGetEffectStateConnection();
			case ScenarioPackage.EFFECT__TYPE:
				return getType();
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
			case ScenarioPackage.EFFECT__EFFECT_STATE_CONNECTION:
				setEffectStateConnection((GameState)newValue);
				return;
			case ScenarioPackage.EFFECT__TYPE:
				setType((AtomType)newValue);
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
			case ScenarioPackage.EFFECT__EFFECT_STATE_CONNECTION:
				setEffectStateConnection((GameState)null);
				return;
			case ScenarioPackage.EFFECT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case ScenarioPackage.EFFECT__EFFECT_STATE_CONNECTION:
				return effectStateConnection != null;
			case ScenarioPackage.EFFECT__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //EffectImpl
