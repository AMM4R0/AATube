package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.me */
/* loaded from: classes.dex */
public final class RunnableC2022me implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f6757a;

    /* renamed from: b */
    public final /* synthetic */ String f6758b;

    /* renamed from: c */
    public final /* synthetic */ PluginErrorDetails f6759c;

    /* renamed from: d */
    public final /* synthetic */ C2047ne f6760d;

    public RunnableC2022me(C2047ne c2047ne, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f6760d = c2047ne;
        this.f6757a = str;
        this.f6758b = str2;
        this.f6759c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC1471Qa) this.f6760d.f6818d.get()).getPluginExtension().reportError(this.f6757a, this.f6758b, this.f6759c);
    }
}
