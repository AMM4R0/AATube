package io.appmetrica.analytics.modulesapi.internal.service;

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

/* loaded from: classes.dex */
public interface ServiceContext {
    ActivationBarrier getActivationBarrier();

    ApplicationStateProvider getApplicationStateProvider();

    ChargeTypeProvider getChargeTypeProvider();

    Context getContext();

    CryptoProvider getCryptoProvider();

    DataSendingRestrictionController getDataSendingRestrictionController();

    ExecutorProvider getExecutorProvider();

    FirstExecutionConditionService getFirstExecutionConditionService();

    LocationServiceApi getLocationServiceApi();

    ModuleServiceLifecycleController getModuleServiceLifecycleController();

    ServiceNetworkContext getNetworkContext();

    PlatformIdentifiers getPlatformIdentifiers();

    SdkEnvironmentProvider getSdkEnvironmentProvider();

    ModuleSelfReporter getSelfReporter();

    ServiceStorageProvider getServiceStorageProvider();

    ServiceWakeLock getServiceWakeLock();
}
