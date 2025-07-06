package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Xl */
/* loaded from: classes.dex */
public final class C1656Xl {

    /* renamed from: a */
    public final int f5697a;

    public C1656Xl(int r12) {
        this.f5697a = r12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1656Xl) && this.f5697a == ((C1656Xl) obj).f5697a;
    }

    public final int hashCode() {
        return this.f5697a;
    }

    public final String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f5697a + ')';
    }
}
