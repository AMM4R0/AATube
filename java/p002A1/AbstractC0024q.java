package p002A1;

import kotlin.jvm.internal.AbstractC2492i;
import p036M1.AbstractC0387m;

/* renamed from: A1.q */
/* loaded from: classes.dex */
public abstract class AbstractC0024q extends AbstractC0023p {
    /* renamed from: C */
    public static Integer m150C(String str) {
        boolean z2;
        int r5;
        int r3;
        AbstractC0387m.m1109g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int r32 = 0;
        char charAt = str.charAt(0);
        int r6 = -2147483647;
        if (AbstractC2492i.m4916f(charAt, 48) < 0) {
            r5 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                r6 = Integer.MIN_VALUE;
                z2 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z2 = false;
            }
        } else {
            z2 = false;
            r5 = 0;
        }
        int r8 = -59652323;
        while (r5 < length) {
            int digit = Character.digit((int) str.charAt(r5), 10);
            if (digit < 0) {
                return null;
            }
            if ((r32 < r8 && (r8 != -59652323 || r32 < (r8 = r6 / 10))) || (r3 = r32 * 10) < r6 + digit) {
                return null;
            }
            r32 = r3 - digit;
            r5++;
        }
        return z2 ? Integer.valueOf(r32) : Integer.valueOf(-r32);
    }
}
