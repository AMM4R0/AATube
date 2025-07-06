package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import p000A.AbstractC0002c;
import p029K0.AbstractC0345a;
import p050R0.C0459c;
import p050R0.C0460d;
import p050R0.C0461e;
import p050R0.C0463g;
import p080e0.AbstractC0824G;
import p080e0.C0825H;
import p080e0.C0830M;
import p080e0.C0835S;
import p080e0.InterfaceC0834Q;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC0824G implements InterfaceC0834Q {

    /* renamed from: p */
    public final C0463g f2832p;

    /* renamed from: q */
    public C0461e f2833q;

    /* renamed from: r */
    public final View.OnLayoutChangeListener f2834r;

    public CarouselLayoutManager() {
        C0463g c0463g = new C0463g();
        new C0460d();
        this.f2834r = new View.OnLayoutChangeListener() { // from class: R0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (r3 == r7 && r4 == r8 && r5 == r9 && r6 == r10) {
                    return;
                }
                view.post(new RunnableC0458b(0, carouselLayoutManager));
            }
        };
        this.f2832p = c0463g;
        m2296l0();
        m2090C0(0);
    }

    /* renamed from: A0 */
    public final boolean m2088A0() {
        return this.f2833q.f1183a == 0;
    }

    /* renamed from: B0 */
    public final boolean m2089B0() {
        return m2088A0() && m2284C() == 1;
    }

    /* renamed from: C0 */
    public final void m2090C0(int r3) {
        C0461e c0461e;
        if (r3 != 0 && r3 != 1) {
            throw new IllegalArgumentException(AbstractC0002c.m11f(r3, "invalid orientation:"));
        }
        mo1876c(null);
        C0461e c0461e2 = this.f2833q;
        if (c0461e2 == null || r3 != c0461e2.f1183a) {
            if (r3 == 0) {
                c0461e = new C0461e(this, 1);
            } else {
                if (r3 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c0461e = new C0461e(this, 0);
            }
            this.f2833q = c0461e;
            m2296l0();
        }
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: L */
    public final boolean mo1859L() {
        return true;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: Q */
    public final void mo2091Q(RecyclerView recyclerView) {
        C0463g c0463g = this.f2832p;
        Context context = recyclerView.getContext();
        float f = c0463g.f1186a;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c0463g.f1186a = f;
        float f2 = c0463g.f1187b;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c0463g.f1187b = f2;
        m2296l0();
        recyclerView.addOnLayoutChangeListener(this.f2834r);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: R */
    public final void mo1865R(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f2834r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x003a, code lost:
    
        if (r7 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0043, code lost:
    
        if (m2089B0() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0046, code lost:
    
        if (r7 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x004f, code lost:
    
        if (m2089B0() != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    @Override // p080e0.AbstractC0824G
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo1815S(android.view.View r5, int r6, p080e0.C0830M r7, p080e0.C0835S r8) {
        /*
            r4 = this;
            int r7 = r4.m2304v()
            r8 = 0
            if (r7 != 0) goto L8
            return r8
        L8:
            R0.e r7 = r4.f2833q
            int r7 = r7.f1183a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L53
            r3 = 2
            if (r6 == r3) goto L51
            r3 = 17
            if (r6 == r3) goto L49
            r3 = 33
            if (r6 == r3) goto L46
            r3 = 66
            if (r6 == r3) goto L3d
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L3a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown focus request:"
            r7.<init>(r3)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "CarouselLayoutManager"
            android.util.Log.d(r7, r6)
        L38:
            r6 = r0
            goto L54
        L3a:
            if (r7 != r2) goto L38
            goto L51
        L3d:
            if (r7 != 0) goto L38
            boolean r6 = r4.m2089B0()
            if (r6 == 0) goto L51
            goto L53
        L46:
            if (r7 != r2) goto L38
            goto L53
        L49:
            if (r7 != 0) goto L38
            boolean r6 = r4.m2089B0()
            if (r6 == 0) goto L53
        L51:
            r6 = r2
            goto L54
        L53:
            r6 = r1
        L54:
            if (r6 != r0) goto L57
            return r8
        L57:
            r7 = 0
            if (r6 != r1) goto L8b
            int r5 = p080e0.AbstractC0824G.m2276H(r5)
            if (r5 != 0) goto L61
            return r8
        L61:
            android.view.View r5 = r4.m2302u(r7)
            int r5 = p080e0.AbstractC0824G.m2276H(r5)
            int r5 = r5 - r2
            if (r5 < 0) goto L7a
            int r6 = r4.m2283B()
            if (r5 < r6) goto L73
            goto L7a
        L73:
            R0.e r5 = r4.f2833q
            r5.m1219a()
            r5 = 0
            throw r5
        L7a:
            boolean r5 = r4.m2089B0()
            if (r5 == 0) goto L86
            int r5 = r4.m2304v()
            int r7 = r5 + (-1)
        L86:
            android.view.View r5 = r4.m2302u(r7)
            goto Lc6
        L8b:
            int r5 = p080e0.AbstractC0824G.m2276H(r5)
            int r6 = r4.m2283B()
            int r6 = r6 - r2
            if (r5 != r6) goto L97
            return r8
        L97:
            int r5 = r4.m2304v()
            int r5 = r5 - r2
            android.view.View r5 = r4.m2302u(r5)
            int r5 = p080e0.AbstractC0824G.m2276H(r5)
            int r5 = r5 + r2
            if (r5 < 0) goto Lb5
            int r6 = r4.m2283B()
            if (r5 < r6) goto Lae
            goto Lb5
        Lae:
            R0.e r5 = r4.f2833q
            r5.m1219a()
            r5 = 0
            throw r5
        Lb5:
            boolean r5 = r4.m2089B0()
            if (r5 == 0) goto Lbc
            goto Lc2
        Lbc:
            int r5 = r4.m2304v()
            int r7 = r5 + (-1)
        Lc2:
            android.view.View r5 = r4.m2302u(r7)
        Lc6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.mo1815S(android.view.View, int, e0.M, e0.S):android.view.View");
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: T */
    public final void mo1868T(AccessibilityEvent accessibilityEvent) {
        super.mo1868T(accessibilityEvent);
        if (m2304v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC0824G.m2276H(m2302u(0)));
            accessibilityEvent.setToIndex(AbstractC0824G.m2276H(m2302u(m2304v() - 1)));
        }
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: W */
    public final void mo1819W(int r12, int r2) {
        m2283B();
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: Z */
    public final void mo1822Z(int r12, int r2) {
        m2283B();
    }

    @Override // p080e0.InterfaceC0834Q
    /* renamed from: a */
    public final PointF mo1874a(int r12) {
        return null;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: b0 */
    public final void mo1825b0(C0830M c0830m, C0835S c0835s) {
        if (c0835s.m2321b() > 0) {
            if ((m2088A0() ? this.f3374n : this.f3375o) > 0.0f) {
                m2089B0();
                View view = c0830m.m2316i(0, Long.MAX_VALUE).f3424a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        m2292g0(c0830m);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: c0 */
    public final void mo1826c0(C0835S c0835s) {
        if (m2304v() == 0) {
            return;
        }
        AbstractC0824G.m2276H(m2302u(0));
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: d */
    public final boolean mo1878d() {
        return m2088A0();
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: e */
    public final boolean mo1881e() {
        return !m2088A0();
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: j */
    public final int mo1885j(C0835S c0835s) {
        m2304v();
        return 0;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: k */
    public final int mo1834k(C0835S c0835s) {
        return 0;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: k0 */
    public final boolean mo2092k0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: l */
    public final int mo1836l(C0835S c0835s) {
        return 0;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: m */
    public final int mo1886m(C0835S c0835s) {
        m2304v();
        return 0;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: m0 */
    public final int mo1838m0(int r4, C0830M c0830m, C0835S c0835s) {
        if (!m2088A0() || m2304v() == 0 || r4 == 0) {
            return 0;
        }
        View view = c0830m.m2316i(0, Long.MAX_VALUE).f3424a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: n */
    public final int mo1840n(C0835S c0835s) {
        return 0;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: n0 */
    public final void mo1887n0(int r12) {
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: o */
    public final int mo1841o(C0835S c0835s) {
        return 0;
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: o0 */
    public final int mo1842o0(int r4, C0830M c0830m, C0835S c0835s) {
        if (!mo1881e() || m2304v() == 0 || r4 == 0) {
            return 0;
        }
        View view = c0830m.m2316i(0, Long.MAX_VALUE).f3424a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: r */
    public final C0825H mo1843r() {
        return new C0825H(-2, -2);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: x0 */
    public final void mo1890x0(RecyclerView recyclerView, int r4) {
        C0459c c0459c = new C0459c(this, recyclerView.getContext(), 0);
        c0459c.f3614a = r4;
        m2306y0(c0459c);
    }

    @Override // p080e0.AbstractC0824G
    /* renamed from: y */
    public final void mo2093y(View view, Rect rect) {
        super.mo2093y(view, rect);
        rect.centerY();
        if (m2088A0()) {
            rect.centerX();
        }
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int r3, int r4) {
        new C0460d();
        this.f2834r = new View.OnLayoutChangeListener() { // from class: R0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int r32, int r42, int r5, int r6, int r7, int r8, int r9, int r10) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (r32 == r7 && r42 == r8 && r5 == r9 && r6 == r10) {
                    return;
                }
                view.post(new RunnableC0458b(0, carouselLayoutManager));
            }
        };
        this.f2832p = new C0463g();
        m2296l0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0345a.f950b);
            obtainStyledAttributes.getInt(0, 0);
            m2296l0();
            m2090C0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
