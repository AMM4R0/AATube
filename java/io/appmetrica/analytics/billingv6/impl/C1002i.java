package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.i */
/* loaded from: classes.dex */
public final class C1002i extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C1004k f4196a;

    /* renamed from: b */
    public final /* synthetic */ C1011r f4197b;

    public C1002i(C1004k c1004k, C1011r c1011r) {
        this.f4196a = c1004k;
        this.f4197b = c1011r;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f4196a.f4205f.m2655a(this.f4197b);
    }
}
