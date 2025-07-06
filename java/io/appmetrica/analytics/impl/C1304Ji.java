package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.model.SdkInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.Ji */
/* loaded from: classes.dex */
public final class C1304Ji implements SdkEnvironmentProvider {

    /* renamed from: a */
    public final Context f4925a;

    /* renamed from: b */
    public final C2344zb f4926b = new C2344zb();

    /* renamed from: c */
    public final CopyOnWriteArrayList f4927c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public SdkEnvironment f4928d;

    /* renamed from: e */
    public String f4929e;

    public C1304Ji(Context context) {
        this.f4925a = context;
        this.f4928d = new SdkEnvironment(new AppVersionInfo(PackageManagerUtils.getAppVersionName(context), PackageManagerUtils.getAppVersionCodeString(context)), FrameworkDetector.framework(), new ScreenInfo(0, 0, 0, 0.0f), new SdkInfo("6.5.0", "50073468", AbstractC1329Ki.m3024a()), "phone", C2344zb.m4682a(context.getResources().getConfiguration()));
    }

    /* renamed from: a */
    public final synchronized void m2989a(ScreenInfo screenInfo) {
        float f;
        if (screenInfo != null) {
            try {
                if (!screenInfo.equals(getSdkEnvironment().getScreenInfo())) {
                    String str = this.f4929e;
                    if (str == null) {
                        Context context = this.f4925a;
                        Point point = new Point(screenInfo.getWidth(), screenInfo.getHeight());
                        SafePackageManager safePackageManager = AbstractC1872ge.f6323a;
                        try {
                            f = context.getResources().getDisplayMetrics().density;
                        } catch (Throwable unused) {
                            f = 0.0f;
                        }
                        if (f == 0.0f) {
                            str = "phone";
                        } else {
                            float f2 = point.x;
                            float f3 = point.y;
                            float min = Math.min(f2 / f, f3 / f);
                            float f4 = f * 160.0f;
                            float f5 = f2 / f4;
                            float f6 = f3 / f4;
                            double sqrt = Math.sqrt((f6 * f6) + (f5 * f5));
                            if (sqrt < 15.0d || AbstractC1872ge.f6323a.hasSystemFeature(context, "android.hardware.touchscreen")) {
                                if (sqrt < 7.0d && min < 600.0f) {
                                    str = "phone";
                                }
                                str = "tablet";
                            } else {
                                str = "tv";
                            }
                        }
                    }
                    this.f4928d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, screenInfo, null, str, null, 43, null);
                    Iterator it = this.f4927c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC2288x5) ((InterfaceC1279Ii) it.next())).m4603d();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m2993b(InterfaceC1279Ii interfaceC1279Ii) {
        this.f4927c.remove(interfaceC1279Ii);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider
    public final SdkEnvironment getSdkEnvironment() {
        SdkEnvironment sdkEnvironment = this.f4928d;
        if (sdkEnvironment != null) {
            return sdkEnvironment;
        }
        AbstractC2492i.m4918h("sdkEnvironment");
        throw null;
    }

    /* renamed from: a */
    public final synchronized void m2991a(String str) {
        if (str != null) {
            if (!str.equals(this.f4929e)) {
                this.f4929e = str;
                if (!str.equals(getSdkEnvironment().getDeviceType())) {
                    this.f4928d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, str, null, 47, null);
                    Iterator it = this.f4927c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC2288x5) ((InterfaceC1279Ii) it.next())).m4603d();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m2992a(String str, String str2) {
        if (str == null) {
            try {
                str = getSdkEnvironment().getAppVersionInfo().getAppVersionName();
            } finally {
            }
        }
        if (str2 == null) {
            str2 = getSdkEnvironment().getAppVersionInfo().getAppBuildNumber();
        }
        AppVersionInfo appVersionInfo = getSdkEnvironment().getAppVersionInfo();
        if (!AbstractC2492i.m4911a(appVersionInfo.getAppVersionName(), str) || !AbstractC2492i.m4911a(appVersionInfo.getAppBuildNumber(), str2)) {
            this.f4928d = SdkEnvironment.copy$default(getSdkEnvironment(), new AppVersionInfo(str, str2), null, null, null, null, null, 62, null);
            Iterator it = this.f4927c.iterator();
            while (it.hasNext()) {
                ((AbstractC2288x5) ((InterfaceC1279Ii) it.next())).m4603d();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m2988a(Configuration configuration) {
        this.f4926b.getClass();
        List m4682a = C2344zb.m4682a(configuration);
        if (!AbstractC2492i.m4911a(getSdkEnvironment().getLocales(), m4682a)) {
            this.f4928d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, null, m4682a, 31, null);
            Iterator it = this.f4927c.iterator();
            while (it.hasNext()) {
                ((AbstractC2288x5) ((InterfaceC1279Ii) it.next())).m4603d();
            }
        }
    }

    /* renamed from: a */
    public final void m2990a(InterfaceC1279Ii interfaceC1279Ii) {
        this.f4927c.add(interfaceC1279Ii);
    }
}
