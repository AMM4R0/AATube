package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.appmetrica.analytics.impl.hd */
/* loaded from: classes.dex */
public final class ThreadFactoryC1896hd implements ThreadFactory {

    /* renamed from: a */
    public static final AtomicInteger f6405a = new AtomicInteger(0);

    /* renamed from: a */
    public static int m3943a() {
        return f6405a.incrementAndGet();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new InterruptionSafeThread(runnable, "null-" + f6405a.incrementAndGet());
    }
}
