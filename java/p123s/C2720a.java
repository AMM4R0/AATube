package p123s;

import p000A.AbstractC0002c;
import p118q.C2711b;
import p118q.C2712c;
import p118q.C2715f;

/* renamed from: s.a */
/* loaded from: classes.dex */
public final class C2720a extends AbstractC2728i {

    /* renamed from: s0 */
    public int f8785s0;

    /* renamed from: t0 */
    public boolean f8786t0;

    /* renamed from: u0 */
    public int f8787u0;

    /* renamed from: v0 */
    public boolean f8788v0;

    @Override // p123s.C2723d
    /* renamed from: A */
    public final boolean mo5241A() {
        return this.f8788v0;
    }

    @Override // p123s.C2723d
    /* renamed from: B */
    public final boolean mo5242B() {
        return this.f8788v0;
    }

    /* renamed from: T */
    public final boolean m5243T() {
        int r4;
        int r7;
        int r72;
        boolean z2 = true;
        int r2 = 0;
        while (true) {
            r4 = this.f8966r0;
            if (r2 >= r4) {
                break;
            }
            C2723d c2723d = this.f8965q0[r2];
            if ((this.f8786t0 || c2723d.mo5246c()) && ((((r7 = this.f8785s0) == 0 || r7 == 1) && !c2723d.mo5241A()) || (((r72 = this.f8785s0) == 2 || r72 == 3) && !c2723d.mo5242B()))) {
                z2 = false;
            }
            r2++;
        }
        if (!z2 || r4 <= 0) {
            return false;
        }
        int r22 = 0;
        boolean z3 = false;
        for (int r12 = 0; r12 < this.f8966r0; r12++) {
            C2723d c2723d2 = this.f8965q0[r12];
            if (this.f8786t0 || c2723d2.mo5246c()) {
                if (!z3) {
                    int r3 = this.f8785s0;
                    if (r3 == 0) {
                        r22 = c2723d2.mo5282i(2).m5250d();
                    } else if (r3 == 1) {
                        r22 = c2723d2.mo5282i(4).m5250d();
                    } else if (r3 == 2) {
                        r22 = c2723d2.mo5282i(3).m5250d();
                    } else if (r3 == 3) {
                        r22 = c2723d2.mo5282i(5).m5250d();
                    }
                    z3 = true;
                }
                int r9 = this.f8785s0;
                if (r9 == 0) {
                    r22 = Math.min(r22, c2723d2.mo5282i(2).m5250d());
                } else if (r9 == 1) {
                    r22 = Math.max(r22, c2723d2.mo5282i(4).m5250d());
                } else if (r9 == 2) {
                    r22 = Math.min(r22, c2723d2.mo5282i(3).m5250d());
                } else if (r9 == 3) {
                    r22 = Math.max(r22, c2723d2.mo5282i(5).m5250d());
                }
            }
        }
        int r23 = r22 + this.f8787u0;
        int r13 = this.f8785s0;
        if (r13 == 0 || r13 == 1) {
            m5268J(r23, r23);
        } else {
            m5269K(r23, r23);
        }
        this.f8788v0 = true;
        return true;
    }

    /* renamed from: U */
    public final int m5244U() {
        int r02 = this.f8785s0;
        if (r02 == 0 || r02 == 1) {
            return 0;
        }
        return (r02 == 2 || r02 == 3) ? 1 : -1;
    }

    @Override // p123s.C2723d
    /* renamed from: b */
    public final void mo5245b(C2712c c2712c, boolean z2) {
        boolean z3;
        int r11;
        int r14;
        C2722c[] c2722cArr = this.f8831Q;
        C2722c c2722c = this.f8823I;
        c2722cArr[0] = c2722c;
        C2722c c2722c2 = this.f8824J;
        int r6 = 2;
        c2722cArr[2] = c2722c2;
        C2722c c2722c3 = this.f8825K;
        c2722cArr[1] = c2722c3;
        C2722c c2722c4 = this.f8826L;
        c2722cArr[3] = c2722c4;
        for (C2722c c2722c5 : c2722cArr) {
            c2722c5.f8814i = c2712c.m5223k(c2722c5);
        }
        int r112 = this.f8785s0;
        if (r112 < 0 || r112 >= 4) {
            return;
        }
        C2722c c2722c6 = c2722cArr[r112];
        if (!this.f8788v0) {
            m5243T();
        }
        if (this.f8788v0) {
            this.f8788v0 = false;
            int r2 = this.f8785s0;
            if (r2 == 0 || r2 == 1) {
                c2712c.m5216d(c2722c.f8814i, this.f8839Y);
                c2712c.m5216d(c2722c3.f8814i, this.f8839Y);
                return;
            } else {
                if (r2 == 2 || r2 == 3) {
                    c2712c.m5216d(c2722c2.f8814i, this.f8840Z);
                    c2712c.m5216d(c2722c4.f8814i, this.f8840Z);
                    return;
                }
                return;
            }
        }
        for (int r113 = 0; r113 < this.f8966r0; r113++) {
            C2723d c2723d = this.f8965q0[r113];
            if ((this.f8786t0 || c2723d.mo5246c()) && ((((r14 = this.f8785s0) == 0 || r14 == 1) && c2723d.f8872p0[0] == 3 && c2723d.f8823I.f8811f != null && c2723d.f8825K.f8811f != null) || ((r14 == 2 || r14 == 3) && c2723d.f8872p0[1] == 3 && c2723d.f8824J.f8811f != null && c2723d.f8826L.f8811f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c2722c.m5253g() || c2722c3.m5253g();
        boolean z5 = c2722c2.m5253g() || c2722c4.m5253g();
        int r114 = (z3 || !(((r11 = this.f8785s0) == 0 && z4) || ((r11 == 2 && z5) || ((r11 == 1 && z4) || (r11 == 3 && z5))))) ? 4 : 5;
        int r13 = 0;
        while (r13 < this.f8966r0) {
            C2723d c2723d2 = this.f8965q0[r13];
            if (this.f8786t0 || c2723d2.mo5246c()) {
                C2715f m5223k = c2712c.m5223k(c2723d2.f8831Q[this.f8785s0]);
                int r15 = this.f8785s0;
                C2722c c2722c7 = c2723d2.f8831Q[r15];
                c2722c7.f8814i = m5223k;
                C2722c c2722c8 = c2722c7.f8811f;
                int r8 = (c2722c8 == null || c2722c8.f8809d != this) ? 0 : c2722c7.f8812g;
                if (r15 == 0 || r15 == r6) {
                    C2715f c2715f = c2722c6.f8814i;
                    int r12 = this.f8787u0 - r8;
                    C2711b m5224l = c2712c.m5224l();
                    C2715f m5225m = c2712c.m5225m();
                    m5225m.f8769d = 0;
                    m5224l.m5205c(c2715f, m5223k, m5225m, r12);
                    c2712c.m5215c(m5224l);
                } else {
                    C2715f c2715f2 = c2722c6.f8814i;
                    int r152 = this.f8787u0 + r8;
                    C2711b m5224l2 = c2712c.m5224l();
                    C2715f m5225m2 = c2712c.m5225m();
                    m5225m2.f8769d = 0;
                    m5224l2.m5204b(c2715f2, m5223k, m5225m2, r152);
                    c2712c.m5215c(m5224l2);
                }
                c2712c.m5217e(c2722c6.f8814i, m5223k, this.f8787u0 + r8, r114);
            }
            r13++;
            r6 = 2;
        }
        int r22 = this.f8785s0;
        if (r22 == 0) {
            c2712c.m5217e(c2722c3.f8814i, c2722c.f8814i, 0, 8);
            c2712c.m5217e(c2722c.f8814i, this.f8834T.f8825K.f8814i, 0, 4);
            c2712c.m5217e(c2722c.f8814i, this.f8834T.f8823I.f8814i, 0, 0);
            return;
        }
        if (r22 == 1) {
            c2712c.m5217e(c2722c.f8814i, c2722c3.f8814i, 0, 8);
            c2712c.m5217e(c2722c.f8814i, this.f8834T.f8823I.f8814i, 0, 4);
            c2712c.m5217e(c2722c.f8814i, this.f8834T.f8825K.f8814i, 0, 0);
        } else if (r22 == 2) {
            c2712c.m5217e(c2722c4.f8814i, c2722c2.f8814i, 0, 8);
            c2712c.m5217e(c2722c2.f8814i, this.f8834T.f8826L.f8814i, 0, 4);
            c2712c.m5217e(c2722c2.f8814i, this.f8834T.f8824J.f8814i, 0, 0);
        } else if (r22 == 3) {
            c2712c.m5217e(c2722c2.f8814i, c2722c4.f8814i, 0, 8);
            c2712c.m5217e(c2722c2.f8814i, this.f8834T.f8824J.f8814i, 0, 4);
            c2712c.m5217e(c2722c2.f8814i, this.f8834T.f8826L.f8814i, 0, 0);
        }
    }

    @Override // p123s.C2723d
    /* renamed from: c */
    public final boolean mo5246c() {
        return true;
    }

    @Override // p123s.C2723d
    public final String toString() {
        String m17l = AbstractC0002c.m17l(new StringBuilder("[Barrier] "), this.f8856h0, " {");
        for (int r12 = 0; r12 < this.f8966r0; r12++) {
            C2723d c2723d = this.f8965q0[r12];
            if (r12 > 0) {
                m17l = AbstractC0002c.m15j(m17l, ", ");
            }
            m17l = m17l + c2723d.f8856h0;
        }
        return AbstractC0002c.m15j(m17l, "}");
    }
}
