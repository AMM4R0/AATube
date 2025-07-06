package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.R0 */
/* loaded from: classes.dex */
public final class RunnableC1485R0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdRevenue f5268a;

    /* renamed from: b */
    public final /* synthetic */ C2009m1 f5269b;

    public RunnableC1485R0(C2009m1 c2009m1, AdRevenue adRevenue) {
        this.f5269b = c2009m1;
        this.f5268a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2009m1.m4119a(this.f5269b).reportAdRevenue(this.f5268a);
    }
}
