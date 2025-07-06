package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.A1 */
/* loaded from: classes.dex */
public final class C1062A1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ int f4446a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f4447b;

    /* renamed from: c */
    public final /* synthetic */ C1137D1 f4448c;

    public C1062A1(C1137D1 c1137d1, int r2, Bundle bundle) {
        this.f4448c = c1137d1;
        this.f4446a = r2;
        this.f4447b = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f4448c.f4621b.reportData(this.f4446a, this.f4447b);
    }
}
