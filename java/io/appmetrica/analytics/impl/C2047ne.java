package io.appmetrica.analytics.impl;

import android.util.Log;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.ne */
/* loaded from: classes.dex */
public final class C2047ne implements IPluginReporter {

    /* renamed from: a */
    public final C2122qe f6815a = new C2122qe();

    /* renamed from: b */
    public final C2147re f6816b = new C2147re();

    /* renamed from: c */
    public final ICommonExecutor f6817c;

    /* renamed from: d */
    public final Provider f6818d;

    public C2047ne(ICommonExecutor iCommonExecutor, Provider<InterfaceC1471Qa> provider) {
        this.f6817c = iCommonExecutor;
        this.f6818d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        C2122qe c2122qe = this.f6815a;
        c2122qe.f6993a.mo2706a(pluginErrorDetails);
        if (!c2122qe.f6995c.mo2706a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f4714a) {
            Log.w("AppMetrica", "Error stacktrace must be non empty");
        } else {
            this.f6816b.getClass();
            this.f6817c.execute(new RunnableC1997le(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f6815a.f6993a.mo2706a(pluginErrorDetails);
        this.f6816b.getClass();
        this.f6817c.execute(new RunnableC1972ke(this, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f6815a.f6994b.mo2706a(str);
        this.f6816b.getClass();
        this.f6817c.execute(new RunnableC2022me(this, str, str2, pluginErrorDetails));
    }
}
