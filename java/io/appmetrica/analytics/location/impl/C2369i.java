package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.location.impl.i */
/* loaded from: classes.dex */
public final class C2369i {

    /* renamed from: a */
    public final LocationFilter f7591a;

    /* renamed from: b */
    public final CacheArguments f7592b;

    public C2369i(LocationFilter locationFilter, CacheArguments cacheArguments) {
        this.f7591a = locationFilter;
        this.f7592b = cacheArguments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2369i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.location.impl.LocationConfig");
        }
        C2369i c2369i = (C2369i) obj;
        return AbstractC2492i.m4911a(this.f7591a, c2369i.f7591a) && AbstractC2492i.m4911a(this.f7592b, c2369i.f7592b);
    }

    public final int hashCode() {
        return this.f7592b.hashCode() + (this.f7591a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationConfig(locationFilter=" + this.f7591a + ", cacheArguments=" + this.f7592b + ')';
    }

    public /* synthetic */ C2369i() {
        this(new LocationFilter(0L, 0.0f, 3, null), new CacheArguments(0L, 0L, 3, null));
    }
}
