package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.gj */
/* loaded from: classes.dex */
public final class C1877gj implements InterfaceC1446Pa {

    /* renamed from: a */
    public final /* synthetic */ PluginErrorDetails f6332a;

    /* renamed from: b */
    public final /* synthetic */ String f6333b;

    public C1877gj(PluginErrorDetails pluginErrorDetails, String str) {
        this.f6332a = pluginErrorDetails;
        this.f6333b = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1446Pa
    /* renamed from: a */
    public final void mo3202a(InterfaceC1471Qa interfaceC1471Qa) {
        interfaceC1471Qa.getPluginExtension().reportError(this.f6332a, this.f6333b);
    }
}
