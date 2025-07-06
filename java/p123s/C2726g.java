package p123s;

import java.util.ArrayList;
import p118q.C2712c;
import p126t.C2750b;
import p132v.C2826f;

/* renamed from: s.g */
/* loaded from: classes.dex */
public final class C2726g extends AbstractC2728i {

    /* renamed from: A0 */
    public int f8923A0;

    /* renamed from: B0 */
    public C2750b f8924B0;

    /* renamed from: C0 */
    public C2826f f8925C0;

    /* renamed from: D0 */
    public int f8926D0;

    /* renamed from: E0 */
    public int f8927E0;

    /* renamed from: F0 */
    public int f8928F0;

    /* renamed from: G0 */
    public int f8929G0;

    /* renamed from: H0 */
    public int f8930H0;

    /* renamed from: I0 */
    public int f8931I0;

    /* renamed from: J0 */
    public float f8932J0;

    /* renamed from: K0 */
    public float f8933K0;

    /* renamed from: L0 */
    public float f8934L0;

    /* renamed from: M0 */
    public float f8935M0;

    /* renamed from: N0 */
    public float f8936N0;

    /* renamed from: O0 */
    public float f8937O0;

    /* renamed from: P0 */
    public int f8938P0;

    /* renamed from: Q0 */
    public int f8939Q0;

    /* renamed from: R0 */
    public int f8940R0;

    /* renamed from: S0 */
    public int f8941S0;

    /* renamed from: T0 */
    public int f8942T0;

    /* renamed from: U0 */
    public int f8943U0;

    /* renamed from: V0 */
    public int f8944V0;

    /* renamed from: W0 */
    public ArrayList f8945W0;

    /* renamed from: X0 */
    public C2723d[] f8946X0;

    /* renamed from: Y0 */
    public C2723d[] f8947Y0;

    /* renamed from: Z0 */
    public int[] f8948Z0;

    /* renamed from: a1 */
    public C2723d[] f8949a1;

    /* renamed from: b1 */
    public int f8950b1;

    /* renamed from: s0 */
    public int f8951s0;

    /* renamed from: t0 */
    public int f8952t0;

    /* renamed from: u0 */
    public int f8953u0;

    /* renamed from: v0 */
    public int f8954v0;

    /* renamed from: w0 */
    public int f8955w0;

    /* renamed from: x0 */
    public int f8956x0;

    /* renamed from: y0 */
    public boolean f8957y0;

    /* renamed from: z0 */
    public int f8958z0;

    @Override // p123s.AbstractC2728i
    /* renamed from: S */
    public final void mo5310S() {
        for (int r02 = 0; r02 < this.f8966r0; r02++) {
            C2723d c2723d = this.f8965q0[r02];
            if (c2723d != null) {
                c2723d.f8820F = true;
            }
        }
    }

    /* renamed from: T */
    public final int m5311T(C2723d c2723d, int r12) {
        if (c2723d == null) {
            return 0;
        }
        int[] r13 = c2723d.f8872p0;
        if (r13[1] == 3) {
            int r3 = c2723d.f8875s;
            if (r3 == 0) {
                return 0;
            }
            if (r3 == 2) {
                int r122 = (int) (c2723d.f8882z * r12);
                if (r122 != c2723d.m5284k()) {
                    c2723d.f8853g = true;
                    m5313V(r13[0], c2723d.m5288q(), 1, r122, c2723d);
                }
                return r122;
            }
            if (r3 == 1) {
                return c2723d.m5284k();
            }
            if (r3 == 3) {
                return (int) ((c2723d.m5288q() * c2723d.f8837W) + 0.5f);
            }
        }
        return c2723d.m5284k();
    }

    /* renamed from: U */
    public final int m5312U(C2723d c2723d, int r13) {
        if (c2723d == null) {
            return 0;
        }
        int[] r12 = c2723d.f8872p0;
        if (r12[0] == 3) {
            int r2 = c2723d.f8874r;
            if (r2 == 0) {
                return 0;
            }
            if (r2 == 2) {
                int r132 = (int) (c2723d.f8879w * r13);
                if (r132 != c2723d.m5288q()) {
                    c2723d.f8853g = true;
                    m5313V(1, r132, r12[1], c2723d.m5284k(), c2723d);
                }
                return r132;
            }
            if (r2 == 1) {
                return c2723d.m5288q();
            }
            if (r2 == 3) {
                return (int) ((c2723d.m5284k() * c2723d.f8837W) + 0.5f);
            }
        }
        return c2723d.m5288q();
    }

    /* renamed from: V */
    public final void m5313V(int r3, int r4, int r5, int r6, C2723d c2723d) {
        C2826f c2826f;
        C2723d c2723d2;
        while (true) {
            c2826f = this.f8925C0;
            if (c2826f != null || (c2723d2 = this.f8834T) == null) {
                break;
            } else {
                this.f8925C0 = ((C2724e) c2723d2).f8899u0;
            }
        }
        C2750b c2750b = this.f8924B0;
        c2750b.f9005a = r3;
        c2750b.f9006b = r5;
        c2750b.f9007c = r4;
        c2750b.f9008d = r6;
        c2826f.m5437b(c2723d, c2750b);
        c2723d.m5273O(c2750b.f9009e);
        c2723d.m5270L(c2750b.f9010f);
        c2723d.f8819E = c2750b.f9012h;
        c2723d.m5267I(c2750b.f9011g);
    }

    @Override // p123s.C2723d
    /* renamed from: b */
    public final void mo5245b(C2712c c2712c, boolean z2) {
        C2723d c2723d;
        float f;
        int r3;
        super.mo5245b(c2712c, z2);
        C2723d c2723d2 = this.f8834T;
        boolean z3 = c2723d2 != null && ((C2724e) c2723d2).f8900v0;
        int r12 = this.f8942T0;
        ArrayList arrayList = this.f8945W0;
        if (r12 != 0) {
            if (r12 == 1) {
                int size = arrayList.size();
                int r32 = 0;
                while (r32 < size) {
                    ((C2725f) arrayList.get(r32)).m5305b(r32, z3, r32 == size + (-1));
                    r32++;
                }
            } else if (r12 != 2) {
                if (r12 == 3) {
                    int size2 = arrayList.size();
                    int r33 = 0;
                    while (r33 < size2) {
                        ((C2725f) arrayList.get(r33)).m5305b(r33, z3, r33 == size2 + (-1));
                        r33++;
                    }
                }
            } else if (this.f8948Z0 != null && this.f8947Y0 != null && this.f8946X0 != null) {
                for (int r13 = 0; r13 < this.f8950b1; r13++) {
                    this.f8949a1[r13].m5264D();
                }
                int[] r14 = this.f8948Z0;
                int r2 = r14[0];
                int r15 = r14[1];
                float f2 = this.f8932J0;
                C2723d c2723d3 = null;
                int r5 = 0;
                while (r5 < r2) {
                    if (z3) {
                        r3 = (r2 - r5) - 1;
                        f = 1.0f - this.f8932J0;
                    } else {
                        f = f2;
                        r3 = r5;
                    }
                    C2723d c2723d4 = this.f8947Y0[r3];
                    if (c2723d4 != null && c2723d4.f8854g0 != 8) {
                        C2722c c2722c = c2723d4.f8823I;
                        if (r5 == 0) {
                            c2723d4.m5279f(c2722c, this.f8823I, this.f8955w0);
                            c2723d4.f8858i0 = this.f8926D0;
                            c2723d4.f8848d0 = f;
                        }
                        if (r5 == r2 - 1) {
                            c2723d4.m5279f(c2723d4.f8825K, this.f8825K, this.f8956x0);
                        }
                        if (r5 > 0 && c2723d3 != null) {
                            int r8 = this.f8938P0;
                            C2722c c2722c2 = c2723d3.f8825K;
                            c2723d4.m5279f(c2722c, c2722c2, r8);
                            c2723d3.m5279f(c2722c2, c2722c, 0);
                        }
                        c2723d3 = c2723d4;
                    }
                    r5++;
                    f2 = f;
                }
                for (int r122 = 0; r122 < r15; r122++) {
                    C2723d c2723d5 = this.f8946X0[r122];
                    if (c2723d5 != null && c2723d5.f8854g0 != 8) {
                        C2722c c2722c3 = c2723d5.f8824J;
                        if (r122 == 0) {
                            c2723d5.m5279f(c2722c3, this.f8824J, this.f8951s0);
                            c2723d5.f8860j0 = this.f8927E0;
                            c2723d5.f8850e0 = this.f8933K0;
                        }
                        if (r122 == r15 - 1) {
                            c2723d5.m5279f(c2723d5.f8826L, this.f8826L, this.f8952t0);
                        }
                        if (r122 > 0 && c2723d3 != null) {
                            int r7 = this.f8939Q0;
                            C2722c c2722c4 = c2723d3.f8826L;
                            c2723d5.m5279f(c2722c3, c2722c4, r7);
                            c2723d3.m5279f(c2722c4, c2722c3, 0);
                        }
                        c2723d3 = c2723d5;
                    }
                }
                for (int r123 = 0; r123 < r2; r123++) {
                    for (int r34 = 0; r34 < r15; r34++) {
                        int r4 = (r34 * r2) + r123;
                        if (this.f8944V0 == 1) {
                            r4 = (r123 * r15) + r34;
                        }
                        C2723d[] c2723dArr = this.f8949a1;
                        if (r4 < c2723dArr.length && (c2723d = c2723dArr[r4]) != null && c2723d.f8854g0 != 8) {
                            C2723d c2723d6 = this.f8947Y0[r123];
                            C2723d c2723d7 = this.f8946X0[r34];
                            if (c2723d != c2723d6) {
                                c2723d.m5279f(c2723d.f8823I, c2723d6.f8823I, 0);
                                c2723d.m5279f(c2723d.f8825K, c2723d6.f8825K, 0);
                            }
                            if (c2723d != c2723d7) {
                                c2723d.m5279f(c2723d.f8824J, c2723d7.f8824J, 0);
                                c2723d.m5279f(c2723d.f8826L, c2723d7.f8826L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C2725f) arrayList.get(0)).m5305b(0, z3, true);
        }
        this.f8957y0 = false;
    }
}
