package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.P5 */
/* loaded from: classes.dex */
public final class C1441P5 implements ActivationBarrierCallback {

    /* renamed from: a */
    public final /* synthetic */ RunnableC1466Q5 f5199a;

    public C1441P5(RunnableC1466Q5 runnableC1466Q5) {
        this.f5199a = runnableC1466Q5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        Iterator it = this.f5199a.f5242a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
