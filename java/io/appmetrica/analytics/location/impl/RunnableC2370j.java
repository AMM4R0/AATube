package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;

/* renamed from: io.appmetrica.analytics.location.impl.j */
/* loaded from: classes.dex */
public final class RunnableC2370j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2369i f7593a;

    /* renamed from: b */
    public final /* synthetic */ C2371k f7594b;

    public RunnableC2370j(C2371k c2371k, C2369i c2369i) {
        this.f7594b = c2371k;
        this.f7593a = c2369i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2376p c2376p = this.f7594b.f7597c;
        C2369i c2369i = this.f7593a;
        c2376p.f7613a = c2369i;
        CacheArguments cacheArguments = c2369i.f7592b;
        c2376p.f7614b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
