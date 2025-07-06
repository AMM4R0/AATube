package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Mg */
/* loaded from: classes.dex */
public final class C1377Mg extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a */
    public final String f5067a;

    /* renamed from: b */
    public final Location f5068b;

    /* renamed from: c */
    public final boolean f5069c;

    /* renamed from: d */
    public final boolean f5070d;

    /* renamed from: e */
    public final int f5071e;

    /* renamed from: f */
    public final int f5072f;

    /* renamed from: g */
    public final int f5073g;

    /* renamed from: h */
    public final boolean f5074h;

    /* renamed from: i */
    public final boolean f5075i;

    /* renamed from: j */
    public final Map<String, String> f5076j;

    /* renamed from: k */
    public final int f5077k;

    public C1377Mg(C1265I4 r13) {
        this(r13.f4838a, r13.f4839b, r13.f4840c, r13.f4841d, r13.f4842e, r13.f4843f, r13.f4844g, r13.f4845h, r13.f4846i, r13.f4847j, r13.f4848k);
    }

    /* renamed from: a */
    public static C1377Mg m3091a() {
        return new C1377Mg(null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1377Mg mergeFrom(C1265I4 r14) {
        return new C1377Mg((String) WrapUtils.getOrDefaultNullable(r14.f4838a, this.f5067a), (Boolean) WrapUtils.getOrDefaultNullable(r14.f4839b, Boolean.valueOf(this.f5069c)), (Location) WrapUtils.getOrDefaultNullable(r14.f4840c, this.f5068b), (Boolean) WrapUtils.getOrDefaultNullable(r14.f4841d, Boolean.valueOf(this.f5070d)), (Integer) WrapUtils.getOrDefaultNullable(r14.f4842e, Integer.valueOf(this.f5071e)), (Integer) WrapUtils.getOrDefaultNullable(r14.f4843f, Integer.valueOf(this.f5072f)), (Integer) WrapUtils.getOrDefaultNullable(r14.f4844g, Integer.valueOf(this.f5073g)), (Boolean) WrapUtils.getOrDefaultNullable(r14.f4845h, Boolean.valueOf(this.f5074h)), (Boolean) WrapUtils.getOrDefaultNullable(r14.f4846i, Boolean.valueOf(this.f5075i)), (Map) WrapUtils.getOrDefaultNullable(r14.f4847j, this.f5076j), (Integer) WrapUtils.getOrDefaultNullable(r14.f4848k, Integer.valueOf(this.f5077k)));
    }

    public C1377Mg(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.f5067a = str;
        Boolean bool5 = Boolean.FALSE;
        this.f5069c = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.f5068b = location;
        this.f5070d = ((Boolean) WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.f5071e = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.f5072f = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f5073g = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.f5074h = ((Boolean) WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.f5075i = ((Boolean) WrapUtils.getOrDefault(bool4, Boolean.TRUE)).booleanValue();
        this.f5076j = map;
        this.f5077k = ((Integer) WrapUtils.getOrDefault(num4, Integer.valueOf(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT))).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(C1265I4 r7) {
        Location location;
        float verticalAccuracyMeters;
        float verticalAccuracyMeters2;
        float speedAccuracyMetersPerSecond;
        float speedAccuracyMetersPerSecond2;
        float bearingAccuracyDegrees;
        float bearingAccuracyDegrees2;
        Map<String, String> map;
        String str;
        Boolean bool = r7.f4839b;
        if (bool != null && this.f5069c != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = r7.f4841d;
        if (bool2 != null && this.f5070d != bool2.booleanValue()) {
            return false;
        }
        Integer num = r7.f4842e;
        if (num != null && this.f5071e != num.intValue()) {
            return false;
        }
        Integer num2 = r7.f4843f;
        if (num2 != null && this.f5072f != num2.intValue()) {
            return false;
        }
        Integer num3 = r7.f4844g;
        if (num3 != null && this.f5073g != num3.intValue()) {
            return false;
        }
        Boolean bool3 = r7.f4845h;
        if (bool3 != null && this.f5074h != bool3.booleanValue()) {
            return false;
        }
        Boolean bool4 = r7.f4846i;
        if (bool4 != null && this.f5075i != bool4.booleanValue()) {
            return false;
        }
        String str2 = r7.f4838a;
        if (str2 != null && ((str = this.f5067a) == null || !str.equals(str2))) {
            return false;
        }
        Map<String, String> map2 = r7.f4847j;
        if (map2 != null && ((map = this.f5076j) == null || !map.equals(map2))) {
            return false;
        }
        Integer num4 = r7.f4848k;
        if (num4 != null && this.f5077k != num4.intValue()) {
            return false;
        }
        Location location2 = r7.f4840c;
        if (location2 != null && (location = this.f5068b) != location2) {
            if (location == null || location.getTime() != location2.getTime()) {
                return false;
            }
            if ((AndroidUtils.isApiAchieved(17) && location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos()) || Double.compare(location2.getLatitude(), location.getLatitude()) != 0 || Double.compare(location2.getLongitude(), location.getLongitude()) != 0 || Double.compare(location2.getAltitude(), location.getAltitude()) != 0 || Float.compare(location2.getSpeed(), location.getSpeed()) != 0 || Float.compare(location2.getBearing(), location.getBearing()) != 0 || Float.compare(location2.getAccuracy(), location.getAccuracy()) != 0) {
                return false;
            }
            if (AndroidUtils.isApiAchieved(26)) {
                verticalAccuracyMeters = location2.getVerticalAccuracyMeters();
                verticalAccuracyMeters2 = location.getVerticalAccuracyMeters();
                if (Float.compare(verticalAccuracyMeters, verticalAccuracyMeters2) != 0) {
                    return false;
                }
                speedAccuracyMetersPerSecond = location2.getSpeedAccuracyMetersPerSecond();
                speedAccuracyMetersPerSecond2 = location.getSpeedAccuracyMetersPerSecond();
                if (Float.compare(speedAccuracyMetersPerSecond, speedAccuracyMetersPerSecond2) != 0) {
                    return false;
                }
                bearingAccuracyDegrees = location2.getBearingAccuracyDegrees();
                bearingAccuracyDegrees2 = location.getBearingAccuracyDegrees();
                if (Float.compare(bearingAccuracyDegrees, bearingAccuracyDegrees2) != 0) {
                    return false;
                }
            }
            if (location.getProvider() != null) {
                if (!location.getProvider().equals(location2.getProvider())) {
                    return false;
                }
            } else if (location2.getProvider() != null) {
                return false;
            }
            if (location.getExtras() != null) {
                if (!location.getExtras().equals(location2.getExtras())) {
                    return false;
                }
            } else if (location2.getExtras() != null) {
                return false;
            }
        }
        return true;
    }
}
