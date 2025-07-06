package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.sm */
/* loaded from: classes.dex */
public final class C2180sm extends AbstractC1390N4 {

    /* renamed from: g */
    public final InterfaceC1706Zm f7139g;

    public C2180sm(String str, String str2, InterfaceC1706Zm interfaceC1706Zm, InterfaceC1234Gn interfaceC1234Gn, AbstractC1736b3 abstractC1736b3) {
        super(0, str, str2, interfaceC1234Gn, abstractC1736b3);
        this.f7139g = interfaceC1706Zm;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1390N4
    /* renamed from: a */
    public final void mo2938a(C2206tn c2206tn) {
        String str = (String) this.f7139g.mo2687a(this.f5112f);
        c2206tn.f7187d.f7318a = str == null ? new byte[0] : str.getBytes();
    }

    /* renamed from: h */
    public final InterfaceC1706Zm m4428h() {
        return this.f7139g;
    }
}
