package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* renamed from: io.appmetrica.analytics.impl.yh */
/* loaded from: classes.dex */
public final class RunnableC2325yh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ReporterConfig f7500a;

    /* renamed from: b */
    public final /* synthetic */ C1353Lh f7501b;

    public RunnableC2325yh(C1353Lh c1353Lh, ReporterConfig reporterConfig) {
        this.f7501b = c1353Lh;
        this.f7500a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f7501b;
        ReporterConfig reporterConfig = this.f7500a;
        C2133r0 c2133r0 = c1353Lh.f5004a;
        Context context = c1353Lh.f5007d;
        c2133r0.getClass();
        C2108q0.m4314a(context).m4334e().mo2755a(reporterConfig);
    }
}
