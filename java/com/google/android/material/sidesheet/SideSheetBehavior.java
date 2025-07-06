package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p003B.RunnableC0041o;
import p028K.AbstractC0272E;
import p028K.AbstractC0283P;
import p029K0.AbstractC0345a;
import p031L.C0351e;
import p031L.InterfaceC0366t;
import p034M.AbstractC0372a;
import p036M1.AbstractC0387m;
import p044P0.C0419c;
import p044P0.C0422f;
import p055T.C0516e;
import p081e1.C0875a;
import p081e1.C0881g;
import p081e1.C0884j;
import p081e1.C0885k;
import p083f1.C0902a;
import p083f1.C0904c;
import p103k0.AbstractC2480a;
import p138x.AbstractC2879a;
import p138x.C2882d;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC2879a {

    /* renamed from: a */
    public AbstractC2480a f2964a;

    /* renamed from: b */
    public final C0881g f2965b;

    /* renamed from: c */
    public final ColorStateList f2966c;

    /* renamed from: d */
    public final C0885k f2967d;

    /* renamed from: e */
    public final C0422f f2968e;

    /* renamed from: f */
    public final float f2969f;

    /* renamed from: g */
    public final boolean f2970g;

    /* renamed from: h */
    public int f2971h;

    /* renamed from: i */
    public C0516e f2972i;

    /* renamed from: j */
    public boolean f2973j;

    /* renamed from: k */
    public final float f2974k;

    /* renamed from: l */
    public int f2975l;

    /* renamed from: m */
    public int f2976m;

    /* renamed from: n */
    public int f2977n;

    /* renamed from: o */
    public int f2978o;

    /* renamed from: p */
    public WeakReference f2979p;

    /* renamed from: q */
    public WeakReference f2980q;

    /* renamed from: r */
    public final int f2981r;

    /* renamed from: s */
    public VelocityTracker f2982s;

    /* renamed from: t */
    public int f2983t;

    /* renamed from: u */
    public final LinkedHashSet f2984u;

    /* renamed from: v */
    public final C0419c f2985v;

    public SideSheetBehavior() {
        this.f2968e = new C0422f(this);
        this.f2970g = true;
        this.f2971h = 5;
        this.f2974k = 0.1f;
        this.f2981r = -1;
        this.f2984u = new LinkedHashSet();
        this.f2985v = new C0419c(this, 1);
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: c */
    public final void mo2068c(C2882d c2882d) {
        this.f2979p = null;
        this.f2972i = null;
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: e */
    public final void mo2069e() {
        this.f2979p = null;
        this.f2972i = null;
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: f */
    public final boolean mo2042f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C0516e c0516e;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC0283P.m771d(view) == null) || !this.f2970g) {
            this.f2973j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f2982s) != null) {
            velocityTracker.recycle();
            this.f2982s = null;
        }
        if (this.f2982s == null) {
            this.f2982s = VelocityTracker.obtain();
        }
        this.f2982s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f2983t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f2973j) {
            this.f2973j = false;
            return false;
        }
        return (this.f2973j || (c0516e = this.f2972i) == null || !c0516e.m1347p(motionEvent)) ? false : true;
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: g */
    public final boolean mo1047g(CoordinatorLayout coordinatorLayout, View view, int r13) {
        View view2;
        View view3;
        int r12;
        View findViewById;
        int r02 = 0;
        int r14 = 1;
        C0881g c0881g = this.f2965b;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2979p == null) {
            this.f2979p = new WeakReference(view);
            Context context = view.getContext();
            AbstractC2480a.m4877R(context, R.attr.motionEasingStandardDecelerateInterpolator, AbstractC0372a.m1045b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC2480a.m4876Q(context, R.attr.motionDurationMedium2, 300);
            AbstractC2480a.m4876Q(context, R.attr.motionDurationShort3, 150);
            AbstractC2480a.m4876Q(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (c0881g != null) {
                view.setBackground(c0881g);
                float f = this.f2969f;
                if (f == -1.0f) {
                    f = AbstractC0272E.m705i(view);
                }
                c0881g.m2406i(f);
            } else {
                ColorStateList colorStateList = this.f2966c;
                if (colorStateList != null) {
                    AbstractC0272E.m713q(view, colorStateList);
                }
            }
            int r3 = this.f2971h == 5 ? 4 : 0;
            if (view.getVisibility() != r3) {
                view.setVisibility(r3);
            }
            m2129u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC0283P.m771d(view) == null) {
                AbstractC0283P.m780m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int r32 = Gravity.getAbsoluteGravity(((C2882d) view.getLayoutParams()).f9492c, r13) == 3 ? 1 : 0;
        AbstractC2480a abstractC2480a = this.f2964a;
        if (abstractC2480a == null || abstractC2480a.mo2444u() != r32) {
            C0885k c0885k = this.f2967d;
            C2882d c2882d = null;
            if (r32 == 0) {
                this.f2964a = new C0902a(this, r14);
                if (c0885k != null) {
                    WeakReference weakReference = this.f2979p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof C2882d)) {
                        c2882d = (C2882d) view3.getLayoutParams();
                    }
                    if (c2882d == null || ((ViewGroup.MarginLayoutParams) c2882d).rightMargin <= 0) {
                        C0884j m2417e = c0885k.m2417e();
                        m2417e.f3687f = new C0875a(0.0f);
                        m2417e.f3688g = new C0875a(0.0f);
                        C0885k m2412a = m2417e.m2412a();
                        if (c0881g != null) {
                            c0881g.setShapeAppearanceModel(m2412a);
                        }
                    }
                }
            } else {
                if (r32 != 1) {
                    throw new IllegalArgumentException(AbstractC0002c.m13h("Invalid sheet edge position value: ", r32, ". Must be 0 or 1."));
                }
                this.f2964a = new C0902a(this, r02);
                if (c0885k != null) {
                    WeakReference weakReference2 = this.f2979p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof C2882d)) {
                        c2882d = (C2882d) view2.getLayoutParams();
                    }
                    if (c2882d == null || ((ViewGroup.MarginLayoutParams) c2882d).leftMargin <= 0) {
                        C0884j m2417e2 = c0885k.m2417e();
                        m2417e2.f3686e = new C0875a(0.0f);
                        m2417e2.f3689h = new C0875a(0.0f);
                        C0885k m2412a2 = m2417e2.m2412a();
                        if (c0881g != null) {
                            c0881g.setShapeAppearanceModel(m2412a2);
                        }
                    }
                }
            }
        }
        if (this.f2972i == null) {
            this.f2972i = new C0516e(coordinatorLayout.getContext(), coordinatorLayout, this.f2985v);
        }
        int mo2442s = this.f2964a.mo2442s(view);
        coordinatorLayout.m1581q(view, r13);
        this.f2976m = coordinatorLayout.getWidth();
        this.f2977n = this.f2964a.mo2443t(coordinatorLayout);
        this.f2975l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f2978o = marginLayoutParams != null ? this.f2964a.mo2436c(marginLayoutParams) : 0;
        int r132 = this.f2971h;
        if (r132 == 1 || r132 == 2) {
            r02 = mo2442s - this.f2964a.mo2442s(view);
        } else if (r132 != 3) {
            if (r132 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f2971h);
            }
            r02 = this.f2964a.mo2439o();
        }
        view.offsetLeftAndRight(r02);
        if (this.f2980q == null && (r12 = this.f2981r) != -1 && (findViewById = coordinatorLayout.findViewById(r12)) != null) {
            this.f2980q = new WeakReference(findViewById);
        }
        Iterator it = this.f2984u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: h */
    public final boolean mo2043h(CoordinatorLayout coordinatorLayout, View view, int r6, int r7, int r8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(r6, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + r7, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(r8, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: m */
    public final void mo2046m(View view, Parcelable parcelable) {
        int r2 = ((C0904c) parcelable).f3755c;
        if (r2 == 1 || r2 == 2) {
            r2 = 5;
        }
        this.f2971h = r2;
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: n */
    public final Parcelable mo2047n(View view) {
        return new C0904c(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: q */
    public final boolean mo2050q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2971h == 1 && actionMasked == 0) {
            return true;
        }
        if (m2127s()) {
            this.f2972i.m1341j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f2982s) != null) {
            velocityTracker.recycle();
            this.f2982s = null;
        }
        if (this.f2982s == null) {
            this.f2982s = VelocityTracker.obtain();
        }
        this.f2982s.addMovement(motionEvent);
        if (m2127s() && actionMasked == 2 && !this.f2973j && m2127s()) {
            float abs = Math.abs(this.f2983t - motionEvent.getX());
            C0516e c0516e = this.f2972i;
            if (abs > c0516e.f1348b) {
                c0516e.m1333b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2973j;
    }

    /* renamed from: r */
    public final void m2126r(int r3) {
        View view;
        if (this.f2971h == r3) {
            return;
        }
        this.f2971h = r3;
        WeakReference weakReference = this.f2979p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int r02 = this.f2971h == 5 ? 4 : 0;
        if (view.getVisibility() != r02) {
            view.setVisibility(r02);
        }
        Iterator it = this.f2984u.iterator();
        if (it.hasNext()) {
            throw AbstractC0002c.m10e(it);
        }
        m2129u();
    }

    /* renamed from: s */
    public final boolean m2127s() {
        return this.f2972i != null && (this.f2970g || this.f2971h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.m1346o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        m2126r(2);
        r2.f2968e.m1156b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2128t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            k0.a r0 = r2.f2964a
            int r0 = r0.mo2439o()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = p000A.AbstractC0002c.m11f(r4, r5)
            r3.<init>(r4)
            throw r3
        L19:
            k0.a r0 = r2.f2964a
            int r0 = r0.mo2438n()
        L1f:
            T.e r1 = r2.f2972i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.m1346o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f1364r = r3
            r3 = -1
            r1.f1349c = r3
            r3 = 0
            boolean r3 = r1.m1339h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f1347a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f1364r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f1364r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.m2126r(r3)
            P0.f r3 = r2.f2968e
            r3.m1156b(r4)
            goto L5a
        L57:
            r2.m2126r(r4)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.m2128t(android.view.View, int, boolean):void");
    }

    /* renamed from: u */
    public final void m2129u() {
        View view;
        WeakReference weakReference = this.f2979p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0283P.m776i(view, 262144);
        AbstractC0283P.m774g(view, 0);
        AbstractC0283P.m776i(view, 1048576);
        AbstractC0283P.m774g(view, 0);
        final int r2 = 5;
        if (this.f2971h != 5) {
            AbstractC0283P.m777j(view, C0351e.f989j, new InterfaceC0366t() { // from class: f1.b
                @Override // p031L.InterfaceC0366t
                /* renamed from: b */
                public final boolean mo204b(View view2) {
                    int r5 = 1;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int r12 = r2;
                    if (r12 == 1 || r12 == 2) {
                        throw new IllegalArgumentException(AbstractC0002c.m17l(new StringBuilder("STATE_"), r12 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f2979p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m2126r(r12);
                    } else {
                        View view3 = (View) sideSheetBehavior.f2979p.get();
                        RunnableC0041o runnableC0041o = new RunnableC0041o(r12, r5, sideSheetBehavior);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = AbstractC0283P.f842a;
                            if (view3.isAttachedToWindow()) {
                                view3.post(runnableC0041o);
                            }
                        }
                        runnableC0041o.run();
                    }
                    return true;
                }
            });
        }
        final int r22 = 3;
        if (this.f2971h != 3) {
            AbstractC0283P.m777j(view, C0351e.f987h, new InterfaceC0366t() { // from class: f1.b
                @Override // p031L.InterfaceC0366t
                /* renamed from: b */
                public final boolean mo204b(View view2) {
                    int r5 = 1;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int r12 = r22;
                    if (r12 == 1 || r12 == 2) {
                        throw new IllegalArgumentException(AbstractC0002c.m17l(new StringBuilder("STATE_"), r12 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f2979p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m2126r(r12);
                    } else {
                        View view3 = (View) sideSheetBehavior.f2979p.get();
                        RunnableC0041o runnableC0041o = new RunnableC0041o(r12, r5, sideSheetBehavior);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = AbstractC0283P.f842a;
                            if (view3.isAttachedToWindow()) {
                                view3.post(runnableC0041o);
                            }
                        }
                        runnableC0041o.run();
                    }
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f2968e = new C0422f(this);
        this.f2970g = true;
        this.f2971h = 5;
        this.f2974k = 0.1f;
        this.f2981r = -1;
        this.f2984u = new LinkedHashSet();
        this.f2985v = new C0419c(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0345a.f971w);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2966c = AbstractC0387m.m1121s(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f2967d = C0885k.m2414b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).m2412a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f2981r = resourceId;
            WeakReference weakReference = this.f2980q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2980q = null;
            WeakReference weakReference2 = this.f2979p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = AbstractC0283P.f842a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        C0885k c0885k = this.f2967d;
        if (c0885k != null) {
            C0881g c0881g = new C0881g(c0885k);
            this.f2965b = c0881g;
            c0881g.m2405h(context);
            ColorStateList colorStateList = this.f2966c;
            if (colorStateList != null) {
                this.f2965b.m2407j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2965b.setTint(typedValue.data);
            }
        }
        this.f2969f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f2970g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
