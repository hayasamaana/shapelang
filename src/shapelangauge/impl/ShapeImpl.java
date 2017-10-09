/**
 */
package shapelangauge.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import shapelangauge.Arrow;
import shapelangauge.Shape;
import shapelangauge.ShapelangaugePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link shapelangauge.impl.ShapeImpl#getOutArrow <em>Out Arrow</em>}</li>
 *   <li>{@link shapelangauge.impl.ShapeImpl#getInArrow <em>In Arrow</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ShapeImpl extends ModelElementImpl implements Shape {
	/**
	 * The cached value of the '{@link #getOutArrow() <em>Out Arrow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutArrow()
	 * @generated
	 * @ordered
	 */
	protected EList<Arrow> outArrow;

	/**
	 * The cached value of the '{@link #getInArrow() <em>In Arrow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInArrow()
	 * @generated
	 * @ordered
	 */
	protected EList<Arrow> inArrow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShapelangaugePackage.Literals.SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arrow> getOutArrow() {
		if (outArrow == null) {
			outArrow = new EObjectWithInverseResolvingEList<Arrow>(Arrow.class, this, ShapelangaugePackage.SHAPE__OUT_ARROW, ShapelangaugePackage.ARROW__SOURCE);
		}
		return outArrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arrow> getInArrow() {
		if (inArrow == null) {
			inArrow = new EObjectWithInverseResolvingEList<Arrow>(Arrow.class, this, ShapelangaugePackage.SHAPE__IN_ARROW, ShapelangaugePackage.ARROW__TARGET);
		}
		return inArrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShapelangaugePackage.SHAPE__OUT_ARROW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutArrow()).basicAdd(otherEnd, msgs);
			case ShapelangaugePackage.SHAPE__IN_ARROW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInArrow()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShapelangaugePackage.SHAPE__OUT_ARROW:
				return ((InternalEList<?>)getOutArrow()).basicRemove(otherEnd, msgs);
			case ShapelangaugePackage.SHAPE__IN_ARROW:
				return ((InternalEList<?>)getInArrow()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShapelangaugePackage.SHAPE__OUT_ARROW:
				return getOutArrow();
			case ShapelangaugePackage.SHAPE__IN_ARROW:
				return getInArrow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ShapelangaugePackage.SHAPE__OUT_ARROW:
				getOutArrow().clear();
				getOutArrow().addAll((Collection<? extends Arrow>)newValue);
				return;
			case ShapelangaugePackage.SHAPE__IN_ARROW:
				getInArrow().clear();
				getInArrow().addAll((Collection<? extends Arrow>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ShapelangaugePackage.SHAPE__OUT_ARROW:
				getOutArrow().clear();
				return;
			case ShapelangaugePackage.SHAPE__IN_ARROW:
				getInArrow().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ShapelangaugePackage.SHAPE__OUT_ARROW:
				return outArrow != null && !outArrow.isEmpty();
			case ShapelangaugePackage.SHAPE__IN_ARROW:
				return inArrow != null && !inArrow.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShapeImpl
