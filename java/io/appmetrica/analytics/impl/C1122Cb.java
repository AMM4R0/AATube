package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;

/* renamed from: io.appmetrica.analytics.impl.Cb */
/* loaded from: classes.dex */
public final class C1122Cb implements InterfaceC1097Bb, InterfaceC1182El {

    /* renamed from: a */
    public final Context f4571a;

    /* renamed from: b */
    public final InterfaceC1197Fb f4572b;

    /* renamed from: c */
    public final LocationClient f4573c;

    /* renamed from: d */
    public final C1381Mk f4574d;

    /* renamed from: e */
    public final C1405Nj f4575e;

    /* renamed from: f */
    public final LastKnownLocationExtractorProviderFactory f4576f;

    /* renamed from: g */
    public final LocationReceiverProviderFactory f4577g;

    public C1122Cb(Context context, InterfaceC1197Fb interfaceC1197Fb, LocationClient locationClient) {
        this.f4571a = context;
        this.f4572b = interfaceC1197Fb;
        this.f4573c = locationClient;
        C1372Mb c1372Mb = new C1372Mb();
        this.f4574d = new C1381Mk(new C2188t5(c1372Mb, C2018ma.m4192h().m4206m().getAskForPermissionStrategy()));
        this.f4575e = C2018ma.m4192h().m4206m();
        AbstractC1172Eb.m2854a(interfaceC1197Fb, c1372Mb);
        AbstractC1172Eb.m2854a(interfaceC1197Fb, locationClient);
        this.f4576f = locationClient.getLastKnownExtractorProviderFactory();
        this.f4577g = locationClient.getLocationReceiverProviderFactory();
    }

    /* renamed from: a */
    public final C1381Mk m2799a() {
        return this.f4574d;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1097Bb
    /* renamed from: b */
    public final void mo2766b(Object obj) {
        ((C1322Kb) this.f4572b).m3018a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f4576f;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1097Bb, io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final Location getLocation() {
        return this.f4573c.getLocation();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f4577g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f4574d;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1097Bb
    public final void init() {
        this.f4573c.init(this.f4571a, this.f4574d, C2018ma.f6725C.f6731d.m2964c(), this.f4575e.mo2834d());
        ModuleLocationSourcesServiceController mo2835e = this.f4575e.mo2835e();
        if (mo2835e != null) {
            mo2835e.init();
        } else {
            LocationClient locationClient = this.f4573c;
            locationClient.registerLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.f4573c;
            locationClient2.registerLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((C1322Kb) this.f4572b).m3016a(this.f4575e.mo2836f());
        C2018ma.f6725C.f6748u.m2779a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(LocationControllerObserver locationControllerObserver) {
        AbstractC1172Eb.m2854a(this.f4572b, locationControllerObserver);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f4573c.registerLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f4573c.unregisterLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(LocationFilter locationFilter) {
        this.f4573c.updateLocationFilter(locationFilter);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1182El
    /* renamed from: a */
    public final void mo2780a(C2354zl c2354zl) {
        C1164E3 c1164e3 = c2354zl.f7563y;
        if (c1164e3 != null) {
            long j2 = c1164e3.f4688a;
            this.f4573c.updateCacheArguments(new CacheArguments(j2, 2 * j2));
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LocationReceiverProvider locationReceiverProvider) {
        this.f4573c.registerLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LocationReceiverProvider locationReceiverProvider) {
        this.f4573c.unregisterLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1097Bb
    /* renamed from: a */
    public final void mo2764a(Object obj) {
        ((C1322Kb) this.f4572b).m3020b(obj);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1097Bb
    /* renamed from: a */
    public final void mo2765a(boolean z2) {
        ((C1322Kb) this.f4572b).m3019a(z2);
    }
}
