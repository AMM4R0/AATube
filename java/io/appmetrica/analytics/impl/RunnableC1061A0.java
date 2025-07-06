package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.A0 */
/* loaded from: classes.dex */
public final class RunnableC1061A0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1136D0 f4443a;

    /* renamed from: b */
    public final /* synthetic */ PluginErrorDetails f4444b;

    /* renamed from: c */
    public final /* synthetic */ String f4445c;

    public RunnableC1061A0(C1136D0 c1136d0, PluginErrorDetails pluginErrorDetails, String str) {
        this.f4443a = c1136d0;
        this.f4444b = pluginErrorDetails;
        this.f4445c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1136D0.m2810a(this.f4443a).getPluginExtension().reportError(this.f4444b, this.f4445c);
    }
}
