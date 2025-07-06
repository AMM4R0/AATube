package io.appmetrica.analytics.impl;

import android.os.HandlerThread;
import io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread;

/* renamed from: io.appmetrica.analytics.impl.Za */
/* loaded from: classes.dex */
public final class HandlerThreadC1694Za extends HandlerThread implements IInterruptionSafeThread {

    /* renamed from: a */
    public volatile boolean f5801a;

    public HandlerThreadC1694Za(String str) {
        super(str);
        this.f5801a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized boolean isRunning() {
        return this.f5801a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized void stopRunning() {
        this.f5801a = false;
        interrupt();
    }
}
