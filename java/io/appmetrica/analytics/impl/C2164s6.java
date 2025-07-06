package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* renamed from: io.appmetrica.analytics.impl.s6 */
/* loaded from: classes.dex */
public final class C2164s6 extends AbstractC1711a3 {

    /* renamed from: o */
    public final C2189t6 f7115o;

    /* renamed from: p */
    public final C1881gn f7116p;

    public C2164s6(Context context, C1748bf c1748bf, AppMetricaConfig appMetricaConfig, C1726ai c1726ai, C1370M9 c1370m9) {
        this(context, c1726ai, new C2000lh(c1748bf, new CounterConfiguration(appMetricaConfig, EnumC1565U5.f5523h), appMetricaConfig.userProfileID), c1370m9, new C2189t6(context), new C1881gn(), C2312y4.m4633h().m4644k(), new C1856fn(), new C1924ig(), new C2339z6(), new C1683Z(), new C1947je(c1370m9));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1711a3, io.appmetrica.analytics.impl.InterfaceC1471Qa, io.appmetrica.analytics.impl.InterfaceC1545Ta
    /* renamed from: a */
    public final void mo3056a(C1831en c1831en) {
        this.f7115o.m4443a(this.f7116p.m3897a(c1831en, this.f5836b));
        m3589b(c1831en);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1711a3
    /* renamed from: i */
    public final String mo3594i() {
        return "[CrashReporter]";
    }

    /* renamed from: a */
    public final void m4412a(AppMetricaConfig appMetricaConfig) {
        m3590b(appMetricaConfig.errorEnvironment);
    }

    public C2164s6(Context context, C1726ai c1726ai, C2000lh c2000lh, C1370M9 c1370m9, C2189t6 c2189t6, C1881gn c1881gn, C1671Yb c1671Yb, C1856fn c1856fn, C1924ig c1924ig, C2339z6 c2339z6, C1683Z c1683z, C1947je c1947je) {
        super(context, c1726ai, c2000lh, c1370m9, c1671Yb, c1856fn, c1924ig, c2339z6, c1683z, c1947je);
        this.f7115o = c2189t6;
        this.f7116p = c1881gn;
        C2312y4.m4633h().getClass();
    }
}
