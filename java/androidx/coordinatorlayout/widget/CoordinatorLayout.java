package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.carwizard.p075li.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p000A.AbstractC0000a;
import p008C1.C0080l;
import p009D.AbstractC0096b;
import p025J.C0219b;
import p028K.AbstractC0270C;
import p028K.AbstractC0272E;
import p028K.AbstractC0283P;
import p028K.C0323p;
import p028K.C0340x0;
import p028K.InterfaceC0319n;
import p028K.InterfaceC0321o;
import p054S1.C0509h;
import p104l.C2579j;
import p112o.C2691k;
import p135w.AbstractC2876a;
import p138x.AbstractC2879a;
import p138x.AbstractC2885g;
import p138x.C2882d;
import p138x.C2884f;
import p138x.InterfaceC2880b;
import p138x.ViewGroupOnHierarchyChangeListenerC2881c;
import p138x.ViewTreeObserverOnPreDrawListenerC2883e;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0319n, InterfaceC0321o {

    /* renamed from: t */
    public static final String f1986t;

    /* renamed from: u */
    public static final Class[] f1987u;

    /* renamed from: v */
    public static final ThreadLocal f1988v;

    /* renamed from: w */
    public static final C0509h f1989w;

    /* renamed from: x */
    public static final C0219b f1990x;

    /* renamed from: a */
    public final ArrayList f1991a;

    /* renamed from: b */
    public final C0080l f1992b;

    /* renamed from: c */
    public final ArrayList f1993c;

    /* renamed from: d */
    public final ArrayList f1994d;

    /* renamed from: e */
    public final int[] f1995e;

    /* renamed from: f */
    public final int[] f1996f;

    /* renamed from: g */
    public boolean f1997g;

    /* renamed from: h */
    public boolean f1998h;

    /* renamed from: i */
    public final int[] f1999i;

    /* renamed from: j */
    public View f2000j;

    /* renamed from: k */
    public View f2001k;

    /* renamed from: l */
    public ViewTreeObserverOnPreDrawListenerC2883e f2002l;

    /* renamed from: m */
    public boolean f2003m;

    /* renamed from: n */
    public C0340x0 f2004n;

    /* renamed from: o */
    public boolean f2005o;

    /* renamed from: p */
    public Drawable f2006p;

    /* renamed from: q */
    public ViewGroup.OnHierarchyChangeListener f2007q;

    /* renamed from: r */
    public C2579j f2008r;

    /* renamed from: s */
    public final C0323p f2009s;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f1986t = r02 != null ? r02.getName() : null;
        f1989w = new C0509h(4);
        f1987u = new Class[]{Context.class, AttributeSet.class};
        f1988v = new ThreadLocal();
        f1990x = new C0219b();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f1991a = new ArrayList();
        this.f1992b = new C0080l(4);
        this.f1993c = new ArrayList();
        this.f1994d = new ArrayList();
        this.f1995e = new int[2];
        this.f1996f = new int[2];
        this.f2009s = new C0323p();
        int[] r2 = AbstractC2876a.f9487a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r2, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, r2, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f1999i = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int r3 = 0; r3 < length; r3++) {
                this.f1999i[r3] = (int) (r2[r3] * f);
            }
        }
        this.f2006p = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        m1585w();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC2881c(this));
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: g */
    public static Rect m1569g() {
        Rect rect = (Rect) f1990x.mo608a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: l */
    public static void m1570l(int r6, Rect rect, Rect rect2, C2882d c2882d, int r10, int r11) {
        int r02 = c2882d.f9492c;
        if (r02 == 0) {
            r02 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(r02, r6);
        int r9 = c2882d.f9493d;
        if ((r9 & 7) == 0) {
            r9 |= 8388611;
        }
        if ((r9 & 112) == 0) {
            r9 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(r9, r6);
        int r92 = absoluteGravity & 7;
        int r03 = absoluteGravity & 112;
        int r12 = absoluteGravity2 & 7;
        int r62 = absoluteGravity2 & 112;
        int width = r12 != 1 ? r12 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = r62 != 16 ? r62 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (r92 == 1) {
            width -= r10 / 2;
        } else if (r92 != 5) {
            width -= r10;
        }
        if (r03 == 16) {
            height -= r11 / 2;
        } else if (r03 != 80) {
            height -= r11;
        }
        rect2.set(width, height, r10 + width, r11 + height);
    }

    /* renamed from: n */
    public static C2882d m1571n(View view) {
        C2882d c2882d = (C2882d) view.getLayoutParams();
        if (!c2882d.f9491b) {
            InterfaceC2880b interfaceC2880b = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                interfaceC2880b = (InterfaceC2880b) cls.getAnnotation(InterfaceC2880b.class);
                if (interfaceC2880b != null) {
                    break;
                }
            }
            if (interfaceC2880b != null) {
                try {
                    AbstractC2879a abstractC2879a = (AbstractC2879a) interfaceC2880b.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC2879a abstractC2879a2 = c2882d.f9490a;
                    if (abstractC2879a2 != abstractC2879a) {
                        if (abstractC2879a2 != null) {
                            abstractC2879a2.mo2069e();
                        }
                        c2882d.f9490a = abstractC2879a;
                        c2882d.f9491b = true;
                        if (abstractC2879a != null) {
                            abstractC2879a.mo2068c(c2882d);
                        }
                    }
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC2880b.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            c2882d.f9491b = true;
        }
        return c2882d;
    }

    /* renamed from: u */
    public static void m1572u(View view, int r4) {
        C2882d c2882d = (C2882d) view.getLayoutParams();
        int r12 = c2882d.f9498i;
        if (r12 != r4) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            view.offsetLeftAndRight(r4 - r12);
            c2882d.f9498i = r4;
        }
    }

    /* renamed from: v */
    public static void m1573v(View view, int r4) {
        C2882d c2882d = (C2882d) view.getLayoutParams();
        int r12 = c2882d.f9499j;
        if (r12 != r4) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            view.offsetTopAndBottom(r4 - r12);
            c2882d.f9499j = r4;
        }
    }

    @Override // p028K.InterfaceC0319n
    /* renamed from: a */
    public final void mo933a(View view, View view2, int r4, int r5) {
        C0323p c0323p = this.f2009s;
        if (r5 == 1) {
            c0323p.f914b = r4;
        } else {
            c0323p.f913a = r4;
        }
        this.f2001k = view2;
        int childCount = getChildCount();
        for (int r3 = 0; r3 < childCount; r3++) {
            ((C2882d) getChildAt(r3).getLayoutParams()).getClass();
        }
    }

    @Override // p028K.InterfaceC0319n
    /* renamed from: b */
    public final void mo934b(View view, int r9) {
        C0323p c0323p = this.f2009s;
        if (r9 == 1) {
            c0323p.f914b = 0;
        } else {
            c0323p.f913a = 0;
        }
        int childCount = getChildCount();
        for (int r3 = 0; r3 < childCount; r3++) {
            View childAt = getChildAt(r3);
            C2882d c2882d = (C2882d) childAt.getLayoutParams();
            if (c2882d.m5479a(r9)) {
                AbstractC2879a abstractC2879a = c2882d.f9490a;
                if (abstractC2879a != null) {
                    abstractC2879a.mo2049p(childAt, view, r9);
                }
                if (r9 == 0) {
                    c2882d.f9502m = false;
                } else if (r9 == 1) {
                    c2882d.f9503n = false;
                }
            }
        }
        this.f2001k = null;
    }

    @Override // p028K.InterfaceC0319n
    /* renamed from: c */
    public final void mo935c(View view, int r19, int r20, int[] r21, int r22) {
        AbstractC2879a abstractC2879a;
        int childCount = getChildCount();
        boolean z2 = false;
        int r12 = 0;
        int r13 = 0;
        for (int r11 = 0; r11 < childCount; r11++) {
            View childAt = getChildAt(r11);
            if (childAt.getVisibility() != 8) {
                C2882d c2882d = (C2882d) childAt.getLayoutParams();
                if (c2882d.m5479a(r22) && (abstractC2879a = c2882d.f9490a) != null) {
                    int[] r7 = this.f1995e;
                    r7[0] = 0;
                    r7[1] = 0;
                    abstractC2879a.mo2044j(this, childAt, view, r19, r20, r7, r22);
                    r12 = r19 > 0 ? Math.max(r12, r7[0]) : Math.min(r12, r7[0]);
                    r13 = r20 > 0 ? Math.max(r13, r7[1]) : Math.min(r13, r7[1]);
                    z2 = true;
                }
            }
        }
        r21[0] = r12;
        r21[1] = r13;
        if (z2) {
            m1580p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C2882d) && super.checkLayoutParams(layoutParams);
    }

    @Override // p028K.InterfaceC0321o
    /* renamed from: d */
    public final void mo941d(View view, int r18, int r19, int r20, int r21, int r22, int[] r23) {
        AbstractC2879a abstractC2879a;
        int childCount = getChildCount();
        boolean z2 = false;
        int r11 = 0;
        int r12 = 0;
        for (int r10 = 0; r10 < childCount; r10++) {
            View childAt = getChildAt(r10);
            if (childAt.getVisibility() != 8) {
                C2882d c2882d = (C2882d) childAt.getLayoutParams();
                if (c2882d.m5479a(r22) && (abstractC2879a = c2882d.f9490a) != null) {
                    int[] r15 = this.f1995e;
                    r15[0] = 0;
                    r15[1] = 0;
                    abstractC2879a.mo2045k(this, childAt, r19, r20, r21, r15);
                    r11 = r20 > 0 ? Math.max(r11, r15[0]) : Math.min(r11, r15[0]);
                    r12 = r21 > 0 ? Math.max(r12, r15[1]) : Math.min(r12, r15[1]);
                    z2 = true;
                }
            }
        }
        r23[0] = r23[0] + r11;
        r23[1] = r23[1] + r12;
        if (z2) {
            m1580p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        AbstractC2879a abstractC2879a = ((C2882d) view.getLayoutParams()).f9490a;
        if (abstractC2879a != null) {
            abstractC2879a.getClass();
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2006p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p028K.InterfaceC0319n
    /* renamed from: e */
    public final void mo936e(View view, int r10, int r11, int r12, int r13, int r14) {
        mo941d(view, r10, r11, r12, r13, 0, this.f1996f);
    }

    @Override // p028K.InterfaceC0319n
    /* renamed from: f */
    public final boolean mo937f(View view, View view2, int r9, int r10) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int r02 = 0; r02 < childCount; r02++) {
            View childAt = getChildAt(r02);
            if (childAt.getVisibility() != 8) {
                C2882d c2882d = (C2882d) childAt.getLayoutParams();
                AbstractC2879a abstractC2879a = c2882d.f9490a;
                if (abstractC2879a != null) {
                    boolean mo2048o = abstractC2879a.mo2048o(childAt, r9, r10);
                    z2 |= mo2048o;
                    if (r10 == 0) {
                        c2882d.f9502m = mo2048o;
                    } else if (r10 == 1) {
                        c2882d.f9503n = mo2048o;
                    }
                } else if (r10 == 0) {
                    c2882d.f9502m = false;
                } else if (r10 == 1) {
                    c2882d.f9503n = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2882d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2882d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m1583s();
        return Collections.unmodifiableList(this.f1991a);
    }

    public final C0340x0 getLastWindowInsets() {
        return this.f2004n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0323p c0323p = this.f2009s;
        return c0323p.f914b | c0323p.f913a;
    }

    public Drawable getStatusBarBackground() {
        return this.f2006p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* renamed from: h */
    public final void m1574h(C2882d c2882d, Rect rect, int r8, int r9) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c2882d).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - r8) - ((ViewGroup.MarginLayoutParams) c2882d).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c2882d).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - r9) - ((ViewGroup.MarginLayoutParams) c2882d).bottomMargin));
        rect.set(max, max2, r8 + max, r9 + max2);
    }

    /* renamed from: i */
    public final void m1575i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            m1577k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: j */
    public final ArrayList m1576j(View view) {
        C2691k c2691k = (C2691k) this.f1992b.f220b;
        int r12 = c2691k.f8683c;
        ArrayList arrayList = null;
        for (int r3 = 0; r3 < r12; r3++) {
            ArrayList arrayList2 = (ArrayList) c2691k.m5181j(r3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c2691k.m5179h(r3));
            }
        }
        ArrayList arrayList3 = this.f1994d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* renamed from: k */
    public final void m1577k(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC2885g.f9507a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC2885g.f9507a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC2885g.m5480a(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC2885g.f9508b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: m */
    public final int m1578m(int r5) {
        int[] r2 = this.f1999i;
        if (r2 == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + r5);
            return 0;
        }
        if (r5 >= 0 && r5 < r2.length) {
            return r2[r5];
        }
        Log.e("CoordinatorLayout", "Keyline index " + r5 + " out of range for " + this);
        return 0;
    }

    /* renamed from: o */
    public final boolean m1579o(View view, int r4, int r5) {
        C0219b c0219b = f1990x;
        Rect m1569g = m1569g();
        m1577k(view, m1569g);
        try {
            return m1569g.contains(r4, r5);
        } finally {
            m1569g.setEmpty();
            c0219b.mo610c(m1569g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1584t(false);
        if (this.f2003m) {
            if (this.f2002l == null) {
                this.f2002l = new ViewTreeObserverOnPreDrawListenerC2883e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2002l);
        }
        if (this.f2004n == null) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            if (getFitsSystemWindows()) {
                AbstractC0270C.m696c(this);
            }
        }
        this.f1998h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1584t(false);
        if (this.f2003m && this.f2002l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2002l);
        }
        View view = this.f2001k;
        if (view != null) {
            mo934b(view, 0);
        }
        this.f1998h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2005o || this.f2006p == null) {
            return;
        }
        C0340x0 c0340x0 = this.f2004n;
        int m979d = c0340x0 != null ? c0340x0.m979d() : 0;
        if (m979d > 0) {
            this.f2006p.setBounds(0, 0, getWidth(), m979d);
            this.f2006p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1584t(true);
        }
        boolean m1582r = m1582r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1584t(true);
        }
        return m1582r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int r4, int r5, int r6, int r7) {
        AbstractC2879a abstractC2879a;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f1991a;
        int size = arrayList.size();
        for (int r62 = 0; r62 < size; r62++) {
            View view = (View) arrayList.get(r62);
            if (view.getVisibility() != 8 && ((abstractC2879a = ((C2882d) view.getLayoutParams()).f9490a) == null || !abstractC2879a.mo1047g(this, view, layoutDirection))) {
                m1581q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0186, code lost:
    
        if (r0.mo2043h(r32, r20, r25, r8, r26) == false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        int childCount = getChildCount();
        for (int r5 = 0; r5 < childCount; r5++) {
            View childAt = getChildAt(r5);
            if (childAt.getVisibility() != 8) {
                C2882d c2882d = (C2882d) childAt.getLayoutParams();
                if (c2882d.m5479a(0)) {
                    AbstractC2879a abstractC2879a = c2882d.f9490a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC2879a abstractC2879a;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int r02 = 0; r02 < childCount; r02++) {
            View childAt = getChildAt(r02);
            if (childAt.getVisibility() != 8) {
                C2882d c2882d = (C2882d) childAt.getLayoutParams();
                if (c2882d.m5479a(0) && (abstractC2879a = c2882d.f9490a) != null) {
                    z2 |= abstractC2879a.mo2070i(view);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int r8, int r9, int[] r10) {
        mo935c(view, r8, r9, r10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int r9, int r10, int r11, int r12) {
        mo936e(view, r9, r10, r11, r12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int r4) {
        mo933a(view, view2, r4, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C2884f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2884f c2884f = (C2884f) parcelable;
        super.onRestoreInstanceState(c2884f.f1263a);
        SparseArray sparseArray = c2884f.f9506c;
        int childCount = getChildCount();
        for (int r12 = 0; r12 < childCount; r12++) {
            View childAt = getChildAt(r12);
            int id = childAt.getId();
            AbstractC2879a abstractC2879a = m1571n(childAt).f9490a;
            if (id != -1 && abstractC2879a != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC2879a.mo2046m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable mo2047n;
        C2884f c2884f = new C2884f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int r3 = 0; r3 < childCount; r3++) {
            View childAt = getChildAt(r3);
            int id = childAt.getId();
            AbstractC2879a abstractC2879a = ((C2882d) childAt.getLayoutParams()).f9490a;
            if (id != -1 && abstractC2879a != null && (mo2047n = abstractC2879a.mo2047n(childAt)) != null) {
                sparseArray.append(id, mo2047n);
            }
        }
        c2884f.f9506c = sparseArray;
        return c2884f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int r4) {
        return mo937f(view, view2, r4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo934b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2000j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.m1582r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f2000j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            x.d r6 = (p138x.C2882d) r6
            x.a r6 = r6.f9490a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f2000j
            boolean r6 = r6.mo2050q(r7, r1)
        L2a:
            android.view.View r7 = r0.f2000j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.m1584t(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x004b A[EDGE_INSN: B:114:0x004b->B:9:0x004b BREAK  A[LOOP:2: B:106:0x02db->B:112:0x02f2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d4  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1580p(int r26) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m1580p(int):void");
    }

    /* renamed from: q */
    public final void m1581q(View view, int r14) {
        Rect m1569g;
        Rect m1569g2;
        C2882d c2882d = (C2882d) view.getLayoutParams();
        View view2 = c2882d.f9500k;
        if (view2 == null && c2882d.f9495f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C0219b c0219b = f1990x;
        if (view2 != null) {
            m1569g = m1569g();
            m1569g2 = m1569g();
            try {
                m1577k(view2, m1569g);
                C2882d c2882d2 = (C2882d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m1570l(r14, m1569g, m1569g2, c2882d2, measuredWidth, measuredHeight);
                m1574h(c2882d2, m1569g2, measuredWidth, measuredHeight);
                view.layout(m1569g2.left, m1569g2.top, m1569g2.right, m1569g2.bottom);
                return;
            } finally {
                m1569g.setEmpty();
                c0219b.mo610c(m1569g);
                m1569g2.setEmpty();
                c0219b.mo610c(m1569g2);
            }
        }
        int r02 = c2882d.f9494e;
        if (r02 < 0) {
            C2882d c2882d3 = (C2882d) view.getLayoutParams();
            m1569g = m1569g();
            m1569g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c2882d3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c2882d3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c2882d3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c2882d3).bottomMargin);
            if (this.f2004n != null) {
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    m1569g.left = this.f2004n.m977b() + m1569g.left;
                    m1569g.top = this.f2004n.m979d() + m1569g.top;
                    m1569g.right -= this.f2004n.m978c();
                    m1569g.bottom -= this.f2004n.m976a();
                }
            }
            m1569g2 = m1569g();
            int r03 = c2882d3.f9492c;
            if ((r03 & 7) == 0) {
                r03 |= 8388611;
            }
            if ((r03 & 112) == 0) {
                r03 |= 48;
            }
            Gravity.apply(r03, view.getMeasuredWidth(), view.getMeasuredHeight(), m1569g, m1569g2, r14);
            view.layout(m1569g2.left, m1569g2.top, m1569g2.right, m1569g2.bottom);
            return;
        }
        C2882d c2882d4 = (C2882d) view.getLayoutParams();
        int r2 = c2882d4.f9492c;
        if (r2 == 0) {
            r2 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(r2, r14);
        int r3 = absoluteGravity & 7;
        int r22 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (r14 == 1) {
            r02 = width - r02;
        }
        int m1578m = m1578m(r02) - measuredWidth2;
        if (r3 == 1) {
            m1578m += measuredWidth2 / 2;
        } else if (r3 == 5) {
            m1578m += measuredWidth2;
        }
        int r04 = r22 != 16 ? r22 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c2882d4).leftMargin, Math.min(m1578m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c2882d4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c2882d4).topMargin, Math.min(r04, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c2882d4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    /* renamed from: r */
    public final boolean m1582r(MotionEvent motionEvent, int r22) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1993c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int r7 = childCount - 1; r7 >= 0; r7--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, r7) : r7));
        }
        C0509h c0509h = f1989w;
        if (c0509h != null) {
            Collections.sort(arrayList, c0509h);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        for (int r6 = 0; r6 < size; r6++) {
            View view = (View) arrayList.get(r6);
            AbstractC2879a abstractC2879a = ((C2882d) view.getLayoutParams()).f9490a;
            if (z2 && actionMasked != 0) {
                if (abstractC2879a != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (r22 == 0) {
                        abstractC2879a.mo2042f(this, view, motionEvent2);
                    } else if (r22 == 1) {
                        abstractC2879a.mo2050q(view, motionEvent2);
                    }
                }
            } else if (!z2 && abstractC2879a != null) {
                if (r22 == 0) {
                    z2 = abstractC2879a.mo2042f(this, view, motionEvent);
                } else if (r22 == 1) {
                    z2 = abstractC2879a.mo2050q(view, motionEvent);
                }
                if (z2) {
                    this.f2000j = view;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        AbstractC2879a abstractC2879a = ((C2882d) view.getLayoutParams()).f9490a;
        if (abstractC2879a != null) {
            abstractC2879a.mo2054l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f1997g) {
            return;
        }
        m1584t(false);
        this.f1997g = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1583s() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m1583s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        m1585w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2007q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f2006p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f2006p = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f2006p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f2006p;
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                AbstractC0096b.m322b(drawable3, getLayoutDirection());
                this.f2006p.setVisible(getVisibility() == 0, false);
                this.f2006p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int r2) {
        setStatusBarBackground(new ColorDrawable(r2));
    }

    public void setStatusBarBackgroundResource(int r2) {
        setStatusBarBackground(r2 != 0 ? AbstractC0000a.m1b(getContext(), r2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
        super.setVisibility(r3);
        boolean z2 = r3 == 0;
        Drawable drawable = this.f2006p;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f2006p.setVisible(z2, false);
    }

    /* renamed from: t */
    public final void m1584t(boolean z2) {
        int childCount = getChildCount();
        for (int r2 = 0; r2 < childCount; r2++) {
            View childAt = getChildAt(r2);
            AbstractC2879a abstractC2879a = ((C2882d) childAt.getLayoutParams()).f9490a;
            if (abstractC2879a != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    abstractC2879a.mo2042f(this, childAt, obtain);
                } else {
                    abstractC2879a.mo2050q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int r14 = 0; r14 < childCount; r14++) {
            ((C2882d) getChildAt(r14).getLayoutParams()).getClass();
        }
        this.f2000j = null;
        this.f1997g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2006p;
    }

    /* renamed from: w */
    public final void m1585w() {
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        if (!getFitsSystemWindows()) {
            AbstractC0272E.m717u(this, null);
            return;
        }
        if (this.f2008r == null) {
            this.f2008r = new C2579j(this);
        }
        AbstractC0272E.m717u(this, this.f2008r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2882d ? new C2882d((C2882d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2882d((ViewGroup.MarginLayoutParams) layoutParams) : new C2882d(layoutParams);
    }
}
