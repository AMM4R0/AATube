package io.appmetrica.analytics.impl;

import androidx.fragment.app.C0665o;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AdType;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AutoAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AutoAdRevenueReporter;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AutoAdType;

/* renamed from: io.appmetrica.analytics.impl.e0 */
/* loaded from: classes.dex */
public final class C1808e0 implements AutoAdRevenueReporter {

    /* renamed from: a */
    public final C2260w2 f6113a = new C2260w2();

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AutoAdRevenueReporter
    public final void reportAutoAdRevenue(AutoAdRevenue autoAdRevenue) {
        AdType adType;
        this.f6113a.getClass();
        AdRevenue.Builder newBuilder = AdRevenue.newBuilder(autoAdRevenue.getAdRevenue(), autoAdRevenue.getCurrency());
        AutoAdType adType2 = autoAdRevenue.getAdType();
        switch (adType2 == null ? -1 : AbstractC2235v2.f7255a[adType2.ordinal()]) {
            case -1:
                adType = null;
                break;
            case 0:
            default:
                throw new C0665o();
            case 1:
                adType = AdType.NATIVE;
                break;
            case 2:
                adType = AdType.BANNER;
                break;
            case 3:
                adType = AdType.REWARDED;
                break;
            case 4:
                adType = AdType.INTERSTITIAL;
                break;
            case 5:
                adType = AdType.MREC;
                break;
            case 6:
                adType = AdType.OTHER;
                break;
        }
        ModulesFacade.reportAdRevenue(newBuilder.withAdType(adType).withAdNetwork(autoAdRevenue.getAdNetwork()).withAdUnitId(autoAdRevenue.getAdUnitId()).withAdUnitName(autoAdRevenue.getAdUnitName()).withAdPlacementId(autoAdRevenue.getAdPlacementId()).withAdPlacementName(autoAdRevenue.getAdPlacementName()).withPrecision(autoAdRevenue.getPrecision()).withPayload(autoAdRevenue.getPayload()).build());
    }
}
