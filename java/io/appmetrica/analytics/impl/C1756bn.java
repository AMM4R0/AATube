package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.bn */
/* loaded from: classes.dex */
public final class C1756bn extends AbstractCallableC1825eh {

    /* renamed from: e */
    public final int f5954e;

    /* renamed from: f */
    public final Bundle f5955f;

    public C1756bn(C1883h0 c1883h0, InterfaceC2178sk interfaceC2178sk, int r3, Bundle bundle) {
        super(c1883h0, interfaceC2178sk);
        this.f5954e = r3;
        this.f5955f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC1825eh
    /* renamed from: a */
    public final void mo3316a(IAppMetricaService iAppMetricaService) {
        iAppMetricaService.reportData(this.f5954e, this.f5955f);
    }
}
