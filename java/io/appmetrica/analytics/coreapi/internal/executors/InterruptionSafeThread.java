package io.appmetrica.analytics.coreapi.internal.executors;

/* loaded from: classes.dex */
public class InterruptionSafeThread extends Thread implements IInterruptionSafeThread {

    /* renamed from: a */
    private volatile boolean f4242a;

    public InterruptionSafeThread() {
        this.f4242a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized boolean isRunning() {
        return this.f4242a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized void stopRunning() {
        this.f4242a = false;
        interrupt();
    }

    public InterruptionSafeThread(Runnable runnable, String str) {
        super(runnable, str);
        this.f4242a = true;
    }

    public InterruptionSafeThread(String str) {
        super(str);
        this.f4242a = true;
    }

    public InterruptionSafeThread(Runnable runnable) {
        super(runnable);
        this.f4242a = true;
    }
}
