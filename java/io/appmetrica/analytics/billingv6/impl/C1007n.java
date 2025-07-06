package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.n */
/* loaded from: classes.dex */
public final class C1007n extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C1009p f4212a;

    /* renamed from: b */
    public final /* synthetic */ C1004k f4213b;

    public C1007n(C1009p c1009p, C1004k c1004k) {
        this.f4212a = c1009p;
        this.f4213b = c1004k;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f4212a.f4221e.m2655a(this.f4213b);
    }
}
