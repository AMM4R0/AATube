package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.Q5 */
/* loaded from: classes.dex */
public final class RunnableC1466Q5 implements Runnable {

    /* renamed from: a */
    public final List f5242a;

    /* renamed from: b */
    public final IHandlerExecutor f5243b = C2018ma.m4192h().m4214u().m2962a();

    /* renamed from: c */
    public final WaitForActivationDelayBarrier f5244c = C2018ma.m4192h().m4195a();

    public RunnableC1466Q5(List list) {
        this.f5242a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5244c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.f5243b, new C1441P5(this));
    }
}
