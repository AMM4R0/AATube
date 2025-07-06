package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.Sd */
/* loaded from: classes.dex */
public final class C1523Sd extends AbstractCallableC1825eh {

    /* renamed from: e */
    public final C1748bf f5416e;

    public C1523Sd(C1883h0 c1883h0, InterfaceC2178sk interfaceC2178sk, C1748bf c1748bf) {
        super(c1883h0, interfaceC2178sk);
        this.f5416e = c1748bf;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC1825eh
    /* renamed from: a */
    public final void mo3316a(IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        C1748bf c1748bf = this.f5416e;
        synchronized (c1748bf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", c1748bf);
        }
        iAppMetricaService.pauseUserSession(bundle);
    }
}
