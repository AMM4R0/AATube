package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qh */
/* loaded from: classes.dex */
public final class RunnableC2125qh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1353Lh f6998a;

    public RunnableC2125qh(C1353Lh c1353Lh) {
        this.f6998a = c1353Lh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f6998a;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).pauseSession();
    }
}
