package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;

/* renamed from: io.appmetrica.analytics.impl.va */
/* loaded from: classes.dex */
public final class C2243va implements HostRetryInfoProvider {

    /* renamed from: a */
    public final C1075Ae f7288a;

    /* renamed from: b */
    public final EnumC2246vd f7289b;

    public C2243va(C1075Ae c1075Ae, EnumC2246vd enumC2246vd) {
        this.f7288a = c1075Ae;
        this.f7289b = enumC2246vd;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f7288a.m2711a(this.f7289b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f7288a.m2708a(this.f7289b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j2) {
        this.f7288a.m2717b(this.f7289b, j2).m4658b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int r3) {
        this.f7288a.m2716b(this.f7289b, r3).m4658b();
    }
}
