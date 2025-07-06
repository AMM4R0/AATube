package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC2356zn;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;

/* loaded from: classes.dex */
public class AdRevenue {
    public final String adNetwork;
    public final String adPlacementId;
    public final String adPlacementName;
    public final BigDecimal adRevenue;
    public final AdType adType;
    public final String adUnitId;
    public final String adUnitName;
    public final Currency currency;
    public final Map<String, String> payload;
    public final String precision;

    public static class Builder {

        /* renamed from: a */
        private final BigDecimal f4068a;

        /* renamed from: b */
        private final Currency f4069b;

        /* renamed from: c */
        private AdType f4070c;

        /* renamed from: d */
        private String f4071d;

        /* renamed from: e */
        private String f4072e;

        /* renamed from: f */
        private String f4073f;

        /* renamed from: g */
        private String f4074g;

        /* renamed from: h */
        private String f4075h;

        /* renamed from: i */
        private String f4076i;

        /* renamed from: j */
        private Map f4077j;

        public /* synthetic */ Builder(BigDecimal bigDecimal, Currency currency, int r3) {
            this(bigDecimal, currency);
        }

        public AdRevenue build() {
            return new AdRevenue(this.f4068a, this.f4069b, this.f4070c, this.f4071d, this.f4072e, this.f4073f, this.f4074g, this.f4075h, this.f4076i, this.f4077j, 0);
        }

        public Builder withAdNetwork(String str) {
            this.f4071d = str;
            return this;
        }

        public Builder withAdPlacementId(String str) {
            this.f4074g = str;
            return this;
        }

        public Builder withAdPlacementName(String str) {
            this.f4075h = str;
            return this;
        }

        public Builder withAdType(AdType adType) {
            this.f4070c = adType;
            return this;
        }

        public Builder withAdUnitId(String str) {
            this.f4072e = str;
            return this;
        }

        public Builder withAdUnitName(String str) {
            this.f4073f = str;
            return this;
        }

        public Builder withPayload(Map<String, String> map) {
            this.f4077j = map == null ? null : CollectionUtils.copyOf(map);
            return this;
        }

        public Builder withPrecision(String str) {
            this.f4076i = str;
            return this;
        }

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.f4068a = bigDecimal;
            this.f4069b = currency;
        }
    }

    public /* synthetic */ AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map, int r11) {
        this(bigDecimal, currency, adType, str, str2, str3, str4, str5, str6, map);
    }

    public static Builder newBuilder(BigDecimal bigDecimal, Currency currency) {
        return new Builder(bigDecimal, currency, 0);
    }

    private AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.adRevenue = bigDecimal;
        this.currency = currency;
        this.adType = adType;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        this.payload = map == null ? null : CollectionUtils.unmodifiableMapCopy(map);
    }

    public static Builder newBuilder(long j2, Currency currency) {
        return new Builder(AbstractC2356zn.m4697a(j2), currency, 0);
    }

    public static Builder newBuilder(double d2, Currency currency) {
        return new Builder(new BigDecimal(AbstractC2356zn.m4695a(d2)), currency, 0);
    }
}
