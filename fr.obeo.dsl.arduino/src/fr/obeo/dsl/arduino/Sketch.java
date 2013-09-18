/**
 */
package fr.obeo.dsl.arduino;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sketch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.Sketch#getHardware <em>Hardware</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.Sketch#getLoop <em>Loop</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.arduino.ArduinoPackage#getSketch()
 * @model
 * @generated
 */
public interface Sketch extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Hardware</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware</em>' reference.
	 * @see #setHardware(Hardware)
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getSketch_Hardware()
	 * @model required="true"
	 * @generated
	 */
	Hardware getHardware();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.Sketch#getHardware <em>Hardware</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware</em>' reference.
	 * @see #getHardware()
	 * @generated
	 */
	void setHardware(Hardware value);

	/**
	 * Returns the value of the '<em><b>Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop</em>' containment reference.
	 * @see #setLoop(Loop)
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getSketch_Loop()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Loop getLoop();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.Sketch#getLoop <em>Loop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop</em>' containment reference.
	 * @see #getLoop()
	 * @generated
	 */
	void setLoop(Loop value);

} // Sketch