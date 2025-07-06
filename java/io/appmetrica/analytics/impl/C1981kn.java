package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ReporterConfig;

/* renamed from: io.appmetrica.analytics.impl.kn */
/* loaded from: classes.dex */
public class C1981kn {

    /* renamed from: a */
    public final String f6605a;

    /* renamed from: b */
    public final InterfaceC1520Sa f6606b;

    public C1981kn(InterfaceC1520Sa interfaceC1520Sa, String str) {
        this.f6606b = interfaceC1520Sa;
        this.f6605a = str;
    }

    /* renamed from: a */
    public InterfaceC1545Ta mo3496a() {
        return this.f6606b.mo2749a().mo3184b(ReporterConfig.newConfigBuilder(this.f6605a).build());
    }
}
