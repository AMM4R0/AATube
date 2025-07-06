package io.appmetrica.analytics.modulesapi.internal.service;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface RemoteConfigExtensionConfiguration<S> {
    Map<String, Integer> getBlocks();

    List<String> getFeatures();

    JsonParser<S> getJsonParser();

    Converter<S, byte[]> getProtobufConverter();

    RemoteConfigUpdateListener<S> getRemoteConfigUpdateListener();
}
