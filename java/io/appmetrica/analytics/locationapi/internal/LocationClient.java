package io.appmetrica.analytics.locationapi.internal;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import java.util.List;

/* loaded from: classes.dex */
public interface LocationClient extends LocationControllerObserver {
    LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory();

    Location getLocation();

    LocationReceiverProviderFactory getLocationReceiverProviderFactory();

    void init(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, List<? extends Consumer<Location>> list);

    void registerLocationSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider);

    void registerLocationSource(LocationReceiverProvider locationReceiverProvider);

    void unregisterLocationSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider);

    void unregisterLocationSource(LocationReceiverProvider locationReceiverProvider);

    void updateCacheArguments(CacheArguments cacheArguments);

    void updateLocationFilter(LocationFilter locationFilter);
}
