package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.E3 */
/* loaded from: classes.dex */
public final class C1164E3 {

    /* renamed from: a */
    public final long f4688a;

    public C1164E3(long j2) {
        this.f4688a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1164E3.class == obj.getClass() && this.f4688a == ((C1164E3) obj).f4688a;
    }

    public final int hashCode() {
        long j2 = this.f4688a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return "CacheControl{lastKnownLocationTtl=" + this.f4688a + '}';
    }
}
