package p054S1;

import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p051R1.C0477g;
import p051R1.C0480j;
import p051R1.C0492v;
import p081e1.C0879e;

/* renamed from: S1.c */
/* loaded from: classes.dex */
public abstract class AbstractC0504c {

    /* renamed from: a */
    public static final C0480j f1293a;

    /* renamed from: b */
    public static final C0480j f1294b;

    /* renamed from: c */
    public static final C0480j f1295c;

    /* renamed from: d */
    public static final C0480j f1296d;

    /* renamed from: e */
    public static final C0480j f1297e;

    static {
        C0480j c0480j = C0480j.f1218d;
        f1293a = C0879e.m2396i("/");
        f1294b = C0879e.m2396i("\\");
        f1295c = C0879e.m2396i("/\\");
        f1296d = C0879e.m2396i(".");
        f1297e = C0879e.m2396i("..");
    }

    /* renamed from: a */
    public static final int m1318a(C0492v c0492v) {
        if (c0492v.f1245a.mo1220b() == 0) {
            return -1;
        }
        C0480j c0480j = c0492v.f1245a;
        if (c0480j.mo1224g(0) != 47) {
            if (c0480j.mo1224g(0) != 92) {
                if (c0480j.mo1220b() <= 2 || c0480j.mo1224g(1) != 58 || c0480j.mo1224g(2) != 92) {
                    return -1;
                }
                char mo1224g = (char) c0480j.mo1224g(0);
                return (('a' > mo1224g || mo1224g >= '{') && ('A' > mo1224g || mo1224g >= '[')) ? -1 : 3;
            }
            if (c0480j.mo1220b() > 2 && c0480j.mo1224g(1) == 92) {
                C0480j other = f1294b;
                AbstractC2492i.m4915e(other, "other");
                int mo1222d = c0480j.mo1222d(2, other.f1219a);
                return mo1222d == -1 ? c0480j.mo1220b() : mo1222d;
            }
        }
        return 1;
    }

    /* renamed from: b */
    public static final C0492v m1319b(C0492v c0492v, C0492v child, boolean z2) {
        AbstractC2492i.m4915e(c0492v, "<this>");
        AbstractC2492i.m4915e(child, "child");
        if (m1318a(child) != -1 || child.m1286c() != null) {
            return child;
        }
        C0480j m1320c = m1320c(c0492v);
        if (m1320c == null && (m1320c = m1320c(child)) == null) {
            m1320c = m1323f(C0492v.f1244b);
        }
        C0477g c0477g = new C0477g();
        c0477g.m1271w(c0492v.f1245a);
        if (c0477g.f1217b > 0) {
            c0477g.m1271w(m1320c);
        }
        c0477g.m1271w(child.f1245a);
        return m1321d(c0477g, z2);
    }

    /* renamed from: c */
    public static final C0480j m1320c(C0492v c0492v) {
        C0480j c0480j = c0492v.f1245a;
        C0480j c0480j2 = f1293a;
        if (C0480j.m1275e(c0480j, c0480j2) != -1) {
            return c0480j2;
        }
        C0480j c0480j3 = f1294b;
        if (C0480j.m1275e(c0492v.f1245a, c0480j3) != -1) {
            return c0480j3;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fb, code lost:
    
        if (kotlin.jvm.internal.AbstractC2492i.m4911a(r4.get(r4.size() - 1), r9) != false) goto L84;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p051R1.C0492v m1321d(p051R1.C0477g r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p054S1.AbstractC0504c.m1321d(R1.g, boolean):R1.v");
    }

    /* renamed from: e */
    public static final C0480j m1322e(byte b2) {
        if (b2 == 47) {
            return f1293a;
        }
        if (b2 == 92) {
            return f1294b;
        }
        throw new IllegalArgumentException(AbstractC0002c.m11f(b2, "not a directory separator: "));
    }

    /* renamed from: f */
    public static final C0480j m1323f(String str) {
        if (AbstractC2492i.m4911a(str, "/")) {
            return f1293a;
        }
        if (AbstractC2492i.m4911a(str, "\\")) {
            return f1294b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
