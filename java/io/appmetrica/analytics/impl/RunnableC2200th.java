package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.th */
/* loaded from: classes.dex */
public final class RunnableC2200th implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Revenue f7171a;

    /* renamed from: b */
    public final /* synthetic */ C1353Lh f7172b;

    public RunnableC2200th(C1353Lh c1353Lh, Revenue revenue) {
        this.f7172b = c1353Lh;
        this.f7171a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f7172b;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).reportRevenue(this.f7171a);
    }
}
