package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ik */
/* loaded from: classes.dex */
public final class C1928ik {

    /* renamed from: a */
    public final String f6499a;

    /* renamed from: b */
    public final String f6500b;

    /* renamed from: c */
    public final String f6501c;

    /* renamed from: d */
    public final String f6502d;

    /* renamed from: e */
    public final String f6503e;

    /* renamed from: f */
    public final int f6504f;

    /* renamed from: g */
    public final int f6505g;

    public C1928ik(JSONObject jSONObject) {
        this.f6499a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f6500b = jSONObject.optString("kitBuildNumber", "");
        this.f6501c = jSONObject.optString("appVer", "");
        this.f6502d = jSONObject.optString("appBuild", "");
        this.f6503e = jSONObject.optString("osVer", "");
        this.f6504f = jSONObject.optInt("osApiLev", -1);
        this.f6505g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        return "SessionRequestParams(kitVersionName='" + this.f6499a + "', kitBuildNumber='" + this.f6500b + "', appVersion='" + this.f6501c + "', appBuild='" + this.f6502d + "', osVersion='" + this.f6503e + "', apiLevel=" + this.f6504f + ", attributionId=" + this.f6505g + ')';
    }
}
