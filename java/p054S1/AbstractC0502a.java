package p054S1;

import kotlin.jvm.internal.AbstractC2492i;
import p002A1.AbstractC0008a;
import p051R1.C0477g;

/* renamed from: S1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0502a {

    /* renamed from: a */
    public static final byte[] f1291a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC0008a.f6a);
        AbstractC2492i.m4914d(bytes, "getBytes(...)");
        f1291a = bytes;
    }

    /* renamed from: a */
    public static final String m1311a(C0477g c0477g, long j2) {
        AbstractC2492i.m4915e(c0477g, "<this>");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (c0477g.m1255g(j3) == 13) {
                String m1266r = c0477g.m1266r(j3, AbstractC0008a.f6a);
                c0477g.m1268t(2L);
                return m1266r;
            }
        }
        String m1266r2 = c0477g.m1266r(j2, AbstractC0008a.f6a);
        c0477g.m1268t(1L);
        return m1266r2;
    }
}
