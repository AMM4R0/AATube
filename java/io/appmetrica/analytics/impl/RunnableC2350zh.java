package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* renamed from: io.appmetrica.analytics.impl.zh */
/* loaded from: classes.dex */
public final class RunnableC2350zh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ReporterConfig f7529a;

    /* renamed from: b */
    public final /* synthetic */ C1353Lh f7530b;

    public RunnableC2350zh(C1353Lh c1353Lh, ReporterConfig reporterConfig) {
        this.f7530b = c1353Lh;
        this.f7529a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f7530b;
        ReporterConfig reporterConfig = this.f7529a;
        C2133r0 c2133r0 = c1353Lh.f5004a;
        Context context = c1353Lh.f5007d;
        c2133r0.getClass();
        C2108q0.m4314a(context).m4334e().mo2755a(reporterConfig);
    }
}
