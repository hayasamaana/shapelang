/**
 */
package shapelangauge;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see shapelangauge.ShapelangaugeFactory
 * @model kind="package"
 * @generated
 */
public interface ShapelangaugePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "shapelangauge";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://shapelanguage.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "shapelanguage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShapelangaugePackage eINSTANCE = shapelangauge.impl.ShapelangaugePackageImpl.init();

	/**
	 * The meta object id for the '{@link shapelangauge.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shapelangauge.impl.ModelElementImpl
	 * @see shapelangauge.impl.ShapelangaugePackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shapelangauge.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shapelangauge.impl.ShapeImpl
	 * @see shapelangauge.impl.ShapelangaugePackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__OUT_ARROW = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__IN_ARROW = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shapelangauge.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shapelangauge.impl.BlockImpl
	 * @see shapelangauge.impl.ShapelangaugePackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OUT_ARROW = SHAPE__OUT_ARROW;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__IN_ARROW = SHAPE__IN_ARROW;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__MODEL_ELEMENTS = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shapelangauge.impl.RootBlockImpl <em>Root Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shapelangauge.impl.RootBlockImpl
	 * @see shapelangauge.impl.ShapelangaugePackageImpl#getRootBlock()
	 * @generated
	 */
	int ROOT_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BLOCK__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BLOCK__OUT_ARROW = BLOCK__OUT_ARROW;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BLOCK__IN_ARROW = BLOCK__IN_ARROW;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BLOCK__MODEL_ELEMENTS = BLOCK__MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Root Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shapelangauge.impl.SimpleClassImpl <em>Simple Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shapelangauge.impl.SimpleClassImpl
	 * @see shapelangauge.impl.ShapelangaugePackageImpl#getSimpleClass()
	 * @generated
	 */
	int SIMPLE_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS__OUT_ARROW = SHAPE__OUT_ARROW;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS__IN_ARROW = SHAPE__IN_ARROW;

	/**
	 * The number of structural features of the '<em>Simple Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shapelangauge.impl.ArrowImpl <em>Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shapelangauge.impl.ArrowImpl
	 * @see shapelangauge.impl.ShapelangaugePackageImpl#getArrow()
	 * @generated
	 */
	int ARROW = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__TARGET = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__SOURCE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shapelangauge.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shapelangauge.impl.CircleImpl
	 * @see shapelangauge.impl.ShapelangaugePackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__NAME = SIMPLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__OUT_ARROW = SIMPLE_CLASS__OUT_ARROW;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__IN_ARROW = SIMPLE_CLASS__IN_ARROW;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = SIMPLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_OPERATION_COUNT = SIMPLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shapelangauge.impl.TriangleImpl <em>Triangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shapelangauge.impl.TriangleImpl
	 * @see shapelangauge.impl.ShapelangaugePackageImpl#getTriangle()
	 * @generated
	 */
	int TRIANGLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__NAME = SIMPLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__OUT_ARROW = SIMPLE_CLASS__OUT_ARROW;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__IN_ARROW = SIMPLE_CLASS__IN_ARROW;

	/**
	 * The number of structural features of the '<em>Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_FEATURE_COUNT = SIMPLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_OPERATION_COUNT = SIMPLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shapelangauge.impl.SqaureImpl <em>Sqaure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shapelangauge.impl.SqaureImpl
	 * @see shapelangauge.impl.ShapelangaugePackageImpl#getSqaure()
	 * @generated
	 */
	int SQAURE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQAURE__NAME = SIMPLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQAURE__OUT_ARROW = SIMPLE_CLASS__OUT_ARROW;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQAURE__IN_ARROW = SIMPLE_CLASS__IN_ARROW;

	/**
	 * The number of structural features of the '<em>Sqaure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQAURE_FEATURE_COUNT = SIMPLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sqaure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQAURE_OPERATION_COUNT = SIMPLE_CLASS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link shapelangauge.RootBlock <em>Root Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Block</em>'.
	 * @see shapelangauge.RootBlock
	 * @generated
	 */
	EClass getRootBlock();

	/**
	 * Returns the meta object for class '{@link shapelangauge.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see shapelangauge.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link shapelangauge.Block#getModelElements <em>Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Elements</em>'.
	 * @see shapelangauge.Block#getModelElements()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_ModelElements();

	/**
	 * Returns the meta object for class '{@link shapelangauge.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see shapelangauge.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link shapelangauge.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shapelangauge.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for class '{@link shapelangauge.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see shapelangauge.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the reference list '{@link shapelangauge.Shape#getOutArrow <em>Out Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Arrow</em>'.
	 * @see shapelangauge.Shape#getOutArrow()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_OutArrow();

	/**
	 * Returns the meta object for the reference list '{@link shapelangauge.Shape#getInArrow <em>In Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Arrow</em>'.
	 * @see shapelangauge.Shape#getInArrow()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_InArrow();

	/**
	 * Returns the meta object for class '{@link shapelangauge.SimpleClass <em>Simple Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Class</em>'.
	 * @see shapelangauge.SimpleClass
	 * @generated
	 */
	EClass getSimpleClass();

	/**
	 * Returns the meta object for class '{@link shapelangauge.Arrow <em>Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrow</em>'.
	 * @see shapelangauge.Arrow
	 * @generated
	 */
	EClass getArrow();

	/**
	 * Returns the meta object for the reference '{@link shapelangauge.Arrow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see shapelangauge.Arrow#getTarget()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_Target();

	/**
	 * Returns the meta object for the reference '{@link shapelangauge.Arrow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see shapelangauge.Arrow#getSource()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_Source();

	/**
	 * Returns the meta object for class '{@link shapelangauge.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see shapelangauge.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for class '{@link shapelangauge.Triangle <em>Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangle</em>'.
	 * @see shapelangauge.Triangle
	 * @generated
	 */
	EClass getTriangle();

	/**
	 * Returns the meta object for class '{@link shapelangauge.Sqaure <em>Sqaure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqaure</em>'.
	 * @see shapelangauge.Sqaure
	 * @generated
	 */
	EClass getSqaure();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShapelangaugeFactory getShapelangaugeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link shapelangauge.impl.RootBlockImpl <em>Root Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shapelangauge.impl.RootBlockImpl
		 * @see shapelangauge.impl.ShapelangaugePackageImpl#getRootBlock()
		 * @generated
		 */
		EClass ROOT_BLOCK = eINSTANCE.getRootBlock();

		/**
		 * The meta object literal for the '{@link shapelangauge.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shapelangauge.impl.BlockImpl
		 * @see shapelangauge.impl.ShapelangaugePackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__MODEL_ELEMENTS = eINSTANCE.getBlock_ModelElements();

		/**
		 * The meta object literal for the '{@link shapelangauge.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shapelangauge.impl.ModelElementImpl
		 * @see shapelangauge.impl.ShapelangaugePackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '{@link shapelangauge.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shapelangauge.impl.ShapeImpl
		 * @see shapelangauge.impl.ShapelangaugePackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Out Arrow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__OUT_ARROW = eINSTANCE.getShape_OutArrow();

		/**
		 * The meta object literal for the '<em><b>In Arrow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__IN_ARROW = eINSTANCE.getShape_InArrow();

		/**
		 * The meta object literal for the '{@link shapelangauge.impl.SimpleClassImpl <em>Simple Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shapelangauge.impl.SimpleClassImpl
		 * @see shapelangauge.impl.ShapelangaugePackageImpl#getSimpleClass()
		 * @generated
		 */
		EClass SIMPLE_CLASS = eINSTANCE.getSimpleClass();

		/**
		 * The meta object literal for the '{@link shapelangauge.impl.ArrowImpl <em>Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shapelangauge.impl.ArrowImpl
		 * @see shapelangauge.impl.ShapelangaugePackageImpl#getArrow()
		 * @generated
		 */
		EClass ARROW = eINSTANCE.getArrow();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__TARGET = eINSTANCE.getArrow_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__SOURCE = eINSTANCE.getArrow_Source();

		/**
		 * The meta object literal for the '{@link shapelangauge.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shapelangauge.impl.CircleImpl
		 * @see shapelangauge.impl.ShapelangaugePackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '{@link shapelangauge.impl.TriangleImpl <em>Triangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shapelangauge.impl.TriangleImpl
		 * @see shapelangauge.impl.ShapelangaugePackageImpl#getTriangle()
		 * @generated
		 */
		EClass TRIANGLE = eINSTANCE.getTriangle();

		/**
		 * The meta object literal for the '{@link shapelangauge.impl.SqaureImpl <em>Sqaure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shapelangauge.impl.SqaureImpl
		 * @see shapelangauge.impl.ShapelangaugePackageImpl#getSqaure()
		 * @generated
		 */
		EClass SQAURE = eINSTANCE.getSqaure();

	}

} //ShapelangaugePackage
