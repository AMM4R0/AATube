package io.appmetrica.analytics.network.impl;

import io.appmetrica.analytics.network.internal.Call;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC2492i;
import p001A0.AbstractC0005b;

/* renamed from: io.appmetrica.analytics.network.impl.c */
/* loaded from: classes.dex */
public final class C2393c implements Call {

    /* renamed from: a */
    public final NetworkClient f7676a;

    /* renamed from: b */
    public final Request f7677b;

    /* renamed from: c */
    public final C2394d f7678c;

    public C2393c(NetworkClient networkClient, Request request, C2394d c2394d) {
        this.f7676a = networkClient;
        this.f7677b = request;
        this.f7678c = c2394d;
    }

    /* renamed from: a */
    public final void m4752a(HttpsURLConnection httpsURLConnection) {
        Iterator<T> it = this.f7677b.getHeaders().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Integer readTimeout = this.f7676a.getReadTimeout();
        if (readTimeout != null) {
            httpsURLConnection.setReadTimeout(readTimeout.intValue());
        }
        Integer connectTimeout = this.f7676a.getConnectTimeout();
        if (connectTimeout != null) {
            httpsURLConnection.setConnectTimeout(connectTimeout.intValue());
        }
        Boolean useCaches = this.f7676a.getUseCaches();
        if (useCaches != null) {
            httpsURLConnection.setUseCaches(useCaches.booleanValue());
        }
        Boolean instanceFollowRedirects = this.f7676a.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            httpsURLConnection.setInstanceFollowRedirects(instanceFollowRedirects.booleanValue());
        }
        httpsURLConnection.setRequestMethod(this.f7677b.getMethod());
        SSLSocketFactory sslSocketFactory = this.f7676a.getSslSocketFactory();
        if (sslSocketFactory != null) {
            httpsURLConnection.setSSLSocketFactory(sslSocketFactory);
        }
    }

    @Override // io.appmetrica.analytics.network.internal.Call
    public final Response execute() {
        Map<String, List<String>> map;
        Throwable th;
        int r5;
        boolean z2;
        Throwable th2;
        byte[] bArr;
        byte[] bArr2;
        int r10;
        try {
            C2394d c2394d = this.f7678c;
            String url = this.f7677b.getUrl();
            c2394d.getClass();
            URLConnection openConnection = new URL(url).openConnection();
            HttpsURLConnection httpsURLConnection = openConnection instanceof HttpsURLConnection ? (HttpsURLConnection) openConnection : null;
            if (httpsURLConnection == null) {
                return new Response(new IllegalArgumentException("Connection created for " + this.f7677b.getUrl() + " does not represent https connection"));
            }
            byte[] bArr3 = new byte[0];
            byte[] bArr4 = new byte[0];
            try {
                m4752a(httpsURLConnection);
                if (AbstractC2492i.m4911a(this.f7677b.getMethod(), "POST")) {
                    httpsURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpsURLConnection.getOutputStream();
                    if (outputStream != null) {
                        try {
                            outputStream.write(this.f7677b.getBody());
                            outputStream.flush();
                            AbstractC0005b.m66l(outputStream, null);
                        } finally {
                        }
                    }
                }
                r5 = httpsURLConnection.getResponseCode();
                try {
                    map = httpsURLConnection.getHeaderFields();
                } catch (Throwable th3) {
                    map = null;
                    th = th3;
                }
                try {
                    bArr3 = AbstractC2395e.m4754a(this.f7676a.getMaxResponseSize(), new C2391a(httpsURLConnection));
                    th2 = null;
                    bArr = bArr3;
                    bArr2 = AbstractC2395e.m4754a(this.f7676a.getMaxResponseSize(), new C2392b(httpsURLConnection));
                    r10 = r5;
                    z2 = true;
                } catch (Throwable th4) {
                    th = th4;
                    z2 = false;
                    th2 = th;
                    bArr = bArr3;
                    bArr2 = bArr4;
                    r10 = r5;
                    Map<String, List<String>> map2 = map;
                    httpsURLConnection.disconnect();
                    return new Response(z2, r10, bArr, bArr2, map2, th2);
                }
            } catch (Throwable th5) {
                map = null;
                th = th5;
                r5 = 0;
            }
            Map<String, List<String>> map22 = map;
            try {
                httpsURLConnection.disconnect();
            } catch (Throwable unused) {
            }
            return new Response(z2, r10, bArr, bArr2, map22, th2);
        } catch (Throwable th6) {
            return new Response(th6);
        }
    }

    public C2393c(NetworkClient networkClient, Request request) {
        this(networkClient, request, new C2394d());
    }
}
