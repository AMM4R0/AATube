package io.appmetrica.analytics.coreutils.internal.services.frequency;

/* loaded from: classes.dex */
public interface EventFrequencyStorage {
    Integer getWindowOccurrencesCount(String str);

    Long getWindowStart(String str);

    void putWindowOccurrencesCount(String str, int r2);

    void putWindowStart(String str, long j2);
}
