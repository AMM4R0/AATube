package p048Q1;

import kotlin.jvm.internal.AbstractC2492i;
import p002A1.AbstractC0017j;
import p011D1.AbstractC0119f;
import p051R1.C0477g;

/* renamed from: Q1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0452a {

    /* renamed from: a */
    public static final char[] f1164a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static String m1205a(String str, int r18, int r19, String str2, boolean z2, boolean z3, boolean z4, boolean z5, int r25) {
        int r2 = (r25 & 1) != 0 ? 0 : r18;
        int length = (r25 & 2) != 0 ? str.length() : r19;
        boolean z6 = (r25 & 8) != 0 ? false : z2;
        boolean z7 = (r25 & 16) != 0 ? false : z3;
        boolean z8 = (r25 & 32) != 0 ? false : z4;
        boolean z9 = (r25 & 64) == 0 ? z5 : false;
        AbstractC2492i.m4915e(str, "<this>");
        int r8 = r2;
        while (r8 < length) {
            int codePointAt = str.codePointAt(r8);
            int r10 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z9) || AbstractC0017j.m132J(str2, (char) codePointAt) || ((codePointAt == 37 && (!z6 || (z7 && !m1206b(str, r8, length)))) || (codePointAt == 43 && z8)))) {
                C0477g c0477g = new C0477g();
                c0477g.m1250E(str, r2, r8);
                C0477g c0477g2 = null;
                while (r8 < length) {
                    int codePointAt2 = str.codePointAt(r8);
                    if (!z6 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == r10 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            c0477g.m1249D("+");
                        } else if (codePointAt2 == 43 && z8) {
                            c0477g.m1249D(z6 ? "+" : "%2B");
                        } else {
                            if (codePointAt2 >= r10 && codePointAt2 != 127) {
                                if ((codePointAt2 < 128 || z9) && !AbstractC0017j.m132J(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z6 && (!z7 || m1206b(str, r8, length))))) {
                                    c0477g.m1251F(codePointAt2);
                                }
                            }
                            if (c0477g2 == null) {
                                c0477g2 = new C0477g();
                            }
                            c0477g2.m1251F(codePointAt2);
                            while (!c0477g2.m1252b()) {
                                byte m1259k = c0477g2.m1259k();
                                c0477g.m1274z(37);
                                char[] cArr = f1164a;
                                c0477g.m1274z(cArr[((m1259k & 255) >> 4) & 15]);
                                c0477g.m1274z(cArr[m1259k & 15]);
                            }
                        }
                    }
                    r8 += Character.charCount(codePointAt2);
                    r10 = 32;
                }
                return c0477g.m1267s();
            }
            r8 += Character.charCount(codePointAt);
        }
        String substring = str.substring(r2, length);
        AbstractC2492i.m4914d(substring, "substring(...)");
        return substring;
    }

    /* renamed from: b */
    public static final boolean m1206b(String str, int r3, int r4) {
        AbstractC2492i.m4915e(str, "<this>");
        int r02 = r3 + 2;
        return r02 < r4 && str.charAt(r3) == '%' && AbstractC0119f.m406l(str.charAt(r3 + 1)) != -1 && AbstractC0119f.m406l(str.charAt(r02)) != -1;
    }

    /* renamed from: c */
    public static String m1207c(String str, int r8, int r9, boolean z2, int r11) {
        int r3;
        if ((r11 & 1) != 0) {
            r8 = 0;
        }
        if ((r11 & 2) != 0) {
            r9 = str.length();
        }
        if ((r11 & 4) != 0) {
            z2 = false;
        }
        AbstractC2492i.m4915e(str, "<this>");
        int r112 = r8;
        while (r112 < r9) {
            char charAt = str.charAt(r112);
            if (charAt == '%' || (charAt == '+' && z2)) {
                C0477g c0477g = new C0477g();
                c0477g.m1250E(str, r8, r112);
                while (r112 < r9) {
                    int codePointAt = str.codePointAt(r112);
                    if (codePointAt != 37 || (r3 = r112 + 2) >= r9) {
                        if (codePointAt == 43 && z2) {
                            c0477g.m1274z(32);
                            r112++;
                        }
                        c0477g.m1251F(codePointAt);
                        r112 += Character.charCount(codePointAt);
                    } else {
                        int m406l = AbstractC0119f.m406l(str.charAt(r112 + 1));
                        int m406l2 = AbstractC0119f.m406l(str.charAt(r3));
                        if (m406l != -1 && m406l2 != -1) {
                            c0477g.m1274z((m406l << 4) + m406l2);
                            r112 = Character.charCount(codePointAt) + r3;
                        }
                        c0477g.m1251F(codePointAt);
                        r112 += Character.charCount(codePointAt);
                    }
                }
                return c0477g.m1267s();
            }
            r112++;
        }
        String substring = str.substring(r8, r9);
        AbstractC2492i.m4914d(substring, "substring(...)");
        return substring;
    }
}
