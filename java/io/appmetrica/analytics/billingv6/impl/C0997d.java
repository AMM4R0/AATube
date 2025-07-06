package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$onSessionResumed$1$runSafety$1;

/* renamed from: io.appmetrica.analytics.billingv6.impl.d */
/* loaded from: classes.dex */
public final class C0997d implements BillingClientStateListener {

    /* renamed from: a */
    public final BillingConfig f4182a;

    /* renamed from: b */
    public final BillingClient f4183b;

    /* renamed from: c */
    public final UtilsProvider f4184c;

    /* renamed from: d */
    public final C1000g f4185d;

    public C0997d(BillingConfig billingConfig, BillingClient billingClient, BillingLibraryMonitor$onSessionResumed$1$runSafety$1 billingLibraryMonitor$onSessionResumed$1$runSafety$1, C1000g c1000g) {
        this.f4182a = billingConfig;
        this.f4183b = billingClient;
        this.f4184c = billingLibraryMonitor$onSessionResumed$1$runSafety$1;
        this.f4185d = c1000g;
    }

    public final void onBillingServiceDisconnected() {
    }

    public final void onBillingSetupFinished(BillingResult billingResult) {
        this.f4184c.getWorkerExecutor().execute(new C0994a(this, billingResult));
    }
}
