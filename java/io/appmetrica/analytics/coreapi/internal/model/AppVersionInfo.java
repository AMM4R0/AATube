package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.jvm.internal.AbstractC2492i;

/* loaded from: classes.dex */
public final class AppVersionInfo {

    /* renamed from: a */
    private final String f4259a;

    /* renamed from: b */
    private final String f4260b;

    public AppVersionInfo(String str, String str2) {
        this.f4259a = str;
        this.f4260b = str2;
    }

    public static /* synthetic */ AppVersionInfo copy$default(AppVersionInfo appVersionInfo, String str, String str2, int r3, Object obj) {
        if ((r3 & 1) != 0) {
            str = appVersionInfo.f4259a;
        }
        if ((r3 & 2) != 0) {
            str2 = appVersionInfo.f4260b;
        }
        return appVersionInfo.copy(str, str2);
    }

    public final String component1() {
        return this.f4259a;
    }

    public final String component2() {
        return this.f4260b;
    }

    public final AppVersionInfo copy(String str, String str2) {
        return new AppVersionInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppVersionInfo)) {
            return false;
        }
        AppVersionInfo appVersionInfo = (AppVersionInfo) obj;
        return AbstractC2492i.m4911a(this.f4259a, appVersionInfo.f4259a) && AbstractC2492i.m4911a(this.f4260b, appVersionInfo.f4260b);
    }

    public final String getAppBuildNumber() {
        return this.f4260b;
    }

    public final String getAppVersionName() {
        return this.f4259a;
    }

    public int hashCode() {
        return this.f4260b.hashCode() + (this.f4259a.hashCode() * 31);
    }

    public String toString() {
        return "AppVersionInfo(appVersionName=" + this.f4259a + ", appBuildNumber=" + this.f4260b + ')';
    }
}
