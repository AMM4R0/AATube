package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.O0 */
/* loaded from: classes.dex */
public final class RunnableC1411O0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f5143a;

    /* renamed from: b */
    public final /* synthetic */ AppMetricaConfig f5144b;

    /* renamed from: c */
    public final /* synthetic */ C2009m1 f5145c;

    public RunnableC1411O0(C2009m1 c2009m1, Context context, AppMetricaConfig appMetricaConfig) {
        this.f5145c = c2009m1;
        this.f5143a = context;
        this.f5144b = appMetricaConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2133r0 c2133r0 = this.f5145c.f6673a;
        Context applicationContext = this.f5143a.getApplicationContext();
        c2133r0.getClass();
        C2108q0 m4314a = C2108q0.m4314a(applicationContext);
        AppMetricaConfig appMetricaConfig = this.f5144b;
        m4314a.m4334e().mo2752a(appMetricaConfig, this.f5145c.f6677e.m2892a(appMetricaConfig));
    }
}
