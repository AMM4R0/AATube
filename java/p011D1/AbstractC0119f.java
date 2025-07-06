package p011D1;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AbstractC2492i;
import p002A1.AbstractC0017j;
import p002A1.C0015h;
import p002A1.C0016i;
import p008C1.C0083o;
import p036M1.AbstractC0379e;
import p051R1.C0494x;

/* renamed from: D1.f */
/* loaded from: classes.dex */
public abstract class AbstractC0119f {

    /* renamed from: a */
    public static final byte[] f362a = new byte[0];

    /* renamed from: b */
    public static final C0083o f363b;

    /* renamed from: c */
    public static final C0118e f364c;

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0142, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p011D1.AbstractC0119f.<clinit>():void");
    }

    /* renamed from: a */
    public static final void m395a(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("length=" + j2 + ", offset=" + j3 + ", count=" + j3);
        }
    }

    /* renamed from: b */
    public static final void m396b(Closeable closeable) {
        AbstractC2492i.m4915e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public static final int m397c(String str, char c, int r3, int r4) {
        while (r3 < r4) {
            if (str.charAt(r3) == c) {
                return r3;
            }
            r3++;
        }
        return r4;
    }

    /* renamed from: d */
    public static final int m398d(String str, int r2, int r3, String str2) {
        while (r2 < r3) {
            if (AbstractC0017j.m132J(str2, str.charAt(r2))) {
                return r2;
            }
            r2++;
        }
        return r3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
    
        r2 = r2 + 1;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m399e(java.lang.String[] r7, java.lang.String[] r8, java.util.Comparator r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC2492i.m4915e(r7, r0)
            int r0 = r7.length
            r1 = 0
            if (r0 != 0) goto La
            goto L3b
        La:
            if (r8 == 0) goto L3b
            int r0 = r8.length
            if (r0 != 0) goto L10
            goto L3b
        L10:
            int r0 = r7.length
            r2 = r1
        L12:
            if (r2 >= r0) goto L3b
            r3 = r7[r2]
            r4 = r1
        L17:
            int r5 = r8.length
            r6 = 1
            if (r4 >= r5) goto L1d
            r5 = r6
            goto L1e
        L1d:
            r5 = r1
        L1e:
            if (r5 == 0) goto L38
            int r5 = r4 + 1
            r4 = r8[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2d
            int r4 = r9.compare(r3, r4)
            if (r4 != 0) goto L2b
            return r6
        L2b:
            r4 = r5
            goto L17
        L2d:
            r7 = move-exception
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r7)
            throw r8
        L38:
            int r2 = r2 + 1
            goto L12
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p011D1.AbstractC0119f.m399e(java.lang.String[], java.lang.String[], java.util.Comparator):boolean");
    }

    /* renamed from: f */
    public static final int m400f(String str) {
        int length = str.length();
        for (int r12 = 0; r12 < length; r12++) {
            char charAt = str.charAt(r12);
            if (AbstractC2492i.m4916f(charAt, 31) <= 0 || AbstractC2492i.m4916f(charAt, 127) >= 0) {
                return r12;
            }
        }
        return -1;
    }

    /* renamed from: g */
    public static final int m401g(String str, int r3, int r4) {
        while (r3 < r4) {
            char charAt = str.charAt(r3);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return r3;
            }
            r3++;
        }
        return r4;
    }

    /* renamed from: h */
    public static final int m402h(String str, int r3, int r4) {
        int r42 = r4 - 1;
        if (r3 <= r42) {
            while (true) {
                char charAt = str.charAt(r42);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return r42 + 1;
                }
                if (r42 == r3) {
                    break;
                }
                r42--;
            }
        }
        return r3;
    }

    /* renamed from: i */
    public static final String[] m403i(String[] strArr, String[] other, Comparator comparator) {
        AbstractC2492i.m4915e(strArr, "<this>");
        AbstractC2492i.m4915e(other, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int r6 = 0;
            while (true) {
                if (r6 >= length) {
                    break;
                }
                if (comparator.compare(str, other[r6]) == 0) {
                    arrayList.add(str);
                    break;
                }
                r6++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: j */
    public static final boolean m404j(String name) {
        AbstractC2492i.m4915e(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    /* renamed from: k */
    public static final C0015h m405k(C0016i c0016i, String input, int r4) {
        AbstractC2492i.m4915e(c0016i, "<this>");
        AbstractC2492i.m4915e(input, "input");
        Matcher matcher = c0016i.f28a.matcher(input);
        AbstractC2492i.m4914d(matcher, "matcher(...)");
        C0015h c0015h = !matcher.find(r4) ? null : new C0015h(matcher, input);
        if (c0015h == null) {
            return null;
        }
        Matcher matcher2 = (Matcher) c0015h.f25b;
        if (AbstractC0379e.m1069E(matcher2.start(), matcher2.end()).f9519a != r4) {
            return null;
        }
        return c0015h;
    }

    /* renamed from: l */
    public static final int m406l(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    /* renamed from: m */
    public static final int m407m(C0494x c0494x) {
        AbstractC2492i.m4915e(c0494x, "<this>");
        return (c0494x.m1292h() & 255) | ((c0494x.m1292h() & 255) << 16) | ((c0494x.m1292h() & 255) << 8);
    }

    /* renamed from: n */
    public static final int m408n(int r2, String str) {
        if (str == null) {
            return r2;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return r2;
        }
    }

    /* renamed from: o */
    public static final String m409o(String str, int r12, int r2) {
        int m401g = m401g(str, r12, r2);
        String substring = str.substring(m401g, m402h(str, m401g, r2));
        AbstractC2492i.m4914d(substring, "substring(...)");
        return substring;
    }
}
