package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.impl.AbstractC1527Sh;
import io.appmetrica.analytics.impl.C1473Qc;
import io.appmetrica.analytics.impl.C1522Sc;
import io.appmetrica.analytics.impl.C1547Tc;
import io.appmetrica.analytics.impl.C1572Uc;
import io.appmetrica.analytics.impl.C1597Vc;
import io.appmetrica.analytics.impl.C1622Wc;
import io.appmetrica.analytics.impl.C2108q0;
import io.appmetrica.analytics.impl.C2133r0;
import io.appmetrica.analytics.impl.C2312y4;

/* loaded from: classes.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* renamed from: a */
    private static C1622Wc f4128a = new C1622Wc(C2312y4.m4633h().f7478c.m4338a(), new C2133r0());

    public static IModuleReporter getModuleReporter(Context context, String str) {
        C1622Wc c1622Wc = f4128a;
        C1473Qc c1473Qc = c1622Wc.f5644c;
        c1473Qc.f5249b.mo2706a(context);
        c1473Qc.f5251d.mo2706a(str);
        c1622Wc.f5645d.f6049a.m3080a(context.getApplicationContext().getApplicationContext());
        return AbstractC1527Sh.f5430a.m3378a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        boolean z2;
        C1622Wc c1622Wc = f4128a;
        c1622Wc.f5644c.getClass();
        c1622Wc.f5645d.getClass();
        c1622Wc.f5643b.getClass();
        synchronized (C2108q0.class) {
            z2 = C2108q0.f6955g;
        }
        return z2;
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        C1622Wc c1622Wc = f4128a;
        c1622Wc.f5644c.getClass();
        c1622Wc.f5645d.getClass();
        c1622Wc.f5642a.execute(new C1522Sc(c1622Wc, adRevenue));
    }

    public static void reportEvent(ModuleEvent moduleEvent) {
        C1622Wc c1622Wc = f4128a;
        c1622Wc.f5644c.f5248a.mo2706a(null);
        c1622Wc.f5645d.getClass();
        c1622Wc.f5642a.execute(new C1547Tc(c1622Wc, moduleEvent));
    }

    public static void reportExternalAttribution(int r3, String str) {
        C1622Wc c1622Wc = f4128a;
        c1622Wc.f5644c.getClass();
        c1622Wc.f5645d.getClass();
        c1622Wc.f5642a.execute(new C1572Uc(c1622Wc, r3, str));
    }

    public static void sendEventsBuffer() {
        C1622Wc c1622Wc = f4128a;
        c1622Wc.f5644c.getClass();
        c1622Wc.f5645d.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setProxy(C1622Wc c1622Wc) {
        f4128a = c1622Wc;
    }

    public static void setSessionExtra(String str, byte[] bArr) {
        C1622Wc c1622Wc = f4128a;
        c1622Wc.f5644c.f5250c.mo2706a(str);
        c1622Wc.f5645d.getClass();
        c1622Wc.f5642a.execute(new C1597Vc(c1622Wc, str, bArr));
    }
}
