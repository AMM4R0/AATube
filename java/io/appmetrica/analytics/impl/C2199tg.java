package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.tg */
/* loaded from: classes.dex */
public class C2199tg extends AbstractCallableC1825eh {

    /* renamed from: e */
    public final C1775ch f7170e;

    public C2199tg(C1883h0 c1883h0, InterfaceC2178sk interfaceC2178sk, C1775ch c1775ch) {
        super(c1883h0, interfaceC2178sk);
        this.f7170e = c1775ch;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC1825eh
    /* renamed from: a */
    public final void mo3792a(Throwable th) {
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC1825eh
    /* renamed from: a */
    public final void mo3316a(IAppMetricaService iAppMetricaService) {
        C1775ch c1775ch = this.f7170e;
        iAppMetricaService.reportData(c1775ch.f6052c, c1775ch.f6050a.m3483d(c1775ch.f6054e.m4108c()));
    }
}
