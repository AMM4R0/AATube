package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: io.appmetrica.analytics.impl.S5 */
/* loaded from: classes.dex */
public abstract class AbstractC1515S5 extends BaseRequestConfig.ComponentLoader {

    /* renamed from: a */
    public final SafePackageManager f5403a;

    public AbstractC1515S5(Context context, String str) {
        this(context, str, new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1540T5 load(C1490R5 c1490r5) {
        C1540T5 c1540t5 = (C1540T5) super.load((AbstractC1515S5) c1490r5);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.f5403a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int r12 = applicationInfo.flags;
            c1540t5.f5463a = (r12 & 2) != 0 ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            c1540t5.f5464b = (r12 & 1) == 0 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else if (TextUtils.equals(packageName, getPackageName())) {
            c1540t5.f5463a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            c1540t5.f5464b = (getContext().getApplicationInfo().flags & 1) == 0 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else {
            c1540t5.f5463a = CommonUrlParts.Values.FALSE_INTEGER;
            c1540t5.f5464b = CommonUrlParts.Values.FALSE_INTEGER;
        }
        C2354zl c2354zl = c1490r5.f5309a;
        c1540t5.f5465c = c2354zl;
        c1540t5.setRetryPolicyConfig(c2354zl.f7558t);
        return c1540t5;
    }

    public AbstractC1515S5(Context context, String str, SafePackageManager safePackageManager) {
        super(context, str);
        this.f5403a = safePackageManager;
    }
}
