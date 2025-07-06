package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.kj */
/* loaded from: classes.dex */
public final class C1977kj implements InterfaceC1446Pa {

    /* renamed from: a */
    public final /* synthetic */ AdRevenue f6591a;

    /* renamed from: b */
    public final /* synthetic */ boolean f6592b;

    public C1977kj(AdRevenue adRevenue, boolean z2) {
        this.f6591a = adRevenue;
        this.f6592b = z2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1446Pa
    /* renamed from: a */
    public final void mo3202a(InterfaceC1471Qa interfaceC1471Qa) {
        interfaceC1471Qa.reportAdRevenue(this.f6591a, this.f6592b);
    }
}
