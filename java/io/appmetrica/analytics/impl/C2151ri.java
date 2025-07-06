package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.ri */
/* loaded from: classes.dex */
public final class C2151ri {

    /* renamed from: a */
    public final Revenue f7067a;

    /* renamed from: b */
    public final C2105pm f7068b;

    /* renamed from: c */
    public final C2305xm f7069c;

    /* renamed from: d */
    public final C2305xm f7070d;

    /* renamed from: e */
    public final C2123qf f7071e;

    public C2151ri(Revenue revenue, C2123qf c2123qf) {
        this.f7071e = c2123qf;
        this.f7067a = revenue;
        this.f7068b = new C2105pm(30720, "revenue payload", c2123qf);
        this.f7069c = new C2305xm(new C2105pm(184320, "receipt data", c2123qf), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f7070d = new C2305xm(new C2155rm(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "receipt signature", c2123qf), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
