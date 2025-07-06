package p118q;

import java.util.ArrayList;
import p002A1.C0015h;

/* renamed from: q.b */
/* loaded from: classes.dex */
public class C2711b {

    /* renamed from: d */
    public final C2710a f8743d;

    /* renamed from: a */
    public C2715f f8740a = null;

    /* renamed from: b */
    public float f8741b = 0.0f;

    /* renamed from: c */
    public final ArrayList f8742c = new ArrayList();

    /* renamed from: e */
    public boolean f8744e = false;

    public C2711b(C0015h c0015h) {
        this.f8743d = new C2710a(this, c0015h);
    }

    /* renamed from: a */
    public final void m5203a(C2712c c2712c, int r5) {
        this.f8743d.m5201g(c2712c.m5222j(r5), 1.0f);
        this.f8743d.m5201g(c2712c.m5222j(r5), -1.0f);
    }

    /* renamed from: b */
    public final void m5204b(C2715f c2715f, C2715f c2715f2, C2715f c2715f3, int r6) {
        boolean z2 = false;
        if (r6 != 0) {
            if (r6 < 0) {
                r6 *= -1;
                z2 = true;
            }
            this.f8741b = r6;
        }
        if (z2) {
            this.f8743d.m5201g(c2715f, 1.0f);
            this.f8743d.m5201g(c2715f2, -1.0f);
            this.f8743d.m5201g(c2715f3, -1.0f);
        } else {
            this.f8743d.m5201g(c2715f, -1.0f);
            this.f8743d.m5201g(c2715f2, 1.0f);
            this.f8743d.m5201g(c2715f3, 1.0f);
        }
    }

    /* renamed from: c */
    public final void m5205c(C2715f c2715f, C2715f c2715f2, C2715f c2715f3, int r6) {
        boolean z2 = false;
        if (r6 != 0) {
            if (r6 < 0) {
                r6 *= -1;
                z2 = true;
            }
            this.f8741b = r6;
        }
        if (z2) {
            this.f8743d.m5201g(c2715f, 1.0f);
            this.f8743d.m5201g(c2715f2, -1.0f);
            this.f8743d.m5201g(c2715f3, 1.0f);
        } else {
            this.f8743d.m5201g(c2715f, -1.0f);
            this.f8743d.m5201g(c2715f2, 1.0f);
            this.f8743d.m5201g(c2715f3, -1.0f);
        }
    }

    /* renamed from: d */
    public C2715f mo5206d(boolean[] zArr) {
        return m5208f(zArr, null);
    }

    /* renamed from: e */
    public boolean mo5207e() {
        return this.f8740a == null && this.f8741b == 0.0f && this.f8743d.m5198d() == 0;
    }

    /* renamed from: f */
    public final C2715f m5208f(boolean[] zArr, C2715f c2715f) {
        int r7;
        int m5198d = this.f8743d.m5198d();
        C2715f c2715f2 = null;
        float f = 0.0f;
        for (int r3 = 0; r3 < m5198d; r3++) {
            float m5200f = this.f8743d.m5200f(r3);
            if (m5200f < 0.0f) {
                C2715f m5199e = this.f8743d.m5199e(r3);
                if ((zArr == null || !zArr[m5199e.f8767b]) && m5199e != c2715f && (((r7 = m5199e.f8777l) == 3 || r7 == 4) && m5200f < f)) {
                    f = m5200f;
                    c2715f2 = m5199e;
                }
            }
        }
        return c2715f2;
    }

    /* renamed from: g */
    public final void m5209g(C2715f c2715f) {
        C2715f c2715f2 = this.f8740a;
        if (c2715f2 != null) {
            this.f8743d.m5201g(c2715f2, -1.0f);
            this.f8740a.f8768c = -1;
            this.f8740a = null;
        }
        float m5202h = this.f8743d.m5202h(c2715f, true) * (-1.0f);
        this.f8740a = c2715f;
        if (m5202h == 1.0f) {
            return;
        }
        this.f8741b /= m5202h;
        C2710a c2710a = this.f8743d;
        int r12 = c2710a.f8737h;
        for (int r2 = 0; r12 != -1 && r2 < c2710a.f8730a; r2++) {
            float[] fArr = c2710a.f8736g;
            fArr[r12] = fArr[r12] / m5202h;
            r12 = c2710a.f8735f[r12];
        }
    }

    /* renamed from: h */
    public final void m5210h(C2712c c2712c, C2715f c2715f, boolean z2) {
        if (c2715f == null || !c2715f.f8771f) {
            return;
        }
        float m5197c = this.f8743d.m5197c(c2715f);
        this.f8741b = (c2715f.f8770e * m5197c) + this.f8741b;
        this.f8743d.m5202h(c2715f, z2);
        if (z2) {
            c2715f.m5236b(this);
        }
        if (this.f8743d.m5198d() == 0) {
            this.f8744e = true;
            c2712c.f8747a = true;
        }
    }

    /* renamed from: i */
    public void mo5211i(C2712c c2712c, C2711b c2711b, boolean z2) {
        C2710a c2710a = this.f8743d;
        c2710a.getClass();
        float m5197c = c2710a.m5197c(c2711b.f8740a);
        c2710a.m5202h(c2711b.f8740a, z2);
        C2710a c2710a2 = c2711b.f8743d;
        int m5198d = c2710a2.m5198d();
        for (int r4 = 0; r4 < m5198d; r4++) {
            C2715f m5199e = c2710a2.m5199e(r4);
            c2710a.m5195a(m5199e, c2710a2.m5197c(m5199e) * m5197c, z2);
        }
        this.f8741b = (c2711b.f8741b * m5197c) + this.f8741b;
        if (z2) {
            c2711b.f8740a.m5236b(this);
        }
        if (this.f8740a == null || this.f8743d.m5198d() != 0) {
            return;
        }
        this.f8744e = true;
        c2712c.f8747a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            q.f r0 = r10.f8740a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            q.f r1 = r10.f8740a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = p000A.AbstractC0002c.m15j(r0, r1)
            float r1 = r10.f8741b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f8741b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L3a
        L39:
            r1 = r4
        L3a:
            q.a r5 = r10.f8743d
            int r5 = r5.m5198d()
        L40:
            if (r4 >= r5) goto La0
            q.a r6 = r10.f8743d
            q.f r6 = r6.m5199e(r4)
            if (r6 != 0) goto L4b
            goto L9d
        L4b:
            q.a r7 = r10.f8743d
            float r7 = r7.m5200f(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto L9d
        L56:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L6a
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7a
            java.lang.String r1 = "- "
            java.lang.String r0 = p000A.AbstractC0002c.m15j(r0, r1)
        L68:
            float r7 = r7 * r9
            goto L7a
        L6a:
            if (r8 <= 0) goto L73
            java.lang.String r1 = " + "
            java.lang.String r0 = p000A.AbstractC0002c.m15j(r0, r1)
            goto L7a
        L73:
            java.lang.String r1 = " - "
            java.lang.String r0 = p000A.AbstractC0002c.m15j(r0, r1)
            goto L68
        L7a:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L85
            java.lang.String r0 = p000A.AbstractC0002c.m15j(r0, r6)
            goto L9c
        L85:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L9c:
            r1 = r3
        L9d:
            int r4 = r4 + 1
            goto L40
        La0:
            if (r1 != 0) goto La8
            java.lang.String r1 = "0.0"
            java.lang.String r0 = p000A.AbstractC0002c.m15j(r0, r1)
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p118q.C2711b.toString():java.lang.String");
    }
}
