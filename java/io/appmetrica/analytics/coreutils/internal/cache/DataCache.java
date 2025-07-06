package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;

/* loaded from: classes.dex */
public abstract class DataCache<T> implements UpdateConditionsChecker {

    /* renamed from: a */
    private CacheUpdateScheduler f4314a;
    protected final CachedDataProvider.CachedData<T> mCachedData;

    public DataCache(long j2, long j3, String str) {
        this.mCachedData = new CachedDataProvider.CachedData<>(j2, j3, str);
    }

    public CachedDataProvider.CachedData<T> getCachedData() {
        return this.mCachedData;
    }

    public T getData() {
        CacheUpdateScheduler cacheUpdateScheduler;
        if (shouldUpdate() && (cacheUpdateScheduler = this.f4314a) != null) {
            cacheUpdateScheduler.scheduleUpdateIfNeededNow();
        }
        if (this.mCachedData.shouldClearData()) {
            this.mCachedData.setData(null);
        }
        return this.mCachedData.getData();
    }

    public void setUpdateScheduler(CacheUpdateScheduler cacheUpdateScheduler) {
        this.f4314a = cacheUpdateScheduler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker
    public boolean shouldUpdate() {
        return this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData();
    }

    public abstract boolean shouldUpdate(T t2);

    public void updateCacheControl(long j2, long j3) {
        this.mCachedData.setExpirationPolicy(j2, j3);
    }

    public void updateData(T t2) {
        if (shouldUpdate(t2)) {
            this.mCachedData.setData(t2);
            CacheUpdateScheduler cacheUpdateScheduler = this.f4314a;
            if (cacheUpdateScheduler != null) {
                cacheUpdateScheduler.onStateUpdated();
            }
        }
    }
}
