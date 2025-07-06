package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class LocationDataCacheUpdateScheduler implements CacheUpdateScheduler {

    /* renamed from: a */
    private final ICommonExecutor f4315a;

    /* renamed from: b */
    private final ILastKnownUpdater f4316b;

    /* renamed from: c */
    private final UpdateConditionsChecker f4317c;

    /* renamed from: d */
    private final RunnableC1030a f4318d = new RunnableC1030a(this);

    /* renamed from: e */
    private final RunnableC1031b f4319e = new RunnableC1031b(this);

    public LocationDataCacheUpdateScheduler(ICommonExecutor iCommonExecutor, ILastKnownUpdater iLastKnownUpdater, UpdateConditionsChecker updateConditionsChecker, String str) {
        this.f4315a = iCommonExecutor;
        this.f4316b = iLastKnownUpdater;
        this.f4317c = updateConditionsChecker;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void onStateUpdated() {
        this.f4315a.remove(this.f4318d);
        this.f4315a.executeDelayed(this.f4318d, 90L, TimeUnit.SECONDS);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void scheduleUpdateIfNeededNow() {
        this.f4315a.execute(this.f4319e);
    }

    public void startUpdates() {
        onStateUpdated();
    }

    public void stopUpdates() {
        this.f4315a.remove(this.f4318d);
        this.f4315a.remove(this.f4319e);
    }
}
