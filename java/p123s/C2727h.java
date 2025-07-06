package p123s;

import java.util.ArrayList;
import p118q.AbstractC2714e;
import p118q.C2711b;
import p118q.C2712c;
import p118q.C2715f;

/* renamed from: s.h */
/* loaded from: classes.dex */
public final class C2727h extends C2723d {

    /* renamed from: q0 */
    public float f8959q0 = -1.0f;

    /* renamed from: r0 */
    public int f8960r0 = -1;

    /* renamed from: s0 */
    public int f8961s0 = -1;

    /* renamed from: t0 */
    public C2722c f8962t0 = this.f8824J;

    /* renamed from: u0 */
    public int f8963u0 = 0;

    /* renamed from: v0 */
    public boolean f8964v0;

    public C2727h() {
        this.f8832R.clear();
        this.f8832R.add(this.f8962t0);
        int length = this.f8831Q.length;
        for (int r02 = 0; r02 < length; r02++) {
            this.f8831Q[r02] = this.f8962t0;
        }
    }

    @Override // p123s.C2723d
    /* renamed from: A */
    public final boolean mo5241A() {
        return this.f8964v0;
    }

    @Override // p123s.C2723d
    /* renamed from: B */
    public final boolean mo5242B() {
        return this.f8964v0;
    }

    @Override // p123s.C2723d
    /* renamed from: Q */
    public final void mo5275Q(C2712c c2712c, boolean z2) {
        if (this.f8834T == null) {
            return;
        }
        C2722c c2722c = this.f8962t0;
        c2712c.getClass();
        int m5212n = C2712c.m5212n(c2722c);
        if (this.f8963u0 == 1) {
            this.f8839Y = m5212n;
            this.f8840Z = 0;
            m5270L(this.f8834T.m5284k());
            m5273O(0);
            return;
        }
        this.f8839Y = 0;
        this.f8840Z = m5212n;
        m5273O(this.f8834T.m5288q());
        m5270L(0);
    }

    /* renamed from: R */
    public final void m5314R(int r2) {
        this.f8962t0.m5258l(r2);
        this.f8964v0 = true;
    }

    /* renamed from: S */
    public final void m5315S(int r4) {
        if (this.f8963u0 == r4) {
            return;
        }
        this.f8963u0 = r4;
        ArrayList arrayList = this.f8832R;
        arrayList.clear();
        if (this.f8963u0 == 1) {
            this.f8962t0 = this.f8823I;
        } else {
            this.f8962t0 = this.f8824J;
        }
        arrayList.add(this.f8962t0);
        C2722c[] c2722cArr = this.f8831Q;
        int length = c2722cArr.length;
        for (int r12 = 0; r12 < length; r12++) {
            c2722cArr[r12] = this.f8962t0;
        }
    }

    @Override // p123s.C2723d
    /* renamed from: b */
    public final void mo5245b(C2712c c2712c, boolean z2) {
        C2724e c2724e = (C2724e) this.f8834T;
        if (c2724e == null) {
            return;
        }
        Object mo5282i = c2724e.mo5282i(2);
        Object mo5282i2 = c2724e.mo5282i(4);
        C2723d c2723d = this.f8834T;
        boolean z3 = c2723d != null && c2723d.f8872p0[0] == 2;
        if (this.f8963u0 == 0) {
            mo5282i = c2724e.mo5282i(3);
            mo5282i2 = c2724e.mo5282i(5);
            C2723d c2723d2 = this.f8834T;
            z3 = c2723d2 != null && c2723d2.f8872p0[1] == 2;
        }
        if (this.f8964v0) {
            C2722c c2722c = this.f8962t0;
            if (c2722c.f8808c) {
                C2715f m5223k = c2712c.m5223k(c2722c);
                c2712c.m5216d(m5223k, this.f8962t0.m5250d());
                if (this.f8960r0 != -1) {
                    if (z3) {
                        c2712c.m5218f(c2712c.m5223k(mo5282i2), m5223k, 0, 5);
                    }
                } else if (this.f8961s0 != -1 && z3) {
                    C2715f m5223k2 = c2712c.m5223k(mo5282i2);
                    c2712c.m5218f(m5223k, c2712c.m5223k(mo5282i), 0, 5);
                    c2712c.m5218f(m5223k2, m5223k, 0, 5);
                }
                this.f8964v0 = false;
                return;
            }
        }
        if (this.f8960r0 != -1) {
            C2715f m5223k3 = c2712c.m5223k(this.f8962t0);
            c2712c.m5217e(m5223k3, c2712c.m5223k(mo5282i), this.f8960r0, 8);
            if (z3) {
                c2712c.m5218f(c2712c.m5223k(mo5282i2), m5223k3, 0, 5);
                return;
            }
            return;
        }
        if (this.f8961s0 != -1) {
            C2715f m5223k4 = c2712c.m5223k(this.f8962t0);
            C2715f m5223k5 = c2712c.m5223k(mo5282i2);
            c2712c.m5217e(m5223k4, m5223k5, -this.f8961s0, 8);
            if (z3) {
                c2712c.m5218f(m5223k4, c2712c.m5223k(mo5282i), 0, 5);
                c2712c.m5218f(m5223k5, m5223k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f8959q0 != -1.0f) {
            C2715f m5223k6 = c2712c.m5223k(this.f8962t0);
            C2715f m5223k7 = c2712c.m5223k(mo5282i2);
            float f = this.f8959q0;
            C2711b m5224l = c2712c.m5224l();
            m5224l.f8743d.m5201g(m5223k6, -1.0f);
            m5224l.f8743d.m5201g(m5223k7, f);
            c2712c.m5215c(m5224l);
        }
    }

    @Override // p123s.C2723d
    /* renamed from: c */
    public final boolean mo5246c() {
        return true;
    }

    @Override // p123s.C2723d
    /* renamed from: i */
    public final C2722c mo5282i(int r3) {
        int m5234a = AbstractC2714e.m5234a(r3);
        if (m5234a != 1) {
            if (m5234a != 2) {
                if (m5234a != 3) {
                    if (m5234a != 4) {
                        return null;
                    }
                }
            }
            if (this.f8963u0 == 0) {
                return this.f8962t0;
            }
            return null;
        }
        if (this.f8963u0 == 1) {
            return this.f8962t0;
        }
        return null;
    }
}
