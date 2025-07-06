package io.appmetrica.analytics.coreutils.internal.network;

import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.StringExtensionsKt;
import p002A1.AbstractC0025r;

/* loaded from: classes.dex */
public final class UserAgent {
    public static final UserAgent INSTANCE = new UserAgent();

    private UserAgent() {
    }

    public static final String getFor(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('/');
        sb.append(str2);
        sb.append('.');
        sb.append(str3);
        sb.append(" (");
        INSTANCE.getClass();
        String str4 = Build.MODEL;
        String str5 = Build.MANUFACTURER;
        if (!AbstractC0025r.m156I(str4, str5, false)) {
            str4 = str5 + ' ' + str4;
        }
        sb.append(StringExtensionsKt.replaceFirstCharWithTitleCase(str4));
        sb.append("; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(')');
        return sb.toString();
    }
}
