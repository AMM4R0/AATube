package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.Af */
/* loaded from: classes.dex */
public final class C1076Af implements InterfaceC2323yf {

    /* renamed from: a */
    public final /* synthetic */ C1226Gf f4480a;

    public C1076Af(C1226Gf c1226Gf) {
        this.f4480a = c1226Gf;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2323yf
    /* renamed from: a */
    public final void mo2732a() {
        C1226Gf c1226Gf = this.f4480a;
        C2318ya c2318ya = c1226Gf.f4788b;
        C2348zf c2348zf = new C2348zf(c1226Gf);
        c2318ya.getClass();
        try {
            FutureTask futureTask = new FutureTask(new CallableC2293xa(c2318ya));
            C2018ma.f6725C.f6731d.f4873a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR-" + ThreadFactoryC1896hd.f6405a.incrementAndGet()).start();
            C1500Rf c1500Rf = (C1500Rf) futureTask.get(5L, TimeUnit.SECONDS);
            AbstractC2356zn.m4698a(c2318ya.f7494b);
            C1226Gf.m2910a(c1226Gf, c1500Rf, C1226Gf.m2909a(c1226Gf));
        } catch (Throwable th) {
            try {
                c2348zf.mo2861a(th);
            } finally {
                AbstractC2356zn.m4698a(c2318ya.f7494b);
            }
        }
    }
}
