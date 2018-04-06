/**
 */
package scenario;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>State Creator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see scenario.ScenarioPackage#getStateCreator()
 * @model
 * @generated
 */
public enum StateCreator implements Enumerator {
	/**
	 * The '<em><b>Game State</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAME_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	GAME_STATE(0, "GameState", "GameState"),

	/**
	 * The '<em><b>Player Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYER_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	PLAYER_INPUT(1, "PlayerInput", "PlayerInput"),

	/**
	 * The '<em><b>GM Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GM_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	GM_INPUT(2, "GMInput", "GMInput");

	/**
	 * The '<em><b>Game State</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Game State</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAME_STATE
	 * @model name="GameState"
	 * @generated
	 * @ordered
	 */
	public static final int GAME_STATE_VALUE = 0;

	/**
	 * The '<em><b>Player Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Player Input</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAYER_INPUT
	 * @model name="PlayerInput"
	 * @generated
	 * @ordered
	 */
	public static final int PLAYER_INPUT_VALUE = 1;

	/**
	 * The '<em><b>GM Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GM Input</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GM_INPUT
	 * @model name="GMInput"
	 * @generated
	 * @ordered
	 */
	public static final int GM_INPUT_VALUE = 2;

	/**
	 * An array of all the '<em><b>State Creator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StateCreator[] VALUES_ARRAY =
		new StateCreator[] {
			GAME_STATE,
			PLAYER_INPUT,
			GM_INPUT,
		};

	/**
	 * A public read-only list of all the '<em><b>State Creator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StateCreator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>State Creator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateCreator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateCreator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Creator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateCreator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateCreator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Creator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateCreator get(int value) {
		switch (value) {
			case GAME_STATE_VALUE: return GAME_STATE;
			case PLAYER_INPUT_VALUE: return PLAYER_INPUT;
			case GM_INPUT_VALUE: return GM_INPUT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StateCreator(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //StateCreator
