package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.nn */
/* loaded from: classes.dex */
public final class C2056nn extends AbstractC1564U4 {

    /* renamed from: b */
    public final C1267I6 f6831b;

    public C2056nn(C1489R4 c1489r4, C1267I6 r2) {
        super(c1489r4);
        this.f6831b = r2;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1564U4
    /* renamed from: a */
    public final boolean mo3389a(C1615W5 c1615w5, C1415O4 c1415o4) {
        C1265I4 r2 = c1415o4.f5149b.f5299d.f6329a;
        this.f6831b.m2951a(r2.f4846i);
        Boolean bool = r2.f4839b;
        if (Boolean.TRUE.equals(bool)) {
            C2018ma.f6725C.m4203j().mo2765a(true);
        } else if (Boolean.FALSE.equals(bool)) {
            C2018ma.f6725C.m4203j().mo2765a(false);
        }
        return false;
    }
}
