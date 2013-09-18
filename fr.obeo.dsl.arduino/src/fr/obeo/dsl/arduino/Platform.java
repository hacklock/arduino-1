/**
 */
package fr.obeo.dsl.arduino;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.Platform#getDigitalPins <em>Digital Pins</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.Platform#getAnalogPins <em>Analog Pins</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.arduino.ArduinoPackage#getPlatform()
 * @model
 * @generated
 */
public interface Platform extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Digital Pins</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.arduino.DigitalPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digital Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digital Pins</em>' containment reference list.
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getPlatform_DigitalPins()
	 * @model containment="true"
	 * @generated
	 */
	EList<DigitalPin> getDigitalPins();

	/**
	 * Returns the value of the '<em><b>Analog Pins</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.arduino.AnalogPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analog Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analog Pins</em>' containment reference list.
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getPlatform_AnalogPins()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnalogPin> getAnalogPins();

} // Platform