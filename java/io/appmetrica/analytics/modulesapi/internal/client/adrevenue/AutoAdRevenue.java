package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2489f;

/* loaded from: classes.dex */
public final class AutoAdRevenue {

    /* renamed from: a */
    private final BigDecimal f7645a;

    /* renamed from: b */
    private final Currency f7646b;

    /* renamed from: c */
    private final AutoAdType f7647c;

    /* renamed from: d */
    private final String f7648d;

    /* renamed from: e */
    private final String f7649e;

    /* renamed from: f */
    private final String f7650f;

    /* renamed from: g */
    private final String f7651g;

    /* renamed from: h */
    private final String f7652h;

    /* renamed from: i */
    private final String f7653i;

    /* renamed from: j */
    private final Map f7654j;

    public AutoAdRevenue(BigDecimal bigDecimal, Currency currency, AutoAdType autoAdType, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.f7645a = bigDecimal;
        this.f7646b = currency;
        this.f7647c = autoAdType;
        this.f7648d = str;
        this.f7649e = str2;
        this.f7650f = str3;
        this.f7651g = str4;
        this.f7652h = str5;
        this.f7653i = str6;
        this.f7654j = map;
    }

    public final String getAdNetwork() {
        return this.f7648d;
    }

    public final String getAdPlacementId() {
        return this.f7651g;
    }

    public final String getAdPlacementName() {
        return this.f7652h;
    }

    public final BigDecimal getAdRevenue() {
        return this.f7645a;
    }

    public final AutoAdType getAdType() {
        return this.f7647c;
    }

    public final String getAdUnitId() {
        return this.f7649e;
    }

    public final String getAdUnitName() {
        return this.f7650f;
    }

    public final Currency getCurrency() {
        return this.f7646b;
    }

    public final Map<String, String> getPayload() {
        return this.f7654j;
    }

    public final String getPrecision() {
        return this.f7653i;
    }

    public /* synthetic */ AutoAdRevenue(BigDecimal bigDecimal, Currency currency, AutoAdType autoAdType, String str, String str2, String str3, String str4, String str5, String str6, Map map, int r25, AbstractC2489f abstractC2489f) {
        this(bigDecimal, currency, (r25 & 4) != 0 ? null : autoAdType, (r25 & 8) != 0 ? null : str, (r25 & 16) != 0 ? null : str2, (r25 & 32) != 0 ? null : str3, (r25 & 64) != 0 ? null : str4, (r25 & 128) != 0 ? null : str5, (r25 & 256) != 0 ? null : str6, (r25 & 512) != 0 ? null : map);
    }
}
