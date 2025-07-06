package io.appmetrica.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.AbstractC2034n1;
import io.appmetrica.analytics.impl.AbstractC2333z0;
import io.appmetrica.analytics.impl.C2009m1;
import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class AppMetrica {
    public static void activate(Context context, AppMetricaConfig appMetricaConfig) {
        AbstractC2034n1.f6790a.m4125a(context, appMetricaConfig);
    }

    public static void activateReporter(Context context, ReporterConfig reporterConfig) {
        AbstractC2034n1.f6790a.m4126a(context, reporterConfig);
    }

    public static void clearAppEnvironment() {
        AbstractC2034n1.f6790a.m4122a();
    }

    public static void enableActivityAutoTracking(Application application) {
        AbstractC2034n1.f6790a.m4124a(application);
    }

    public static String getDeviceId(Context context) {
        return AbstractC2034n1.f6790a.m4146b();
    }

    public static int getLibraryApiLevel() {
        return BuildConfig.API_LEVEL;
    }

    public static String getLibraryVersion() {
        return "6.5.0";
    }

    public static AppMetricaPlugins getPluginExtension() {
        return AbstractC2333z0.f7510a;
    }

    public static IReporter getReporter(Context context, String str) {
        return AbstractC2034n1.f6790a.m4120a(context, str);
    }

    public static String getUuid(Context context) {
        return AbstractC2034n1.f6790a.m4121a(context).f7574id;
    }

    public static void initWebViewReporting(WebView webView) {
        AbstractC2034n1.f6790a.m4130a(webView);
    }

    public static void pauseSession(Activity activity) {
        AbstractC2034n1.f6790a.m4123a(activity);
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        AbstractC2034n1.f6790a.m4140a(str, str2);
    }

    public static void putErrorEnvironmentValue(String str, String str2) {
        AbstractC2034n1.f6790a.m4149b(str, str2);
    }

    public static void registerAnrListener(AnrListener anrListener) {
        AbstractC2034n1.f6790a.m4132a(anrListener);
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        AbstractC2034n1.f6790a.m4131a(adRevenue);
    }

    public static void reportAppOpen(Activity activity) {
        AbstractC2034n1.f6790a.m4147b(activity);
    }

    public static void reportECommerce(ECommerceEvent eCommerceEvent) {
        AbstractC2034n1.f6790a.m4137a(eCommerceEvent);
    }

    public static void reportError(String str, String str2) {
        AbstractC2034n1.f6790a.m4141a(str, str2, (Throwable) null);
    }

    public static void reportEvent(String str) {
        AbstractC2034n1.f6790a.m4148b(str);
    }

    public static void reportExternalAttribution(ExternalAttribution externalAttribution) {
        AbstractC2034n1.f6790a.m4135a(externalAttribution);
    }

    public static void reportReferralUrl(String str) {
        AbstractC2034n1.f6790a.m4156d(str);
    }

    public static void reportRevenue(Revenue revenue) {
        AbstractC2034n1.f6790a.m4136a(revenue);
    }

    public static void reportUnhandledException(Throwable th) {
        AbstractC2034n1.f6790a.m4144a(th);
    }

    public static void reportUserProfile(UserProfile userProfile) {
        AbstractC2034n1.f6790a.m4138a(userProfile);
    }

    public static void requestDeferredDeeplink(DeferredDeeplinkListener deferredDeeplinkListener) {
        AbstractC2034n1.f6790a.m4133a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        AbstractC2034n1.f6790a.m4134a(deferredDeeplinkParametersListener);
    }

    public static void requestStartupParams(Context context, StartupParamsCallback startupParamsCallback, List<String> list) {
        C2009m1 c2009m1 = AbstractC2034n1.f6790a;
        if (list.isEmpty()) {
            list = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);
        }
        c2009m1.m4127a(context, startupParamsCallback, list);
    }

    public static void resumeSession(Activity activity) {
        AbstractC2034n1.f6790a.m4152c(activity);
    }

    public static void sendEventsBuffer() {
        AbstractC2034n1.f6790a.m4155d();
    }

    public static void setDataSendingEnabled(boolean z2) {
        AbstractC2034n1.f6790a.m4145a(z2);
    }

    public static void setLocation(Location location) {
        AbstractC2034n1.f6790a.m4129a(location);
    }

    public static void setLocationTracking(boolean z2) {
        AbstractC2034n1.f6790a.m4150b(z2);
    }

    public static void setUserProfileID(String str) {
        AbstractC2034n1.f6790a.m4158e(str);
    }

    public static void reportAppOpen(Intent intent) {
        AbstractC2034n1.f6790a.m4128a(intent);
    }

    public static void reportError(String str, String str2, Throwable th) {
        AbstractC2034n1.f6790a.m4141a(str, str2, th);
    }

    public static void reportEvent(String str, String str2) {
        AbstractC2034n1.f6790a.m4154c(str, str2);
    }

    public static void reportAppOpen(String str) {
        AbstractC2034n1.f6790a.m4139a(str);
    }

    public static void reportError(String str, Throwable th) {
        AbstractC2034n1.f6790a.m4142a(str, th);
    }

    public static void reportEvent(String str, Map<String, Object> map) {
        AbstractC2034n1.f6790a.m4143a(str, map);
    }
}
