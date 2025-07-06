package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.ci */
/* loaded from: classes.dex */
public final class C1776ci extends AbstractC1564U4 {
    public C1776ci(C1489R4 c1489r4) {
        super(c1489r4);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1564U4
    /* renamed from: a */
    public final boolean mo3389a(C1615W5 c1615w5, C1415O4 c1415o4) {
        Bundle bundle = c1615w5.f5633m;
        this.f5516a.f5307l.m3397a(new C1465Q4(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null));
        return false;
    }
}
