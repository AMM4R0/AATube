package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import kotlin.jvm.internal.AbstractC2492i;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Re */
/* loaded from: classes.dex */
public final class C1499Re implements InterfaceC1542T7 {

    /* renamed from: a */
    public final String f5325a;

    /* renamed from: b */
    public final JSONObject f5326b;

    /* renamed from: c */
    public final boolean f5327c;

    /* renamed from: d */
    public final boolean f5328d;

    /* renamed from: e */
    public final EnumC1517S7 f5329e;

    public C1499Re(String str, JSONObject jSONObject, boolean z2, boolean z3, EnumC1517S7 enumC1517S7) {
        this.f5325a = str;
        this.f5326b = jSONObject;
        this.f5327c = z2;
        this.f5328d = z3;
        this.f5329e = enumC1517S7;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1542T7
    /* renamed from: a */
    public final EnumC1517S7 mo3259a() {
        return this.f5329e;
    }

    /* renamed from: b */
    public final JSONObject m3260b() {
        if (!this.f5327c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f5325a);
            if (this.f5326b.length() <= 0) {
                return jSONObject;
            }
            jSONObject.put("additionalParams", this.f5326b);
            return jSONObject;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: c */
    public final JSONObject m3261c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f5325a);
            jSONObject.put("additionalParams", this.f5326b);
            jSONObject.put("wasSet", this.f5327c);
            jSONObject.put("autoTracking", this.f5328d);
            jSONObject.put("source", this.f5329e.f5409a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f5325a + "', additionalParameters=" + this.f5326b + ", wasSet=" + this.f5327c + ", autoTrackingEnabled=" + this.f5328d + ", source=" + this.f5329e + '}';
    }

    /* renamed from: a */
    public static C1499Re m3258a(JSONObject jSONObject) {
        EnumC1517S7 enumC1517S7;
        String optStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject optJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int r3 = 0;
        boolean optBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean optBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String optStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, "source");
        EnumC1517S7[] values = EnumC1517S7.values();
        int length = values.length;
        while (true) {
            if (r3 >= length) {
                enumC1517S7 = null;
                break;
            }
            enumC1517S7 = values[r3];
            if (AbstractC2492i.m4911a(enumC1517S7.f5409a, optStringOrNull2)) {
                break;
            }
            r3++;
        }
        return new C1499Re(optStringOrNull, optJsonObjectOrDefault, optBooleanOrDefault, optBooleanOrDefault2, enumC1517S7 == null ? EnumC1517S7.f5404b : enumC1517S7);
    }
}
