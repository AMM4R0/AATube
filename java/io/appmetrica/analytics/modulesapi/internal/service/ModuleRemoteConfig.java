package io.appmetrica.analytics.modulesapi.internal.service;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;

/* loaded from: classes.dex */
public interface ModuleRemoteConfig<T> {
    T getFeaturesConfig();

    SdkIdentifiers getIdentifiers();

    RemoteConfigMetaInfo getRemoteConfigMetaInfo();
}
