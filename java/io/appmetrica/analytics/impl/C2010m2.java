package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.m2 */
/* loaded from: classes.dex */
public final class C2010m2 implements InterfaceC2114q6 {
    @Override // io.appmetrica.analytics.impl.InterfaceC2114q6
    /* renamed from: a */
    public final InterfaceC1171Ea mo2941a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC1520Sa interfaceC1520Sa) {
        return new C1925ih(new C1621Wb(interfaceC1520Sa, appMetricaConfig), C1985l2.f6614a, appMetricaConfig.crashTransformer, new C1370M9(context));
    }
}
