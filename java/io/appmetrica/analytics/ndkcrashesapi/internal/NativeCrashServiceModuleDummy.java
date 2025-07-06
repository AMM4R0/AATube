package io.appmetrica.analytics.ndkcrashesapi.internal;

import android.content.Context;
import io.appmetrica.analytics.logger.internal.YLogger;
import java.util.List;
import p108m1.C2668r;

/* loaded from: classes.dex */
public final class NativeCrashServiceModuleDummy extends NativeCrashServiceModule {

    /* renamed from: a */
    private final String f7672a = "[NativeCrashServiceModuleDummy]";

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public void deleteCompletedCrashes() {
        YLogger.debug(this.f7672a, "Skipping delete completed crashes", new Object[0]);
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public List<NativeCrash> getAllCrashes() {
        return C2668r.f8607a;
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public void init(Context context, NativeCrashServiceConfig nativeCrashServiceConfig) {
        YLogger.debug(this.f7672a, "Skipping initialization of server part of native crashes", new Object[0]);
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public void markCrashCompleted(String str) {
        YLogger.debug(this.f7672a, "Skipping mark crash completed " + str, new Object[0]);
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public void setDefaultCrashHandler(NativeCrashHandler nativeCrashHandler) {
        YLogger.debug(this.f7672a, "Skipping set default native crash handler", new Object[0]);
    }
}
