package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.hj */
/* loaded from: classes.dex */
public final class C1902hj implements InterfaceC1446Pa {

    /* renamed from: a */
    public final /* synthetic */ String f6425a;

    /* renamed from: b */
    public final /* synthetic */ String f6426b;

    /* renamed from: c */
    public final /* synthetic */ PluginErrorDetails f6427c;

    public C1902hj(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f6425a = str;
        this.f6426b = str2;
        this.f6427c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1446Pa
    /* renamed from: a */
    public final void mo3202a(InterfaceC1471Qa interfaceC1471Qa) {
        interfaceC1471Qa.getPluginExtension().reportError(this.f6425a, this.f6426b, this.f6427c);
    }
}
