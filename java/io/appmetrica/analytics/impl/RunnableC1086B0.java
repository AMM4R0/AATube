package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.B0 */
/* loaded from: classes.dex */
public final class RunnableC1086B0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1136D0 f4502a;

    /* renamed from: b */
    public final /* synthetic */ String f4503b;

    /* renamed from: c */
    public final /* synthetic */ String f4504c;

    /* renamed from: d */
    public final /* synthetic */ PluginErrorDetails f4505d;

    public RunnableC1086B0(C1136D0 c1136d0, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f4502a = c1136d0;
        this.f4503b = str;
        this.f4504c = str2;
        this.f4505d = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1136D0.m2810a(this.f4502a).getPluginExtension().reportError(this.f4503b, this.f4504c, this.f4505d);
    }
}
