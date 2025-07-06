package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.G7 */
/* loaded from: classes.dex */
public final class C1218G7 implements InterfaceC2320yc {

    /* renamed from: a */
    public Location f4769a;

    /* renamed from: b */
    public Boolean f4770b;

    /* renamed from: c */
    public Boolean f4771c;

    /* renamed from: d */
    public final LinkedHashMap f4772d = new LinkedHashMap();

    /* renamed from: e */
    public final LinkedHashMap f4773e = new LinkedHashMap();

    /* renamed from: f */
    public boolean f4774f;

    /* renamed from: g */
    public String f4775g;

    /* renamed from: h */
    public boolean f4776h;

    /* renamed from: i */
    public C1726ai f4777i;

    @Override // io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    public final void mo2758a(boolean z2) {
        Boolean valueOf = Boolean.valueOf(z2);
        this.f4770b = valueOf;
        C1726ai c1726ai = this.f4777i;
        if (c1726ai != null) {
            Boolean bool = this.f4771c;
            if (AbstractC2356zn.m4700a(valueOf)) {
                c1726ai.f5882a.f6458b.setLocationTracking(z2);
            }
            if (AbstractC2356zn.m4700a(bool)) {
                c1726ai.f5882a.f6458b.setDataSendingEnabled(bool.booleanValue());
            }
            C1615W5 m3457a = C1615W5.m3457a();
            C1688Z4 c1688z4 = c1726ai.f5882a;
            c1726ai.m3613a(C1726ai.m3612a(m3457a, c1688z4), c1688z4, 1, null);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2320yc
    public final void clearAppEnvironment() {
        this.f4774f = true;
        this.f4772d.clear();
    }

    /* renamed from: i */
    public final Location m2894i() {
        return this.f4769a;
    }

    /* renamed from: j */
    public final Boolean m2895j() {
        return this.f4771c;
    }

    /* renamed from: k */
    public final Boolean m2896k() {
        return this.f4770b;
    }

    /* renamed from: l */
    public final boolean m2897l() {
        return this.f4774f;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2320yc
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f4772d.put(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2320yc
    public final void setDataSendingEnabled(boolean z2) {
        Boolean valueOf = Boolean.valueOf(z2);
        this.f4771c = valueOf;
        C1726ai c1726ai = this.f4777i;
        if (c1726ai != null) {
            Boolean bool = this.f4770b;
            if (AbstractC2356zn.m4700a(bool)) {
                c1726ai.f5882a.f6458b.setLocationTracking(bool.booleanValue());
            }
            if (AbstractC2356zn.m4700a(valueOf)) {
                c1726ai.f5882a.f6458b.setDataSendingEnabled(z2);
            }
            C1615W5 m3457a = C1615W5.m3457a();
            C1688Z4 c1688z4 = c1726ai.f5882a;
            c1726ai.m3613a(C1726ai.m3612a(m3457a, c1688z4), c1688z4, 1, null);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2320yc
    public final void setUserProfileID(String str) {
        this.f4775g = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    public final void mo2751a(Location location) {
        this.f4769a = location;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    public final void mo2757a(String str, String str2) {
        this.f4773e.put(str, str2);
    }

    /* renamed from: a */
    public final AppMetricaConfig m2892a(AppMetricaConfig appMetricaConfig) {
        if (this.f4776h) {
            return appMetricaConfig;
        }
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder(appMetricaConfig.apiKey);
        newConfigBuilder.withDeviceType(appMetricaConfig.deviceType);
        newConfigBuilder.withPreloadInfo(appMetricaConfig.preloadInfo);
        newConfigBuilder.withLocation(appMetricaConfig.location);
        if (AbstractC2356zn.m4700a((Object) appMetricaConfig.appVersion)) {
            newConfigBuilder.withAppVersion(appMetricaConfig.appVersion);
        }
        if (AbstractC2356zn.m4700a(appMetricaConfig.dispatchPeriodSeconds)) {
            newConfigBuilder.withDispatchPeriodSeconds(appMetricaConfig.dispatchPeriodSeconds.intValue());
        }
        if (AbstractC2356zn.m4700a(appMetricaConfig.appBuildNumber)) {
            newConfigBuilder.withAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
        if (AbstractC2356zn.m4700a(appMetricaConfig.maxReportsCount)) {
            newConfigBuilder.withMaxReportsCount(appMetricaConfig.maxReportsCount.intValue());
        }
        if (AbstractC2356zn.m4700a(appMetricaConfig.logs) && appMetricaConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (AbstractC2356zn.m4700a(appMetricaConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(appMetricaConfig.sessionTimeout.intValue());
        }
        if (AbstractC2356zn.m4700a(appMetricaConfig.crashReporting)) {
            newConfigBuilder.withCrashReporting(appMetricaConfig.crashReporting.booleanValue());
        }
        if (AbstractC2356zn.m4700a(appMetricaConfig.nativeCrashReporting)) {
            newConfigBuilder.withNativeCrashReporting(appMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (AbstractC2356zn.m4700a(appMetricaConfig.locationTracking)) {
            newConfigBuilder.withLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
        if (AbstractC2356zn.m4700a(appMetricaConfig.firstActivationAsUpdate)) {
            newConfigBuilder.handleFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (AbstractC2356zn.m4700a(appMetricaConfig.dataSendingEnabled)) {
            newConfigBuilder.withDataSendingEnabled(appMetricaConfig.dataSendingEnabled.booleanValue());
        }
        if (AbstractC2356zn.m4700a(appMetricaConfig.anrMonitoring)) {
            newConfigBuilder.withAnrMonitoring(appMetricaConfig.anrMonitoring.booleanValue());
        }
        if (AbstractC2356zn.m4700a(appMetricaConfig.anrMonitoringTimeout)) {
            newConfigBuilder.withAnrMonitoringTimeout(appMetricaConfig.anrMonitoringTimeout.intValue());
        }
        if (AbstractC2356zn.m4700a(appMetricaConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(appMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (AbstractC2356zn.m4700a(appMetricaConfig.crashTransformer)) {
            newConfigBuilder.withCrashTransformer(appMetricaConfig.crashTransformer);
        }
        if (AbstractC2356zn.m4700a((Object) appMetricaConfig.userProfileID)) {
            newConfigBuilder.withUserProfileID(appMetricaConfig.userProfileID);
        }
        if (AbstractC2356zn.m4700a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            newConfigBuilder.withRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC2356zn.m4700a(appMetricaConfig.appOpenTrackingEnabled)) {
            newConfigBuilder.withAppOpenTrackingEnabled(appMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (AbstractC2356zn.m4700a((Object) appMetricaConfig.customHosts)) {
            newConfigBuilder.withCustomHosts(appMetricaConfig.customHosts);
        }
        LinkedHashMap linkedHashMap = this.f4772d;
        if (!AbstractC2356zn.m4703a((Map) linkedHashMap)) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                newConfigBuilder.withAppEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, String> map = appMetricaConfig.appEnvironment;
        if (!AbstractC2356zn.m4703a((Map) map)) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                newConfigBuilder.withAppEnvironmentValue(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = this.f4773e;
        if (!AbstractC2356zn.m4703a((Map) linkedHashMap2)) {
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue((String) entry3.getKey(), (String) entry3.getValue());
            }
        }
        Map<String, String> map2 = appMetricaConfig.errorEnvironment;
        if (!AbstractC2356zn.m4703a((Map) map2)) {
            for (Map.Entry<String, String> entry4 : map2.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue(entry4.getKey(), entry4.getValue());
            }
        }
        Map<String, Object> map3 = appMetricaConfig.additionalConfig;
        if (!AbstractC2356zn.m4703a((Map) map3)) {
            for (Map.Entry<String, Object> entry5 : map3.entrySet()) {
                newConfigBuilder.withAdditionalConfig(entry5.getKey(), entry5.getValue());
            }
        }
        Boolean bool = this.f4770b;
        if (appMetricaConfig.locationTracking == null && AbstractC2356zn.m4700a(bool)) {
            newConfigBuilder.withLocationTracking(bool.booleanValue());
        }
        Location location = this.f4769a;
        if (appMetricaConfig.location == null && AbstractC2356zn.m4700a(location)) {
            newConfigBuilder.withLocation(location);
        }
        Boolean bool2 = this.f4771c;
        if (appMetricaConfig.dataSendingEnabled == null && AbstractC2356zn.m4700a(bool2)) {
            newConfigBuilder.withDataSendingEnabled(bool2.booleanValue());
        }
        if (!AbstractC2356zn.m4700a((Object) appMetricaConfig.userProfileID) && AbstractC2356zn.m4700a((Object) this.f4775g)) {
            newConfigBuilder.withUserProfileID(this.f4775g);
        }
        this.f4776h = true;
        this.f4769a = null;
        this.f4770b = null;
        this.f4771c = null;
        this.f4772d.clear();
        this.f4773e.clear();
        this.f4774f = false;
        this.f4775g = null;
        return newConfigBuilder.build();
    }

    /* renamed from: a */
    public final void m2893a(C1726ai c1726ai) {
        this.f4777i = c1726ai;
    }
}
