package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.A7 */
/* loaded from: classes.dex */
public final class C1068A7 {

    /* renamed from: a */
    public final long f4451a;

    /* renamed from: b */
    public final int f4452b;

    public C1068A7(int r12, long j2) {
        this.f4451a = j2;
        this.f4452b = r12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1068A7)) {
            return false;
        }
        C1068A7 c1068a7 = (C1068A7) obj;
        return this.f4451a == c1068a7.f4451a && this.f4452b == c1068a7.f4452b;
    }

    public final int hashCode() {
        long j2 = this.f4451a;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + this.f4452b;
    }

    public final String toString() {
        return "DecimalProtoModel(mantissa=" + this.f4451a + ", exponent=" + this.f4452b + ')';
    }
}
