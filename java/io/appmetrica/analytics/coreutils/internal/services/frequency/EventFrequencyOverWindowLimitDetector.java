package io.appmetrica.analytics.coreutils.internal.services.frequency;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes.dex */
public final class EventFrequencyOverWindowLimitDetector {

    /* renamed from: a */
    private long f4358a;

    /* renamed from: b */
    private int f4359b;

    /* renamed from: c */
    private final EventFrequencyStorage f4360c;

    /* renamed from: d */
    private final SystemTimeProvider f4361d = new SystemTimeProvider();

    public EventFrequencyOverWindowLimitDetector(long j2, int r3, EventFrequencyStorage eventFrequencyStorage) {
        this.f4358a = j2;
        this.f4359b = r3;
        this.f4360c = eventFrequencyStorage;
    }

    public final boolean detect(String str) {
        long longValue;
        long uptimeMillis = this.f4361d.uptimeMillis();
        EventFrequencyStorage eventFrequencyStorage = this.f4360c;
        Long windowStart = eventFrequencyStorage.getWindowStart(str);
        if (windowStart == null) {
            eventFrequencyStorage.putWindowStart(str, uptimeMillis);
            longValue = uptimeMillis;
        } else {
            longValue = windowStart.longValue();
        }
        long j2 = uptimeMillis - longValue;
        if (j2 < 0 || j2 > this.f4358a) {
            this.f4360c.putWindowStart(str, uptimeMillis);
            this.f4360c.putWindowOccurrencesCount(str, 1);
            return false;
        }
        Integer windowOccurrencesCount = this.f4360c.getWindowOccurrencesCount(str);
        int intValue = (windowOccurrencesCount != null ? windowOccurrencesCount.intValue() : 0) + 1;
        this.f4360c.putWindowOccurrencesCount(str, intValue);
        return intValue > this.f4359b;
    }

    public final synchronized void updateParameters(long j2, int r3) {
        this.f4358a = j2;
        this.f4359b = r3;
    }
}
