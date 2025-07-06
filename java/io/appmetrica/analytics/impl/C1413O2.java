package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.O2 */
/* loaded from: classes.dex */
public final class C1413O2 {

    /* renamed from: a */
    public final EnumC1388N2 f5146a;

    /* renamed from: b */
    public final Boolean f5147b;

    public C1413O2(EnumC1388N2 enumC1388N2, Boolean bool) {
        this.f5146a = enumC1388N2;
        this.f5147b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1413O2.class != obj.getClass()) {
            return false;
        }
        C1413O2 c1413o2 = (C1413O2) obj;
        if (this.f5146a != c1413o2.f5146a) {
            return false;
        }
        Boolean bool = this.f5147b;
        return bool != null ? bool.equals(c1413o2.f5147b) : c1413o2.f5147b == null;
    }

    public final int hashCode() {
        EnumC1388N2 enumC1388N2 = this.f5146a;
        int hashCode = (enumC1388N2 != null ? enumC1388N2.hashCode() : 0) * 31;
        Boolean bool = this.f5147b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }
}
