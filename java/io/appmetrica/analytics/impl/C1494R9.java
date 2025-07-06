package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.R9 */
/* loaded from: classes.dex */
public final class C1494R9 {

    /* renamed from: a */
    public final String f5312a;

    /* renamed from: b */
    public final int f5313b;

    /* renamed from: c */
    public final boolean f5314c;

    public C1494R9(JSONObject jSONObject) {
        this.f5312a = jSONObject.getString("name");
        this.f5314c = jSONObject.getBoolean("required");
        this.f5313b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1494R9.class != obj.getClass()) {
            return false;
        }
        C1494R9 c1494r9 = (C1494R9) obj;
        if (this.f5313b != c1494r9.f5313b || this.f5314c != c1494r9.f5314c) {
            return false;
        }
        String str = this.f5312a;
        String str2 = c1494r9.f5312a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        String str = this.f5312a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f5313b) * 31) + (this.f5314c ? 1 : 0);
    }

    public C1494R9(String str, int r2, boolean z2) {
        this.f5312a = str;
        this.f5313b = r2;
        this.f5314c = z2;
    }
}
