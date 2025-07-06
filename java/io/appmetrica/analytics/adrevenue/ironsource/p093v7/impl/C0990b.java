package io.appmetrica.analytics.adrevenue.ironsource.p093v7.impl;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AutoAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AutoAdRevenueReporter;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AutoAdType;
import java.math.BigDecimal;
import java.util.Currency;

/* renamed from: io.appmetrica.analytics.adrevenue.ironsource.v7.impl.b */
/* loaded from: classes.dex */
public final class C0990b implements ImpressionDataListener {

    /* renamed from: a */
    public final ClientContext f4164a;

    /* renamed from: b */
    public final C0989a f4165b = new C0989a();

    public C0990b(ClientContext clientContext) {
        this.f4164a = clientContext;
    }

    public final void onImpressionSuccess(ImpressionData impressionData) {
        AutoAdType autoAdType;
        if (impressionData != null) {
            AutoAdRevenueReporter autoAdRevenueReporter = this.f4164a.getAutoAdRevenueReporter();
            this.f4165b.getClass();
            double doubleValue = impressionData.getRevenue().doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                doubleValue = 0.0d;
            }
            BigDecimal valueOf = BigDecimal.valueOf(doubleValue);
            Currency currency = Currency.getInstance("USD");
            String adUnit = impressionData.getAdUnit();
            if (adUnit != null) {
                switch (adUnit) {
                    case "Rewarded Video":
                        autoAdType = AutoAdType.REWARDED;
                        break;
                    case "Interstitial":
                        autoAdType = AutoAdType.INTERSTITIAL;
                        break;
                    case "Banner":
                        autoAdType = AutoAdType.BANNER;
                        break;
                    default:
                        autoAdType = AutoAdType.OTHER;
                        break;
                }
            } else {
                autoAdType = null;
            }
            autoAdRevenueReporter.reportAutoAdRevenue(new AutoAdRevenue(valueOf, currency, autoAdType, impressionData.getAdNetwork(), null, null, null, impressionData.getPlacement(), impressionData.getPrecision(), null));
        }
    }
}
