package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.oh */
/* loaded from: classes.dex */
public final class RunnableC2075oh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Throwable f6862a;

    /* renamed from: b */
    public final /* synthetic */ C1353Lh f6863b;

    public RunnableC2075oh(C1353Lh c1353Lh, Throwable th) {
        this.f6863b = c1353Lh;
        this.f6862a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f6863b;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).reportUnhandledException(this.f6862a);
    }
}
