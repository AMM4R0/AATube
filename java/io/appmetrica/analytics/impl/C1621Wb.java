package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.Wb */
/* loaded from: classes.dex */
public final class C1621Wb extends C1981kn {

    /* renamed from: c */
    public final AppMetricaConfig f5641c;

    public C1621Wb(InterfaceC1520Sa interfaceC1520Sa, AppMetricaConfig appMetricaConfig) {
        super(interfaceC1520Sa, appMetricaConfig.apiKey);
        this.f5641c = appMetricaConfig;
    }

    @Override // io.appmetrica.analytics.impl.C1981kn
    /* renamed from: a */
    public final InterfaceC1545Ta mo3496a() {
        return this.f6606b.mo2749a().mo3181a(this.f5641c);
    }
}
