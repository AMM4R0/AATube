package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.w1 */
/* loaded from: classes.dex */
public final class C2259w1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f7329a;

    /* renamed from: b */
    public final /* synthetic */ int f7330b;

    /* renamed from: c */
    public final /* synthetic */ int f7331c;

    /* renamed from: d */
    public final /* synthetic */ C1137D1 f7332d;

    public C2259w1(C1137D1 c1137d1, Intent intent, int r3, int r4) {
        this.f7332d = c1137d1;
        this.f7329a = intent;
        this.f7330b = r3;
        this.f7331c = r4;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f7332d.f4621b.mo2813a(this.f7329a, this.f7330b, this.f7331c);
    }
}
