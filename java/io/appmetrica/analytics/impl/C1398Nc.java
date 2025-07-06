package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* renamed from: io.appmetrica.analytics.impl.Nc */
/* loaded from: classes.dex */
public final class C1398Nc implements InterfaceC1437P1 {

    /* renamed from: a */
    public final /* synthetic */ ModuleServiceLifecycleObserver f5122a;

    public C1398Nc(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.f5122a = moduleServiceLifecycleObserver;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1437P1
    /* renamed from: a */
    public final void mo2867a(Intent intent) {
        this.f5122a.onFirstClientConnected();
    }
}
