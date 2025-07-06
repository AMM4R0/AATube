package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.y1 */
/* loaded from: classes.dex */
public final class C2309y1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f7472a;

    /* renamed from: b */
    public final /* synthetic */ C1137D1 f7473b;

    public C2309y1(C1137D1 c1137d1, Intent intent) {
        this.f7473b = c1137d1;
        this.f7472a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f7473b.f4621b.mo2816c(this.f7472a);
    }
}
