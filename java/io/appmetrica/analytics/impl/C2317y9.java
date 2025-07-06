package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.y9 */
/* loaded from: classes.dex */
public final class C2317y9 implements ExecutorProvider {

    /* renamed from: a */
    public final C1280Ij f7491a;

    /* renamed from: b */
    public final IHandlerExecutor f7492b;

    public C2317y9() {
        C1280Ij m4214u = C2018ma.m4192h().m4214u();
        this.f7491a = m4214u;
        this.f7492b = m4214u.m2964c();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getDefaultExecutor() {
        return this.f7491a.m2962a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final InterruptionSafeThread getInterruptionThread(String str, String str2, Runnable runnable) {
        return new InterruptionSafeThread(runnable, (str + '-' + str2) + "-" + ThreadFactoryC1896hd.f6405a.incrementAndGet());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getModuleExecutor() {
        return this.f7492b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getSupportIOExecutor() {
        C1280Ij c1280Ij = this.f7491a;
        if (c1280Ij.f4878f == null) {
            synchronized (c1280Ij) {
                try {
                    if (c1280Ij.f4878f == null) {
                        c1280Ij.f4873a.getClass();
                        HandlerThreadC1694Za m4681a = C2342z9.m4681a("IAA-SIO");
                        c1280Ij.f4878f = new C2342z9(m4681a, m4681a.getLooper(), new Handler(m4681a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return c1280Ij.f4878f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getUiExecutor() {
        return this.f7491a.m2967f();
    }
}
