package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.b0 */
/* loaded from: classes.dex */
public final class C1733b0 {

    /* renamed from: a */
    public final String f5898a;

    /* renamed from: b */
    public final long f5899b;

    public C1733b0(String str, long j2) {
        this.f5898a = str;
        this.f5899b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1733b0.class != obj.getClass()) {
            return false;
        }
        C1733b0 c1733b0 = (C1733b0) obj;
        if (this.f5899b != c1733b0.f5899b) {
            return false;
        }
        String str = this.f5898a;
        String str2 = c1733b0.f5898a;
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
        } else if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5898a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.f5899b;
        return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
