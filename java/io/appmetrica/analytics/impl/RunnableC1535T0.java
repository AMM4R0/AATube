package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* renamed from: io.appmetrica.analytics.impl.T0 */
/* loaded from: classes.dex */
public final class RunnableC1535T0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DeferredDeeplinkParametersListener f5451a;

    /* renamed from: b */
    public final /* synthetic */ C2009m1 f5452b;

    public RunnableC1535T0(C2009m1 c2009m1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f5452b = c2009m1;
        this.f5451a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5452b.f6673a.getClass();
        C2108q0 c2108q0 = C2108q0.f6954f;
        c2108q0.m4334e().mo2754a(this.f5451a);
    }
}
