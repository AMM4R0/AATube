package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.uh */
/* loaded from: classes.dex */
public final class RunnableC2225uh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdRevenue f7225a;

    /* renamed from: b */
    public final /* synthetic */ C1353Lh f7226b;

    public RunnableC2225uh(C1353Lh c1353Lh, AdRevenue adRevenue) {
        this.f7226b = c1353Lh;
        this.f7225a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f7226b;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).reportAdRevenue(this.f7225a);
    }
}
