package io.appmetrica.analytics.location.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;

/* renamed from: io.appmetrica.analytics.location.impl.x */
/* loaded from: classes.dex */
public class C2384x implements LastKnownLocationExtractor {

    /* renamed from: a */
    public final Context f7630a;

    /* renamed from: b */
    public final PermissionResolutionStrategy f7631b;

    /* renamed from: c */
    public final LocationListener f7632c;

    /* renamed from: d */
    public final String f7633d;

    public C2384x(Context context, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener, String str) {
        this.f7630a = context;
        this.f7631b = permissionResolutionStrategy;
        this.f7632c = locationListener;
        this.f7633d = str;
    }

    /* renamed from: a */
    public final Context m4742a() {
        return this.f7630a;
    }

    /* renamed from: b */
    public final LocationListener m4743b() {
        return this.f7632c;
    }

    /* renamed from: c */
    public final PermissionResolutionStrategy m4744c() {
        return this.f7631b;
    }

    /* renamed from: d */
    public final String m4745d() {
        return this.f7633d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    @SuppressLint({"MissingPermission"})
    public final void updateLastKnownLocation() {
        if (this.f7631b.hasNecessaryPermissions(this.f7630a)) {
            Location location = (Location) SystemServiceUtils.accessSystemServiceByNameSafely(this.f7630a, "location", "getting last known location for provider " + this.f7633d, "location manager", new C2383w(this));
            if (location != null) {
                this.f7632c.onLocationChanged(location);
            }
        }
    }
}
