package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* renamed from: io.appmetrica.analytics.impl.og */
/* loaded from: classes.dex */
public final class C2074og implements RemoteConfigMetaInfo {

    /* renamed from: a */
    public final long f6860a;

    /* renamed from: b */
    public final long f6861b;

    public C2074og(long j2, long j3) {
        this.f6860a = j2;
        this.f6861b = j3;
    }

    /* renamed from: a */
    public final C2074og m4268a(long j2, long j3) {
        return new C2074og(j2, j3);
    }

    /* renamed from: b */
    public final long m4269b() {
        return this.f6861b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2074og)) {
            return false;
        }
        C2074og c2074og = (C2074og) obj;
        return this.f6860a == c2074og.f6860a && this.f6861b == c2074og.f6861b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f6860a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f6861b;
    }

    public final int hashCode() {
        long j2 = this.f6860a;
        int r02 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = this.f6861b;
        return r02 + ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        return "RemoteConfigMetaInfoModel(firstSendTime=" + this.f6860a + ", lastUpdateTime=" + this.f6861b + ')';
    }

    /* renamed from: a */
    public final long m4267a() {
        return this.f6860a;
    }

    /* renamed from: a */
    public static C2074og m4266a(C2074og c2074og, long j2, long j3, int r5, Object obj) {
        if ((r5 & 1) != 0) {
            j2 = c2074og.f6860a;
        }
        if ((r5 & 2) != 0) {
            j3 = c2074og.f6861b;
        }
        c2074og.getClass();
        return new C2074og(j2, j3);
    }
}
