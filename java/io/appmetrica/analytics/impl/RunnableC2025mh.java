package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.mh */
/* loaded from: classes.dex */
public final class RunnableC2025mh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f6766a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f6767b;

    /* renamed from: c */
    public final /* synthetic */ C1353Lh f6768c;

    public RunnableC2025mh(C1353Lh c1353Lh, String str, Throwable th) {
        this.f6768c = c1353Lh;
        this.f6766a = str;
        this.f6767b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f6768c;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).reportError(this.f6766a, this.f6767b);
    }
}
