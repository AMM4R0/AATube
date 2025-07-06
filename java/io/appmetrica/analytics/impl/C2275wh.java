package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* renamed from: io.appmetrica.analytics.impl.wh */
/* loaded from: classes.dex */
public final class C2275wh implements Provider {

    /* renamed from: a */
    public final /* synthetic */ C2133r0 f7373a;

    /* renamed from: b */
    public final /* synthetic */ Context f7374b;

    /* renamed from: c */
    public final /* synthetic */ ReporterConfig f7375c;

    public C2275wh(C2133r0 c2133r0, Context context, ReporterConfig reporterConfig) {
        this.f7373a = c2133r0;
        this.f7374b = context;
        this.f7375c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        C2133r0 c2133r0 = this.f7373a;
        Context context = this.f7374b;
        ReporterConfig reporterConfig = this.f7375c;
        c2133r0.getClass();
        return C2108q0.m4314a(context).m4334e().mo2759c(reporterConfig);
    }
}
