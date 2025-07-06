package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2492i;
import p108m1.AbstractC2659i;

/* renamed from: io.appmetrica.analytics.billingv6.impl.l */
/* loaded from: classes.dex */
public final class C1005l extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C1009p f4206a;

    /* renamed from: b */
    public final /* synthetic */ BillingResult f4207b;

    /* renamed from: c */
    public final /* synthetic */ List f4208c;

    public C1005l(C1009p c1009p, BillingResult billingResult, List list) {
        this.f4206a = c1009p;
        this.f4207b = billingResult;
        this.f4208c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C1009p c1009p = this.f4206a;
        BillingResult billingResult = this.f4207b;
        List<PurchaseHistoryRecord> list = this.f4208c;
        c1009p.getClass();
        if (billingResult.getResponseCode() == 0 && list != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                for (String str : purchaseHistoryRecord.getProducts()) {
                    String str2 = c1009p.f4220d;
                    BillingInfo billingInfo = new BillingInfo(AbstractC2492i.m4911a(str2, "inapp") ? ProductType.INAPP : AbstractC2492i.m4911a(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = c1009p.f4219c.getUpdatePolicy().getBillingInfoToUpdate(c1009p.f4217a, linkedHashMap, c1009p.f4219c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                C1013t.m2656a(linkedHashMap, billingInfoToUpdate, c1009p.f4220d, c1009p.f4219c.getBillingInfoManager());
            } else {
                List m5118h0 = AbstractC2659i.m5118h0(billingInfoToUpdate.keySet());
                C1006m c1006m = new C1006m(linkedHashMap, billingInfoToUpdate, c1009p);
                String str3 = c1009p.f4220d;
                BillingClient billingClient = c1009p.f4218b;
                UtilsProvider utilsProvider = c1009p.f4219c;
                C1000g c1000g = c1009p.f4221e;
                C1004k c1004k = new C1004k(str3, billingClient, utilsProvider, c1006m, list, c1000g);
                c1000g.f4192c.add(c1004k);
                c1009p.f4219c.getUiExecutor().execute(new C1008o(c1009p, m5118h0, c1004k));
            }
        }
        C1009p c1009p2 = this.f4206a;
        c1009p2.f4221e.m2655a(c1009p2);
    }
}
