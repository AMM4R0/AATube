package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.Sc */
/* loaded from: classes.dex */
public final class C1522Sc extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C1622Wc f5414a;

    /* renamed from: b */
    public final /* synthetic */ AdRevenue f5415b;

    public C1522Sc(C1622Wc c1622Wc, AdRevenue adRevenue) {
        this.f5414a = c1622Wc;
        this.f5415b = adRevenue;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C1622Wc.m3497a(this.f5414a).reportAdRevenue(this.f5415b, true);
    }
}
