package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.z1 */
/* loaded from: classes.dex */
public final class C2334z1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f7511a;

    /* renamed from: b */
    public final /* synthetic */ C1137D1 f7512b;

    public C2334z1(C1137D1 c1137d1, Intent intent) {
        this.f7512b = c1137d1;
        this.f7511a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f7512b.f4621b.mo2815b(this.f7511a);
    }
}
