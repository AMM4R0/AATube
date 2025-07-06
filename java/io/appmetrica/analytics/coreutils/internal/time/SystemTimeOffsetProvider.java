package io.appmetrica.analytics.coreutils.internal.time;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class SystemTimeOffsetProvider {

    /* renamed from: a */
    private final SystemTimeProvider f4370a;

    public SystemTimeOffsetProvider(SystemTimeProvider systemTimeProvider) {
        this.f4370a = systemTimeProvider;
    }

    public final long elapsedRealtimeOffset(long j2, TimeUnit timeUnit) {
        return this.f4370a.elapsedRealtime() - timeUnit.toMillis(j2);
    }

    public final long elapsedRealtimeOffsetInSeconds(long j2, TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.toSeconds(elapsedRealtimeOffset(j2, timeUnit));
    }

    public final long offsetInSecondsIfNotZero(long j2, TimeUnit timeUnit) {
        if (j2 == 0) {
            return 0L;
        }
        return this.f4370a.currentTimeSeconds() - timeUnit.toSeconds(j2);
    }

    public final long systemNanoTimeOffsetInNanos(long j2, TimeUnit timeUnit) {
        return this.f4370a.systemNanoTime() - timeUnit.toNanos(j2);
    }

    public final long systemNanoTimeOffsetInSeconds(long j2, TimeUnit timeUnit) {
        return TimeUnit.NANOSECONDS.toSeconds(systemNanoTimeOffsetInNanos(j2, timeUnit));
    }

    public SystemTimeOffsetProvider() {
        this(new SystemTimeProvider());
    }
}
