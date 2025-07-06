package io.appmetrica.analytics.modulesapi.internal.service;

/* loaded from: classes.dex */
public interface ServiceWakeLock {
    boolean acquireWakeLock(String str);

    void releaseWakeLock(String str);
}
