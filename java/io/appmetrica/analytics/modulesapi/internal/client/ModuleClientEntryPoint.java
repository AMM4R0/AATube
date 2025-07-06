package io.appmetrica.analytics.modulesapi.internal.client;

/* loaded from: classes.dex */
public interface ModuleClientEntryPoint<T> {
    String getIdentifier();

    void initClientSide(ClientContext clientContext);

    void onActivated();
}
