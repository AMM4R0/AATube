package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.Rf */
/* loaded from: classes.dex */
public final class C1500Rf {

    /* renamed from: a */
    public final String f5330a;

    /* renamed from: b */
    public final long f5331b;

    /* renamed from: c */
    public final long f5332c;

    /* renamed from: d */
    public final EnumC1476Qf f5333d;

    public C1500Rf(byte[] bArr) {
        C1525Sf m3319a = C1525Sf.m3319a(bArr);
        this.f5330a = m3319a.f5422a;
        this.f5331b = m3319a.f5424c;
        this.f5332c = m3319a.f5423b;
        this.f5333d = m3262a(m3319a.f5425d);
    }

    /* renamed from: a */
    public final byte[] m3263a() {
        C1525Sf c1525Sf = new C1525Sf();
        c1525Sf.f5422a = this.f5330a;
        c1525Sf.f5424c = this.f5331b;
        c1525Sf.f5423b = this.f5332c;
        int ordinal = this.f5333d.ordinal();
        int r2 = 1;
        if (ordinal != 1) {
            r2 = 2;
            if (ordinal != 2) {
                r2 = 0;
            }
        }
        c1525Sf.f5425d = r2;
        return MessageNano.toByteArray(c1525Sf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1500Rf.class != obj.getClass()) {
            return false;
        }
        C1500Rf c1500Rf = (C1500Rf) obj;
        return this.f5331b == c1500Rf.f5331b && this.f5332c == c1500Rf.f5332c && this.f5330a.equals(c1500Rf.f5330a) && this.f5333d == c1500Rf.f5333d;
    }

    public final int hashCode() {
        int hashCode = this.f5330a.hashCode() * 31;
        long j2 = this.f5331b;
        int r02 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f5332c;
        return this.f5333d.hashCode() + ((r02 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f5330a + "', referrerClickTimestampSeconds=" + this.f5331b + ", installBeginTimestampSeconds=" + this.f5332c + ", source=" + this.f5333d + '}';
    }

    public C1500Rf(String str, long j2, long j3, EnumC1476Qf enumC1476Qf) {
        this.f5330a = str;
        this.f5331b = j2;
        this.f5332c = j3;
        this.f5333d = enumC1476Qf;
    }

    /* renamed from: a */
    public static EnumC1476Qf m3262a(int r12) {
        if (r12 == 1) {
            return EnumC1476Qf.f5257c;
        }
        if (r12 != 2) {
            return EnumC1476Qf.f5256b;
        }
        return EnumC1476Qf.f5258d;
    }
}
