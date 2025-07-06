package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* renamed from: io.appmetrica.analytics.impl.U0 */
/* loaded from: classes.dex */
public final class RunnableC1560U0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DeferredDeeplinkListener f5511a;

    /* renamed from: b */
    public final /* synthetic */ C2009m1 f5512b;

    public RunnableC1560U0(C2009m1 c2009m1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f5512b = c2009m1;
        this.f5511a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5512b.f6673a.getClass();
        C2108q0 c2108q0 = C2108q0.f6954f;
        c2108q0.m4334e().mo2753a(this.f5511a);
    }
}
