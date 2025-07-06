package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p010D0.C0109g;
import p028K.AbstractC0283P;
import p031L.C0355i;
import p031L.C0356j;
import p080e0.AbstractC0824G;
import p080e0.C0825H;
import p080e0.C0830M;
import p080e0.C0835S;
import p080e0.C0860l;
import p080e0.C0863o;
import p080e0.C0865q;
import p080e0.C0867s;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E */
    public boolean f2460E;

    /* renamed from: F */
    public int f2461F;

    /* renamed from: G */
    public int[] f2462G;

    /* renamed from: H */
    public View[] f2463H;

    /* renamed from: I */
    public final SparseIntArray f2464I;

    /* renamed from: J */
    public final SparseIntArray f2465J;

    /* renamed from: K */
    public final C0109g f2466K;

    /* renamed from: L */
    public final Rect f2467L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int r4, int r5) {
        super(context, attributeSet, r4, r5);
        this.f2460E = false;
        this.f2461F = -1;
        this.f2464I = new SparseIntArray();
        this.f2465J = new SparseIntArray();
        this.f2466K = new C0109g();
        this.f2467L = new Rect();
        m1837l1(AbstractC0824G.m2277I(context, attributeSet, r4, r5).f3358b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: B0 */
    public final void mo1812B0(C0835S c0835s, C0867s c0867s, C0860l c0860l) {
        int r3;
        int r02 = this.f2461F;
        for (int r2 = 0; r2 < this.f2461F && (r3 = c0867s.f3602d) >= 0 && r3 < c0835s.m2321b() && r02 > 0; r2++) {
            c0860l.m2363a(c0867s.f3602d, Math.max(0, c0867s.f3605g));
            this.f2466K.getClass();
            r02--;
            c0867s.f3602d += c0867s.f3603e;
        }
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: J */
    public final int mo1813J(C0830M c0830m, C0835S c0835s) {
        if (this.f2472p == 0) {
            return this.f2461F;
        }
        if (c0835s.m2321b() < 1) {
            return 0;
        }
        return m1831h1(c0835s.m2321b() - 1, c0830m, c0835s) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: N0 */
    public final View mo1814N0(C0830M c0830m, C0835S c0835s, int r10, int r11, int r12) {
        m1854G0();
        int mo1623k = this.f2474r.mo1623k();
        int mo1619g = this.f2474r.mo1619g();
        int r2 = r11 > r10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (r10 != r11) {
            View m2302u = m2302u(r10);
            int m2276H = AbstractC0824G.m2276H(m2302u);
            if (m2276H >= 0 && m2276H < r12 && m1832i1(m2276H, c0830m, c0835s) == 0) {
                if (((C0825H) m2302u.getLayoutParams()).f3376a.m2332i()) {
                    if (view2 == null) {
                        view2 = m2302u;
                    }
                } else {
                    if (this.f2474r.mo1617e(m2302u) < mo1619g && this.f2474r.mo1614b(m2302u) >= mo1623k) {
                        return m2302u;
                    }
                    if (view == null) {
                        view = m2302u;
                    }
                }
            }
            r10 += r2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e1, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0103, code lost:
    
        if (r13 == (r2 > r8)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0022, code lost:
    
        if (((java.util.ArrayList) r22.f3361a.f27d).contains(r3) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p080e0.AbstractC0824G
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo1815S(android.view.View r23, int r24, p080e0.C0830M r25, p080e0.C0835S r26) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo1815S(android.view.View, int, e0.M, e0.S):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.f3596b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v38 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1816T0(p080e0.C0830M r19, p080e0.C0835S r20, p080e0.C0867s r21, p080e0.C0866r r22) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo1816T0(e0.M, e0.S, e0.s, e0.r):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: U0 */
    public final void mo1817U0(C0830M c0830m, C0835S c0835s, C0865q c0865q, int r8) {
        m1839m1();
        if (c0835s.m2321b() > 0 && !c0835s.f3408g) {
            boolean z2 = r8 == 1;
            int m1832i1 = m1832i1(c0865q.f3591b, c0830m, c0835s);
            if (z2) {
                while (m1832i1 > 0) {
                    int r82 = c0865q.f3591b;
                    if (r82 <= 0) {
                        break;
                    }
                    int r83 = r82 - 1;
                    c0865q.f3591b = r83;
                    m1832i1 = m1832i1(r83, c0830m, c0835s);
                }
            } else {
                int m2321b = c0835s.m2321b() - 1;
                int r02 = c0865q.f3591b;
                while (r02 < m2321b) {
                    int r2 = r02 + 1;
                    int m1832i12 = m1832i1(r2, c0830m, c0835s);
                    if (m1832i12 <= m1832i1) {
                        break;
                    }
                    r02 = r2;
                    m1832i1 = m1832i12;
                }
                c0865q.f3591b = r02;
            }
        }
        m1829f1();
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: V */
    public final void mo1818V(C0830M c0830m, C0835S c0835s, View view, C0356j c0356j) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0863o)) {
            m2290U(view, c0356j);
            return;
        }
        C0863o c0863o = (C0863o) layoutParams;
        int m1831h1 = m1831h1(c0863o.f3376a.m2325b(), c0830m, c0835s);
        if (this.f2472p == 0) {
            c0356j.m1032i(C0355i.m1023a(false, c0863o.f3579e, c0863o.f3580f, m1831h1, 1));
        } else {
            c0356j.m1032i(C0355i.m1023a(false, m1831h1, 1, c0863o.f3579e, c0863o.f3580f));
        }
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: W */
    public final void mo1819W(int r12, int r2) {
        C0109g c0109g = this.f2466K;
        c0109g.m346A();
        ((SparseIntArray) c0109g.f339c).clear();
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: X */
    public final void mo1820X() {
        C0109g c0109g = this.f2466K;
        c0109g.m346A();
        ((SparseIntArray) c0109g.f339c).clear();
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: Y */
    public final void mo1821Y(int r12, int r2) {
        C0109g c0109g = this.f2466K;
        c0109g.m346A();
        ((SparseIntArray) c0109g.f339c).clear();
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: Z */
    public final void mo1822Z(int r12, int r2) {
        C0109g c0109g = this.f2466K;
        c0109g.m346A();
        ((SparseIntArray) c0109g.f339c).clear();
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: a0 */
    public final void mo1823a0(int r12, int r2) {
        C0109g c0109g = this.f2466K;
        c0109g.m346A();
        ((SparseIntArray) c0109g.f339c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a1 */
    public final void mo1824a1(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo1824a1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p080e0.AbstractC0824G
    /* renamed from: b0 */
    public final void mo1825b0(C0830M c0830m, C0835S c0835s) {
        boolean z2 = c0835s.f3408g;
        SparseIntArray sparseIntArray = this.f2465J;
        SparseIntArray sparseIntArray2 = this.f2464I;
        if (z2) {
            int m2304v = m2304v();
            for (int r3 = 0; r3 < m2304v; r3++) {
                C0863o c0863o = (C0863o) m2302u(r3).getLayoutParams();
                int m2325b = c0863o.f3376a.m2325b();
                sparseIntArray2.put(m2325b, c0863o.f3580f);
                sparseIntArray.put(m2325b, c0863o.f3579e);
            }
        }
        super.mo1825b0(c0830m, c0835s);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p080e0.AbstractC0824G
    /* renamed from: c0 */
    public final void mo1826c0(C0835S c0835s) {
        super.mo1826c0(c0835s);
        this.f2460E = false;
    }

    /* renamed from: e1 */
    public final void m1827e1(int r8) {
        int r6;
        int[] r02 = this.f2462G;
        int r12 = this.f2461F;
        if (r02 == null || r02.length != r12 + 1 || r02[r02.length - 1] != r8) {
            r02 = new int[r12 + 1];
        }
        int r3 = 0;
        r02[0] = 0;
        int r4 = r8 / r12;
        int r82 = r8 % r12;
        int r5 = 0;
        for (int r2 = 1; r2 <= r12; r2++) {
            r3 += r82;
            if (r3 <= 0 || r12 - r3 >= r82) {
                r6 = r4;
            } else {
                r6 = r4 + 1;
                r3 -= r12;
            }
            r5 += r6;
            r02[r2] = r5;
        }
        this.f2462G = r02;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: f */
    public final boolean mo1828f(C0825H c0825h) {
        return c0825h instanceof C0863o;
    }

    /* renamed from: f1 */
    public final void m1829f1() {
        View[] viewArr = this.f2463H;
        if (viewArr == null || viewArr.length != this.f2461F) {
            this.f2463H = new View[this.f2461F];
        }
    }

    /* renamed from: g1 */
    public final int m1830g1(int r4, int r5) {
        if (this.f2472p != 1 || !m1867S0()) {
            int[] r02 = this.f2462G;
            return r02[r5 + r4] - r02[r4];
        }
        int[] r03 = this.f2462G;
        int r12 = this.f2461F;
        return r03[r12 - r4] - r03[(r12 - r4) - r5];
    }

    /* renamed from: h1 */
    public final int m1831h1(int r2, C0830M c0830m, C0835S c0835s) {
        boolean z2 = c0835s.f3408g;
        C0109g c0109g = this.f2466K;
        if (!z2) {
            int r3 = this.f2461F;
            c0109g.getClass();
            return C0109g.m345y(r2, r3);
        }
        int m2309b = c0830m.m2309b(r2);
        if (m2309b != -1) {
            int r22 = this.f2461F;
            c0109g.getClass();
            return C0109g.m345y(m2309b, r22);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + r2);
        return 0;
    }

    /* renamed from: i1 */
    public final int m1832i1(int r3, C0830M c0830m, C0835S c0835s) {
        boolean z2 = c0835s.f3408g;
        C0109g c0109g = this.f2466K;
        if (!z2) {
            int r4 = this.f2461F;
            c0109g.getClass();
            return r3 % r4;
        }
        int r5 = this.f2465J.get(r3, -1);
        if (r5 != -1) {
            return r5;
        }
        int m2309b = c0830m.m2309b(r3);
        if (m2309b != -1) {
            int r32 = this.f2461F;
            c0109g.getClass();
            return m2309b % r32;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + r3);
        return 0;
    }

    /* renamed from: j1 */
    public final int m1833j1(int r4, C0830M c0830m, C0835S c0835s) {
        boolean z2 = c0835s.f3408g;
        C0109g c0109g = this.f2466K;
        if (!z2) {
            c0109g.getClass();
            return 1;
        }
        int r6 = this.f2464I.get(r4, -1);
        if (r6 != -1) {
            return r6;
        }
        if (c0830m.m2309b(r4) != -1) {
            c0109g.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + r4);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p080e0.AbstractC0824G
    /* renamed from: k */
    public final int mo1834k(C0835S c0835s) {
        return m1851D0(c0835s);
    }

    /* renamed from: k1 */
    public final void m1835k1(View view, int r10, boolean z2) {
        int r02;
        int r102;
        C0863o c0863o = (C0863o) view.getLayoutParams();
        Rect rect = c0863o.f3377b;
        int r2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0863o).topMargin + ((ViewGroup.MarginLayoutParams) c0863o).bottomMargin;
        int r3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0863o).leftMargin + ((ViewGroup.MarginLayoutParams) c0863o).rightMargin;
        int m1830g1 = m1830g1(c0863o.f3579e, c0863o.f3580f);
        if (this.f2472p == 1) {
            r102 = AbstractC0824G.m2281w(false, m1830g1, r10, r3, ((ViewGroup.MarginLayoutParams) c0863o).width);
            r02 = AbstractC0824G.m2281w(true, this.f2474r.mo1624l(), this.f3373m, r2, ((ViewGroup.MarginLayoutParams) c0863o).height);
        } else {
            int m2281w = AbstractC0824G.m2281w(false, m1830g1, r10, r2, ((ViewGroup.MarginLayoutParams) c0863o).height);
            int m2281w2 = AbstractC0824G.m2281w(true, this.f2474r.mo1624l(), this.f3372l, r3, ((ViewGroup.MarginLayoutParams) c0863o).width);
            r02 = m2281w;
            r102 = m2281w2;
        }
        C0825H c0825h = (C0825H) view.getLayoutParams();
        if (z2 ? m2305w0(view, r102, r02, c0825h) : m2303u0(view, r102, r02, c0825h)) {
            view.measure(r102, r02);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p080e0.AbstractC0824G
    /* renamed from: l */
    public final int mo1836l(C0835S c0835s) {
        return m1852E0(c0835s);
    }

    /* renamed from: l1 */
    public final void m1837l1(int r3) {
        if (r3 == this.f2461F) {
            return;
        }
        this.f2460E = true;
        if (r3 < 1) {
            throw new IllegalArgumentException(AbstractC0002c.m11f(r3, "Span count should be at least 1. Provided "));
        }
        this.f2461F = r3;
        this.f2466K.m346A();
        m2296l0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p080e0.AbstractC0824G
    /* renamed from: m0 */
    public final int mo1838m0(int r12, C0830M c0830m, C0835S c0835s) {
        m1839m1();
        m1829f1();
        return super.mo1838m0(r12, c0830m, c0835s);
    }

    /* renamed from: m1 */
    public final void m1839m1() {
        int m2285D;
        int m2288G;
        if (this.f2472p == 1) {
            m2285D = this.f3374n - m2287F();
            m2288G = m2286E();
        } else {
            m2285D = this.f3375o - m2285D();
            m2288G = m2288G();
        }
        m1827e1(m2285D - m2288G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p080e0.AbstractC0824G
    /* renamed from: n */
    public final int mo1840n(C0835S c0835s) {
        return m1851D0(c0835s);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p080e0.AbstractC0824G
    /* renamed from: o */
    public final int mo1841o(C0835S c0835s) {
        return m1852E0(c0835s);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p080e0.AbstractC0824G
    /* renamed from: o0 */
    public final int mo1842o0(int r12, C0830M c0830m, C0835S c0835s) {
        m1839m1();
        m1829f1();
        return super.mo1842o0(r12, c0830m, c0835s);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p080e0.AbstractC0824G
    /* renamed from: r */
    public final C0825H mo1843r() {
        return this.f2472p == 0 ? new C0863o(-2, -1) : new C0863o(-1, -2);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: r0 */
    public final void mo1844r0(Rect rect, int r6, int r7) {
        int m2280g;
        int m2280g2;
        if (this.f2462G == null) {
            super.mo1844r0(rect, r6, r7);
        }
        int m2287F = m2287F() + m2286E();
        int m2285D = m2285D() + m2288G();
        if (this.f2472p == 1) {
            int height = rect.height() + m2285D;
            RecyclerView recyclerView = this.f3362b;
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            m2280g2 = AbstractC0824G.m2280g(r7, height, recyclerView.getMinimumHeight());
            int[] r72 = this.f2462G;
            m2280g = AbstractC0824G.m2280g(r6, r72[r72.length - 1] + m2287F, this.f3362b.getMinimumWidth());
        } else {
            int width = rect.width() + m2287F;
            RecyclerView recyclerView2 = this.f3362b;
            WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
            m2280g = AbstractC0824G.m2280g(r6, width, recyclerView2.getMinimumWidth());
            int[] r5 = this.f2462G;
            m2280g2 = AbstractC0824G.m2280g(r7, r5[r5.length - 1] + m2285D, this.f3362b.getMinimumHeight());
        }
        this.f3362b.setMeasuredDimension(m2280g, m2280g2);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: s */
    public final C0825H mo1845s(Context context, AttributeSet attributeSet) {
        C0863o c0863o = new C0863o(context, attributeSet);
        c0863o.f3579e = -1;
        c0863o.f3580f = 0;
        return c0863o;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: t */
    public final C0825H mo1846t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0863o c0863o = new C0863o((ViewGroup.MarginLayoutParams) layoutParams);
            c0863o.f3579e = -1;
            c0863o.f3580f = 0;
            return c0863o;
        }
        C0863o c0863o2 = new C0863o(layoutParams);
        c0863o2.f3579e = -1;
        c0863o2.f3580f = 0;
        return c0863o2;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: x */
    public final int mo1847x(C0830M c0830m, C0835S c0835s) {
        if (this.f2472p == 1) {
            return this.f2461F;
        }
        if (c0835s.m2321b() < 1) {
            return 0;
        }
        return m1831h1(c0835s.m2321b() - 1, c0830m, c0835s) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p080e0.AbstractC0824G
    /* renamed from: z0 */
    public final boolean mo1848z0() {
        return this.f2482z == null && !this.f2460E;
    }

    public GridLayoutManager(int r2) {
        super(1);
        this.f2460E = false;
        this.f2461F = -1;
        this.f2464I = new SparseIntArray();
        this.f2465J = new SparseIntArray();
        this.f2466K = new C0109g();
        this.f2467L = new Rect();
        m1837l1(r2);
    }
}
