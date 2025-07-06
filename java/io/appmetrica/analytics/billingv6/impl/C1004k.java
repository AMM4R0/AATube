package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import p131u1.InterfaceC2799a;

/* renamed from: io.appmetrica.analytics.billingv6.impl.k */
/* loaded from: classes.dex */
public final class C1004k implements ProductDetailsResponseListener {

    /* renamed from: a */
    public final String f4200a;

    /* renamed from: b */
    public final BillingClient f4201b;

    /* renamed from: c */
    public final UtilsProvider f4202c;

    /* renamed from: d */
    public final InterfaceC2799a f4203d;

    /* renamed from: e */
    public final List f4204e;

    /* renamed from: f */
    public final C1000g f4205f;

    public C1004k(String str, BillingClient billingClient, UtilsProvider utilsProvider, C1006m c1006m, List list, C1000g c1000g) {
        this.f4200a = str;
        this.f4201b = billingClient;
        this.f4202c = utilsProvider;
        this.f4203d = c1006m;
        this.f4204e = list;
        this.f4205f = c1000g;
    }

    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        this.f4202c.getWorkerExecutor().execute(new C1001h(this, billingResult, list));
    }
}
