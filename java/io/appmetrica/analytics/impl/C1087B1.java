package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.B1 */
/* loaded from: classes.dex */
public final class C1087B1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f4506a;

    /* renamed from: b */
    public final /* synthetic */ C1137D1 f4507b;

    public C1087B1(C1137D1 c1137d1, Bundle bundle) {
        this.f4507b = c1137d1;
        this.f4506a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f4507b.f4621b.resumeUserSession(this.f4506a);
    }
}
