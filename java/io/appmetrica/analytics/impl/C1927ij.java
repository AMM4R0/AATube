package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* renamed from: io.appmetrica.analytics.impl.ij */
/* loaded from: classes.dex */
public final class C1927ij implements InterfaceC1446Pa {

    /* renamed from: a */
    public final /* synthetic */ ModuleEvent f6498a;

    public C1927ij(ModuleEvent moduleEvent) {
        this.f6498a = moduleEvent;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1446Pa
    /* renamed from: a */
    public final void mo3202a(InterfaceC1471Qa interfaceC1471Qa) {
        interfaceC1471Qa.reportEvent(this.f6498a);
    }
}
