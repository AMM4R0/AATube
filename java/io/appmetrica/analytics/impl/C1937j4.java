package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AutoAdRevenueReporter;

/* renamed from: io.appmetrica.analytics.impl.j4 */
/* loaded from: classes.dex */
public final class C1937j4 implements ClientContext {

    /* renamed from: a */
    public final AutoAdRevenueReporter f6522a;

    public C1937j4(AutoAdRevenueReporter autoAdRevenueReporter) {
        this.f6522a = autoAdRevenueReporter;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final AutoAdRevenueReporter getAutoAdRevenueReporter() {
        return this.f6522a;
    }
}
