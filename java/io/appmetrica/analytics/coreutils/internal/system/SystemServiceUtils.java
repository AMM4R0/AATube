package io.appmetrica.analytics.coreutils.internal.system;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* loaded from: classes.dex */
public final class SystemServiceUtils {
    public static final SystemServiceUtils INSTANCE = new SystemServiceUtils();

    private SystemServiceUtils() {
    }

    public static final <T, S> S accessSystemServiceByNameSafely(Context context, String str, String str2, String str3, FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            return (S) accessSystemServiceSafely(context.getSystemService(str), str2, str3, functionWithThrowable);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T, S> S accessSystemServiceByNameSafelyOrDefault(Context context, String str, String str2, String str3, S s2, FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            return (S) accessSystemServiceSafelyOrDefault(context.getSystemService(str), str2, str3, s2, functionWithThrowable);
        } catch (Throwable unused) {
            return s2;
        }
    }

    public static final <T, S> S accessSystemServiceSafely(T t2, String str, String str2, FunctionWithThrowable<T, S> functionWithThrowable) {
        if (t2 == null) {
            return null;
        }
        try {
            return functionWithThrowable.apply(t2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T, S> S accessSystemServiceSafelyOrDefault(T t2, String str, String str2, S s2, FunctionWithThrowable<T, S> functionWithThrowable) {
        S s3 = (S) accessSystemServiceSafely(t2, str, str2, functionWithThrowable);
        return s3 == null ? s2 : s3;
    }
}
