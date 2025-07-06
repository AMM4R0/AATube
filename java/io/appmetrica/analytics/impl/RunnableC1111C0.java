package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.C0 */
/* loaded from: classes.dex */
public final class RunnableC1111C0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1136D0 f4557a;

    /* renamed from: b */
    public final /* synthetic */ PluginErrorDetails f4558b;

    public RunnableC1111C0(C1136D0 c1136d0, PluginErrorDetails pluginErrorDetails) {
        this.f4557a = c1136d0;
        this.f4558b = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1136D0.m2810a(this.f4557a).getPluginExtension().reportUnhandledException(this.f4558b);
    }
}
