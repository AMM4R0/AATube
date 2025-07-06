package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.b */
/* loaded from: classes.dex */
public final class C0995b extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C0997d f4177a;

    /* renamed from: b */
    public final /* synthetic */ C1009p f4178b;

    public C0995b(C0997d c0997d, C1009p c1009p) {
        this.f4177a = c0997d;
        this.f4178b = c1009p;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f4177a.f4185d.m2655a(this.f4178b);
    }
}
