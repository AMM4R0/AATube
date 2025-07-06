package io.appmetrica.analytics.coreapi.internal.cache;

/* loaded from: classes.dex */
public interface CacheUpdateScheduler {
    void onStateUpdated();

    void scheduleUpdateIfNeededNow();
}
