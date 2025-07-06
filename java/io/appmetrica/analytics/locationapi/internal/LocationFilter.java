package io.appmetrica.analytics.locationapi.internal;

import kotlin.jvm.internal.AbstractC2489f;

/* loaded from: classes.dex */
public final class LocationFilter {

    /* renamed from: a */
    private final long f7643a;

    /* renamed from: b */
    private final float f7644b;

    public LocationFilter() {
        this(0L, 0.0f, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LocationFilter.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.LocationFilter");
        }
        LocationFilter locationFilter = (LocationFilter) obj;
        return this.f7643a == locationFilter.f7643a && this.f7644b == locationFilter.f7644b;
    }

    public final float getUpdateDistanceInterval() {
        return this.f7644b;
    }

    public final long getUpdateTimeInterval() {
        return this.f7643a;
    }

    public int hashCode() {
        return Float.valueOf(this.f7644b).hashCode() + (Long.valueOf(this.f7643a).hashCode() * 31);
    }

    public String toString() {
        return "LocationFilter(updateTimeInterval=" + this.f7643a + ", updateDistanceInterval=" + this.f7644b + ')';
    }

    public LocationFilter(long j2, float f) {
        this.f7643a = j2;
        this.f7644b = f;
    }

    public /* synthetic */ LocationFilter(long j2, float f, int r4, AbstractC2489f abstractC2489f) {
        this((r4 & 1) != 0 ? 5000L : j2, (r4 & 2) != 0 ? 10.0f : f);
    }
}
