package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.nh */
/* loaded from: classes.dex */
public final class RunnableC2050nh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f6819a;

    /* renamed from: b */
    public final /* synthetic */ String f6820b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f6821c;

    /* renamed from: d */
    public final /* synthetic */ C1353Lh f6822d;

    public RunnableC2050nh(C1353Lh c1353Lh, String str, String str2, Throwable th) {
        this.f6822d = c1353Lh;
        this.f6819a = str;
        this.f6820b = str2;
        this.f6821c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f6822d;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).reportError(this.f6819a, this.f6820b, this.f6821c);
    }
}
