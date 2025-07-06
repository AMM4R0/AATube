package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.le */
/* loaded from: classes.dex */
public final class RunnableC1997le implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ PluginErrorDetails f6652a;

    /* renamed from: b */
    public final /* synthetic */ String f6653b;

    /* renamed from: c */
    public final /* synthetic */ C2047ne f6654c;

    public RunnableC1997le(C2047ne c2047ne, PluginErrorDetails pluginErrorDetails, String str) {
        this.f6654c = c2047ne;
        this.f6652a = pluginErrorDetails;
        this.f6653b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC1471Qa) this.f6654c.f6818d.get()).getPluginExtension().reportError(this.f6652a, this.f6653b);
    }
}
