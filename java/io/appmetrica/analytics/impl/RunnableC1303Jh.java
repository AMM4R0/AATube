package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Jh */
/* loaded from: classes.dex */
public final class RunnableC1303Jh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f4922a;

    /* renamed from: b */
    public final /* synthetic */ String f4923b;

    /* renamed from: c */
    public final /* synthetic */ C1353Lh f4924c;

    public RunnableC1303Jh(C1353Lh c1353Lh, String str, String str2) {
        this.f4924c = c1353Lh;
        this.f4922a = str;
        this.f4923b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f4924c;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).reportEvent(this.f4922a, this.f4923b);
    }
}
