package io.appmetrica.analytics.coreutils.internal.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import io.appmetrica.analytics.coreutils.impl.C1018b;
import io.appmetrica.analytics.coreutils.impl.C1019c;
import io.appmetrica.analytics.coreutils.impl.C1020d;
import io.appmetrica.analytics.coreutils.impl.C1021e;
import io.appmetrica.analytics.coreutils.impl.C1022f;
import io.appmetrica.analytics.coreutils.impl.C1023g;
import io.appmetrica.analytics.coreutils.impl.C1024h;
import io.appmetrica.analytics.coreutils.impl.C1025i;
import io.appmetrica.analytics.coreutils.impl.C1026j;
import io.appmetrica.analytics.coreutils.impl.C1027k;
import p105l1.C2636g;
import p131u1.InterfaceC2799a;

/* loaded from: classes.dex */
public final class SafePackageManager {
    /* renamed from: a */
    private static Object m2666a(Boolean bool, InterfaceC2799a interfaceC2799a) {
        try {
            Object invoke = interfaceC2799a.invoke();
            return invoke == null ? bool : invoke;
        } catch (Throwable unused) {
            return bool;
        }
    }

    public final ActivityInfo getActivityInfo(Context context, ComponentName componentName, int r4) {
        return (ActivityInfo) m2666a(null, new C1018b(context, componentName, r4));
    }

    public final ApplicationInfo getApplicationInfo(Context context, String str, int r4) {
        return (ApplicationInfo) m2666a(null, new C1019c(context, str, r4));
    }

    public final String getInstallerPackageName(Context context, String str) {
        return (String) m2666a(null, new C1020d(context, str));
    }

    public final PackageInfo getPackageInfo(Context context, String str) {
        return getPackageInfo(context, str, 0);
    }

    public final ServiceInfo getServiceInfo(Context context, ComponentName componentName, int r4) {
        return (ServiceInfo) m2666a(null, new C1022f(context, componentName, r4));
    }

    public final boolean hasSystemFeature(Context context, String str) {
        return ((Boolean) m2666a(Boolean.FALSE, new C1023g(context, str))).booleanValue();
    }

    public final ResolveInfo resolveActivity(Context context, Intent intent, int r4) {
        return (ResolveInfo) m2666a(null, new C1024h(context, intent, r4));
    }

    public final ProviderInfo resolveContentProvider(Context context, String str) {
        return (ProviderInfo) m2666a(null, new C1025i(context, str));
    }

    public final ResolveInfo resolveService(Context context, Intent intent, int r4) {
        return (ResolveInfo) m2666a(null, new C1026j(context, intent, r4));
    }

    public final C2636g setComponentEnabledSetting(Context context, ComponentName componentName, int r4, int r5) {
        return (C2636g) m2666a(null, new C1027k(context, componentName, r4, r5));
    }

    public final PackageInfo getPackageInfo(Context context, String str, int r4) {
        return (PackageInfo) m2666a(null, new C1021e(context, str, r4));
    }
}
