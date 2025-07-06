package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreutils.impl.C1028l;
import p105l1.C2634e;
import p105l1.InterfaceC2631b;

/* loaded from: classes.dex */
public final class UtilityServiceProvider {

    /* renamed from: a */
    private final InterfaceC2631b f4348a = new C2634e(new C1028l(this));

    /* renamed from: b */
    private final WaitForActivationDelayBarrier f4349b = new WaitForActivationDelayBarrier();

    public final WaitForActivationDelayBarrier getActivationBarrier() {
        return this.f4349b;
    }

    public final FirstExecutionConditionServiceImpl getFirstExecutionService() {
        return (FirstExecutionConditionServiceImpl) ((C2634e) this.f4348a).m5093a();
    }

    public final void initAsync() {
        this.f4349b.activate();
    }

    public final void updateConfiguration(UtilityServiceConfiguration utilityServiceConfiguration) {
        getFirstExecutionService().updateConfig(utilityServiceConfiguration);
    }
}
