package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.Jm */
/* loaded from: classes.dex */
public final class C1308Jm implements TempCacheStorage {

    /* renamed from: a */
    public final TempCacheStorage f4933a;

    public C1308Jm(Context context, EnumC2055nm enumC2055nm, TempCacheStorage tempCacheStorage) {
        this.f4933a = tempCacheStorage;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final TempCacheStorage.Entry get(String str) {
        return this.f4933a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(String str, long j2, byte[] bArr) {
        return this.f4933a.put(str, j2, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j2) {
        this.f4933a.remove(j2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(String str, long j2) {
        this.f4933a.removeOlderThan(str, j2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final Collection<TempCacheStorage.Entry> get(String str, int r3) {
        return this.f4933a.get(str, r3);
    }
}
