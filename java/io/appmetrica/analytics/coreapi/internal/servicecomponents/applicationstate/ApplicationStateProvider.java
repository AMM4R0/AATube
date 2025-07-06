package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

/* loaded from: classes.dex */
public interface ApplicationStateProvider {
    ApplicationState getCurrentState();

    ApplicationState registerStickyObserver(ApplicationStateObserver applicationStateObserver);
}
