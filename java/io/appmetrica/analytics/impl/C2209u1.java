package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.u1 */
/* loaded from: classes.dex */
public final class C2209u1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C1137D1 f7209a;

    public C2209u1(C1137D1 c1137d1) {
        this.f7209a = c1137d1;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        synchronized (this.f7209a) {
            try {
                C1137D1 c1137d1 = this.f7209a;
                if (c1137d1.f4622c) {
                    c1137d1.f4621b.onCreate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
