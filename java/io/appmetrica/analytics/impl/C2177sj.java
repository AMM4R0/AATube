package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.sj */
/* loaded from: classes.dex */
public final class C2177sj implements InterfaceC1446Pa {

    /* renamed from: a */
    public final /* synthetic */ String f7132a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f7133b;

    public C2177sj(String str, Throwable th) {
        this.f7132a = str;
        this.f7133b = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1446Pa
    /* renamed from: a */
    public final void mo3202a(InterfaceC1471Qa interfaceC1471Qa) {
        interfaceC1471Qa.reportError(this.f7132a, this.f7133b);
    }
}
