package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class FirstExecutionConditionServiceImpl implements FirstExecutionConditionService {

    /* renamed from: a */
    private final ArrayList f4332a = new ArrayList();

    /* renamed from: b */
    private UtilityServiceConfiguration f4333b;

    /* renamed from: c */
    final UtilityServiceProvider f4334c;

    public static class FirstExecutionConditionChecker {

        /* renamed from: a */
        private boolean f4335a = false;

        /* renamed from: b */
        private long f4336b;

        /* renamed from: c */
        private long f4337c;

        /* renamed from: d */
        private long f4338d;

        /* renamed from: e */
        private final FirstExecutionDelayChecker f4339e;
        public final String tag;

        public FirstExecutionConditionChecker(UtilityServiceConfiguration utilityServiceConfiguration, FirstExecutionDelayChecker firstExecutionDelayChecker, String str) {
            this.f4339e = firstExecutionDelayChecker;
            this.f4337c = utilityServiceConfiguration == null ? 0L : utilityServiceConfiguration.getInitialConfigTime();
            this.f4336b = utilityServiceConfiguration != null ? utilityServiceConfiguration.getLastUpdateConfigTime() : 0L;
            this.f4338d = Long.MAX_VALUE;
            this.tag = str;
        }

        /* renamed from: a */
        public final void m2663a(long j2) {
            this.f4338d = TimeUnit.SECONDS.toMillis(j2);
        }

        /* renamed from: b */
        public final boolean m2665b() {
            if (this.f4335a) {
                return true;
            }
            return this.f4339e.delaySinceFirstStartupWasPassed(this.f4337c, this.f4336b, this.f4338d);
        }

        /* renamed from: a */
        public final void m2662a() {
            this.f4335a = true;
        }

        /* renamed from: a */
        public final void m2664a(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f4337c = utilityServiceConfiguration.getInitialConfigTime();
            this.f4336b = utilityServiceConfiguration.getLastUpdateConfigTime();
        }
    }

    public static class FirstExecutionDelayChecker {
        public boolean delaySinceFirstStartupWasPassed(long j2, long j3, long j4) {
            return j3 - j2 >= j4;
        }
    }

    public static class FirstExecutionHandler implements FirstExecutionDelayedTask {

        /* renamed from: a */
        private final FirstExecutionConditionChecker f4340a;

        /* renamed from: b */
        private final WaitForActivationDelayBarrier.ActivationBarrierHelper f4341b;

        /* renamed from: c */
        private final ICommonExecutor f4342c;

        public /* synthetic */ FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker, int r4) {
            this(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker);
        }

        public boolean canExecute() {
            boolean m2665b = this.f4340a.m2665b();
            if (m2665b) {
                this.f4340a.m2662a();
            }
            return m2665b;
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public void setInitialDelaySeconds(long j2) {
            this.f4340a.m2663a(j2);
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public boolean tryExecute(long j2) {
            if (!this.f4340a.m2665b()) {
                return false;
            }
            this.f4341b.subscribeIfNeeded(TimeUnit.SECONDS.toMillis(j2), this.f4342c);
            this.f4340a.m2662a();
            return true;
        }

        public void updateConfig(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f4340a.m2664a(utilityServiceConfiguration);
        }

        private FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
            this.f4341b = activationBarrierHelper;
            this.f4340a = firstExecutionConditionChecker;
            this.f4342c = iCommonExecutor;
        }
    }

    public FirstExecutionConditionServiceImpl(UtilityServiceProvider utilityServiceProvider) {
        this.f4334c = utilityServiceProvider;
    }

    /* renamed from: a */
    public final synchronized FirstExecutionHandler m2661a(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
        FirstExecutionHandler firstExecutionHandler;
        firstExecutionHandler = new FirstExecutionHandler(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker, 0);
        this.f4332a.add(firstExecutionHandler);
        return firstExecutionHandler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService
    public synchronized FirstExecutionDelayedTask createDelayedTask(String str, ICommonExecutor iCommonExecutor, Runnable runnable) {
        return m2661a(iCommonExecutor, new WaitForActivationDelayBarrier.ActivationBarrierHelper(runnable, this.f4334c.getActivationBarrier()), new FirstExecutionConditionChecker(this.f4333b, new FirstExecutionDelayChecker(), str));
    }

    public void updateConfig(UtilityServiceConfiguration utilityServiceConfiguration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f4333b = utilityServiceConfiguration;
            arrayList = new ArrayList(this.f4332a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((FirstExecutionHandler) it.next()).updateConfig(utilityServiceConfiguration);
        }
    }
}
