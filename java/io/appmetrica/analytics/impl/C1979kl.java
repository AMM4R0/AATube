package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.kl */
/* loaded from: classes.dex */
public final class C1979kl implements NetworkResponseHandler {

    /* renamed from: a */
    public final C2154rl f6602a;

    /* renamed from: b */
    public final C2261w3 f6603b;

    public C1979kl() {
        this(new C2154rl(), new C2261w3());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2279wl handle(ResponseDataHolder responseDataHolder) {
        String str;
        String str2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!AbstractC2356zn.m4702a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.f6603b.m4532a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                C2154rl c2154rl = this.f6602a;
                c2154rl.getClass();
                C2279wl c2279wl = new C2279wl();
                try {
                    c2154rl.f7082i.getClass();
                    C1769cb c1769cb = new C1769cb(new String(responseData, "UTF-8"));
                    JSONObject optJSONObject = c1769cb.optJSONObject("device_id");
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("hash");
                        str2 = optJSONObject.optString("value");
                    } else {
                        str = "";
                        str2 = "";
                    }
                    c2279wl.f7389h = str2;
                    c2279wl.f7390i = str;
                    c2154rl.m4402a(c2279wl, c1769cb);
                    c2279wl.f7382a = 2;
                } catch (Throwable unused) {
                    c2279wl = new C2279wl();
                    c2279wl.f7382a = 1;
                }
                if (2 == c2279wl.f7382a) {
                    return c2279wl;
                }
            }
        }
        return null;
    }

    public C1979kl(C2154rl c2154rl, C2261w3 c2261w3) {
        this.f6602a = c2154rl;
        this.f6603b = c2261w3;
    }
}
