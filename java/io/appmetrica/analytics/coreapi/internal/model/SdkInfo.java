package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;

/* loaded from: classes.dex */
public final class SdkInfo {

    /* renamed from: a */
    private final String f4271a;

    /* renamed from: b */
    private final String f4272b;

    /* renamed from: c */
    private final String f4273c;

    public SdkInfo(String str, String str2, String str3) {
        this.f4271a = str;
        this.f4272b = str2;
        this.f4273c = str3;
    }

    public static /* synthetic */ SdkInfo copy$default(SdkInfo sdkInfo, String str, String str2, String str3, int r4, Object obj) {
        if ((r4 & 1) != 0) {
            str = sdkInfo.f4271a;
        }
        if ((r4 & 2) != 0) {
            str2 = sdkInfo.f4272b;
        }
        if ((r4 & 4) != 0) {
            str3 = sdkInfo.f4273c;
        }
        return sdkInfo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f4271a;
    }

    public final String component2() {
        return this.f4272b;
    }

    public final String component3() {
        return this.f4273c;
    }

    public final SdkInfo copy(String str, String str2, String str3) {
        return new SdkInfo(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkInfo)) {
            return false;
        }
        SdkInfo sdkInfo = (SdkInfo) obj;
        return AbstractC2492i.m4911a(this.f4271a, sdkInfo.f4271a) && AbstractC2492i.m4911a(this.f4272b, sdkInfo.f4272b) && AbstractC2492i.m4911a(this.f4273c, sdkInfo.f4273c);
    }

    public final String getSdkBuildNumber() {
        return this.f4272b;
    }

    public final String getSdkBuildType() {
        return this.f4273c;
    }

    public final String getSdkVersionName() {
        return this.f4271a;
    }

    public int hashCode() {
        return this.f4273c.hashCode() + AbstractC0002c.m9d(this.f4272b, this.f4271a.hashCode() * 31, 31);
    }

    public String toString() {
        return "SdkInfo(sdkVersionName=" + this.f4271a + ", sdkBuildNumber=" + this.f4272b + ", sdkBuildType=" + this.f4273c + ')';
    }
}
