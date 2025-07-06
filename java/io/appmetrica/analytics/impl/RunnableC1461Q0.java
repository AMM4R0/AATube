package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.Q0 */
/* loaded from: classes.dex */
public final class RunnableC1461Q0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Revenue f5235a;

    /* renamed from: b */
    public final /* synthetic */ C2009m1 f5236b;

    public RunnableC1461Q0(C2009m1 c2009m1, Revenue revenue) {
        this.f5236b = c2009m1;
        this.f5235a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2009m1.m4119a(this.f5236b).reportRevenue(this.f5235a);
    }
}
