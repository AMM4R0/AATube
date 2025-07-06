package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.r4 */
/* loaded from: classes.dex */
public final class C2137r4 {

    /* renamed from: a */
    public final IdentifiersResult f7016a;

    /* renamed from: b */
    public final IdentifiersResult f7017b;

    /* renamed from: c */
    public final IdentifiersResult f7018c;

    /* renamed from: d */
    public final IdentifiersResult f7019d;

    /* renamed from: e */
    public final IdentifiersResult f7020e;

    /* renamed from: f */
    public final IdentifiersResult f7021f;

    /* renamed from: g */
    public final IdentifiersResult f7022g;

    /* renamed from: h */
    public final IdentifiersResult f7023h;

    /* renamed from: i */
    public final IdentifiersResult f7024i;

    /* renamed from: j */
    public final IdentifiersResult f7025j;

    /* renamed from: k */
    public final IdentifiersResult f7026k;

    /* renamed from: l */
    public final long f7027l;

    /* renamed from: m */
    public final long f7028m;

    /* renamed from: n */
    public final C1594V9 f7029n;

    public C2137r4(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2, IdentifiersResult identifiersResult3, IdentifiersResult identifiersResult4, IdentifiersResult identifiersResult5, IdentifiersResult identifiersResult6, IdentifiersResult identifiersResult7, IdentifiersResult identifiersResult8, IdentifiersResult identifiersResult9, IdentifiersResult identifiersResult10, IdentifiersResult identifiersResult11, long j2, long j3, C1594V9 c1594v9) {
        this.f7016a = identifiersResult;
        this.f7017b = identifiersResult2;
        this.f7018c = identifiersResult3;
        this.f7019d = identifiersResult4;
        this.f7020e = identifiersResult5;
        this.f7021f = identifiersResult6;
        this.f7022g = identifiersResult7;
        this.f7023h = identifiersResult8;
        this.f7024i = identifiersResult9;
        this.f7025j = identifiersResult10;
        this.f7026k = identifiersResult11;
        this.f7027l = j2;
        this.f7028m = j3;
        this.f7029n = c1594v9;
    }

    /* renamed from: a */
    public static IdentifiersResult m4367a(Bundle bundle, String str) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle(str);
        ClassLoader classLoader = IdentifiersResult.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        IdentifiersResult identifiersResult = (IdentifiersResult) parcelable;
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : identifiersResult;
    }

    /* renamed from: b */
    public final void m4369b(Bundle bundle) {
        IdentifiersResult identifiersResult = this.f7016a;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("value", identifiersResult);
        bundle.putBundle("Uuid", bundle2);
        IdentifiersResult identifiersResult2 = this.f7017b;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("value", identifiersResult2);
        bundle.putBundle("DeviceId", bundle3);
        IdentifiersResult identifiersResult3 = this.f7018c;
        Bundle bundle4 = new Bundle();
        bundle4.putParcelable("value", identifiersResult3);
        bundle.putBundle("DeviceIdHash", bundle4);
        IdentifiersResult identifiersResult4 = this.f7019d;
        Bundle bundle5 = new Bundle();
        bundle5.putParcelable("value", identifiersResult4);
        bundle.putBundle("AdUrlReport", bundle5);
        IdentifiersResult identifiersResult5 = this.f7020e;
        Bundle bundle6 = new Bundle();
        bundle6.putParcelable("value", identifiersResult5);
        bundle.putBundle("AdUrlGet", bundle6);
        IdentifiersResult identifiersResult6 = this.f7021f;
        Bundle bundle7 = new Bundle();
        bundle7.putParcelable("value", identifiersResult6);
        bundle.putBundle("Clids", bundle7);
        IdentifiersResult identifiersResult7 = this.f7022g;
        Bundle bundle8 = new Bundle();
        bundle8.putParcelable("value", identifiersResult7);
        bundle.putBundle("RequestClids", bundle8);
        IdentifiersResult identifiersResult8 = this.f7023h;
        Bundle bundle9 = new Bundle();
        bundle9.putParcelable("value", identifiersResult8);
        bundle.putBundle("GAID", bundle9);
        IdentifiersResult identifiersResult9 = this.f7024i;
        Bundle bundle10 = new Bundle();
        bundle10.putParcelable("value", identifiersResult9);
        bundle.putBundle("HOAID", bundle10);
        IdentifiersResult identifiersResult10 = this.f7025j;
        Bundle bundle11 = new Bundle();
        bundle11.putParcelable("value", identifiersResult10);
        bundle.putBundle("YANDEX_ADV_ID", bundle11);
        IdentifiersResult identifiersResult11 = this.f7026k;
        Bundle bundle12 = new Bundle();
        bundle12.putParcelable("value", identifiersResult11);
        bundle.putBundle("CUSTOM_SDK_HOSTS", bundle12);
        bundle.putLong("ServerTimeOffset", this.f7027l);
        bundle.putLong("NextStartupTime", this.f7028m);
        C1594V9 c1594v9 = this.f7029n;
        Bundle bundle13 = new Bundle();
        bundle13.putParcelable("value", c1594v9);
        bundle.putBundle("features", bundle13);
    }

    public final String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f7016a + ", mDeviceIdData=" + this.f7017b + ", mDeviceIdHashData=" + this.f7018c + ", mReportAdUrlData=" + this.f7019d + ", mGetAdUrlData=" + this.f7020e + ", mResponseClidsData=" + this.f7021f + ", mClientClidsForRequestData=" + this.f7022g + ", mGaidData=" + this.f7023h + ", mHoaidData=" + this.f7024i + ", yandexAdvIdData=" + this.f7025j + ", customSdkHostsData=" + this.f7026k + ", customSdkHosts=" + this.f7026k + ", mServerTimeOffset=" + this.f7027l + ", nextStartupTime=" + this.f7028m + ", features=" + this.f7029n + '}';
    }

    /* renamed from: a */
    public static C1594V9 m4365a(Bundle bundle) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle("features");
        ClassLoader classLoader = C1594V9.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        C1594V9 c1594v9 = (C1594V9) parcelable;
        return c1594v9 == null ? new C1594V9(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : c1594v9;
    }

    /* renamed from: a */
    public static IdentifiersResult m4368a(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        return new IdentifiersResult(str, isEmpty ? IdentifierStatus.UNKNOWN : IdentifierStatus.OK, isEmpty ? "no identifier in startup state" : null);
    }

    /* renamed from: a */
    public static C1594V9 m4366a(Boolean bool) {
        boolean z2 = bool != null;
        return new C1594V9(bool, z2 ? IdentifierStatus.OK : IdentifierStatus.UNKNOWN, z2 ? null : "no identifier in startup state");
    }
}
