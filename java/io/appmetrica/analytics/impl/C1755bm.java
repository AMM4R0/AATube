package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bm */
/* loaded from: classes.dex */
public final class C1755bm {

    /* renamed from: a */
    public final long f5953a;

    public C1755bm(long j2) {
        this.f5953a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1755bm.class == obj.getClass() && this.f5953a == ((C1755bm) obj).f5953a;
    }

    public final int hashCode() {
        long j2 = this.f5953a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return "StatSending{disabledReportingInterval=" + this.f5953a + '}';
    }
}
