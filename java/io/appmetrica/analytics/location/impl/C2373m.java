package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.cache.SynchronizedDataCache;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.location.impl.m */
/* loaded from: classes.dex */
public final class C2373m extends SynchronizedDataCache {

    /* renamed from: d */
    public static final long f7607d = 200;

    /* renamed from: e */
    public static final long f7608e = 50;

    /* renamed from: a */
    public final C2372l f7610a;

    /* renamed from: b */
    public static final long f7605b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public static final long f7606c = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: f */
    public static final List<String> f7609f = Arrays.asList("gps", "network");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2373m() {
        /*
            r6 = this;
            io.appmetrica.analytics.location.impl.l r1 = new io.appmetrica.analytics.location.impl.l
            long r2 = io.appmetrica.analytics.location.impl.C2373m.f7606c
            r1.<init>(r2)
            long r2 = io.appmetrica.analytics.location.impl.C2373m.f7605b
            r4 = 2
            long r4 = r4 * r2
            r0 = r6
            r0.<init>(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.location.impl.C2373m.<init>():void");
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean shouldUpdate(Location location) {
        return f7609f.contains(location.getProvider()) && (this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData() || m4732a(location, (Location) this.mCachedData.getData(), this.f7610a.f7604a, 200L));
    }

    public C2373m(C2372l c2372l, long j2, long j3) {
        super(j2, j3, "location");
        this.f7610a = c2372l;
    }

    /* renamed from: a */
    public static boolean m4732a(Location location, Location location2, long j2, long j3) {
        boolean equals;
        if (location2 == null) {
            return true;
        }
        if (location == null) {
            return false;
        }
        long time = location.getTime() - location2.getTime();
        boolean z2 = time > j2;
        boolean z3 = time < (-j2);
        boolean z4 = time > 0;
        if (z2) {
            return true;
        }
        if (z3) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z5 = accuracy > 0;
        boolean z6 = accuracy < 0;
        boolean z7 = ((long) accuracy) > j3;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        if (provider == null) {
            equals = provider2 == null;
        } else {
            equals = provider.equals(provider2);
        }
        if (z6) {
            return true;
        }
        if (!z4 || z5) {
            return z4 && !z7 && equals;
        }
        return true;
    }
}
