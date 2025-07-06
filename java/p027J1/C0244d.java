package p027J1;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.AbstractC2492i;
import p051R1.C0480j;
import p081e1.C0879e;

/* renamed from: J1.d */
/* loaded from: classes.dex */
public final class C0244d {

    /* renamed from: d */
    public static final C0480j f715d;

    /* renamed from: e */
    public static final C0480j f716e;

    /* renamed from: f */
    public static final C0480j f717f;

    /* renamed from: g */
    public static final C0480j f718g;

    /* renamed from: h */
    public static final C0480j f719h;

    /* renamed from: i */
    public static final C0480j f720i;

    /* renamed from: a */
    public final C0480j f721a;

    /* renamed from: b */
    public final C0480j f722b;

    /* renamed from: c */
    public final int f723c;

    static {
        C0480j c0480j = C0480j.f1218d;
        f715d = C0879e.m2396i(StringUtils.PROCESS_POSTFIX_DELIMITER);
        f716e = C0879e.m2396i(":status");
        f717f = C0879e.m2396i(":method");
        f718g = C0879e.m2396i(":path");
        f719h = C0879e.m2396i(":scheme");
        f720i = C0879e.m2396i(":authority");
    }

    public C0244d(C0480j name, C0480j value) {
        AbstractC2492i.m4915e(name, "name");
        AbstractC2492i.m4915e(value, "value");
        this.f721a = name;
        this.f722b = value;
        this.f723c = value.mo1220b() + name.mo1220b() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0244d)) {
            return false;
        }
        C0244d c0244d = (C0244d) obj;
        return AbstractC2492i.m4911a(this.f721a, c0244d.f721a) && AbstractC2492i.m4911a(this.f722b, c0244d.f722b);
    }

    public final int hashCode() {
        return this.f722b.hashCode() + (this.f721a.hashCode() * 31);
    }

    public final String toString() {
        return this.f721a.m1279o() + ": " + this.f722b.m1279o();
    }

    /* JADX WARN: 'thıs' call moved to the top of the method (can break code semantics) */
    public C0244d(String str, String str2) {
        this(C0879e.m2396i(str), C0879e.m2396i(str2));
        C0480j c0480j = C0480j.f1218d;
    }

    /* JADX WARN: 'thıs' call moved to the top of the method (can break code semantics) */
    public C0244d(C0480j name, String value) {
        this(name, C0879e.m2396i(value));
        AbstractC2492i.m4915e(name, "name");
        AbstractC2492i.m4915e(value, "value");
        C0480j c0480j = C0480j.f1218d;
    }
}
