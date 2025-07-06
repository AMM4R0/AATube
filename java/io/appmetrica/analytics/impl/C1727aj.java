package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.aj */
/* loaded from: classes.dex */
public final class C1727aj implements InterfaceC1446Pa {

    /* renamed from: a */
    public final /* synthetic */ Revenue f5888a;

    public C1727aj(Revenue revenue) {
        this.f5888a = revenue;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1446Pa
    /* renamed from: a */
    public final void mo3202a(InterfaceC1471Qa interfaceC1471Qa) {
        interfaceC1471Qa.reportRevenue(this.f5888a);
    }
}
