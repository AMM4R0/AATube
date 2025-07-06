package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* renamed from: io.appmetrica.analytics.impl.pc */
/* loaded from: classes.dex */
public final class C2095pc extends AbstractC1711a3 {
    public C2095pc(Context context, C1748bf c1748bf, ReporterConfig reporterConfig, C1726ai c1726ai, C1370M9 c1370m9) {
        this(context, c1726ai, new C2000lh(c1748bf, new CounterConfiguration(reporterConfig), reporterConfig.userProfileID), c1370m9, C2312y4.m4633h().m4644k(), new C1856fn(), new C1924ig(), new C2339z6(), new C1683Z(), new C1947je(c1370m9));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1711a3
    /* renamed from: i */
    public final String mo3594i() {
        return "[ManualReporter]";
    }

    public C2095pc(Context context, C1726ai c1726ai, C2000lh c2000lh, C1370M9 c1370m9, C1671Yb c1671Yb, C1856fn c1856fn, C1924ig c1924ig, C2339z6 c2339z6, C1683Z c1683z, C1947je c1947je) {
        super(context, c1726ai, c2000lh, c1370m9, c1671Yb, c1856fn, c1924ig, c2339z6, c1683z, c1947je);
        C2312y4.m4633h().getClass();
    }
}
