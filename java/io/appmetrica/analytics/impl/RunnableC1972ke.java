package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.ke */
/* loaded from: classes.dex */
public final class RunnableC1972ke implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ PluginErrorDetails f6584a;

    /* renamed from: b */
    public final /* synthetic */ C2047ne f6585b;

    public RunnableC1972ke(C2047ne c2047ne, PluginErrorDetails pluginErrorDetails) {
        this.f6585b = c2047ne;
        this.f6584a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC1471Qa) this.f6585b.f6818d.get()).getPluginExtension().reportUnhandledException(this.f6584a);
    }
}
