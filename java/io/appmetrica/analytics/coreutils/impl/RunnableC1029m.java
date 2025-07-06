package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;

/* renamed from: io.appmetrica.analytics.coreutils.impl.m */
/* loaded from: classes.dex */
public final class RunnableC1029m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ActivationBarrierCallback f4308a;

    public RunnableC1029m(ActivationBarrierCallback activationBarrierCallback) {
        this.f4308a = activationBarrierCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4308a.onWaitFinished();
    }
}
