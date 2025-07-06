package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.t1 */
/* loaded from: classes.dex */
public final class C2184t1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Configuration f7143a;

    /* renamed from: b */
    public final /* synthetic */ C1137D1 f7144b;

    public C2184t1(C1137D1 c1137d1, Configuration configuration) {
        this.f7144b = c1137d1;
        this.f7143a = configuration;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f7144b.f4621b.onConfigurationChanged(this.f7143a);
    }
}
