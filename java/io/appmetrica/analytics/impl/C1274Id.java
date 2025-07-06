package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Id */
/* loaded from: classes.dex */
public final class C1274Id {

    /* renamed from: a */
    public final HashMap f4862a;

    public C1274Id() {
        HashMap hashMap = new HashMap();
        this.f4862a = hashMap;
        hashMap.put("google_aid", "g");
        hashMap.put("huawei_oaid", "h");
        hashMap.put("sim_info", "si");
        hashMap.put("features_collecting", "fc");
        hashMap.put("permissions_collecting", "pc");
        hashMap.put("retry_policy", "rp");
        hashMap.put("cache_control", "cc");
        hashMap.put("auto_inapp_collecting", "aic");
        hashMap.put("attribution", "at");
        hashMap.put("startup_update", "su");
        hashMap.put("ssl_pinning", "sp");
        hashMap.put("external_attribution", "exta");
    }

    /* renamed from: a */
    public final String m2958a(String str) {
        return this.f4862a.containsKey(str) ? (String) this.f4862a.get(str) : str;
    }
}
