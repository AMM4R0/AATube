package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$onSessionResumed$1$runSafety$1;
import java.util.LinkedHashSet;

/* renamed from: io.appmetrica.analytics.billingv6.impl.g */
/* loaded from: classes.dex */
public final class C1000g {

    /* renamed from: a */
    public final BillingClient f4190a;

    /* renamed from: b */
    public final UtilsProvider f4191b;

    /* renamed from: c */
    public final LinkedHashSet f4192c = new LinkedHashSet();

    public C1000g(BillingClient billingClient, BillingLibraryMonitor$onSessionResumed$1$runSafety$1 billingLibraryMonitor$onSessionResumed$1$runSafety$1) {
        this.f4190a = billingClient;
        this.f4191b = billingLibraryMonitor$onSessionResumed$1$runSafety$1;
    }

    /* renamed from: a */
    public final void m2655a(Object obj) {
        this.f4192c.remove(obj);
        if (this.f4192c.size() == 0) {
            this.f4191b.getUiExecutor().execute(new C0999f(this));
        }
    }
}
