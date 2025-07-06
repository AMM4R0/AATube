package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.location.impl.q */
/* loaded from: classes.dex */
public final class C2377q implements LastKnownLocationExtractorProvider, LocationReceiverProvider {

    /* renamed from: a */
    public final String f7618a = "location-passive-provider";

    /* renamed from: b */
    public C2380t f7619b;

    /* renamed from: a */
    public final C2380t m4736a(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return m4738c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    /* renamed from: b */
    public final C2380t m4737b(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return m4738c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    /* renamed from: c */
    public final synchronized C2380t m4738c(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        C2380t c2380t;
        try {
            if (this.f7619b == null) {
                this.f7619b = new C2380t(context, iHandlerExecutor.getLooper(), new SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_FINE_LOCATION"), locationListener);
            }
            c2380t = this.f7619b;
            if (c2380t == null) {
                AbstractC2492i.m4918h("passiveProviderLocationReceiver");
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c2380t;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    public final LastKnownLocationExtractor getExtractor(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return m4738c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    public final String getIdentifier() {
        return this.f7618a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider
    public final LocationReceiver getLocationReceiver(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return m4738c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }
}
