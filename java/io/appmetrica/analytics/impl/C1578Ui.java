package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Ui */
/* loaded from: classes.dex */
public final class C1578Ui implements InterfaceC1446Pa {

    /* renamed from: a */
    public final /* synthetic */ String f5540a;

    /* renamed from: b */
    public final /* synthetic */ String f5541b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f5542c;

    public C1578Ui(String str, String str2, Throwable th) {
        this.f5540a = str;
        this.f5541b = str2;
        this.f5542c = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1446Pa
    /* renamed from: a */
    public final void mo3202a(InterfaceC1471Qa interfaceC1471Qa) {
        interfaceC1471Qa.reportError(this.f5540a, this.f5541b, this.f5542c);
    }
}
