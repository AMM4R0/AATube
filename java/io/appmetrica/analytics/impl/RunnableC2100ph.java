package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ph */
/* loaded from: classes.dex */
public final class RunnableC2100ph implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1353Lh f6916a;

    public RunnableC2100ph(C1353Lh c1353Lh) {
        this.f6916a = c1353Lh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f6916a;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).resumeSession();
    }
}
