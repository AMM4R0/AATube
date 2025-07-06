package io.appmetrica.analytics.networktasks.internal;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;

/* loaded from: classes.dex */
public class BaseRequestConfig {

    /* renamed from: a */
    private String f7714a;

    /* renamed from: b */
    private ConstantDeviceInfo f7715b;

    /* renamed from: c */
    private SdkEnvironment f7716c;

    /* renamed from: d */
    private SdkIdentifiers f7717d;

    /* renamed from: e */
    private AdvertisingIdsHolder f7718e;

    /* renamed from: f */
    private AppSetId f7719f;

    /* renamed from: g */
    private RetryPolicyConfig f7720g;

    public static abstract class BaseRequestArguments<I, O> implements ArgumentsMerger<I, O> {
    }

    public static abstract class ComponentLoader<T extends BaseRequestConfig, A extends BaseRequestArguments, D extends DataSource<A>> implements RequestConfigLoader<T, D> {

        /* renamed from: a */
        final Context f7721a;

        /* renamed from: b */
        final String f7722b;

        public ComponentLoader(Context context, String str) {
            this.f7721a = context;
            this.f7722b = str;
        }

        public abstract T createBlankConfig();

        public Context getContext() {
            return this.f7721a;
        }

        public String getPackageName() {
            return this.f7722b;
        }

        @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
        public T load(D d2) {
            T createBlankConfig = createBlankConfig();
            createBlankConfig.setSdkIdentifiers(d2.sdkIdentifiers);
            createBlankConfig.setConstantDeviceInfo(ConstantDeviceInfo.getInstance());
            createBlankConfig.setSdkEnvironment(d2.sdkEnvironmentProvider.getSdkEnvironment());
            PlatformIdentifiers platformIdentifiers = d2.platformIdentifiers;
            createBlankConfig.setAppSetId(platformIdentifiers.getAppSetIdProvider().getAppSetId());
            createBlankConfig.setAdvertisingIdsHolder(platformIdentifiers.getAdvIdentifiersProvider().getIdentifiers(this.f7721a));
            createBlankConfig.setPackageName(this.f7722b);
            return createBlankConfig;
        }
    }

    public static class DataSource<A> {
        public final A componentArguments;
        public final PlatformIdentifiers platformIdentifiers;
        public final SdkEnvironmentProvider sdkEnvironmentProvider;
        public final SdkIdentifiers sdkIdentifiers;

        public DataSource(SdkIdentifiers sdkIdentifiers, SdkEnvironmentProvider sdkEnvironmentProvider, PlatformIdentifiers platformIdentifiers, A a2) {
            this.sdkIdentifiers = sdkIdentifiers;
            this.componentArguments = a2;
            this.sdkEnvironmentProvider = sdkEnvironmentProvider;
            this.platformIdentifiers = platformIdentifiers;
        }
    }

    public interface RequestConfigLoader<T extends BaseRequestConfig, D> {
        T load(D d2);
    }

    public AdvertisingIdsHolder getAdvertisingIdsHolder() {
        return this.f7718e;
    }

    public String getAnalyticsSdkBuildNumber() {
        SdkEnvironment sdkEnvironment = this.f7716c;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkBuildNumber();
    }

    public String getAnalyticsSdkBuildType() {
        SdkEnvironment sdkEnvironment = this.f7716c;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkBuildType();
    }

    public String getAnalyticsSdkVersionName() {
        SdkEnvironment sdkEnvironment = this.f7716c;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkVersionName();
    }

    public String getAppBuildNumber() {
        SdkEnvironment sdkEnvironment = this.f7716c;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppVersionInfo().getAppBuildNumber();
    }

    public String getAppFramework() {
        SdkEnvironment sdkEnvironment = this.f7716c;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppFramework();
    }

    public String getAppPlatform() {
        return ConstantDeviceInfo.APP_PLATFORM;
    }

    public synchronized String getAppSetId() {
        AppSetId appSetId;
        try {
            appSetId = this.f7719f;
        } finally {
        }
        return (appSetId == null || appSetId.getId() == null) ? "" : this.f7719f.getId();
    }

    public synchronized String getAppSetIdScope() {
        AppSetId appSetId;
        try {
            appSetId = this.f7719f;
        } finally {
        }
        return appSetId == null ? "" : appSetId.getScope().getValue();
    }

    public String getAppVersion() {
        SdkEnvironment sdkEnvironment = this.f7716c;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppVersionInfo().getAppVersionName();
    }

    public synchronized String getDeviceIDHash() {
        String str;
        str = "";
        SdkIdentifiers sdkIdentifiers = this.f7717d;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceIdHash() != null) {
            str = this.f7717d.getDeviceIdHash();
        }
        return str;
    }

    public synchronized String getDeviceId() {
        String str;
        str = "";
        SdkIdentifiers sdkIdentifiers = this.f7717d;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceId() != null) {
            str = this.f7717d.getDeviceId();
        }
        return str;
    }

    public String getDeviceRootStatus() {
        return this.f7715b.deviceRootStatus;
    }

    public String getDeviceType() {
        SdkEnvironment sdkEnvironment = this.f7716c;
        return sdkEnvironment != null ? sdkEnvironment.getDeviceType() : "phone";
    }

    public String getLocale() {
        String str;
        SdkEnvironment sdkEnvironment = this.f7716c;
        return (sdkEnvironment == null || (str = (String) CollectionUtils.getFirstOrNull(sdkEnvironment.getLocales())) == null) ? "" : str;
    }

    public String getManufacturer() {
        return (String) WrapUtils.getOrDefault(this.f7715b.manufacturer, "");
    }

    public String getModel() {
        return this.f7715b.model;
    }

    public int getOsApiLevel() {
        return this.f7715b.osApiLevel;
    }

    public String getOsVersion() {
        return this.f7715b.osVersion;
    }

    public String getPackageName() {
        return this.f7714a;
    }

    public String getProtocolVersion() {
        return "2";
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f7720g;
    }

    public float getScaleFactor() {
        SdkEnvironment sdkEnvironment = this.f7716c;
        if (sdkEnvironment == null) {
            return 0.0f;
        }
        return sdkEnvironment.getScreenInfo().getScaleFactor();
    }

    public int getScreenDpi() {
        SdkEnvironment sdkEnvironment = this.f7716c;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getDpi();
    }

    public int getScreenHeight() {
        SdkEnvironment sdkEnvironment = this.f7716c;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getHeight();
    }

    public int getScreenWidth() {
        SdkEnvironment sdkEnvironment = this.f7716c;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getWidth();
    }

    public synchronized String getUuid() {
        String str;
        str = "";
        SdkIdentifiers sdkIdentifiers = this.f7717d;
        if (sdkIdentifiers != null && sdkIdentifiers.getUuid() != null) {
            str = this.f7717d.getUuid();
        }
        return str;
    }

    public synchronized boolean isIdentifiersValid() {
        boolean z2;
        String uuid;
        String deviceId;
        String deviceIdHash;
        SdkIdentifiers sdkIdentifiers = this.f7717d;
        if (sdkIdentifiers != null && (uuid = sdkIdentifiers.getUuid()) != null && uuid.length() != 0 && (deviceId = sdkIdentifiers.getDeviceId()) != null && deviceId.length() != 0 && (deviceIdHash = sdkIdentifiers.getDeviceIdHash()) != null) {
            z2 = deviceIdHash.length() != 0;
        }
        return z2;
    }

    public void setAdvertisingIdsHolder(AdvertisingIdsHolder advertisingIdsHolder) {
        this.f7718e = advertisingIdsHolder;
    }

    public void setAppSetId(AppSetId appSetId) {
        this.f7719f = appSetId;
    }

    public void setConstantDeviceInfo(ConstantDeviceInfo constantDeviceInfo) {
        this.f7715b = constantDeviceInfo;
    }

    public void setPackageName(String str) {
        this.f7714a = str;
    }

    public void setRetryPolicyConfig(RetryPolicyConfig retryPolicyConfig) {
        this.f7720g = retryPolicyConfig;
    }

    public void setSdkEnvironment(SdkEnvironment sdkEnvironment) {
        this.f7716c = sdkEnvironment;
    }

    public void setSdkIdentifiers(SdkIdentifiers sdkIdentifiers) {
        this.f7717d = sdkIdentifiers;
    }

    public String toString() {
        return "BaseRequestConfig{mPackageName='" + this.f7714a + "', mConstantDeviceInfo=" + this.f7715b + ", sdkEnvironment=" + this.f7716c + ", mAppPlatform='android', mProtocolVersion='2', sdkIdentifiers=" + this.f7717d + ", retryPolicyConfig=" + this.f7720g + '}';
    }
}
