package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Gh */
/* loaded from: classes.dex */
public final class RunnableC1228Gh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f4798a;

    /* renamed from: b */
    public final /* synthetic */ String f4799b;

    /* renamed from: c */
    public final /* synthetic */ C1353Lh f4800c;

    public RunnableC1228Gh(C1353Lh c1353Lh, String str, String str2) {
        this.f4800c = c1353Lh;
        this.f4798a = str;
        this.f4799b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f4800c;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).putAppEnvironmentValue(this.f4798a, this.f4799b);
    }
}
