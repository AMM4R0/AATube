package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.v1 */
/* loaded from: classes.dex */
public final class C2234v1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f7252a;

    /* renamed from: b */
    public final /* synthetic */ int f7253b;

    /* renamed from: c */
    public final /* synthetic */ C1137D1 f7254c;

    public C2234v1(C1137D1 c1137d1, Intent intent, int r3) {
        this.f7254c = c1137d1;
        this.f7252a = intent;
        this.f7253b = r3;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f7254c.f4621b.mo2812a(this.f7252a, this.f7253b);
    }
}
