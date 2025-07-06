package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p002A1.C0015h;
import p008C1.C0090v;
import p010D0.C0113k;
import p010D0.RunnableC0107e;
import p017G.AbstractC0149m;
import p024I1.C0209a;
import p028K.AbstractC0272E;
import p028K.AbstractC0283P;
import p028K.C0317m;
import p028K.C0323p;
import p055T.InterpolatorC0515d;
import p080e0.AbstractC0820C;
import p080e0.AbstractC0821D;
import p080e0.AbstractC0824G;
import p080e0.AbstractC0826I;
import p080e0.AbstractC0827J;
import p080e0.AbstractC0836T;
import p080e0.AbstractC0838V;
import p080e0.AbstractC0873y;
import p080e0.C0819B;
import p080e0.C0825H;
import p080e0.C0828K;
import p080e0.C0829L;
import p080e0.C0830M;
import p080e0.C0832O;
import p080e0.C0835S;
import p080e0.C0840X;
import p080e0.C0843a;
import p080e0.C0854f0;
import p080e0.C0859k;
import p080e0.C0860l;
import p080e0.C0869u;
import p080e0.C0872x;
import p080e0.InterfaceC0818A;
import p080e0.InterfaceC0831N;
import p080e0.RunnableC0837U;
import p080e0.RunnableC0862n;
import p112o.C2685e;
import p112o.C2691k;
import p124s0.C2738i;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: s0 */
    public static final int[] f2483s0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: t0 */
    public static final Class[] f2484t0;

    /* renamed from: u0 */
    public static final InterpolatorC0515d f2485u0;

    /* renamed from: A */
    public int f2486A;

    /* renamed from: B */
    public int f2487B;

    /* renamed from: C */
    public C0819B f2488C;

    /* renamed from: D */
    public EdgeEffect f2489D;

    /* renamed from: E */
    public EdgeEffect f2490E;

    /* renamed from: F */
    public EdgeEffect f2491F;

    /* renamed from: G */
    public EdgeEffect f2492G;

    /* renamed from: H */
    public AbstractC0820C f2493H;

    /* renamed from: I */
    public int f2494I;

    /* renamed from: J */
    public int f2495J;

    /* renamed from: K */
    public VelocityTracker f2496K;

    /* renamed from: L */
    public int f2497L;

    /* renamed from: M */
    public int f2498M;

    /* renamed from: N */
    public int f2499N;

    /* renamed from: O */
    public int f2500O;

    /* renamed from: P */
    public int f2501P;

    /* renamed from: Q */
    public AbstractC0826I f2502Q;

    /* renamed from: R */
    public final int f2503R;

    /* renamed from: S */
    public final int f2504S;

    /* renamed from: T */
    public final float f2505T;

    /* renamed from: U */
    public final float f2506U;

    /* renamed from: V */
    public boolean f2507V;

    /* renamed from: W */
    public final RunnableC0837U f2508W;

    /* renamed from: a */
    public final C2738i f2509a;

    /* renamed from: a0 */
    public RunnableC0862n f2510a0;

    /* renamed from: b */
    public final C0830M f2511b;

    /* renamed from: b0 */
    public final C0860l f2512b0;

    /* renamed from: c */
    public C0832O f2513c;

    /* renamed from: c0 */
    public final C0835S f2514c0;

    /* renamed from: d */
    public final C0090v f2515d;

    /* renamed from: d0 */
    public AbstractC0827J f2516d0;

    /* renamed from: e */
    public final C0015h f2517e;

    /* renamed from: e0 */
    public ArrayList f2518e0;

    /* renamed from: f */
    public final C0113k f2519f;

    /* renamed from: f0 */
    public boolean f2520f0;

    /* renamed from: g */
    public boolean f2521g;

    /* renamed from: g0 */
    public boolean f2522g0;

    /* renamed from: h */
    public final Rect f2523h;

    /* renamed from: h0 */
    public final C0872x f2524h0;

    /* renamed from: i */
    public final Rect f2525i;

    /* renamed from: i0 */
    public boolean f2526i0;

    /* renamed from: j */
    public final RectF f2527j;

    /* renamed from: j0 */
    public C0840X f2528j0;

    /* renamed from: k */
    public AbstractC0873y f2529k;

    /* renamed from: k0 */
    public final int[] f2530k0;

    /* renamed from: l */
    public AbstractC0824G f2531l;

    /* renamed from: l0 */
    public C0317m f2532l0;

    /* renamed from: m */
    public final ArrayList f2533m;

    /* renamed from: m0 */
    public final int[] f2534m0;

    /* renamed from: n */
    public final ArrayList f2535n;

    /* renamed from: n0 */
    public final int[] f2536n0;

    /* renamed from: o */
    public C0859k f2537o;

    /* renamed from: o0 */
    public final int[] f2538o0;

    /* renamed from: p */
    public boolean f2539p;

    /* renamed from: p0 */
    public final ArrayList f2540p0;

    /* renamed from: q */
    public boolean f2541q;

    /* renamed from: q0 */
    public final RunnableC0107e f2542q0;

    /* renamed from: r */
    public boolean f2543r;

    /* renamed from: r0 */
    public final C0872x f2544r0;

    /* renamed from: s */
    public int f2545s;

    /* renamed from: t */
    public boolean f2546t;

    /* renamed from: u */
    public boolean f2547u;

    /* renamed from: v */
    public boolean f2548v;

    /* renamed from: w */
    public int f2549w;

    /* renamed from: x */
    public final AccessibilityManager f2550x;

    /* renamed from: y */
    public boolean f2551y;

    /* renamed from: z */
    public boolean f2552z;

    static {
        Class cls = Integer.TYPE;
        f2484t0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f2485u0 = new InterpolatorC0515d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.carwizard.p075li.youtube.R.attr.recyclerViewStyle);
    }

    /* renamed from: D */
    public static RecyclerView m1891D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int r2 = 0; r2 < childCount; r2++) {
            RecyclerView m1891D = m1891D(viewGroup.getChildAt(r2));
            if (m1891D != null) {
                return m1891D;
            }
        }
        return null;
    }

    /* renamed from: I */
    public static AbstractC0838V m1892I(View view) {
        if (view == null) {
            return null;
        }
        return ((C0825H) view.getLayoutParams()).f3376a;
    }

    private C0317m getScrollingChildHelper() {
        if (this.f2532l0 == null) {
            this.f2532l0 = new C0317m(this);
        }
        return this.f2532l0;
    }

    /* renamed from: j */
    public static void m1897j(AbstractC0838V abstractC0838V) {
        WeakReference weakReference = abstractC0838V.f3425b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC0838V.f3424a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC0838V.f3425b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View m1898A(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1898A(android.view.View):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1899B(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f2535n
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            e0.k r5 = (p080e0.C0859k) r5
            int r6 = r5.f3559v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.m2360d(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.m2359c(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f3560w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f3553p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f3560w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f3550m = r6
        L55:
            r5.m2361f(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f2537o = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1899B(android.view.MotionEvent):boolean");
    }

    /* renamed from: C */
    public final void m1900C(int[] r9) {
        int m118m = this.f2517e.m118m();
        if (m118m == 0) {
            r9[0] = -1;
            r9[1] = -1;
            return;
        }
        int r3 = Integer.MAX_VALUE;
        int r4 = Integer.MIN_VALUE;
        for (int r5 = 0; r5 < m118m; r5++) {
            AbstractC0838V m1892I = m1892I(this.f2517e.m117l(r5));
            if (!m1892I.m2339p()) {
                int m2325b = m1892I.m2325b();
                if (m2325b < r3) {
                    r3 = m2325b;
                }
                if (m2325b > r4) {
                    r4 = m2325b;
                }
            }
        }
        r9[0] = r3;
        r9[1] = r4;
    }

    /* renamed from: E */
    public final AbstractC0838V m1901E(int r6) {
        AbstractC0838V abstractC0838V = null;
        if (this.f2551y) {
            return null;
        }
        int m127v = this.f2517e.m127v();
        for (int r2 = 0; r2 < m127v; r2++) {
            AbstractC0838V m1892I = m1892I(this.f2517e.m126u(r2));
            if (m1892I != null && !m1892I.m2332i() && m1902F(m1892I) == r6) {
                if (!((ArrayList) this.f2517e.f27d).contains(m1892I.f3424a)) {
                    return m1892I;
                }
                abstractC0838V = m1892I;
            }
        }
        return abstractC0838V;
    }

    /* renamed from: F */
    public final int m1902F(AbstractC0838V abstractC0838V) {
        if (abstractC0838V.m2327d(524) || !abstractC0838V.m2329f()) {
            return -1;
        }
        C0090v c0090v = this.f2515d;
        int r8 = abstractC0838V.f3426c;
        ArrayList arrayList = (ArrayList) c0090v.f288b;
        int size = arrayList.size();
        for (int r3 = 0; r3 < size; r3++) {
            C0843a c0843a = (C0843a) arrayList.get(r3);
            int r5 = c0843a.f3455a;
            if (r5 != 1) {
                if (r5 == 2) {
                    int r52 = c0843a.f3456b;
                    if (r52 <= r8) {
                        int r4 = c0843a.f3457c;
                        if (r52 + r4 > r8) {
                            return -1;
                        }
                        r8 -= r4;
                    } else {
                        continue;
                    }
                } else if (r5 == 8) {
                    int r53 = c0843a.f3456b;
                    if (r53 == r8) {
                        r8 = c0843a.f3457c;
                    } else {
                        if (r53 < r8) {
                            r8--;
                        }
                        if (c0843a.f3457c <= r8) {
                            r8++;
                        }
                    }
                }
            } else if (c0843a.f3456b <= r8) {
                r8 += c0843a.f3457c;
            }
        }
        return r8;
    }

    /* renamed from: G */
    public final long m1903G(AbstractC0838V abstractC0838V) {
        return this.f2529k.f3637b ? abstractC0838V.f3428e : abstractC0838V.f3426c;
    }

    /* renamed from: H */
    public final AbstractC0838V m1904H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m1892I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: J */
    public final Rect m1905J(View view) {
        C0825H c0825h = (C0825H) view.getLayoutParams();
        boolean z2 = c0825h.f3378c;
        Rect rect = c0825h.f3377b;
        if (!z2) {
            return rect;
        }
        if (this.f2514c0.f3408g && (c0825h.f3376a.m2335l() || c0825h.f3376a.m2330g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f2533m;
        int size = arrayList.size();
        for (int r5 = 0; r5 < size; r5++) {
            Rect rect2 = this.f2523h;
            rect2.set(0, 0, 0, 0);
            ((AbstractC0821D) arrayList.get(r5)).getClass();
            ((C0825H) view.getLayoutParams()).f3376a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0825h.f3378c = false;
        return rect;
    }

    /* renamed from: K */
    public final boolean m1906K() {
        return !this.f2543r || this.f2551y || this.f2515d.m295f();
    }

    /* renamed from: L */
    public final boolean m1907L() {
        return this.f2486A > 0;
    }

    /* renamed from: M */
    public final void m1908M(int r2) {
        if (this.f2531l == null) {
            return;
        }
        setScrollState(2);
        this.f2531l.mo1887n0(r2);
        awakenScrollBars();
    }

    /* renamed from: N */
    public final void m1909N() {
        int m127v = this.f2517e.m127v();
        for (int r2 = 0; r2 < m127v; r2++) {
            ((C0825H) this.f2517e.m126u(r2).getLayoutParams()).f3378c = true;
        }
        ArrayList arrayList = this.f2511b.f3388c;
        int size = arrayList.size();
        for (int r12 = 0; r12 < size; r12++) {
            C0825H c0825h = (C0825H) ((AbstractC0838V) arrayList.get(r12)).f3424a.getLayoutParams();
            if (c0825h != null) {
                c0825h.f3378c = true;
            }
        }
    }

    /* renamed from: O */
    public final void m1910O(int r10, int r11, boolean z2) {
        int r02 = r10 + r11;
        int m127v = this.f2517e.m127v();
        for (int r2 = 0; r2 < m127v; r2++) {
            AbstractC0838V m1892I = m1892I(this.f2517e.m126u(r2));
            if (m1892I != null && !m1892I.m2339p()) {
                int r6 = m1892I.f3426c;
                C0835S c0835s = this.f2514c0;
                if (r6 >= r02) {
                    m1892I.m2336m(-r11, z2);
                    c0835s.f3407f = true;
                } else if (r6 >= r10) {
                    m1892I.m2324a(8);
                    m1892I.m2336m(-r11, z2);
                    m1892I.f3426c = r10 - 1;
                    c0835s.f3407f = true;
                }
            }
        }
        C0830M c0830m = this.f2511b;
        ArrayList arrayList = c0830m.f3388c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0838V abstractC0838V = (AbstractC0838V) arrayList.get(size);
            if (abstractC0838V != null) {
                int r62 = abstractC0838V.f3426c;
                if (r62 >= r02) {
                    abstractC0838V.m2336m(-r11, z2);
                } else if (r62 >= r10) {
                    abstractC0838V.m2324a(8);
                    c0830m.m2312e(size);
                }
            }
        }
        requestLayout();
    }

    /* renamed from: P */
    public final void m1911P() {
        this.f2486A++;
    }

    /* renamed from: Q */
    public final void m1912Q(boolean z2) {
        int r3;
        AccessibilityManager accessibilityManager;
        int r12 = this.f2486A - 1;
        this.f2486A = r12;
        if (r12 < 1) {
            this.f2486A = 0;
            if (z2) {
                int r6 = this.f2549w;
                this.f2549w = 0;
                if (r6 != 0 && (accessibilityManager = this.f2550x) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(r6);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f2540p0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC0838V abstractC0838V = (AbstractC0838V) arrayList.get(size);
                    if (abstractC0838V.f3424a.getParent() == this && !abstractC0838V.m2339p() && (r3 = abstractC0838V.f3440q) != -1) {
                        WeakHashMap weakHashMap = AbstractC0283P.f842a;
                        abstractC0838V.f3424a.setImportantForAccessibility(r3);
                        abstractC0838V.f3440q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* renamed from: R */
    public final void m1913R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2495J) {
            int r02 = actionIndex == 0 ? 1 : 0;
            this.f2495J = motionEvent.getPointerId(r02);
            int x2 = (int) (motionEvent.getX(r02) + 0.5f);
            this.f2499N = x2;
            this.f2497L = x2;
            int y2 = (int) (motionEvent.getY(r02) + 0.5f);
            this.f2500O = y2;
            this.f2498M = y2;
        }
    }

    /* renamed from: S */
    public final void m1914S() {
        if (this.f2526i0 || !this.f2539p) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        postOnAnimation(this.f2542q0);
        this.f2526i0 = true;
    }

    /* renamed from: T */
    public final void m1915T(AbstractC0838V abstractC0838V, C0323p c0323p) {
        abstractC0838V.f3433j &= -8193;
        boolean z2 = this.f2514c0.f3409h;
        C0113k c0113k = this.f2519f;
        if (z2 && abstractC0838V.m2335l() && !abstractC0838V.m2332i() && !abstractC0838V.m2339p()) {
            ((C2685e) c0113k.f348c).m5166f(m1903G(abstractC0838V), abstractC0838V);
        }
        C2691k c2691k = (C2691k) c0113k.f347b;
        C0854f0 c0854f0 = (C0854f0) c2691k.getOrDefault(abstractC0838V, null);
        if (c0854f0 == null) {
            c0854f0 = C0854f0.m2351a();
            c2691k.put(abstractC0838V, c0854f0);
        }
        c0854f0.f3511b = c0323p;
        c0854f0.f3510a |= 4;
    }

    /* renamed from: U */
    public final void m1916U(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2523h;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0825H) {
            C0825H c0825h = (C0825H) layoutParams;
            if (!c0825h.f3378c) {
                int r12 = rect.left;
                Rect rect2 = c0825h.f3377b;
                rect.left = r12 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f2531l.mo2092k0(this, view, this.f2523h, !this.f2543r, view2 == null);
    }

    /* renamed from: V */
    public final void m1917V() {
        VelocityTracker velocityTracker = this.f2496K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        m1924c0(0);
        EdgeEffect edgeEffect = this.f2489D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f2489D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2490E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f2490E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2491F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f2491F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2492G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f2492G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1918W(int r19, int r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1918W(int, int, android.view.MotionEvent):boolean");
    }

    /* renamed from: X */
    public final void m1919X(int r11, int r12, int[] r13) {
        AbstractC0838V abstractC0838V;
        C0015h c0015h = this.f2517e;
        m1922a0();
        m1911P();
        int r2 = AbstractC0149m.f416a;
        Trace.beginSection("RV Scroll");
        C0835S c0835s = this.f2514c0;
        m1944z(c0835s);
        C0830M c0830m = this.f2511b;
        int mo1838m0 = r11 != 0 ? this.f2531l.mo1838m0(r11, c0830m, c0835s) : 0;
        int mo1842o0 = r12 != 0 ? this.f2531l.mo1842o0(r12, c0830m, c0835s) : 0;
        Trace.endSection();
        int m118m = c0015h.m118m();
        for (int r3 = 0; r3 < m118m; r3++) {
            View m117l = c0015h.m117l(r3);
            AbstractC0838V m1904H = m1904H(m117l);
            if (m1904H != null && (abstractC0838V = m1904H.f3432i) != null) {
                int left = m117l.getLeft();
                int top = m117l.getTop();
                View view = abstractC0838V.f3424a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m1912Q(true);
        m1923b0(false);
        if (r13 != null) {
            r13[0] = mo1838m0;
            r13[1] = mo1842o0;
        }
    }

    /* renamed from: Y */
    public final void m1920Y(int r3) {
        C0869u c0869u;
        if (this.f2547u) {
            return;
        }
        setScrollState(0);
        RunnableC0837U runnableC0837U = this.f2508W;
        runnableC0837U.f3422g.removeCallbacks(runnableC0837U);
        runnableC0837U.f3418c.abortAnimation();
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G != null && (c0869u = abstractC0824G.f3365e) != null) {
            c0869u.m2376i();
        }
        AbstractC0824G abstractC0824G2 = this.f2531l;
        if (abstractC0824G2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0824G2.mo1887n0(r3);
            awakenScrollBars();
        }
    }

    /* renamed from: Z */
    public final void m1921Z(int r3, int r4, boolean z2) {
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2547u) {
            return;
        }
        if (!abstractC0824G.mo1878d()) {
            r3 = 0;
        }
        if (!this.f2531l.mo1881e()) {
            r4 = 0;
        }
        if (r3 == 0 && r4 == 0) {
            return;
        }
        if (z2) {
            int r12 = r3 != 0 ? 1 : 0;
            if (r4 != 0) {
                r12 |= 2;
            }
            getScrollingChildHelper().m901g(r12, 1);
        }
        this.f2508W.m2323b(r3, r4, Integer.MIN_VALUE, null);
    }

    /* renamed from: a0 */
    public final void m1922a0() {
        int r02 = this.f2545s + 1;
        this.f2545s = r02;
        if (r02 != 1 || this.f2547u) {
            return;
        }
        this.f2546t = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int r3, int r4) {
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G != null) {
            abstractC0824G.getClass();
        }
        super.addFocusables(arrayList, r3, r4);
    }

    /* renamed from: b0 */
    public final void m1923b0(boolean z2) {
        if (this.f2545s < 1) {
            this.f2545s = 1;
        }
        if (!z2 && !this.f2547u) {
            this.f2546t = false;
        }
        if (this.f2545s == 1) {
            if (z2 && this.f2546t && !this.f2547u && this.f2531l != null && this.f2529k != null) {
                m1933o();
            }
            if (!this.f2547u) {
                this.f2546t = false;
            }
        }
        this.f2545s--;
    }

    /* renamed from: c0 */
    public final void m1924c0(int r2) {
        getScrollingChildHelper().m902h(r2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0825H) && this.f2531l.mo1828f((C0825H) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G != null && abstractC0824G.mo1878d()) {
            return this.f2531l.mo1885j(this.f2514c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G != null && abstractC0824G.mo1878d()) {
            return this.f2531l.mo1834k(this.f2514c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G != null && abstractC0824G.mo1878d()) {
            return this.f2531l.mo1836l(this.f2514c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G != null && abstractC0824G.mo1881e()) {
            return this.f2531l.mo1886m(this.f2514c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G != null && abstractC0824G.mo1881e()) {
            return this.f2531l.mo1840n(this.f2514c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G != null && abstractC0824G.mo1881e()) {
            return this.f2531l.mo1841o(this.f2514c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z2) {
        return getScrollingChildHelper().m895a(f, f2, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m896b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
        return getScrollingChildHelper().m897c(r7, r8, r9, r10, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
        return getScrollingChildHelper().m898d(r9, r10, r11, r12, r13, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList arrayList = this.f2533m;
        int size = arrayList.size();
        boolean z3 = false;
        for (int r4 = 0; r4 < size; r4++) {
            ((AbstractC0821D) arrayList.get(r4)).mo1218b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f2489D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f2521g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f2489D;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f2490E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2521g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2490E;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f2491F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2521g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f2491F;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2492G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2521g) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f2492G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f2493H == null || arrayList.size() <= 0 || !this.f2493H.mo2270f()) ? z2 : true) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* renamed from: f */
    public final void m1925f(AbstractC0838V abstractC0838V) {
        View view = abstractC0838V.f3424a;
        boolean z2 = view.getParent() == this;
        this.f2511b.m2317j(m1904H(view));
        if (abstractC0838V.m2334k()) {
            this.f2517e.m112g(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.f2517e.m111f(view, -1, true);
            return;
        }
        C0015h c0015h = this.f2517e;
        int indexOfChild = ((C0872x) c0015h.f25b).f3635a.indexOfChild(view);
        if (indexOfChild >= 0) {
            ((C0209a) c0015h.f26c).m604i(indexOfChild);
            c0015h.m128w(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x018a, code lost:
    
        if ((r5 * r6) < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0192, code lost:
    
        if ((r5 * r6) > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015e, code lost:
    
        if (r7 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x017c, code lost:
    
        if (r5 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017f, code lost:
    
        if (r7 < 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0182, code lost:
    
        if (r5 < 0) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* renamed from: g */
    public final void m1926g(AbstractC0821D abstractC0821D) {
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G != null) {
            abstractC0824G.mo1876c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f2533m;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0821D);
        m1909N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G != null) {
            return abstractC0824G.mo1843r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1943y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G != null) {
            return abstractC0824G.mo1845s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1943y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0873y getAdapter() {
        return this.f2529k;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G == null) {
            return super.getBaseline();
        }
        abstractC0824G.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int r12, int r2) {
        return super.getChildDrawingOrder(r12, r2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2521g;
    }

    public C0840X getCompatAccessibilityDelegate() {
        return this.f2528j0;
    }

    public C0819B getEdgeEffectFactory() {
        return this.f2488C;
    }

    public AbstractC0820C getItemAnimator() {
        return this.f2493H;
    }

    public int getItemDecorationCount() {
        return this.f2533m.size();
    }

    public AbstractC0824G getLayoutManager() {
        return this.f2531l;
    }

    public int getMaxFlingVelocity() {
        return this.f2504S;
    }

    public int getMinFlingVelocity() {
        return this.f2503R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AbstractC0826I getOnFlingListener() {
        return this.f2502Q;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2507V;
    }

    public C0829L getRecycledViewPool() {
        return this.f2511b.m2310c();
    }

    public int getScrollState() {
        return this.f2494I;
    }

    /* renamed from: h */
    public final void m1927h(AbstractC0827J abstractC0827J) {
        if (this.f2518e0 == null) {
            this.f2518e0 = new ArrayList();
        }
        this.f2518e0.add(abstractC0827J);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m900f(0);
    }

    /* renamed from: i */
    public final void m1928i(String str) {
        if (m1907L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m1943y());
        }
        if (this.f2487B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m1943y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2539p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f2547u;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f910d;
    }

    /* renamed from: k */
    public final void m1929k() {
        int m127v = this.f2517e.m127v();
        for (int r2 = 0; r2 < m127v; r2++) {
            AbstractC0838V m1892I = m1892I(this.f2517e.m126u(r2));
            if (!m1892I.m2339p()) {
                m1892I.f3427d = -1;
                m1892I.f3430g = -1;
            }
        }
        C0830M c0830m = this.f2511b;
        ArrayList arrayList = c0830m.f3388c;
        int size = arrayList.size();
        for (int r5 = 0; r5 < size; r5++) {
            AbstractC0838V abstractC0838V = (AbstractC0838V) arrayList.get(r5);
            abstractC0838V.f3427d = -1;
            abstractC0838V.f3430g = -1;
        }
        ArrayList arrayList2 = c0830m.f3386a;
        int size2 = arrayList2.size();
        for (int r52 = 0; r52 < size2; r52++) {
            AbstractC0838V abstractC0838V2 = (AbstractC0838V) arrayList2.get(r52);
            abstractC0838V2.f3427d = -1;
            abstractC0838V2.f3430g = -1;
        }
        ArrayList arrayList3 = c0830m.f3387b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int r12 = 0; r12 < size3; r12++) {
                AbstractC0838V abstractC0838V3 = (AbstractC0838V) c0830m.f3387b.get(r12);
                abstractC0838V3.f3427d = -1;
                abstractC0838V3.f3430g = -1;
            }
        }
    }

    /* renamed from: l */
    public final void m1930l(int r3, int r4) {
        boolean z2;
        EdgeEffect edgeEffect = this.f2489D;
        if (edgeEffect == null || edgeEffect.isFinished() || r3 <= 0) {
            z2 = false;
        } else {
            this.f2489D.onRelease();
            z2 = this.f2489D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2491F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && r3 < 0) {
            this.f2491F.onRelease();
            z2 |= this.f2491F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2490E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && r4 > 0) {
            this.f2490E.onRelease();
            z2 |= this.f2490E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2492G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && r4 < 0) {
            this.f2492G.onRelease();
            z2 |= this.f2492G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: m */
    public final void m1931m() {
        C0090v c0090v = this.f2515d;
        if (!this.f2543r || this.f2551y) {
            int r02 = AbstractC0149m.f416a;
            Trace.beginSection("RV FullInvalidate");
            m1933o();
            Trace.endSection();
            return;
        }
        if (c0090v.m295f()) {
            c0090v.getClass();
            if (c0090v.m295f()) {
                int r03 = AbstractC0149m.f416a;
                Trace.beginSection("RV FullInvalidate");
                m1933o();
                Trace.endSection();
            }
        }
    }

    /* renamed from: n */
    public final void m1932n(int r3, int r4) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        setMeasuredDimension(AbstractC0824G.m2280g(r3, paddingRight, getMinimumWidth()), AbstractC0824G.m2280g(r4, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0323, code lost:
    
        if (((java.util.ArrayList) r19.f2517e.f27d).contains(getFocusedChild()) == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0382, code lost:
    
        if (r6.hasFocusable() != false) goto L181;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [e0.V] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1933o() {
        /*
            Method dump skipped, instructions count: 1003
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1933o():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f2486A = r0
            r1 = 1
            r5.f2539p = r1
            boolean r2 = r5.f2543r
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f2543r = r2
            e0.G r2 = r5.f2531l
            if (r2 == 0) goto L21
            r2.f3367g = r1
            r2.mo2091Q(r5)
        L21:
            r5.f2526i0 = r0
            java.lang.ThreadLocal r0 = p080e0.RunnableC0862n.f3573e
            java.lang.Object r1 = r0.get()
            e0.n r1 = (p080e0.RunnableC0862n) r1
            r5.f2510a0 = r1
            if (r1 != 0) goto L6b
            e0.n r1 = new e0.n
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f3575a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f3578d = r2
            r5.f2510a0 = r1
            java.util.WeakHashMap r1 = p028K.AbstractC0283P.f842a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5d
            if (r1 == 0) goto L5d
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5d
            goto L5f
        L5d:
            r1 = 1114636288(0x42700000, float:60.0)
        L5f:
            e0.n r2 = r5.f2510a0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f3577c = r3
            r0.set(r2)
        L6b:
            e0.n r0 = r5.f2510a0
            java.util.ArrayList r0 = r0.f3575a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0869u c0869u;
        super.onDetachedFromWindow();
        AbstractC0820C abstractC0820C = this.f2493H;
        if (abstractC0820C != null) {
            abstractC0820C.mo2269e();
        }
        setScrollState(0);
        RunnableC0837U runnableC0837U = this.f2508W;
        runnableC0837U.f3422g.removeCallbacks(runnableC0837U);
        runnableC0837U.f3418c.abortAnimation();
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G != null && (c0869u = abstractC0824G.f3365e) != null) {
            c0869u.m2376i();
        }
        this.f2539p = false;
        AbstractC0824G abstractC0824G2 = this.f2531l;
        if (abstractC0824G2 != null) {
            abstractC0824G2.f3367g = false;
            abstractC0824G2.mo1865R(this);
        }
        this.f2540p0.clear();
        removeCallbacks(this.f2542q0);
        this.f2519f.getClass();
        while (C0854f0.f3509d.mo608a() != null) {
        }
        RunnableC0862n runnableC0862n = this.f2510a0;
        if (runnableC0862n != null) {
            runnableC0862n.f3575a.remove(this);
            this.f2510a0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2533m;
        int size = arrayList.size();
        for (int r12 = 0; r12 < size; r12++) {
            ((AbstractC0821D) arrayList.get(r12)).mo2103a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            e0.G r0 = r5.f2531l
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f2547u
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            e0.G r0 = r5.f2531l
            boolean r0 = r0.mo1881e()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            e0.G r3 = r5.f2531l
            boolean r3 = r3.mo1878d()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            e0.G r3 = r5.f2531l
            boolean r3 = r3.mo1881e()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            e0.G r3 = r5.f2531l
            boolean r3 = r3.mo1878d()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f2505T
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f2506U
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.m1918W(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f2547u) {
            return false;
        }
        this.f2537o = null;
        if (m1899B(motionEvent)) {
            m1917V();
            setScrollState(0);
            return true;
        }
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G == null) {
            return false;
        }
        boolean mo1878d = abstractC0824G.mo1878d();
        boolean mo1881e = this.f2531l.mo1881e();
        if (this.f2496K == null) {
            this.f2496K = VelocityTracker.obtain();
        }
        this.f2496K.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f2548v) {
                this.f2548v = false;
            }
            this.f2495J = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f2499N = x2;
            this.f2497L = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f2500O = y2;
            this.f2498M = y2;
            if (this.f2494I == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m1924c0(1);
            }
            int[] r9 = this.f2536n0;
            r9[1] = 0;
            r9[0] = 0;
            int r02 = mo1878d;
            if (mo1881e) {
                r02 = (mo1878d ? 1 : 0) | 2;
            }
            getScrollingChildHelper().m901g(r02, 0);
        } else if (actionMasked == 1) {
            this.f2496K.clear();
            m1924c0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f2495J);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2495J + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f2494I != 1) {
                int r4 = x3 - this.f2497L;
                int r6 = y3 - this.f2498M;
                if (mo1878d == 0 || Math.abs(r4) <= this.f2501P) {
                    z2 = false;
                } else {
                    this.f2499N = x3;
                    z2 = true;
                }
                if (mo1881e && Math.abs(r6) > this.f2501P) {
                    this.f2500O = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m1917V();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f2495J = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2499N = x4;
            this.f2497L = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2500O = y4;
            this.f2498M = y4;
        } else if (actionMasked == 6) {
            m1913R(motionEvent);
        }
        return this.f2494I == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int r2, int r3, int r4, int r5) {
        int r12 = AbstractC0149m.f416a;
        Trace.beginSection("RV OnLayout");
        m1933o();
        Trace.endSection();
        this.f2543r = true;
    }

    @Override // android.view.View
    public final void onMeasure(int r7, int r8) {
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G == null) {
            m1932n(r7, r8);
            return;
        }
        boolean mo1859L = abstractC0824G.mo1859L();
        C0835S c0835s = this.f2514c0;
        if (!mo1859L) {
            if (this.f2541q) {
                this.f2531l.f3362b.m1932n(r7, r8);
                return;
            }
            if (c0835s.f3412k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0873y abstractC0873y = this.f2529k;
            if (abstractC0873y != null) {
                c0835s.f3406e = abstractC0873y.mo2118a();
            } else {
                c0835s.f3406e = 0;
            }
            m1922a0();
            this.f2531l.f3362b.m1932n(r7, r8);
            m1923b0(false);
            c0835s.f3408g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(r7);
        int mode2 = View.MeasureSpec.getMode(r8);
        this.f2531l.f3362b.m1932n(r7, r8);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f2529k == null) {
            return;
        }
        if (c0835s.f3405d == 1) {
            m1934p();
        }
        this.f2531l.m2299q0(r7, r8);
        c0835s.f3410i = true;
        m1935q();
        this.f2531l.m2300s0(r7, r8);
        if (this.f2531l.mo1889v0()) {
            this.f2531l.m2299q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            c0835s.f3410i = true;
            m1935q();
            this.f2531l.m2300s0(r7, r8);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r2, Rect rect) {
        if (m1907L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(r2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0832O)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0832O c0832o = (C0832O) parcelable;
        this.f2513c = c0832o;
        super.onRestoreInstanceState(c0832o.f1263a);
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G == null || (parcelable2 = this.f2513c.f3394c) == null) {
            return;
        }
        abstractC0824G.mo1879d0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0832O c0832o = new C0832O(super.onSaveInstanceState());
        C0832O c0832o2 = this.f2513c;
        if (c0832o2 != null) {
            c0832o.f3394c = c0832o2.f3394c;
        } else {
            AbstractC0824G abstractC0824G = this.f2531l;
            if (abstractC0824G != null) {
                c0832o.f3394c = abstractC0824G.mo1882e0();
            } else {
                c0832o.f3394c = null;
            }
        }
        return c0832o;
    }

    @Override // android.view.View
    public final void onSizeChanged(int r12, int r2, int r3, int r4) {
        super.onSizeChanged(r12, r2, r3, r4);
        if (r12 == r3 && r2 == r4) {
            return;
        }
        this.f2492G = null;
        this.f2490E = null;
        this.f2491F = null;
        this.f2489D = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0213  */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 1209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1934p() {
        /*
            Method dump skipped, instructions count: 1345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1934p():void");
    }

    /* renamed from: q */
    public final void m1935q() {
        m1922a0();
        m1911P();
        C0835S c0835s = this.f2514c0;
        c0835s.m2320a(6);
        this.f2515d.m291b();
        c0835s.f3406e = this.f2529k.mo2118a();
        c0835s.f3404c = 0;
        c0835s.f3408g = false;
        this.f2531l.mo1825b0(this.f2511b, c0835s);
        c0835s.f3407f = false;
        this.f2513c = null;
        c0835s.f3411j = c0835s.f3411j && this.f2493H != null;
        c0835s.f3405d = 4;
        m1912Q(true);
        m1923b0(false);
    }

    /* renamed from: r */
    public final boolean m1936r(int r7, int r8, int[] r9, int[] r10, int r11) {
        return getScrollingChildHelper().m897c(r7, r8, r9, r10, r11);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        AbstractC0838V m1892I = m1892I(view);
        if (m1892I != null) {
            if (m1892I.m2334k()) {
                m1892I.f3433j &= -257;
            } else if (!m1892I.m2339p()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + m1892I + m1943y());
            }
        }
        view.clearAnimation();
        m1892I(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0869u c0869u = this.f2531l.f3365e;
        if ((c0869u == null || !c0869u.f3618e) && !m1907L() && view2 != null) {
            m1916U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f2531l.mo2092k0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f2535n;
        int size = arrayList.size();
        for (int r2 = 0; r2 < size; r2++) {
            ((C0859k) arrayList.get(r2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2545s != 0 || this.f2547u) {
            this.f2546t = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final void m1937s(int r9, int r10, int r11, int r12, int[] r13, int r14, int[] r15) {
        getScrollingChildHelper().m898d(r9, r10, r11, r12, r13, r14, r15);
    }

    @Override // android.view.View
    public final void scrollBy(int r4, int r5) {
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2547u) {
            return;
        }
        boolean mo1878d = abstractC0824G.mo1878d();
        boolean mo1881e = this.f2531l.mo1881e();
        if (mo1878d || mo1881e) {
            if (!mo1878d) {
                r4 = 0;
            }
            if (!mo1881e) {
                r5 = 0;
            }
            m1918W(r4, r5, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int r12, int r2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m1907L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f2549w |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C0840X c0840x) {
        this.f2528j0 = c0840x;
        AbstractC0283P.m779l(this, c0840x);
    }

    public void setAdapter(AbstractC0873y abstractC0873y) {
        setLayoutFrozen(false);
        AbstractC0873y abstractC0873y2 = this.f2529k;
        C2738i c2738i = this.f2509a;
        if (abstractC0873y2 != null) {
            abstractC0873y2.f3636a.unregisterObserver(c2738i);
            this.f2529k.getClass();
        }
        AbstractC0820C abstractC0820C = this.f2493H;
        if (abstractC0820C != null) {
            abstractC0820C.mo2269e();
        }
        AbstractC0824G abstractC0824G = this.f2531l;
        C0830M c0830m = this.f2511b;
        if (abstractC0824G != null) {
            abstractC0824G.m2292g0(c0830m);
            this.f2531l.m2293h0(c0830m);
        }
        c0830m.f3386a.clear();
        c0830m.m2311d();
        C0090v c0090v = this.f2515d;
        c0090v.m300k((ArrayList) c0090v.f288b);
        c0090v.m300k((ArrayList) c0090v.f290d);
        AbstractC0873y abstractC0873y3 = this.f2529k;
        this.f2529k = abstractC0873y;
        if (abstractC0873y != null) {
            abstractC0873y.f3636a.registerObserver(c2738i);
        }
        AbstractC0873y abstractC0873y4 = this.f2529k;
        c0830m.f3386a.clear();
        c0830m.m2311d();
        C0829L m2310c = c0830m.m2310c();
        if (abstractC0873y3 != null) {
            m2310c.f3385b--;
        }
        if (m2310c.f3385b == 0) {
            int r12 = 0;
            while (true) {
                SparseArray sparseArray = m2310c.f3384a;
                if (r12 >= sparseArray.size()) {
                    break;
                }
                ((C0828K) sparseArray.valueAt(r12)).f3380a.clear();
                r12++;
            }
        }
        if (abstractC0873y4 != null) {
            m2310c.f3385b++;
        }
        this.f2514c0.f3407f = true;
        this.f2552z |= false;
        this.f2551y = true;
        int m127v = this.f2517e.m127v();
        for (int r13 = 0; r13 < m127v; r13++) {
            AbstractC0838V m1892I = m1892I(this.f2517e.m126u(r13));
            if (m1892I != null && !m1892I.m2339p()) {
                m1892I.m2324a(6);
            }
        }
        m1909N();
        C0830M c0830m2 = this.f2511b;
        ArrayList arrayList = c0830m2.f3388c;
        int size = arrayList.size();
        for (int r02 = 0; r02 < size; r02++) {
            AbstractC0838V abstractC0838V = (AbstractC0838V) arrayList.get(r02);
            if (abstractC0838V != null) {
                abstractC0838V.m2324a(6);
                abstractC0838V.m2324a(1024);
            }
        }
        AbstractC0873y abstractC0873y5 = c0830m2.f3393h.f2529k;
        if (abstractC0873y5 == null || !abstractC0873y5.f3637b) {
            c0830m2.m2311d();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0818A interfaceC0818A) {
        if (interfaceC0818A == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f2521g) {
            this.f2492G = null;
            this.f2490E = null;
            this.f2491F = null;
            this.f2489D = null;
        }
        this.f2521g = z2;
        super.setClipToPadding(z2);
        if (this.f2543r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0819B c0819b) {
        c0819b.getClass();
        this.f2488C = c0819b;
        this.f2492G = null;
        this.f2490E = null;
        this.f2491F = null;
        this.f2489D = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f2541q = z2;
    }

    public void setItemAnimator(AbstractC0820C abstractC0820C) {
        AbstractC0820C abstractC0820C2 = this.f2493H;
        if (abstractC0820C2 != null) {
            abstractC0820C2.mo2269e();
            this.f2493H.f3349a = null;
        }
        this.f2493H = abstractC0820C;
        if (abstractC0820C != null) {
            abstractC0820C.f3349a = this.f2524h0;
        }
    }

    public void setItemViewCacheSize(int r2) {
        C0830M c0830m = this.f2511b;
        c0830m.f3390e = r2;
        c0830m.m2318k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(AbstractC0824G abstractC0824G) {
        RecyclerView recyclerView;
        C0869u c0869u;
        if (abstractC0824G == this.f2531l) {
            return;
        }
        setScrollState(0);
        RunnableC0837U runnableC0837U = this.f2508W;
        runnableC0837U.f3422g.removeCallbacks(runnableC0837U);
        runnableC0837U.f3418c.abortAnimation();
        AbstractC0824G abstractC0824G2 = this.f2531l;
        if (abstractC0824G2 != null && (c0869u = abstractC0824G2.f3365e) != null) {
            c0869u.m2376i();
        }
        AbstractC0824G abstractC0824G3 = this.f2531l;
        C0830M c0830m = this.f2511b;
        if (abstractC0824G3 != null) {
            AbstractC0820C abstractC0820C = this.f2493H;
            if (abstractC0820C != null) {
                abstractC0820C.mo2269e();
            }
            this.f2531l.m2292g0(c0830m);
            this.f2531l.m2293h0(c0830m);
            c0830m.f3386a.clear();
            c0830m.m2311d();
            if (this.f2539p) {
                AbstractC0824G abstractC0824G4 = this.f2531l;
                abstractC0824G4.f3367g = false;
                abstractC0824G4.mo1865R(this);
            }
            this.f2531l.m2301t0(null);
            this.f2531l = null;
        } else {
            c0830m.f3386a.clear();
            c0830m.m2311d();
        }
        C0015h c0015h = this.f2517e;
        ((C0209a) c0015h.f26c).m603h();
        ArrayList arrayList = (ArrayList) c0015h.f27d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C0872x) c0015h.f25b).f3635a;
            if (size < 0) {
                break;
            }
            AbstractC0838V m1892I = m1892I((View) arrayList.get(size));
            if (m1892I != null) {
                int r8 = m1892I.f3439p;
                if (recyclerView.m1907L()) {
                    m1892I.f3440q = r8;
                    recyclerView.f2540p0.add(m1892I);
                } else {
                    WeakHashMap weakHashMap = AbstractC0283P.f842a;
                    m1892I.f3424a.setImportantForAccessibility(r8);
                }
                m1892I.f3439p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int r12 = 0; r12 < childCount; r12++) {
            View childAt = recyclerView.getChildAt(r12);
            m1892I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f2531l = abstractC0824G;
        if (abstractC0824G != null) {
            if (abstractC0824G.f3362b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0824G + " is already attached to a RecyclerView:" + abstractC0824G.f3362b.m1943y());
            }
            abstractC0824G.m2301t0(this);
            if (this.f2539p) {
                AbstractC0824G abstractC0824G5 = this.f2531l;
                abstractC0824G5.f3367g = true;
                abstractC0824G5.mo2091Q(this);
            }
        }
        c0830m.m2318k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0317m scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f910d) {
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            AbstractC0272E.m722z(scrollingChildHelper.f909c);
        }
        scrollingChildHelper.f910d = z2;
    }

    public void setOnFlingListener(AbstractC0826I abstractC0826I) {
        this.f2502Q = abstractC0826I;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0827J abstractC0827J) {
        this.f2516d0 = abstractC0827J;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f2507V = z2;
    }

    public void setRecycledViewPool(C0829L c0829l) {
        C0830M c0830m = this.f2511b;
        if (c0830m.f3392g != null) {
            r1.f3385b--;
        }
        c0830m.f3392g = c0829l;
        if (c0829l == null || c0830m.f3393h.getAdapter() == null) {
            return;
        }
        c0830m.f3392g.f3385b++;
    }

    public void setScrollState(int r3) {
        C0869u c0869u;
        if (r3 == this.f2494I) {
            return;
        }
        this.f2494I = r3;
        if (r3 != 2) {
            RunnableC0837U runnableC0837U = this.f2508W;
            runnableC0837U.f3422g.removeCallbacks(runnableC0837U);
            runnableC0837U.f3418c.abortAnimation();
            AbstractC0824G abstractC0824G = this.f2531l;
            if (abstractC0824G != null && (c0869u = abstractC0824G.f3365e) != null) {
                c0869u.m2376i();
            }
        }
        AbstractC0824G abstractC0824G2 = this.f2531l;
        if (abstractC0824G2 != null) {
            abstractC0824G2.mo1977f0(r3);
        }
        AbstractC0827J abstractC0827J = this.f2516d0;
        if (abstractC0827J != null) {
            abstractC0827J.mo2104a(this, r3);
        }
        ArrayList arrayList = this.f2518e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0827J) this.f2518e0.get(size)).mo2104a(this, r3);
            }
        }
    }

    public void setScrollingTouchSlop(int r4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (r4 != 0) {
            if (r4 == 1) {
                this.f2501P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + r4 + "; using default value");
        }
        this.f2501P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0836T abstractC0836T) {
        this.f2511b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int r3) {
        return getScrollingChildHelper().m901g(r3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m902h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        C0869u c0869u;
        if (z2 != this.f2547u) {
            m1928i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f2547u = false;
                if (this.f2546t && this.f2531l != null && this.f2529k != null) {
                    requestLayout();
                }
                this.f2546t = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2547u = true;
            this.f2548v = true;
            setScrollState(0);
            RunnableC0837U runnableC0837U = this.f2508W;
            runnableC0837U.f3422g.removeCallbacks(runnableC0837U);
            runnableC0837U.f3418c.abortAnimation();
            AbstractC0824G abstractC0824G = this.f2531l;
            if (abstractC0824G == null || (c0869u = abstractC0824G.f3365e) == null) {
                return;
            }
            c0869u.m2376i();
        }
    }

    /* renamed from: t */
    public final void m1938t(int r5, int r6) {
        this.f2487B++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - r5, scrollY - r6);
        AbstractC0827J abstractC0827J = this.f2516d0;
        if (abstractC0827J != null) {
            abstractC0827J.mo2105b(this, r5, r6);
        }
        ArrayList arrayList = this.f2518e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0827J) this.f2518e0.get(size)).mo2105b(this, r5, r6);
            }
        }
        this.f2487B--;
    }

    /* renamed from: u */
    public final void m1939u() {
        if (this.f2492G != null) {
            return;
        }
        this.f2488C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2492G = edgeEffect;
        if (this.f2521g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: v */
    public final void m1940v() {
        if (this.f2489D != null) {
            return;
        }
        this.f2488C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2489D = edgeEffect;
        if (this.f2521g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: w */
    public final void m1941w() {
        if (this.f2491F != null) {
            return;
        }
        this.f2488C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2491F = edgeEffect;
        if (this.f2521g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: x */
    public final void m1942x() {
        if (this.f2490E != null) {
            return;
        }
        this.f2488C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2490E = edgeEffect;
        if (this.f2521g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: y */
    public final String m1943y() {
        return " " + super.toString() + ", adapter:" + this.f2529k + ", layout:" + this.f2531l + ", context:" + getContext();
    }

    /* renamed from: z */
    public final void m1944z(C0835S c0835s) {
        if (getScrollState() != 2) {
            c0835s.getClass();
            return;
        }
        OverScroller overScroller = this.f2508W.f3418c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c0835s.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x03d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RecyclerView(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0824G abstractC0824G = this.f2531l;
        if (abstractC0824G != null) {
            return abstractC0824G.mo1846t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1943y());
    }

    public void setRecyclerListener(InterfaceC0831N interfaceC0831N) {
    }
}
