package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.rh */
/* loaded from: classes.dex */
public final class RunnableC2150rh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f7065a;

    /* renamed from: b */
    public final /* synthetic */ C1353Lh f7066b;

    public RunnableC2150rh(C1353Lh c1353Lh, String str) {
        this.f7066b = c1353Lh;
        this.f7065a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f7066b;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).setUserProfileID(this.f7065a);
    }
}
