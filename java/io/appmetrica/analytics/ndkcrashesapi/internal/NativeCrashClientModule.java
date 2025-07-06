package io.appmetrica.analytics.ndkcrashesapi.internal;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class NativeCrashClientModule {
    public abstract void initHandling(Context context, NativeCrashClientConfig nativeCrashClientConfig);

    public abstract void updateAppMetricaMetadata(String str);
}
