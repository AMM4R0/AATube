package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Vi */
/* loaded from: classes.dex */
public final class C1603Vi implements InterfaceC1446Pa {

    /* renamed from: a */
    public final /* synthetic */ Throwable f5600a;

    public C1603Vi(Throwable th) {
        this.f5600a = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1446Pa
    /* renamed from: a */
    public final void mo3202a(InterfaceC1471Qa interfaceC1471Qa) {
        interfaceC1471Qa.reportUnhandledException(this.f5600a);
    }
}
