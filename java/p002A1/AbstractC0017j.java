package p002A1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p036M1.AbstractC0387m;
import p103k0.AbstractC2480a;
import p108m1.AbstractC2661k;
import p140x1.C2890b;
import p140x1.C2893e;
import p145z1.C2923f;

/* renamed from: A1.j */
/* loaded from: classes.dex */
public abstract class AbstractC0017j extends AbstractC0025r {
    /* renamed from: J */
    public static boolean m132J(CharSequence charSequence, char c) {
        AbstractC2492i.m4915e(charSequence, "<this>");
        return m136N(charSequence, c, 0, false, 2) >= 0;
    }

    /* renamed from: K */
    public static boolean m133K(CharSequence charSequence, String other) {
        AbstractC2492i.m4915e(charSequence, "<this>");
        AbstractC2492i.m4915e(other, "other");
        return m137O(charSequence, other, 0, false, 2) >= 0;
    }

    /* renamed from: L */
    public static final int m134L(CharSequence charSequence) {
        AbstractC2492i.m4915e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: M */
    public static final int m135M(CharSequence charSequence, String string, int r12, boolean z2) {
        AbstractC2492i.m4915e(charSequence, "<this>");
        AbstractC2492i.m4915e(string, "string");
        if (!z2 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, r12);
        }
        int length = charSequence.length();
        if (r12 < 0) {
            r12 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        C2893e c2893e = new C2893e(r12, length, 1);
        boolean z3 = charSequence instanceof String;
        int r02 = c2893e.f9521c;
        int r2 = c2893e.f9520b;
        int r3 = c2893e.f9519a;
        if (!z3 || !(string instanceof String)) {
            if ((r02 > 0 && r3 <= r2) || (r02 < 0 && r2 <= r3)) {
                while (!m141S(string, 0, charSequence, r3, string.length(), z2)) {
                    if (r3 != r2) {
                        r3 += r02;
                    }
                }
                return r3;
            }
            return -1;
        }
        if ((r02 > 0 && r3 <= r2) || (r02 < 0 && r2 <= r3)) {
            while (!AbstractC0025r.m153F(0, r3, string.length(), string, (String) charSequence, z2)) {
                if (r3 != r2) {
                    r3 += r02;
                }
            }
            return r3;
        }
        return -1;
    }

    /* renamed from: N */
    public static int m136N(CharSequence charSequence, char c, int r4, boolean z2, int r6) {
        if ((r6 & 2) != 0) {
            r4 = 0;
        }
        if ((r6 & 4) != 0) {
            z2 = false;
        }
        AbstractC2492i.m4915e(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? m138P(charSequence, new char[]{c}, r4, z2) : ((String) charSequence).indexOf(c, r4);
    }

    /* renamed from: O */
    public static /* synthetic */ int m137O(CharSequence charSequence, String str, int r4, boolean z2, int r6) {
        if ((r6 & 2) != 0) {
            r4 = 0;
        }
        if ((r6 & 4) != 0) {
            z2 = false;
        }
        return m135M(charSequence, str, r4, z2);
    }

    /* renamed from: P */
    public static final int m138P(CharSequence charSequence, char[] cArr, int r8, boolean z2) {
        AbstractC2492i.m4915e(charSequence, "<this>");
        if (!z2 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], r8);
        }
        if (r8 < 0) {
            r8 = 0;
        }
        C2890b it = new C2893e(r8, m134L(charSequence), 1).iterator();
        while (it.f9517d) {
            int m5481a = it.m5481a();
            char charAt = charSequence.charAt(m5481a);
            for (char c : cArr) {
                if (AbstractC0387m.m1119q(c, charAt, z2)) {
                    return m5481a;
                }
            }
        }
        return -1;
    }

    /* renamed from: Q */
    public static int m139Q(String str, char c, int r2, int r3) {
        if ((r3 & 2) != 0) {
            r2 = m134L(str);
        }
        AbstractC2492i.m4915e(str, "<this>");
        return str.lastIndexOf(c, r2);
    }

    /* renamed from: R */
    public static String m140R(String str) {
        CharSequence charSequence;
        if (8 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(8);
            C2890b it = new C2893e(1, 8 - str.length(), 1).iterator();
            while (it.f9517d) {
                it.m5481a();
                sb.append('0');
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    /* renamed from: S */
    public static final boolean m141S(String str, int r5, CharSequence other, int r7, int r8, boolean z2) {
        AbstractC2492i.m4915e(str, "<this>");
        AbstractC2492i.m4915e(other, "other");
        if (r7 < 0 || r5 < 0 || r5 > str.length() - r8 || r7 > other.length() - r8) {
            return false;
        }
        for (int r12 = 0; r12 < r8; r12++) {
            if (!AbstractC0387m.m1119q(str.charAt(r5 + r12), other.charAt(r7 + r12), z2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: T */
    public static String m142T(String str, String str2) {
        if (!AbstractC0025r.m156I(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        AbstractC2492i.m4914d(substring, "substring(...)");
        return substring;
    }

    /* renamed from: U */
    public static final void m143U(int r12) {
        if (r12 < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m11f(r12, "Limit must be non-negative, but was ").toString());
        }
    }

    /* renamed from: V */
    public static List m144V(String str, char[] cArr) {
        AbstractC2492i.m4915e(str, "<this>");
        boolean z2 = false;
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            m143U(0);
            int m135M = m135M(str, valueOf, 0, false);
            if (m135M == -1) {
                return AbstractC2480a.m4863D(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int r4 = 0;
            do {
                arrayList.add(str.subSequence(r4, m135M).toString());
                r4 = valueOf.length() + m135M;
                m135M = m135M(str, valueOf, r4, false);
            } while (m135M != -1);
            arrayList.add(str.subSequence(r4, str.length()).toString());
            return arrayList;
        }
        m143U(0);
        C2923f c2923f = new C2923f(new C0010c(str, 0, 0, new C0026s(cArr, z2, 0)));
        ArrayList arrayList2 = new ArrayList(AbstractC2661k.m5122Z(c2923f));
        Iterator it = c2923f.iterator();
        while (true) {
            C0009b c0009b = (C0009b) it;
            if (!c0009b.hasNext()) {
                return arrayList2;
            }
            C2893e range = (C2893e) c0009b.next();
            AbstractC2492i.m4915e(range, "range");
            arrayList2.add(str.subSequence(range.f9519a, range.f9520b + 1).toString());
        }
    }

    /* renamed from: W */
    public static String m145W(String str, String delimiter) {
        AbstractC2492i.m4915e(delimiter, "delimiter");
        int m137O = m137O(str, delimiter, 0, false, 6);
        if (m137O == -1) {
            return str;
        }
        String substring = str.substring(delimiter.length() + m137O, str.length());
        AbstractC2492i.m4914d(substring, "substring(...)");
        return substring;
    }

    /* renamed from: X */
    public static String m146X(String missingDelimiterValue) {
        AbstractC2492i.m4915e(missingDelimiterValue, "<this>");
        AbstractC2492i.m4915e(missingDelimiterValue, "missingDelimiterValue");
        int m139Q = m139Q(missingDelimiterValue, '.', 0, 6);
        if (m139Q == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(m139Q + 1, missingDelimiterValue.length());
        AbstractC2492i.m4914d(substring, "substring(...)");
        return substring;
    }

    /* renamed from: Y */
    public static String m147Y(int r12, String str) {
        if (r12 < 0) {
            throw new IllegalArgumentException(AbstractC0002c.m13h("Requested character count ", r12, " is less than zero.").toString());
        }
        int length = str.length();
        if (r12 > length) {
            r12 = length;
        }
        String substring = str.substring(0, r12);
        AbstractC2492i.m4914d(substring, "substring(...)");
        return substring;
    }

    /* renamed from: Z */
    public static CharSequence m148Z(String str) {
        AbstractC2492i.m4915e(str, "<this>");
        int length = str.length() - 1;
        int r3 = 0;
        boolean z2 = false;
        while (r3 <= length) {
            char charAt = str.charAt(!z2 ? r3 : length);
            boolean z3 = Character.isWhitespace(charAt) || Character.isSpaceChar(charAt);
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                r3++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(r3, length + 1);
    }
}
