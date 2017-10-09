/**
 */
package shapelangauge;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shapelangauge.Shape#getOutArrow <em>Out Arrow</em>}</li>
 *   <li>{@link shapelangauge.Shape#getInArrow <em>In Arrow</em>}</li>
 * </ul>
 *
 * @see shapelangauge.ShapelangaugePackage#getShape()
 * @model abstract="true"
 * @generated
 */
public interface Shape extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Out Arrow</b></em>' reference list.
	 * The list contents are of type {@link shapelangauge.Arrow}.
	 * It is bidirectional and its opposite is '{@link shapelangauge.Arrow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Arrow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Arrow</em>' reference list.
	 * @see shapelangauge.ShapelangaugePackage#getShape_OutArrow()
	 * @see shapelangauge.Arrow#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Arrow> getOutArrow();

	/**
	 * Returns the value of the '<em><b>In Arrow</b></em>' reference list.
	 * The list contents are of type {@link shapelangauge.Arrow}.
	 * It is bidirectional and its opposite is '{@link shapelangauge.Arrow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Arrow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Arrow</em>' reference list.
	 * @see shapelangauge.ShapelangaugePackage#getShape_InArrow()
	 * @see shapelangauge.Arrow#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Arrow> getInArrow();

} // Shape
