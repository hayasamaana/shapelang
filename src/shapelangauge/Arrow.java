/**
 */
package shapelangauge;




/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shapelangauge.Arrow#getTarget <em>Target</em>}</li>
 *   <li>{@link shapelangauge.Arrow#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see shapelangauge.ShapelangaugePackage#getArrow()
 * @model
 * @generated
 */
public interface Arrow extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link shapelangauge.Shape#getInArrow <em>In Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Shape)
	 * @see shapelangauge.ShapelangaugePackage#getArrow_Target()
	 * @see shapelangauge.Shape#getInArrow
	 * @model opposite="inArrow"
	 * @generated
	 */
	Shape getTarget();

	/**
	 * Sets the value of the '{@link shapelangauge.Arrow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Shape value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link shapelangauge.Shape#getOutArrow <em>Out Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Shape)
	 * @see shapelangauge.ShapelangaugePackage#getArrow_Source()
	 * @see shapelangauge.Shape#getOutArrow
	 * @model opposite="outArrow"
	 * @generated
	 */
	Shape getSource();

	/**
	 * Sets the value of the '{@link shapelangauge.Arrow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Shape value);

} // Arrow
