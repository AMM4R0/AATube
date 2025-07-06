package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.F4 */
/* loaded from: classes.dex */
public final class C1190F4 {

    /* renamed from: a */
    public final boolean f4722a;

    /* renamed from: b */
    public final boolean f4723b;

    /* renamed from: c */
    public final boolean f4724c;

    /* renamed from: d */
    public final boolean f4725d;

    /* renamed from: e */
    public final boolean f4726e;

    /* renamed from: f */
    public final Boolean f4727f;

    public C1190F4(C1140D4 c1140d4) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Boolean bool;
        z2 = c1140d4.f4624a;
        this.f4722a = z2;
        z3 = c1140d4.f4625b;
        this.f4723b = z3;
        z4 = c1140d4.f4626c;
        this.f4724c = z4;
        z5 = c1140d4.f4627d;
        this.f4725d = z5;
        z6 = c1140d4.f4628e;
        this.f4726e = z6;
        bool = c1140d4.f4629f;
        this.f4727f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1190F4.class != obj.getClass()) {
            return false;
        }
        C1190F4 c1190f4 = (C1190F4) obj;
        if (this.f4722a != c1190f4.f4722a || this.f4723b != c1190f4.f4723b || this.f4724c != c1190f4.f4724c || this.f4725d != c1190f4.f4725d || this.f4726e != c1190f4.f4726e) {
            return false;
        }
        Boolean bool = this.f4727f;
        Boolean bool2 = c1190f4.f4727f;
        return bool != null ? bool.equals(bool2) : bool2 == null;
    }

    public final int hashCode() {
        int r02 = (((((((((this.f4722a ? 1 : 0) * 31) + (this.f4723b ? 1 : 0)) * 31) + (this.f4724c ? 1 : 0)) * 31) + (this.f4725d ? 1 : 0)) * 31) + (this.f4726e ? 1 : 0)) * 31;
        Boolean bool = this.f4727f;
        return r02 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f4722a + ", featuresCollectingEnabled=" + this.f4723b + ", googleAid=" + this.f4724c + ", simInfo=" + this.f4725d + ", huaweiOaid=" + this.f4726e + ", sslPinning=" + this.f4727f + '}';
    }
}
