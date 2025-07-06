package io.appmetrica.analytics.coreutils.internal.services.frequency;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class InMemoryEventFrequencyStorage implements EventFrequencyStorage {

    /* renamed from: a */
    private final LinkedHashMap f4362a = new LinkedHashMap();

    /* renamed from: b */
    private final LinkedHashMap f4363b = new LinkedHashMap();

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public Integer getWindowOccurrencesCount(String str) {
        return (Integer) this.f4363b.get(str);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public Long getWindowStart(String str) {
        return (Long) this.f4362a.get(str);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public void putWindowOccurrencesCount(String str, int r3) {
        this.f4363b.put(str, Integer.valueOf(r3));
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public void putWindowStart(String str, long j2) {
        this.f4362a.put(str, Long.valueOf(j2));
    }
}
