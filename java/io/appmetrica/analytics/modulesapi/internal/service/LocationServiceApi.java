package io.appmetrica.analytics.modulesapi.internal.service;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;

/* loaded from: classes.dex */
public interface LocationServiceApi {
    LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory();

    Location getLocation();

    LocationReceiverProviderFactory getLocationReceiverProviderFactory();

    PermissionExtractor getPermissionExtractor();

    void registerControllerObserver(LocationControllerObserver locationControllerObserver);

    void registerSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider);

    void registerSource(LocationReceiverProvider locationReceiverProvider);

    void unregisterSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider);

    void unregisterSource(LocationReceiverProvider locationReceiverProvider);

    void updateLocationFilter(LocationFilter locationFilter);
}
