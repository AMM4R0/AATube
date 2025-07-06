package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.jj */
/* loaded from: classes.dex */
public final class C1952jj implements InterfaceC1446Pa {

    /* renamed from: a */
    public final /* synthetic */ String f6545a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f6546b;

    public C1952jj(String str, byte[] bArr) {
        this.f6545a = str;
        this.f6546b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1446Pa
    /* renamed from: a */
    public final void mo3202a(InterfaceC1471Qa interfaceC1471Qa) {
        interfaceC1471Qa.setSessionExtra(this.f6545a, this.f6546b);
    }
}
