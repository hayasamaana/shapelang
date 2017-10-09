/**
 */
package shapelangauge.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import shapelangauge.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShapelangaugeFactoryImpl extends EFactoryImpl implements ShapelangaugeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShapelangaugeFactory init() {
		try {
			ShapelangaugeFactory theShapelangaugeFactory = (ShapelangaugeFactory)EPackage.Registry.INSTANCE.getEFactory(ShapelangaugePackage.eNS_URI);
			if (theShapelangaugeFactory != null) {
				return theShapelangaugeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ShapelangaugeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapelangaugeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ShapelangaugePackage.ROOT_BLOCK: return createRootBlock();
			case ShapelangaugePackage.BLOCK: return createBlock();
			case ShapelangaugePackage.ARROW: return createArrow();
			case ShapelangaugePackage.CIRCLE: return createCircle();
			case ShapelangaugePackage.TRIANGLE: return createTriangle();
			case ShapelangaugePackage.SQAURE: return createSqaure();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootBlock createRootBlock() {
		RootBlockImpl rootBlock = new RootBlockImpl();
		return rootBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arrow createArrow() {
		ArrowImpl arrow = new ArrowImpl();
		return arrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circle createCircle() {
		CircleImpl circle = new CircleImpl();
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triangle createTriangle() {
		TriangleImpl triangle = new TriangleImpl();
		return triangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sqaure createSqaure() {
		SqaureImpl sqaure = new SqaureImpl();
		return sqaure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapelangaugePackage getShapelangaugePackage() {
		return (ShapelangaugePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ShapelangaugePackage getPackage() {
		return ShapelangaugePackage.eINSTANCE;
	}

} //ShapelangaugeFactoryImpl
