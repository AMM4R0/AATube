package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.B9 */
/* loaded from: classes.dex */
public final class C1095B9 {

    /* renamed from: a */
    public final long f4524a;

    public C1095B9(long j2) {
        this.f4524a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1095B9) && this.f4524a == ((C1095B9) obj).f4524a;
    }

    public final int hashCode() {
        long j2 = this.f4524a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return "ExternalAttributionConfig(collectingInterval=" + this.f4524a + ')';
    }
}
