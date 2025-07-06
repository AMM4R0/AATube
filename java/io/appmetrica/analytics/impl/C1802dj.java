package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.dj */
/* loaded from: classes.dex */
public final class C1802dj implements InterfaceC1446Pa {

    /* renamed from: a */
    public final /* synthetic */ AdRevenue f6106a;

    public C1802dj(AdRevenue adRevenue) {
        this.f6106a = adRevenue;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1446Pa
    /* renamed from: a */
    public final void mo3202a(InterfaceC1471Qa interfaceC1471Qa) {
        interfaceC1471Qa.reportAdRevenue(this.f6106a);
    }
}
