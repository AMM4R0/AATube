package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.location.impl.b */
/* loaded from: classes.dex */
public final class C2362b implements LastKnownLocationExtractor {

    /* renamed from: a */
    public final Context f7580a;

    /* renamed from: b */
    public final PermissionResolutionStrategy f7581b;

    /* renamed from: c */
    public final LocationListener f7582c;

    /* renamed from: d */
    public final IHandlerExecutor f7583d;

    /* renamed from: e */
    public final C2364d f7584e = new C2364d();

    public C2362b(Context context, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener, IHandlerExecutor iHandlerExecutor) {
        this.f7580a = context;
        this.f7581b = permissionResolutionStrategy;
        this.f7582c = locationListener;
        this.f7583d = iHandlerExecutor;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    public final void updateLastKnownLocation() {
        IGplLibraryWrapper gplLibraryWrapper;
        if (this.f7581b.hasNecessaryPermissions(this.f7580a)) {
            try {
                C2364d c2364d = this.f7584e;
                Context context = this.f7580a;
                LocationListener locationListener = this.f7582c;
                IHandlerExecutor iHandlerExecutor = this.f7583d;
                c2364d.getClass();
                if (ReflectionUtils.detectClassExists("com.google.android.gms.location.LocationRequest")) {
                    try {
                        gplLibraryWrapper = new GplLibraryWrapper(context, locationListener, iHandlerExecutor.getLooper(), iHandlerExecutor, TimeUnit.SECONDS.toMillis(1L));
                    } catch (Throwable unused) {
                    }
                    gplLibraryWrapper.updateLastKnownLocation();
                }
                gplLibraryWrapper = new C2361a();
                gplLibraryWrapper.updateLastKnownLocation();
            } catch (Throwable unused2) {
            }
        }
    }
}
