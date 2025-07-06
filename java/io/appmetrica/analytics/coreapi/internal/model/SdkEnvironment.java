package io.appmetrica.analytics.coreapi.internal.model;

import java.util.List;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;

/* loaded from: classes.dex */
public final class SdkEnvironment {

    /* renamed from: a */
    private final AppVersionInfo f4265a;

    /* renamed from: b */
    private final String f4266b;

    /* renamed from: c */
    private final ScreenInfo f4267c;

    /* renamed from: d */
    private final SdkInfo f4268d;

    /* renamed from: e */
    private final String f4269e;

    /* renamed from: f */
    private final List f4270f;

    public SdkEnvironment(AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List<String> list) {
        this.f4265a = appVersionInfo;
        this.f4266b = str;
        this.f4267c = screenInfo;
        this.f4268d = sdkInfo;
        this.f4269e = str2;
        this.f4270f = list;
    }

    public static /* synthetic */ SdkEnvironment copy$default(SdkEnvironment sdkEnvironment, AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List list, int r11, Object obj) {
        if ((r11 & 1) != 0) {
            appVersionInfo = sdkEnvironment.f4265a;
        }
        if ((r11 & 2) != 0) {
            str = sdkEnvironment.f4266b;
        }
        String str3 = str;
        if ((r11 & 4) != 0) {
            screenInfo = sdkEnvironment.f4267c;
        }
        ScreenInfo screenInfo2 = screenInfo;
        if ((r11 & 8) != 0) {
            sdkInfo = sdkEnvironment.f4268d;
        }
        SdkInfo sdkInfo2 = sdkInfo;
        if ((r11 & 16) != 0) {
            str2 = sdkEnvironment.f4269e;
        }
        String str4 = str2;
        if ((r11 & 32) != 0) {
            list = sdkEnvironment.f4270f;
        }
        return sdkEnvironment.copy(appVersionInfo, str3, screenInfo2, sdkInfo2, str4, list);
    }

    public final AppVersionInfo component1() {
        return this.f4265a;
    }

    public final String component2() {
        return this.f4266b;
    }

    public final ScreenInfo component3() {
        return this.f4267c;
    }

    public final SdkInfo component4() {
        return this.f4268d;
    }

    public final String component5() {
        return this.f4269e;
    }

    public final List<String> component6() {
        return this.f4270f;
    }

    public final SdkEnvironment copy(AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List<String> list) {
        return new SdkEnvironment(appVersionInfo, str, screenInfo, sdkInfo, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkEnvironment)) {
            return false;
        }
        SdkEnvironment sdkEnvironment = (SdkEnvironment) obj;
        return AbstractC2492i.m4911a(this.f4265a, sdkEnvironment.f4265a) && AbstractC2492i.m4911a(this.f4266b, sdkEnvironment.f4266b) && AbstractC2492i.m4911a(this.f4267c, sdkEnvironment.f4267c) && AbstractC2492i.m4911a(this.f4268d, sdkEnvironment.f4268d) && AbstractC2492i.m4911a(this.f4269e, sdkEnvironment.f4269e) && AbstractC2492i.m4911a(this.f4270f, sdkEnvironment.f4270f);
    }

    public final String getAppFramework() {
        return this.f4266b;
    }

    public final AppVersionInfo getAppVersionInfo() {
        return this.f4265a;
    }

    public final String getDeviceType() {
        return this.f4269e;
    }

    public final List<String> getLocales() {
        return this.f4270f;
    }

    public final ScreenInfo getScreenInfo() {
        return this.f4267c;
    }

    public final SdkInfo getSdkInfo() {
        return this.f4268d;
    }

    public int hashCode() {
        return this.f4270f.hashCode() + AbstractC0002c.m9d(this.f4269e, (this.f4268d.hashCode() + ((this.f4267c.hashCode() + AbstractC0002c.m9d(this.f4266b, this.f4265a.hashCode() * 31, 31)) * 31)) * 31, 31);
    }

    public String toString() {
        return "SdkEnvironment(appVersionInfo=" + this.f4265a + ", appFramework=" + this.f4266b + ", screenInfo=" + this.f4267c + ", sdkInfo=" + this.f4268d + ", deviceType=" + this.f4269e + ", locales=" + this.f4270f + ')';
    }
}
