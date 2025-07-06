package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gk */
/* loaded from: classes.dex */
public final class C1878gk {

    /* renamed from: a */
    public final C1409Nn f6334a;

    public C1878gk(C1409Nn c1409Nn) {
        this.f6334a = c1409Nn;
    }

    /* renamed from: a */
    public final long m3896a() {
        long optLong;
        C1409Nn c1409Nn = this.f6334a;
        synchronized (c1409Nn) {
            optLong = c1409Nn.f5142a.m3193a().optLong("session_id", -1L);
        }
        long j2 = optLong >= 10000000000L ? 1 + optLong : 10000000000L;
        this.f6334a.m3142c(j2);
        return j2;
    }
}
