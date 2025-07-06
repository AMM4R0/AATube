package io.appmetrica.analytics.coreutils.internal.system;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes.dex */
public final class SystemPropertiesHelper {
    public static final SystemPropertiesHelper INSTANCE = new SystemPropertiesHelper();

    private SystemPropertiesHelper() {
    }

    @SuppressLint({"PrivateApi"})
    public static final String readSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties", true, Context.class.getClassLoader());
            Object invoke = cls.getMethod("get", String.class).invoke(cls, str);
            String str2 = invoke instanceof String ? (String) invoke : null;
            return str2 == null ? "" : str2;
        } catch (Exception unused) {
            return "";
        }
    }
}
