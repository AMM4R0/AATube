package io.appmetrica.analytics.ndkcrashesapi.internal;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public abstract class NativeCrashServiceModule {
    public abstract void deleteCompletedCrashes();

    public abstract List<NativeCrash> getAllCrashes();

    public abstract void init(Context context, NativeCrashServiceConfig nativeCrashServiceConfig);

    public abstract void markCrashCompleted(String str);

    public abstract void setDefaultCrashHandler(NativeCrashHandler nativeCrashHandler);
}
