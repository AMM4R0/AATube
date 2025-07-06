package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;

/* renamed from: io.appmetrica.analytics.coreutils.internal.cache.b */
/* loaded from: classes.dex */
public final class RunnableC1031b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationDataCacheUpdateScheduler f4321a;

    public RunnableC1031b(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.f4321a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UpdateConditionsChecker updateConditionsChecker;
        RunnableC1030a runnableC1030a;
        ILastKnownUpdater iLastKnownUpdater;
        updateConditionsChecker = this.f4321a.f4317c;
        if (updateConditionsChecker.shouldUpdate()) {
            runnableC1030a = this.f4321a.f4318d;
            iLastKnownUpdater = runnableC1030a.f4320a.f4316b;
            iLastKnownUpdater.updateLastKnown();
        }
    }
}
