package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfiguration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ai */
/* loaded from: classes.dex */
public final class C1726ai {

    /* renamed from: a */
    public final C1688Z4 f5882a;

    /* renamed from: b */
    public final C1881gn f5883b;

    /* renamed from: c */
    public final C1751bi f5884c;

    /* renamed from: d */
    public final C1883h0 f5885d;

    /* renamed from: e */
    public InterfaceC1929il f5886e;

    /* renamed from: f */
    public final C2352zj f5887f;

    public C1726ai(C1883h0 c1883h0, C1881gn c1881gn, C1688Z4 c1688z4, C2352zj c2352zj) {
        this(c1883h0, c1881gn, c1688z4, c2352zj, new C1751bi(c1883h0, c2352zj));
    }

    /* renamed from: a */
    public final void m3614a(C1775ch c1775ch) {
        C2000lh c2000lh = c1775ch.f6054e;
        InterfaceC1929il interfaceC1929il = this.f5886e;
        if (interfaceC1929il != null) {
            c2000lh.f6458b.setUuid(((C1904hl) interfaceC1929il).m3971g());
        } else {
            c2000lh.getClass();
        }
        this.f5884c.m3672a(c1775ch);
    }

    /* renamed from: b */
    public final void m3619b(String str) {
        C1748bf c1748bf = this.f5882a.f6457a;
        synchronized (c1748bf) {
            c1748bf.f5921a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public C1726ai(C1883h0 c1883h0, C1881gn c1881gn, C1688Z4 c1688z4, C2352zj c2352zj, C1751bi c1751bi) {
        this.f5885d = c1883h0;
        this.f5882a = c1688z4;
        this.f5883b = c1881gn;
        this.f5887f = c2352zj;
        this.f5884c = c1751bi;
    }

    /* renamed from: a */
    public final void m3615a(C1904hl c1904hl) {
        this.f5886e = c1904hl;
        this.f5882a.f6458b.setUuid(c1904hl.m3971g());
    }

    /* renamed from: a */
    public final void m3613a(C1615W5 c1615w5, C2000lh c2000lh, int r9, Map map) {
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        this.f5885d.m3904b();
        if (!AbstractC2356zn.m4703a(map)) {
            c1615w5.setValue(AbstractC1794db.m3754b(map));
            m3612a(c1615w5, c2000lh);
        }
        m3614a(new C1775ch(c1615w5, false, r9, null, new C2000lh(new C1748bf(c2000lh.f6457a), new CounterConfiguration(c2000lh.f6458b), c2000lh.f6658f)));
    }

    /* renamed from: a */
    public static C1615W5 m3612a(C1615W5 c1615w5, C2000lh c2000lh) {
        if (AbstractC2242v9.f7279a.contains(Integer.valueOf(c1615w5.f5624d))) {
            c1615w5.f5623c = c2000lh.m4109d();
        }
        return c1615w5;
    }

    /* renamed from: a */
    public final void m3618a(List list) {
        C1748bf c1748bf = this.f5882a.f6457a;
        synchronized (c1748bf) {
            c1748bf.f5921a.put("PROCESS_CFG_CUSTOM_HOSTS", AbstractC1794db.m3753b(list));
        }
    }

    /* renamed from: a */
    public final void m3617a(HashMap hashMap) {
        C1748bf c1748bf = this.f5882a.f6457a;
        synchronized (c1748bf) {
            c1748bf.f5921a.put("PROCESS_CFG_CLIDS", AbstractC1794db.m3754b(hashMap));
        }
    }

    /* renamed from: a */
    public final void m3616a(String str) {
        C1748bf c1748bf = this.f5882a.f6457a;
        synchronized (c1748bf) {
            c1748bf.f5921a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }
}
