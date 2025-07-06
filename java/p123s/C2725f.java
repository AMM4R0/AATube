package p123s;

/* renamed from: s.f */
/* loaded from: classes.dex */
public final class C2725f {

    /* renamed from: a */
    public int f8905a;

    /* renamed from: d */
    public C2722c f8908d;

    /* renamed from: e */
    public C2722c f8909e;

    /* renamed from: f */
    public C2722c f8910f;

    /* renamed from: g */
    public C2722c f8911g;

    /* renamed from: h */
    public int f8912h;

    /* renamed from: i */
    public int f8913i;

    /* renamed from: j */
    public int f8914j;

    /* renamed from: k */
    public int f8915k;

    /* renamed from: q */
    public int f8921q;

    /* renamed from: r */
    public final /* synthetic */ C2726g f8922r;

    /* renamed from: b */
    public C2723d f8906b = null;

    /* renamed from: c */
    public int f8907c = 0;

    /* renamed from: l */
    public int f8916l = 0;

    /* renamed from: m */
    public int f8917m = 0;

    /* renamed from: n */
    public int f8918n = 0;

    /* renamed from: o */
    public int f8919o = 0;

    /* renamed from: p */
    public int f8920p = 0;

    public C2725f(C2726g c2726g, int r3, C2722c c2722c, C2722c c2722c2, C2722c c2722c3, C2722c c2722c4, int r8) {
        this.f8922r = c2726g;
        this.f8912h = 0;
        this.f8913i = 0;
        this.f8914j = 0;
        this.f8915k = 0;
        this.f8921q = 0;
        this.f8905a = r3;
        this.f8908d = c2722c;
        this.f8909e = c2722c2;
        this.f8910f = c2722c3;
        this.f8911g = c2722c4;
        this.f8912h = c2726g.f8955w0;
        this.f8913i = c2726g.f8951s0;
        this.f8914j = c2726g.f8956x0;
        this.f8915k = c2726g.f8952t0;
        this.f8921q = r8;
    }

    /* renamed from: a */
    public final void m5304a(C2723d c2723d) {
        int r02 = this.f8905a;
        C2726g c2726g = this.f8922r;
        if (r02 == 0) {
            int m5312U = c2726g.m5312U(c2723d, this.f8921q);
            if (c2723d.f8872p0[0] == 3) {
                this.f8920p++;
                m5312U = 0;
            }
            this.f8916l = m5312U + (c2723d.f8854g0 != 8 ? c2726g.f8938P0 : 0) + this.f8916l;
            int m5311T = c2726g.m5311T(c2723d, this.f8921q);
            if (this.f8906b == null || this.f8907c < m5311T) {
                this.f8906b = c2723d;
                this.f8907c = m5311T;
                this.f8917m = m5311T;
            }
        } else {
            int m5312U2 = c2726g.m5312U(c2723d, this.f8921q);
            int m5311T2 = c2726g.m5311T(c2723d, this.f8921q);
            if (c2723d.f8872p0[1] == 3) {
                this.f8920p++;
                m5311T2 = 0;
            }
            this.f8917m = m5311T2 + (c2723d.f8854g0 != 8 ? c2726g.f8939Q0 : 0) + this.f8917m;
            if (this.f8906b == null || this.f8907c < m5312U2) {
                this.f8906b = c2723d;
                this.f8907c = m5312U2;
                this.f8916l = m5312U2;
            }
        }
        this.f8919o++;
    }

    /* renamed from: b */
    public final void m5305b(int r21, boolean z2, boolean z3) {
        C2726g c2726g;
        int r16;
        int r13;
        int r15;
        C2723d c2723d;
        int r17;
        char c;
        int r162;
        float f;
        float f2;
        int r2;
        float f3;
        int r5;
        int r12 = this.f8919o;
        int r3 = 0;
        while (true) {
            c2726g = this.f8922r;
            if (r3 >= r12 || (r5 = this.f8918n + r3) >= c2726g.f8950b1) {
                break;
            }
            C2723d c2723d2 = c2726g.f8949a1[r5];
            if (c2723d2 != null) {
                c2723d2.m5264D();
            }
            r3++;
        }
        if (r12 == 0 || this.f8906b == null) {
            return;
        }
        boolean z4 = z3 && r21 == 0;
        int r8 = -1;
        int r9 = -1;
        for (int r7 = 0; r7 < r12; r7++) {
            int r11 = this.f8918n + (z2 ? (r12 - 1) - r7 : r7);
            if (r11 >= c2726g.f8950b1) {
                break;
            }
            C2723d c2723d3 = c2726g.f8949a1[r11];
            if (c2723d3 != null && c2723d3.f8854g0 == 0) {
                if (r8 == -1) {
                    r8 = r7;
                }
                r9 = r7;
            }
        }
        if (this.f8905a != 0) {
            C2723d c2723d4 = this.f8906b;
            c2723d4.f8858i0 = c2726g.f8926D0;
            int r22 = this.f8912h;
            if (r21 > 0) {
                r22 += c2726g.f8938P0;
            }
            C2722c c2722c = c2723d4.f8823I;
            C2722c c2722c2 = c2723d4.f8825K;
            if (z2) {
                c2722c2.m5247a(this.f8910f, r22);
                if (z3) {
                    c2722c.m5247a(this.f8908d, this.f8914j);
                }
                if (r21 > 0) {
                    this.f8910f.f8809d.f8823I.m5247a(c2722c2, 0);
                }
            } else {
                c2722c.m5247a(this.f8908d, r22);
                if (z3) {
                    c2722c2.m5247a(this.f8910f, this.f8914j);
                }
                if (r21 > 0) {
                    this.f8908d.f8809d.f8825K.m5247a(c2722c, 0);
                }
            }
            C2723d c2723d5 = null;
            for (int r23 = 0; r23 < r12; r23++) {
                int r112 = this.f8918n + r23;
                if (r112 >= c2726g.f8950b1) {
                    return;
                }
                C2723d c2723d6 = c2726g.f8949a1[r112];
                if (c2723d6 != null) {
                    C2722c c2722c3 = c2723d6.f8824J;
                    if (r23 == 0) {
                        c2723d6.m5279f(c2722c3, this.f8909e, this.f8913i);
                        int r132 = c2726g.f8927E0;
                        float f4 = c2726g.f8933K0;
                        if (this.f8918n == 0) {
                            r15 = c2726g.f8929G0;
                            r16 = r132;
                            r13 = -1;
                            if (r15 != -1) {
                                f4 = c2726g.f8935M0;
                                c2723d6.f8860j0 = r15;
                                c2723d6.f8850e0 = f4;
                            }
                        } else {
                            r16 = r132;
                            r13 = -1;
                        }
                        if (!z3 || (r15 = c2726g.f8931I0) == r13) {
                            r15 = r16;
                        } else {
                            f4 = c2726g.f8937O0;
                        }
                        c2723d6.f8860j0 = r15;
                        c2723d6.f8850e0 = f4;
                    }
                    if (r23 == r12 - 1) {
                        c2723d6.m5279f(c2723d6.f8826L, this.f8911g, this.f8915k);
                    }
                    if (c2723d5 != null) {
                        int r133 = c2726g.f8939Q0;
                        C2722c c2722c4 = c2723d5.f8826L;
                        c2722c3.m5247a(c2722c4, r133);
                        if (r23 == r8) {
                            int r134 = this.f8913i;
                            if (c2722c3.m5254h()) {
                                c2722c3.f8813h = r134;
                            }
                        }
                        c2722c4.m5247a(c2722c3, 0);
                        if (r23 == r9 + 1) {
                            int r122 = this.f8915k;
                            if (c2722c4.m5254h()) {
                                c2722c4.f8813h = r122;
                            }
                        }
                    }
                    if (c2723d6 != c2723d4) {
                        C2722c c2722c5 = c2723d6.f8825K;
                        C2722c c2722c6 = c2723d6.f8823I;
                        if (z2) {
                            int r14 = c2726g.f8940R0;
                            if (r14 == 0) {
                                c2722c5.m5247a(c2722c2, 0);
                            } else if (r14 == 1) {
                                c2722c6.m5247a(c2722c, 0);
                            } else if (r14 == 2) {
                                c2722c6.m5247a(c2722c, 0);
                                c2722c5.m5247a(c2722c2, 0);
                            }
                        } else {
                            int r142 = c2726g.f8940R0;
                            if (r142 == 0) {
                                c2722c6.m5247a(c2722c, 0);
                            } else if (r142 == 1) {
                                c2722c5.m5247a(c2722c2, 0);
                            } else if (r142 == 2) {
                                if (z4) {
                                    c2722c6.m5247a(this.f8908d, this.f8912h);
                                    c2722c5.m5247a(this.f8910f, this.f8914j);
                                } else {
                                    c2722c6.m5247a(c2722c, 0);
                                    c2722c5.m5247a(c2722c2, 0);
                                }
                            }
                            c2723d5 = c2723d6;
                        }
                    }
                    c2723d5 = c2723d6;
                }
            }
            return;
        }
        C2723d c2723d7 = this.f8906b;
        c2723d7.f8860j0 = c2726g.f8927E0;
        int r113 = this.f8913i;
        if (r21 > 0) {
            r113 += c2726g.f8939Q0;
        }
        C2722c c2722c7 = this.f8909e;
        C2722c c2722c8 = c2723d7.f8824J;
        c2722c8.m5247a(c2722c7, r113);
        C2722c c2722c9 = c2723d7.f8826L;
        if (z3) {
            c2722c9.m5247a(this.f8911g, this.f8915k);
        }
        if (r21 > 0) {
            this.f8909e.f8809d.f8826L.m5247a(c2722c8, 0);
        }
        if (c2726g.f8941S0 == 3 && !c2723d7.f8819E) {
            for (int r123 = 0; r123 < r12; r123++) {
                int r10 = this.f8918n + (z2 ? (r12 - 1) - r123 : r123);
                if (r10 >= c2726g.f8950b1) {
                    break;
                }
                c2723d = c2726g.f8949a1[r10];
                if (c2723d.f8819E) {
                    break;
                }
            }
        }
        c2723d = c2723d7;
        int r152 = 0;
        C2723d c2723d8 = null;
        while (r152 < r12) {
            int r163 = z2 ? (r12 - 1) - r152 : r152;
            int r143 = this.f8918n + r163;
            if (r143 >= c2726g.f8950b1) {
                return;
            }
            C2723d c2723d9 = c2726g.f8949a1[r143];
            if (c2723d9 == null) {
                r17 = r12;
                c = 3;
            } else {
                C2722c c2722c10 = c2723d9.f8823I;
                if (r152 == 0) {
                    c2723d9.m5279f(c2722c10, this.f8908d, this.f8912h);
                }
                if (r163 == 0) {
                    int r24 = c2726g.f8926D0;
                    if (z2) {
                        r162 = r24;
                        f = 1.0f - c2726g.f8932J0;
                    } else {
                        r162 = r24;
                        f = c2726g.f8932J0;
                    }
                    if (this.f8918n == 0) {
                        int r6 = c2726g.f8928F0;
                        f2 = f;
                        if (r6 != -1) {
                            f3 = z2 ? 1.0f - c2726g.f8934L0 : c2726g.f8934L0;
                            r2 = r6;
                            c2723d9.f8858i0 = r2;
                            c2723d9.f8848d0 = f3;
                        }
                    } else {
                        f2 = f;
                    }
                    if (!z3 || (r2 = c2726g.f8930H0) == -1) {
                        r2 = r162;
                        f3 = f2;
                    } else {
                        f3 = z2 ? 1.0f - c2726g.f8936N0 : c2726g.f8936N0;
                    }
                    c2723d9.f8858i0 = r2;
                    c2723d9.f8848d0 = f3;
                }
                if (r152 == r12 - 1) {
                    r17 = r12;
                    c2723d9.m5279f(c2723d9.f8825K, this.f8910f, this.f8914j);
                } else {
                    r17 = r12;
                }
                if (c2723d8 != null) {
                    int r18 = c2726g.f8938P0;
                    C2722c c2722c11 = c2723d8.f8825K;
                    c2722c10.m5247a(c2722c11, r18);
                    if (r152 == r8) {
                        int r19 = this.f8912h;
                        if (c2722c10.m5254h()) {
                            c2722c10.f8813h = r19;
                        }
                    }
                    c2722c11.m5247a(c2722c10, 0);
                    if (r152 == r9 + 1) {
                        int r110 = this.f8914j;
                        if (c2722c11.m5254h()) {
                            c2722c11.f8813h = r110;
                        }
                    }
                }
                if (c2723d9 != c2723d7) {
                    int r111 = c2726g.f8941S0;
                    c = 3;
                    if (r111 == 3 && c2723d.f8819E && c2723d9 != c2723d && c2723d9.f8819E) {
                        c2723d9.f8827M.m5247a(c2723d.f8827M, 0);
                    } else {
                        C2722c c2722c12 = c2723d9.f8824J;
                        if (r111 != 0) {
                            C2722c c2722c13 = c2723d9.f8826L;
                            if (r111 == 1) {
                                c2722c13.m5247a(c2722c9, 0);
                            } else if (z4) {
                                c2722c12.m5247a(this.f8909e, this.f8913i);
                                c2722c13.m5247a(this.f8911g, this.f8915k);
                            } else {
                                c2722c12.m5247a(c2722c8, 0);
                                c2722c13.m5247a(c2722c9, 0);
                            }
                        } else {
                            c2722c12.m5247a(c2722c8, 0);
                        }
                    }
                } else {
                    c = 3;
                }
                c2723d8 = c2723d9;
            }
            r152++;
            r12 = r17;
        }
    }

    /* renamed from: c */
    public final int m5306c() {
        return this.f8905a == 1 ? this.f8917m - this.f8922r.f8939Q0 : this.f8917m;
    }

    /* renamed from: d */
    public final int m5307d() {
        return this.f8905a == 0 ? this.f8916l - this.f8922r.f8938P0 : this.f8916l;
    }

    /* renamed from: e */
    public final void m5308e(int r11) {
        C2726g c2726g;
        int r3;
        int r02 = this.f8920p;
        if (r02 == 0) {
            return;
        }
        int r12 = this.f8919o;
        int r112 = r11 / r02;
        int r8 = 0;
        while (true) {
            c2726g = this.f8922r;
            if (r8 >= r12 || (r3 = this.f8918n + r8) >= c2726g.f8950b1) {
                break;
            }
            C2723d c2723d = c2726g.f8949a1[r3];
            if (this.f8905a == 0) {
                if (c2723d != null) {
                    int[] r32 = c2723d.f8872p0;
                    if (r32[0] == 3 && c2723d.f8874r == 0) {
                        c2726g.m5313V(1, r112, r32[1], c2723d.m5284k(), c2723d);
                    }
                }
            } else if (c2723d != null) {
                int[] r33 = c2723d.f8872p0;
                if (r33[1] == 3 && c2723d.f8875s == 0) {
                    c2726g.m5313V(r33[0], c2723d.m5288q(), 1, r112, c2723d);
                }
            }
            r8++;
        }
        this.f8916l = 0;
        this.f8917m = 0;
        this.f8906b = null;
        this.f8907c = 0;
        int r113 = this.f8919o;
        for (int r13 = 0; r13 < r113; r13++) {
            int r34 = this.f8918n + r13;
            if (r34 >= c2726g.f8950b1) {
                return;
            }
            C2723d c2723d2 = c2726g.f8949a1[r34];
            if (this.f8905a == 0) {
                int m5288q = c2723d2.m5288q();
                int r6 = c2726g.f8938P0;
                if (c2723d2.f8854g0 == 8) {
                    r6 = 0;
                }
                this.f8916l = m5288q + r6 + this.f8916l;
                int m5311T = c2726g.m5311T(c2723d2, this.f8921q);
                if (this.f8906b == null || this.f8907c < m5311T) {
                    this.f8906b = c2723d2;
                    this.f8907c = m5311T;
                    this.f8917m = m5311T;
                }
            } else {
                int m5312U = c2726g.m5312U(c2723d2, this.f8921q);
                int m5311T2 = c2726g.m5311T(c2723d2, this.f8921q);
                int r7 = c2726g.f8939Q0;
                if (c2723d2.f8854g0 == 8) {
                    r7 = 0;
                }
                this.f8917m = m5311T2 + r7 + this.f8917m;
                if (this.f8906b == null || this.f8907c < m5312U) {
                    this.f8906b = c2723d2;
                    this.f8907c = m5312U;
                    this.f8916l = m5312U;
                }
            }
        }
    }

    /* renamed from: f */
    public final void m5309f(int r12, C2722c c2722c, C2722c c2722c2, C2722c c2722c3, C2722c c2722c4, int r6, int r7, int r8, int r9, int r10) {
        this.f8905a = r12;
        this.f8908d = c2722c;
        this.f8909e = c2722c2;
        this.f8910f = c2722c3;
        this.f8911g = c2722c4;
        this.f8912h = r6;
        this.f8913i = r7;
        this.f8914j = r8;
        this.f8915k = r9;
        this.f8921q = r10;
    }
}
