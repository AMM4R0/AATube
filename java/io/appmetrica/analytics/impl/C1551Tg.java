package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Tg */
/* loaded from: classes.dex */
public final class C1551Tg extends AbstractC2249vg {

    /* renamed from: b */
    public final C1574Ue f5478b;

    /* renamed from: c */
    public final C1409Nn f5479c;

    /* renamed from: d */
    public final SafePackageManager f5480d;

    /* renamed from: e */
    public final TimeProvider f5481e;

    public C1551Tg(C2013m5 c2013m5) {
        this(c2013m5, c2013m5.m4180u(), C2018ma.m4192h().m4210q(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2249vg
    /* renamed from: a */
    public final boolean mo2734a(C1615W5 c1615w5) {
        C2013m5 c2013m5 = this.f7308a;
        if (this.f5479c.m3144d()) {
            return false;
        }
        C1615W5 m3460a = ((C1501Rg) c2013m5.f6697l.m4598a()).f5336f ? C1615W5.m3460a(c1615w5, EnumC1670Ya.EVENT_TYPE_APP_UPDATE) : C1615W5.m3460a(c1615w5, EnumC1670Ya.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.f5480d.getInstallerPackageName(c2013m5.f6686a, c2013m5.f6687b.f6192a), ""));
            C1574Ue c1574Ue = this.f5478b;
            c1574Ue.f5210h.mo2827a(c1574Ue.f5203a);
            jSONObject.put("preloadInfo", ((C1499Re) c1574Ue.m3199c()).m3260b());
        } catch (Throwable unused) {
        }
        m3460a.setValue(jSONObject.toString());
        C1992l9 c1992l9 = c2013m5.f6700o;
        c1992l9.m4100a(m3460a, C1903hk.m3946a(c1992l9.f6638c.m3950b(m3460a), m3460a.f5629i));
        C1409Nn c1409Nn = this.f5479c;
        synchronized (c1409Nn) {
            C1434On c1434On = c1409Nn.f5142a;
            c1434On.m3194a(c1434On.m3193a().put("init_event_done", true));
        }
        this.f5479c.m3136a(this.f5481e.currentTimeMillis());
        return false;
    }

    public C1551Tg(C2013m5 c2013m5, C1409Nn c1409Nn, C1574Ue c1574Ue, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(c2013m5);
        this.f5479c = c1409Nn;
        this.f5478b = c1574Ue;
        this.f5480d = safePackageManager;
        this.f5481e = systemTimeProvider;
    }
}
