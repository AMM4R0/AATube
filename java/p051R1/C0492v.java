package p051R1;

import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC2492i;
import p054S1.AbstractC0504c;
import p124s0.C2738i;

/* renamed from: R1.v */
/* loaded from: classes.dex */
public final class C0492v implements Comparable {

    /* renamed from: b */
    public static final String f1244b;

    /* renamed from: a */
    public final C0480j f1245a;

    static {
        String separator = File.separator;
        AbstractC2492i.m4914d(separator, "separator");
        f1244b = separator;
    }

    public C0492v(C0480j bytes) {
        AbstractC2492i.m4915e(bytes, "bytes");
        this.f1245a = bytes;
    }

    /* renamed from: a */
    public final ArrayList m1284a() {
        ArrayList arrayList = new ArrayList();
        int m1318a = AbstractC0504c.m1318a(this);
        C0480j c0480j = this.f1245a;
        if (m1318a == -1) {
            m1318a = 0;
        } else if (m1318a < c0480j.mo1220b() && c0480j.mo1224g(m1318a) == 92) {
            m1318a++;
        }
        int mo1220b = c0480j.mo1220b();
        int r5 = m1318a;
        while (m1318a < mo1220b) {
            if (c0480j.mo1224g(m1318a) == 47 || c0480j.mo1224g(m1318a) == 92) {
                arrayList.add(c0480j.mo1228l(r5, m1318a));
                r5 = m1318a + 1;
            }
            m1318a++;
        }
        if (r5 < c0480j.mo1220b()) {
            arrayList.add(c0480j.mo1228l(r5, c0480j.mo1220b()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C0492v m1285b(C0492v other) {
        AbstractC2492i.m4915e(other, "other");
        int m1318a = AbstractC0504c.m1318a(this);
        C0480j c0480j = this.f1245a;
        C0492v c0492v = m1318a == -1 ? null : new C0492v(c0480j.mo1228l(0, m1318a));
        int m1318a2 = AbstractC0504c.m1318a(other);
        C0480j c0480j2 = other.f1245a;
        if (!AbstractC2492i.m4911a(c0492v, m1318a2 != -1 ? new C0492v(c0480j2.mo1228l(0, m1318a2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList m1284a = m1284a();
        ArrayList m1284a2 = other.m1284a();
        int min = Math.min(m1284a.size(), m1284a2.size());
        int r8 = 0;
        while (r8 < min && AbstractC2492i.m4911a(m1284a.get(r8), m1284a2.get(r8))) {
            r8++;
        }
        if (r8 == min && c0480j.mo1220b() == c0480j2.mo1220b()) {
            return C2738i.m5333f(".", false);
        }
        if (m1284a2.subList(r8, m1284a2.size()).indexOf(AbstractC0504c.f1297e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        C0477g c0477g = new C0477g();
        C0480j m1320c = AbstractC0504c.m1320c(other);
        if (m1320c == null && (m1320c = AbstractC0504c.m1320c(this)) == null) {
            m1320c = AbstractC0504c.m1323f(f1244b);
        }
        int size = m1284a2.size();
        for (int r4 = r8; r4 < size; r4++) {
            c0477g.m1271w(AbstractC0504c.f1297e);
            c0477g.m1271w(m1320c);
        }
        int size2 = m1284a.size();
        while (r8 < size2) {
            c0477g.m1271w((C0480j) m1284a.get(r8));
            c0477g.m1271w(m1320c);
            r8++;
        }
        return AbstractC0504c.m1321d(c0477g, false);
    }

    /* renamed from: c */
    public final Character m1286c() {
        C0480j c0480j = AbstractC0504c.f1293a;
        C0480j c0480j2 = this.f1245a;
        if (C0480j.m1275e(c0480j2, c0480j) != -1 || c0480j2.mo1220b() < 2 || c0480j2.mo1224g(1) != 58) {
            return null;
        }
        char mo1224g = (char) c0480j2.mo1224g(0);
        if (('a' > mo1224g || mo1224g >= '{') && ('A' > mo1224g || mo1224g >= '[')) {
            return null;
        }
        return Character.valueOf(mo1224g);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0492v other = (C0492v) obj;
        AbstractC2492i.m4915e(other, "other");
        return this.f1245a.compareTo(other.f1245a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0492v) && AbstractC2492i.m4911a(((C0492v) obj).f1245a, this.f1245a);
    }

    public final int hashCode() {
        return this.f1245a.hashCode();
    }

    public final String toString() {
        return this.f1245a.m1279o();
    }
}
