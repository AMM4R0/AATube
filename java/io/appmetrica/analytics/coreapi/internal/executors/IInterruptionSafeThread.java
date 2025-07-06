package io.appmetrica.analytics.coreapi.internal.executors;

/* loaded from: classes.dex */
public interface IInterruptionSafeThread {
    boolean isRunning();

    void stopRunning();
}
