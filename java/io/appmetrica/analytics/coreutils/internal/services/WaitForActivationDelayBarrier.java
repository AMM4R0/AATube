package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.RunnableC1029m;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes.dex */
public class WaitForActivationDelayBarrier implements ActivationBarrier {

    /* renamed from: a */
    private long f4350a;

    /* renamed from: b */
    private final SystemTimeProvider f4351b;

    public static class ActivationBarrierHelper {

        /* renamed from: a */
        private boolean f4352a = false;

        /* renamed from: b */
        private final C1032a f4353b;

        /* renamed from: c */
        private final WaitForActivationDelayBarrier f4354c;

        public ActivationBarrierHelper(Runnable runnable, WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f4353b = new C1032a(this, runnable);
            this.f4354c = waitForActivationDelayBarrier;
        }

        public void subscribeIfNeeded(long j2, ICommonExecutor iCommonExecutor) {
            if (this.f4352a) {
                iCommonExecutor.execute(new RunnableC1033b(this));
            } else {
                this.f4354c.subscribe(j2, iCommonExecutor, this.f4353b);
            }
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    public void activate() {
        this.f4350a = this.f4351b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j2, ICommonExecutor iCommonExecutor, ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new RunnableC1029m(activationBarrierCallback), Math.max(j2 - (this.f4351b.currentTimeMillis() - this.f4350a), 0L));
    }

    public WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.f4351b = systemTimeProvider;
    }
}
