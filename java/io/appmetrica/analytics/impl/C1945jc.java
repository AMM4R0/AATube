package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.jc */
/* loaded from: classes.dex */
public final class C1945jc implements InterfaceC1426Of {

    /* renamed from: a */
    public final /* synthetic */ C1970kc f6539a;

    public C1945jc(C1970kc c1970kc) {
        this.f6539a = c1970kc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1426Of
    /* renamed from: a */
    public final void mo3179a(C1500Rf c1500Rf) {
        if (c1500Rf == null) {
            return;
        }
        C1615W5 c1615w5 = new C1615W5("", "", 0);
        c1615w5.setValueBytes(c1500Rf.m3263a());
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        c1615w5.f5624d = 4097;
        this.f6539a.mo3169a(c1615w5);
    }
}
