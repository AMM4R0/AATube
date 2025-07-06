package io.appmetrica.analytics.impl;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Locale;

/* renamed from: io.appmetrica.analytics.impl.ge */
/* loaded from: classes.dex */
public abstract class AbstractC1872ge {

    /* renamed from: a */
    public static final SafePackageManager f6323a = new SafePackageManager();

    /* renamed from: b */
    public static final C1747be f6324b = new C1747be();

    /* renamed from: c */
    public static final C1772ce f6325c = new C1772ce();

    /* renamed from: d */
    public static final C1797de f6326d = new C1797de(2);

    /* renamed from: a */
    public static String m3893a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        if (AndroidUtils.isApiAchieved(21)) {
            String script = locale.getScript();
            if (!TextUtils.isEmpty(script)) {
                sb.append('-');
                sb.append(script);
            }
        }
        if (!TextUtils.isEmpty(country)) {
            sb.append('_');
            sb.append(country);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static EnumC1847fe m3892a(ConnectivityManager connectivityManager) {
        NetworkInfo networkInfo;
        EnumC1847fe enumC1847fe = EnumC1847fe.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (!AndroidUtils.isApiAchieved(29) ? !(activeNetwork != null && ((networkInfo = connectivityManager.getNetworkInfo(activeNetwork)) == null || networkInfo.isConnected())) : activeNetwork == null) {
            return EnumC1847fe.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return enumC1847fe;
        }
        for (Integer num : f6325c.f7220a.keySet()) {
            if (networkCapabilities.hasTransport(num.intValue())) {
                return (EnumC1847fe) f6325c.m4482a(num);
            }
        }
        return enumC1847fe;
    }
}
