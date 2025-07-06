package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Log;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Pattern;

/* renamed from: io.appmetrica.analytics.impl.Ki */
/* loaded from: classes.dex */
public abstract class AbstractC1329Ki {

    /* renamed from: a */
    public static final Pattern f4968a = Pattern.compile(".*at io\\.appmetrica\\.analytics\\.push\\.*");

    /* renamed from: b */
    public static final Pattern f4969b = Pattern.compile(".*at io\\.appmetrica\\.analytics\\.(?!push)");

    /* renamed from: a */
    public static String m3024a() {
        StringBuilder sb = new StringBuilder(BuildConfig.SDK_BUILD_FLAVOR);
        if (!TextUtils.isEmpty(BuildConfig.SDK_DEPENDENCY)) {
            sb.append("_binary");
        }
        if (!TextUtils.isEmpty("")) {
            sb.append("_");
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static void m3025b() {
        Log.i("AppMetrica", "Initializing of AppMetrica, " + StringUtils.capitalize("release") + " type, Version 6.5.0, API Level " + AppMetrica.getLibraryApiLevel() + ", Dated 26.04.2024.");
    }
}
