package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.s0 */
/* loaded from: classes.dex */
public final class C2158s0 implements InterfaceC1096Ba {

    /* renamed from: a */
    public final C1904hl f7090a;

    /* renamed from: b */
    public final C1401Nf f7091b;

    /* renamed from: c */
    public final C1748bf f7092c;

    /* renamed from: d */
    public final C1428Oh f7093d;

    /* renamed from: e */
    public final C1726ai f7094e;

    /* renamed from: f */
    public final C1218G7 f7095f;

    /* renamed from: g */
    public final C1636X1 f7096g;

    /* renamed from: h */
    public final C2128qk f7097h;

    /* renamed from: i */
    public volatile C1820ec f7098i;

    public C2158s0(Context context, InterfaceC1071Aa interfaceC1071Aa, C2272we c2272we) {
        this(context, interfaceC1071Aa, c2272we, new C2183t0(), C2312y4.m4633h());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: a */
    public final void mo2752a(AppMetricaConfig appMetricaConfig, AppMetricaConfig appMetricaConfig2) {
        C2123qf m3315a = AbstractC1521Sb.m3315a(appMetricaConfig2.apiKey);
        boolean z2 = this.f7095f.f4774f;
        if (this.f7098i != null) {
            if (m3315a.f5471b) {
                m3315a.m3358a(5, "Appmetrica already has been activated!");
                return;
            }
            return;
        }
        this.f7091b.m3119a();
        C1904hl c1904hl = this.f7090a;
        c1904hl.f6441e = m3315a;
        c1904hl.m3966b(appMetricaConfig2.customHosts);
        C1904hl c1904hl2 = this.f7090a;
        Object obj = appMetricaConfig2.additionalConfig.get("YMM_clids");
        c1904hl2.m3961a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig2.additionalConfig.get("YMM_distributionReferrer");
        this.f7090a.m3959a(str);
        if (str != null) {
            this.f7090a.m3965b("api");
        }
        C1748bf c1748bf = this.f7092c;
        synchronized (c1748bf) {
            c1748bf.m3653b(appMetricaConfig2);
            c1748bf.m3651a(appMetricaConfig2);
            c1748bf.m3655c(appMetricaConfig2);
        }
        m4407b(appMetricaConfig2, z2);
        Log.i("AppMetrica", "Activate AppMetrica with APIKey " + AbstractC2356zn.m4696a(appMetricaConfig2.apiKey));
        if (Boolean.TRUE.equals(appMetricaConfig2.logs)) {
            m3315a.f5471b = true;
            C2123qf.f6997e.f5471b = true;
        } else {
            m3315a.f5471b = false;
            C2123qf.f6997e.f5471b = false;
        }
    }

    /* renamed from: b */
    public final void m4407b(AppMetricaConfig appMetricaConfig, boolean z2) {
        C1726ai c1726ai = this.f7094e;
        Boolean bool = appMetricaConfig.locationTracking;
        Boolean bool2 = appMetricaConfig.dataSendingEnabled;
        if (AbstractC2356zn.m4700a(bool)) {
            c1726ai.f5882a.f6458b.setLocationTracking(bool.booleanValue());
        }
        if (AbstractC2356zn.m4700a(bool2)) {
            c1726ai.f5882a.f6458b.setDataSendingEnabled(bool2.booleanValue());
        } else {
            c1726ai.getClass();
        }
        C1615W5 m3457a = C1615W5.m3457a();
        C1688Z4 c1688z4 = c1726ai.f5882a;
        c1726ai.m3613a(C1726ai.m3612a(m3457a, c1688z4), c1688z4, 1, null);
        C1795dc mo3180a = this.f7093d.mo3180a(appMetricaConfig, z2);
        this.f7098i = new C1820ec(mo3180a, new C1118C7(mo3180a));
        this.f7096g.m3502a(this.f7098i.f6147b);
        C2238v5 c2238v5 = this.f7097h.f7003b;
        synchronized (c2238v5) {
            try {
                c2238v5.f7257a = mo3180a;
                Iterator it = c2238v5.f7259c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1124Cd) it.next()).consume(mo3180a);
                }
                c2238v5.f7259c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7090a.m3973i();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: c */
    public final InterfaceC1471Qa mo2759c(ReporterConfig reporterConfig) {
        return this.f7093d.mo3184b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba, io.appmetrica.analytics.impl.InterfaceC2320yc
    public final void clearAppEnvironment() {
        this.f7098i.f6146a.clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: d */
    public final String mo2760d() {
        return this.f7090a.m3967c();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: f */
    public final Map<String, String> mo2761f() {
        return this.f7090a.m3962b();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: g */
    public final AdvIdentifiersResult mo2762g() {
        return this.f7090a.m3952a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    public final C1644X9 getFeatures() {
        return this.f7090a.m3968d();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: h */
    public final C1820ec mo2763h() {
        return this.f7098i;
    }

    /* renamed from: i */
    public final C1428Oh m4408i() {
        return this.f7093d;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba, io.appmetrica.analytics.impl.InterfaceC2320yc
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f7098i.f6146a.putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba, io.appmetrica.analytics.impl.InterfaceC2320yc
    public final void setDataSendingEnabled(boolean z2) {
        this.f7098i.f6146a.setDataSendingEnabled(z2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba, io.appmetrica.analytics.impl.InterfaceC2320yc
    public final void setUserProfileID(String str) {
        this.f7098i.f6146a.setUserProfileID(str);
    }

    public C2158s0(Context context, InterfaceC1071Aa interfaceC1071Aa, C2272we c2272we, C2183t0 c2183t0, C2312y4 c2312y4) {
        C1746bd.m3649a();
        C2312y4.m4633h().m4643j().m4509a(new C1937j4(new C1808e0()));
        Handler mo2704d = interfaceC1071Aa.mo2704d();
        C1748bf m4438a = C2183t0.m4438a(context, C2183t0.m4434a(mo2704d, this));
        this.f7092c = m4438a;
        C1218G7 m4641g = c2312y4.m4641g();
        this.f7095f = m4641g;
        C1726ai m4437a = C2183t0.m4437a(m4438a, context, interfaceC1071Aa.mo2703c());
        this.f7094e = m4437a;
        m4641g.m2893a(m4437a);
        C1904hl m4439a = C2183t0.m4439a(context, m4437a, c2272we, mo2704d);
        this.f7090a = m4439a;
        this.f7096g = interfaceC1071Aa.mo2702b();
        m4437a.m3615a(m4439a);
        this.f7091b = C2183t0.m4435a(m4437a, c2272we, mo2704d);
        this.f7093d = C2183t0.m4436a(context, m4438a, m4437a, mo2704d, m4439a);
        this.f7097h = c2312y4.m4645l();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba, io.appmetrica.analytics.impl.InterfaceC1167E6
    /* renamed from: a */
    public final void mo2750a(int r2, Bundle bundle) {
        this.f7090a.m3964b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: a */
    public final void mo2754a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f7091b.m3121a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: a */
    public final void mo2753a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f7091b.m3120a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: a */
    public final void mo2755a(ReporterConfig reporterConfig) {
        this.f7093d.mo3182a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba
    /* renamed from: a */
    public final void mo2756a(StartupParamsCallback startupParamsCallback, List<String> list) {
        this.f7090a.m3957a(startupParamsCallback, list, AbstractC1794db.m3756c(this.f7092c.f5921a.getAsString("PROCESS_CFG_CLIDS")));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba, io.appmetrica.analytics.impl.InterfaceC1520Sa
    /* renamed from: a */
    public final InterfaceC1495Ra mo2749a() {
        return this.f7093d;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba, io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    public final void mo2757a(String str, String str2) {
        this.f7098i.f6146a.mo2757a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba, io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    public final void mo2751a(Location location) {
        this.f7098i.f6146a.mo2751a(location);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1096Ba, io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    public final void mo2758a(boolean z2) {
        this.f7098i.f6146a.mo2758a(z2);
    }
}
