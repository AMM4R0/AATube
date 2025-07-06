package io.appmetrica.analytics;

import android.location.Location;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC1794db;
import io.appmetrica.analytics.impl.AbstractC1887h4;
import io.appmetrica.analytics.impl.C1532Sm;
import io.appmetrica.analytics.impl.C1708a0;
import io.appmetrica.analytics.impl.C2263w5;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppMetricaConfig {
    public final Map<String, Object> additionalConfig;
    public final Boolean anrMonitoring;
    public final Integer anrMonitoringTimeout;
    public final String apiKey;
    public final Integer appBuildNumber;
    public final Map<String, String> appEnvironment;
    public final Boolean appOpenTrackingEnabled;
    public final String appVersion;
    public final Boolean crashReporting;
    public final ICrashTransformer crashTransformer;
    public final List<String> customHosts;
    public final Boolean dataSendingEnabled;
    public final String deviceType;
    public final Integer dispatchPeriodSeconds;
    public final Map<String, String> errorEnvironment;
    public final Boolean firstActivationAsUpdate;
    public final Location location;
    public final Boolean locationTracking;
    public final Boolean logs;
    public final Integer maxReportsCount;
    public final Integer maxReportsInDatabaseCount;
    public final Boolean nativeCrashReporting;
    public final PreloadInfo preloadInfo;
    public final Boolean revenueAutoTrackingEnabled;
    public final Integer sessionTimeout;
    public final Boolean sessionsAutoTrackingEnabled;
    public final String userProfileID;

    public static class Builder {

        /* renamed from: C */
        private static final C1532Sm f4081C = new C1532Sm(new C1708a0());

        /* renamed from: A */
        private List f4082A;

        /* renamed from: B */
        private final HashMap f4083B;

        /* renamed from: a */
        private final C2263w5 f4084a;

        /* renamed from: b */
        private final String f4085b;

        /* renamed from: c */
        private String f4086c;

        /* renamed from: d */
        private Integer f4087d;

        /* renamed from: e */
        private Boolean f4088e;

        /* renamed from: f */
        private Boolean f4089f;

        /* renamed from: g */
        private Location f4090g;

        /* renamed from: h */
        private Boolean f4091h;

        /* renamed from: i */
        private Boolean f4092i;

        /* renamed from: j */
        private PreloadInfo f4093j;

        /* renamed from: k */
        private Boolean f4094k;

        /* renamed from: l */
        private Boolean f4095l;

        /* renamed from: m */
        private Integer f4096m;

        /* renamed from: n */
        private final LinkedHashMap f4097n;

        /* renamed from: o */
        private String f4098o;

        /* renamed from: p */
        private Boolean f4099p;

        /* renamed from: q */
        private Boolean f4100q;

        /* renamed from: r */
        private Boolean f4101r;

        /* renamed from: s */
        private String f4102s;

        /* renamed from: t */
        private Integer f4103t;

        /* renamed from: u */
        private Integer f4104u;

        /* renamed from: v */
        private Integer f4105v;

        /* renamed from: w */
        private final LinkedHashMap f4106w;

        /* renamed from: x */
        private ICrashTransformer f4107x;

        /* renamed from: y */
        private Boolean f4108y;

        /* renamed from: z */
        private Integer f4109z;

        public /* synthetic */ Builder(String str, int r2) {
            this(str);
        }

        public AppMetricaConfig build() {
            return new AppMetricaConfig(this, 0);
        }

        public Builder handleFirstActivationAsUpdate(boolean z2) {
            this.f4094k = Boolean.valueOf(z2);
            return this;
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.f4083B.put(str, obj);
            return this;
        }

        public Builder withAnrMonitoring(boolean z2) {
            this.f4108y = Boolean.valueOf(z2);
            return this;
        }

        public Builder withAnrMonitoringTimeout(int r12) {
            this.f4109z = Integer.valueOf(r12);
            return this;
        }

        public Builder withAppBuildNumber(int r5) {
            if (r5 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            this.f4103t = Integer.valueOf(r5);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f4106w.put(str, str2);
            return this;
        }

        public Builder withAppOpenTrackingEnabled(boolean z2) {
            this.f4101r = Boolean.valueOf(z2);
            return this;
        }

        public Builder withAppVersion(String str) {
            this.f4086c = str;
            return this;
        }

        public Builder withCrashReporting(boolean z2) {
            this.f4088e = Boolean.valueOf(z2);
            return this;
        }

        public Builder withCrashTransformer(ICrashTransformer iCrashTransformer) {
            this.f4107x = iCrashTransformer;
            return this;
        }

        public Builder withCustomHosts(List<String> list) {
            this.f4082A = CollectionUtils.unmodifiableListCopy(list);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z2) {
            this.f4095l = Boolean.valueOf(z2);
            return this;
        }

        public Builder withDeviceType(String str) {
            this.f4102s = str;
            return this;
        }

        public Builder withDispatchPeriodSeconds(int r12) {
            this.f4104u = Integer.valueOf(r12);
            return this;
        }

        public Builder withErrorEnvironmentValue(String str, String str2) {
            this.f4097n.put(str, str2);
            return this;
        }

        public Builder withLocation(Location location) {
            this.f4090g = location;
            return this;
        }

        public Builder withLocationTracking(boolean z2) {
            this.f4091h = Boolean.valueOf(z2);
            return this;
        }

        public Builder withLogs() {
            this.f4092i = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int r12) {
            this.f4105v = Integer.valueOf(r12);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int r2) {
            this.f4096m = Integer.valueOf(this.f4084a.m4533a(r2));
            return this;
        }

        public Builder withNativeCrashReporting(boolean z2) {
            this.f4089f = Boolean.valueOf(z2);
            return this;
        }

        public Builder withPreloadInfo(PreloadInfo preloadInfo) {
            this.f4093j = preloadInfo;
            return this;
        }

        public Builder withRevenueAutoTrackingEnabled(boolean z2) {
            this.f4099p = Boolean.valueOf(z2);
            return this;
        }

        public Builder withSessionTimeout(int r12) {
            this.f4087d = Integer.valueOf(r12);
            return this;
        }

        public Builder withSessionsAutoTrackingEnabled(boolean z2) {
            this.f4100q = Boolean.valueOf(z2);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f4098o = str;
            return this;
        }

        private Builder(String str) {
            this.f4097n = new LinkedHashMap();
            this.f4106w = new LinkedHashMap();
            this.f4083B = new HashMap();
            f4081C.mo2706a(str);
            this.f4084a = new C2263w5(str);
            this.f4085b = str;
        }
    }

    public /* synthetic */ AppMetricaConfig(Builder builder, int r2) {
        this(builder);
    }

    public static AppMetricaConfig fromJson(String str) {
        AppMetricaConfig appMetricaConfig;
        HashMap m3756c;
        HashMap m3756c2;
        HashMap m3756c3;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Builder newConfigBuilder = newConfigBuilder(jSONObject.getString("apikey"));
                if (jSONObject.has("app_version")) {
                    newConfigBuilder.withAppVersion(jSONObject.optString("app_version"));
                }
                if (jSONObject.has("session_timeout")) {
                    newConfigBuilder.withSessionTimeout(jSONObject.getInt("session_timeout"));
                }
                newConfigBuilder.withLocation(AbstractC1887h4.m3906a(jSONObject.optString("location")));
                newConfigBuilder.withPreloadInfo(AbstractC1887h4.m3908b(jSONObject.optString("preload_info")));
                if (jSONObject.has("logs") && jSONObject.optBoolean("logs")) {
                    newConfigBuilder.withLogs();
                }
                if (jSONObject.has("crash_enabled")) {
                    newConfigBuilder.withCrashReporting(jSONObject.optBoolean("crash_enabled"));
                }
                if (jSONObject.has("crash_native_enabled")) {
                    newConfigBuilder.withNativeCrashReporting(jSONObject.optBoolean("crash_native_enabled"));
                }
                if (jSONObject.has("location_enabled")) {
                    newConfigBuilder.withLocationTracking(jSONObject.optBoolean("location_enabled"));
                }
                if (jSONObject.has("max_reports_in_db_count")) {
                    newConfigBuilder.withMaxReportsInDatabaseCount(jSONObject.optInt("max_reports_in_db_count"));
                }
                if (jSONObject.has("error_environment") && (m3756c3 = AbstractC1794db.m3756c(jSONObject.optString("error_environment"))) != null) {
                    for (Map.Entry entry : m3756c3.entrySet()) {
                        newConfigBuilder.withErrorEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (jSONObject.has("first_activation_as_update")) {
                    newConfigBuilder.handleFirstActivationAsUpdate(jSONObject.optBoolean("first_activation_as_update"));
                }
                if (jSONObject.has("data_sending_enabled")) {
                    newConfigBuilder.withDataSendingEnabled(jSONObject.optBoolean("data_sending_enabled"));
                }
                if (jSONObject.has("user_profile_id")) {
                    appMetricaConfig = null;
                    try {
                        newConfigBuilder.withUserProfileID(jSONObject.optString("user_profile_id", null));
                    } catch (Throwable unused) {
                    }
                } else {
                    appMetricaConfig = null;
                }
                if (jSONObject.has("revenue_auto_tracking_enabled")) {
                    newConfigBuilder.withRevenueAutoTrackingEnabled(jSONObject.optBoolean("revenue_auto_tracking_enabled"));
                }
                if (jSONObject.has("sessions_auto_tracking_enabled")) {
                    newConfigBuilder.withSessionsAutoTrackingEnabled(jSONObject.optBoolean("sessions_auto_tracking_enabled"));
                }
                if (jSONObject.has("app_open_tracking_enabled")) {
                    newConfigBuilder.withAppOpenTrackingEnabled(jSONObject.optBoolean("app_open_tracking_enabled"));
                }
                if (jSONObject.has(CommonUrlParts.DEVICE_TYPE)) {
                    newConfigBuilder.withDeviceType(jSONObject.optString(CommonUrlParts.DEVICE_TYPE));
                }
                if (jSONObject.has(CommonUrlParts.APP_VERSION_CODE)) {
                    newConfigBuilder.withAppBuildNumber(jSONObject.optInt(CommonUrlParts.APP_VERSION_CODE));
                }
                if (jSONObject.has("dispatch_period_seconds")) {
                    newConfigBuilder.withDispatchPeriodSeconds(jSONObject.optInt("dispatch_period_seconds"));
                }
                if (jSONObject.has("max_reports_count")) {
                    newConfigBuilder.withMaxReportsCount(jSONObject.optInt("max_reports_count"));
                }
                if (jSONObject.has("app_environment") && (m3756c2 = AbstractC1794db.m3756c(jSONObject.optString("app_environment"))) != null) {
                    for (Map.Entry entry2 : m3756c2.entrySet()) {
                        newConfigBuilder.withAppEnvironmentValue((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                if (jSONObject.has("anr_monitoring")) {
                    newConfigBuilder.withAnrMonitoring(jSONObject.optBoolean("anr_monitoring"));
                }
                if (jSONObject.has("anr_monitoring_timeout")) {
                    newConfigBuilder.withAnrMonitoringTimeout(jSONObject.optInt("anr_monitoring_timeout"));
                }
                if (jSONObject.has("customHosts")) {
                    newConfigBuilder.withCustomHosts(AbstractC1794db.m3749a(jSONObject.optJSONArray("customHosts")));
                }
                if (jSONObject.has("additional_config") && (m3756c = AbstractC1794db.m3756c(jSONObject.optString("additional_config"))) != null) {
                    for (Map.Entry entry3 : m3756c.entrySet()) {
                        newConfigBuilder.withAdditionalConfig((String) entry3.getKey(), entry3.getValue());
                    }
                }
                return newConfigBuilder.build();
            } catch (Throwable unused2) {
            }
        }
        appMetricaConfig = null;
        return appMetricaConfig;
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x018a A[Catch: all -> 0x01db, TryCatch #1 {all -> 0x01db, blocks: (B:2:0x0000, B:6:0x0086, B:9:0x00ec, B:12:0x0175, B:14:0x018a, B:15:0x0193, B:18:0x01d3, B:22:0x019e, B:23:0x01ab, B:25:0x01b1, B:28:0x01c1, B:33:0x01cd, B:34:0x0141, B:35:0x014e, B:37:0x0154, B:40:0x0164, B:45:0x0170, B:46:0x00b8, B:47:0x00c5, B:49:0x00cb, B:52:0x00db, B:57:0x00e7), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x019e A[Catch: all -> 0x01db, TryCatch #1 {all -> 0x01db, blocks: (B:2:0x0000, B:6:0x0086, B:9:0x00ec, B:12:0x0175, B:14:0x018a, B:15:0x0193, B:18:0x01d3, B:22:0x019e, B:23:0x01ab, B:25:0x01b1, B:28:0x01c1, B:33:0x01cd, B:34:0x0141, B:35:0x014e, B:37:0x0154, B:40:0x0164, B:45:0x0170, B:46:0x00b8, B:47:0x00c5, B:49:0x00cb, B:52:0x00db, B:57:0x00e7), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0141 A[Catch: all -> 0x01db, TryCatch #1 {all -> 0x01db, blocks: (B:2:0x0000, B:6:0x0086, B:9:0x00ec, B:12:0x0175, B:14:0x018a, B:15:0x0193, B:18:0x01d3, B:22:0x019e, B:23:0x01ab, B:25:0x01b1, B:28:0x01c1, B:33:0x01cd, B:34:0x0141, B:35:0x014e, B:37:0x0154, B:40:0x0164, B:45:0x0170, B:46:0x00b8, B:47:0x00c5, B:49:0x00cb, B:52:0x00db, B:57:0x00e7), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8 A[Catch: all -> 0x01db, TryCatch #1 {all -> 0x01db, blocks: (B:2:0x0000, B:6:0x0086, B:9:0x00ec, B:12:0x0175, B:14:0x018a, B:15:0x0193, B:18:0x01d3, B:22:0x019e, B:23:0x01ab, B:25:0x01b1, B:28:0x01c1, B:33:0x01cd, B:34:0x0141, B:35:0x014e, B:37:0x0154, B:40:0x0164, B:45:0x0170, B:46:0x00b8, B:47:0x00c5, B:49:0x00cb, B:52:0x00db, B:57:0x00e7), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toJson() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.AppMetricaConfig.toJson():java.lang.String");
    }

    private AppMetricaConfig(Builder builder) {
        this.apiKey = builder.f4085b;
        this.appVersion = builder.f4086c;
        this.sessionTimeout = builder.f4087d;
        this.crashReporting = builder.f4088e;
        this.nativeCrashReporting = builder.f4089f;
        this.location = builder.f4090g;
        this.locationTracking = builder.f4091h;
        this.logs = builder.f4092i;
        this.preloadInfo = builder.f4093j;
        this.firstActivationAsUpdate = builder.f4094k;
        this.dataSendingEnabled = builder.f4095l;
        this.maxReportsInDatabaseCount = builder.f4096m;
        this.errorEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f4097n);
        this.userProfileID = builder.f4098o;
        this.revenueAutoTrackingEnabled = builder.f4099p;
        this.sessionsAutoTrackingEnabled = builder.f4100q;
        this.appOpenTrackingEnabled = builder.f4101r;
        this.deviceType = builder.f4102s;
        this.appBuildNumber = builder.f4103t;
        this.dispatchPeriodSeconds = builder.f4104u;
        this.maxReportsCount = builder.f4105v;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f4106w);
        this.crashTransformer = builder.f4107x;
        this.anrMonitoring = builder.f4108y;
        this.anrMonitoringTimeout = builder.f4109z;
        this.customHosts = builder.f4082A;
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f4083B);
    }

    public AppMetricaConfig(AppMetricaConfig appMetricaConfig) {
        this.apiKey = appMetricaConfig.apiKey;
        this.appVersion = appMetricaConfig.appVersion;
        this.sessionTimeout = appMetricaConfig.sessionTimeout;
        this.crashReporting = appMetricaConfig.crashReporting;
        this.nativeCrashReporting = appMetricaConfig.nativeCrashReporting;
        this.location = appMetricaConfig.location;
        this.locationTracking = appMetricaConfig.locationTracking;
        this.logs = appMetricaConfig.logs;
        this.preloadInfo = appMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = appMetricaConfig.firstActivationAsUpdate;
        this.dataSendingEnabled = appMetricaConfig.dataSendingEnabled;
        this.maxReportsInDatabaseCount = appMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = appMetricaConfig.errorEnvironment;
        this.userProfileID = appMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = appMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = appMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = appMetricaConfig.appOpenTrackingEnabled;
        this.deviceType = appMetricaConfig.deviceType;
        this.appBuildNumber = appMetricaConfig.appBuildNumber;
        this.dispatchPeriodSeconds = appMetricaConfig.dispatchPeriodSeconds;
        this.maxReportsCount = appMetricaConfig.maxReportsCount;
        this.appEnvironment = appMetricaConfig.appEnvironment;
        this.crashTransformer = appMetricaConfig.crashTransformer;
        this.anrMonitoring = appMetricaConfig.anrMonitoring;
        this.anrMonitoringTimeout = appMetricaConfig.anrMonitoringTimeout;
        this.customHosts = appMetricaConfig.customHosts;
        this.additionalConfig = appMetricaConfig.additionalConfig;
    }
}
