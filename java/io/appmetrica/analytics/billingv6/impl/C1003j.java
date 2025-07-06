package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.j */
/* loaded from: classes.dex */
public final class C1003j extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C1004k f4198a;

    /* renamed from: b */
    public final /* synthetic */ C1011r f4199b;

    public C1003j(C1004k c1004k, C1011r c1011r) {
        this.f4198a = c1004k;
        this.f4199b = c1011r;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        if (this.f4198a.f4201b.isReady()) {
            this.f4198a.f4201b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(this.f4198a.f4200a).build(), this.f4199b);
        } else {
            this.f4198a.f4202c.getWorkerExecutor().execute(new C1002i(this.f4198a, this.f4199b));
        }
    }
}
