/**
 */
package shapelangauge;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shapelangauge.Block#getModelElements <em>Model Elements</em>}</li>
 * </ul>
 *
 * @see shapelangauge.ShapelangaugePackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Shape {
	/**
	 * Returns the value of the '<em><b>Model Elements</b></em>' containment reference list.
	 * The list contents are of type {@link shapelangauge.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Elements</em>' containment reference list.
	 * @see shapelangauge.ShapelangaugePackage#getBlock_ModelElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElement> getModelElements();

} // Block
