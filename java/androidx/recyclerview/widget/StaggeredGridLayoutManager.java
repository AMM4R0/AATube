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
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import p001A0.AbstractC0005b;
import p010D0.C0113k;
import p010D0.RunnableC0107e;
import p028K.AbstractC0283P;
import p031L.C0355i;
import p031L.C0356j;
import p080e0.AbstractC0824G;
import p080e0.C0823F;
import p080e0.C0825H;
import p080e0.C0830M;
import p080e0.C0835S;
import p080e0.C0842Z;
import p080e0.C0844a0;
import p080e0.C0848c0;
import p080e0.C0850d0;
import p080e0.C0860l;
import p080e0.C0864p;
import p080e0.C0869u;
import p080e0.InterfaceC0834Q;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0824G implements InterfaceC0834Q {

    /* renamed from: B */
    public final C0113k f2554B;

    /* renamed from: C */
    public final int f2555C;

    /* renamed from: D */
    public boolean f2556D;

    /* renamed from: E */
    public boolean f2557E;

    /* renamed from: F */
    public C0848c0 f2558F;

    /* renamed from: G */
    public final Rect f2559G;

    /* renamed from: H */
    public final C0842Z f2560H;

    /* renamed from: I */
    public final boolean f2561I;

    /* renamed from: J */
    public int[] f2562J;

    /* renamed from: K */
    public final RunnableC0107e f2563K;

    /* renamed from: p */
    public final int f2564p;

    /* renamed from: q */
    public final C0850d0[] f2565q;

    /* renamed from: r */
    public final AbstractC0617g f2566r;

    /* renamed from: s */
    public final AbstractC0617g f2567s;

    /* renamed from: t */
    public final int f2568t;

    /* renamed from: u */
    public int f2569u;

    /* renamed from: v */
    public final C0864p f2570v;

    /* renamed from: w */
    public boolean f2571w;

    /* renamed from: y */
    public final BitSet f2573y;

    /* renamed from: x */
    public boolean f2572x = false;

    /* renamed from: z */
    public int f2574z = -1;

    /* renamed from: A */
    public int f2553A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int r9, int r10) {
        this.f2564p = -1;
        this.f2571w = false;
        C0113k c0113k = new C0113k(9, false);
        this.f2554B = c0113k;
        this.f2555C = 2;
        this.f2559G = new Rect();
        this.f2560H = new C0842Z(this);
        this.f2561I = true;
        this.f2563K = new RunnableC0107e(12, this);
        C0823F m2277I = AbstractC0824G.m2277I(context, attributeSet, r9, r10);
        int r8 = m2277I.f3357a;
        if (r8 != 0 && r8 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo1876c(null);
        if (r8 != this.f2568t) {
            this.f2568t = r8;
            AbstractC0617g abstractC0617g = this.f2566r;
            this.f2566r = this.f2567s;
            this.f2567s = abstractC0617g;
            m2296l0();
        }
        int r82 = m2277I.f3358b;
        mo1876c(null);
        if (r82 != this.f2564p) {
            int[] r102 = (int[]) c0113k.f347b;
            if (r102 != null) {
                Arrays.fill(r102, -1);
            }
            c0113k.f348c = null;
            m2296l0();
            this.f2564p = r82;
            this.f2573y = new BitSet(this.f2564p);
            this.f2565q = new C0850d0[this.f2564p];
            for (int r83 = 0; r83 < this.f2564p; r83++) {
                this.f2565q[r83] = new C0850d0(this, r83);
            }
            m2296l0();
        }
        boolean z2 = m2277I.f3359c;
        mo1876c(null);
        C0848c0 c0848c0 = this.f2558F;
        if (c0848c0 != null && c0848c0.f3478h != z2) {
            c0848c0.f3478h = z2;
        }
        this.f2571w = z2;
        m2296l0();
        C0864p c0864p = new C0864p();
        c0864p.f3581a = true;
        c0864p.f3586f = 0;
        c0864p.f3587g = 0;
        this.f2570v = c0864p;
        this.f2566r = AbstractC0617g.m1613a(this, this.f2568t);
        this.f2567s = AbstractC0617g.m1613a(this, 1 - this.f2568t);
    }

    /* renamed from: d1 */
    public static int m1945d1(int r2, int r3, int r4) {
        if (r3 == 0 && r4 == 0) {
            return r2;
        }
        int mode = View.MeasureSpec.getMode(r2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(r2) - r3) - r4), mode) : r2;
    }

    /* renamed from: A0 */
    public final int m1946A0(int r4) {
        if (m2304v() == 0) {
            return this.f2572x ? 1 : -1;
        }
        return (r4 < m1956K0()) != this.f2572x ? -1 : 1;
    }

    /* renamed from: B0 */
    public final boolean m1947B0() {
        int m1956K0;
        if (m2304v() != 0 && this.f2555C != 0 && this.f3367g) {
            if (this.f2572x) {
                m1956K0 = m1957L0();
                m1956K0();
            } else {
                m1956K0 = m1956K0();
                m1957L0();
            }
            C0113k c0113k = this.f2554B;
            if (m1956K0 == 0 && m1963P0() != null) {
                int[] r02 = (int[]) c0113k.f347b;
                if (r02 != null) {
                    Arrays.fill(r02, -1);
                }
                c0113k.f348c = null;
                this.f3366f = true;
                m2296l0();
                return true;
            }
        }
        return false;
    }

    /* renamed from: C0 */
    public final int m1948C0(C0835S c0835s) {
        if (m2304v() == 0) {
            return 0;
        }
        AbstractC0617g abstractC0617g = this.f2566r;
        boolean z2 = !this.f2561I;
        return AbstractC0005b.m67m(c0835s, abstractC0617g, m1953H0(z2), m1952G0(z2), this, this.f2561I);
    }

    /* renamed from: D0 */
    public final int m1949D0(C0835S c0835s) {
        if (m2304v() == 0) {
            return 0;
        }
        AbstractC0617g abstractC0617g = this.f2566r;
        boolean z2 = !this.f2561I;
        return AbstractC0005b.m68n(c0835s, abstractC0617g, m1953H0(z2), m1952G0(z2), this, this.f2561I, this.f2572x);
    }

    /* renamed from: E0 */
    public final int m1950E0(C0835S c0835s) {
        if (m2304v() == 0) {
            return 0;
        }
        AbstractC0617g abstractC0617g = this.f2566r;
        boolean z2 = !this.f2561I;
        return AbstractC0005b.m69o(c0835s, abstractC0617g, m1953H0(z2), m1952G0(z2), this, this.f2561I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* renamed from: F0 */
    public final int m1951F0(C0830M c0830m, C0864p c0864p, C0835S c0835s) {
        C0850d0 c0850d0;
        ?? r6;
        int r14;
        int m2349h;
        int mo1615c;
        int mo1623k;
        int mo1615c2;
        int r7;
        int r16;
        int r15;
        int r8;
        int r5 = 0;
        int r62 = 1;
        this.f2573y.set(0, this.f2564p, true);
        C0864p c0864p2 = this.f2570v;
        int r4 = c0864p2.f3589i ? c0864p.f3585e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0864p.f3585e == 1 ? c0864p.f3587g + c0864p.f3582b : c0864p.f3586f - c0864p.f3582b;
        int r9 = c0864p.f3585e;
        for (int r10 = 0; r10 < this.f2564p; r10++) {
            if (!this.f2565q[r10].f3487a.isEmpty()) {
                m1976c1(this.f2565q[r10], r9, r4);
            }
        }
        int mo1619g = this.f2572x ? this.f2566r.mo1619g() : this.f2566r.mo1623k();
        boolean z2 = false;
        while (true) {
            int r11 = c0864p.f3583c;
            if (((r11 < 0 || r11 >= c0835s.m2321b()) ? r5 : r62) == 0 || (!c0864p2.f3589i && this.f2573y.isEmpty())) {
                break;
            }
            View view = c0830m.m2316i(c0864p.f3583c, Long.MAX_VALUE).f3424a;
            c0864p.f3583c += c0864p.f3584d;
            C0844a0 c0844a0 = (C0844a0) view.getLayoutParams();
            int m2325b = c0844a0.f3376a.m2325b();
            C0113k c0113k = this.f2554B;
            int[] r152 = (int[]) c0113k.f347b;
            int r82 = (r152 == null || m2325b >= r152.length) ? -1 : r152[m2325b];
            if (r82 == -1) {
                if (m1967T0(c0864p.f3585e)) {
                    r8 = this.f2564p - r62;
                    r15 = -1;
                    r16 = -1;
                } else {
                    r16 = r62;
                    r15 = this.f2564p;
                    r8 = r5;
                }
                C0850d0 c0850d02 = null;
                if (c0864p.f3585e == r62) {
                    int mo1623k2 = this.f2566r.mo1623k();
                    int r52 = Integer.MAX_VALUE;
                    while (r8 != r15) {
                        C0850d0 c0850d03 = this.f2565q[r8];
                        int m2347f = c0850d03.m2347f(mo1623k2);
                        if (m2347f < r52) {
                            r52 = m2347f;
                            c0850d02 = c0850d03;
                        }
                        r8 += r16;
                    }
                } else {
                    int mo1619g2 = this.f2566r.mo1619g();
                    int r63 = Integer.MIN_VALUE;
                    while (r8 != r15) {
                        C0850d0 c0850d04 = this.f2565q[r8];
                        int m2349h2 = c0850d04.m2349h(mo1619g2);
                        if (m2349h2 > r63) {
                            c0850d02 = c0850d04;
                            r63 = m2349h2;
                        }
                        r8 += r16;
                    }
                }
                c0850d0 = c0850d02;
                c0113k.m379c(m2325b);
                ((int[]) c0113k.f347b)[m2325b] = c0850d0.f3491e;
            } else {
                c0850d0 = this.f2565q[r82];
            }
            c0844a0.f3458e = c0850d0;
            if (c0864p.f3585e == 1) {
                r6 = 0;
                m2291b(view, -1, false);
            } else {
                r6 = 0;
                m2291b(view, 0, false);
            }
            if (this.f2568t == 1) {
                r14 = 1;
                m1965R0(view, AbstractC0824G.m2281w(r6, this.f2569u, this.f3372l, r6, ((ViewGroup.MarginLayoutParams) c0844a0).width), AbstractC0824G.m2281w(true, this.f3375o, this.f3373m, m2285D() + m2288G(), ((ViewGroup.MarginLayoutParams) c0844a0).height));
            } else {
                r14 = 1;
                m1965R0(view, AbstractC0824G.m2281w(true, this.f3374n, this.f3372l, m2287F() + m2286E(), ((ViewGroup.MarginLayoutParams) c0844a0).width), AbstractC0824G.m2281w(false, this.f2569u, this.f3373m, 0, ((ViewGroup.MarginLayoutParams) c0844a0).height));
            }
            if (c0864p.f3585e == r14) {
                mo1615c = c0850d0.m2347f(mo1619g);
                m2349h = this.f2566r.mo1615c(view) + mo1615c;
            } else {
                m2349h = c0850d0.m2349h(mo1619g);
                mo1615c = m2349h - this.f2566r.mo1615c(view);
            }
            if (c0864p.f3585e == 1) {
                C0850d0 c0850d05 = c0844a0.f3458e;
                c0850d05.getClass();
                C0844a0 c0844a02 = (C0844a0) view.getLayoutParams();
                c0844a02.f3458e = c0850d05;
                ArrayList arrayList = c0850d05.f3487a;
                arrayList.add(view);
                c0850d05.f3489c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c0850d05.f3488b = Integer.MIN_VALUE;
                }
                if (c0844a02.f3376a.m2332i() || c0844a02.f3376a.m2335l()) {
                    c0850d05.f3490d = c0850d05.f3492f.f2566r.mo1615c(view) + c0850d05.f3490d;
                }
            } else {
                C0850d0 c0850d06 = c0844a0.f3458e;
                c0850d06.getClass();
                C0844a0 c0844a03 = (C0844a0) view.getLayoutParams();
                c0844a03.f3458e = c0850d06;
                ArrayList arrayList2 = c0850d06.f3487a;
                arrayList2.add(0, view);
                c0850d06.f3488b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c0850d06.f3489c = Integer.MIN_VALUE;
                }
                if (c0844a03.f3376a.m2332i() || c0844a03.f3376a.m2335l()) {
                    c0850d06.f3490d = c0850d06.f3492f.f2566r.mo1615c(view) + c0850d06.f3490d;
                }
            }
            if (m1964Q0() && this.f2568t == 1) {
                mo1615c2 = this.f2567s.mo1619g() - (((this.f2564p - 1) - c0850d0.f3491e) * this.f2569u);
                mo1623k = mo1615c2 - this.f2567s.mo1615c(view);
            } else {
                mo1623k = this.f2567s.mo1623k() + (c0850d0.f3491e * this.f2569u);
                mo1615c2 = this.f2567s.mo1615c(view) + mo1623k;
            }
            if (this.f2568t == 1) {
                AbstractC0824G.m2279N(view, mo1623k, mo1615c, mo1615c2, m2349h);
            } else {
                AbstractC0824G.m2279N(view, mo1615c, mo1623k, m2349h, mo1615c2);
            }
            m1976c1(c0850d0, c0864p2.f3585e, r4);
            m1969V0(c0830m, c0864p2);
            if (c0864p2.f3588h && view.hasFocusable()) {
                r7 = 0;
                this.f2573y.set(c0850d0.f3491e, false);
            } else {
                r7 = 0;
            }
            r5 = r7;
            r62 = 1;
            z2 = true;
        }
        int r72 = r5;
        if (!z2) {
            m1969V0(c0830m, c0864p2);
        }
        int mo1623k3 = c0864p2.f3585e == -1 ? this.f2566r.mo1623k() - m1959N0(this.f2566r.mo1623k()) : m1958M0(this.f2566r.mo1619g()) - this.f2566r.mo1619g();
        return mo1623k3 > 0 ? Math.min(c0864p.f3582b, mo1623k3) : r72;
    }

    /* renamed from: G0 */
    public final View m1952G0(boolean z2) {
        int mo1623k = this.f2566r.mo1623k();
        int mo1619g = this.f2566r.mo1619g();
        View view = null;
        for (int m2304v = m2304v() - 1; m2304v >= 0; m2304v--) {
            View m2302u = m2302u(m2304v);
            int mo1617e = this.f2566r.mo1617e(m2302u);
            int mo1614b = this.f2566r.mo1614b(m2302u);
            if (mo1614b > mo1623k && mo1617e < mo1619g) {
                if (mo1614b <= mo1619g || !z2) {
                    return m2302u;
                }
                if (view == null) {
                    view = m2302u;
                }
            }
        }
        return view;
    }

    /* renamed from: H0 */
    public final View m1953H0(boolean z2) {
        int mo1623k = this.f2566r.mo1623k();
        int mo1619g = this.f2566r.mo1619g();
        int m2304v = m2304v();
        View view = null;
        for (int r4 = 0; r4 < m2304v; r4++) {
            View m2302u = m2302u(r4);
            int mo1617e = this.f2566r.mo1617e(m2302u);
            if (this.f2566r.mo1614b(m2302u) > mo1623k && mo1617e < mo1619g) {
                if (mo1617e >= mo1623k || !z2) {
                    return m2302u;
                }
                if (view == null) {
                    view = m2302u;
                }
            }
        }
        return view;
    }

    /* renamed from: I0 */
    public final void m1954I0(C0830M c0830m, C0835S c0835s, boolean z2) {
        int mo1619g;
        int m1958M0 = m1958M0(Integer.MIN_VALUE);
        if (m1958M0 != Integer.MIN_VALUE && (mo1619g = this.f2566r.mo1619g() - m1958M0) > 0) {
            int r02 = mo1619g - (-m1973Z0(-mo1619g, c0830m, c0835s));
            if (!z2 || r02 <= 0) {
                return;
            }
            this.f2566r.mo1628p(r02);
        }
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: J */
    public final int mo1813J(C0830M c0830m, C0835S c0835s) {
        return this.f2568t == 0 ? this.f2564p : super.mo1813J(c0830m, c0835s);
    }

    /* renamed from: J0 */
    public final void m1955J0(C0830M c0830m, C0835S c0835s, boolean z2) {
        int mo1623k;
        int m1959N0 = m1959N0(Integer.MAX_VALUE);
        if (m1959N0 != Integer.MAX_VALUE && (mo1623k = m1959N0 - this.f2566r.mo1623k()) > 0) {
            int m1973Z0 = mo1623k - m1973Z0(mo1623k, c0830m, c0835s);
            if (!z2 || m1973Z0 <= 0) {
                return;
            }
            this.f2566r.mo1628p(-m1973Z0);
        }
    }

    /* renamed from: K0 */
    public final int m1956K0() {
        if (m2304v() == 0) {
            return 0;
        }
        return AbstractC0824G.m2276H(m2302u(0));
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: L */
    public final boolean mo1859L() {
        return this.f2555C != 0;
    }

    /* renamed from: L0 */
    public final int m1957L0() {
        int m2304v = m2304v();
        if (m2304v == 0) {
            return 0;
        }
        return AbstractC0824G.m2276H(m2302u(m2304v - 1));
    }

    /* renamed from: M0 */
    public final int m1958M0(int r4) {
        int m2347f = this.f2565q[0].m2347f(r4);
        for (int r12 = 1; r12 < this.f2564p; r12++) {
            int m2347f2 = this.f2565q[r12].m2347f(r4);
            if (m2347f2 > m2347f) {
                m2347f = m2347f2;
            }
        }
        return m2347f;
    }

    /* renamed from: N0 */
    public final int m1959N0(int r4) {
        int m2349h = this.f2565q[0].m2349h(r4);
        for (int r12 = 1; r12 < this.f2564p; r12++) {
            int m2349h2 = this.f2565q[r12].m2349h(r4);
            if (m2349h2 < m2349h) {
                m2349h = m2349h2;
            }
        }
        return m2349h;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: O */
    public final void mo1960O(int r5) {
        super.mo1960O(r5);
        for (int r02 = 0; r02 < this.f2564p; r02++) {
            C0850d0 c0850d0 = this.f2565q[r02];
            int r2 = c0850d0.f3488b;
            if (r2 != Integer.MIN_VALUE) {
                c0850d0.f3488b = r2 + r5;
            }
            int r22 = c0850d0.f3489c;
            if (r22 != Integer.MIN_VALUE) {
                c0850d0.f3489c = r22 + r5;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1961O0(int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1961O0(int, int, int):void");
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: P */
    public final void mo1962P(int r5) {
        super.mo1962P(r5);
        for (int r02 = 0; r02 < this.f2564p; r02++) {
            C0850d0 c0850d0 = this.f2565q[r02];
            int r2 = c0850d0.f3488b;
            if (r2 != Integer.MIN_VALUE) {
                c0850d0.f3488b = r2 + r5;
            }
            int r22 = c0850d0.f3489c;
            if (r22 != Integer.MIN_VALUE) {
                c0850d0.f3489c = r22 + r5;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View m1963P0() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1963P0():android.view.View");
    }

    /* renamed from: Q0 */
    public final boolean m1964Q0() {
        return m2284C() == 1;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: R */
    public final void mo1865R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3362b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2563K);
        }
        for (int r02 = 0; r02 < this.f2564p; r02++) {
            this.f2565q[r02].m2343b();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: R0 */
    public final void m1965R0(View view, int r7, int r8) {
        RecyclerView recyclerView = this.f3362b;
        Rect rect = this.f2559G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m1905J(view));
        }
        C0844a0 c0844a0 = (C0844a0) view.getLayoutParams();
        int m1945d1 = m1945d1(r7, ((ViewGroup.MarginLayoutParams) c0844a0).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c0844a0).rightMargin + rect.right);
        int m1945d12 = m1945d1(r8, ((ViewGroup.MarginLayoutParams) c0844a0).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c0844a0).bottomMargin + rect.bottom);
        if (m2303u0(view, m1945d1, m1945d12, c0844a0)) {
            view.measure(m1945d1, m1945d12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004f, code lost:
    
        if (r8.f2568t == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0054, code lost:
    
        if (r8.f2568t == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0061, code lost:
    
        if (m1964Q0() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006e, code lost:
    
        if (m1964Q0() == false) goto L46;
     */
    @Override // p080e0.AbstractC0824G
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo1815S(android.view.View r9, int r10, p080e0.C0830M r11, p080e0.C0835S r12) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1815S(android.view.View, int, e0.M, e0.S):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x040a, code lost:
    
        if (m1947B0() != false) goto L250;
     */
    /* renamed from: S0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1966S0(p080e0.C0830M r17, p080e0.C0835S r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1966S0(e0.M, e0.S, boolean):void");
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: T */
    public final void mo1868T(AccessibilityEvent accessibilityEvent) {
        super.mo1868T(accessibilityEvent);
        if (m2304v() > 0) {
            View m1953H0 = m1953H0(false);
            View m1952G0 = m1952G0(false);
            if (m1953H0 == null || m1952G0 == null) {
                return;
            }
            int m2276H = AbstractC0824G.m2276H(m1953H0);
            int m2276H2 = AbstractC0824G.m2276H(m1952G0);
            if (m2276H < m2276H2) {
                accessibilityEvent.setFromIndex(m2276H);
                accessibilityEvent.setToIndex(m2276H2);
            } else {
                accessibilityEvent.setFromIndex(m2276H2);
                accessibilityEvent.setToIndex(m2276H);
            }
        }
    }

    /* renamed from: T0 */
    public final boolean m1967T0(int r5) {
        if (this.f2568t == 0) {
            return (r5 == -1) != this.f2572x;
        }
        return ((r5 == -1) == this.f2572x) == m1964Q0();
    }

    /* renamed from: U0 */
    public final void m1968U0(int r5, C0835S c0835s) {
        int m1956K0;
        int r2;
        if (r5 > 0) {
            m1956K0 = m1957L0();
            r2 = 1;
        } else {
            m1956K0 = m1956K0();
            r2 = -1;
        }
        C0864p c0864p = this.f2570v;
        c0864p.f3581a = true;
        m1975b1(m1956K0, c0835s);
        m1974a1(r2);
        c0864p.f3583c = m1956K0 + c0864p.f3584d;
        c0864p.f3582b = Math.abs(r5);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: V */
    public final void mo1818V(C0830M c0830m, C0835S c0835s, View view, C0356j c0356j) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0844a0)) {
            m2290U(view, c0356j);
            return;
        }
        C0844a0 c0844a0 = (C0844a0) layoutParams;
        if (this.f2568t == 0) {
            C0850d0 c0850d0 = c0844a0.f3458e;
            c0356j.m1032i(C0355i.m1023a(false, c0850d0 == null ? -1 : c0850d0.f3491e, 1, -1, -1));
        } else {
            C0850d0 c0850d02 = c0844a0.f3458e;
            c0356j.m1032i(C0355i.m1023a(false, -1, -1, c0850d02 == null ? -1 : c0850d02.f3491e, 1));
        }
    }

    /* renamed from: V0 */
    public final void m1969V0(C0830M c0830m, C0864p c0864p) {
        if (!c0864p.f3581a || c0864p.f3589i) {
            return;
        }
        if (c0864p.f3582b == 0) {
            if (c0864p.f3585e == -1) {
                m1970W0(c0830m, c0864p.f3587g);
                return;
            } else {
                m1971X0(c0830m, c0864p.f3586f);
                return;
            }
        }
        int r2 = 1;
        if (c0864p.f3585e == -1) {
            int r02 = c0864p.f3586f;
            int m2349h = this.f2565q[0].m2349h(r02);
            while (r2 < this.f2564p) {
                int m2349h2 = this.f2565q[r2].m2349h(r02);
                if (m2349h2 > m2349h) {
                    m2349h = m2349h2;
                }
                r2++;
            }
            int r03 = r02 - m2349h;
            m1970W0(c0830m, r03 < 0 ? c0864p.f3587g : c0864p.f3587g - Math.min(r03, c0864p.f3582b));
            return;
        }
        int r04 = c0864p.f3587g;
        int m2347f = this.f2565q[0].m2347f(r04);
        while (r2 < this.f2564p) {
            int m2347f2 = this.f2565q[r2].m2347f(r04);
            if (m2347f2 < m2347f) {
                m2347f = m2347f2;
            }
            r2++;
        }
        int r12 = m2347f - c0864p.f3587g;
        m1971X0(c0830m, r12 < 0 ? c0864p.f3586f : Math.min(r12, c0864p.f3582b) + c0864p.f3586f);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: W */
    public final void mo1819W(int r2, int r3) {
        m1961O0(r2, r3, 1);
    }

    /* renamed from: W0 */
    public final void m1970W0(C0830M c0830m, int r10) {
        for (int m2304v = m2304v() - 1; m2304v >= 0; m2304v--) {
            View m2302u = m2302u(m2304v);
            if (this.f2566r.mo1617e(m2302u) < r10 || this.f2566r.mo1627o(m2302u) < r10) {
                return;
            }
            C0844a0 c0844a0 = (C0844a0) m2302u.getLayoutParams();
            c0844a0.getClass();
            if (c0844a0.f3458e.f3487a.size() == 1) {
                return;
            }
            C0850d0 c0850d0 = c0844a0.f3458e;
            ArrayList arrayList = c0850d0.f3487a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C0844a0 c0844a02 = (C0844a0) view.getLayoutParams();
            c0844a02.f3458e = null;
            if (c0844a02.f3376a.m2332i() || c0844a02.f3376a.m2335l()) {
                c0850d0.f3490d -= c0850d0.f3492f.f2566r.mo1615c(view);
            }
            if (size == 1) {
                c0850d0.f3488b = Integer.MIN_VALUE;
            }
            c0850d0.f3489c = Integer.MIN_VALUE;
            m2294i0(m2302u, c0830m);
        }
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: X */
    public final void mo1820X() {
        C0113k c0113k = this.f2554B;
        int[] r12 = (int[]) c0113k.f347b;
        if (r12 != null) {
            Arrays.fill(r12, -1);
        }
        c0113k.f348c = null;
        m2296l0();
    }

    /* renamed from: X0 */
    public final void m1971X0(C0830M c0830m, int r8) {
        while (m2304v() > 0) {
            View m2302u = m2302u(0);
            if (this.f2566r.mo1614b(m2302u) > r8 || this.f2566r.mo1626n(m2302u) > r8) {
                return;
            }
            C0844a0 c0844a0 = (C0844a0) m2302u.getLayoutParams();
            c0844a0.getClass();
            if (c0844a0.f3458e.f3487a.size() == 1) {
                return;
            }
            C0850d0 c0850d0 = c0844a0.f3458e;
            ArrayList arrayList = c0850d0.f3487a;
            View view = (View) arrayList.remove(0);
            C0844a0 c0844a02 = (C0844a0) view.getLayoutParams();
            c0844a02.f3458e = null;
            if (arrayList.size() == 0) {
                c0850d0.f3489c = Integer.MIN_VALUE;
            }
            if (c0844a02.f3376a.m2332i() || c0844a02.f3376a.m2335l()) {
                c0850d0.f3490d -= c0850d0.f3492f.f2566r.mo1615c(view);
            }
            c0850d0.f3488b = Integer.MIN_VALUE;
            m2294i0(m2302u, c0830m);
        }
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: Y */
    public final void mo1821Y(int r2, int r3) {
        m1961O0(r2, r3, 8);
    }

    /* renamed from: Y0 */
    public final void m1972Y0() {
        if (this.f2568t == 1 || !m1964Q0()) {
            this.f2572x = this.f2571w;
        } else {
            this.f2572x = !this.f2571w;
        }
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: Z */
    public final void mo1822Z(int r2, int r3) {
        m1961O0(r2, r3, 2);
    }

    /* renamed from: Z0 */
    public final int m1973Z0(int r4, C0830M c0830m, C0835S c0835s) {
        if (m2304v() == 0 || r4 == 0) {
            return 0;
        }
        m1968U0(r4, c0835s);
        C0864p c0864p = this.f2570v;
        int m1951F0 = m1951F0(c0830m, c0864p, c0835s);
        if (c0864p.f3582b >= m1951F0) {
            r4 = r4 < 0 ? -m1951F0 : m1951F0;
        }
        this.f2566r.mo1628p(-r4);
        this.f2556D = this.f2572x;
        c0864p.f3582b = 0;
        m1969V0(c0830m, c0864p);
        return r4;
    }

    @Override // p080e0.InterfaceC0834Q
    /* renamed from: a */
    public final PointF mo1874a(int r4) {
        int m1946A0 = m1946A0(r4);
        PointF pointF = new PointF();
        if (m1946A0 == 0) {
            return null;
        }
        if (this.f2568t == 0) {
            pointF.x = m1946A0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m1946A0;
        }
        return pointF;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: a0 */
    public final void mo1823a0(int r2, int r3) {
        m1961O0(r2, r3, 4);
    }

    /* renamed from: a1 */
    public final void m1974a1(int r5) {
        C0864p c0864p = this.f2570v;
        c0864p.f3585e = r5;
        c0864p.f3584d = this.f2572x != (r5 == -1) ? -1 : 1;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: b0 */
    public final void mo1825b0(C0830M c0830m, C0835S c0835s) {
        m1966S0(c0830m, c0835s, true);
    }

    /* renamed from: b1 */
    public final void m1975b1(int r5, C0835S c0835s) {
        int r52;
        int r6;
        int r62;
        C0864p c0864p = this.f2570v;
        boolean z2 = false;
        c0864p.f3582b = 0;
        c0864p.f3583c = r5;
        C0869u c0869u = this.f3365e;
        if (!(c0869u != null && c0869u.f3618e) || (r62 = c0835s.f3402a) == -1) {
            r52 = 0;
            r6 = 0;
        } else {
            if (this.f2572x == (r62 < r5)) {
                r52 = this.f2566r.mo1624l();
                r6 = 0;
            } else {
                r6 = this.f2566r.mo1624l();
                r52 = 0;
            }
        }
        RecyclerView recyclerView = this.f3362b;
        if (recyclerView == null || !recyclerView.f2521g) {
            c0864p.f3587g = this.f2566r.mo1618f() + r52;
            c0864p.f3586f = -r6;
        } else {
            c0864p.f3586f = this.f2566r.mo1623k() - r6;
            c0864p.f3587g = this.f2566r.mo1619g() + r52;
        }
        c0864p.f3588h = false;
        c0864p.f3581a = true;
        if (this.f2566r.mo1621i() == 0 && this.f2566r.mo1618f() == 0) {
            z2 = true;
        }
        c0864p.f3589i = z2;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: c */
    public final void mo1876c(String str) {
        if (this.f2558F == null) {
            super.mo1876c(str);
        }
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: c0 */
    public final void mo1826c0(C0835S c0835s) {
        this.f2574z = -1;
        this.f2553A = Integer.MIN_VALUE;
        this.f2558F = null;
        this.f2560H.m2341a();
    }

    /* renamed from: c1 */
    public final void m1976c1(C0850d0 c0850d0, int r7, int r8) {
        int r02 = c0850d0.f3490d;
        int r4 = c0850d0.f3491e;
        if (r7 != -1) {
            int r72 = c0850d0.f3489c;
            if (r72 == Integer.MIN_VALUE) {
                c0850d0.m2342a();
                r72 = c0850d0.f3489c;
            }
            if (r72 - r02 >= r8) {
                this.f2573y.set(r4, false);
                return;
            }
            return;
        }
        int r73 = c0850d0.f3488b;
        if (r73 == Integer.MIN_VALUE) {
            View view = (View) c0850d0.f3487a.get(0);
            C0844a0 c0844a0 = (C0844a0) view.getLayoutParams();
            c0850d0.f3488b = c0850d0.f3492f.f2566r.mo1617e(view);
            c0844a0.getClass();
            r73 = c0850d0.f3488b;
        }
        if (r73 + r02 <= r8) {
            this.f2573y.set(r4, false);
        }
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: d */
    public final boolean mo1878d() {
        return this.f2568t == 0;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: d0 */
    public final void mo1879d0(Parcelable parcelable) {
        if (parcelable instanceof C0848c0) {
            this.f2558F = (C0848c0) parcelable;
            m2296l0();
        }
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: e */
    public final boolean mo1881e() {
        return this.f2568t == 1;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: e0 */
    public final Parcelable mo1882e0() {
        int m2349h;
        int mo1623k;
        int[] r3;
        C0848c0 c0848c0 = this.f2558F;
        if (c0848c0 != null) {
            C0848c0 c0848c02 = new C0848c0();
            c0848c02.f3473c = c0848c0.f3473c;
            c0848c02.f3471a = c0848c0.f3471a;
            c0848c02.f3472b = c0848c0.f3472b;
            c0848c02.f3474d = c0848c0.f3474d;
            c0848c02.f3475e = c0848c0.f3475e;
            c0848c02.f3476f = c0848c0.f3476f;
            c0848c02.f3478h = c0848c0.f3478h;
            c0848c02.f3479i = c0848c0.f3479i;
            c0848c02.f3480j = c0848c0.f3480j;
            c0848c02.f3477g = c0848c0.f3477g;
            return c0848c02;
        }
        C0848c0 c0848c03 = new C0848c0();
        c0848c03.f3478h = this.f2571w;
        c0848c03.f3479i = this.f2556D;
        c0848c03.f3480j = this.f2557E;
        C0113k c0113k = this.f2554B;
        if (c0113k == null || (r3 = (int[]) c0113k.f347b) == null) {
            c0848c03.f3475e = 0;
        } else {
            c0848c03.f3476f = r3;
            c0848c03.f3475e = r3.length;
            c0848c03.f3477g = (ArrayList) c0113k.f348c;
        }
        if (m2304v() > 0) {
            c0848c03.f3471a = this.f2556D ? m1957L0() : m1956K0();
            View m1952G0 = this.f2572x ? m1952G0(true) : m1953H0(true);
            c0848c03.f3472b = m1952G0 != null ? AbstractC0824G.m2276H(m1952G0) : -1;
            int r12 = this.f2564p;
            c0848c03.f3473c = r12;
            c0848c03.f3474d = new int[r12];
            for (int r2 = 0; r2 < this.f2564p; r2++) {
                if (this.f2556D) {
                    m2349h = this.f2565q[r2].m2347f(Integer.MIN_VALUE);
                    if (m2349h != Integer.MIN_VALUE) {
                        mo1623k = this.f2566r.mo1619g();
                        m2349h -= mo1623k;
                        c0848c03.f3474d[r2] = m2349h;
                    } else {
                        c0848c03.f3474d[r2] = m2349h;
                    }
                } else {
                    m2349h = this.f2565q[r2].m2349h(Integer.MIN_VALUE);
                    if (m2349h != Integer.MIN_VALUE) {
                        mo1623k = this.f2566r.mo1623k();
                        m2349h -= mo1623k;
                        c0848c03.f3474d[r2] = m2349h;
                    } else {
                        c0848c03.f3474d[r2] = m2349h;
                    }
                }
            }
        } else {
            c0848c03.f3471a = -1;
            c0848c03.f3472b = -1;
            c0848c03.f3473c = 0;
        }
        return c0848c03;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: f */
    public final boolean mo1828f(C0825H c0825h) {
        return c0825h instanceof C0844a0;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: f0 */
    public final void mo1977f0(int r12) {
        if (r12 == 0) {
            m1947B0();
        }
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: h */
    public final void mo1883h(int r5, int r6, C0835S c0835s, C0860l c0860l) {
        C0864p c0864p;
        int m2347f;
        int r2;
        if (this.f2568t != 0) {
            r5 = r6;
        }
        if (m2304v() == 0 || r5 == 0) {
            return;
        }
        m1968U0(r5, c0835s);
        int[] r52 = this.f2562J;
        if (r52 == null || r52.length < this.f2564p) {
            this.f2562J = new int[this.f2564p];
        }
        int r62 = 0;
        int r02 = 0;
        while (true) {
            int r12 = this.f2564p;
            c0864p = this.f2570v;
            if (r62 >= r12) {
                break;
            }
            if (c0864p.f3584d == -1) {
                m2347f = c0864p.f3586f;
                r2 = this.f2565q[r62].m2349h(m2347f);
            } else {
                m2347f = this.f2565q[r62].m2347f(c0864p.f3587g);
                r2 = c0864p.f3587g;
            }
            int r13 = m2347f - r2;
            if (r13 >= 0) {
                this.f2562J[r02] = r13;
                r02++;
            }
            r62++;
        }
        Arrays.sort(this.f2562J, 0, r02);
        for (int r53 = 0; r53 < r02; r53++) {
            int r63 = c0864p.f3583c;
            if (r63 < 0 || r63 >= c0835s.m2321b()) {
                return;
            }
            c0860l.m2363a(c0864p.f3583c, this.f2562J[r53]);
            c0864p.f3583c += c0864p.f3584d;
        }
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: j */
    public final int mo1885j(C0835S c0835s) {
        return m1948C0(c0835s);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: k */
    public final int mo1834k(C0835S c0835s) {
        return m1949D0(c0835s);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: l */
    public final int mo1836l(C0835S c0835s) {
        return m1950E0(c0835s);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: m */
    public final int mo1886m(C0835S c0835s) {
        return m1948C0(c0835s);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: m0 */
    public final int mo1838m0(int r12, C0830M c0830m, C0835S c0835s) {
        return m1973Z0(r12, c0830m, c0835s);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: n */
    public final int mo1840n(C0835S c0835s) {
        return m1949D0(c0835s);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: n0 */
    public final void mo1887n0(int r3) {
        C0848c0 c0848c0 = this.f2558F;
        if (c0848c0 != null && c0848c0.f3471a != r3) {
            c0848c0.f3474d = null;
            c0848c0.f3473c = 0;
            c0848c0.f3471a = -1;
            c0848c0.f3472b = -1;
        }
        this.f2574z = r3;
        this.f2553A = Integer.MIN_VALUE;
        m2296l0();
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: o */
    public final int mo1841o(C0835S c0835s) {
        return m1950E0(c0835s);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: o0 */
    public final int mo1842o0(int r12, C0830M c0830m, C0835S c0835s) {
        return m1973Z0(r12, c0830m, c0835s);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: r */
    public final C0825H mo1843r() {
        return this.f2568t == 0 ? new C0844a0(-2, -1) : new C0844a0(-1, -2);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: r0 */
    public final void mo1844r0(Rect rect, int r7, int r8) {
        int m2280g;
        int m2280g2;
        int r02 = this.f2564p;
        int m2287F = m2287F() + m2286E();
        int m2285D = m2285D() + m2288G();
        if (this.f2568t == 1) {
            int height = rect.height() + m2285D;
            RecyclerView recyclerView = this.f3362b;
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            m2280g2 = AbstractC0824G.m2280g(r8, height, recyclerView.getMinimumHeight());
            m2280g = AbstractC0824G.m2280g(r7, (this.f2569u * r02) + m2287F, this.f3362b.getMinimumWidth());
        } else {
            int width = rect.width() + m2287F;
            RecyclerView recyclerView2 = this.f3362b;
            WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
            m2280g = AbstractC0824G.m2280g(r7, width, recyclerView2.getMinimumWidth());
            m2280g2 = AbstractC0824G.m2280g(r8, (this.f2569u * r02) + m2285D, this.f3362b.getMinimumHeight());
        }
        this.f3362b.setMeasuredDimension(m2280g, m2280g2);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: s */
    public final C0825H mo1845s(Context context, AttributeSet attributeSet) {
        return new C0844a0(context, attributeSet);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: t */
    public final C0825H mo1846t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0844a0((ViewGroup.MarginLayoutParams) layoutParams) : new C0844a0(layoutParams);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: x */
    public final int mo1847x(C0830M c0830m, C0835S c0835s) {
        return this.f2568t == 1 ? this.f2564p : super.mo1847x(c0830m, c0835s);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: x0 */
    public final void mo1890x0(RecyclerView recyclerView, int r3) {
        C0869u c0869u = new C0869u(recyclerView.getContext());
        c0869u.f3614a = r3;
        m2306y0(c0869u);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: z0 */
    public final boolean mo1848z0() {
        return this.f2558F == null;
    }
}
