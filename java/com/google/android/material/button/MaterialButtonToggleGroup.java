package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.timepicker.C0776f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p006C.C0055g;
import p028K.AbstractC0283P;
import p029K0.AbstractC0345a;
import p047Q0.C0449d;
import p047Q0.C0450e;
import p047Q0.C0451f;
import p065Y0.AbstractC0556k;
import p081e1.C0875a;
import p081e1.C0884j;
import p081e1.C0885k;
import p101j1.AbstractC2447a;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k */
    public static final /* synthetic */ int f2821k = 0;

    /* renamed from: a */
    public final ArrayList f2822a;

    /* renamed from: b */
    public final C0055g f2823b;

    /* renamed from: c */
    public final LinkedHashSet f2824c;

    /* renamed from: d */
    public final C0449d f2825d;

    /* renamed from: e */
    public Integer[] f2826e;

    /* renamed from: f */
    public boolean f2827f;

    /* renamed from: g */
    public boolean f2828g;

    /* renamed from: h */
    public boolean f2829h;

    /* renamed from: i */
    public final int f2830i;

    /* renamed from: j */
    public HashSet f2831j;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC2447a.m4797a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f2822a = new ArrayList();
        this.f2823b = new C0055g(13, this);
        this.f2824c = new LinkedHashSet();
        this.f2825d = new C0449d(this);
        this.f2827f = false;
        this.f2831j = new HashSet();
        TypedArray m1412f = AbstractC0556k.m1412f(getContext(), attributeSet, AbstractC0345a.f959k, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(m1412f.getBoolean(3, false));
        this.f2830i = m1412f.getResourceId(1, -1);
        this.f2829h = m1412f.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(m1412f.getBoolean(0, true));
        m1412f.recycle();
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int r12 = 0; r12 < childCount; r12++) {
            if (m2085c(r12)) {
                return r12;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m2085c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int r12 = 0;
        for (int r02 = 0; r02 < getChildCount(); r02++) {
            if ((getChildAt(r02) instanceof MaterialButton) && m2085c(r02)) {
                r12++;
            }
        }
        return r12;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f2823b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: a */
    public final void m2083a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int r2 = firstVisibleChildIndex + 1; r2 < getChildCount(); r2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(r2);
            int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(r2 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int r6, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, r6, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m2084b(materialButton.getId(), materialButton.f2818o);
        C0885k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f2822a.add(new C0451f(shapeAppearanceModel.f3698e, shapeAppearanceModel.f3701h, shapeAppearanceModel.f3699f, shapeAppearanceModel.f3700g));
        materialButton.setEnabled(isEnabled());
        AbstractC0283P.m779l(materialButton, new C0450e(0, this));
    }

    /* renamed from: b */
    public final void m2084b(int r3, boolean z2) {
        if (r3 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + r3);
            return;
        }
        HashSet hashSet = new HashSet(this.f2831j);
        if (z2 && !hashSet.contains(Integer.valueOf(r3))) {
            if (this.f2828g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(r3));
        } else {
            if (z2 || !hashSet.contains(Integer.valueOf(r3))) {
                return;
            }
            if (!this.f2829h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(r3));
            }
        }
        m2086d(hashSet);
    }

    /* renamed from: c */
    public final boolean m2085c(int r2) {
        return getChildAt(r2).getVisibility() != 8;
    }

    /* renamed from: d */
    public final void m2086d(Set set) {
        HashSet hashSet = this.f2831j;
        this.f2831j = new HashSet(set);
        for (int r2 = 0; r2 < getChildCount(); r2++) {
            int id = ((MaterialButton) getChildAt(r2)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f2827f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f2827f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f2824c.iterator();
                while (it.hasNext()) {
                    ((C0776f) it.next()).m2165a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f2825d);
        int childCount = getChildCount();
        for (int r3 = 0; r3 < childCount; r3++) {
            treeMap.put((MaterialButton) getChildAt(r3), Integer.valueOf(r3));
        }
        this.f2826e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public final void m2087e() {
        C0451f c0451f;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int r4 = 0; r4 < childCount; r4++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(r4);
            if (materialButton.getVisibility() != 8) {
                C0884j m2417e = materialButton.getShapeAppearanceModel().m2417e();
                C0451f c0451f2 = (C0451f) this.f2822a.get(r4);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z2 = getOrientation() == 0;
                    C0875a c0875a = C0451f.f1159e;
                    if (r4 == firstVisibleChildIndex) {
                        c0451f = z2 ? AbstractC0556k.m1411e(this) ? new C0451f(c0875a, c0875a, c0451f2.f1161b, c0451f2.f1162c) : new C0451f(c0451f2.f1160a, c0451f2.f1163d, c0875a, c0875a) : new C0451f(c0451f2.f1160a, c0875a, c0451f2.f1161b, c0875a);
                    } else if (r4 == lastVisibleChildIndex) {
                        c0451f = z2 ? AbstractC0556k.m1411e(this) ? new C0451f(c0451f2.f1160a, c0451f2.f1163d, c0875a, c0875a) : new C0451f(c0875a, c0875a, c0451f2.f1161b, c0451f2.f1162c) : new C0451f(c0875a, c0451f2.f1163d, c0875a, c0451f2.f1162c);
                    } else {
                        c0451f2 = null;
                    }
                    c0451f2 = c0451f;
                }
                if (c0451f2 == null) {
                    m2417e.f3686e = new C0875a(0.0f);
                    m2417e.f3687f = new C0875a(0.0f);
                    m2417e.f3688g = new C0875a(0.0f);
                    m2417e.f3689h = new C0875a(0.0f);
                } else {
                    m2417e.f3686e = c0451f2.f1160a;
                    m2417e.f3689h = c0451f2.f1163d;
                    m2417e.f3687f = c0451f2.f1161b;
                    m2417e.f3688g = c0451f2.f1162c;
                }
                materialButton.setShapeAppearanceModel(m2417e.m2412a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f2828g || this.f2831j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f2831j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int r12 = 0; r12 < getChildCount(); r12++) {
            int id = ((MaterialButton) getChildAt(r12)).getId();
            if (this.f2831j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int r2, int r3) {
        Integer[] numArr = this.f2826e;
        if (numArr != null && r3 < numArr.length) {
            return numArr[r3].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return r3;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int r12 = this.f2830i;
        if (r12 != -1) {
            m2086d(Collections.singleton(Integer.valueOf(r12)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f2828g ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r12, int r2) {
        m2087e();
        m2083a();
        super.onMeasure(r12, r2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f2822a.remove(indexOfChild);
        }
        m2087e();
        m2083a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int r02 = 0; r02 < getChildCount(); r02++) {
            ((MaterialButton) getChildAt(r02)).setEnabled(z2);
        }
    }

    public void setSelectionRequired(boolean z2) {
        this.f2829h = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.f2828g != z2) {
            this.f2828g = z2;
            m2086d(new HashSet());
        }
        for (int r3 = 0; r3 < getChildCount(); r3++) {
            ((MaterialButton) getChildAt(r3)).setA11yClassName((this.f2828g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int r2) {
        setSingleSelection(getResources().getBoolean(r2));
    }
}
