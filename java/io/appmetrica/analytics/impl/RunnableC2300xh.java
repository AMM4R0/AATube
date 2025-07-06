package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.xh */
/* loaded from: classes.dex */
public final class RunnableC2300xh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f7459a;

    /* renamed from: b */
    public final /* synthetic */ C1353Lh f7460b;

    public RunnableC2300xh(C1353Lh c1353Lh, boolean z2) {
        this.f7460b = c1353Lh;
        this.f7459a = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f7460b;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).setDataSendingEnabled(this.f7459a);
    }
}
