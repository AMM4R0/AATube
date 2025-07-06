package io.appmetrica.analytics.coreutils.internal;

import android.os.Build;

/* loaded from: classes.dex */
public final class AndroidUtils {
    public static final AndroidUtils INSTANCE = new AndroidUtils();

    private AndroidUtils() {
    }

    public static final boolean isApiAchieved(int r12) {
        return Build.VERSION.SDK_INT >= r12;
    }
}
