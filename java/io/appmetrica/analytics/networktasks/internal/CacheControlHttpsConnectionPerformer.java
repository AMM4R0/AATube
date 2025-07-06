package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.impl.C2397a;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class CacheControlHttpsConnectionPerformer {

    /* renamed from: a */
    private final C2397a f7723a;

    /* renamed from: b */
    private final SSLSocketFactory f7724b;

    public interface Client {
        String getOldETag();

        void onError();

        void onNotModified();

        void onResponse(String str, byte[] bArr);
    }

    public CacheControlHttpsConnectionPerformer(SSLSocketFactory sSLSocketFactory) {
        this(new C2397a(), sSLSocketFactory);
    }

    public void performConnection(String str, Client client) {
        Response m4755a;
        int code;
        String str2;
        try {
            C2397a c2397a = this.f7723a;
            String oldETag = client.getOldETag();
            SSLSocketFactory sSLSocketFactory = this.f7724b;
            c2397a.getClass();
            m4755a = C2397a.m4755a(oldETag, str, sSLSocketFactory);
            code = m4755a.getCode();
        } catch (Throwable unused) {
        }
        if (code != 200) {
            if (code != 304) {
                client.onError();
                return;
            } else {
                client.onNotModified();
                return;
            }
        }
        List list = (List) CollectionUtils.getFromMapIgnoreCase(m4755a.getHeaders(), "ETag");
        if (list == null || list.size() <= 0 || (str2 = (String) list.get(0)) == null) {
            str2 = "";
        }
        client.onResponse(str2, m4755a.getResponseData());
    }

    public CacheControlHttpsConnectionPerformer(C2397a c2397a, SSLSocketFactory sSLSocketFactory) {
        this.f7723a = c2397a;
        this.f7724b = sSLSocketFactory;
    }
}
