package io.appmetrica.analytics.networktasks.internal.utils;

/* loaded from: classes.dex */
public final class Utils {
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    public static final boolean isBadRequest(int r12) {
        return r12 == 400;
    }
}
