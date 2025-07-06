package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;

/* renamed from: io.appmetrica.analytics.coreutils.internal.services.b */
/* loaded from: classes.dex */
public final class RunnableC1033b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ WaitForActivationDelayBarrier.ActivationBarrierHelper f4357a;

    public RunnableC1033b(WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper) {
        this.f4357a = activationBarrierHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1032a c1032a;
        c1032a = this.f4357a.f4353b;
        c1032a.f4356b.f4352a = true;
        c1032a.f4355a.run();
    }
}
