package p054S1;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2492i;
import kotlin.jvm.internal.C2495l;
import kotlin.jvm.internal.C2496m;
import kotlin.jvm.internal.C2497n;
import p000A.AbstractC0002c;
import p002A1.AbstractC0017j;
import p002A1.AbstractC0025r;
import p036M1.AbstractC0387m;
import p051R1.C0464A;
import p051R1.C0477g;
import p051R1.C0492v;
import p051R1.C0494x;
import p124s0.C2738i;
import p131u1.InterfaceC2814p;

/* renamed from: S1.b */
/* loaded from: classes.dex */
public abstract class AbstractC0503b {

    /* renamed from: a */
    public static final char[] f1292a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static final int m1312a(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0113, code lost:
    
        if (r5.mo1226j(0, r8, r8.mo1220b()) != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0153  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.LinkedHashMap m1313b(java.util.ArrayList r27) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p054S1.AbstractC0503b.m1313b(java.util.ArrayList):java.util.LinkedHashMap");
    }

    /* renamed from: c */
    public static final String m1314c(int r12) {
        AbstractC0387m.m1109g(16);
        String num = Integer.toString(r12, 16);
        AbstractC2492i.m4914d(num, "toString(...)");
        return "0x".concat(num);
    }

    /* renamed from: d */
    public static final C0508g m1315d(C0494x c0494x) {
        String str;
        long j2;
        int m1295k = c0494x.m1295k();
        if (m1295k != 33639248) {
            throw new IOException("bad zip: expected " + m1314c(33639248) + " but was " + m1314c(m1295k));
        }
        c0494x.m1303s(4L);
        short m1298n = c0494x.m1298n();
        int r2 = m1298n & 65535;
        if ((m1298n & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m1314c(r2));
        }
        int m1298n2 = c0494x.m1298n() & 65535;
        int m1298n3 = c0494x.m1298n() & 65535;
        int m1298n4 = c0494x.m1298n() & 65535;
        long m1295k2 = c0494x.m1295k() & 4294967295L;
        C2496m c2496m = new C2496m();
        c2496m.f8173a = c0494x.m1295k() & 4294967295L;
        C2496m c2496m2 = new C2496m();
        c2496m2.f8173a = c0494x.m1295k() & 4294967295L;
        int m1298n5 = c0494x.m1298n() & 65535;
        int m1298n6 = c0494x.m1298n() & 65535;
        int m1298n7 = c0494x.m1298n() & 65535;
        c0494x.m1303s(8L);
        C2496m c2496m3 = new C2496m();
        c2496m3.f8173a = c0494x.m1295k() & 4294967295L;
        String m1299o = c0494x.m1299o(m1298n5);
        if (AbstractC0017j.m132J(m1299o, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        if (c2496m2.f8173a == 4294967295L) {
            j2 = 8;
            str = m1299o;
        } else {
            str = m1299o;
            j2 = 0;
        }
        if (c2496m.f8173a == 4294967295L) {
            j2 += 8;
        }
        if (c2496m3.f8173a == 4294967295L) {
            j2 += 8;
        }
        long j3 = j2;
        C2497n c2497n = new C2497n();
        C2497n c2497n2 = new C2497n();
        C2497n c2497n3 = new C2497n();
        C2495l c2495l = new C2495l();
        String str2 = str;
        m1316e(c0494x, m1298n6, new C0511j(c2495l, j3, c2496m2, c0494x, c2496m, c2496m3, c2497n, c2497n2, c2497n3));
        if (j3 > 0 && !c2495l.f8172a) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String m1299o2 = c0494x.m1299o(m1298n7);
        String str3 = C0492v.f1244b;
        C0492v m5333f = C2738i.m5333f("/", false);
        C0477g c0477g = new C0477g();
        c0477g.m1249D(str2);
        return new C0508g(AbstractC0504c.m1319b(m5333f, AbstractC0504c.m1321d(c0477g, false), false), AbstractC0025r.m151D(str2, "/", false), m1299o2, m1295k2, c2496m.f8173a, c2496m2.f8173a, m1298n2, c2496m3.f8173a, m1298n4, m1298n3, (Long) c2497n.f8174a, (Long) c2497n2.f8174a, (Long) c2497n3.f8174a, 57344);
    }

    /* renamed from: e */
    public static final void m1316e(C0494x c0494x, int r12, InterfaceC2814p interfaceC2814p) {
        long j2 = r12;
        while (j2 != 0) {
            if (j2 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int m1298n = c0494x.m1298n() & 65535;
            long m1298n2 = c0494x.m1298n() & 65535;
            long j3 = j2 - 4;
            if (j3 < m1298n2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            c0494x.m1302r(m1298n2);
            C0477g c0477g = c0494x.f1250b;
            long j4 = c0477g.f1217b;
            interfaceC2814p.invoke(Integer.valueOf(m1298n), Long.valueOf(m1298n2));
            long j5 = (c0477g.f1217b + m1298n2) - j4;
            if (j5 < 0) {
                throw new IOException(AbstractC0002c.m11f(m1298n, "unsupported zip: too many bytes processed for "));
            }
            if (j5 > 0) {
                c0477g.m1268t(j5);
            }
            j2 = j3 - m1298n2;
        }
    }

    /* renamed from: f */
    public static final int m1317f(C0464A c0464a, int r5) {
        int r2;
        AbstractC2492i.m4915e(c0464a, "<this>");
        int r52 = r5 + 1;
        int length = c0464a.f1188e.length;
        int[] r4 = c0464a.f1189f;
        AbstractC2492i.m4915e(r4, "<this>");
        int r12 = length - 1;
        int r02 = 0;
        while (true) {
            if (r02 <= r12) {
                r2 = (r02 + r12) >>> 1;
                int r3 = r4[r2];
                if (r3 >= r52) {
                    if (r3 <= r52) {
                        break;
                    }
                    r12 = r2 - 1;
                } else {
                    r02 = r2 + 1;
                }
            } else {
                r2 = (-r02) - 1;
                break;
            }
        }
        return r2 >= 0 ? r2 : ~r2;
    }
}
