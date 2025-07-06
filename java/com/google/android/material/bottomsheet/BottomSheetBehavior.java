package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.carwizard.p075li.youtube.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p010D0.C0109g;
import p018G1.C0169t;
import p022I.C0201j;
import p028K.AbstractC0270C;
import p028K.AbstractC0272E;
import p028K.AbstractC0283P;
import p028K.C0293a;
import p028K.C0295b;
import p028K.C0301e;
import p028K.C0302e0;
import p028K.C0306g0;
import p028K.ViewOnApplyWindowInsetsListenerC0300d0;
import p029K0.AbstractC0345a;
import p031L.C0351e;
import p034M.AbstractC0372a;
import p036M1.AbstractC0387m;
import p044P0.C0418b;
import p044P0.C0419c;
import p044P0.C0421e;
import p044P0.C0422f;
import p044P0.RunnableC0417a;
import p055T.C0516e;
import p065Y0.C0558m;
import p065Y0.ViewOnAttachStateChangeListenerC0557l;
import p081e1.C0880f;
import p081e1.C0881g;
import p081e1.C0885k;
import p103k0.AbstractC2480a;
import p138x.AbstractC2879a;
import p138x.C2882d;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC2879a {

    /* renamed from: A */
    public final C0422f f2749A;

    /* renamed from: B */
    public final ValueAnimator f2750B;

    /* renamed from: C */
    public final int f2751C;

    /* renamed from: D */
    public int f2752D;

    /* renamed from: E */
    public int f2753E;

    /* renamed from: F */
    public final float f2754F;

    /* renamed from: G */
    public int f2755G;

    /* renamed from: H */
    public final float f2756H;

    /* renamed from: I */
    public boolean f2757I;

    /* renamed from: J */
    public boolean f2758J;

    /* renamed from: K */
    public final boolean f2759K;

    /* renamed from: L */
    public int f2760L;

    /* renamed from: M */
    public C0516e f2761M;

    /* renamed from: N */
    public boolean f2762N;

    /* renamed from: O */
    public int f2763O;

    /* renamed from: P */
    public boolean f2764P;

    /* renamed from: Q */
    public final float f2765Q;

    /* renamed from: R */
    public int f2766R;

    /* renamed from: S */
    public int f2767S;

    /* renamed from: T */
    public int f2768T;

    /* renamed from: U */
    public WeakReference f2769U;

    /* renamed from: V */
    public WeakReference f2770V;

    /* renamed from: W */
    public final ArrayList f2771W;

    /* renamed from: X */
    public VelocityTracker f2772X;

    /* renamed from: Y */
    public int f2773Y;

    /* renamed from: Z */
    public int f2774Z;

    /* renamed from: a */
    public final int f2775a;

    /* renamed from: a0 */
    public boolean f2776a0;

    /* renamed from: b */
    public boolean f2777b;

    /* renamed from: b0 */
    public HashMap f2778b0;

    /* renamed from: c */
    public final float f2779c;

    /* renamed from: c0 */
    public final SparseIntArray f2780c0;

    /* renamed from: d */
    public final int f2781d;

    /* renamed from: d0 */
    public final C0419c f2782d0;

    /* renamed from: e */
    public int f2783e;

    /* renamed from: f */
    public boolean f2784f;

    /* renamed from: g */
    public int f2785g;

    /* renamed from: h */
    public final int f2786h;

    /* renamed from: i */
    public final C0881g f2787i;

    /* renamed from: j */
    public final ColorStateList f2788j;

    /* renamed from: k */
    public final int f2789k;

    /* renamed from: l */
    public final int f2790l;

    /* renamed from: m */
    public int f2791m;

    /* renamed from: n */
    public final boolean f2792n;

    /* renamed from: o */
    public final boolean f2793o;

    /* renamed from: p */
    public final boolean f2794p;

    /* renamed from: q */
    public final boolean f2795q;

    /* renamed from: r */
    public final boolean f2796r;

    /* renamed from: s */
    public final boolean f2797s;

    /* renamed from: t */
    public final boolean f2798t;

    /* renamed from: u */
    public final boolean f2799u;

    /* renamed from: v */
    public int f2800v;

    /* renamed from: w */
    public int f2801w;

    /* renamed from: x */
    public final boolean f2802x;

    /* renamed from: y */
    public final C0885k f2803y;

    /* renamed from: z */
    public boolean f2804z;

    public BottomSheetBehavior() {
        this.f2775a = 0;
        this.f2777b = true;
        this.f2789k = -1;
        this.f2790l = -1;
        this.f2749A = new C0422f(this);
        this.f2754F = 0.5f;
        this.f2756H = -1.0f;
        this.f2759K = true;
        this.f2760L = 4;
        this.f2765Q = 0.1f;
        this.f2771W = new ArrayList();
        this.f2774Z = -1;
        this.f2780c0 = new SparseIntArray();
        this.f2782d0 = new C0419c(this, 0);
    }

    /* renamed from: v */
    public static View m2057v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        if (AbstractC0272E.m712p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int r2 = 0; r2 < childCount; r2++) {
                View m2057v = m2057v(viewGroup.getChildAt(r2));
                if (m2057v != null) {
                    return m2057v;
                }
            }
        }
        return null;
    }

    /* renamed from: w */
    public static int m2058w(int r02, int r12, int r2, int r3) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(r02, r12, r3);
        if (r2 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, r2), 1073741824);
        }
        if (size != 0) {
            r2 = Math.min(size, r2);
        }
        return View.MeasureSpec.makeMeasureSpec(r2, Integer.MIN_VALUE);
    }

    /* renamed from: A */
    public final void m2059A(int r2) {
        if (r2 == -1) {
            if (this.f2784f) {
                return;
            } else {
                this.f2784f = true;
            }
        } else {
            if (!this.f2784f && this.f2783e == r2) {
                return;
            }
            this.f2784f = false;
            this.f2783e = Math.max(0, r2);
        }
        m2067I();
    }

    /* renamed from: B */
    public final void m2060B(int r5) {
        if (r5 == 1 || r5 == 2) {
            throw new IllegalArgumentException(AbstractC0002c.m17l(new StringBuilder("STATE_"), r5 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f2757I && r5 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + r5);
            return;
        }
        int r02 = (r5 == 6 && this.f2777b && m2076y(r5) <= this.f2752D) ? 3 : r5;
        WeakReference weakReference = this.f2769U;
        if (weakReference == null || weakReference.get() == null) {
            m2061C(r5);
            return;
        }
        View view = (View) this.f2769U.get();
        RunnableC0417a runnableC0417a = new RunnableC0417a(this, view, r02);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            if (view.isAttachedToWindow()) {
                view.post(runnableC0417a);
                return;
            }
        }
        runnableC0417a.run();
    }

    /* renamed from: C */
    public final void m2061C(int r7) {
        if (this.f2760L == r7) {
            return;
        }
        this.f2760L = r7;
        if (r7 != 4 && r7 != 3 && r7 != 6) {
            boolean z2 = this.f2757I;
        }
        WeakReference weakReference = this.f2769U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (r7 == 3) {
            m2066H(true);
        } else if (r7 == 6 || r7 == 5 || r7 == 4) {
            m2066H(false);
        }
        m2065G(r7, true);
        ArrayList arrayList = this.f2771W;
        if (arrayList.size() <= 0) {
            m2064F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* renamed from: D */
    public final boolean m2062D(View view, float f) {
        if (this.f2758J) {
            return true;
        }
        if (view.getTop() < this.f2755G) {
            return false;
        }
        return Math.abs(((f * this.f2765Q) + ((float) view.getTop())) - ((float) this.f2755G)) / ((float) m2073t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.m1346o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        m2061C(2);
        m2065G(r4, true);
        r2.f2749A.m1156b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        return;
     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2063E(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.m2076y(r4)
            T.e r1 = r2.f2761M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.m1346o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f1364r = r3
            r3 = -1
            r1.f1349c = r3
            r3 = 0
            boolean r3 = r1.m1339h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f1347a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f1364r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f1364r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.m2061C(r3)
            r3 = 1
            r2.m2065G(r4, r3)
            P0.f r3 = r2.f2749A
            r3.m1156b(r4)
            goto L43
        L40:
            r2.m2061C(r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m2063E(android.view.View, int, boolean):void");
    }

    /* renamed from: F */
    public final void m2064F() {
        View view;
        int r4;
        WeakReference weakReference = this.f2769U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0283P.m776i(view, 524288);
        AbstractC0283P.m774g(view, 0);
        AbstractC0283P.m776i(view, 262144);
        AbstractC0283P.m774g(view, 0);
        AbstractC0283P.m776i(view, 1048576);
        AbstractC0283P.m774g(view, 0);
        SparseIntArray sparseIntArray = this.f2780c0;
        int r42 = sparseIntArray.get(0, -1);
        if (r42 != -1) {
            AbstractC0283P.m776i(view, r42);
            AbstractC0283P.m774g(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f2777b && this.f2760L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C0169t c0169t = new C0169t(this, 6);
            ArrayList m772e = AbstractC0283P.m772e(view);
            int r6 = 0;
            while (true) {
                if (r6 >= m772e.size()) {
                    int r62 = -1;
                    for (int r7 = 0; r7 < 32 && r62 == -1; r7++) {
                        int r8 = AbstractC0283P.f845d[r7];
                        boolean z2 = true;
                        for (int r12 = 0; r12 < m772e.size(); r12++) {
                            z2 &= ((C0351e) m772e.get(r12)).m997a() != r8;
                        }
                        if (z2) {
                            r62 = r8;
                        }
                    }
                    r4 = r62;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C0351e) m772e.get(r6)).f992a).getLabel())) {
                        r4 = ((C0351e) m772e.get(r6)).m997a();
                        break;
                    }
                    r6++;
                }
            }
            if (r4 != -1) {
                C0351e c0351e = new C0351e(null, r4, string, c0169t, null);
                View.AccessibilityDelegate m770c = AbstractC0283P.m770c(view);
                C0295b c0295b = m770c == null ? null : m770c instanceof C0293a ? ((C0293a) m770c).f854a : new C0295b(m770c);
                if (c0295b == null) {
                    c0295b = new C0295b();
                }
                AbstractC0283P.m779l(view, c0295b);
                AbstractC0283P.m776i(view, c0351e.m997a());
                AbstractC0283P.m772e(view).add(c0351e);
                AbstractC0283P.m774g(view, 0);
            }
            sparseIntArray.put(0, r4);
        }
        if (this.f2757I && this.f2760L != 5) {
            AbstractC0283P.m777j(view, C0351e.f989j, new C0169t(this, 5));
        }
        int r13 = this.f2760L;
        if (r13 == 3) {
            AbstractC0283P.m777j(view, C0351e.f988i, new C0169t(this, this.f2777b ? 4 : 6));
            return;
        }
        if (r13 == 4) {
            AbstractC0283P.m777j(view, C0351e.f987h, new C0169t(this, this.f2777b ? 3 : 6));
        } else {
            if (r13 != 6) {
                return;
            }
            AbstractC0283P.m777j(view, C0351e.f988i, new C0169t(this, 4));
            AbstractC0283P.m777j(view, C0351e.f987h, new C0169t(this, 3));
        }
    }

    /* renamed from: G */
    public final void m2065G(int r7, boolean z2) {
        C0881g c0881g = this.f2787i;
        ValueAnimator valueAnimator = this.f2750B;
        if (r7 == 2) {
            return;
        }
        boolean z3 = this.f2760L == 3 && (this.f2802x || m2077z());
        if (this.f2804z == z3 || c0881g == null) {
            return;
        }
        this.f2804z = z3;
        if (z2 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c0881g.f3659a.f3650i, z3 ? m2072s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float m2072s = this.f2804z ? m2072s() : 1.0f;
        C0880f c0880f = c0881g.f3659a;
        if (c0880f.f3650i != m2072s) {
            c0880f.f3650i = m2072s;
            c0881g.f3663e = true;
            c0881g.invalidateSelf();
        }
    }

    /* renamed from: H */
    public final void m2066H(boolean z2) {
        WeakReference weakReference = this.f2769U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f2778b0 != null) {
                    return;
                } else {
                    this.f2778b0 = new HashMap(childCount);
                }
            }
            for (int r2 = 0; r2 < childCount; r2++) {
                View childAt = coordinatorLayout.getChildAt(r2);
                if (childAt != this.f2769U.get() && z2) {
                    this.f2778b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f2778b0 = null;
        }
    }

    /* renamed from: I */
    public final void m2067I() {
        View view;
        if (this.f2769U != null) {
            m2071r();
            if (this.f2760L != 4 || (view = (View) this.f2769U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: c */
    public final void mo2068c(C2882d c2882d) {
        this.f2769U = null;
        this.f2761M = null;
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: e */
    public final void mo2069e() {
        this.f2769U = null;
        this.f2761M = null;
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: f */
    public final boolean mo2042f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int r10;
        C0516e c0516e;
        if (!view.isShown() || !this.f2759K) {
            this.f2762N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2773Y = -1;
            this.f2774Z = -1;
            VelocityTracker velocityTracker = this.f2772X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2772X = null;
            }
        }
        if (this.f2772X == null) {
            this.f2772X = VelocityTracker.obtain();
        }
        this.f2772X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f2774Z = (int) motionEvent.getY();
            if (this.f2760L != 2) {
                WeakReference weakReference = this.f2770V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m1579o(view2, x2, this.f2774Z)) {
                    this.f2773Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f2776a0 = true;
                }
            }
            this.f2762N = this.f2773Y == -1 && !coordinatorLayout.m1579o(view, x2, this.f2774Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2776a0 = false;
            this.f2773Y = -1;
            if (this.f2762N) {
                this.f2762N = false;
                return false;
            }
        }
        if (!this.f2762N && (c0516e = this.f2761M) != null && c0516e.m1347p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f2770V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f2762N || this.f2760L == 1 || coordinatorLayout.m1579o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f2761M == null || (r10 = this.f2774Z) == -1 || Math.abs(((float) r10) - motionEvent.getY()) <= ((float) this.f2761M.f1348b)) ? false : true;
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: g */
    public final boolean mo1047g(CoordinatorLayout coordinatorLayout, View view, int r14) {
        int r02 = this.f2790l;
        C0881g c0881g = this.f2787i;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2769U == null) {
            this.f2785g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int r2 = Build.VERSION.SDK_INT;
            boolean z2 = (r2 < 29 || this.f2792n || this.f2784f) ? false : true;
            if (this.f2793o || this.f2794p || this.f2795q || this.f2797s || this.f2798t || this.f2799u || z2) {
                C0201j c0201j = new C0201j(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C0558m c0558m = new C0558m();
                c0558m.f1563a = paddingStart;
                c0558m.f1564b = paddingEnd;
                c0558m.f1565c = paddingBottom;
                AbstractC0272E.m717u(view, new C0109g(c0201j, c0558m));
                if (view.isAttachedToWindow()) {
                    AbstractC0270C.m696c(view);
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0557l());
                }
            }
            C0301e c0301e = new C0301e(view);
            if (r2 >= 30) {
                view.setWindowInsetsAnimationCallback(new C0306g0(c0301e));
            } else {
                PathInterpolator pathInterpolator = C0302e0.f874e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC0300d0 = new ViewOnApplyWindowInsetsListenerC0300d0(view, c0301e);
                view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC0300d0);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0300d0);
                }
            }
            this.f2769U = new WeakReference(view);
            Context context = view.getContext();
            AbstractC2480a.m4877R(context, R.attr.motionEasingStandardDecelerateInterpolator, AbstractC0372a.m1045b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC2480a.m4876Q(context, R.attr.motionDurationMedium2, 300);
            AbstractC2480a.m4876Q(context, R.attr.motionDurationShort3, 150);
            AbstractC2480a.m4876Q(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (c0881g != null) {
                view.setBackground(c0881g);
                float f = this.f2756H;
                if (f == -1.0f) {
                    f = AbstractC0272E.m705i(view);
                }
                c0881g.m2406i(f);
            } else {
                ColorStateList colorStateList = this.f2788j;
                if (colorStateList != null) {
                    AbstractC0272E.m713q(view, colorStateList);
                }
            }
            m2064F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f2761M == null) {
            this.f2761M = new C0516e(coordinatorLayout.getContext(), coordinatorLayout, this.f2782d0);
        }
        int top = view.getTop();
        coordinatorLayout.m1581q(view, r14);
        this.f2767S = coordinatorLayout.getWidth();
        this.f2768T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f2766R = height;
        int r142 = this.f2768T;
        int r12 = r142 - height;
        int r22 = this.f2801w;
        if (r12 < r22) {
            if (this.f2796r) {
                if (r02 != -1) {
                    r142 = Math.min(r142, r02);
                }
                this.f2766R = r142;
            } else {
                int r143 = r142 - r22;
                if (r02 != -1) {
                    r143 = Math.min(r143, r02);
                }
                this.f2766R = r143;
            }
        }
        this.f2752D = Math.max(0, this.f2768T - this.f2766R);
        this.f2753E = (int) ((1.0f - this.f2754F) * this.f2768T);
        m2071r();
        int r122 = this.f2760L;
        if (r122 == 3) {
            view.offsetTopAndBottom(m2075x());
        } else if (r122 == 6) {
            view.offsetTopAndBottom(this.f2753E);
        } else if (this.f2757I && r122 == 5) {
            view.offsetTopAndBottom(this.f2768T);
        } else if (r122 == 4) {
            view.offsetTopAndBottom(this.f2755G);
        } else if (r122 == 1 || r122 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        m2065G(this.f2760L, false);
        this.f2770V = new WeakReference(m2057v(view));
        ArrayList arrayList = this.f2771W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: h */
    public final boolean mo2043h(CoordinatorLayout coordinatorLayout, View view, int r6, int r7, int r8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m2058w(r6, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + r7, this.f2789k, marginLayoutParams.width), m2058w(r8, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f2790l, marginLayoutParams.height));
        return true;
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: i */
    public final boolean mo2070i(View view) {
        WeakReference weakReference = this.f2770V;
        return (weakReference == null || view != weakReference.get() || this.f2760L == 3) ? false : true;
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: j */
    public final void mo2044j(CoordinatorLayout coordinatorLayout, View view, View view2, int r6, int r7, int[] r8, int r9) {
        boolean z2 = this.f2759K;
        if (r9 == 1) {
            return;
        }
        WeakReference weakReference = this.f2770V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int r02 = top - r7;
        if (r7 > 0) {
            if (r02 < m2075x()) {
                int m2075x = top - m2075x();
                r8[1] = m2075x;
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                view.offsetTopAndBottom(-m2075x);
                m2061C(3);
            } else {
                if (!z2) {
                    return;
                }
                r8[1] = r7;
                WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
                view.offsetTopAndBottom(-r7);
                m2061C(1);
            }
        } else if (r7 < 0 && !view2.canScrollVertically(-1)) {
            int r5 = this.f2755G;
            if (r02 > r5 && !this.f2757I) {
                int r92 = top - r5;
                r8[1] = r92;
                WeakHashMap weakHashMap3 = AbstractC0283P.f842a;
                view.offsetTopAndBottom(-r92);
                m2061C(4);
            } else {
                if (!z2) {
                    return;
                }
                r8[1] = r7;
                WeakHashMap weakHashMap4 = AbstractC0283P.f842a;
                view.offsetTopAndBottom(-r7);
                m2061C(1);
            }
        }
        m2074u(view.getTop());
        this.f2763O = r7;
        this.f2764P = true;
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: m */
    public final void mo2046m(View view, Parcelable parcelable) {
        C0421e c0421e = (C0421e) parcelable;
        int r6 = this.f2775a;
        if (r6 != 0) {
            if (r6 == -1 || (r6 & 1) == 1) {
                this.f2783e = c0421e.f1088d;
            }
            if (r6 == -1 || (r6 & 2) == 2) {
                this.f2777b = c0421e.f1089e;
            }
            if (r6 == -1 || (r6 & 4) == 4) {
                this.f2757I = c0421e.f1090f;
            }
            if (r6 == -1 || (r6 & 8) == 8) {
                this.f2758J = c0421e.f1091g;
            }
        }
        int r62 = c0421e.f1087c;
        if (r62 == 1 || r62 == 2) {
            this.f2760L = 4;
        } else {
            this.f2760L = r62;
        }
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: n */
    public final Parcelable mo2047n(View view) {
        return new C0421e(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: o */
    public final boolean mo2048o(View view, int r2, int r3) {
        this.f2763O = 0;
        this.f2764P = false;
        return (r2 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f2753E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f2752D) < java.lang.Math.abs(r5 - r3.f2755G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f2755G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f2755G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f2753E) < java.lang.Math.abs(r5 - r3.f2755G)) goto L50;
     */
    @Override // p138x.AbstractC2879a
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2049p(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.m2075x()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.m2061C(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.f2770V
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.f2764P
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.f2763O
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.f2777b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.f2753E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.f2757I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.f2772X
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f2779c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f2772X
            int r0 = r3.f2773Y
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.m2062D(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.f2763O
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.f2777b
            if (r2 == 0) goto L74
            int r6 = r3.f2752D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f2755G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.f2753E
            if (r5 >= r2) goto L83
            int r0 = r3.f2755G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f2755G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.f2777b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.f2753E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f2755G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.m2063E(r4, r1, r5)
            r3.f2764P = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo2049p(android.view.View, android.view.View, int):void");
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: q */
    public final boolean mo2050q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int r12 = this.f2760L;
        if (r12 == 1 && actionMasked == 0) {
            return true;
        }
        C0516e c0516e = this.f2761M;
        if (c0516e != null && (this.f2759K || r12 == 1)) {
            c0516e.m1341j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f2773Y = -1;
            this.f2774Z = -1;
            VelocityTracker velocityTracker = this.f2772X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2772X = null;
            }
        }
        if (this.f2772X == null) {
            this.f2772X = VelocityTracker.obtain();
        }
        this.f2772X.addMovement(motionEvent);
        if (this.f2761M != null && ((this.f2759K || this.f2760L == 1) && actionMasked == 2 && !this.f2762N)) {
            float abs = Math.abs(this.f2774Z - motionEvent.getY());
            C0516e c0516e2 = this.f2761M;
            if (abs > c0516e2.f1348b) {
                c0516e2.m1333b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2762N;
    }

    /* renamed from: r */
    public final void m2071r() {
        int m2073t = m2073t();
        if (this.f2777b) {
            this.f2755G = Math.max(this.f2768T - m2073t, this.f2752D);
        } else {
            this.f2755G = this.f2768T - m2073t;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m2072s() {
        /*
            r5 = this;
            e1.g r0 = r5.f2787i
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference r0 = r5.f2769U
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference r0 = r5.f2769U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.m2077z()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L79
            e1.g r2 = r5.f2787i
            e1.f r3 = r2.f3659a
            e1.k r3 = r3.f3642a
            e1.c r3 = r3.f3698e
            android.graphics.RectF r2 = r2.m2403f()
            float r2 = r3.mo2392a(r2)
            android.view.RoundedCorner r3 = p028K.AbstractC0297c.m821i(r0)
            if (r3 == 0) goto L4e
            int r3 = p028K.AbstractC0297c.m815c(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = r1
        L4f:
            e1.g r2 = r5.f2787i
            e1.f r4 = r2.f3659a
            e1.k r4 = r4.f3642a
            e1.c r4 = r4.f3699f
            android.graphics.RectF r2 = r2.m2403f()
            float r2 = r4.mo2392a(r2)
            android.view.RoundedCorner r0 = p028K.AbstractC0297c.m828p(r0)
            if (r0 == 0) goto L74
            int r0 = p028K.AbstractC0297c.m815c(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            float r1 = r0 / r2
        L74:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m2072s():float");
    }

    /* renamed from: t */
    public final int m2073t() {
        int r02;
        return this.f2784f ? Math.min(Math.max(this.f2785g, this.f2768T - ((this.f2767S * 9) / 16)), this.f2766R) + this.f2800v : (this.f2792n || this.f2793o || (r02 = this.f2791m) <= 0) ? this.f2783e + this.f2800v : Math.max(this.f2783e, r02 + this.f2786h);
    }

    /* renamed from: u */
    public final void m2074u(int r3) {
        if (((View) this.f2769U.get()) != null) {
            ArrayList arrayList = this.f2771W;
            if (arrayList.isEmpty()) {
                return;
            }
            int r12 = this.f2755G;
            if (r3 <= r12 && r12 != m2075x()) {
                m2075x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* renamed from: x */
    public final int m2075x() {
        if (this.f2777b) {
            return this.f2752D;
        }
        return Math.max(this.f2751C, this.f2796r ? 0 : this.f2801w);
    }

    /* renamed from: y */
    public final int m2076y(int r3) {
        if (r3 == 3) {
            return m2075x();
        }
        if (r3 == 4) {
            return this.f2755G;
        }
        if (r3 == 5) {
            return this.f2768T;
        }
        if (r3 == 6) {
            return this.f2753E;
        }
        throw new IllegalArgumentException(AbstractC0002c.m11f(r3, "Invalid state to get top offset: "));
    }

    /* renamed from: z */
    public final boolean m2077z() {
        WeakReference weakReference = this.f2769U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] r02 = new int[2];
        ((View) this.f2769U.get()).getLocationOnScreen(r02);
        return r02[1] == 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int r02;
        int r2 = 0;
        this.f2775a = 0;
        this.f2777b = true;
        this.f2789k = -1;
        this.f2790l = -1;
        this.f2749A = new C0422f(this);
        this.f2754F = 0.5f;
        this.f2756H = -1.0f;
        this.f2759K = true;
        this.f2760L = 4;
        this.f2765Q = 0.1f;
        this.f2771W = new ArrayList();
        this.f2774Z = -1;
        this.f2780c0 = new SparseIntArray();
        this.f2782d0 = new C0419c(this, r2);
        this.f2786h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0345a.f949a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2788j = AbstractC0387m.m1121s(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f2803y = C0885k.m2414b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m2412a();
        }
        C0885k c0885k = this.f2803y;
        if (c0885k != null) {
            C0881g c0881g = new C0881g(c0885k);
            this.f2787i = c0881g;
            c0881g.m2405h(context);
            ColorStateList colorStateList = this.f2788j;
            if (colorStateList != null) {
                this.f2787i.m2407j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2787i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m2072s(), 1.0f);
        this.f2750B = ofFloat;
        ofFloat.setDuration(500L);
        this.f2750B.addUpdateListener(new C0418b(r2, this));
        this.f2756H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f2789k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f2790l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (r02 = peekValue.data) == -1) {
            m2059A(r02);
        } else {
            m2059A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z2 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f2757I != z2) {
            this.f2757I = z2;
            if (!z2 && this.f2760L == 5) {
                m2060B(4);
            }
            m2064F();
        }
        this.f2792n = obtainStyledAttributes.getBoolean(13, false);
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f2777b != z3) {
            this.f2777b = z3;
            if (this.f2769U != null) {
                m2071r();
            }
            m2061C((this.f2777b && this.f2760L == 6) ? 3 : this.f2760L);
            m2065G(this.f2760L, true);
            m2064F();
        }
        this.f2758J = obtainStyledAttributes.getBoolean(12, false);
        this.f2759K = obtainStyledAttributes.getBoolean(4, true);
        this.f2775a = obtainStyledAttributes.getInt(10, 0);
        float f = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f2754F = f;
            if (this.f2769U != null) {
                this.f2753E = (int) ((1.0f - f) * this.f2768T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int r14 = peekValue2.data;
                if (r14 >= 0) {
                    this.f2751C = r14;
                    m2065G(this.f2760L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f2751C = dimensionPixelOffset;
                    m2065G(this.f2760L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f2781d = obtainStyledAttributes.getInt(11, 500);
            this.f2793o = obtainStyledAttributes.getBoolean(17, false);
            this.f2794p = obtainStyledAttributes.getBoolean(18, false);
            this.f2795q = obtainStyledAttributes.getBoolean(19, false);
            this.f2796r = obtainStyledAttributes.getBoolean(20, true);
            this.f2797s = obtainStyledAttributes.getBoolean(14, false);
            this.f2798t = obtainStyledAttributes.getBoolean(15, false);
            this.f2799u = obtainStyledAttributes.getBoolean(16, false);
            this.f2802x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f2779c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // p138x.AbstractC2879a
    /* renamed from: k */
    public final void mo2045k(CoordinatorLayout coordinatorLayout, View view, int r3, int r4, int r5, int[] r6) {
    }
}
