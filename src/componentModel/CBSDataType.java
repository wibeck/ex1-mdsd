/**
 */
package componentModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CBS Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see componentModel.ComponentModelPackage#getCBSDataType()
 * @model
 * @generated
 */
public enum CBSDataType implements Enumerator {
	/**
	 * The '<em><b>BOOLEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(0, "BOOLEAN", "Boolean"),

	/**
	 * The '<em><b>INT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(1, "INT", "Int"),

	/**
	 * The '<em><b>CHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAR_VALUE
	 * @generated
	 * @ordered
	 */
	CHAR(2, "CHAR", "Char"),

	/**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(3, "DATE", "Date"),

	/**
	 * The '<em><b>LIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_VALUE
	 * @generated
	 * @ordered
	 */
	LIST(4, "LIST", "List"),

	/**
	 * The '<em><b>MAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAP_VALUE
	 * @generated
	 * @ordered
	 */
	MAP(5, "MAP", "Map"),

	/**
	 * The '<em><b>FLOAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(6, "FLOAT", "Float"),

	/**
	 * The '<em><b>LONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_VALUE
	 * @generated
	 * @ordered
	 */
	LONG(7, "LONG", "Long"),

	/**
	 * The '<em><b>DOUBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(8, "DOUBLE", "Double"),

	/**
	 * The '<em><b>STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(9, "STRING", "String"),

	/**
	 * The '<em><b>VOID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOID_VALUE
	 * @generated
	 * @ordered
	 */
	VOID(10, "VOID", "Void"),

	/**
	 * The '<em><b>COMPLEX TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLEX_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLEX_TYPE(11, "COMPLEX_TYPE", "");

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model literal="Boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 0;

	/**
	 * The '<em><b>INT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model literal="Int"
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 1;

	/**
	 * The '<em><b>CHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAR
	 * @model literal="Char"
	 * @generated
	 * @ordered
	 */
	public static final int CHAR_VALUE = 2;

	/**
	 * The '<em><b>DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model literal="Date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 3;

	/**
	 * The '<em><b>LIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST
	 * @model literal="List"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_VALUE = 4;

	/**
	 * The '<em><b>MAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAP
	 * @model literal="Map"
	 * @generated
	 * @ordered
	 */
	public static final int MAP_VALUE = 5;

	/**
	 * The '<em><b>FLOAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model literal="Float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 6;

	/**
	 * The '<em><b>LONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @model literal="Long"
	 * @generated
	 * @ordered
	 */
	public static final int LONG_VALUE = 7;

	/**
	 * The '<em><b>DOUBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @model literal="Double"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 8;

	/**
	 * The '<em><b>STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model literal="String"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 9;

	/**
	 * The '<em><b>VOID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOID
	 * @model literal="Void"
	 * @generated
	 * @ordered
	 */
	public static final int VOID_VALUE = 10;

	/**
	 * The '<em><b>COMPLEX TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLEX_TYPE
	 * @model literal=""
	 * @generated
	 * @ordered
	 */
	public static final int COMPLEX_TYPE_VALUE = 11;

	/**
	 * An array of all the '<em><b>CBS Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CBSDataType[] VALUES_ARRAY =
		new CBSDataType[] {
			BOOLEAN,
			INT,
			CHAR,
			DATE,
			LIST,
			MAP,
			FLOAT,
			LONG,
			DOUBLE,
			STRING,
			VOID,
			COMPLEX_TYPE,
		};

	/**
	 * A public read-only list of all the '<em><b>CBS Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CBSDataType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CBS Data Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CBSDataType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CBSDataType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CBS Data Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CBSDataType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CBSDataType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CBS Data Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CBSDataType get(int value) {
		switch (value) {
			case BOOLEAN_VALUE: return BOOLEAN;
			case INT_VALUE: return INT;
			case CHAR_VALUE: return CHAR;
			case DATE_VALUE: return DATE;
			case LIST_VALUE: return LIST;
			case MAP_VALUE: return MAP;
			case FLOAT_VALUE: return FLOAT;
			case LONG_VALUE: return LONG;
			case DOUBLE_VALUE: return DOUBLE;
			case STRING_VALUE: return STRING;
			case VOID_VALUE: return VOID;
			case COMPLEX_TYPE_VALUE: return COMPLEX_TYPE;
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
	private CBSDataType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //CBSDataType
