package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.Ch */
/* loaded from: classes.dex */
public final class RunnableC1128Ch implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdRevenue f4582a;

    /* renamed from: b */
    public final /* synthetic */ boolean f4583b;

    /* renamed from: c */
    public final /* synthetic */ C1353Lh f4584c;

    public RunnableC1128Ch(C1353Lh c1353Lh, AdRevenue adRevenue, boolean z2) {
        this.f4584c = c1353Lh;
        this.f4582a = adRevenue;
        this.f4583b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1353Lh c1353Lh = this.f4584c;
        C1353Lh.m3053a(c1353Lh.f5004a, c1353Lh.f5007d, c1353Lh.f5008e).reportAdRevenue(this.f4582a, this.f4583b);
    }
}
