package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* renamed from: io.appmetrica.analytics.impl.Oc */
/* loaded from: classes.dex */
public final class C1423Oc implements InterfaceC1437P1 {

    /* renamed from: a */
    public final /* synthetic */ ModuleServiceLifecycleObserver f5166a;

    public C1423Oc(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.f5166a = moduleServiceLifecycleObserver;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1437P1
    /* renamed from: a */
    public final void mo2867a(Intent intent) {
        this.f5166a.onAllClientsDisconnected();
    }
}
