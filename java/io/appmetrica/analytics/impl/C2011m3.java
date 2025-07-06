package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.m3 */
/* loaded from: classes.dex */
public final class C2011m3 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ ProductInfo f6682a;

    /* renamed from: b */
    public final /* synthetic */ C2036n3 f6683b;

    public C2011m3(C2036n3 c2036n3, ProductInfo productInfo) {
        this.f6683b = c2036n3;
        this.f6682a = productInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        ((C2013m5) this.f6683b.f6795a).mo3169a(C1615W5.m3463a(new C1873gf(this.f6682a)));
    }
}
