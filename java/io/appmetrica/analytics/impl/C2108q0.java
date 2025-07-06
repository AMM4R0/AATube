package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

/* renamed from: io.appmetrica.analytics.impl.q0 */
/* loaded from: classes.dex */
public final class C2108q0 implements InterfaceC1520Sa {

    /* renamed from: f */
    public static volatile C2108q0 f6954f = null;

    /* renamed from: g */
    public static volatile boolean f6955g = false;

    /* renamed from: a */
    public final Context f6956a;

    /* renamed from: b */
    public final C1933j0 f6957b;

    /* renamed from: c */
    public final FutureTask f6958c;

    /* renamed from: d */
    public final InterfaceC1071Aa f6959d;

    /* renamed from: e */
    public final C2112q4 f6960e;

    public C2108q0(Context context, C1933j0 c1933j0, C2112q4 c2112q4) {
        this(context, c1933j0, c1933j0.m4021a(context, c2112q4), c2112q4);
    }

    /* renamed from: a */
    public static C2108q0 m4314a(Context context) {
        if (f6954f == null) {
            synchronized (C2108q0.class) {
                try {
                    if (f6954f == null) {
                        f6954f = new C2108q0(context.getApplicationContext(), new C1933j0(), C2312y4.m4633h().m4639e());
                        C2108q0 c2108q0 = f6954f;
                        c2108q0.f6960e.m4339b().execute(new RunnableC2083p0(c2108q0));
                    }
                } finally {
                }
            }
        }
        return f6954f;
    }

    public static void clearAppEnvironment() {
        m4319c().clearAppEnvironment();
    }

    /* renamed from: i */
    public static synchronized boolean m4320i() {
        boolean z2;
        synchronized (C2108q0.class) {
            z2 = f6955g;
        }
        return z2;
    }

    /* renamed from: j */
    public static synchronized boolean m4321j() {
        boolean z2;
        synchronized (C2108q0.class) {
            if (f6954f != null && f6954f.f6958c.isDone()) {
                z2 = f6954f.m4334e().mo2763h() != null;
            }
        }
        return z2;
    }

    /* renamed from: k */
    public static void m4322k() {
        f6954f = null;
        f6955g = false;
    }

    /* renamed from: l */
    public static synchronized void m4323l() {
        synchronized (C2108q0.class) {
            f6955g = true;
        }
    }

    /* renamed from: m */
    public static C2108q0 m4324m() {
        return f6954f;
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        m4319c().putAppEnvironmentValue(str, str2);
    }

    public static void setDataSendingEnabled(boolean z2) {
        m4319c().setDataSendingEnabled(z2);
    }

    public static void setUserProfileID(String str) {
        m4319c().setUserProfileID(str);
    }

    /* renamed from: b */
    public final void m4330b(AppMetricaConfig appMetricaConfig) {
        this.f6959d.mo2701a(appMetricaConfig, this);
    }

    /* renamed from: c */
    public final InterfaceC1471Qa m4332c(ReporterConfig reporterConfig) {
        return m4334e().mo2759c(reporterConfig);
    }

    /* renamed from: d */
    public final String m4333d() {
        return m4334e().mo2760d();
    }

    /* renamed from: e */
    public final InterfaceC1096Ba m4334e() {
        try {
            return (InterfaceC1096Ba) this.f6958c.get();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: f */
    public final Map<String, String> m4335f() {
        return m4334e().mo2761f();
    }

    /* renamed from: g */
    public final AdvIdentifiersResult m4336g() {
        return m4334e().mo2762g();
    }

    public final C1644X9 getFeatures() {
        return m4334e().getFeatures();
    }

    /* renamed from: h */
    public final C1820ec m4337h() {
        return m4334e().mo2763h();
    }

    /* renamed from: c */
    public static InterfaceC2320yc m4319c() {
        return m4321j() ? f6954f.m4334e() : C2312y4.m4633h().f7477b;
    }

    /* renamed from: b */
    public final void m4331b(AppMetricaConfig appMetricaConfig, AppMetricaConfig appMetricaConfig2) {
        m4334e().mo2752a(appMetricaConfig, appMetricaConfig2);
    }

    public C2108q0(Context context, C1933j0 c1933j0, InterfaceC1071Aa interfaceC1071Aa, C2112q4 c2112q4) {
        this.f6956a = context;
        this.f6957b = c1933j0;
        this.f6959d = interfaceC1071Aa;
        this.f6960e = c2112q4;
        FutureTask futureTask = new FutureTask(new CallableC2008m0(this));
        this.f6958c = futureTask;
        ((C2342z9) c2112q4.m4339b()).execute(new RunnableC2033n0(context));
        ((C2342z9) c2112q4.m4339b()).execute(futureTask);
    }

    /* renamed from: b */
    public final C2337z4 m4329b() {
        return this.f6959d.mo2700a();
    }

    /* renamed from: a */
    public static void m4315a(Location location) {
        m4319c().mo2751a(location);
    }

    /* renamed from: a */
    public static void m4318a(boolean z2) {
        m4319c().mo2758a(z2);
    }

    /* renamed from: a */
    public static void m4317a(String str, String str2) {
        m4319c().mo2757a(str, str2);
    }

    /* renamed from: a */
    public final void m4326a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        m4334e().mo2754a(deferredDeeplinkParametersListener);
    }

    /* renamed from: a */
    public final void m4325a(DeferredDeeplinkListener deferredDeeplinkListener) {
        m4334e().mo2753a(deferredDeeplinkListener);
    }

    /* renamed from: a */
    public final void m4327a(ReporterConfig reporterConfig) {
        m4334e().mo2755a(reporterConfig);
    }

    /* renamed from: a */
    public final void m4328a(StartupParamsCallback startupParamsCallback, List<String> list) {
        m4334e().mo2756a(startupParamsCallback, list);
    }

    /* renamed from: a */
    public static void m4316a(C2108q0 c2108q0) {
        f6954f = c2108q0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1520Sa
    /* renamed from: a */
    public final InterfaceC1495Ra mo2749a() {
        return m4334e().mo2749a();
    }
}
