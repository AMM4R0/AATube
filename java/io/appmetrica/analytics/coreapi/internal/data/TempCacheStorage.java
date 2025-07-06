package io.appmetrica.analytics.coreapi.internal.data;

import java.util.Collection;

/* loaded from: classes.dex */
public interface TempCacheStorage {

    public interface Entry {
        byte[] getData();

        long getId();

        String getScope();

        long getTimestamp();
    }

    Entry get(String str);

    Collection<Entry> get(String str, int r2);

    long put(String str, long j2, byte[] bArr);

    void remove(long j2);

    void removeOlderThan(String str, long j2);
}
