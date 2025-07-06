package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.f */
/* loaded from: classes.dex */
public final class C0999f extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C1000g f4189a;

    public C0999f(C1000g c1000g) {
        this.f4189a = c1000g;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f4189a.f4190a.endConnection();
    }
}
