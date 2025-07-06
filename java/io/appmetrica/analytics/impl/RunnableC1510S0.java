package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.S0 */
/* loaded from: classes.dex */
public final class RunnableC1510S0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ECommerceEvent f5398a;

    /* renamed from: b */
    public final /* synthetic */ C2009m1 f5399b;

    public RunnableC1510S0(C2009m1 c2009m1, ECommerceEvent eCommerceEvent) {
        this.f5399b = c2009m1;
        this.f5398a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2009m1.m4119a(this.f5399b).reportECommerce(this.f5398a);
    }
}
