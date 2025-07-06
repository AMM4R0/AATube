package p118q;

import java.util.Arrays;
import p000A.AbstractC0002c;
import p002A1.C0015h;

/* renamed from: q.a */
/* loaded from: classes.dex */
public final class C2710a {

    /* renamed from: b */
    public final C2711b f8731b;

    /* renamed from: c */
    public final C0015h f8732c;

    /* renamed from: a */
    public int f8730a = 0;

    /* renamed from: d */
    public int f8733d = 8;

    /* renamed from: e */
    public int[] f8734e = new int[8];

    /* renamed from: f */
    public int[] f8735f = new int[8];

    /* renamed from: g */
    public float[] f8736g = new float[8];

    /* renamed from: h */
    public int f8737h = -1;

    /* renamed from: i */
    public int f8738i = -1;

    /* renamed from: j */
    public boolean f8739j = false;

    public C2710a(C2711b c2711b, C0015h c0015h) {
        this.f8731b = c2711b;
        this.f8732c = c0015h;
    }

    /* renamed from: a */
    public final void m5195a(C2715f c2715f, float f, boolean z2) {
        if (f <= -0.001f || f >= 0.001f) {
            int r12 = this.f8737h;
            C2711b c2711b = this.f8731b;
            if (r12 == -1) {
                this.f8737h = 0;
                this.f8736g[0] = f;
                this.f8734e[0] = c2715f.f8767b;
                this.f8735f[0] = -1;
                c2715f.f8776k++;
                c2715f.m5235a(c2711b);
                this.f8730a++;
                if (this.f8739j) {
                    return;
                }
                int r122 = this.f8738i + 1;
                this.f8738i = r122;
                int[] r13 = this.f8734e;
                if (r122 >= r13.length) {
                    this.f8739j = true;
                    this.f8738i = r13.length - 1;
                    return;
                }
                return;
            }
            int r8 = -1;
            for (int r7 = 0; r12 != -1 && r7 < this.f8730a; r7++) {
                int r9 = this.f8734e[r12];
                int r10 = c2715f.f8767b;
                if (r9 == r10) {
                    float[] fArr = this.f8736g;
                    float f2 = fArr[r12] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[r12] = f2;
                    if (f2 == 0.0f) {
                        if (r12 == this.f8737h) {
                            this.f8737h = this.f8735f[r12];
                        } else {
                            int[] r132 = this.f8735f;
                            r132[r8] = r132[r12];
                        }
                        if (z2) {
                            c2715f.m5236b(c2711b);
                        }
                        if (this.f8739j) {
                            this.f8738i = r12;
                        }
                        c2715f.f8776k--;
                        this.f8730a--;
                        return;
                    }
                    return;
                }
                if (r9 < r10) {
                    r8 = r12;
                }
                r12 = this.f8735f[r12];
            }
            int r14 = this.f8738i;
            int r02 = r14 + 1;
            if (this.f8739j) {
                int[] r03 = this.f8734e;
                if (r03[r14] != -1) {
                    r14 = r03.length;
                }
            } else {
                r14 = r02;
            }
            int[] r04 = this.f8734e;
            if (r14 >= r04.length && this.f8730a < r04.length) {
                int r05 = 0;
                while (true) {
                    int[] r15 = this.f8734e;
                    if (r05 >= r15.length) {
                        break;
                    }
                    if (r15[r05] == -1) {
                        r14 = r05;
                        break;
                    }
                    r05++;
                }
            }
            int[] r06 = this.f8734e;
            if (r14 >= r06.length) {
                r14 = r06.length;
                int r07 = this.f8733d * 2;
                this.f8733d = r07;
                this.f8739j = false;
                this.f8738i = r14 - 1;
                this.f8736g = Arrays.copyOf(this.f8736g, r07);
                this.f8734e = Arrays.copyOf(this.f8734e, this.f8733d);
                this.f8735f = Arrays.copyOf(this.f8735f, this.f8733d);
            }
            this.f8734e[r14] = c2715f.f8767b;
            this.f8736g[r14] = f;
            if (r8 != -1) {
                int[] r133 = this.f8735f;
                r133[r14] = r133[r8];
                r133[r8] = r14;
            } else {
                this.f8735f[r14] = this.f8737h;
                this.f8737h = r14;
            }
            c2715f.f8776k++;
            c2715f.m5235a(c2711b);
            this.f8730a++;
            if (!this.f8739j) {
                this.f8738i++;
            }
            int r123 = this.f8738i;
            int[] r134 = this.f8734e;
            if (r123 >= r134.length) {
                this.f8739j = true;
                this.f8738i = r134.length - 1;
            }
        }
    }

    /* renamed from: b */
    public final void m5196b() {
        int r02 = this.f8737h;
        for (int r2 = 0; r02 != -1 && r2 < this.f8730a; r2++) {
            C2715f c2715f = ((C2715f[]) this.f8732c.f27d)[this.f8734e[r02]];
            if (c2715f != null) {
                c2715f.m5236b(this.f8731b);
            }
            r02 = this.f8735f[r02];
        }
        this.f8737h = -1;
        this.f8738i = -1;
        this.f8739j = false;
        this.f8730a = 0;
    }

    /* renamed from: c */
    public final float m5197c(C2715f c2715f) {
        int r02 = this.f8737h;
        for (int r12 = 0; r02 != -1 && r12 < this.f8730a; r12++) {
            if (this.f8734e[r02] == c2715f.f8767b) {
                return this.f8736g[r02];
            }
            r02 = this.f8735f[r02];
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final int m5198d() {
        return this.f8730a;
    }

    /* renamed from: e */
    public final C2715f m5199e(int r4) {
        int r02 = this.f8737h;
        for (int r12 = 0; r02 != -1 && r12 < this.f8730a; r12++) {
            if (r12 == r4) {
                return ((C2715f[]) this.f8732c.f27d)[this.f8734e[r02]];
            }
            r02 = this.f8735f[r02];
        }
        return null;
    }

    /* renamed from: f */
    public final float m5200f(int r4) {
        int r02 = this.f8737h;
        for (int r12 = 0; r02 != -1 && r12 < this.f8730a; r12++) {
            if (r12 == r4) {
                return this.f8736g[r02];
            }
            r02 = this.f8735f[r02];
        }
        return 0.0f;
    }

    /* renamed from: g */
    public final void m5201g(C2715f c2715f, float f) {
        if (f == 0.0f) {
            m5202h(c2715f, true);
            return;
        }
        int r02 = this.f8737h;
        C2711b c2711b = this.f8731b;
        if (r02 == -1) {
            this.f8737h = 0;
            this.f8736g[0] = f;
            this.f8734e[0] = c2715f.f8767b;
            this.f8735f[0] = -1;
            c2715f.f8776k++;
            c2715f.m5235a(c2711b);
            this.f8730a++;
            if (this.f8739j) {
                return;
            }
            int r10 = this.f8738i + 1;
            this.f8738i = r10;
            int[] r11 = this.f8734e;
            if (r10 >= r11.length) {
                this.f8739j = true;
                this.f8738i = r11.length - 1;
                return;
            }
            return;
        }
        int r6 = -1;
        for (int r5 = 0; r02 != -1 && r5 < this.f8730a; r5++) {
            int r7 = this.f8734e[r02];
            int r8 = c2715f.f8767b;
            if (r7 == r8) {
                this.f8736g[r02] = f;
                return;
            }
            if (r7 < r8) {
                r6 = r02;
            }
            r02 = this.f8735f[r02];
        }
        int r03 = this.f8738i;
        int r52 = r03 + 1;
        if (this.f8739j) {
            int[] r53 = this.f8734e;
            if (r53[r03] != -1) {
                r03 = r53.length;
            }
        } else {
            r03 = r52;
        }
        int[] r54 = this.f8734e;
        if (r03 >= r54.length && this.f8730a < r54.length) {
            int r55 = 0;
            while (true) {
                int[] r72 = this.f8734e;
                if (r55 >= r72.length) {
                    break;
                }
                if (r72[r55] == -1) {
                    r03 = r55;
                    break;
                }
                r55++;
            }
        }
        int[] r56 = this.f8734e;
        if (r03 >= r56.length) {
            r03 = r56.length;
            int r57 = this.f8733d * 2;
            this.f8733d = r57;
            this.f8739j = false;
            this.f8738i = r03 - 1;
            this.f8736g = Arrays.copyOf(this.f8736g, r57);
            this.f8734e = Arrays.copyOf(this.f8734e, this.f8733d);
            this.f8735f = Arrays.copyOf(this.f8735f, this.f8733d);
        }
        this.f8734e[r03] = c2715f.f8767b;
        this.f8736g[r03] = f;
        if (r6 != -1) {
            int[] r112 = this.f8735f;
            r112[r03] = r112[r6];
            r112[r6] = r03;
        } else {
            this.f8735f[r03] = this.f8737h;
            this.f8737h = r03;
        }
        c2715f.f8776k++;
        c2715f.m5235a(c2711b);
        int r102 = this.f8730a + 1;
        this.f8730a = r102;
        if (!this.f8739j) {
            this.f8738i++;
        }
        int[] r113 = this.f8734e;
        if (r102 >= r113.length) {
            this.f8739j = true;
        }
        if (this.f8738i >= r113.length) {
            this.f8739j = true;
            this.f8738i = r113.length - 1;
        }
    }

    /* renamed from: h */
    public final float m5202h(C2715f c2715f, boolean z2) {
        int r02 = this.f8737h;
        if (r02 == -1) {
            return 0.0f;
        }
        int r3 = 0;
        int r4 = -1;
        while (r02 != -1 && r3 < this.f8730a) {
            if (this.f8734e[r02] == c2715f.f8767b) {
                if (r02 == this.f8737h) {
                    this.f8737h = this.f8735f[r02];
                } else {
                    int[] r12 = this.f8735f;
                    r12[r4] = r12[r02];
                }
                if (z2) {
                    c2715f.m5236b(this.f8731b);
                }
                c2715f.f8776k--;
                this.f8730a--;
                this.f8734e[r02] = -1;
                if (this.f8739j) {
                    this.f8738i = r02;
                }
                return this.f8736g[r02];
            }
            r3++;
            r4 = r02;
            r02 = this.f8735f[r02];
        }
        return 0.0f;
    }

    public final String toString() {
        int r02 = this.f8737h;
        String str = "";
        for (int r2 = 0; r02 != -1 && r2 < this.f8730a; r2++) {
            str = (AbstractC0002c.m15j(str, " -> ") + this.f8736g[r02] + " : ") + ((C2715f[]) this.f8732c.f27d)[this.f8734e[r02]];
            r02 = this.f8735f[r02];
        }
        return str;
    }
}
