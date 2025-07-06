package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* renamed from: io.appmetrica.analytics.impl.Ah */
/* loaded from: classes.dex */
public final class RunnableC1078Ah implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ModuleEvent f4485a;

    /* renamed from: b */
    public final /* synthetic */ C1353Lh f4486b;

    public RunnableC1078Ah(C1353Lh c1353Lh, ModuleEvent moduleEvent) {
        this.f4486b = c1353Lh;
        this.f4485a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f4486b;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).reportEvent(this.f4485a);
    }
}
