package p080e0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p002A1.C0015h;
import p010D0.C0109g;
import p024I1.C0209a;
import p028K.AbstractC0283P;
import p031L.C0355i;
import p031L.C0356j;
import p077d0.AbstractC0781a;

/* renamed from: e0.G */
/* loaded from: classes.dex */
public abstract class AbstractC0824G {

    /* renamed from: a */
    public C0015h f3361a;

    /* renamed from: b */
    public RecyclerView f3362b;

    /* renamed from: c */
    public final C0109g f3363c;

    /* renamed from: d */
    public final C0109g f3364d;

    /* renamed from: e */
    public C0869u f3365e;

    /* renamed from: f */
    public boolean f3366f;

    /* renamed from: g */
    public boolean f3367g;

    /* renamed from: h */
    public final boolean f3368h;

    /* renamed from: i */
    public final boolean f3369i;

    /* renamed from: j */
    public int f3370j;

    /* renamed from: k */
    public boolean f3371k;

    /* renamed from: l */
    public int f3372l;

    /* renamed from: m */
    public int f3373m;

    /* renamed from: n */
    public int f3374n;

    /* renamed from: o */
    public int f3375o;

    public AbstractC0824G() {
        C0822E c0822e = new C0822E(this, 0);
        C0822E c0822e2 = new C0822E(this, 1);
        this.f3363c = new C0109g(c0822e);
        this.f3364d = new C0109g(c0822e2);
        this.f3366f = false;
        this.f3367g = false;
        this.f3368h = true;
        this.f3369i = true;
    }

    /* renamed from: A */
    public static int m2275A(View view) {
        Rect rect = ((C0825H) view.getLayoutParams()).f3377b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* renamed from: H */
    public static int m2276H(View view) {
        return ((C0825H) view.getLayoutParams()).f3376a.m2325b();
    }

    /* renamed from: I */
    public static C0823F m2277I(Context context, AttributeSet attributeSet, int r4, int r5) {
        C0823F c0823f = new C0823F();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0781a.f3140a, r4, r5);
        c0823f.f3357a = obtainStyledAttributes.getInt(0, 1);
        c0823f.f3358b = obtainStyledAttributes.getInt(10, 1);
        c0823f.f3359c = obtainStyledAttributes.getBoolean(9, false);
        c0823f.f3360d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return c0823f;
    }

    /* renamed from: M */
    public static boolean m2278M(int r3, int r4, int r5) {
        int mode = View.MeasureSpec.getMode(r4);
        int size = View.MeasureSpec.getSize(r4);
        if (r5 > 0 && r3 != r5) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= r3;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == r3;
        }
        return true;
    }

    /* renamed from: N */
    public static void m2279N(View view, int r4, int r5, int r6, int r7) {
        C0825H c0825h = (C0825H) view.getLayoutParams();
        Rect rect = c0825h.f3377b;
        view.layout(r4 + rect.left + ((ViewGroup.MarginLayoutParams) c0825h).leftMargin, r5 + rect.top + ((ViewGroup.MarginLayoutParams) c0825h).topMargin, (r6 - rect.right) - ((ViewGroup.MarginLayoutParams) c0825h).rightMargin, (r7 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0825h).bottomMargin);
    }

    /* renamed from: g */
    public static int m2280g(int r2, int r3, int r4) {
        int mode = View.MeasureSpec.getMode(r2);
        int size = View.MeasureSpec.getSize(r2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(r3, r4) : size : Math.min(size, Math.max(r3, r4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m2281w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p080e0.AbstractC0824G.m2281w(boolean, int, int, int, int):int");
    }

    /* renamed from: z */
    public static int m2282z(View view) {
        Rect rect = ((C0825H) view.getLayoutParams()).f3377b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* renamed from: B */
    public final int m2283B() {
        RecyclerView recyclerView = this.f3362b;
        AbstractC0873y adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo2118a();
        }
        return 0;
    }

    /* renamed from: C */
    public final int m2284C() {
        RecyclerView recyclerView = this.f3362b;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        return recyclerView.getLayoutDirection();
    }

    /* renamed from: D */
    public final int m2285D() {
        RecyclerView recyclerView = this.f3362b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: E */
    public final int m2286E() {
        RecyclerView recyclerView = this.f3362b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* renamed from: F */
    public final int m2287F() {
        RecyclerView recyclerView = this.f3362b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* renamed from: G */
    public final int m2288G() {
        RecyclerView recyclerView = this.f3362b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* renamed from: J */
    public int mo1813J(C0830M c0830m, C0835S c0835s) {
        RecyclerView recyclerView = this.f3362b;
        if (recyclerView == null || recyclerView.f2529k == null || !mo1881e()) {
            return 1;
        }
        return this.f3362b.f2529k.mo2118a();
    }

    /* renamed from: K */
    public final void m2289K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C0825H) view.getLayoutParams()).f3377b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f3362b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f3362b.f2527j;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* renamed from: L */
    public abstract boolean mo1859L();

    /* renamed from: O */
    public void mo1960O(int r5) {
        RecyclerView recyclerView = this.f3362b;
        if (recyclerView != null) {
            int m118m = recyclerView.f2517e.m118m();
            for (int r2 = 0; r2 < m118m; r2++) {
                recyclerView.f2517e.m117l(r2).offsetLeftAndRight(r5);
            }
        }
    }

    /* renamed from: P */
    public void mo1962P(int r5) {
        RecyclerView recyclerView = this.f3362b;
        if (recyclerView != null) {
            int m118m = recyclerView.f2517e.m118m();
            for (int r2 = 0; r2 < m118m; r2++) {
                recyclerView.f2517e.m117l(r2).offsetTopAndBottom(r5);
            }
        }
    }

    /* renamed from: R */
    public abstract void mo1865R(RecyclerView recyclerView);

    /* renamed from: S */
    public abstract View mo1815S(View view, int r2, C0830M c0830m, C0835S c0835s);

    /* renamed from: T */
    public void mo1868T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f3362b;
        C0830M c0830m = recyclerView.f2511b;
        C0835S c0835s = recyclerView.f2514c0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f3362b.canScrollVertically(-1) && !this.f3362b.canScrollHorizontally(-1) && !this.f3362b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        AbstractC0873y abstractC0873y = this.f3362b.f2529k;
        if (abstractC0873y != null) {
            accessibilityEvent.setItemCount(abstractC0873y.mo2118a());
        }
    }

    /* renamed from: U */
    public final void m2290U(View view, C0356j c0356j) {
        AbstractC0838V m1892I = RecyclerView.m1892I(view);
        if (m1892I == null || m1892I.m2332i() || ((ArrayList) this.f3361a.f27d).contains(m1892I.f3424a)) {
            return;
        }
        RecyclerView recyclerView = this.f3362b;
        mo1818V(recyclerView.f2511b, recyclerView.f2514c0, view, c0356j);
    }

    /* renamed from: V */
    public void mo1818V(C0830M c0830m, C0835S c0835s, View view, C0356j c0356j) {
        c0356j.m1032i(C0355i.m1023a(false, mo1881e() ? m2276H(view) : 0, 1, mo1878d() ? m2276H(view) : 0, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2291b(android.view.View r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p080e0.AbstractC0824G.m2291b(android.view.View, int, boolean):void");
    }

    /* renamed from: b0 */
    public abstract void mo1825b0(C0830M c0830m, C0835S c0835s);

    /* renamed from: c */
    public void mo1876c(String str) {
        RecyclerView recyclerView = this.f3362b;
        if (recyclerView != null) {
            recyclerView.m1928i(str);
        }
    }

    /* renamed from: c0 */
    public abstract void mo1826c0(C0835S c0835s);

    /* renamed from: d */
    public abstract boolean mo1878d();

    /* renamed from: e */
    public abstract boolean mo1881e();

    /* renamed from: e0 */
    public Parcelable mo1882e0() {
        return null;
    }

    /* renamed from: f */
    public boolean mo1828f(C0825H c0825h) {
        return c0825h != null;
    }

    /* renamed from: g0 */
    public final void m2292g0(C0830M c0830m) {
        for (int m2304v = m2304v() - 1; m2304v >= 0; m2304v--) {
            if (!RecyclerView.m1892I(m2302u(m2304v)).m2339p()) {
                View m2302u = m2302u(m2304v);
                m2295j0(m2304v);
                c0830m.m2313f(m2302u);
            }
        }
    }

    /* renamed from: h0 */
    public final void m2293h0(C0830M c0830m) {
        ArrayList arrayList;
        int size = c0830m.f3386a.size();
        int r12 = size - 1;
        while (true) {
            arrayList = c0830m.f3386a;
            if (r12 < 0) {
                break;
            }
            View view = ((AbstractC0838V) arrayList.get(r12)).f3424a;
            AbstractC0838V m1892I = RecyclerView.m1892I(view);
            if (!m1892I.m2339p()) {
                m1892I.m2338o(false);
                if (m1892I.m2334k()) {
                    this.f3362b.removeDetachedView(view, false);
                }
                AbstractC0820C abstractC0820C = this.f3362b.f2493H;
                if (abstractC0820C != null) {
                    abstractC0820C.mo2268d(m1892I);
                }
                m1892I.m2338o(true);
                AbstractC0838V m1892I2 = RecyclerView.m1892I(view);
                m1892I2.f3437n = null;
                m1892I2.f3438o = false;
                m1892I2.f3433j &= -33;
                c0830m.m2314g(m1892I2);
            }
            r12--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c0830m.f3387b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f3362b.invalidate();
        }
    }

    /* renamed from: i0 */
    public final void m2294i0(View view, C0830M c0830m) {
        C0015h c0015h = this.f3361a;
        C0872x c0872x = (C0872x) c0015h.f25b;
        int indexOfChild = c0872x.f3635a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((C0209a) c0015h.f26c).m602g(indexOfChild)) {
                c0015h.m104E(view);
            }
            c0872x.m2390h(indexOfChild);
        }
        c0830m.m2313f(view);
    }

    /* renamed from: j */
    public abstract int mo1885j(C0835S c0835s);

    /* renamed from: j0 */
    public final void m2295j0(int r5) {
        if (m2302u(r5) != null) {
            C0015h c0015h = this.f3361a;
            int m125t = c0015h.m125t(r5);
            C0872x c0872x = (C0872x) c0015h.f25b;
            View childAt = c0872x.f3635a.getChildAt(m125t);
            if (childAt == null) {
                return;
            }
            if (((C0209a) c0015h.f26c).m602g(m125t)) {
                c0015h.m104E(childAt);
            }
            c0872x.m2390h(m125t);
        }
    }

    /* renamed from: k */
    public abstract int mo1834k(C0835S c0835s);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo2092k0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.m2286E()
            int r1 = r8.m2288G()
            int r2 = r8.f3374n
            int r3 = r8.m2287F()
            int r2 = r2 - r3
            int r3 = r8.f3375o
            int r4 = r8.m2285D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.m2284C()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.m2286E()
            int r2 = r8.m2288G()
            int r3 = r8.f3374n
            int r4 = r8.m2287F()
            int r3 = r3 - r4
            int r4 = r8.f3375o
            int r5 = r8.m2285D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f3362b
            android.graphics.Rect r5 = r5.f2523h
            r8.mo2093y(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            goto Lbd
        Lba:
            r9.m1921Z(r11, r10, r0)
        Lbd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p080e0.AbstractC0824G.mo2092k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    /* renamed from: l */
    public abstract int mo1836l(C0835S c0835s);

    /* renamed from: l0 */
    public final void m2296l0() {
        RecyclerView recyclerView = this.f3362b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* renamed from: m */
    public abstract int mo1886m(C0835S c0835s);

    /* renamed from: m0 */
    public abstract int mo1838m0(int r12, C0830M c0830m, C0835S c0835s);

    /* renamed from: n */
    public abstract int mo1840n(C0835S c0835s);

    /* renamed from: n0 */
    public abstract void mo1887n0(int r12);

    /* renamed from: o */
    public abstract int mo1841o(C0835S c0835s);

    /* renamed from: o0 */
    public abstract int mo1842o0(int r12, C0830M c0830m, C0835S c0835s);

    /* renamed from: p */
    public final void m2297p(C0830M c0830m) {
        for (int m2304v = m2304v() - 1; m2304v >= 0; m2304v--) {
            View m2302u = m2302u(m2304v);
            AbstractC0838V m1892I = RecyclerView.m1892I(m2302u);
            if (!m1892I.m2339p()) {
                if (!m1892I.m2330g() || m1892I.m2332i() || this.f3362b.f2529k.f3637b) {
                    m2302u(m2304v);
                    this.f3361a.m113h(m2304v);
                    c0830m.m2315h(m2302u);
                    this.f3362b.f2519f.m387k(m1892I);
                } else {
                    m2295j0(m2304v);
                    c0830m.m2314g(m1892I);
                }
            }
        }
    }

    /* renamed from: p0 */
    public final void m2298p0(RecyclerView recyclerView) {
        m2299q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* renamed from: q */
    public View mo1888q(int r6) {
        int m2304v = m2304v();
        for (int r12 = 0; r12 < m2304v; r12++) {
            View m2302u = m2302u(r12);
            AbstractC0838V m1892I = RecyclerView.m1892I(m2302u);
            if (m1892I != null && m1892I.m2325b() == r6 && !m1892I.m2339p() && (this.f3362b.f2514c0.f3408g || !m1892I.m2332i())) {
                return m2302u;
            }
        }
        return null;
    }

    /* renamed from: q0 */
    public final void m2299q0(int r2, int r3) {
        this.f3374n = View.MeasureSpec.getSize(r2);
        int mode = View.MeasureSpec.getMode(r2);
        this.f3372l = mode;
        if (mode == 0) {
            int[] r22 = RecyclerView.f2483s0;
        }
        this.f3375o = View.MeasureSpec.getSize(r3);
        int mode2 = View.MeasureSpec.getMode(r3);
        this.f3373m = mode2;
        if (mode2 == 0) {
            int[] r23 = RecyclerView.f2483s0;
        }
    }

    /* renamed from: r */
    public abstract C0825H mo1843r();

    /* renamed from: r0 */
    public void mo1844r0(Rect rect, int r5, int r6) {
        int m2287F = m2287F() + m2286E() + rect.width();
        int m2285D = m2285D() + m2288G() + rect.height();
        RecyclerView recyclerView = this.f3362b;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        this.f3362b.setMeasuredDimension(m2280g(r5, m2287F, recyclerView.getMinimumWidth()), m2280g(r6, m2285D, this.f3362b.getMinimumHeight()));
    }

    /* renamed from: s */
    public C0825H mo1845s(Context context, AttributeSet attributeSet) {
        return new C0825H(context, attributeSet);
    }

    /* renamed from: s0 */
    public final void m2300s0(int r9, int r10) {
        int m2304v = m2304v();
        if (m2304v == 0) {
            this.f3362b.m1932n(r9, r10);
            return;
        }
        int r12 = Integer.MIN_VALUE;
        int r4 = Integer.MAX_VALUE;
        int r2 = Integer.MIN_VALUE;
        int r3 = Integer.MAX_VALUE;
        for (int r5 = 0; r5 < m2304v; r5++) {
            View m2302u = m2302u(r5);
            Rect rect = this.f3362b.f2523h;
            mo2093y(m2302u, rect);
            int r6 = rect.left;
            if (r6 < r3) {
                r3 = r6;
            }
            int r62 = rect.right;
            if (r62 > r12) {
                r12 = r62;
            }
            int r63 = rect.top;
            if (r63 < r4) {
                r4 = r63;
            }
            int r64 = rect.bottom;
            if (r64 > r2) {
                r2 = r64;
            }
        }
        this.f3362b.f2523h.set(r3, r4, r12, r2);
        mo1844r0(this.f3362b.f2523h, r9, r10);
    }

    /* renamed from: t */
    public C0825H mo1846t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0825H ? new C0825H((C0825H) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0825H((ViewGroup.MarginLayoutParams) layoutParams) : new C0825H(layoutParams);
    }

    /* renamed from: t0 */
    public final void m2301t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f3362b = null;
            this.f3361a = null;
            this.f3374n = 0;
            this.f3375o = 0;
        } else {
            this.f3362b = recyclerView;
            this.f3361a = recyclerView.f2517e;
            this.f3374n = recyclerView.getWidth();
            this.f3375o = recyclerView.getHeight();
        }
        this.f3372l = 1073741824;
        this.f3373m = 1073741824;
    }

    /* renamed from: u */
    public final View m2302u(int r2) {
        C0015h c0015h = this.f3361a;
        if (c0015h != null) {
            return c0015h.m117l(r2);
        }
        return null;
    }

    /* renamed from: u0 */
    public final boolean m2303u0(View view, int r4, int r5, C0825H c0825h) {
        return (!view.isLayoutRequested() && this.f3368h && m2278M(view.getWidth(), r4, ((ViewGroup.MarginLayoutParams) c0825h).width) && m2278M(view.getHeight(), r5, ((ViewGroup.MarginLayoutParams) c0825h).height)) ? false : true;
    }

    /* renamed from: v */
    public final int m2304v() {
        C0015h c0015h = this.f3361a;
        if (c0015h != null) {
            return c0015h.m118m();
        }
        return 0;
    }

    /* renamed from: v0 */
    public boolean mo1889v0() {
        return false;
    }

    /* renamed from: w0 */
    public final boolean m2305w0(View view, int r4, int r5, C0825H c0825h) {
        return (this.f3368h && m2278M(view.getMeasuredWidth(), r4, ((ViewGroup.MarginLayoutParams) c0825h).width) && m2278M(view.getMeasuredHeight(), r5, ((ViewGroup.MarginLayoutParams) c0825h).height)) ? false : true;
    }

    /* renamed from: x */
    public int mo1847x(C0830M c0830m, C0835S c0835s) {
        RecyclerView recyclerView = this.f3362b;
        if (recyclerView == null || recyclerView.f2529k == null || !mo1878d()) {
            return 1;
        }
        return this.f3362b.f2529k.mo2118a();
    }

    /* renamed from: x0 */
    public abstract void mo1890x0(RecyclerView recyclerView, int r2);

    /* renamed from: y */
    public void mo2093y(View view, Rect rect) {
        int[] r02 = RecyclerView.f2483s0;
        C0825H c0825h = (C0825H) view.getLayoutParams();
        Rect rect2 = c0825h.f3377b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0825h).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0825h).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0825h).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0825h).bottomMargin);
    }

    /* renamed from: y0 */
    public final void m2306y0(C0869u c0869u) {
        C0869u c0869u2 = this.f3365e;
        if (c0869u2 != null && c0869u != c0869u2 && c0869u2.f3618e) {
            c0869u2.m2376i();
        }
        this.f3365e = c0869u;
        RecyclerView recyclerView = this.f3362b;
        RunnableC0837U runnableC0837U = recyclerView.f2508W;
        runnableC0837U.f3422g.removeCallbacks(runnableC0837U);
        runnableC0837U.f3418c.abortAnimation();
        if (c0869u.f3621h) {
            Log.w("RecyclerView", "An instance of " + c0869u.getClass().getSimpleName() + " was started more than once. Each instance of" + c0869u.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0869u.f3615b = recyclerView;
        c0869u.f3616c = this;
        int r12 = c0869u.f3614a;
        if (r12 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f2514c0.f3402a = r12;
        c0869u.f3618e = true;
        c0869u.f3617d = true;
        c0869u.f3619f = recyclerView.f2531l.mo1888q(r12);
        c0869u.f3615b.f2508W.m2322a();
        c0869u.f3621h = true;
    }

    /* renamed from: z0 */
    public boolean mo1848z0() {
        return false;
    }

    /* renamed from: X */
    public void mo1820X() {
    }

    /* renamed from: Q */
    public void mo2091Q(RecyclerView recyclerView) {
    }

    /* renamed from: d0 */
    public void mo1879d0(Parcelable parcelable) {
    }

    /* renamed from: f0 */
    public void mo1977f0(int r12) {
    }

    /* renamed from: W */
    public void mo1819W(int r12, int r2) {
    }

    /* renamed from: Y */
    public void mo1821Y(int r12, int r2) {
    }

    /* renamed from: Z */
    public void mo1822Z(int r12, int r2) {
    }

    /* renamed from: a0 */
    public void mo1823a0(int r12, int r2) {
    }

    /* renamed from: i */
    public void mo1884i(int r12, C0860l c0860l) {
    }

    /* renamed from: h */
    public void mo1883h(int r12, int r2, C0835S c0835s, C0860l c0860l) {
    }
}
