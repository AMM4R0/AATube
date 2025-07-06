package p002A1;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC2492i;
import p140x1.C2890b;
import p140x1.C2893e;

/* renamed from: A1.r */
/* loaded from: classes.dex */
public abstract class AbstractC0025r extends AbstractC0024q {
    /* renamed from: D */
    public static boolean m151D(String str, String str2, boolean z2) {
        AbstractC2492i.m4915e(str, "<this>");
        return !z2 ? str.endsWith(str2) : m153F(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public static boolean m152E(String str) {
        AbstractC2492i.m4915e(str, "<this>");
        if (str.length() == 0) {
            return true;
        }
        C2893e c2893e = new C2893e(0, str.length() - 1, 1);
        if ((c2893e instanceof Collection) && ((Collection) c2893e).isEmpty()) {
            return true;
        }
        C2890b it = c2893e.iterator();
        while (it.f9517d) {
            char charAt = str.charAt(it.m5481a());
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    public static boolean m153F(int r6, int r7, int r8, String str, String other, boolean z2) {
        AbstractC2492i.m4915e(str, "<this>");
        AbstractC2492i.m4915e(other, "other");
        return !z2 ? str.regionMatches(r6, other, r7, r8) : str.regionMatches(z2, r6, other, r7, r8);
    }

    /* renamed from: G */
    public static String m154G(String str, String str2, String str3) {
        AbstractC2492i.m4915e(str, "<this>");
        int m135M = AbstractC0017j.m135M(str, str2, 0, false);
        if (m135M < 0) {
            return str;
        }
        int length = str2.length();
        int r3 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int r5 = 0;
        do {
            sb.append((CharSequence) str, r5, m135M);
            sb.append(str3);
            r5 = m135M + length;
            if (m135M >= str.length()) {
                break;
            }
            m135M = AbstractC0017j.m135M(str, str2, m135M + r3, false);
        } while (m135M > 0);
        sb.append((CharSequence) str, r5, str.length());
        String sb2 = sb.toString();
        AbstractC2492i.m4914d(sb2, "toString(...)");
        return sb2;
    }

    /* renamed from: H */
    public static boolean m155H(String str, String str2, int r8, boolean z2) {
        AbstractC2492i.m4915e(str, "<this>");
        return !z2 ? str.startsWith(str2, r8) : m153F(r8, 0, str2.length(), str, str2, z2);
    }

    /* renamed from: I */
    public static boolean m156I(String str, String prefix, boolean z2) {
        AbstractC2492i.m4915e(str, "<this>");
        AbstractC2492i.m4915e(prefix, "prefix");
        return !z2 ? str.startsWith(prefix) : m153F(0, 0, prefix.length(), str, prefix, z2);
    }
}
