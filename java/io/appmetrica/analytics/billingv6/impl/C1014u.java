package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2489f;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.billingv6.impl.u */
/* loaded from: classes.dex */
public final class C1014u implements UpdatePolicy {

    /* renamed from: a */
    public final SystemTimeProvider f4230a;

    public C1014u() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy
    public final Map<String, BillingInfo> getBillingInfoToUpdate(BillingConfig billingConfig, Map<String, ? extends BillingInfo> map, BillingInfoManager billingInfoManager) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends BillingInfo> entry : map.entrySet()) {
            BillingInfo value = entry.getValue();
            long currentTimeMillis = this.f4230a.currentTimeMillis();
            if (value.type != ProductType.INAPP || billingInfoManager.isFirstInappCheckOccurred()) {
                BillingInfo billingInfo = billingInfoManager.get(value.productId);
                if (billingInfo != null) {
                    if (AbstractC2492i.m4911a(billingInfo.purchaseToken, value.purchaseToken)) {
                        if (value.type == ProductType.SUBS && currentTimeMillis - billingInfo.sendTime >= TimeUnit.SECONDS.toMillis(billingConfig.sendFrequencySeconds)) {
                        }
                    }
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            } else if (currentTimeMillis - value.purchaseTime <= TimeUnit.SECONDS.toMillis(billingConfig.firstCollectingInappMaxAgeSeconds)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public C1014u(SystemTimeProvider systemTimeProvider) {
        this.f4230a = systemTimeProvider;
    }

    public /* synthetic */ C1014u(SystemTimeProvider systemTimeProvider, int r2, AbstractC2489f abstractC2489f) {
        this((r2 & 1) != 0 ? new SystemTimeProvider() : systemTimeProvider);
    }
}
