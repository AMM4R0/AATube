package p033L1;

import p051R1.C0480j;
import p081e1.C0879e;

/* renamed from: L1.b */
/* loaded from: classes.dex */
public abstract class AbstractC0371b {

    /* renamed from: a */
    public static final C0480j f1013a;

    static {
        C0480j c0480j = C0480j.f1218d;
        f1013a = C0879e.m2396i("xn--");
    }

    /* renamed from: a */
    public static int m1042a(int r02, int r12, boolean z2) {
        int r03 = z2 ? r02 / 700 : r02 / 2;
        int r13 = (r03 / r12) + r03;
        int r04 = 0;
        while (r13 > 455) {
            r13 /= 35;
            r04 += 36;
        }
        return ((r13 * 36) / (r13 + 38)) + r04;
    }

    /* renamed from: b */
    public static int m1043b(int r3) {
        if (r3 < 26) {
            return r3 + 97;
        }
        if (r3 < 36) {
            return r3 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + r3).toString());
    }
}
