package io.appmetrica.analytics.impl;

import android.app.usage.UsageStatsManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* renamed from: io.appmetrica.analytics.impl.J2 */
/* loaded from: classes.dex */
public final class C1288J2 implements FunctionWithThrowable {

    /* renamed from: a */
    public final /* synthetic */ C1885h2 f4894a;

    public C1288J2(C1885h2 c1885h2) {
        this.f4894a = c1885h2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        int appStandbyBucket;
        C1885h2 c1885h2 = this.f4894a;
        appStandbyBucket = ((UsageStatsManager) obj).getAppStandbyBucket();
        c1885h2.getClass();
        if (AndroidUtils.isApiAchieved(28)) {
            if (AndroidUtils.isApiAchieved(30) && appStandbyBucket == 45) {
                return EnumC1388N2.RESTRICTED;
            }
            if (appStandbyBucket == 10) {
                return EnumC1388N2.ACTIVE;
            }
            if (appStandbyBucket == 20) {
                return EnumC1388N2.WORKING_SET;
            }
            if (appStandbyBucket == 30) {
                return EnumC1388N2.FREQUENT;
            }
            if (appStandbyBucket == 40) {
                return EnumC1388N2.RARE;
            }
        }
        return null;
    }
}
