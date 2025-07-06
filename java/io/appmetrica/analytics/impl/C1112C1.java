package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.C1 */
/* loaded from: classes.dex */
public final class C1112C1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f4559a;

    /* renamed from: b */
    public final /* synthetic */ C1137D1 f4560b;

    public C1112C1(C1137D1 c1137d1, Bundle bundle) {
        this.f4560b = c1137d1;
        this.f4559a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f4560b.f4621b.pauseUserSession(this.f4559a);
    }
}
