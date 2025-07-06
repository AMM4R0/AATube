package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.z9 */
/* loaded from: classes.dex */
public final class C2342z9 implements IHandlerExecutor {

    /* renamed from: a */
    public final Looper f7520a;

    /* renamed from: b */
    public final Handler f7521b;

    /* renamed from: c */
    public final HandlerThreadC1694Za f7522c;

    public C2342z9(String str) {
        this(m4681a(str));
    }

    /* renamed from: a */
    public static HandlerThreadC1694Za m4681a(String str) {
        HandlerThreadC1694Za handlerThreadC1694Za = new HandlerThreadC1694Za(str + "-" + ThreadFactoryC1896hd.f6405a.incrementAndGet());
        handlerThreadC1694Za.start();
        return handlerThreadC1694Za;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f7521b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j2) {
        this.f7521b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j2));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Handler getHandler() {
        return this.f7521b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Looper getLooper() {
        return this.f7520a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z2;
        HandlerThreadC1694Za handlerThreadC1694Za = this.f7522c;
        synchronized (handlerThreadC1694Za) {
            z2 = handlerThreadC1694Za.f5801a;
        }
        return z2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(Runnable runnable) {
        this.f7521b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f7521b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC1694Za handlerThreadC1694Za = this.f7522c;
        synchronized (handlerThreadC1694Za) {
            handlerThreadC1694Za.f5801a = false;
            handlerThreadC1694Za.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f7521b.post(futureTask);
        return futureTask;
    }

    public C2342z9(HandlerThreadC1694Za handlerThreadC1694Za) {
        this(handlerThreadC1694Za, handlerThreadC1694Za.getLooper(), new Handler(handlerThreadC1694Za.getLooper()));
    }

    public C2342z9(HandlerThreadC1694Za handlerThreadC1694Za, Looper looper, Handler handler) {
        this.f7522c = handlerThreadC1694Za;
        this.f7520a = looper;
        this.f7521b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j2, TimeUnit timeUnit) {
        this.f7521b.postDelayed(runnable, timeUnit.toMillis(j2));
    }
}
