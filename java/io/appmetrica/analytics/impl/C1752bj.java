package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.bj */
/* loaded from: classes.dex */
public final class C1752bj implements InterfaceC1446Pa {

    /* renamed from: a */
    public final /* synthetic */ ECommerceEvent f5949a;

    public C1752bj(ECommerceEvent eCommerceEvent) {
        this.f5949a = eCommerceEvent;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1446Pa
    /* renamed from: a */
    public final void mo3202a(InterfaceC1471Qa interfaceC1471Qa) {
        interfaceC1471Qa.reportECommerce(this.f5949a);
    }
}
