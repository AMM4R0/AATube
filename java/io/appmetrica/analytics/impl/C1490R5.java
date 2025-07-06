package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.R5 */
/* loaded from: classes.dex */
public final class C1490R5 extends BaseRequestConfig.DataSource {

    /* renamed from: a */
    public final C2354zl f5309a;

    /* renamed from: b */
    public final SdkEnvironmentProvider f5310b;

    public C1490R5(C2354zl c2354zl, SdkEnvironmentProvider sdkEnvironmentProvider, PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c2354zl.m4694f(), c2354zl.m4690b(), c2354zl.m4691c()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.f5309a = c2354zl;
        this.f5310b = sdkEnvironmentProvider;
    }
}
