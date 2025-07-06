package io.appmetrica.analytics.internal;

import android.content.ContentValues;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.LocationUtils;
import io.appmetrica.analytics.impl.AbstractC2356zn;
import io.appmetrica.analytics.impl.EnumC1565U5;
import kotlin.jvm.internal.AbstractC2492i;

/* loaded from: classes.dex */
public class CounterConfiguration implements Parcelable {
    public static final Parcelable.Creator<CounterConfiguration> CREATOR = new C2358b();
    public static final String ORIGINAL_CLASS_PATH = "io.appmetrica.analytics.internal.CounterConfiguration";

    /* renamed from: a */
    private final ContentValues f7573a;

    public /* synthetic */ CounterConfiguration(ContentValues contentValues, int r2) {
        this(contentValues);
    }

    /* renamed from: a */
    private void m4708a(String str) {
        if (AbstractC2356zn.m4700a((Object) str)) {
            setApiKey(str);
        }
    }

    /* renamed from: b */
    private void m4712b(String str) {
        if ("20799a27-fa80-4b36-b2db-0f8141f24180".equals(str)) {
            setReporterType(EnumC1565U5.f5519d);
        } else {
            setReporterType(EnumC1565U5.f5518c);
        }
    }

    /* renamed from: c */
    private void m4713c(AppMetricaConfig appMetricaConfig) {
        if (AbstractC2356zn.m4700a((Object) appMetricaConfig.deviceType)) {
            setDeviceType(appMetricaConfig.deviceType);
        }
    }

    /* renamed from: d */
    private void m4717d(Integer num) {
        if (AbstractC2356zn.m4700a(num)) {
            setSessionTimeout(num.intValue());
        }
    }

    /* renamed from: e */
    private void m4718e(AppMetricaConfig appMetricaConfig) {
        if (AbstractC2356zn.m4700a(appMetricaConfig.locationTracking)) {
            setLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
    }

    /* renamed from: f */
    private void m4719f(AppMetricaConfig appMetricaConfig) {
        if (AbstractC2356zn.m4700a(appMetricaConfig.location)) {
            setManualLocation(appMetricaConfig.location);
        }
    }

    public static CounterConfiguration fromBundle(Bundle bundle) {
        CounterConfiguration counterConfiguration = null;
        if (bundle != null) {
            try {
                counterConfiguration = (CounterConfiguration) bundle.getParcelable("COUNTER_CFG_OBJ");
            } catch (Throwable unused) {
                return null;
            }
        }
        if (counterConfiguration == null) {
            counterConfiguration = new CounterConfiguration();
        }
        counterConfiguration.overlapByBundle(bundle);
        return counterConfiguration;
    }

    /* renamed from: g */
    private void m4720g(AppMetricaConfig appMetricaConfig) {
        if (AbstractC2356zn.m4700a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            setRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getApiKey() {
        return this.f7573a.getAsString("CFG_API_KEY");
    }

    public String getAppBuildNumber() {
        return this.f7573a.getAsString("CFG_APP_VERSION_CODE");
    }

    public String getAppVersion() {
        return this.f7573a.getAsString("CFG_APP_VERSION");
    }

    public Boolean getDataSendingEnabled() {
        return this.f7573a.getAsBoolean("CFG_DATA_SENDING_ENABLED");
    }

    public String getDeviceType() {
        return this.f7573a.getAsString("CFG_DEVICE_SIZE_TYPE");
    }

    public Integer getDispatchPeriod() {
        return this.f7573a.getAsInteger("CFG_DISPATCH_PERIOD");
    }

    public Location getManualLocation() {
        if (this.f7573a.containsKey("CFG_MANUAL_LOCATION")) {
            return LocationUtils.bytesToLocation(this.f7573a.getAsByteArray("CFG_MANUAL_LOCATION"));
        }
        return null;
    }

    public Integer getMaxReportsCount() {
        return this.f7573a.getAsInteger("CFG_MAX_REPORTS_COUNT");
    }

    public Integer getMaxReportsInDbCount() {
        return this.f7573a.getAsInteger("MAX_REPORTS_IN_DB_COUNT");
    }

    public Boolean getReportNativeCrashesEnabled() {
        return this.f7573a.getAsBoolean("CFG_NATIVE_CRASHES_ENABLED");
    }

    public EnumC1565U5 getReporterType() {
        EnumC1565U5 enumC1565U5;
        String asString = this.f7573a.getAsString("CFG_REPORTER_TYPE");
        EnumC1565U5[] values = EnumC1565U5.values();
        int length = values.length;
        int r3 = 0;
        while (true) {
            if (r3 >= length) {
                enumC1565U5 = null;
                break;
            }
            enumC1565U5 = values[r3];
            if (AbstractC2492i.m4911a(enumC1565U5.f5525a, asString)) {
                break;
            }
            r3++;
        }
        return enumC1565U5 == null ? EnumC1565U5.f5517b : enumC1565U5;
    }

    public Integer getSessionTimeout() {
        return this.f7573a.getAsInteger("CFG_SESSION_TIMEOUT");
    }

    public String getUuid() {
        return this.f7573a.getAsString("CFG_UUID");
    }

    public Boolean isFirstActivationAsUpdate() {
        return this.f7573a.getAsBoolean("CFG_IS_FIRST_ACTIVATION_AS_UPDATE");
    }

    public Boolean isLocationTrackingEnabled() {
        return this.f7573a.getAsBoolean("CFG_LOCATION_TRACKING");
    }

    public Boolean isLogEnabled() {
        return this.f7573a.getAsBoolean("CFG_IS_LOG_ENABLED");
    }

    public synchronized Boolean isRevenueAutoTrackingEnabled() {
        return this.f7573a.getAsBoolean("CFG_REVENUE_AUTO_TRACKING_ENABLED");
    }

    public synchronized void overlapByBundle(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            if (bundle.getInt("CFG_DISPATCH_PERIOD") != 0) {
                setDispatchPeriod(bundle.getInt("CFG_DISPATCH_PERIOD"));
            }
            if (bundle.getInt("CFG_SESSION_TIMEOUT") != 0) {
                setSessionTimeout(bundle.getInt("CFG_SESSION_TIMEOUT"));
            }
            if (bundle.getInt("CFG_MAX_REPORTS_COUNT") != 0) {
                setMaxReportsCount(bundle.getInt("CFG_MAX_REPORTS_COUNT"));
            }
            String string = bundle.getString("CFG_API_KEY");
            if (string != null && !"-1".equals(string)) {
                setApiKey(bundle.getString("CFG_API_KEY"));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setApiKey(String str) {
        this.f7573a.put("CFG_API_KEY", str);
    }

    public synchronized void setAppBuildNumber(int r3) {
        this.f7573a.put("CFG_APP_VERSION_CODE", String.valueOf(r3));
    }

    public final synchronized void setCustomAppVersion(String str) {
        this.f7573a.put("CFG_APP_VERSION", str);
    }

    public final synchronized void setDataSendingEnabled(boolean z2) {
        this.f7573a.put("CFG_DATA_SENDING_ENABLED", Boolean.valueOf(z2));
    }

    public final synchronized void setDeviceType(String str) {
        ContentValues contentValues = this.f7573a;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        contentValues.put("CFG_DEVICE_SIZE_TYPE", str);
    }

    public synchronized void setDispatchPeriod(int r3) {
        this.f7573a.put("CFG_DISPATCH_PERIOD", Integer.valueOf(r3));
    }

    public final synchronized void setFirstActivationAsUpdate(boolean z2) {
        this.f7573a.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(z2));
    }

    public synchronized void setLocationTracking(boolean z2) {
        this.f7573a.put("CFG_LOCATION_TRACKING", Boolean.valueOf(z2));
    }

    public synchronized void setLogEnabled(boolean z2) {
        this.f7573a.put("CFG_IS_LOG_ENABLED", Boolean.valueOf(z2));
    }

    public final synchronized void setManualLocation(Location location) {
        this.f7573a.put("CFG_MANUAL_LOCATION", LocationUtils.locationToBytes(location));
    }

    public synchronized void setMaxReportsCount(int r3) {
        ContentValues contentValues = this.f7573a;
        if (r3 <= 0) {
            r3 = Integer.MAX_VALUE;
        }
        contentValues.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf(r3));
    }

    public void setMaxReportsInDbCount(int r3) {
        this.f7573a.put("MAX_REPORTS_IN_DB_COUNT", Integer.valueOf(r3));
    }

    public synchronized void setReporterType(EnumC1565U5 enumC1565U5) {
        this.f7573a.put("CFG_REPORTER_TYPE", enumC1565U5.f5525a);
    }

    public synchronized void setRevenueAutoTrackingEnabled(boolean z2) {
        this.f7573a.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(z2));
    }

    public synchronized void setSessionTimeout(int r3) {
        this.f7573a.put("CFG_SESSION_TIMEOUT", Integer.valueOf(r3));
    }

    public synchronized void setUuid(String str) {
        this.f7573a.put("CFG_UUID", str);
    }

    public synchronized void toBundle(Bundle bundle) {
        bundle.putParcelable("COUNTER_CFG_OBJ", this);
    }

    public synchronized String toString() {
        return "CounterConfiguration{mParamsMapping=" + this.f7573a + '}';
    }

    @Override // android.os.Parcelable
    public synchronized void writeToParcel(Parcel parcel, int r4) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.data", this.f7573a);
        parcel.writeBundle(bundle);
    }

    public CounterConfiguration(CounterConfiguration counterConfiguration) {
        synchronized (counterConfiguration) {
            this.f7573a = new ContentValues(counterConfiguration.f7573a);
        }
    }

    /* renamed from: a */
    private void m4707a(Integer num) {
        if (AbstractC2356zn.m4700a(num)) {
            setDispatchPeriod(num.intValue());
        }
    }

    /* renamed from: c */
    private void m4715c(Integer num) {
        if (AbstractC2356zn.m4700a(num)) {
            this.f7573a.put("MAX_REPORTS_IN_DB_COUNT", num);
        }
    }

    /* renamed from: d */
    private void m4716d(AppMetricaConfig appMetricaConfig) {
        if (AbstractC2356zn.m4700a(appMetricaConfig.firstActivationAsUpdate)) {
            setFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
    }

    /* renamed from: b */
    private void m4711b(Integer num) {
        if (AbstractC2356zn.m4700a(num)) {
            setMaxReportsCount(num.intValue());
        }
    }

    /* renamed from: a */
    private void m4705a(AppMetricaConfig appMetricaConfig) {
        if (AbstractC2356zn.m4700a(appMetricaConfig.appBuildNumber)) {
            setAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
    }

    /* renamed from: c */
    private void m4714c(Boolean bool) {
        if (AbstractC2356zn.m4700a(bool)) {
            this.f7573a.put("CFG_NATIVE_CRASHES_ENABLED", bool);
        }
    }

    /* renamed from: b */
    private void m4710b(Boolean bool) {
        if (AbstractC2356zn.m4700a(bool)) {
            setLogEnabled(bool.booleanValue());
        }
    }

    public CounterConfiguration() {
        this.f7573a = new ContentValues();
    }

    /* renamed from: a */
    private void m4706a(Boolean bool) {
        if (AbstractC2356zn.m4700a(bool)) {
            setDataSendingEnabled(bool.booleanValue());
        }
    }

    /* renamed from: b */
    private void m4709b(AppMetricaConfig appMetricaConfig) {
        if (TextUtils.isEmpty(appMetricaConfig.appVersion)) {
            return;
        }
        setCustomAppVersion(appMetricaConfig.appVersion);
    }

    public CounterConfiguration(String str) {
        this();
        synchronized (this) {
            setApiKey(str);
        }
    }

    public CounterConfiguration(AppMetricaConfig appMetricaConfig, EnumC1565U5 enumC1565U5) {
        this();
        synchronized (this) {
            m4708a(appMetricaConfig.apiKey);
            m4717d(appMetricaConfig.sessionTimeout);
            m4719f(appMetricaConfig);
            m4718e(appMetricaConfig);
            m4713c(appMetricaConfig);
            m4707a(appMetricaConfig.dispatchPeriodSeconds);
            m4711b(appMetricaConfig.maxReportsCount);
            m4710b(appMetricaConfig.logs);
            m4709b(appMetricaConfig);
            m4705a(appMetricaConfig);
            m4716d(appMetricaConfig);
            m4706a(appMetricaConfig.dataSendingEnabled);
            m4715c(appMetricaConfig.maxReportsInDatabaseCount);
            m4714c(appMetricaConfig.nativeCrashReporting);
            m4720g(appMetricaConfig);
            setReporterType(enumC1565U5);
        }
    }

    public CounterConfiguration(ReporterConfig reporterConfig) {
        this();
        synchronized (this) {
            m4708a(reporterConfig.apiKey);
            m4717d(reporterConfig.sessionTimeout);
            m4707a(reporterConfig.dispatchPeriodSeconds);
            m4711b(reporterConfig.maxReportsCount);
            m4710b(reporterConfig.logs);
            m4706a(reporterConfig.dataSendingEnabled);
            m4715c(reporterConfig.maxReportsInDatabaseCount);
            m4712b(reporterConfig.apiKey);
        }
    }

    private CounterConfiguration(ContentValues contentValues) {
        this.f7573a = contentValues;
    }
}
