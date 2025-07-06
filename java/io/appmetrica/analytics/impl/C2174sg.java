package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.sg */
/* loaded from: classes.dex */
public final class C2174sg extends AbstractC2249vg {
    public C2174sg(C2013m5 c2013m5) {
        super(c2013m5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2249vg
    /* renamed from: a */
    public final boolean mo2734a(C1615W5 c1615w5) {
        String value = c1615w5.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            C1409Nn c1409Nn = this.f7308a.f6707v;
            synchronized (c1409Nn) {
                c1409Nn.m3141c(c1409Nn.m3138b() + 1);
            }
            if (!m4424a(jSONObject.optString("link"))) {
                return false;
            }
            c1615w5.f5634n = Boolean.TRUE;
            m4425b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void m4425b() {
        C1409Nn c1409Nn = this.f7308a.f6707v;
        synchronized (c1409Nn) {
            c1409Nn.m3135a(c1409Nn.m3134a() + 1);
        }
        this.f7308a.m4185z();
        C1344L8 c1344l8 = this.f7308a.f6698m;
        if (c1344l8.f4998c == null) {
            c1344l8.m3043a();
        }
        C1394N8 c1394n8 = c1344l8.f4998c;
        c1394n8.getClass();
        c1394n8.f5119b = new HashSet();
        c1394n8.f5121d = 0;
        C1394N8 c1394n82 = c1344l8.f4998c;
        c1394n82.f5118a = true;
        C1469Q8 c1469q8 = c1344l8.f4997b;
        IBinaryDataHelper iBinaryDataHelper = c1469q8.f5247c;
        C1444P8 c1444p8 = c1469q8.f5246b;
        c1469q8.f5245a.getClass();
        C2192t9 m3167a = C1419O8.m3167a(c1394n82);
        c1444p8.getClass();
        iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(m3167a));
    }

    /* renamed from: a */
    public final boolean m4424a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C2160s2 c2160s2 = this.f7308a.m4179t().f7564z;
                    for (String str2 : queryParameter.split("&")) {
                        int indexOf = str2.indexOf("=");
                        if (indexOf >= 0 && m4423a(Uri.decode(str2.substring(0, indexOf)), Uri.decode(str2.substring(indexOf + 1)), c2160s2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m4423a(String str, String str2, C2160s2 c2160s2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c2160s2 == null) {
            return false;
        }
        for (Pair pair : c2160s2.f7099a) {
            if (AbstractC2356zn.m4701a(pair.first, str) && ((obj = pair.second) == null || ((C2135r2) obj).f7014a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
