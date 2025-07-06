package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.QueryPurchaseHistoryParams;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.c */
/* loaded from: classes.dex */
public final class C0996c extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C0997d f4179a;

    /* renamed from: b */
    public final /* synthetic */ String f4180b;

    /* renamed from: c */
    public final /* synthetic */ C1009p f4181c;

    public C0996c(C0997d c0997d, String str, C1009p c1009p) {
        this.f4179a = c0997d;
        this.f4180b = str;
        this.f4181c = c1009p;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        if (this.f4179a.f4183b.isReady()) {
            this.f4179a.f4183b.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType(this.f4180b).build(), this.f4181c);
        } else {
            this.f4179a.f4184c.getWorkerExecutor().execute(new C0995b(this.f4179a, this.f4181c));
        }
    }
}
