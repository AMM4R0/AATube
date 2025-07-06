package io.appmetrica.analytics.impl;

import android.util.Log;
import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.y0 */
/* loaded from: classes.dex */
public final class C2308y0 implements AppMetricaPlugins {

    /* renamed from: a */
    public final C1136D0 f7471a;

    public C2308y0(C1136D0 c1136d0) {
        this.f7471a = c1136d0;
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        C1136D0 c1136d0 = this.f7471a;
        C2097pe c2097pe = c1136d0.f4618c;
        c2097pe.f6908a.mo2706a(null);
        c2097pe.f6909b.mo2706a(pluginErrorDetails);
        if (!c2097pe.f6911d.mo2706a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f4714a) {
            Log.w("AppMetrica", "Error stacktrace must be non empty");
            return;
        }
        C2172se c2172se = c1136d0.f4619d;
        AbstractC2492i.m4912b(pluginErrorDetails);
        c2172se.getClass();
        c1136d0.f4616a.execute(new RunnableC1061A0(c1136d0, pluginErrorDetails, str));
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        C1136D0 c1136d0 = this.f7471a;
        C2097pe c2097pe = c1136d0.f4618c;
        c2097pe.f6908a.mo2706a(null);
        c2097pe.f6909b.mo2706a(pluginErrorDetails);
        C2172se c2172se = c1136d0.f4619d;
        AbstractC2492i.m4912b(pluginErrorDetails);
        c2172se.getClass();
        c1136d0.f4616a.execute(new RunnableC1111C0(c1136d0, pluginErrorDetails));
    }

    public C2308y0() {
        this(new C1136D0(C2312y4.m4633h().m4637c()));
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        C1136D0 c1136d0 = this.f7471a;
        C2097pe c2097pe = c1136d0.f4618c;
        c2097pe.f6908a.mo2706a(null);
        c2097pe.f6910c.mo2706a(str);
        C2172se c2172se = c1136d0.f4619d;
        AbstractC2492i.m4912b(str);
        c2172se.getClass();
        c1136d0.f4616a.execute(new RunnableC1086B0(c1136d0, str, str2, pluginErrorDetails));
    }
}
