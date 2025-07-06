package p027J1;

import io.appmetrica.analytics.coreutils.internal.p097io.Base64Utils;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.AbstractC2492i;
import p011D1.AbstractC0119f;
import p051R1.C0477g;
import p051R1.C0480j;
import p051R1.C0494x;
import p108m1.AbstractC2658h;

/* renamed from: J1.e */
/* loaded from: classes.dex */
public final class C0245e {

    /* renamed from: c */
    public final C0494x f726c;

    /* renamed from: f */
    public int f729f;

    /* renamed from: g */
    public int f730g;

    /* renamed from: a */
    public int f724a = Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: b */
    public final ArrayList f725b = new ArrayList();

    /* renamed from: d */
    public C0244d[] f727d = new C0244d[8];

    /* renamed from: e */
    public int f728e = 7;

    public C0245e(C0263w c0263w) {
        this.f726c = new C0494x(c0263w);
    }

    /* renamed from: a */
    public final int m654a(int r5) {
        int r2;
        int r02 = 0;
        if (r5 > 0) {
            int length = this.f727d.length;
            while (true) {
                length--;
                r2 = this.f728e;
                if (length < r2 || r5 <= 0) {
                    break;
                }
                C0244d c0244d = this.f727d[length];
                AbstractC2492i.m4912b(c0244d);
                int r22 = c0244d.f723c;
                r5 -= r22;
                this.f730g -= r22;
                this.f729f--;
                r02++;
            }
            C0244d[] c0244dArr = this.f727d;
            System.arraycopy(c0244dArr, r2 + 1, c0244dArr, r2 + 1 + r02, this.f729f);
            this.f728e += r02;
        }
        return r02;
    }

    /* renamed from: b */
    public final C0480j m655b(int r4) {
        if (r4 >= 0) {
            C0244d[] c0244dArr = AbstractC0247g.f740a;
            if (r4 <= c0244dArr.length - 1) {
                return c0244dArr[r4].f721a;
            }
        }
        int length = this.f728e + 1 + (r4 - AbstractC0247g.f740a.length);
        if (length >= 0) {
            C0244d[] c0244dArr2 = this.f727d;
            if (length < c0244dArr2.length) {
                C0244d c0244d = c0244dArr2[length];
                AbstractC2492i.m4912b(c0244d);
                return c0244d.f721a;
            }
        }
        throw new IOException("Header index too large " + (r4 + 1));
    }

    /* renamed from: c */
    public final void m656c(C0244d c0244d) {
        this.f725b.add(c0244d);
        int r02 = this.f724a;
        int r2 = c0244d.f723c;
        if (r2 > r02) {
            C0244d[] c0244dArr = this.f727d;
            AbstractC2658h.m5108F(c0244dArr, 0, c0244dArr.length);
            this.f728e = this.f727d.length - 1;
            this.f729f = 0;
            this.f730g = 0;
            return;
        }
        m654a((this.f730g + r2) - r02);
        int r03 = this.f729f + 1;
        C0244d[] c0244dArr2 = this.f727d;
        if (r03 > c0244dArr2.length) {
            C0244d[] c0244dArr3 = new C0244d[c0244dArr2.length * 2];
            System.arraycopy(c0244dArr2, 0, c0244dArr3, c0244dArr2.length, c0244dArr2.length);
            this.f728e = this.f727d.length - 1;
            this.f727d = c0244dArr3;
        }
        int r04 = this.f728e;
        this.f728e = r04 - 1;
        this.f727d[r04] = c0244d;
        this.f729f++;
        this.f730g += r2;
    }

    /* renamed from: d */
    public final C0480j m657d() {
        int r3;
        C0494x source = this.f726c;
        byte m1292h = source.m1292h();
        byte[] bArr = AbstractC0119f.f362a;
        int r32 = m1292h & 255;
        int r5 = 0;
        boolean z2 = (m1292h & 128) == 128;
        long m658e = m658e(r32, 127);
        if (!z2) {
            return source.m1293i(m658e);
        }
        C0477g c0477g = new C0477g();
        int[] r6 = AbstractC0237E.f698a;
        AbstractC2492i.m4915e(source, "source");
        C0236D c0236d = AbstractC0237E.f700c;
        C0236D c0236d2 = c0236d;
        int r7 = 0;
        for (long j2 = 0; j2 < m658e; j2++) {
            byte m1292h2 = source.m1292h();
            byte[] bArr2 = AbstractC0119f.f362a;
            r5 = (r5 << 8) | (m1292h2 & 255);
            r7 += 8;
            while (r7 >= 8) {
                int r11 = (r5 >>> (r7 - 8)) & KotlinVersion.MAX_COMPONENT_VALUE;
                C0236D[] c0236dArr = (C0236D[]) c0236d2.f697c;
                AbstractC2492i.m4912b(c0236dArr);
                c0236d2 = c0236dArr[r11];
                AbstractC2492i.m4912b(c0236d2);
                if (((C0236D[]) c0236d2.f697c) == null) {
                    c0477g.m1274z(c0236d2.f695a);
                    r7 -= c0236d2.f696b;
                    c0236d2 = c0236d;
                } else {
                    r7 -= 8;
                }
            }
        }
        while (r7 > 0) {
            int r12 = (r5 << (8 - r7)) & KotlinVersion.MAX_COMPONENT_VALUE;
            C0236D[] c0236dArr2 = (C0236D[]) c0236d2.f697c;
            AbstractC2492i.m4912b(c0236dArr2);
            C0236D c0236d3 = c0236dArr2[r12];
            AbstractC2492i.m4912b(c0236d3);
            if (((C0236D[]) c0236d3.f697c) != null || (r3 = c0236d3.f696b) > r7) {
                break;
            }
            c0477g.m1274z(c0236d3.f695a);
            r7 -= r3;
            c0236d2 = c0236d;
        }
        return c0477g.m1261m(c0477g.f1217b);
    }

    /* renamed from: e */
    public final int m658e(int r4, int r5) {
        int r42 = r4 & r5;
        if (r42 < r5) {
            return r42;
        }
        int r43 = 0;
        while (true) {
            byte m1292h = this.f726c.m1292h();
            byte[] bArr = AbstractC0119f.f362a;
            int r12 = m1292h & 255;
            if ((m1292h & 128) == 0) {
                return r5 + (r12 << r43);
            }
            r5 += (m1292h & Byte.MAX_VALUE) << r43;
            r43 += 7;
        }
    }
}
