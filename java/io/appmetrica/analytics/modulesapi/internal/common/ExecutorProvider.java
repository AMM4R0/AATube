package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface ExecutorProvider {
    IHandlerExecutor getDefaultExecutor();

    InterruptionSafeThread getInterruptionThread(String str, String str2, Runnable runnable);

    IHandlerExecutor getModuleExecutor();

    IHandlerExecutor getSupportIOExecutor();

    Executor getUiExecutor();
}
