package io.appmetrica.analytics.internal;

import android.os.Bundle;
import io.appmetrica.analytics.impl.InterfaceC2159s1;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.internal.a */
/* loaded from: classes.dex */
public final class BinderC2357a extends IAppMetricaService.Stub {
    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(Bundle bundle) {
        InterfaceC2159s1 interfaceC2159s1;
        interfaceC2159s1 = AppMetricaService.f7570c;
        interfaceC2159s1.pauseUserSession(bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int r2, Bundle bundle) {
        InterfaceC2159s1 interfaceC2159s1;
        interfaceC2159s1 = AppMetricaService.f7570c;
        interfaceC2159s1.reportData(r2, bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(Bundle bundle) {
        InterfaceC2159s1 interfaceC2159s1;
        interfaceC2159s1 = AppMetricaService.f7570c;
        interfaceC2159s1.resumeUserSession(bundle);
    }
}
