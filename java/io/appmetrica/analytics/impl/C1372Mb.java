package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;
import p108m1.AbstractC2660j;

/* renamed from: io.appmetrica.analytics.impl.Mb */
/* loaded from: classes.dex */
public final class C1372Mb implements PermissionStrategy, LocationControllerObserver {

    /* renamed from: b */
    public static final C1347Lb f5053b = new C1347Lb();

    /* renamed from: c */
    public static final List f5054c = AbstractC2660j.m5120X("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");

    /* renamed from: a */
    public volatile boolean f5055a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        if (f5054c.contains(str)) {
            return !this.f5055a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f5055a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f5055a = false;
    }

    public final String toString() {
        return "LocationFlagStrategy(enabled=" + this.f5055a + ", locationPermissions=" + f5054c + ')';
    }
}
