package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.vh */
/* loaded from: classes.dex */
public final class RunnableC2250vh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ECommerceEvent f7309a;

    /* renamed from: b */
    public final /* synthetic */ C1353Lh f7310b;

    public RunnableC2250vh(C1353Lh c1353Lh, ECommerceEvent eCommerceEvent) {
        this.f7310b = c1353Lh;
        this.f7309a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f7310b;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).reportECommerce(this.f7309a);
    }
}
