package p118q;

import java.util.Arrays;
import p010D0.C0109g;
import p054S1.C0509h;

/* renamed from: q.d */
/* loaded from: classes.dex */
public final class C2713d extends C2711b {

    /* renamed from: f */
    public C2715f[] f8762f;

    /* renamed from: g */
    public C2715f[] f8763g;

    /* renamed from: h */
    public int f8764h;

    /* renamed from: i */
    public C0109g f8765i;

    @Override // p118q.C2711b
    /* renamed from: d */
    public final C2715f mo5206d(boolean[] zArr) {
        int r2 = -1;
        for (int r12 = 0; r12 < this.f8764h; r12++) {
            C2715f[] c2715fArr = this.f8762f;
            C2715f c2715f = c2715fArr[r12];
            if (!zArr[c2715f.f8767b]) {
                C0109g c0109g = this.f8765i;
                c0109g.f338b = c2715f;
                int r4 = 8;
                if (r2 == -1) {
                    while (r4 >= 0) {
                        float f = ((C2715f) c0109g.f338b).f8773h[r4];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                r2 = r12;
                                break;
                            }
                            r4--;
                        }
                    }
                } else {
                    C2715f c2715f2 = c2715fArr[r2];
                    while (true) {
                        if (r4 >= 0) {
                            float f2 = c2715f2.f8773h[r4];
                            float f3 = ((C2715f) c0109g.f338b).f8773h[r4];
                            if (f3 == f2) {
                                r4--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (r2 == -1) {
            return null;
        }
        return this.f8762f[r2];
    }

    @Override // p118q.C2711b
    /* renamed from: e */
    public final boolean mo5207e() {
        return this.f8764h == 0;
    }

    @Override // p118q.C2711b
    /* renamed from: i */
    public final void mo5211i(C2712c c2712c, C2711b c2711b, boolean z2) {
        C2715f c2715f = c2711b.f8740a;
        if (c2715f == null) {
            return;
        }
        C2710a c2710a = c2711b.f8743d;
        int m5198d = c2710a.m5198d();
        for (int r6 = 0; r6 < m5198d; r6++) {
            C2715f m5199e = c2710a.m5199e(r6);
            float m5200f = c2710a.m5200f(r6);
            C0109g c0109g = this.f8765i;
            c0109g.f338b = m5199e;
            boolean z3 = m5199e.f8766a;
            float[] fArr = c2715f.f8773h;
            if (z3) {
                boolean z4 = true;
                for (int r10 = 0; r10 < 9; r10++) {
                    float[] fArr2 = ((C2715f) c0109g.f338b).f8773h;
                    float f = (fArr[r10] * m5200f) + fArr2[r10];
                    fArr2[r10] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((C2715f) c0109g.f338b).f8773h[r10] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C2713d) c0109g.f339c).m5233k((C2715f) c0109g.f338b);
                }
            } else {
                for (int r102 = 0; r102 < 9; r102++) {
                    float f2 = fArr[r102];
                    if (f2 != 0.0f) {
                        float f3 = f2 * m5200f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((C2715f) c0109g.f338b).f8773h[r102] = f3;
                    } else {
                        ((C2715f) c0109g.f338b).f8773h[r102] = 0.0f;
                    }
                }
                m5232j(m5199e);
            }
            this.f8741b = (c2711b.f8741b * m5200f) + this.f8741b;
        }
        m5233k(c2715f);
    }

    /* renamed from: j */
    public final void m5232j(C2715f c2715f) {
        int r3;
        int r02 = this.f8764h + 1;
        C2715f[] c2715fArr = this.f8762f;
        if (r02 > c2715fArr.length) {
            C2715f[] c2715fArr2 = (C2715f[]) Arrays.copyOf(c2715fArr, c2715fArr.length * 2);
            this.f8762f = c2715fArr2;
            this.f8763g = (C2715f[]) Arrays.copyOf(c2715fArr2, c2715fArr2.length * 2);
        }
        C2715f[] c2715fArr3 = this.f8762f;
        int r2 = this.f8764h;
        c2715fArr3[r2] = c2715f;
        int r32 = r2 + 1;
        this.f8764h = r32;
        if (r32 > 1 && c2715fArr3[r2].f8767b > c2715f.f8767b) {
            int r22 = 0;
            while (true) {
                r3 = this.f8764h;
                if (r22 >= r3) {
                    break;
                }
                this.f8763g[r22] = this.f8762f[r22];
                r22++;
            }
            Arrays.sort(this.f8763g, 0, r3, new C0509h(3));
            for (int r03 = 0; r03 < this.f8764h; r03++) {
                this.f8762f[r03] = this.f8763g[r03];
            }
        }
        c2715f.f8766a = true;
        c2715f.m5235a(this);
    }

    /* renamed from: k */
    public final void m5233k(C2715f c2715f) {
        int r12 = 0;
        while (r12 < this.f8764h) {
            if (this.f8762f[r12] == c2715f) {
                while (true) {
                    int r2 = this.f8764h;
                    if (r12 >= r2 - 1) {
                        this.f8764h = r2 - 1;
                        c2715f.f8766a = false;
                        return;
                    } else {
                        C2715f[] c2715fArr = this.f8762f;
                        int r3 = r12 + 1;
                        c2715fArr[r12] = c2715fArr[r3];
                        r12 = r3;
                    }
                }
            } else {
                r12++;
            }
        }
    }

    @Override // p118q.C2711b
    public final String toString() {
        String str = " goal -> (" + this.f8741b + ") : ";
        for (int r12 = 0; r12 < this.f8764h; r12++) {
            C2715f c2715f = this.f8762f[r12];
            C0109g c0109g = this.f8765i;
            c0109g.f338b = c2715f;
            str = str + c0109g + " ";
        }
        return str;
    }
}
