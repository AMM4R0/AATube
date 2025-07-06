package io.appmetrica.analytics.coreapi.internal.servicecomponents;

/* loaded from: classes.dex */
public interface FirstExecutionDelayedTask {
    void setInitialDelaySeconds(long j2);

    boolean tryExecute(long j2);
}
