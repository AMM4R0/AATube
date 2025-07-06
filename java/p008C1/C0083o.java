package p008C1;

import android.support.v4.media.session.AbstractC0580g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2492i;
import kotlin.jvm.internal.C2484a;
import p006C.C0055g;
import p011D1.AbstractC0119f;
import p105l1.C2632c;
import p108m1.AbstractC2658h;
import p108m1.AbstractC2665o;

/* renamed from: C1.o */
/* loaded from: classes.dex */
public final class C0083o implements Iterable {

    /* renamed from: a */
    public final String[] f229a;

    public C0083o(String[] namesAndValues) {
        AbstractC2492i.m4915e(namesAndValues, "namesAndValues");
        this.f229a = namesAndValues;
    }

    /* renamed from: a */
    public final String m274a(String str) {
        String[] namesAndValues = this.f229a;
        AbstractC2492i.m4915e(namesAndValues, "namesAndValues");
        int length = namesAndValues.length - 2;
        int m1451p = AbstractC0580g.m1451p(length, 0, -2);
        if (m1451p <= length) {
            while (!str.equalsIgnoreCase(namesAndValues[length])) {
                if (length != m1451p) {
                    length -= 2;
                }
            }
            return namesAndValues[length + 1];
        }
        return null;
    }

    /* renamed from: b */
    public final String m275b(int r4) {
        String str = (String) AbstractC2658h.m5110H(this.f229a, r4 * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + r4 + ']');
    }

    /* renamed from: c */
    public final C0055g m276c() {
        C0055g c0055g = new C0055g(2);
        AbstractC2665o.m5124b0((ArrayList) c0055g.f107b, this.f229a);
        return c0055g;
    }

    /* renamed from: d */
    public final String m277d(int r4) {
        String str = (String) AbstractC2658h.m5110H(this.f229a, (r4 * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + r4 + ']');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0083o) {
            if (Arrays.equals(this.f229a, ((C0083o) obj).f229a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f229a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C2632c[] c2632cArr = new C2632c[size];
        for (int r2 = 0; r2 < size; r2++) {
            c2632cArr[r2] = new C2632c(m275b(r2), m277d(r2));
        }
        return new C2484a(c2632cArr);
    }

    public final int size() {
        return this.f229a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int r2 = 0; r2 < size; r2++) {
            String m275b = m275b(r2);
            String m277d = m277d(r2);
            sb.append(m275b);
            sb.append(": ");
            if (AbstractC0119f.m404j(m275b)) {
                m277d = "██";
            }
            sb.append(m277d);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        AbstractC2492i.m4914d(sb2, "toString(...)");
        return sb2;
    }
}
