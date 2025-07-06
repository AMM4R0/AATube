package io.appmetrica.analytics.modulesapi.internal.service;

/* loaded from: classes.dex */
public interface ModuleServiceLifecycleObserver {
    void onAllClientsDisconnected();

    void onFirstClientConnected();
}
