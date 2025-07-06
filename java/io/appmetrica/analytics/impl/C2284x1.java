package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.x1 */
/* loaded from: classes.dex */
public final class C2284x1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f7408a;

    /* renamed from: b */
    public final /* synthetic */ C1137D1 f7409b;

    public C2284x1(C1137D1 c1137d1, Intent intent) {
        this.f7409b = c1137d1;
        this.f7408a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f7409b.f4621b.mo2811a(this.f7408a);
    }
}
