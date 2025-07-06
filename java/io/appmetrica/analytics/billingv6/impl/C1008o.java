package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.QueryProductDetailsParams;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p108m1.AbstractC2661k;

/* renamed from: io.appmetrica.analytics.billingv6.impl.o */
/* loaded from: classes.dex */
public final class C1008o extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C1009p f4214a;

    /* renamed from: b */
    public final /* synthetic */ List f4215b;

    /* renamed from: c */
    public final /* synthetic */ C1004k f4216c;

    public C1008o(C1009p c1009p, List list, C1004k c1004k) {
        this.f4214a = c1009p;
        this.f4215b = list;
        this.f4216c = c1004k;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        if (!this.f4214a.f4218b.isReady()) {
            this.f4214a.f4219c.getWorkerExecutor().execute(new C1007n(this.f4214a, this.f4216c));
            return;
        }
        BillingClient billingClient = this.f4214a.f4218b;
        QueryProductDetailsParams.Builder newBuilder = QueryProductDetailsParams.newBuilder();
        List list = this.f4215b;
        C1009p c1009p = this.f4214a;
        ArrayList arrayList = new ArrayList(AbstractC2661k.m5122Z(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(c1009p.f4220d).build());
        }
        billingClient.queryProductDetailsAsync(newBuilder.setProductList(arrayList).build(), this.f4216c);
    }
}
