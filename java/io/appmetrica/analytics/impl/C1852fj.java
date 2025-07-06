package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.fj */
/* loaded from: classes.dex */
public final class C1852fj implements InterfaceC1446Pa {

    /* renamed from: a */
    public final /* synthetic */ PluginErrorDetails f6276a;

    public C1852fj(PluginErrorDetails pluginErrorDetails) {
        this.f6276a = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1446Pa
    /* renamed from: a */
    public final void mo3202a(InterfaceC1471Qa interfaceC1471Qa) {
        interfaceC1471Qa.getPluginExtension().reportUnhandledException(this.f6276a);
    }
}
