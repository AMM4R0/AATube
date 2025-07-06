package p118q;

import java.util.Arrays;
import p002A1.C0015h;
import p010D0.C0109g;
import p025J.C0218a;
import p123s.C2722c;

/* renamed from: q.c */
/* loaded from: classes.dex */
public final class C2712c {

    /* renamed from: p */
    public static boolean f8745p = false;

    /* renamed from: q */
    public static int f8746q = 1000;

    /* renamed from: c */
    public final C2713d f8749c;

    /* renamed from: f */
    public C2711b[] f8752f;

    /* renamed from: l */
    public final C0015h f8758l;

    /* renamed from: o */
    public C2711b f8761o;

    /* renamed from: a */
    public boolean f8747a = false;

    /* renamed from: b */
    public int f8748b = 0;

    /* renamed from: d */
    public int f8750d = 32;

    /* renamed from: e */
    public int f8751e = 32;

    /* renamed from: g */
    public boolean f8753g = false;

    /* renamed from: h */
    public boolean[] f8754h = new boolean[32];

    /* renamed from: i */
    public int f8755i = 1;

    /* renamed from: j */
    public int f8756j = 0;

    /* renamed from: k */
    public int f8757k = 32;

    /* renamed from: m */
    public C2715f[] f8759m = new C2715f[f8746q];

    /* renamed from: n */
    public int f8760n = 0;

    public C2712c() {
        this.f8752f = null;
        this.f8752f = new C2711b[32];
        m5230s();
        C0015h c0015h = new C0015h(8);
        c0015h.f25b = new C0218a();
        c0015h.f26c = new C0218a();
        c0015h.f27d = new C2715f[32];
        this.f8758l = c0015h;
        C2713d c2713d = new C2713d(c0015h);
        c2713d.f8762f = new C2715f[128];
        c2713d.f8763g = new C2715f[128];
        c2713d.f8764h = 0;
        c2713d.f8765i = new C0109g(c2713d);
        this.f8749c = c2713d;
        this.f8761o = new C2711b(c0015h);
    }

    /* renamed from: n */
    public static int m5212n(Object obj) {
        C2715f c2715f = ((C2722c) obj).f8814i;
        if (c2715f != null) {
            return (int) (c2715f.f8770e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* renamed from: a */
    public final C2715f m5213a(int r6) {
        C0218a c0218a = (C0218a) this.f8758l.f26c;
        int r12 = c0218a.f649b;
        C2715f c2715f = null;
        if (r12 > 0) {
            int r13 = r12 - 1;
            ?? r3 = c0218a.f648a;
            ?? r4 = r3[r13];
            r3[r13] = 0;
            c0218a.f649b = r13;
            c2715f = r4;
        }
        C2715f c2715f2 = c2715f;
        if (c2715f2 == null) {
            c2715f2 = new C2715f(r6);
            c2715f2.f8777l = r6;
        } else {
            c2715f2.m5237c();
            c2715f2.f8777l = r6;
        }
        int r62 = this.f8760n;
        int r02 = f8746q;
        if (r62 >= r02) {
            int r03 = r02 * 2;
            f8746q = r03;
            this.f8759m = (C2715f[]) Arrays.copyOf(this.f8759m, r03);
        }
        C2715f[] c2715fArr = this.f8759m;
        int r04 = this.f8760n;
        this.f8760n = r04 + 1;
        c2715fArr[r04] = c2715f2;
        return c2715f2;
    }

    /* renamed from: b */
    public final void m5214b(C2715f c2715f, C2715f c2715f2, int r9, float f, C2715f c2715f3, C2715f c2715f4, int r13, int r14) {
        C2711b m5224l = m5224l();
        if (c2715f2 == c2715f3) {
            m5224l.f8743d.m5201g(c2715f, 1.0f);
            m5224l.f8743d.m5201g(c2715f4, 1.0f);
            m5224l.f8743d.m5201g(c2715f2, -2.0f);
        } else if (f == 0.5f) {
            m5224l.f8743d.m5201g(c2715f, 1.0f);
            m5224l.f8743d.m5201g(c2715f2, -1.0f);
            m5224l.f8743d.m5201g(c2715f3, -1.0f);
            m5224l.f8743d.m5201g(c2715f4, 1.0f);
            if (r9 > 0 || r13 > 0) {
                m5224l.f8741b = (-r9) + r13;
            }
        } else if (f <= 0.0f) {
            m5224l.f8743d.m5201g(c2715f, -1.0f);
            m5224l.f8743d.m5201g(c2715f2, 1.0f);
            m5224l.f8741b = r9;
        } else if (f >= 1.0f) {
            m5224l.f8743d.m5201g(c2715f4, -1.0f);
            m5224l.f8743d.m5201g(c2715f3, 1.0f);
            m5224l.f8741b = -r13;
        } else {
            float f2 = 1.0f - f;
            m5224l.f8743d.m5201g(c2715f, f2 * 1.0f);
            m5224l.f8743d.m5201g(c2715f2, f2 * (-1.0f));
            m5224l.f8743d.m5201g(c2715f3, (-1.0f) * f);
            m5224l.f8743d.m5201g(c2715f4, 1.0f * f);
            if (r9 > 0 || r13 > 0) {
                m5224l.f8741b = (r13 * f) + ((-r9) * f2);
            }
        }
        if (r14 != 8) {
            m5224l.m5203a(this, r14);
        }
        m5215c(m5224l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f8776k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f8776k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f8776k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f8776k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bc A[ORIG_RETURN, RETURN] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5215c(p118q.C2711b r17) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p118q.C2712c.m5215c(q.b):void");
    }

    /* renamed from: d */
    public final void m5216d(C2715f c2715f, int r6) {
        int r02 = c2715f.f8768c;
        if (r02 == -1) {
            c2715f.m5238d(this, r6);
            for (int r5 = 0; r5 < this.f8748b + 1; r5++) {
                C2715f c2715f2 = ((C2715f[]) this.f8758l.f27d)[r5];
            }
            return;
        }
        if (r02 == -1) {
            C2711b m5224l = m5224l();
            m5224l.f8740a = c2715f;
            float f = r6;
            c2715f.f8770e = f;
            m5224l.f8741b = f;
            m5224l.f8744e = true;
            m5215c(m5224l);
            return;
        }
        C2711b c2711b = this.f8752f[r02];
        if (c2711b.f8744e) {
            c2711b.f8741b = r6;
            return;
        }
        if (c2711b.f8743d.m5198d() == 0) {
            c2711b.f8744e = true;
            c2711b.f8741b = r6;
            return;
        }
        C2711b m5224l2 = m5224l();
        if (r6 < 0) {
            m5224l2.f8741b = r6 * (-1);
            m5224l2.f8743d.m5201g(c2715f, 1.0f);
        } else {
            m5224l2.f8741b = r6;
            m5224l2.f8743d.m5201g(c2715f, -1.0f);
        }
        m5215c(m5224l2);
    }

    /* renamed from: e */
    public final void m5217e(C2715f c2715f, C2715f c2715f2, int r7, int r8) {
        if (r8 == 8 && c2715f2.f8771f && c2715f.f8768c == -1) {
            c2715f.m5238d(this, c2715f2.f8770e + r7);
            return;
        }
        C2711b m5224l = m5224l();
        boolean z2 = false;
        if (r7 != 0) {
            if (r7 < 0) {
                r7 *= -1;
                z2 = true;
            }
            m5224l.f8741b = r7;
        }
        if (z2) {
            m5224l.f8743d.m5201g(c2715f, 1.0f);
            m5224l.f8743d.m5201g(c2715f2, -1.0f);
        } else {
            m5224l.f8743d.m5201g(c2715f, -1.0f);
            m5224l.f8743d.m5201g(c2715f2, 1.0f);
        }
        if (r8 != 8) {
            m5224l.m5203a(this, r8);
        }
        m5215c(m5224l);
    }

    /* renamed from: f */
    public final void m5218f(C2715f c2715f, C2715f c2715f2, int r6, int r7) {
        C2711b m5224l = m5224l();
        C2715f m5225m = m5225m();
        m5225m.f8769d = 0;
        m5224l.m5204b(c2715f, c2715f2, m5225m, r6);
        if (r7 != 8) {
            m5224l.f8743d.m5201g(m5222j(r7), (int) (m5224l.f8743d.m5197c(m5225m) * (-1.0f)));
        }
        m5215c(m5224l);
    }

    /* renamed from: g */
    public final void m5219g(C2715f c2715f, C2715f c2715f2, int r6, int r7) {
        C2711b m5224l = m5224l();
        C2715f m5225m = m5225m();
        m5225m.f8769d = 0;
        m5224l.m5205c(c2715f, c2715f2, m5225m, r6);
        if (r7 != 8) {
            m5224l.f8743d.m5201g(m5222j(r7), (int) (m5224l.f8743d.m5197c(m5225m) * (-1.0f)));
        }
        m5215c(m5224l);
    }

    /* renamed from: h */
    public final void m5220h(C2711b c2711b) {
        int r4;
        if (c2711b.f8744e) {
            c2711b.f8740a.m5238d(this, c2711b.f8741b);
        } else {
            C2711b[] c2711bArr = this.f8752f;
            int r12 = this.f8756j;
            c2711bArr[r12] = c2711b;
            C2715f c2715f = c2711b.f8740a;
            c2715f.f8768c = r12;
            this.f8756j = r12 + 1;
            c2715f.m5239e(this, c2711b);
        }
        if (this.f8747a) {
            int r02 = 0;
            while (r02 < this.f8756j) {
                if (this.f8752f[r02] == null) {
                    System.out.println("WTF");
                }
                C2711b c2711b2 = this.f8752f[r02];
                if (c2711b2 != null && c2711b2.f8744e) {
                    c2711b2.f8740a.m5238d(this, c2711b2.f8741b);
                    ((C0218a) this.f8758l.f25b).m609b(c2711b2);
                    this.f8752f[r02] = null;
                    int r13 = r02 + 1;
                    int r3 = r13;
                    while (true) {
                        r4 = this.f8756j;
                        if (r13 >= r4) {
                            break;
                        }
                        C2711b[] c2711bArr2 = this.f8752f;
                        int r42 = r13 - 1;
                        C2711b c2711b3 = c2711bArr2[r13];
                        c2711bArr2[r42] = c2711b3;
                        C2715f c2715f2 = c2711b3.f8740a;
                        if (c2715f2.f8768c == r13) {
                            c2715f2.f8768c = r42;
                        }
                        r3 = r13;
                        r13++;
                    }
                    if (r3 < r4) {
                        this.f8752f[r3] = null;
                    }
                    this.f8756j = r4 - 1;
                    r02--;
                }
                r02++;
            }
            this.f8747a = false;
        }
    }

    /* renamed from: i */
    public final void m5221i() {
        for (int r02 = 0; r02 < this.f8756j; r02++) {
            C2711b c2711b = this.f8752f[r02];
            c2711b.f8740a.f8770e = c2711b.f8741b;
        }
    }

    /* renamed from: j */
    public final C2715f m5222j(int r5) {
        if (this.f8755i + 1 >= this.f8751e) {
            m5226o();
        }
        C2715f m5213a = m5213a(4);
        int r12 = this.f8748b + 1;
        this.f8748b = r12;
        this.f8755i++;
        m5213a.f8767b = r12;
        m5213a.f8769d = r5;
        ((C2715f[]) this.f8758l.f27d)[r12] = m5213a;
        C2713d c2713d = this.f8749c;
        c2713d.f8765i.f338b = m5213a;
        float[] fArr = m5213a.f8773h;
        Arrays.fill(fArr, 0.0f);
        fArr[m5213a.f8769d] = 1.0f;
        c2713d.m5232j(m5213a);
        return m5213a;
    }

    /* renamed from: k */
    public final C2715f m5223k(Object obj) {
        C2715f c2715f = null;
        if (obj == null) {
            return null;
        }
        if (this.f8755i + 1 >= this.f8751e) {
            m5226o();
        }
        if (obj instanceof C2722c) {
            C2722c c2722c = (C2722c) obj;
            c2715f = c2722c.f8814i;
            if (c2715f == null) {
                c2722c.m5257k();
                c2715f = c2722c.f8814i;
            }
            int r6 = c2715f.f8767b;
            C0015h c0015h = this.f8758l;
            if (r6 == -1 || r6 > this.f8748b || ((C2715f[]) c0015h.f27d)[r6] == null) {
                if (r6 != -1) {
                    c2715f.m5237c();
                }
                int r62 = this.f8748b + 1;
                this.f8748b = r62;
                this.f8755i++;
                c2715f.f8767b = r62;
                c2715f.f8777l = 1;
                ((C2715f[]) c0015h.f27d)[r62] = c2715f;
            }
        }
        return c2715f;
    }

    /* renamed from: l */
    public final C2711b m5224l() {
        Object obj;
        C0015h c0015h = this.f8758l;
        C0218a c0218a = (C0218a) c0015h.f25b;
        int r2 = c0218a.f649b;
        if (r2 > 0) {
            int r22 = r2 - 1;
            Object[] objArr = c0218a.f648a;
            obj = objArr[r22];
            objArr[r22] = null;
            c0218a.f649b = r22;
        } else {
            obj = null;
        }
        C2711b c2711b = (C2711b) obj;
        if (c2711b == null) {
            return new C2711b(c0015h);
        }
        c2711b.f8740a = null;
        c2711b.f8743d.m5196b();
        c2711b.f8741b = 0.0f;
        c2711b.f8744e = false;
        return c2711b;
    }

    /* renamed from: m */
    public final C2715f m5225m() {
        if (this.f8755i + 1 >= this.f8751e) {
            m5226o();
        }
        C2715f m5213a = m5213a(3);
        int r12 = this.f8748b + 1;
        this.f8748b = r12;
        this.f8755i++;
        m5213a.f8767b = r12;
        ((C2715f[]) this.f8758l.f27d)[r12] = m5213a;
        return m5213a;
    }

    /* renamed from: o */
    public final void m5226o() {
        int r02 = this.f8750d * 2;
        this.f8750d = r02;
        this.f8752f = (C2711b[]) Arrays.copyOf(this.f8752f, r02);
        C0015h c0015h = this.f8758l;
        c0015h.f27d = (C2715f[]) Arrays.copyOf((C2715f[]) c0015h.f27d, this.f8750d);
        int r03 = this.f8750d;
        this.f8754h = new boolean[r03];
        this.f8751e = r03;
        this.f8757k = r03;
    }

    /* renamed from: p */
    public final void m5227p() {
        C2713d c2713d = this.f8749c;
        if (c2713d.mo5207e()) {
            m5221i();
            return;
        }
        if (!this.f8753g) {
            m5228q(c2713d);
            return;
        }
        for (int r12 = 0; r12 < this.f8756j; r12++) {
            if (!this.f8752f[r12].f8744e) {
                m5228q(c2713d);
                return;
            }
        }
        m5221i();
    }

    /* renamed from: q */
    public final void m5228q(C2713d c2713d) {
        int r2 = 0;
        while (true) {
            if (r2 >= this.f8756j) {
                break;
            }
            C2711b c2711b = this.f8752f[r2];
            int r5 = 1;
            if (c2711b.f8740a.f8777l != 1) {
                float f = 0.0f;
                if (c2711b.f8741b < 0.0f) {
                    boolean z2 = false;
                    int r3 = 0;
                    while (!z2) {
                        r3 += r5;
                        float f2 = Float.MAX_VALUE;
                        int r9 = -1;
                        int r10 = -1;
                        int r8 = 0;
                        int r11 = 0;
                        while (r8 < this.f8756j) {
                            C2711b c2711b2 = this.f8752f[r8];
                            if (c2711b2.f8740a.f8777l != r5 && !c2711b2.f8744e && c2711b2.f8741b < f) {
                                int m5198d = c2711b2.f8743d.m5198d();
                                int r14 = 0;
                                while (r14 < m5198d) {
                                    C2715f m5199e = c2711b2.f8743d.m5199e(r14);
                                    float m5197c = c2711b2.f8743d.m5197c(m5199e);
                                    if (m5197c > f) {
                                        for (int r4 = 0; r4 < 9; r4++) {
                                            float f3 = m5199e.f8772g[r4] / m5197c;
                                            if ((f3 < f2 && r4 == r11) || r4 > r11) {
                                                r11 = r4;
                                                r10 = m5199e.f8767b;
                                                r9 = r8;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    r14++;
                                    f = 0.0f;
                                }
                            }
                            r8++;
                            f = 0.0f;
                            r5 = 1;
                        }
                        if (r9 != -1) {
                            C2711b c2711b3 = this.f8752f[r9];
                            c2711b3.f8740a.f8768c = -1;
                            c2711b3.m5209g(((C2715f[]) this.f8758l.f27d)[r10]);
                            C2715f c2715f = c2711b3.f8740a;
                            c2715f.f8768c = r9;
                            c2715f.m5239e(this, c2711b3);
                        } else {
                            z2 = true;
                        }
                        if (r3 > this.f8755i / 2) {
                            z2 = true;
                        }
                        f = 0.0f;
                        r5 = 1;
                    }
                }
            }
            r2++;
        }
        m5229r(c2713d);
        m5221i();
    }

    /* renamed from: r */
    public final void m5229r(C2711b c2711b) {
        boolean z2;
        int r2 = 0;
        for (int r3 = 0; r3 < this.f8755i; r3++) {
            this.f8754h[r3] = false;
        }
        boolean z3 = false;
        int r4 = 0;
        while (!z3) {
            int r5 = 1;
            r4++;
            if (r4 >= this.f8755i * 2) {
                return;
            }
            C2715f c2715f = c2711b.f8740a;
            if (c2715f != null) {
                this.f8754h[c2715f.f8767b] = true;
            }
            C2715f mo5206d = c2711b.mo5206d(this.f8754h);
            if (mo5206d != null) {
                boolean[] zArr = this.f8754h;
                int r8 = mo5206d.f8767b;
                if (zArr[r8]) {
                    return;
                } else {
                    zArr[r8] = true;
                }
            }
            if (mo5206d != null) {
                float f = Float.MAX_VALUE;
                int r9 = r2;
                int r10 = -1;
                while (r9 < this.f8756j) {
                    C2711b c2711b2 = this.f8752f[r9];
                    if (c2711b2.f8740a.f8777l != r5 && !c2711b2.f8744e) {
                        C2710a c2710a = c2711b2.f8743d;
                        int r13 = c2710a.f8737h;
                        if (r13 != -1) {
                            for (int r22 = 0; r13 != -1 && r22 < c2710a.f8730a; r22++) {
                                if (c2710a.f8734e[r13] == mo5206d.f8767b) {
                                    z2 = true;
                                    break;
                                }
                                r13 = c2710a.f8735f[r13];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float m5197c = c2711b2.f8743d.m5197c(mo5206d);
                            if (m5197c < 0.0f) {
                                float f2 = (-c2711b2.f8741b) / m5197c;
                                if (f2 < f) {
                                    f = f2;
                                    r10 = r9;
                                }
                            }
                        }
                    }
                    r9++;
                    r5 = 1;
                }
                if (r10 > -1) {
                    C2711b c2711b3 = this.f8752f[r10];
                    c2711b3.f8740a.f8768c = -1;
                    c2711b3.m5209g(mo5206d);
                    C2715f c2715f2 = c2711b3.f8740a;
                    c2715f2.f8768c = r10;
                    c2715f2.m5239e(this, c2711b3);
                }
            } else {
                z3 = true;
            }
            r2 = 0;
        }
    }

    /* renamed from: s */
    public final void m5230s() {
        for (int r02 = 0; r02 < this.f8756j; r02++) {
            C2711b c2711b = this.f8752f[r02];
            if (c2711b != null) {
                ((C0218a) this.f8758l.f25b).m609b(c2711b);
            }
            this.f8752f[r02] = null;
        }
    }

    /* renamed from: t */
    public final void m5231t() {
        C0015h c0015h;
        int r12 = 0;
        while (true) {
            c0015h = this.f8758l;
            C2715f[] c2715fArr = (C2715f[]) c0015h.f27d;
            if (r12 >= c2715fArr.length) {
                break;
            }
            C2715f c2715f = c2715fArr[r12];
            if (c2715f != null) {
                c2715f.m5237c();
            }
            r12++;
        }
        C0218a c0218a = (C0218a) c0015h.f26c;
        C2715f[] c2715fArr2 = this.f8759m;
        int r4 = this.f8760n;
        c0218a.getClass();
        if (r4 > c2715fArr2.length) {
            r4 = c2715fArr2.length;
        }
        for (int r5 = 0; r5 < r4; r5++) {
            C2715f c2715f2 = c2715fArr2[r5];
            int r7 = c0218a.f649b;
            Object[] objArr = c0218a.f648a;
            if (r7 < objArr.length) {
                objArr[r7] = c2715f2;
                c0218a.f649b = r7 + 1;
            }
        }
        this.f8760n = 0;
        Arrays.fill((C2715f[]) c0015h.f27d, (Object) null);
        this.f8748b = 0;
        C2713d c2713d = this.f8749c;
        c2713d.f8764h = 0;
        c2713d.f8741b = 0.0f;
        this.f8755i = 1;
        for (int r13 = 0; r13 < this.f8756j; r13++) {
            C2711b c2711b = this.f8752f[r13];
        }
        m5230s();
        this.f8756j = 0;
        this.f8761o = new C2711b(c0015h);
    }
}
