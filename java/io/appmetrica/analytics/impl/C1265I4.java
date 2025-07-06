package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import java.util.Map;
import java.util.Objects;

/* renamed from: io.appmetrica.analytics.impl.I4 */
/* loaded from: classes.dex */
public final class C1265I4 implements ArgumentsMerger {

    /* renamed from: a */
    public final String f4838a;

    /* renamed from: b */
    public final Boolean f4839b;

    /* renamed from: c */
    public final Location f4840c;

    /* renamed from: d */
    public final Boolean f4841d;

    /* renamed from: e */
    public final Integer f4842e;

    /* renamed from: f */
    public final Integer f4843f;

    /* renamed from: g */
    public final Integer f4844g;

    /* renamed from: h */
    public final Boolean f4845h;

    /* renamed from: i */
    public final Boolean f4846i;

    /* renamed from: j */
    public final Map<String, String> f4847j;

    /* renamed from: k */
    public final Integer f4848k;

    /* renamed from: l */
    public final Boolean f4849l;

    /* renamed from: m */
    public final Boolean f4850m;

    public C1265I4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6) {
        this.f4838a = str;
        this.f4839b = bool;
        this.f4840c = location;
        this.f4841d = bool2;
        this.f4842e = num;
        this.f4843f = num2;
        this.f4844g = num3;
        this.f4845h = bool3;
        this.f4846i = bool4;
        this.f4847j = map;
        this.f4848k = num4;
        this.f4849l = bool5;
        this.f4850m = bool6;
    }

    /* renamed from: a */
    public final boolean m2949a(C1265I4 r12) {
        return equals(r12);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1265I4 mergeFrom(C1265I4 r17) {
        return new C1265I4((String) WrapUtils.getOrDefaultNullable(this.f4838a, r17.f4838a), (Boolean) WrapUtils.getOrDefaultNullable(this.f4839b, r17.f4839b), (Location) WrapUtils.getOrDefaultNullable(this.f4840c, r17.f4840c), (Boolean) WrapUtils.getOrDefaultNullable(this.f4841d, r17.f4841d), (Integer) WrapUtils.getOrDefaultNullable(this.f4842e, r17.f4842e), (Integer) WrapUtils.getOrDefaultNullable(this.f4843f, r17.f4843f), (Integer) WrapUtils.getOrDefaultNullable(this.f4844g, r17.f4844g), (Boolean) WrapUtils.getOrDefaultNullable(this.f4845h, r17.f4845h), (Boolean) WrapUtils.getOrDefaultNullable(this.f4846i, r17.f4846i), (Map) WrapUtils.getOrDefaultNullable(this.f4847j, r17.f4847j), (Integer) WrapUtils.getOrDefaultNullable(this.f4848k, r17.f4848k), (Boolean) WrapUtils.getOrDefaultNullable(this.f4849l, r17.f4849l), (Boolean) WrapUtils.getOrDefaultNullable(this.f4850m, r17.f4850m));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return equals((C1265I4) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1265I4.class != obj.getClass()) {
            return false;
        }
        C1265I4 r4 = (C1265I4) obj;
        if (Objects.equals(this.f4838a, r4.f4838a) && Objects.equals(this.f4839b, r4.f4839b) && Objects.equals(this.f4840c, r4.f4840c) && Objects.equals(this.f4841d, r4.f4841d) && Objects.equals(this.f4842e, r4.f4842e) && Objects.equals(this.f4843f, r4.f4843f) && Objects.equals(this.f4844g, r4.f4844g) && Objects.equals(this.f4845h, r4.f4845h) && Objects.equals(this.f4846i, r4.f4846i) && Objects.equals(this.f4847j, r4.f4847j) && Objects.equals(this.f4848k, r4.f4848k) && Objects.equals(this.f4849l, r4.f4849l)) {
            return Objects.equals(this.f4850m, r4.f4850m);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4838a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.f4839b;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Location location = this.f4840c;
        int hashCode3 = (hashCode2 + (location != null ? location.hashCode() : 0)) * 31;
        Boolean bool2 = this.f4841d;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Integer num = this.f4842e;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f4843f;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f4844g;
        int hashCode7 = (hashCode6 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Boolean bool3 = this.f4845h;
        int hashCode8 = (hashCode7 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.f4846i;
        int hashCode9 = (hashCode8 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Map<String, String> map = this.f4847j;
        int hashCode10 = (hashCode9 + (map != null ? map.hashCode() : 0)) * 31;
        Integer num4 = this.f4848k;
        int hashCode11 = (hashCode10 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Boolean bool5 = this.f4849l;
        int hashCode12 = (hashCode11 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        Boolean bool6 = this.f4850m;
        return hashCode12 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public C1265I4(CounterConfiguration counterConfiguration, Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled());
    }

    public C1265I4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
