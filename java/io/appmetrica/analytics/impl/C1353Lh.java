package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Lh */
/* loaded from: classes.dex */
public final class C1353Lh implements InterfaceC1471Qa {

    /* renamed from: a */
    public final C2133r0 f5004a;

    /* renamed from: b */
    public final C1900hh f5005b;

    /* renamed from: c */
    public final ICommonExecutor f5006c;

    /* renamed from: d */
    public final Context f5007d;

    /* renamed from: e */
    public final ReporterConfig f5008e;

    /* renamed from: f */
    public final C1577Uh f5009f;

    /* renamed from: g */
    public final C2047ne f5010g;

    public C1353Lh(ICommonExecutor iCommonExecutor, Context context, String str) {
        this(iCommonExecutor, context.getApplicationContext(), str, new C2133r0());
    }

    /* renamed from: a */
    public static InterfaceC1471Qa m3053a(C2133r0 c2133r0, Context context, ReporterConfig reporterConfig) {
        c2133r0.getClass();
        return C2108q0.m4314a(context).m4334e().mo2759c(reporterConfig);
    }

    /* renamed from: c */
    public final void m3057c(String str) {
        ReporterConfig build = ReporterConfig.newConfigBuilder(str).build();
        this.f5005b.getClass();
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC2325yh(this, build));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.f5005b.getClass();
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC1253Hh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this.f5010g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f5005b.getClass();
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC2125qh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f5005b.getClass();
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC1228Gh(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        this.f5005b.f6422h.mo2706a(adRevenue);
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC2225uh(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.f5005b.f6423i.mo2706a(eCommerceEvent);
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC2250vh(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        this.f5005b.f6416b.mo2706a(str);
        this.f5009f.getClass();
        if (th == null) {
            th = new C1511S1();
            th.fillInStackTrace();
        }
        this.f5006c.execute(new RunnableC2025mh(this, str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.f5005b.f6415a.mo2706a(str);
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC1278Ih(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        this.f5005b.f6421g.mo2706a(revenue);
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC2200th(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        this.f5005b.f6419e.mo2706a(th);
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC2075oh(this, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        this.f5005b.f6420f.mo2706a(userProfile);
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC2175sh(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.f5005b.getClass();
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC2100ph(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void sendEventsBuffer() {
        this.f5005b.getClass();
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC1203Fh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z2) {
        this.f5005b.getClass();
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC2300xh(this, z2));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        this.f5005b.getClass();
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC1103Bh(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        this.f5005b.getClass();
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC2150rh(this, str));
    }

    public C1353Lh(ICommonExecutor iCommonExecutor, Context context, String str, C2133r0 c2133r0) {
        this(iCommonExecutor, context, new C1900hh(), c2133r0, new C1577Uh(), ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1471Qa, io.appmetrica.analytics.impl.InterfaceC1545Ta
    /* renamed from: a */
    public final void mo3056a(C1831en c1831en) {
        this.f5005b.f6418d.mo2706a(c1831en);
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC1153Dh(this, c1831en));
    }

    public C1353Lh(ICommonExecutor iCommonExecutor, Context context, C1900hh c1900hh, C2133r0 c2133r0, C1577Uh c1577Uh, ReporterConfig reporterConfig) {
        this(iCommonExecutor, context, c1900hh, c2133r0, c1577Uh, reporterConfig, new C2047ne(iCommonExecutor, new C2275wh(c2133r0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z2) {
        this.f5005b.f6422h.mo2706a(adRevenue);
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC1128Ch(this, adRevenue, z2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.f5005b.f6415a.mo2706a(str);
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC1303Jh(this, str, str2));
    }

    public C1353Lh(ICommonExecutor iCommonExecutor, Context context, C1900hh c1900hh, C2133r0 c2133r0, C1577Uh c1577Uh, ReporterConfig reporterConfig, C2047ne c2047ne) {
        this.f5006c = iCommonExecutor;
        this.f5007d = context;
        this.f5005b = c1900hh;
        this.f5004a = c2133r0;
        this.f5009f = c1577Uh;
        this.f5008e = reporterConfig;
        this.f5010g = c2047ne;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        this.f5005b.f6417c.mo2706a(str);
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC2050nh(this, str, str2, th));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1471Qa, io.appmetrica.analytics.impl.InterfaceC1545Ta
    /* renamed from: a */
    public final void mo3055a(C1559U c1559u) {
        this.f5005b.getClass();
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC1178Eh(this, c1559u));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        this.f5005b.f6415a.mo2706a(str);
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC1328Kh(this, str, CollectionUtils.getListFromMap(map)));
    }

    /* renamed from: a */
    public final void m3054a(ReporterConfig reporterConfig) {
        this.f5005b.getClass();
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC2350zh(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        this.f5005b.getClass();
        this.f5009f.getClass();
        this.f5006c.execute(new RunnableC1078Ah(this, moduleEvent));
    }
}
