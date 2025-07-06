package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.w5 */
/* loaded from: classes.dex */
public final class C2263w5 {

    /* renamed from: a */
    public final C2123qf f7338a;

    public C2263w5(String str) {
        this.f7338a = AbstractC1521Sb.m3315a(str);
    }

    /* renamed from: a */
    public final int m4533a(int r7) {
        if (r7 < 100) {
            this.f7338a.m3359a(5, AbstractC0002c.m13h("Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to 100, but was: ", r7, ". Default value (100) will be used"), new Object[0]);
            return 100;
        }
        if (r7 <= 10000) {
            return r7;
        }
        this.f7338a.m3359a(5, AbstractC0002c.m13h("Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to 10000, but was: ", r7, ". Default value (10000) will be used"), new Object[0]);
        return AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
    }
}
