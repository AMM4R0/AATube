package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

@DoNotInline
@TargetApi(28)
/* renamed from: io.appmetrica.analytics.impl.L2 */
/* loaded from: classes.dex */
public final class C1338L2 {

    /* renamed from: a */
    public static final C1338L2 f4987a = new C1338L2();

    private C1338L2() {
    }

    /* renamed from: a */
    public static final C1413O2 m3038a(Context context, C1885h2 c1885h2) {
        return new C1413O2((EnumC1388N2) SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new C1288J2(c1885h2)), (Boolean) SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "getting is background restricted", "activityManager", C1313K2.f4939a));
    }
}
