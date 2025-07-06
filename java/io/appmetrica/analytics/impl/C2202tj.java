package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.tj */
/* loaded from: classes.dex */
public final class C2202tj implements InterfaceC1471Qa, IPluginReporter {

    /* renamed from: a */
    public final ArrayList f7173a = new ArrayList();

    /* renamed from: b */
    public volatile C1353Lh f7174b;

    @Override // io.appmetrica.analytics.impl.InterfaceC1471Qa, io.appmetrica.analytics.impl.InterfaceC1545Ta
    /* renamed from: a */
    public final void mo3056a(C1831en c1831en) {
        m4458a(new C1827ej(c1831en));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        m4458a(new C2052nj());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        m4458a(new C1653Xi());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        m4458a(new C2027mj(str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        m4458a(new C1802dj(adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        m4458a(new C1752bj(eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        m4458a(new C2177sj(str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        m4458a(new C2102pj(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        m4458a(new C1727aj(revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        m4458a(new C1603Vi(th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        m4458a(new C1702Zi(userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        m4458a(new C1628Wi());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void sendEventsBuffer() {
        m4458a(new C2077oj());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z2) {
        m4458a(new C1777cj(z2));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        m4458a(new C1952jj(str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        m4458a(new C1678Yi(str));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1471Qa, io.appmetrica.analytics.impl.InterfaceC1545Ta
    /* renamed from: a */
    public final void mo3055a(C1559U c1559u) {
        m4458a(new C2002lj(c1559u));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z2) {
        m4458a(new C1977kj(adRevenue, z2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        m4458a(new C1578Ui(str, str2, null));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        m4458a(new C2127qj(str, str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        m4458a(new C1852fj(pluginErrorDetails));
    }

    /* renamed from: a */
    public final synchronized void m4458a(InterfaceC1446Pa interfaceC1446Pa) {
        try {
            if (this.f7174b == null) {
                this.f7173a.add(interfaceC1446Pa);
            } else {
                interfaceC1446Pa.mo3202a(this.f7174b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        m4458a(new C1578Ui(str, str2, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        m4458a(new C2152rj(str, map));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        m4458a(new C1877gj(pluginErrorDetails, str));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        m4458a(new C1927ij(moduleEvent));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        m4458a(new C1902hj(str, str2, pluginErrorDetails));
    }
}
