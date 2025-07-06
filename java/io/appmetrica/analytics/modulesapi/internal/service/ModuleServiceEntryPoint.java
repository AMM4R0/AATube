package io.appmetrica.analytics.modulesapi.internal.service;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;

/* loaded from: classes.dex */
public interface ModuleServiceEntryPoint<T> {
    String getIdentifier();

    LocationServiceExtension getLocationServiceExtension();

    ModuleEventServiceHandlerFactory getModuleEventServiceHandlerFactory();

    ModuleServicesDatabase getModuleServicesDatabase();

    RemoteConfigExtensionConfiguration<T> getRemoteConfigExtensionConfiguration();

    void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<T> moduleRemoteConfig);
}
