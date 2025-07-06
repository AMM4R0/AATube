package io.appmetrica.analytics.ndkcrashesapi.internal;

import android.content.Context;
import io.appmetrica.analytics.logger.internal.YLogger;

/* loaded from: classes.dex */
public final class NativeCrashClientModuleDummy extends NativeCrashClientModule {

    /* renamed from: a */
    private final String f7670a = "[NativeCrashClientModuleDummy]";

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule
    public void initHandling(Context context, NativeCrashClientConfig nativeCrashClientConfig) {
        YLogger.debug(this.f7670a, "Skipping native crashes handling", new Object[0]);
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule
    public void updateAppMetricaMetadata(String str) {
        YLogger.debug(this.f7670a, "Skipping update native crash metadata", new Object[0]);
    }
}
