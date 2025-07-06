package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.util.Log;
import android.webkit.WebView;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.internal.p098js.AppMetricaInitializerJsInterface;
import io.appmetrica.analytics.internal.p098js.AppMetricaJsInterface;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.m1 */
/* loaded from: classes.dex */
public final class C2009m1 {

    /* renamed from: a */
    public final C2133r0 f6673a;

    /* renamed from: b */
    public final ICommonExecutor f6674b;

    /* renamed from: c */
    public final C1633Wn f6675c;

    /* renamed from: d */
    public final C1552Th f6676d;

    /* renamed from: e */
    public final C1218G7 f6677e;

    /* renamed from: f */
    public final C2353zk f6678f;

    /* renamed from: g */
    public final C1487R2 f6679g;

    /* renamed from: h */
    public final C2355zm f6680h;

    /* renamed from: i */
    public final C2128qk f6681i;

    public C2009m1(C2133r0 c2133r0, ICommonExecutor iCommonExecutor, C1487R2 c1487r2, C2353zk c2353zk, C1633Wn c1633Wn, C2355zm c2355zm, C1552Th c1552Th, C1218G7 c1218g7, C2128qk c2128qk) {
        this.f6673a = c2133r0;
        this.f6674b = iCommonExecutor;
        this.f6675c = c1633Wn;
        this.f6676d = c1552Th;
        this.f6677e = c1218g7;
        this.f6679g = c1487r2;
        this.f6680h = c2355zm;
        this.f6678f = c2353zk;
        this.f6681i = c2128qk;
    }

    /* renamed from: a */
    public final void m4125a(Context context, AppMetricaConfig appMetricaConfig) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5275f.mo2706a(context);
        c1487r2.f5271b.mo2706a(appMetricaConfig);
        C2355zm c2355zm = this.f6680h;
        Context applicationContext = context.getApplicationContext();
        c2355zm.f7569e.m3080a(applicationContext);
        C2123qf m3315a = AbstractC1521Sb.m3315a(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            if (m3315a.f5471b) {
                m3315a.m3358a(4, "Session auto tracking enabled");
            }
            C2128qk c2128qk = c2355zm.f7568d;
            c2128qk.f7002a.m4310a(c2128qk.f7004c, EnumC2032n.RESUMED);
            c2128qk.f7002a.m4310a(c2128qk.f7005d, EnumC2032n.PAUSED);
            EnumC2082p enumC2082p = c2128qk.f7002a.f6952b;
        } else if (m3315a.f5471b) {
            m3315a.m3358a(4, "Session auto tracking disabled");
        }
        c2355zm.f7565a.getClass();
        C2108q0 m4314a = C2108q0.m4314a(applicationContext);
        m4314a.f6959d.mo2701a(appMetricaConfig, m4314a);
        this.f6674b.execute(new RunnableC1411O0(this, context, appMetricaConfig));
        this.f6673a.getClass();
        synchronized (C2108q0.class) {
            C2108q0.f6955g = true;
        }
    }

    /* renamed from: b */
    public final String m4146b() {
        this.f6673a.getClass();
        C2108q0 c2108q0 = C2108q0.f6954f;
        if (c2108q0 == null) {
            return null;
        }
        return c2108q0.m4334e().mo2760d();
    }

    /* renamed from: c */
    public final C1820ec m4151c() {
        this.f6673a.getClass();
        return C2108q0.f6954f.m4334e().mo2763h();
    }

    /* renamed from: d */
    public final void m4155d() {
        this.f6679g.f5270a.mo2706a(null);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1684Z0(this));
    }

    /* renamed from: e */
    public final void m4158e(String str) {
        this.f6679g.getClass();
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1386N0(this, str));
    }

    /* renamed from: b */
    public final void m4148b(String str) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5288s.mo2706a(str);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1909i1(this, str));
    }

    /* renamed from: c */
    public final void m4152c(Activity activity) {
        this.f6679g.f5270a.mo2706a(null);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1834f1(this, activity));
    }

    /* renamed from: d */
    public final void m4156d(String str) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5279j.mo2706a(str);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1286J0(this, str));
    }

    public C2009m1(ICommonExecutor iCommonExecutor) {
        this(new C2133r0(), iCommonExecutor, new C1633Wn());
    }

    public C2009m1(C2133r0 c2133r0, ICommonExecutor iCommonExecutor, C1633Wn c1633Wn) {
        this(c2133r0, iCommonExecutor, new C1487R2(c2133r0), new C2353zk(c2133r0), c1633Wn, new C2355zm(c2133r0, c1633Wn), C1552Th.m3377a(), C2312y4.m4633h().m4641g(), C2312y4.m4633h().m4645l());
    }

    /* renamed from: b */
    public final void m4147b(Activity activity) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5272c.mo2706a(activity);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1211G0(this, (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", C2330ym.f7508a)));
    }

    /* renamed from: c */
    public final void m4154c(String str, String str2) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5288s.mo2706a(str);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1934j1(this, str, str2));
    }

    /* renamed from: d */
    public final void m4157d(String str, String str2) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        if (!c1487r2.f5284o.mo2706a(str).f4714a) {
            Log.w("AppMetrica", "Impossible to report event because parameters are invalid.");
        } else {
            this.f6680h.getClass();
            this.f6674b.execute(new RunnableC1635X0(this, str, str2));
        }
    }

    /* renamed from: c */
    public final void m4153c(String str) {
        if (this.f6678f.mo2706a((Void) null).f4714a && this.f6679g.f5283n.mo2706a(str).f4714a) {
            this.f6680h.getClass();
            this.f6674b.execute(new RunnableC1660Y0(this, str));
        }
    }

    /* renamed from: b */
    public final void m4150b(boolean z2) {
        this.f6679g.getClass();
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1336L0(this, z2));
    }

    /* renamed from: b */
    public final void m4149b(String str, String str2) {
        this.f6679g.f5281l.mo2706a(str);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1585V0(this, str, str2));
    }

    /* renamed from: a */
    public final void m4123a(Activity activity) {
        this.f6679g.f5270a.mo2706a(null);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1859g1(this, activity));
    }

    /* renamed from: a */
    public final void m4124a(Application application) {
        this.f6679g.f5274e.mo2706a(application);
        C2355zm c2355zm = this.f6680h;
        c2355zm.f7567c.m4308a(application);
        C2128qk c2128qk = c2355zm.f7568d;
        c2128qk.f7002a.m4310a(c2128qk.f7004c, EnumC2032n.RESUMED);
        c2128qk.f7002a.m4310a(c2128qk.f7005d, EnumC2032n.PAUSED);
        this.f6674b.execute(new RunnableC1884h1(this, c2128qk.f7002a.f6952b));
    }

    /* renamed from: a */
    public final void m4143a(String str, Map<String, Object> map) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5288s.mo2706a(str);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1959k1(this, str, CollectionUtils.getListFromMap(map)));
    }

    /* renamed from: a */
    public final void m4142a(String str, Throwable th) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5289t.mo2706a(str);
        this.f6680h.getClass();
        if (th == null) {
            th = new C1511S1();
            th.fillInStackTrace();
        }
        this.f6674b.execute(new RunnableC1984l1(this, str, th));
    }

    /* renamed from: a */
    public final void m4141a(String str, String str2, Throwable th) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5290u.mo2706a(str);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1161E0(this, str, str2, th));
    }

    /* renamed from: a */
    public final void m4144a(Throwable th) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5291v.mo2706a(th);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1186F0(this, th));
    }

    /* renamed from: a */
    public final void m4139a(String str) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5278i.mo2706a(str);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1236H0(this, str));
    }

    /* renamed from: a */
    public final void m4128a(Intent intent) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5273d.mo2706a(intent);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1261I0(this, intent));
    }

    /* renamed from: a */
    public final void m4129a(Location location) {
        this.f6679g.getClass();
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1311K0(this, location));
    }

    /* renamed from: a */
    public final void m4145a(boolean z2) {
        this.f6679g.getClass();
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1361M0(this, z2));
    }

    /* renamed from: a */
    public final void m4138a(UserProfile userProfile) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5292w.mo2706a(userProfile);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1436P0(this, userProfile));
    }

    /* renamed from: a */
    public final void m4136a(Revenue revenue) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5293x.mo2706a(revenue);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1461Q0(this, revenue));
    }

    /* renamed from: a */
    public final void m4131a(AdRevenue adRevenue) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5294y.mo2706a(adRevenue);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1485R0(this, adRevenue));
    }

    /* renamed from: a */
    public final void m4137a(ECommerceEvent eCommerceEvent) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5295z.mo2706a(eCommerceEvent);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1510S0(this, eCommerceEvent));
    }

    /* renamed from: a */
    public final void m4134a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5276g.mo2706a(deferredDeeplinkParametersListener);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1535T0(this, deferredDeeplinkParametersListener));
    }

    /* renamed from: a */
    public final void m4133a(DeferredDeeplinkListener deferredDeeplinkListener) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5276g.mo2706a(deferredDeeplinkListener);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1560U0(this, deferredDeeplinkListener));
    }

    /* renamed from: a */
    public final InterfaceC1471Qa m4120a(Context context, String str) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5275f.mo2706a(context);
        c1487r2.f5280k.mo2706a(str);
        C2355zm c2355zm = this.f6680h;
        c2355zm.f7569e.m3080a(context.getApplicationContext());
        return this.f6676d.m3378a(context.getApplicationContext(), str);
    }

    /* renamed from: a */
    public final void m4126a(Context context, ReporterConfig reporterConfig) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5275f.mo2706a(context);
        c1487r2.f5277h.mo2706a(reporterConfig);
        C2355zm c2355zm = this.f6680h;
        c2355zm.f7569e.m3080a(context.getApplicationContext());
        C1552Th c1552Th = this.f6676d;
        Context applicationContext = context.getApplicationContext();
        if (((C1353Lh) c1552Th.f5482a.get(reporterConfig.apiKey)) == null) {
            synchronized (c1552Th.f5482a) {
                try {
                    if (((C1353Lh) c1552Th.f5482a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        c1552Th.f5483b.getClass();
                        if (C2108q0.f6954f == null) {
                            c1552Th.f5484c.execute(new RunnableC1502Rh(c1552Th, applicationContext));
                        }
                        C1353Lh c1353Lh = new C1353Lh(c1552Th.f5484c, applicationContext.getApplicationContext(), str, new C2133r0());
                        c1552Th.f5482a.put(str, c1353Lh);
                        c1353Lh.m3054a(reporterConfig);
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m4130a(WebView webView) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5282m.mo2706a(webView);
        C1633Wn c1633Wn = this.f6680h.f7566b;
        c1633Wn.getClass();
        if (AndroidUtils.isApiAchieved(17)) {
            try {
                if (webView.getSettings().getJavaScriptEnabled()) {
                    webView.addJavascriptInterface(new AppMetricaJsInterface(this), "AppMetrica");
                    webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                    C1558Tn c1558Tn = new C1558Tn();
                    synchronized (c1633Wn) {
                        try {
                            C2123qf c2123qf = c1633Wn.f5675b;
                            if (c2123qf == null) {
                                c1633Wn.f5674a.add(c1558Tn);
                            } else {
                                c1558Tn.consume(c2123qf);
                            }
                        } finally {
                        }
                    }
                } else {
                    c1633Wn.m3500a(new C1583Un("WebView interface setup failed because javascript is disabled for the WebView."));
                }
            } catch (Throwable th) {
                c1633Wn.m3500a(new C1608Vn(th));
            }
        } else {
            c1633Wn.m3500a(new C1583Un("WebView interface is not available on Android < 17."));
        }
        this.f6674b.execute(new RunnableC1610W0(this));
    }

    /* renamed from: a */
    public final IdentifiersResult m4121a(Context context) {
        this.f6679g.f5285p.mo2706a(context);
        C2355zm c2355zm = this.f6680h;
        c2355zm.f7569e.m3080a(context.getApplicationContext());
        return C2312y4.m4633h().m4634a(context.getApplicationContext()).m3764a();
    }

    /* renamed from: a */
    public final void m4140a(String str, String str2) {
        this.f6679g.getClass();
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1709a1(this, str, str2));
    }

    /* renamed from: a */
    public final void m4122a() {
        this.f6679g.getClass();
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1734b1(this));
    }

    /* renamed from: a */
    public final void m4127a(Context context, StartupParamsCallback startupParamsCallback, List<String> list) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5275f.mo2706a(context);
        c1487r2.f5285p.mo2706a(startupParamsCallback);
        C2355zm c2355zm = this.f6680h;
        c2355zm.f7569e.m3080a(context.getApplicationContext());
        this.f6674b.execute(new RunnableC1759c1(this, context, startupParamsCallback, list));
    }

    /* renamed from: a */
    public final void m4132a(AnrListener anrListener) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5286q.mo2706a(anrListener);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1784d1(this, anrListener));
    }

    /* renamed from: a */
    public final void m4135a(ExternalAttribution externalAttribution) {
        C1487R2 c1487r2 = this.f6679g;
        c1487r2.f5270a.mo2706a(null);
        c1487r2.f5287r.mo2706a(externalAttribution);
        this.f6680h.getClass();
        this.f6674b.execute(new RunnableC1809e1(this, externalAttribution));
    }

    /* renamed from: a */
    public static InterfaceC1246Ha m4119a(C2009m1 c2009m1) {
        return c2009m1.m4151c().f6146a;
    }
}
