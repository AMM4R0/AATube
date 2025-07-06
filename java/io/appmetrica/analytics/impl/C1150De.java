package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.De */
/* loaded from: classes.dex */
public final class C1150De {

    /* renamed from: a */
    public final String f4640a;

    /* renamed from: b */
    public final JSONObject f4641b;

    /* renamed from: c */
    public final EnumC1517S7 f4642c;

    public C1150De(String str, JSONObject jSONObject, EnumC1517S7 enumC1517S7) {
        this.f4640a = str;
        this.f4641b = jSONObject;
        this.f4642c = enumC1517S7;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f4640a + "', additionalParams=" + this.f4641b + ", source=" + this.f4642c + '}';
    }
}
