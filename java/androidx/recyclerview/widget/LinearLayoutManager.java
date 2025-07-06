package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.AbstractC0617g;
import java.util.ArrayList;
import java.util.List;
import p000A.AbstractC0002c;
import p001A0.AbstractC0005b;
import p080e0.AbstractC0824G;
import p080e0.AbstractC0838V;
import p080e0.C0823F;
import p080e0.C0825H;
import p080e0.C0830M;
import p080e0.C0835S;
import p080e0.C0860l;
import p080e0.C0865q;
import p080e0.C0866r;
import p080e0.C0867s;
import p080e0.C0868t;
import p080e0.C0869u;
import p080e0.InterfaceC0834Q;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0824G implements InterfaceC0834Q {

    /* renamed from: A */
    public final C0865q f2468A;

    /* renamed from: B */
    public final C0866r f2469B;

    /* renamed from: C */
    public final int f2470C;

    /* renamed from: D */
    public final int[] f2471D;

    /* renamed from: p */
    public int f2472p;

    /* renamed from: q */
    public C0867s f2473q;

    /* renamed from: r */
    public AbstractC0617g f2474r;

    /* renamed from: s */
    public boolean f2475s;

    /* renamed from: t */
    public final boolean f2476t;

    /* renamed from: u */
    public boolean f2477u;

    /* renamed from: v */
    public boolean f2478v;

    /* renamed from: w */
    public final boolean f2479w;

    /* renamed from: x */
    public int f2480x;

    /* renamed from: y */
    public int f2481y;

    /* renamed from: z */
    public C0868t f2482z;

    public LinearLayoutManager(int r4) {
        this.f2472p = 1;
        this.f2476t = false;
        this.f2477u = false;
        this.f2478v = false;
        this.f2479w = true;
        this.f2480x = -1;
        this.f2481y = Integer.MIN_VALUE;
        this.f2482z = null;
        this.f2468A = new C0865q();
        this.f2469B = new C0866r();
        this.f2470C = 2;
        this.f2471D = new int[2];
        m1873Z0(r4);
        mo1876c(null);
        if (this.f2476t) {
            this.f2476t = false;
            m2296l0();
        }
    }

    /* renamed from: A0 */
    public void mo1849A0(C0835S c0835s, int[] r5) {
        int r02;
        int mo1624l = c0835s.f3402a != -1 ? this.f2474r.mo1624l() : 0;
        if (this.f2473q.f3604f == -1) {
            r02 = 0;
        } else {
            r02 = mo1624l;
            mo1624l = 0;
        }
        r5[0] = mo1624l;
        r5[1] = r02;
    }

    /* renamed from: B0 */
    public void mo1812B0(C0835S c0835s, C0867s c0867s, C0860l c0860l) {
        int r02 = c0867s.f3602d;
        if (r02 < 0 || r02 >= c0835s.m2321b()) {
            return;
        }
        c0860l.m2363a(r02, Math.max(0, c0867s.f3605g));
    }

    /* renamed from: C0 */
    public final int m1850C0(C0835S c0835s) {
        if (m2304v() == 0) {
            return 0;
        }
        m1854G0();
        AbstractC0617g abstractC0617g = this.f2474r;
        boolean z2 = !this.f2479w;
        return AbstractC0005b.m67m(c0835s, abstractC0617g, m1857J0(z2), m1856I0(z2), this, this.f2479w);
    }

    /* renamed from: D0 */
    public final int m1851D0(C0835S c0835s) {
        if (m2304v() == 0) {
            return 0;
        }
        m1854G0();
        AbstractC0617g abstractC0617g = this.f2474r;
        boolean z2 = !this.f2479w;
        return AbstractC0005b.m68n(c0835s, abstractC0617g, m1857J0(z2), m1856I0(z2), this, this.f2479w, this.f2477u);
    }

    /* renamed from: E0 */
    public final int m1852E0(C0835S c0835s) {
        if (m2304v() == 0) {
            return 0;
        }
        m1854G0();
        AbstractC0617g abstractC0617g = this.f2474r;
        boolean z2 = !this.f2479w;
        return AbstractC0005b.m69o(c0835s, abstractC0617g, m1857J0(z2), m1856I0(z2), this, this.f2479w);
    }

    /* renamed from: F0 */
    public final int m1853F0(int r5) {
        return r5 != 1 ? r5 != 2 ? r5 != 17 ? r5 != 33 ? r5 != 66 ? (r5 == 130 && this.f2472p == 1) ? 1 : Integer.MIN_VALUE : this.f2472p == 0 ? 1 : Integer.MIN_VALUE : this.f2472p == 1 ? -1 : Integer.MIN_VALUE : this.f2472p == 0 ? -1 : Integer.MIN_VALUE : (this.f2472p != 1 && m1867S0()) ? -1 : 1 : (this.f2472p != 1 && m1867S0()) ? 1 : -1;
    }

    /* renamed from: G0 */
    public final void m1854G0() {
        if (this.f2473q == null) {
            C0867s c0867s = new C0867s();
            c0867s.f3599a = true;
            c0867s.f3606h = 0;
            c0867s.f3607i = 0;
            c0867s.f3609k = null;
            this.f2473q = c0867s;
        }
    }

    /* renamed from: H0 */
    public final int m1855H0(C0830M c0830m, C0867s c0867s, C0835S c0835s, boolean z2) {
        int r3;
        int r02 = c0867s.f3601c;
        int r12 = c0867s.f3605g;
        if (r12 != Integer.MIN_VALUE) {
            if (r02 < 0) {
                c0867s.f3605g = r12 + r02;
            }
            m1869V0(c0830m, c0867s);
        }
        int r13 = c0867s.f3601c + c0867s.f3606h;
        while (true) {
            if ((!c0867s.f3610l && r13 <= 0) || (r3 = c0867s.f3602d) < 0 || r3 >= c0835s.m2321b()) {
                break;
            }
            C0866r c0866r = this.f2469B;
            c0866r.f3595a = 0;
            c0866r.f3596b = false;
            c0866r.f3597c = false;
            c0866r.f3598d = false;
            mo1816T0(c0830m, c0835s, c0867s, c0866r);
            if (!c0866r.f3596b) {
                int r4 = c0867s.f3600b;
                int r5 = c0866r.f3595a;
                c0867s.f3600b = (c0867s.f3604f * r5) + r4;
                if (!c0866r.f3597c || c0867s.f3609k != null || !c0835s.f3408g) {
                    c0867s.f3601c -= r5;
                    r13 -= r5;
                }
                int r42 = c0867s.f3605g;
                if (r42 != Integer.MIN_VALUE) {
                    int r43 = r42 + r5;
                    c0867s.f3605g = r43;
                    int r52 = c0867s.f3601c;
                    if (r52 < 0) {
                        c0867s.f3605g = r43 + r52;
                    }
                    m1869V0(c0830m, c0867s);
                }
                if (z2 && c0866r.f3598d) {
                    break;
                }
            } else {
                break;
            }
        }
        return r02 - c0867s.f3601c;
    }

    /* renamed from: I0 */
    public final View m1856I0(boolean z2) {
        return this.f2477u ? m1861M0(0, m2304v(), z2) : m1861M0(m2304v() - 1, -1, z2);
    }

    /* renamed from: J0 */
    public final View m1857J0(boolean z2) {
        return this.f2477u ? m1861M0(m2304v() - 1, -1, z2) : m1861M0(0, m2304v(), z2);
    }

    /* renamed from: K0 */
    public final int m1858K0() {
        View m1861M0 = m1861M0(m2304v() - 1, -1, false);
        if (m1861M0 == null) {
            return -1;
        }
        return AbstractC0824G.m2276H(m1861M0);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: L */
    public final boolean mo1859L() {
        return true;
    }

    /* renamed from: L0 */
    public final View m1860L0(int r4, int r5) {
        int r02;
        int r12;
        m1854G0();
        if (r5 <= r4 && r5 >= r4) {
            return m2302u(r4);
        }
        if (this.f2474r.mo1617e(m2302u(r4)) < this.f2474r.mo1623k()) {
            r02 = 16644;
            r12 = 16388;
        } else {
            r02 = 4161;
            r12 = 4097;
        }
        return this.f2472p == 0 ? this.f3363c.m373x(r4, r5, r02, r12) : this.f3364d.m373x(r4, r5, r02, r12);
    }

    /* renamed from: M0 */
    public final View m1861M0(int r3, int r4, boolean z2) {
        m1854G0();
        int r5 = z2 ? 24579 : 320;
        return this.f2472p == 0 ? this.f3363c.m373x(r3, r4, r5, 320) : this.f3364d.m373x(r3, r4, r5, 320);
    }

    /* renamed from: N0 */
    public View mo1814N0(C0830M c0830m, C0835S c0835s, int r8, int r9, int r10) {
        m1854G0();
        int mo1623k = this.f2474r.mo1623k();
        int mo1619g = this.f2474r.mo1619g();
        int r02 = r9 > r8 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (r8 != r9) {
            View m2302u = m2302u(r8);
            int m2276H = AbstractC0824G.m2276H(m2302u);
            if (m2276H >= 0 && m2276H < r10) {
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
            r8 += r02;
        }
        return view != null ? view : view2;
    }

    /* renamed from: O0 */
    public final int m1862O0(int r2, C0830M c0830m, C0835S c0835s, boolean z2) {
        int mo1619g;
        int mo1619g2 = this.f2474r.mo1619g() - r2;
        if (mo1619g2 <= 0) {
            return 0;
        }
        int r3 = -m1872Y0(-mo1619g2, c0830m, c0835s);
        int r22 = r2 + r3;
        if (!z2 || (mo1619g = this.f2474r.mo1619g() - r22) <= 0) {
            return r3;
        }
        this.f2474r.mo1628p(mo1619g);
        return mo1619g + r3;
    }

    /* renamed from: P0 */
    public final int m1863P0(int r2, C0830M c0830m, C0835S c0835s, boolean z2) {
        int mo1623k;
        int mo1623k2 = r2 - this.f2474r.mo1623k();
        if (mo1623k2 <= 0) {
            return 0;
        }
        int r3 = -m1872Y0(mo1623k2, c0830m, c0835s);
        int r22 = r2 + r3;
        if (!z2 || (mo1623k = r22 - this.f2474r.mo1623k()) <= 0) {
            return r3;
        }
        this.f2474r.mo1628p(-mo1623k);
        return r3 - mo1623k;
    }

    /* renamed from: Q0 */
    public final View m1864Q0() {
        return m2302u(this.f2477u ? 0 : m2304v() - 1);
    }

    /* renamed from: R0 */
    public final View m1866R0() {
        return m2302u(this.f2477u ? m2304v() - 1 : 0);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: S */
    public View mo1815S(View view, int r5, C0830M c0830m, C0835S c0835s) {
        int m1853F0;
        m1871X0();
        if (m2304v() == 0 || (m1853F0 = m1853F0(r5)) == Integer.MIN_VALUE) {
            return null;
        }
        m1854G0();
        m1875b1(m1853F0, (int) (this.f2474r.mo1624l() * 0.33333334f), false, c0835s);
        C0867s c0867s = this.f2473q;
        c0867s.f3605g = Integer.MIN_VALUE;
        c0867s.f3599a = false;
        m1855H0(c0830m, c0867s, c0835s, true);
        View m1860L0 = m1853F0 == -1 ? this.f2477u ? m1860L0(m2304v() - 1, -1) : m1860L0(0, m2304v()) : this.f2477u ? m1860L0(0, m2304v()) : m1860L0(m2304v() - 1, -1);
        View m1866R0 = m1853F0 == -1 ? m1866R0() : m1864Q0();
        if (!m1866R0.hasFocusable()) {
            return m1860L0;
        }
        if (m1860L0 == null) {
            return null;
        }
        return m1866R0;
    }

    /* renamed from: S0 */
    public final boolean m1867S0() {
        return m2284C() == 1;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: T */
    public final void mo1868T(AccessibilityEvent accessibilityEvent) {
        super.mo1868T(accessibilityEvent);
        if (m2304v() > 0) {
            View m1861M0 = m1861M0(0, m2304v(), false);
            accessibilityEvent.setFromIndex(m1861M0 == null ? -1 : AbstractC0824G.m2276H(m1861M0));
            accessibilityEvent.setToIndex(m1858K0());
        }
    }

    /* renamed from: T0 */
    public void mo1816T0(C0830M c0830m, C0835S c0835s, C0867s c0867s, C0866r c0866r) {
        int r2;
        int r14;
        int r3;
        int r12;
        View m2373b = c0867s.m2373b(c0830m);
        if (m2373b == null) {
            c0866r.f3596b = true;
            return;
        }
        C0825H c0825h = (C0825H) m2373b.getLayoutParams();
        if (c0867s.f3609k == null) {
            if (this.f2477u == (c0867s.f3604f == -1)) {
                m2291b(m2373b, -1, false);
            } else {
                m2291b(m2373b, 0, false);
            }
        } else {
            if (this.f2477u == (c0867s.f3604f == -1)) {
                m2291b(m2373b, -1, true);
            } else {
                m2291b(m2373b, 0, true);
            }
        }
        C0825H c0825h2 = (C0825H) m2373b.getLayoutParams();
        Rect m1905J = this.f3362b.m1905J(m2373b);
        int r4 = m1905J.left + m1905J.right;
        int r5 = m1905J.top + m1905J.bottom;
        int m2281w = AbstractC0824G.m2281w(mo1878d(), this.f3374n, this.f3372l, m2287F() + m2286E() + ((ViewGroup.MarginLayoutParams) c0825h2).leftMargin + ((ViewGroup.MarginLayoutParams) c0825h2).rightMargin + r4, ((ViewGroup.MarginLayoutParams) c0825h2).width);
        int m2281w2 = AbstractC0824G.m2281w(mo1881e(), this.f3375o, this.f3373m, m2285D() + m2288G() + ((ViewGroup.MarginLayoutParams) c0825h2).topMargin + ((ViewGroup.MarginLayoutParams) c0825h2).bottomMargin + r5, ((ViewGroup.MarginLayoutParams) c0825h2).height);
        if (m2303u0(m2373b, m2281w, m2281w2, c0825h2)) {
            m2373b.measure(m2281w, m2281w2);
        }
        c0866r.f3595a = this.f2474r.mo1615c(m2373b);
        if (this.f2472p == 1) {
            if (m1867S0()) {
                r12 = this.f3374n - m2287F();
                r2 = r12 - this.f2474r.mo1616d(m2373b);
            } else {
                r2 = m2286E();
                r12 = this.f2474r.mo1616d(m2373b) + r2;
            }
            if (c0867s.f3604f == -1) {
                r14 = c0867s.f3600b;
                r3 = r14 - c0866r.f3595a;
            } else {
                r3 = c0867s.f3600b;
                r14 = c0866r.f3595a + r3;
            }
        } else {
            int m2288G = m2288G();
            int mo1616d = this.f2474r.mo1616d(m2373b) + m2288G;
            if (c0867s.f3604f == -1) {
                int r142 = c0867s.f3600b;
                int r32 = r142 - c0866r.f3595a;
                r12 = r142;
                r14 = mo1616d;
                r2 = r32;
                r3 = m2288G;
            } else {
                int r143 = c0867s.f3600b;
                int r33 = c0866r.f3595a + r143;
                r2 = r143;
                r14 = mo1616d;
                r3 = m2288G;
                r12 = r33;
            }
        }
        AbstractC0824G.m2279N(m2373b, r2, r3, r12, r14);
        if (c0825h.f3376a.m2332i() || c0825h.f3376a.m2335l()) {
            c0866r.f3597c = true;
        }
        c0866r.f3598d = m2373b.hasFocusable();
    }

    /* renamed from: V0 */
    public final void m1869V0(C0830M c0830m, C0867s c0867s) {
        if (!c0867s.f3599a || c0867s.f3610l) {
            return;
        }
        int r02 = c0867s.f3605g;
        int r12 = c0867s.f3607i;
        if (c0867s.f3604f == -1) {
            int m2304v = m2304v();
            if (r02 < 0) {
                return;
            }
            int mo1618f = (this.f2474r.mo1618f() - r02) + r12;
            if (this.f2477u) {
                for (int r03 = 0; r03 < m2304v; r03++) {
                    View m2302u = m2302u(r03);
                    if (this.f2474r.mo1617e(m2302u) < mo1618f || this.f2474r.mo1627o(m2302u) < mo1618f) {
                        m1870W0(c0830m, 0, r03);
                        return;
                    }
                }
                return;
            }
            int r7 = m2304v - 1;
            for (int r04 = r7; r04 >= 0; r04--) {
                View m2302u2 = m2302u(r04);
                if (this.f2474r.mo1617e(m2302u2) < mo1618f || this.f2474r.mo1627o(m2302u2) < mo1618f) {
                    m1870W0(c0830m, r7, r04);
                    return;
                }
            }
            return;
        }
        if (r02 < 0) {
            return;
        }
        int r05 = r02 - r12;
        int m2304v2 = m2304v();
        if (!this.f2477u) {
            for (int r13 = 0; r13 < m2304v2; r13++) {
                View m2302u3 = m2302u(r13);
                if (this.f2474r.mo1614b(m2302u3) > r05 || this.f2474r.mo1626n(m2302u3) > r05) {
                    m1870W0(c0830m, 0, r13);
                    return;
                }
            }
            return;
        }
        int r72 = m2304v2 - 1;
        for (int r14 = r72; r14 >= 0; r14--) {
            View m2302u4 = m2302u(r14);
            if (this.f2474r.mo1614b(m2302u4) > r05 || this.f2474r.mo1626n(m2302u4) > r05) {
                m1870W0(c0830m, r72, r14);
                return;
            }
        }
    }

    /* renamed from: W0 */
    public final void m1870W0(C0830M c0830m, int r3, int r4) {
        if (r3 == r4) {
            return;
        }
        if (r4 <= r3) {
            while (r3 > r4) {
                View m2302u = m2302u(r3);
                m2295j0(r3);
                c0830m.m2313f(m2302u);
                r3--;
            }
            return;
        }
        for (int r42 = r4 - 1; r42 >= r3; r42--) {
            View m2302u2 = m2302u(r42);
            m2295j0(r42);
            c0830m.m2313f(m2302u2);
        }
    }

    /* renamed from: X0 */
    public final void m1871X0() {
        if (this.f2472p == 1 || !m1867S0()) {
            this.f2477u = this.f2476t;
        } else {
            this.f2477u = !this.f2476t;
        }
    }

    /* renamed from: Y0 */
    public final int m1872Y0(int r6, C0830M c0830m, C0835S c0835s) {
        if (m2304v() == 0 || r6 == 0) {
            return 0;
        }
        m1854G0();
        this.f2473q.f3599a = true;
        int r02 = r6 > 0 ? 1 : -1;
        int abs = Math.abs(r6);
        m1875b1(r02, abs, true, c0835s);
        C0867s c0867s = this.f2473q;
        int m1855H0 = m1855H0(c0830m, c0867s, c0835s, false) + c0867s.f3605g;
        if (m1855H0 < 0) {
            return 0;
        }
        if (abs > m1855H0) {
            r6 = r02 * m1855H0;
        }
        this.f2474r.mo1628p(-r6);
        this.f2473q.f3608j = r6;
        return r6;
    }

    /* renamed from: Z0 */
    public final void m1873Z0(int r3) {
        if (r3 != 0 && r3 != 1) {
            throw new IllegalArgumentException(AbstractC0002c.m11f(r3, "invalid orientation:"));
        }
        mo1876c(null);
        if (r3 != this.f2472p || this.f2474r == null) {
            AbstractC0617g m1613a = AbstractC0617g.m1613a(this, r3);
            this.f2474r = m1613a;
            this.f2468A.f3590a = m1613a;
            this.f2472p = r3;
            m2296l0();
        }
    }

    @Override // p080e0.InterfaceC0834Q
    /* renamed from: a */
    public final PointF mo1874a(int r4) {
        if (m2304v() == 0) {
            return null;
        }
        int r2 = (r4 < AbstractC0824G.m2276H(m2302u(0))) != this.f2477u ? -1 : 1;
        return this.f2472p == 0 ? new PointF(r2, 0.0f) : new PointF(0.0f, r2);
    }

    /* renamed from: a1 */
    public void mo1824a1(boolean z2) {
        mo1876c(null);
        if (this.f2478v == z2) {
            return;
        }
        this.f2478v = z2;
        m2296l0();
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: b0 */
    public void mo1825b0(C0830M c0830m, C0835S c0835s) {
        View focusedChild;
        View focusedChild2;
        int r02;
        int r12;
        int r2;
        List list;
        int r22;
        int r13;
        int m1862O0;
        int r03;
        View mo1888q;
        int mo1617e;
        int r3;
        int r04;
        int r9 = -1;
        if (!(this.f2482z == null && this.f2480x == -1) && c0835s.m2321b() == 0) {
            m2292g0(c0830m);
            return;
        }
        C0868t c0868t = this.f2482z;
        if (c0868t != null && (r04 = c0868t.f3611a) >= 0) {
            this.f2480x = r04;
        }
        m1854G0();
        this.f2473q.f3599a = false;
        m1871X0();
        RecyclerView recyclerView = this.f3362b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f3361a.f27d).contains(focusedChild)) {
            focusedChild = null;
        }
        C0865q c0865q = this.f2468A;
        if (!c0865q.f3594e || this.f2480x != -1 || this.f2482z != null) {
            c0865q.m2371d();
            c0865q.f3593d = this.f2477u ^ this.f2478v;
            if (!c0835s.f3408g && (r02 = this.f2480x) != -1) {
                if (r02 < 0 || r02 >= c0835s.m2321b()) {
                    this.f2480x = -1;
                    this.f2481y = Integer.MIN_VALUE;
                } else {
                    int r05 = this.f2480x;
                    c0865q.f3591b = r05;
                    C0868t c0868t2 = this.f2482z;
                    if (c0868t2 != null && c0868t2.f3611a >= 0) {
                        boolean z2 = c0868t2.f3613c;
                        c0865q.f3593d = z2;
                        if (z2) {
                            c0865q.f3592c = this.f2474r.mo1619g() - this.f2482z.f3612b;
                        } else {
                            c0865q.f3592c = this.f2474r.mo1623k() + this.f2482z.f3612b;
                        }
                    } else if (this.f2481y == Integer.MIN_VALUE) {
                        View mo1888q2 = mo1888q(r05);
                        if (mo1888q2 == null) {
                            if (m2304v() > 0) {
                                c0865q.f3593d = (this.f2480x < AbstractC0824G.m2276H(m2302u(0))) == this.f2477u;
                            }
                            c0865q.m2368a();
                        } else if (this.f2474r.mo1615c(mo1888q2) > this.f2474r.mo1624l()) {
                            c0865q.m2368a();
                        } else if (this.f2474r.mo1617e(mo1888q2) - this.f2474r.mo1623k() < 0) {
                            c0865q.f3592c = this.f2474r.mo1623k();
                            c0865q.f3593d = false;
                        } else if (this.f2474r.mo1619g() - this.f2474r.mo1614b(mo1888q2) < 0) {
                            c0865q.f3592c = this.f2474r.mo1619g();
                            c0865q.f3593d = true;
                        } else {
                            c0865q.f3592c = c0865q.f3593d ? this.f2474r.m1625m() + this.f2474r.mo1614b(mo1888q2) : this.f2474r.mo1617e(mo1888q2);
                        }
                    } else {
                        boolean z3 = this.f2477u;
                        c0865q.f3593d = z3;
                        if (z3) {
                            c0865q.f3592c = this.f2474r.mo1619g() - this.f2481y;
                        } else {
                            c0865q.f3592c = this.f2474r.mo1623k() + this.f2481y;
                        }
                    }
                    c0865q.f3594e = true;
                }
            }
            if (m2304v() != 0) {
                RecyclerView recyclerView2 = this.f3362b;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f3361a.f27d).contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    C0825H c0825h = (C0825H) focusedChild2.getLayoutParams();
                    if (!c0825h.f3376a.m2332i() && c0825h.f3376a.m2325b() >= 0 && c0825h.f3376a.m2325b() < c0835s.m2321b()) {
                        c0865q.m2370c(focusedChild2, AbstractC0824G.m2276H(focusedChild2));
                        c0865q.f3594e = true;
                    }
                }
                if (this.f2475s == this.f2478v) {
                    View mo1814N0 = c0865q.f3593d ? this.f2477u ? mo1814N0(c0830m, c0835s, 0, m2304v(), c0835s.m2321b()) : mo1814N0(c0830m, c0835s, m2304v() - 1, -1, c0835s.m2321b()) : this.f2477u ? mo1814N0(c0830m, c0835s, m2304v() - 1, -1, c0835s.m2321b()) : mo1814N0(c0830m, c0835s, 0, m2304v(), c0835s.m2321b());
                    if (mo1814N0 != null) {
                        c0865q.m2369b(mo1814N0, AbstractC0824G.m2276H(mo1814N0));
                        if (!c0835s.f3408g && mo1848z0() && (this.f2474r.mo1617e(mo1814N0) >= this.f2474r.mo1619g() || this.f2474r.mo1614b(mo1814N0) < this.f2474r.mo1623k())) {
                            c0865q.f3592c = c0865q.f3593d ? this.f2474r.mo1619g() : this.f2474r.mo1623k();
                        }
                        c0865q.f3594e = true;
                    }
                }
            }
            c0865q.m2368a();
            c0865q.f3591b = this.f2478v ? c0835s.m2321b() - 1 : 0;
            c0865q.f3594e = true;
        } else if (focusedChild != null && (this.f2474r.mo1617e(focusedChild) >= this.f2474r.mo1619g() || this.f2474r.mo1614b(focusedChild) <= this.f2474r.mo1623k())) {
            c0865q.m2370c(focusedChild, AbstractC0824G.m2276H(focusedChild));
        }
        C0867s c0867s = this.f2473q;
        c0867s.f3604f = c0867s.f3608j >= 0 ? 1 : -1;
        int[] r06 = this.f2471D;
        r06[0] = 0;
        r06[1] = 0;
        mo1849A0(c0835s, r06);
        int mo1623k = this.f2474r.mo1623k() + Math.max(0, r06[0]);
        int mo1620h = this.f2474r.mo1620h() + Math.max(0, r06[1]);
        if (c0835s.f3408g && (r03 = this.f2480x) != -1 && this.f2481y != Integer.MIN_VALUE && (mo1888q = mo1888q(r03)) != null) {
            if (this.f2477u) {
                r3 = this.f2474r.mo1619g() - this.f2474r.mo1614b(mo1888q);
                mo1617e = this.f2481y;
            } else {
                mo1617e = this.f2474r.mo1617e(mo1888q) - this.f2474r.mo1623k();
                r3 = this.f2481y;
            }
            int r32 = r3 - mo1617e;
            if (r32 > 0) {
                mo1623k += r32;
            } else {
                mo1620h -= r32;
            }
        }
        if (!c0865q.f3593d ? !this.f2477u : this.f2477u) {
            r9 = 1;
        }
        mo1817U0(c0830m, c0835s, c0865q, r9);
        m2297p(c0830m);
        this.f2473q.f3610l = this.f2474r.mo1621i() == 0 && this.f2474r.mo1618f() == 0;
        this.f2473q.getClass();
        this.f2473q.f3607i = 0;
        if (c0865q.f3593d) {
            m1880d1(c0865q.f3591b, c0865q.f3592c);
            C0867s c0867s2 = this.f2473q;
            c0867s2.f3606h = mo1623k;
            m1855H0(c0830m, c0867s2, c0835s, false);
            C0867s c0867s3 = this.f2473q;
            r2 = c0867s3.f3600b;
            int r33 = c0867s3.f3602d;
            int r07 = c0867s3.f3601c;
            if (r07 > 0) {
                mo1620h += r07;
            }
            m1877c1(c0865q.f3591b, c0865q.f3592c);
            C0867s c0867s4 = this.f2473q;
            c0867s4.f3606h = mo1620h;
            c0867s4.f3602d += c0867s4.f3603e;
            m1855H0(c0830m, c0867s4, c0835s, false);
            C0867s c0867s5 = this.f2473q;
            r12 = c0867s5.f3600b;
            int r08 = c0867s5.f3601c;
            if (r08 > 0) {
                m1880d1(r33, r2);
                C0867s c0867s6 = this.f2473q;
                c0867s6.f3606h = r08;
                m1855H0(c0830m, c0867s6, c0835s, false);
                r2 = this.f2473q.f3600b;
            }
        } else {
            m1877c1(c0865q.f3591b, c0865q.f3592c);
            C0867s c0867s7 = this.f2473q;
            c0867s7.f3606h = mo1620h;
            m1855H0(c0830m, c0867s7, c0835s, false);
            C0867s c0867s8 = this.f2473q;
            r12 = c0867s8.f3600b;
            int r34 = c0867s8.f3602d;
            int r09 = c0867s8.f3601c;
            if (r09 > 0) {
                mo1623k += r09;
            }
            m1880d1(c0865q.f3591b, c0865q.f3592c);
            C0867s c0867s9 = this.f2473q;
            c0867s9.f3606h = mo1623k;
            c0867s9.f3602d += c0867s9.f3603e;
            m1855H0(c0830m, c0867s9, c0835s, false);
            C0867s c0867s10 = this.f2473q;
            r2 = c0867s10.f3600b;
            int r010 = c0867s10.f3601c;
            if (r010 > 0) {
                m1877c1(r34, r12);
                C0867s c0867s11 = this.f2473q;
                c0867s11.f3606h = r010;
                m1855H0(c0830m, c0867s11, c0835s, false);
                r12 = this.f2473q.f3600b;
            }
        }
        if (m2304v() > 0) {
            if (this.f2477u ^ this.f2478v) {
                int m1862O02 = m1862O0(r12, c0830m, c0835s, true);
                r22 = r2 + m1862O02;
                r13 = r12 + m1862O02;
                m1862O0 = m1863P0(r22, c0830m, c0835s, false);
            } else {
                int m1863P0 = m1863P0(r2, c0830m, c0835s, true);
                r22 = r2 + m1863P0;
                r13 = r12 + m1863P0;
                m1862O0 = m1862O0(r13, c0830m, c0835s, false);
            }
            r2 = r22 + m1862O0;
            r12 = r13 + m1862O0;
        }
        if (c0835s.f3412k && m2304v() != 0 && !c0835s.f3408g && mo1848z0()) {
            List list2 = c0830m.f3389d;
            int size = list2.size();
            int m2276H = AbstractC0824G.m2276H(m2302u(0));
            int r92 = 0;
            int r14 = 0;
            for (int r5 = 0; r5 < size; r5++) {
                AbstractC0838V abstractC0838V = (AbstractC0838V) list2.get(r5);
                if (!abstractC0838V.m2332i()) {
                    boolean z4 = abstractC0838V.m2325b() < m2276H;
                    boolean z5 = this.f2477u;
                    View view = abstractC0838V.f3424a;
                    if (z4 != z5) {
                        r92 += this.f2474r.mo1615c(view);
                    } else {
                        r14 += this.f2474r.mo1615c(view);
                    }
                }
            }
            this.f2473q.f3609k = list2;
            if (r92 > 0) {
                m1880d1(AbstractC0824G.m2276H(m1866R0()), r2);
                C0867s c0867s12 = this.f2473q;
                c0867s12.f3606h = r92;
                c0867s12.f3601c = 0;
                c0867s12.m2372a(null);
                m1855H0(c0830m, this.f2473q, c0835s, false);
            }
            if (r14 > 0) {
                m1877c1(AbstractC0824G.m2276H(m1864Q0()), r12);
                C0867s c0867s13 = this.f2473q;
                c0867s13.f3606h = r14;
                c0867s13.f3601c = 0;
                list = null;
                c0867s13.m2372a(null);
                m1855H0(c0830m, this.f2473q, c0835s, false);
            } else {
                list = null;
            }
            this.f2473q.f3609k = list;
        }
        if (c0835s.f3408g) {
            c0865q.m2371d();
        } else {
            AbstractC0617g abstractC0617g = this.f2474r;
            abstractC0617g.f2066a = abstractC0617g.mo1624l();
        }
        this.f2475s = this.f2478v;
    }

    /* renamed from: b1 */
    public final void m1875b1(int r5, int r6, boolean z2, C0835S c0835s) {
        int mo1623k;
        this.f2473q.f3610l = this.f2474r.mo1621i() == 0 && this.f2474r.mo1618f() == 0;
        this.f2473q.f3604f = r5;
        int[] r02 = this.f2471D;
        r02[0] = 0;
        r02[1] = 0;
        mo1849A0(c0835s, r02);
        int max = Math.max(0, r02[0]);
        int max2 = Math.max(0, r02[1]);
        boolean z3 = r5 == 1;
        C0867s c0867s = this.f2473q;
        int r12 = z3 ? max2 : max;
        c0867s.f3606h = r12;
        if (!z3) {
            max = max2;
        }
        c0867s.f3607i = max;
        if (z3) {
            c0867s.f3606h = this.f2474r.mo1620h() + r12;
            View m1864Q0 = m1864Q0();
            C0867s c0867s2 = this.f2473q;
            c0867s2.f3603e = this.f2477u ? -1 : 1;
            int m2276H = AbstractC0824G.m2276H(m1864Q0);
            C0867s c0867s3 = this.f2473q;
            c0867s2.f3602d = m2276H + c0867s3.f3603e;
            c0867s3.f3600b = this.f2474r.mo1614b(m1864Q0);
            mo1623k = this.f2474r.mo1614b(m1864Q0) - this.f2474r.mo1619g();
        } else {
            View m1866R0 = m1866R0();
            C0867s c0867s4 = this.f2473q;
            c0867s4.f3606h = this.f2474r.mo1623k() + c0867s4.f3606h;
            C0867s c0867s5 = this.f2473q;
            c0867s5.f3603e = this.f2477u ? 1 : -1;
            int m2276H2 = AbstractC0824G.m2276H(m1866R0);
            C0867s c0867s6 = this.f2473q;
            c0867s5.f3602d = m2276H2 + c0867s6.f3603e;
            c0867s6.f3600b = this.f2474r.mo1617e(m1866R0);
            mo1623k = (-this.f2474r.mo1617e(m1866R0)) + this.f2474r.mo1623k();
        }
        C0867s c0867s7 = this.f2473q;
        c0867s7.f3601c = r6;
        if (z2) {
            c0867s7.f3601c = r6 - mo1623k;
        }
        c0867s7.f3605g = mo1623k;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: c */
    public final void mo1876c(String str) {
        if (this.f2482z == null) {
            super.mo1876c(str);
        }
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: c0 */
    public void mo1826c0(C0835S c0835s) {
        this.f2482z = null;
        this.f2480x = -1;
        this.f2481y = Integer.MIN_VALUE;
        this.f2468A.m2371d();
    }

    /* renamed from: c1 */
    public final void m1877c1(int r4, int r5) {
        this.f2473q.f3601c = this.f2474r.mo1619g() - r5;
        C0867s c0867s = this.f2473q;
        c0867s.f3603e = this.f2477u ? -1 : 1;
        c0867s.f3602d = r4;
        c0867s.f3604f = 1;
        c0867s.f3600b = r5;
        c0867s.f3605g = Integer.MIN_VALUE;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: d */
    public final boolean mo1878d() {
        return this.f2472p == 0;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: d0 */
    public final void mo1879d0(Parcelable parcelable) {
        if (parcelable instanceof C0868t) {
            this.f2482z = (C0868t) parcelable;
            m2296l0();
        }
    }

    /* renamed from: d1 */
    public final void m1880d1(int r3, int r4) {
        this.f2473q.f3601c = r4 - this.f2474r.mo1623k();
        C0867s c0867s = this.f2473q;
        c0867s.f3602d = r3;
        c0867s.f3603e = this.f2477u ? 1 : -1;
        c0867s.f3604f = -1;
        c0867s.f3600b = r4;
        c0867s.f3605g = Integer.MIN_VALUE;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: e */
    public final boolean mo1881e() {
        return this.f2472p == 1;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: e0 */
    public final Parcelable mo1882e0() {
        C0868t c0868t = this.f2482z;
        if (c0868t != null) {
            C0868t c0868t2 = new C0868t();
            c0868t2.f3611a = c0868t.f3611a;
            c0868t2.f3612b = c0868t.f3612b;
            c0868t2.f3613c = c0868t.f3613c;
            return c0868t2;
        }
        C0868t c0868t3 = new C0868t();
        if (m2304v() > 0) {
            m1854G0();
            boolean z2 = this.f2475s ^ this.f2477u;
            c0868t3.f3613c = z2;
            if (z2) {
                View m1864Q0 = m1864Q0();
                c0868t3.f3612b = this.f2474r.mo1619g() - this.f2474r.mo1614b(m1864Q0);
                c0868t3.f3611a = AbstractC0824G.m2276H(m1864Q0);
            } else {
                View m1866R0 = m1866R0();
                c0868t3.f3611a = AbstractC0824G.m2276H(m1866R0);
                c0868t3.f3612b = this.f2474r.mo1617e(m1866R0) - this.f2474r.mo1623k();
            }
        } else {
            c0868t3.f3611a = -1;
        }
        return c0868t3;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: h */
    public final void mo1883h(int r2, int r3, C0835S c0835s, C0860l c0860l) {
        if (this.f2472p != 0) {
            r2 = r3;
        }
        if (m2304v() == 0 || r2 == 0) {
            return;
        }
        m1854G0();
        m1875b1(r2 > 0 ? 1 : -1, Math.abs(r2), true, c0835s);
        mo1812B0(c0835s, this.f2473q, c0860l);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: i */
    public final void mo1884i(int r6, C0860l c0860l) {
        boolean z2;
        int r3;
        C0868t c0868t = this.f2482z;
        if (c0868t == null || (r3 = c0868t.f3611a) < 0) {
            m1871X0();
            z2 = this.f2477u;
            r3 = this.f2480x;
            if (r3 == -1) {
                r3 = z2 ? r6 - 1 : 0;
            }
        } else {
            z2 = c0868t.f3613c;
        }
        int r12 = z2 ? -1 : 1;
        for (int r02 = 0; r02 < this.f2470C && r3 >= 0 && r3 < r6; r02++) {
            c0860l.m2363a(r3, 0);
            r3 += r12;
        }
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: j */
    public final int mo1885j(C0835S c0835s) {
        return m1850C0(c0835s);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: k */
    public int mo1834k(C0835S c0835s) {
        return m1851D0(c0835s);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: l */
    public int mo1836l(C0835S c0835s) {
        return m1852E0(c0835s);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: m */
    public final int mo1886m(C0835S c0835s) {
        return m1850C0(c0835s);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: m0 */
    public int mo1838m0(int r3, C0830M c0830m, C0835S c0835s) {
        if (this.f2472p == 1) {
            return 0;
        }
        return m1872Y0(r3, c0830m, c0835s);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: n */
    public int mo1840n(C0835S c0835s) {
        return m1851D0(c0835s);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: n0 */
    public final void mo1887n0(int r2) {
        this.f2480x = r2;
        this.f2481y = Integer.MIN_VALUE;
        C0868t c0868t = this.f2482z;
        if (c0868t != null) {
            c0868t.f3611a = -1;
        }
        m2296l0();
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: o */
    public int mo1841o(C0835S c0835s) {
        return m1852E0(c0835s);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: o0 */
    public int mo1842o0(int r2, C0830M c0830m, C0835S c0835s) {
        if (this.f2472p == 0) {
            return 0;
        }
        return m1872Y0(r2, c0830m, c0835s);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: q */
    public final View mo1888q(int r3) {
        int m2304v = m2304v();
        if (m2304v == 0) {
            return null;
        }
        int m2276H = r3 - AbstractC0824G.m2276H(m2302u(0));
        if (m2276H >= 0 && m2276H < m2304v) {
            View m2302u = m2302u(m2276H);
            if (AbstractC0824G.m2276H(m2302u) == r3) {
                return m2302u;
            }
        }
        return super.mo1888q(r3);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: r */
    public C0825H mo1843r() {
        return new C0825H(-2, -2);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: v0 */
    public final boolean mo1889v0() {
        if (this.f3373m == 1073741824 || this.f3372l == 1073741824) {
            return false;
        }
        int m2304v = m2304v();
        for (int r2 = 0; r2 < m2304v; r2++) {
            ViewGroup.LayoutParams layoutParams = m2302u(r2).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: x0 */
    public void mo1890x0(RecyclerView recyclerView, int r3) {
        C0869u c0869u = new C0869u(recyclerView.getContext());
        c0869u.f3614a = r3;
        m2306y0(c0869u);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: z0 */
    public boolean mo1848z0() {
        return this.f2482z == null && this.f2475s == this.f2478v;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int r5, int r6) {
        this.f2472p = 1;
        this.f2476t = false;
        this.f2477u = false;
        this.f2478v = false;
        this.f2479w = true;
        this.f2480x = -1;
        this.f2481y = Integer.MIN_VALUE;
        this.f2482z = null;
        this.f2468A = new C0865q();
        this.f2469B = new C0866r();
        this.f2470C = 2;
        this.f2471D = new int[2];
        C0823F m2277I = AbstractC0824G.m2277I(context, attributeSet, r5, r6);
        m1873Z0(m2277I.f3357a);
        boolean z2 = m2277I.f3359c;
        mo1876c(null);
        if (z2 != this.f2476t) {
            this.f2476t = z2;
            m2296l0();
        }
        mo1824a1(m2277I.f3360d);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: R */
    public final void mo1865R(RecyclerView recyclerView) {
    }

    /* renamed from: U0 */
    public void mo1817U0(C0830M c0830m, C0835S c0835s, C0865q c0865q, int r4) {
    }
}
