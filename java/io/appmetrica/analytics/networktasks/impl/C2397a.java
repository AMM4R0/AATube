package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.appmetrica.analytics.networktasks.impl.a */
/* loaded from: classes.dex */
public final class C2397a {
    /* renamed from: a */
    public static Response m4755a(String str, String str2, SSLSocketFactory sSLSocketFactory) {
        Request.Builder withMethod = new Request.Builder(str2).withMethod("GET");
        if (!TextUtils.isEmpty(str)) {
            withMethod.addHeader("If-None-Match", str);
        }
        NetworkClient.Builder withSslSocketFactory = new NetworkClient.Builder().withInstanceFollowRedirects(true).withSslSocketFactory(sSLSocketFactory);
        int r3 = AbstractC2398b.f7705a;
        return withSslSocketFactory.withConnectTimeout(r3).withReadTimeout(r3).build().newCall(withMethod.build()).execute();
    }
}
