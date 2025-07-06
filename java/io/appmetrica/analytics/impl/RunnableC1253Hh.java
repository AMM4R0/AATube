package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Hh */
/* loaded from: classes.dex */
public final class RunnableC1253Hh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1353Lh f4824a;

    public RunnableC1253Hh(C1353Lh c1353Lh) {
        this.f4824a = c1353Lh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f4824a;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).clearAppEnvironment();
    }
}
