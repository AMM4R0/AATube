package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Ih */
/* loaded from: classes.dex */
public final class RunnableC1278Ih implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f4871a;

    /* renamed from: b */
    public final /* synthetic */ C1353Lh f4872b;

    public RunnableC1278Ih(C1353Lh c1353Lh, String str) {
        this.f4872b = c1353Lh;
        this.f4871a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f4872b;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).reportEvent(this.f4871a);
    }
}
