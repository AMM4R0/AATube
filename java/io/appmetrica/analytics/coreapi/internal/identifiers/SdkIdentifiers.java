package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.AbstractC2492i;

/* loaded from: classes.dex */
public final class SdkIdentifiers {

    /* renamed from: a */
    private final String f4256a;

    /* renamed from: b */
    private final String f4257b;

    /* renamed from: c */
    private final String f4258c;

    public SdkIdentifiers(String str, String str2, String str3) {
        this.f4256a = str;
        this.f4257b = str2;
        this.f4258c = str3;
    }

    public static /* synthetic */ SdkIdentifiers copy$default(SdkIdentifiers sdkIdentifiers, String str, String str2, String str3, int r4, Object obj) {
        if ((r4 & 1) != 0) {
            str = sdkIdentifiers.f4256a;
        }
        if ((r4 & 2) != 0) {
            str2 = sdkIdentifiers.f4257b;
        }
        if ((r4 & 4) != 0) {
            str3 = sdkIdentifiers.f4258c;
        }
        return sdkIdentifiers.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f4256a;
    }

    public final String component2() {
        return this.f4257b;
    }

    public final String component3() {
        return this.f4258c;
    }

    public final SdkIdentifiers copy(String str, String str2, String str3) {
        return new SdkIdentifiers(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkIdentifiers)) {
            return false;
        }
        SdkIdentifiers sdkIdentifiers = (SdkIdentifiers) obj;
        return AbstractC2492i.m4911a(this.f4256a, sdkIdentifiers.f4256a) && AbstractC2492i.m4911a(this.f4257b, sdkIdentifiers.f4257b) && AbstractC2492i.m4911a(this.f4258c, sdkIdentifiers.f4258c);
    }

    public final String getDeviceId() {
        return this.f4257b;
    }

    public final String getDeviceIdHash() {
        return this.f4258c;
    }

    public final String getUuid() {
        return this.f4256a;
    }

    public int hashCode() {
        String str = this.f4256a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f4257b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f4258c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SdkIdentifiers(uuid=" + this.f4256a + ", deviceId=" + this.f4257b + ", deviceIdHash=" + this.f4258c + ')';
    }
}
