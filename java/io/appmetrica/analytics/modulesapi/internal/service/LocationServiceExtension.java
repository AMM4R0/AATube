package io.appmetrica.analytics.modulesapi.internal.service;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;

/* loaded from: classes.dex */
public interface LocationServiceExtension {
    Consumer<Location> getLocationConsumer();

    Toggle getLocationControllerAppStateToggle();

    ModuleLocationSourcesServiceController getLocationSourcesController();
}
