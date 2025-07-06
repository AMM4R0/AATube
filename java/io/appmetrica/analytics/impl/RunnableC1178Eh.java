package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Eh */
/* loaded from: classes.dex */
public final class RunnableC1178Eh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1559U f4700a;

    /* renamed from: b */
    public final /* synthetic */ C1353Lh f4701b;

    public RunnableC1178Eh(C1353Lh c1353Lh, C1559U c1559u) {
        this.f4701b = c1353Lh;
        this.f4700a = c1559u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f4701b;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).mo3055a(this.f4700a);
    }
}
