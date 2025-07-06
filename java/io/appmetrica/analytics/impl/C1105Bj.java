package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;

/* renamed from: io.appmetrica.analytics.impl.Bj */
/* loaded from: classes.dex */
public final class C1105Bj implements ServiceContext {

    /* renamed from: a */
    public final ModuleServiceLifecycleController f4540a;

    /* renamed from: b */
    public final C2221ud f4541b = new C2221ud(getContext());

    /* renamed from: c */
    public final C1373Mc f4542c = new C1373Mc();

    /* renamed from: d */
    public final C1529Sj f4543d = new C1529Sj(getContext(), new C1504Rj(new C1486R1()));

    /* renamed from: e */
    public final C1430Oj f4544e = new C1430Oj(getContext(), C2018ma.m4192h().m4216w(), C1765c7.m3695a(getContext()).m3706h());

    /* renamed from: f */
    public final C2317y9 f4545f = new C2317y9();

    /* renamed from: g */
    public final C2239v6 f4546g = new C2239v6();

    public C1105Bj(ModuleServiceLifecycleController moduleServiceLifecycleController) {
        this.f4540a = moduleServiceLifecycleController;
    }

    /* renamed from: a */
    public final C2221ud m2774a() {
        return this.f4541b;
    }

    /* renamed from: b */
    public final C1373Mc m2775b() {
        return this.f4542c;
    }

    /* renamed from: c */
    public final C1430Oj m2776c() {
        return this.f4544e;
    }

    /* renamed from: d */
    public final C1529Sj m2777d() {
        return this.f4543d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ActivationBarrier getActivationBarrier() {
        return C2018ma.f6725C.f6727B.getActivationBarrier();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ApplicationStateProvider getApplicationStateProvider() {
        return C2018ma.f6725C.m4202i().f7428b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ChargeTypeProvider getChargeTypeProvider() {
        C2018ma c2018ma = C2018ma.f6725C;
        C1936j3 c1936j3 = c2018ma.f6732e;
        if (c1936j3 == null) {
            synchronized (c2018ma) {
                try {
                    c1936j3 = c2018ma.f6732e;
                    if (c1936j3 == null) {
                        c1936j3 = new C1936j3(c2018ma.f6731d.m2962a(), c2018ma.m4202i().f7427a);
                        c2018ma.f6732e = c1936j3;
                    }
                } finally {
                }
            }
        }
        return c1936j3;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final Context getContext() {
        return C2018ma.f6725C.f6728a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final CryptoProvider getCryptoProvider() {
        return this.f4546g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final DataSendingRestrictionController getDataSendingRestrictionController() {
        return C2018ma.f6725C.m4200f();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ExecutorProvider getExecutorProvider() {
        return this.f4545f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final FirstExecutionConditionService getFirstExecutionConditionService() {
        return C2018ma.f6725C.f6727B.getFirstExecutionService();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final LocationServiceApi getLocationServiceApi() {
        return C2018ma.f6725C.m4203j();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ModuleServiceLifecycleController getModuleServiceLifecycleController() {
        return this.f4540a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceNetworkContext getNetworkContext() {
        return this.f4541b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final PlatformIdentifiers getPlatformIdentifiers() {
        return C2018ma.f6725C.m4209p();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final SdkEnvironmentProvider getSdkEnvironmentProvider() {
        return C2018ma.f6725C.m4212s();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ModuleSelfReporter getSelfReporter() {
        return this.f4542c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceStorageProvider getServiceStorageProvider() {
        return this.f4544e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceWakeLock getServiceWakeLock() {
        return this.f4543d;
    }
}
