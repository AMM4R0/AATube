package io.appmetrica.analytics.location.internal;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.location.impl.C2367g;
import io.appmetrica.analytics.location.impl.C2369i;
import io.appmetrica.analytics.location.impl.C2371k;
import io.appmetrica.analytics.location.impl.C2375o;
import io.appmetrica.analytics.location.impl.C2376p;
import io.appmetrica.analytics.location.impl.C2377q;
import io.appmetrica.analytics.location.impl.RunnableC2370j;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import java.util.List;

/* loaded from: classes.dex */
public final class LocationClientImpl implements LocationClient {

    /* renamed from: a */
    private C2371k f7637a;

    /* renamed from: b */
    private final C2367g f7638b;

    /* renamed from: c */
    private final C2375o f7639c;

    /* renamed from: d */
    private C2369i f7640d;

    public LocationClientImpl() {
        C2377q c2377q = new C2377q();
        this.f7638b = new C2367g(c2377q);
        this.f7639c = new C2375o(c2377q);
        this.f7640d = new C2369i();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f7638b;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized Location getLocation() {
        C2371k c2371k;
        c2371k = this.f7637a;
        return c2371k != null ? c2371k.m4724a() : null;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f7639c;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void init(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, List<? extends Consumer<Location>> list) {
        if (this.f7637a == null) {
            this.f7637a = new C2371k(context, permissionExtractor, iHandlerExecutor, new C2376p(list, this.f7640d));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void registerLocationSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        C2371k c2371k = this.f7637a;
        if (c2371k != null) {
            c2371k.m4726a(lastKnownLocationExtractorProvider);
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public synchronized void startLocationTracking() {
        C2371k c2371k = this.f7637a;
        if (c2371k != null) {
            c2371k.startLocationTracking();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public synchronized void stopLocationTracking() {
        C2371k c2371k = this.f7637a;
        if (c2371k != null) {
            c2371k.stopLocationTracking();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void unregisterLocationSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        C2371k c2371k = this.f7637a;
        if (c2371k != null) {
            c2371k.m4729b(lastKnownLocationExtractorProvider);
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void updateCacheArguments(CacheArguments cacheArguments) {
        C2369i c2369i = new C2369i(this.f7640d.f7591a, cacheArguments);
        this.f7640d = c2369i;
        C2371k c2371k = this.f7637a;
        if (c2371k != null) {
            c2371k.f7598d.execute(new RunnableC2370j(c2371k, c2369i));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void updateLocationFilter(LocationFilter locationFilter) {
        C2369i c2369i = new C2369i(locationFilter, this.f7640d.f7592b);
        this.f7640d = c2369i;
        C2371k c2371k = this.f7637a;
        if (c2371k != null) {
            c2371k.f7598d.execute(new RunnableC2370j(c2371k, c2369i));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void registerLocationSource(LocationReceiverProvider locationReceiverProvider) {
        C2371k c2371k = this.f7637a;
        if (c2371k != null) {
            c2371k.m4727a(locationReceiverProvider);
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void unregisterLocationSource(LocationReceiverProvider locationReceiverProvider) {
        C2371k c2371k = this.f7637a;
        if (c2371k != null) {
            c2371k.m4730b(locationReceiverProvider);
        }
    }
}
