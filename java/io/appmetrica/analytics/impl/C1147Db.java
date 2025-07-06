package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;

/* renamed from: io.appmetrica.analytics.impl.Db */
/* loaded from: classes.dex */
public final class C1147Db implements InterfaceC1097Bb {

    /* renamed from: a */
    public final C1573Ud f4636a = new C1573Ud();

    /* renamed from: b */
    public final C2094pb f4637b = new C2094pb();

    /* renamed from: c */
    public final C1422Ob f4638c = new C1422Ob();

    @Override // io.appmetrica.analytics.impl.InterfaceC1097Bb
    /* renamed from: a */
    public final void mo2764a(Object obj) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1097Bb
    /* renamed from: b */
    public final void mo2766b(Object obj) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f4637b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1097Bb, io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final Location getLocation() {
        return null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f4638c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f4636a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1097Bb
    public final void init() {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(LocationControllerObserver locationControllerObserver) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(LocationFilter locationFilter) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1097Bb
    /* renamed from: a */
    public final void mo2765a(boolean z2) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LocationReceiverProvider locationReceiverProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LocationReceiverProvider locationReceiverProvider) {
    }
}
