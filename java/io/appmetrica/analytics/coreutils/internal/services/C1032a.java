package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;

/* renamed from: io.appmetrica.analytics.coreutils.internal.services.a */
/* loaded from: classes.dex */
public final class C1032a implements ActivationBarrierCallback {

    /* renamed from: a */
    public final /* synthetic */ Runnable f4355a;

    /* renamed from: b */
    public final /* synthetic */ WaitForActivationDelayBarrier.ActivationBarrierHelper f4356b;

    public C1032a(WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, Runnable runnable) {
        this.f4356b = activationBarrierHelper;
        this.f4355a = runnable;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f4356b.f4352a = true;
        this.f4355a.run();
    }
}
