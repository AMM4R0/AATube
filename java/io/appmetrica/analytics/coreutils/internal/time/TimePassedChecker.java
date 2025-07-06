package io.appmetrica.analytics.coreutils.internal.time;

/* loaded from: classes.dex */
public final class TimePassedChecker {

    /* renamed from: a */
    private final TimeProvider f4371a;

    public TimePassedChecker(TimeProvider timeProvider) {
        this.f4371a = timeProvider;
    }

    public final boolean didTimePassMillis(long j2, long j3, String str) {
        long currentTimeMillis = this.f4371a.currentTimeMillis();
        return currentTimeMillis < j2 || currentTimeMillis - j2 >= j3;
    }

    public final boolean didTimePassSeconds(long j2, long j3, String str) {
        long currentTimeSeconds = this.f4371a.currentTimeSeconds();
        return currentTimeSeconds < j2 || currentTimeSeconds - j2 >= j3;
    }

    public TimePassedChecker() {
        this(new SystemTimeProvider());
    }
}
