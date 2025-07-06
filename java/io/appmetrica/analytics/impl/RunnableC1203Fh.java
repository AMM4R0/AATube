package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Fh */
/* loaded from: classes.dex */
public final class RunnableC1203Fh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1353Lh f4735a;

    public RunnableC1203Fh(C1353Lh c1353Lh) {
        this.f4735a = c1353Lh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f4735a;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).sendEventsBuffer();
    }
}
