package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import p131u1.InterfaceC2799a;

/* renamed from: io.appmetrica.analytics.billingv6.impl.r */
/* loaded from: classes.dex */
public final class C1011r implements PurchasesResponseListener {

    /* renamed from: a */
    public final UtilsProvider f4225a;

    /* renamed from: b */
    public final InterfaceC2799a f4226b;

    /* renamed from: c */
    public final List f4227c;

    /* renamed from: d */
    public final List f4228d;

    /* renamed from: e */
    public final C1000g f4229e;

    public C1011r(UtilsProvider utilsProvider, InterfaceC2799a interfaceC2799a, List list, List list2, C1000g c1000g) {
        this.f4225a = utilsProvider;
        this.f4226b = interfaceC2799a;
        this.f4227c = list;
        this.f4228d = list2;
        this.f4229e = c1000g;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f4225a.getWorkerExecutor().execute(new C1010q(this, billingResult, list));
    }
}
