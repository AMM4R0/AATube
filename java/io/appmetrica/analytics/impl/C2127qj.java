package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qj */
/* loaded from: classes.dex */
public final class C2127qj implements InterfaceC1446Pa {

    /* renamed from: a */
    public final /* synthetic */ String f7000a;

    /* renamed from: b */
    public final /* synthetic */ String f7001b;

    public C2127qj(String str, String str2) {
        this.f7000a = str;
        this.f7001b = str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1446Pa
    /* renamed from: a */
    public final void mo3202a(InterfaceC1471Qa interfaceC1471Qa) {
        interfaceC1471Qa.reportEvent(this.f7000a, this.f7001b);
    }
}
