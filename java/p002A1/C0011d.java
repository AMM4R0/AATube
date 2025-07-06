package p002A1;

import kotlin.jvm.internal.AbstractC2492i;
import p140x1.C2893e;

/* renamed from: A1.d */
/* loaded from: classes.dex */
public final class C0011d {

    /* renamed from: a */
    public final String f17a;

    /* renamed from: b */
    public final C2893e f18b;

    public C0011d(String str, C2893e c2893e) {
        this.f17a = str;
        this.f18b = c2893e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0011d)) {
            return false;
        }
        C0011d c0011d = (C0011d) obj;
        return AbstractC2492i.m4911a(this.f17a, c0011d.f17a) && AbstractC2492i.m4911a(this.f18b, c0011d.f18b);
    }

    public final int hashCode() {
        return this.f18b.hashCode() + (this.f17a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f17a + ", range=" + this.f18b + ')';
    }
}
