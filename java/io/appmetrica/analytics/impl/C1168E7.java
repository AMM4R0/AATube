package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;

/* renamed from: io.appmetrica.analytics.impl.E7 */
/* loaded from: classes.dex */
public final class C1168E7 implements AskForPermissionStrategyModuleProvider {

    /* renamed from: a */
    public final C2321yd f4695a = new C2321yd();

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f4695a;
    }
}
