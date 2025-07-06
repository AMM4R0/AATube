package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.location.impl.t */
/* loaded from: classes.dex */
public final class C2380t extends C2384x implements LocationReceiver {

    /* renamed from: e */
    public final Looper f7622e;

    /* renamed from: f */
    public final long f7623f;

    public C2380t(Context context, Looper looper, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f7622e = looper;
        this.f7623f = TimeUnit.SECONDS.toMillis(1L);
    }

    /* renamed from: b */
    public static final /* synthetic */ float m4740b(C2380t c2380t) {
        c2380t.getClass();
        return 0.0f;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f7631b.hasNecessaryPermissions(this.f7630a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.f7630a, "location", AbstractC0002c.m17l(new StringBuilder("request location updates for "), this.f7633d, " provider"), "location manager", new C2378r(this));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f7630a, "location", "stop location updates for passive provider", "location manager", new C2379s(this));
    }
}
