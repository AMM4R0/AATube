package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.p097io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.dc */
/* loaded from: classes.dex */
public final class C1795dc extends AbstractC1711a3 implements InterfaceC1246Ha {

    /* renamed from: u */
    public static final C1532Sm f6090u = new C1532Sm(new C1099Bd("Referral url"));

    /* renamed from: v */
    public static final Long f6091v = Long.valueOf(TimeUnit.SECONDS.toMillis(5));

    /* renamed from: o */
    public final C1960k2 f6092o;

    /* renamed from: p */
    public final C1832f f6093p;

    /* renamed from: q */
    public final C2157s f6094q;

    /* renamed from: r */
    public final AtomicBoolean f6095r;

    /* renamed from: s */
    public final C1507Rm f6096s;

    /* renamed from: t */
    public final C1946jd f6097t;

    public C1795dc(Context context, C1748bf c1748bf, AppMetricaConfig appMetricaConfig, C1726ai c1726ai, C1904hl c1904hl, C1981kn c1981kn, C1981kn c1981kn2) {
        this(context, c1748bf, appMetricaConfig, c1726ai, new C1946jd(c1748bf), c1981kn, c1981kn2, C2312y4.m4633h(), new C1370M9(context));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: a */
    public final void mo2932a(String str, boolean z2) {
        if (this.f5837c.f5471b) {
            this.f5837c.m3358a(4, "App opened via deeplink: " + WrapUtils.wrapToTag(str));
        }
        C1726ai c1726ai = this.f5842h;
        C2123qf c2123qf = this.f5837c;
        Set set = AbstractC2242v9.f7279a;
        HashMap hashMap = new HashMap();
        hashMap.put("type", "open");
        hashMap.put("link", str);
        hashMap.put("auto", Boolean.valueOf(z2));
        String m3754b = AbstractC1794db.m3754b(hashMap);
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4(m3754b, "", 8208, 0, c2123qf);
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c2000lh), c2000lh, 1, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: b */
    public final void mo2934b(String str) {
        f6090u.mo2706a(str);
        C1726ai c1726ai = this.f5842h;
        C2123qf c2123qf = this.f5837c;
        Set set = AbstractC2242v9.f7279a;
        HashMap hashMap = new HashMap();
        hashMap.put("type", "referral");
        hashMap.put("link", str);
        hashMap.put("auto", Boolean.FALSE);
        String m3754b = AbstractC1794db.m3754b(hashMap);
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4(m3754b, "", 8208, 0, c2123qf);
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c2000lh), c2000lh, 1, null);
        if (this.f5837c.f5471b) {
            this.f5837c.m3358a(4, "Referral URL received: " + WrapUtils.wrapToTag(str));
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: c */
    public final void mo2935c() {
        if (this.f6095r.compareAndSet(false, true)) {
            C1832f c1832f = this.f6093p;
            c1832f.getClass();
            try {
                c1832f.f6178d.setName(C1832f.f6174h);
            } catch (SecurityException unused) {
            }
            c1832f.f6178d.start();
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: e */
    public final List<String> mo2936e() {
        return this.f5836b.f6457a.m3652b();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1711a3
    /* renamed from: i */
    public final String mo3594i() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1711a3
    /* renamed from: j */
    public final void mo3595j() {
        super.mo3595j();
        C2312y4.m4633h().m4643j().m4508a();
    }

    /* renamed from: k */
    public final void m3763k() {
        C1726ai c1726ai = this.f5842h;
        c1726ai.f5884c.m3671a(this.f5836b.f6457a);
        C1960k2 c1960k2 = this.f6092o;
        C1745bc c1745bc = new C1745bc(this);
        long longValue = f6091v.longValue();
        synchronized (c1960k2) {
            c1960k2.m4041a(c1745bc, longValue);
        }
    }

    public C1795dc(Context context, C1748bf c1748bf, AppMetricaConfig appMetricaConfig, C1726ai c1726ai, C1946jd c1946jd, C1981kn c1981kn, C1981kn c1981kn2, C2312y4 c2312y4, C1370M9 c1370m9) {
        this(context, appMetricaConfig, c1726ai, c1946jd, new C2000lh(c1748bf, new CounterConfiguration(appMetricaConfig, EnumC1565U5.f5517b), appMetricaConfig.userProfileID), new C1960k2(m3759b(appMetricaConfig)), new C2269wb(), c2312y4.m4644k(), c1981kn, c1981kn2, c2312y4.m4637c(), c1370m9, new C2157s(), new C1947je(c1370m9), new C1856fn(), new C1924ig(), new C2339z6(), new C1683Z());
    }

    public C1795dc(Context context, AppMetricaConfig appMetricaConfig, C1726ai c1726ai, C1946jd c1946jd, C2000lh c2000lh, C1960k2 c1960k2, C2269wb c2269wb, C1671Yb c1671Yb, C1981kn c1981kn, C1981kn c1981kn2, ICommonExecutor iCommonExecutor, C1370M9 c1370m9, C2157s c2157s, C1947je c1947je, C1856fn c1856fn, C1924ig c1924ig, C2339z6 c2339z6, C1683Z c1683z) {
        super(context, c1726ai, c2000lh, c1370m9, c1671Yb, c1856fn, c1924ig, c2339z6, c1683z, c1947je);
        this.f6095r = new AtomicBoolean(false);
        this.f6096s = new C1507Rm();
        this.f5836b.m4107a(m3760a(appMetricaConfig));
        this.f6092o = c1960k2;
        this.f6097t = c1946jd;
        this.f6094q = c2157s;
        m3762a(appMetricaConfig.nativeCrashReporting);
        this.f6093p = m3761a(iCommonExecutor, c2269wb, c1981kn, c1981kn2, appMetricaConfig.anrMonitoringTimeout);
        if (AbstractC2336z3.m4672a(appMetricaConfig.anrMonitoring)) {
            mo2935c();
        }
        m3763k();
        C2312y4.m4633h().getClass();
        if (this.f5837c.m3367b()) {
            this.f5837c.m3365b("Actual sessions timeout is " + m3759b(appMetricaConfig));
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: a */
    public final void mo2931a(EnumC2082p enumC2082p) {
        if (enumC2082p == EnumC2082p.f6875b) {
            if (this.f5837c.f5471b) {
                this.f5837c.m3358a(4, "Enable activity auto tracking");
            }
        } else if (this.f5837c.f5471b) {
            this.f5837c.m3358a(5, "Could not enable activity auto tracking. " + enumC2082p.f6879a);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: b */
    public final void mo2933b(Activity activity) {
        if (this.f6094q.m4406a(activity, EnumC2132r.PAUSED)) {
            if (this.f5837c.f5471b) {
                this.f5837c.m3358a(4, "Pause session");
            }
            m3591c(activity != null ? activity.getClass().getSimpleName() : null);
            C1960k2 c1960k2 = this.f6092o;
            synchronized (c1960k2) {
                Iterator it = c1960k2.f6557b.iterator();
                while (it.hasNext()) {
                    C1935j2 c1935j2 = (C1935j2) it.next();
                    if (!c1935j2.f6516d) {
                        c1935j2.f6516d = true;
                        c1935j2.f6513a.executeDelayed(c1935j2.f6517e, c1935j2.f6515c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: a */
    public final void mo2927a(Activity activity) {
        if (this.f6094q.m4406a(activity, EnumC2132r.RESUMED)) {
            if (this.f5837c.f5471b) {
                this.f5837c.m3358a(4, "Resume session");
            }
            m3593d(activity != null ? activity.getClass().getSimpleName() : null);
            C1960k2 c1960k2 = this.f6092o;
            synchronized (c1960k2) {
                Iterator it = c1960k2.f6557b.iterator();
                while (it.hasNext()) {
                    C1935j2 c1935j2 = (C1935j2) it.next();
                    if (c1935j2.f6516d) {
                        c1935j2.f6516d = false;
                        c1935j2.f6513a.remove(c1935j2.f6517e);
                        C1795dc c1795dc = c1935j2.f6514b.f5919a;
                        c1795dc.f5842h.f5884c.m3673b(c1795dc.f5836b.f6457a);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static long m3759b(AppMetricaConfig appMetricaConfig) {
        if (appMetricaConfig.sessionTimeout == null) {
            return TimeUnit.SECONDS.toMillis(10L);
        }
        return r2.intValue();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha, io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    public final void mo2751a(Location location) {
        this.f5836b.f6458b.setManualLocation(location);
        if (this.f5837c.f5471b) {
            this.f5837c.m3359a(4, "Set location: %s", location);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha, io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    public final void mo2758a(boolean z2) {
        this.f5836b.f6458b.setLocationTracking(z2);
    }

    /* renamed from: a */
    public final C1832f m3761a(ICommonExecutor iCommonExecutor, C2269wb c2269wb, C1981kn c1981kn, C1981kn c1981kn2, Integer num) {
        return new C1832f(new C1720ac(this, iCommonExecutor, c2269wb, c1981kn, c1981kn2), num);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: a */
    public final void mo2930a(C1633Wn c1633Wn) {
        C2123qf c2123qf = this.f5837c;
        synchronized (c1633Wn) {
            c1633Wn.f5675b = c2123qf;
        }
        Iterator it = c1633Wn.f5674a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(c2123qf);
        }
        c1633Wn.f5674a.clear();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: a */
    public final void mo2928a(AnrListener anrListener) {
        this.f6093p.f6175a.add(new C1770cc(anrListener));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1246Ha
    /* renamed from: a */
    public final void mo2929a(ExternalAttribution externalAttribution) {
        if (this.f5837c.f5471b) {
            this.f5837c.m3359a(4, "External attribution received: %s", externalAttribution);
        }
        C1726ai c1726ai = this.f5842h;
        byte[] bytes = externalAttribution.toBytes();
        C2123qf c2123qf = this.f5837c;
        Set set = AbstractC2242v9.f7279a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        C1987l4 c1987l4 = new C1987l4(bytes, "", 42, c2123qf);
        C2000lh c2000lh = this.f5836b;
        c1726ai.getClass();
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c2000lh), c2000lh, 1, null);
    }

    /* renamed from: a */
    public final void m3762a(Boolean bool) {
        Boolean bool2 = (Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE);
        boolean booleanValue = bool2.booleanValue();
        if (this.f5837c.f5471b) {
            this.f5837c.m3359a(4, "native crash reporting enabled: %b", bool2);
        }
        if (booleanValue) {
            C1946jd c1946jd = this.f6097t;
            Context context = this.f5835a;
            c1946jd.f6543d = new C2258w0(this.f5836b.f6458b.getApiKey(), c1946jd.f6540a.f5921a.getAsString("PROCESS_CFG_PACKAGE_NAME"), EnumC1565U5.f5517b, c1946jd.f6540a.f5921a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), c1946jd.f6540a.f5921a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.f5836b.m4109d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath == null) {
                return;
            }
            NativeCrashClientModule nativeCrashClientModule = c1946jd.f6541b;
            C2283x0 c2283x0 = c1946jd.f6542c;
            C2258w0 c2258w0 = c1946jd.f6543d;
            if (c2258w0 != null) {
                c2283x0.getClass();
                nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, C2283x0.m4592a(c2258w0)));
            } else {
                AbstractC2492i.m4918h("nativeCrashMetadata");
                throw null;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1711a3, io.appmetrica.analytics.impl.InterfaceC1246Ha, io.appmetrica.analytics.impl.InterfaceC2320yc
    /* renamed from: a */
    public final void mo2757a(String str, String str2) {
        super.mo2757a(str, str2);
        C1946jd c1946jd = this.f6097t;
        String m4109d = this.f5836b.m4109d();
        C2258w0 c2258w0 = c1946jd.f6543d;
        if (c2258w0 != null) {
            C2258w0 c2258w02 = new C2258w0(c2258w0.f7323a, c2258w0.f7324b, c2258w0.f7325c, c2258w0.f7326d, c2258w0.f7327e, m4109d);
            c1946jd.f6543d = c2258w02;
            NativeCrashClientModule nativeCrashClientModule = c1946jd.f6541b;
            c1946jd.f6542c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(C2283x0.m4592a(c2258w02));
        }
    }

    /* renamed from: a */
    public final C1599Ve m3760a(AppMetricaConfig appMetricaConfig) {
        return new C1599Ve(appMetricaConfig.preloadInfo, this.f5837c, ((Boolean) WrapUtils.getOrDefault((Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking"), Boolean.FALSE)).booleanValue());
    }
}
