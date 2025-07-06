package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.fa */
/* loaded from: classes.dex */
public final class C1843fa extends AbstractC1564U4 {
    public C1843fa(C1489R4 c1489r4) {
        super(c1489r4);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1564U4
    /* renamed from: a */
    public final boolean mo3389a(C1615W5 c1615w5, C1415O4 c1415o4) {
        Bundle bundle = c1615w5.f5633m;
        this.f5516a.m3252a(bundle != null ? (C1620Wa) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null);
        return false;
    }
}
