package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* renamed from: io.appmetrica.analytics.billingv6.impl.p */
/* loaded from: classes.dex */
public final class C1009p implements PurchaseHistoryResponseListener {

    /* renamed from: a */
    public final BillingConfig f4217a;

    /* renamed from: b */
    public final BillingClient f4218b;

    /* renamed from: c */
    public final UtilsProvider f4219c;

    /* renamed from: d */
    public final String f4220d;

    /* renamed from: e */
    public final C1000g f4221e;

    public C1009p(BillingConfig billingConfig, BillingClient billingClient, UtilsProvider utilsProvider, String str, C1000g c1000g) {
        this.f4217a = billingConfig;
        this.f4218b = billingClient;
        this.f4219c = utilsProvider;
        this.f4220d = str;
        this.f4221e = c1000g;
    }

    public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        this.f4219c.getWorkerExecutor().execute(new C1005l(this, billingResult, list));
    }
}
