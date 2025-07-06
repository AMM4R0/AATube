package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p108m1.AbstractC2659i;

/* renamed from: io.appmetrica.analytics.billingv6.impl.e */
/* loaded from: classes.dex */
public final class C0998e implements BillingInfoManager {

    /* renamed from: a */
    public final BillingInfoStorage f4186a;

    /* renamed from: b */
    public boolean f4187b;

    /* renamed from: c */
    public final LinkedHashMap f4188c;

    public C0998e(BillingInfoStorage billingInfoStorage) {
        this.f4186a = billingInfoStorage;
        this.f4187b = billingInfoStorage.isFirstInappCheckOccurred();
        List<BillingInfo> billingInfo = billingInfoStorage.getBillingInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : billingInfo) {
            linkedHashMap.put(((BillingInfo) obj).productId, obj);
        }
        this.f4188c = linkedHashMap;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final BillingInfo get(String str) {
        return (BillingInfo) this.f4188c.get(str);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final boolean isFirstInappCheckOccurred() {
        return this.f4187b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void markFirstInappCheckOccurred() {
        if (this.f4187b) {
            return;
        }
        this.f4187b = true;
        this.f4186a.saveInfo(AbstractC2659i.m5118h0(this.f4188c.values()), this.f4187b);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void update(Map<String, ? extends BillingInfo> map) {
        for (BillingInfo billingInfo : map.values()) {
            this.f4188c.put(billingInfo.productId, billingInfo);
        }
        this.f4186a.saveInfo(AbstractC2659i.m5118h0(this.f4188c.values()), this.f4187b);
    }
}
