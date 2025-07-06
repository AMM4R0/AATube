package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* renamed from: io.appmetrica.analytics.impl.Ic */
/* loaded from: classes.dex */
public final class C1273Ic implements ModuleEventServiceHandlerReporter {

    /* renamed from: a */
    public final C1992l9 f4860a;

    /* renamed from: b */
    public final C1615W5 f4861b;

    public C1273Ic(C1992l9 c1992l9, C1615W5 c1615w5) {
        this.f4860a = c1992l9;
        this.f4861b = c1615w5;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(CounterReportApi counterReportApi) {
        C1615W5 m3468d = C1615W5.m3468d(this.f4861b);
        m3468d.f5624d = counterReportApi.getType();
        m3468d.f5625e = counterReportApi.getCustomType();
        m3468d.setName(counterReportApi.getName());
        m3468d.setValue(counterReportApi.getValue());
        m3468d.setValueBytes(counterReportApi.getValueBytes());
        m3468d.f5627g = counterReportApi.getBytesTruncated();
        C1992l9 c1992l9 = this.f4860a;
        c1992l9.m4100a(m3468d, C1903hk.m3946a(c1992l9.f6638c.m3950b(m3468d), m3468d.f5629i));
    }
}
