package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* renamed from: io.appmetrica.analytics.impl.Pc */
/* loaded from: classes.dex */
public final class C1448Pc implements ModuleServiceLifecycleController {

    /* renamed from: a */
    public final C1462Q1 f5213a;

    public C1448Pc(C1462Q1 c1462q1) {
        this.f5213a = c1462q1;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        C1462Q1 c1462q1 = this.f5213a;
        c1462q1.f5238b.put(new C1398Nc(moduleServiceLifecycleObserver), new C1337L1(c1462q1));
        C1462Q1 c1462q12 = this.f5213a;
        c1462q12.f5239c.put(new C1423Oc(moduleServiceLifecycleObserver), new C1387N1(c1462q12));
    }
}
