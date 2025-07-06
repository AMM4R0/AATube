package io.appmetrica.analytics.impl;

import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.o4 */
/* loaded from: classes.dex */
public final class C2062o4 {

    /* renamed from: a */
    public final String f6837a;

    /* renamed from: b */
    public final String f6838b;

    /* renamed from: c */
    public final Integer f6839c;

    /* renamed from: d */
    public final String f6840d;

    /* renamed from: e */
    public final EnumC1565U5 f6841e;

    public C2062o4(String str, String str2, Integer num, String str3, EnumC1565U5 enumC1565U5) {
        this.f6837a = str;
        this.f6838b = str2;
        this.f6839c = num;
        this.f6840d = str3;
        this.f6841e = enumC1565U5;
    }

    /* renamed from: a */
    public static C2062o4 m4253a(C1912i4 c1912i4) {
        return new C2062o4(c1912i4.f6458b.getApiKey(), c1912i4.f6457a.f5921a.getAsString("PROCESS_CFG_PACKAGE_NAME"), c1912i4.f6457a.f5921a.getAsInteger("PROCESS_CFG_PROCESS_ID"), c1912i4.f6457a.f5921a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), c1912i4.f6458b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2062o4.class != obj.getClass()) {
            return false;
        }
        C2062o4 c2062o4 = (C2062o4) obj;
        String str = this.f6837a;
        if (str == null ? c2062o4.f6837a != null : !str.equals(c2062o4.f6837a)) {
            return false;
        }
        if (!this.f6838b.equals(c2062o4.f6838b)) {
            return false;
        }
        Integer num = this.f6839c;
        if (num == null ? c2062o4.f6839c != null : !num.equals(c2062o4.f6839c)) {
            return false;
        }
        String str2 = this.f6840d;
        if (str2 == null ? c2062o4.f6840d == null : str2.equals(c2062o4.f6840d)) {
            return this.f6841e == c2062o4.f6841e;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6837a;
        int m9d = AbstractC0002c.m9d(this.f6838b, (str != null ? str.hashCode() : 0) * 31, 31);
        Integer num = this.f6839c;
        int hashCode = (m9d + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f6840d;
        return this.f6841e.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f6837a + "', mPackageName='" + this.f6838b + "', mProcessID=" + this.f6839c + ", mProcessSessionID='" + this.f6840d + "', mReporterType=" + this.f6841e + '}';
    }
}
