/**
 */
package scenario.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import scenario.ImportantGameState;
import scenario.ScenarioPackage;
import scenario.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Important Game State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scenario.impl.ImportantGameStateImpl#getName <em>Name</em>}</li>
 *   <li>{@link scenario.impl.ImportantGameStateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link scenario.impl.ImportantGameStateImpl#getImportantGameStateConnection <em>Important Game State Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportantGameStateImpl extends MinimalEObjectImpl.Container implements ImportantGameState {
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
	 * The cached value of the '{@link #getImportantGameStateConnection() <em>Important Game State Connection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportantGameStateConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<State> importantGameStateConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportantGameStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.IMPORTANT_GAME_STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.IMPORTANT_GAME_STATE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.IMPORTANT_GAME_STATE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getImportantGameStateConnection() {
		if (importantGameStateConnection == null) {
			importantGameStateConnection = new EObjectResolvingEList<State>(State.class, this, ScenarioPackage.IMPORTANT_GAME_STATE__IMPORTANT_GAME_STATE_CONNECTION);
		}
		return importantGameStateConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenarioPackage.IMPORTANT_GAME_STATE__NAME:
				return getName();
			case ScenarioPackage.IMPORTANT_GAME_STATE__DESCRIPTION:
				return getDescription();
			case ScenarioPackage.IMPORTANT_GAME_STATE__IMPORTANT_GAME_STATE_CONNECTION:
				return getImportantGameStateConnection();
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
			case ScenarioPackage.IMPORTANT_GAME_STATE__NAME:
				setName((String)newValue);
				return;
			case ScenarioPackage.IMPORTANT_GAME_STATE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ScenarioPackage.IMPORTANT_GAME_STATE__IMPORTANT_GAME_STATE_CONNECTION:
				getImportantGameStateConnection().clear();
				getImportantGameStateConnection().addAll((Collection<? extends State>)newValue);
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
			case ScenarioPackage.IMPORTANT_GAME_STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ScenarioPackage.IMPORTANT_GAME_STATE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ScenarioPackage.IMPORTANT_GAME_STATE__IMPORTANT_GAME_STATE_CONNECTION:
				getImportantGameStateConnection().clear();
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
			case ScenarioPackage.IMPORTANT_GAME_STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ScenarioPackage.IMPORTANT_GAME_STATE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ScenarioPackage.IMPORTANT_GAME_STATE__IMPORTANT_GAME_STATE_CONNECTION:
				return importantGameStateConnection != null && !importantGameStateConnection.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ImportantGameStateImpl
