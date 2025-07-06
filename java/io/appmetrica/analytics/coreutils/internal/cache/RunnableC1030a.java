package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;

/* renamed from: io.appmetrica.analytics.coreutils.internal.cache.a */
/* loaded from: classes.dex */
public final class RunnableC1030a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationDataCacheUpdateScheduler f4320a;

    public RunnableC1030a(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.f4320a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ILastKnownUpdater iLastKnownUpdater;
        iLastKnownUpdater = this.f4320a.f4316b;
        iLastKnownUpdater.updateLastKnown();
    }
}
