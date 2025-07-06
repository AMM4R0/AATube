package p027J1;

import io.appmetrica.analytics.coreutils.internal.p097io.Base64Utils;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2492i;
import p011D1.AbstractC0119f;
import p051R1.C0477g;
import p051R1.C0480j;
import p108m1.AbstractC2658h;

/* renamed from: J1.f */
/* loaded from: classes.dex */
public final class C0246f {

    /* renamed from: b */
    public final C0477g f732b;

    /* renamed from: d */
    public boolean f734d;

    /* renamed from: h */
    public int f738h;

    /* renamed from: i */
    public int f739i;

    /* renamed from: a */
    public final boolean f731a = true;

    /* renamed from: c */
    public int f733c = Integer.MAX_VALUE;

    /* renamed from: e */
    public int f735e = Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: f */
    public C0244d[] f736f = new C0244d[8];

    /* renamed from: g */
    public int f737g = 7;

    public C0246f(C0477g c0477g) {
        this.f732b = c0477g;
    }

    /* renamed from: a */
    public final void m659a(int r5) {
        int r2;
        if (r5 > 0) {
            int length = this.f736f.length - 1;
            int r12 = 0;
            while (true) {
                r2 = this.f737g;
                if (length < r2 || r5 <= 0) {
                    break;
                }
                C0244d c0244d = this.f736f[length];
                AbstractC2492i.m4912b(c0244d);
                r5 -= c0244d.f723c;
                int r22 = this.f739i;
                C0244d c0244d2 = this.f736f[length];
                AbstractC2492i.m4912b(c0244d2);
                this.f739i = r22 - c0244d2.f723c;
                this.f738h--;
                r12++;
                length--;
            }
            C0244d[] c0244dArr = this.f736f;
            int r23 = r2 + 1;
            System.arraycopy(c0244dArr, r23, c0244dArr, r23 + r12, this.f738h);
            C0244d[] c0244dArr2 = this.f736f;
            int r02 = this.f737g + 1;
            Arrays.fill(c0244dArr2, r02, r02 + r12, (Object) null);
            this.f737g += r12;
        }
    }

    /* renamed from: b */
    public final void m660b(C0244d c0244d) {
        int r02 = this.f735e;
        int r2 = c0244d.f723c;
        if (r2 > r02) {
            C0244d[] c0244dArr = this.f736f;
            AbstractC2658h.m5108F(c0244dArr, 0, c0244dArr.length);
            this.f737g = this.f736f.length - 1;
            this.f738h = 0;
            this.f739i = 0;
            return;
        }
        m659a((this.f739i + r2) - r02);
        int r03 = this.f738h + 1;
        C0244d[] c0244dArr2 = this.f736f;
        if (r03 > c0244dArr2.length) {
            C0244d[] c0244dArr3 = new C0244d[c0244dArr2.length * 2];
            System.arraycopy(c0244dArr2, 0, c0244dArr3, c0244dArr2.length, c0244dArr2.length);
            this.f737g = this.f736f.length - 1;
            this.f736f = c0244dArr3;
        }
        int r04 = this.f737g;
        this.f737g = r04 - 1;
        this.f736f[r04] = c0244d;
        this.f738h++;
        this.f739i += r2;
    }

    /* renamed from: c */
    public final void m661c(C0480j data) {
        AbstractC2492i.m4915e(data, "data");
        C0477g c0477g = this.f732b;
        if (this.f731a) {
            int[] r2 = AbstractC0237E.f698a;
            int mo1220b = data.mo1220b();
            long j2 = 0;
            for (int r7 = 0; r7 < mo1220b; r7++) {
                byte mo1224g = data.mo1224g(r7);
                byte[] bArr = AbstractC0119f.f362a;
                j2 += AbstractC0237E.f699b[mo1224g & 255];
            }
            if (((int) ((j2 + 7) >> 3)) < data.mo1220b()) {
                C0477g c0477g2 = new C0477g();
                int[] r72 = AbstractC0237E.f698a;
                int mo1220b2 = data.mo1220b();
                long j3 = 0;
                int r5 = 0;
                for (int r4 = 0; r4 < mo1220b2; r4++) {
                    byte mo1224g2 = data.mo1224g(r4);
                    byte[] bArr2 = AbstractC0119f.f362a;
                    int r6 = mo1224g2 & 255;
                    int r10 = AbstractC0237E.f698a[r6];
                    byte b2 = AbstractC0237E.f699b[r6];
                    j3 = (j3 << b2) | r10;
                    r5 += b2;
                    while (r5 >= 8) {
                        r5 -= 8;
                        c0477g2.m1274z((int) (j3 >> r5));
                    }
                }
                if (r5 > 0) {
                    c0477g2.m1274z((int) ((255 >>> r5) | (j3 << (8 - r5))));
                }
                C0480j m1261m = c0477g2.m1261m(c0477g2.f1217b);
                m663e(m1261m.mo1220b(), 127, 128);
                c0477g.m1271w(m1261m);
                return;
            }
        }
        m663e(data.mo1220b(), 127, 0);
        c0477g.m1271w(data);
    }

    /* renamed from: d */
    public final void m662d(ArrayList arrayList) {
        int r5;
        int r8;
        if (this.f734d) {
            int r02 = this.f733c;
            if (r02 < this.f735e) {
                m663e(r02, 31, 32);
            }
            this.f734d = false;
            this.f733c = Integer.MAX_VALUE;
            m663e(this.f735e, 31, 32);
        }
        int size = arrayList.size();
        for (int r2 = 0; r2 < size; r2++) {
            C0244d c0244d = (C0244d) arrayList.get(r2);
            C0480j mo1229n = c0244d.f721a.mo1229n();
            Integer num = (Integer) AbstractC0247g.f741b.get(mo1229n);
            C0480j c0480j = c0244d.f722b;
            if (num != null) {
                int intValue = num.intValue();
                r8 = intValue + 1;
                if (2 <= r8 && r8 < 8) {
                    C0244d[] c0244dArr = AbstractC0247g.f740a;
                    if (AbstractC2492i.m4911a(c0244dArr[intValue].f722b, c0480j)) {
                        r5 = r8;
                    } else if (AbstractC2492i.m4911a(c0244dArr[r8].f722b, c0480j)) {
                        r8 = intValue + 2;
                        r5 = r8;
                    }
                }
                r5 = r8;
                r8 = -1;
            } else {
                r5 = -1;
                r8 = -1;
            }
            if (r8 == -1) {
                int r9 = this.f737g + 1;
                int length = this.f736f.length;
                while (true) {
                    if (r9 >= length) {
                        break;
                    }
                    C0244d c0244d2 = this.f736f[r9];
                    AbstractC2492i.m4912b(c0244d2);
                    if (AbstractC2492i.m4911a(c0244d2.f721a, mo1229n)) {
                        C0244d c0244d3 = this.f736f[r9];
                        AbstractC2492i.m4912b(c0244d3);
                        if (AbstractC2492i.m4911a(c0244d3.f722b, c0480j)) {
                            r8 = AbstractC0247g.f740a.length + (r9 - this.f737g);
                            break;
                        } else if (r5 == -1) {
                            r5 = (r9 - this.f737g) + AbstractC0247g.f740a.length;
                        }
                    }
                    r9++;
                }
            }
            if (r8 != -1) {
                m663e(r8, 127, 128);
            } else if (r5 == -1) {
                this.f732b.m1274z(64);
                m661c(mo1229n);
                m661c(c0480j);
                m660b(c0244d);
            } else {
                C0480j prefix = C0244d.f715d;
                mo1229n.getClass();
                AbstractC2492i.m4915e(prefix, "prefix");
                if (!mo1229n.mo1226j(0, prefix, prefix.mo1220b()) || AbstractC2492i.m4911a(C0244d.f720i, mo1229n)) {
                    m663e(r5, 63, 64);
                    m661c(c0480j);
                    m660b(c0244d);
                } else {
                    m663e(r5, 15, 0);
                    m661c(c0480j);
                }
            }
        }
    }

    /* renamed from: e */
    public final void m663e(int r2, int r3, int r4) {
        C0477g c0477g = this.f732b;
        if (r2 < r3) {
            c0477g.m1274z(r2 | r4);
            return;
        }
        c0477g.m1274z(r4 | r3);
        int r22 = r2 - r3;
        while (r22 >= 128) {
            c0477g.m1274z(128 | (r22 & 127));
            r22 >>>= 7;
        }
        c0477g.m1274z(r22);
    }
}
