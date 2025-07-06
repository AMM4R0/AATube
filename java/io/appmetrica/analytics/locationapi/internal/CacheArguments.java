package io.appmetrica.analytics.locationapi.internal;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2489f;

/* loaded from: classes.dex */
public final class CacheArguments {

    /* renamed from: a */
    private final long f7641a;

    /* renamed from: b */
    private final long f7642b;

    public CacheArguments() {
        this(0L, 0L, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CacheArguments.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.CacheArguments");
        }
        CacheArguments cacheArguments = (CacheArguments) obj;
        return this.f7641a == cacheArguments.f7641a && this.f7642b == cacheArguments.f7642b;
    }

    public final long getOutdatedTimeInterval() {
        return this.f7642b;
    }

    public final long getRefreshPeriod() {
        return this.f7641a;
    }

    public int hashCode() {
        return Long.valueOf(this.f7642b).hashCode() + (Long.valueOf(this.f7641a).hashCode() * 31);
    }

    public String toString() {
        return "CacheArguments(refreshPeriod=" + this.f7641a + ", outdatedTimeInterval=" + this.f7642b + ')';
    }

    public CacheArguments(long j2, long j3) {
        this.f7641a = j2;
        this.f7642b = j3;
    }

    public /* synthetic */ CacheArguments(long j2, long j3, int r7, AbstractC2489f abstractC2489f) {
        this((r7 & 1) != 0 ? TimeUnit.SECONDS.toMillis(10L) : j2, (r7 & 2) != 0 ? TimeUnit.MINUTES.toMillis(2L) : j3);
    }
}
