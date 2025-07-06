package io.appmetrica.analytics.coreutils.internal;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class WrapUtils {
    public static long getMillisOrDefault(Long l2, TimeUnit timeUnit, long j2) {
        return l2 == null ? j2 : timeUnit.toMillis(l2.longValue());
    }

    public static <T> T getOrDefault(T t2, T t3) {
        return t2 == null ? t3 : t2;
    }

    public static String getOrDefaultIfEmpty(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> T getOrDefaultNullable(T t2, T t3) {
        return t2 == null ? t3 : t2;
    }

    public static String getOrDefaultNullableIfEmpty(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> String wrapToTag(T t2) {
        return t2 == null ? "<null>" : t2.toString().isEmpty() ? "<empty>" : t2.toString();
    }
}
