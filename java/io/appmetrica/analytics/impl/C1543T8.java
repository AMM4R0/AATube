package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.T8 */
/* loaded from: classes.dex */
public final class C1543T8 {

    /* renamed from: a */
    public final C1409Nn f5466a;

    public C1543T8(C1409Nn c1409Nn) {
        this.f5466a = c1409Nn;
    }

    /* renamed from: a */
    public final void m3353a(int r4, long j2) {
        JSONObject optJSONObject;
        C1409Nn c1409Nn = this.f5466a;
        synchronized (c1409Nn) {
            optJSONObject = c1409Nn.f5142a.m3193a().optJSONObject("numbers_of_type");
        }
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        optJSONObject.put(String.valueOf(r4), j2);
        this.f5466a.m3137a(optJSONObject);
    }
}
