package io.appmetrica.analytics.adrevenue.fyber.p092v3.impl;

import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.PlacementType;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AutoAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AutoAdRevenueReporter;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AutoAdType;
import java.math.BigDecimal;
import java.util.Currency;

/* renamed from: io.appmetrica.analytics.adrevenue.fyber.v3.impl.c */
/* loaded from: classes.dex */
public final class C0987c implements InterstitialListener {

    /* renamed from: a */
    public final ClientContext f4161a;

    /* renamed from: b */
    public final C0986b f4162b = new C0986b();

    public C0987c(ClientContext clientContext) {
        this.f4161a = clientContext;
    }

    public final void onAvailable(String str) {
    }

    public final void onClick(String str) {
    }

    public final void onHide(String str) {
    }

    public final void onRequestStart(String str, String str2) {
    }

    public final void onShow(String str, ImpressionData impressionData) {
        AutoAdType autoAdType;
        if (impressionData != null) {
            AutoAdRevenueReporter autoAdRevenueReporter = this.f4161a.getAutoAdRevenueReporter();
            this.f4162b.getClass();
            double netPayout = impressionData.getNetPayout();
            if (Double.isNaN(netPayout) || Double.isInfinite(netPayout)) {
                netPayout = 0.0d;
            }
            BigDecimal valueOf = BigDecimal.valueOf(netPayout);
            Currency currency = Currency.getInstance(impressionData.getCurrency());
            PlacementType placementType = impressionData.getPlacementType();
            if (placementType == null) {
                autoAdType = null;
            } else {
                int r12 = AbstractC0985a.f4160a[placementType.ordinal()];
                autoAdType = r12 != 1 ? r12 != 2 ? r12 != 3 ? AutoAdType.OTHER : AutoAdType.INTERSTITIAL : AutoAdType.REWARDED : AutoAdType.BANNER;
            }
            autoAdRevenueReporter.reportAutoAdRevenue(new AutoAdRevenue(valueOf, currency, autoAdType, impressionData.getDemandSource(), impressionData.getCreativeId(), null, null, null, impressionData.getPriceAccuracy().toString(), null));
        }
    }

    public final void onShowFailure(String str, ImpressionData impressionData) {
    }

    public final void onUnavailable(String str) {
    }
}
