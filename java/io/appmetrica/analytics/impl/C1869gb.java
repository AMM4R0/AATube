package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2492i;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.gb */
/* loaded from: classes.dex */
public final class C1869gb {

    /* renamed from: a */
    public final byte[] f6313a;

    /* renamed from: b */
    public final String f6314b;

    /* renamed from: c */
    public final int f6315c;

    /* renamed from: d */
    public final HashMap f6316d;

    /* renamed from: e */
    public final String f6317e;

    /* renamed from: f */
    public final Integer f6318f;

    /* renamed from: g */
    public final String f6319g;

    /* renamed from: h */
    public final String f6320h;

    /* renamed from: i */
    public final EnumC1565U5 f6321i;

    /* renamed from: j */
    public final String f6322j;

    public C1869gb(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f6313a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f6314b = jSONObject2.getString("name");
        this.f6315c = jSONObject2.getInt("bytes_truncated");
        this.f6322j = JsonUtils.optStringOrNull(jSONObject2, "environment");
        String optString = jSONObject2.optString("trimmed_fields");
        this.f6316d = new HashMap();
        if (optString != null) {
            try {
                HashMap m3756c = AbstractC1794db.m3756c(optString);
                if (m3756c != null) {
                    for (Map.Entry entry : m3756c.entrySet()) {
                        this.f6316d.put(EnumC1962k4.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f6317e = jSONObject3.getString("package_name");
        this.f6318f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f6319g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f6320h = jSONObject4.getString("api_key");
        this.f6321i = m3869a(jSONObject4);
    }

    /* renamed from: a */
    public final String m3870a() {
        return this.f6320h;
    }

    /* renamed from: b */
    public final int m3871b() {
        return this.f6315c;
    }

    /* renamed from: c */
    public final byte[] m3872c() {
        return this.f6313a;
    }

    /* renamed from: d */
    public final String m3873d() {
        return this.f6322j;
    }

    /* renamed from: e */
    public final String m3874e() {
        return this.f6314b;
    }

    /* renamed from: f */
    public final String m3875f() {
        return this.f6317e;
    }

    /* renamed from: g */
    public final Integer m3876g() {
        return this.f6318f;
    }

    /* renamed from: h */
    public final String m3877h() {
        return this.f6319g;
    }

    /* renamed from: i */
    public final EnumC1565U5 m3878i() {
        return this.f6321i;
    }

    /* renamed from: j */
    public final HashMap<EnumC1962k4, Integer> m3879j() {
        return this.f6316d;
    }

    /* renamed from: k */
    public final String m3880k() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f6316d.entrySet()) {
            hashMap.put(((EnumC1962k4) entry.getKey()).name(), entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f6318f).put("psid", this.f6319g).put("package_name", this.f6317e)).put("reporter_configuration", new JSONObject().put("api_key", this.f6320h).put("reporter_type", this.f6321i.f5525a)).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f6313a, 0)).put("name", this.f6314b).put("bytes_truncated", this.f6315c).put("trimmed_fields", AbstractC1794db.m3754b(hashMap)).putOpt("environment", this.f6322j)).toString();
    }

    /* renamed from: a */
    public static EnumC1565U5 m3869a(JSONObject jSONObject) {
        EnumC1565U5 enumC1565U5;
        if (!jSONObject.has("reporter_type")) {
            return EnumC1565U5.f5517b;
        }
        String string = jSONObject.getString("reporter_type");
        EnumC1565U5[] values = EnumC1565U5.values();
        int length = values.length;
        int r2 = 0;
        while (true) {
            if (r2 >= length) {
                enumC1565U5 = null;
                break;
            }
            enumC1565U5 = values[r2];
            if (AbstractC2492i.m4911a(enumC1565U5.f5525a, string)) {
                break;
            }
            r2++;
        }
        return enumC1565U5 == null ? EnumC1565U5.f5517b : enumC1565U5;
    }

    public C1869gb(C1615W5 c1615w5, C1912i4 c1912i4, HashMap<EnumC1962k4, Integer> hashMap) {
        this.f6313a = c1615w5.getValueBytes();
        this.f6314b = c1615w5.getName();
        this.f6315c = c1615w5.getBytesTruncated();
        if (hashMap != null) {
            this.f6316d = hashMap;
        } else {
            this.f6316d = new HashMap();
        }
        C1748bf m3977a = c1912i4.m3977a();
        this.f6317e = m3977a.m3658f();
        this.f6318f = m3977a.m3659g();
        this.f6319g = m3977a.m3660h();
        CounterConfiguration m3978b = c1912i4.m3978b();
        this.f6320h = m3978b.getApiKey();
        this.f6321i = m3978b.getReporterType();
        this.f6322j = c1615w5.m3485f();
    }
}
