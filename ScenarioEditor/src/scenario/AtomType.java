/**
 */
package scenario;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>State Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see scenario.ScenarioPackage#getAtomType()
 * @model
 * @generated
 */
public enum AtomType implements Enumerator {
	/**
	 * The '<em><b>Can Be Consumed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN_BE_CONSUMED_VALUE
	 * @generated
	 * @ordered
	 */
	CAN_BE_CONSUMED(0, "CanBeConsumed", "CanBeConsumed"),

	/**
	 * The '<em><b>Must Be Consumed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUST_BE_CONSUMED_VALUE
	 * @generated
	 * @ordered
	 */
	MUST_BE_CONSUMED(1, "MustBeConsumed", "MustBeConsumed"),

	/**
	 * The '<em><b>Infinite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFINITE_VALUE
	 * @generated
	 * @ordered
	 */
	INFINITE(2, "Infinite", "Infinite");

	/**
	 * The '<em><b>Can Be Consumed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Can Be Consumed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAN_BE_CONSUMED
	 * @model name="CanBeConsumed"
	 * @generated
	 * @ordered
	 */
	public static final int CAN_BE_CONSUMED_VALUE = 0;

	/**
	 * The '<em><b>Must Be Consumed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Must Be Consumed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MUST_BE_CONSUMED
	 * @model name="MustBeConsumed"
	 * @generated
	 * @ordered
	 */
	public static final int MUST_BE_CONSUMED_VALUE = 1;

	/**
	 * The '<em><b>Infinite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Infinite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFINITE
	 * @model name="Infinite"
	 * @generated
	 * @ordered
	 */
	public static final int INFINITE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Atom Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AtomType[] VALUES_ARRAY =
		new AtomType[] {
			CAN_BE_CONSUMED,
			MUST_BE_CONSUMED,
			INFINITE,
		};

	/**
	 * A public read-only list of all the '<em><b>Atom Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AtomType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Atom Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AtomType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AtomType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Atom Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AtomType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AtomType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Atom Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AtomType get(int value) {
		switch (value) {
			case CAN_BE_CONSUMED_VALUE: return CAN_BE_CONSUMED;
			case MUST_BE_CONSUMED_VALUE: return MUST_BE_CONSUMED;
			case INFINITE_VALUE: return INFINITE;
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
	private AtomType(int value, String name, String literal) {
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
	
} //StateType
