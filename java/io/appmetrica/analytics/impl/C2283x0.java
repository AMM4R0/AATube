package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import kotlin.jvm.internal.AbstractC2492i;
import org.json.JSONObject;
import p002A1.AbstractC0008a;

/* renamed from: io.appmetrica.analytics.impl.x0 */
/* loaded from: classes.dex */
public final class C2283x0 {
    /* renamed from: a */
    public static String m4592a(C2258w0 c2258w0) {
        try {
            return Base64.encodeToString(new JSONObject().put("apiKey", c2258w0.f7323a).put("packageName", c2258w0.f7324b).put("reporterType", c2258w0.f7325c.f5525a).put("processID", c2258w0.f7326d).put("processSessionID", c2258w0.f7327e).put("errorEnvironment", c2258w0.f7328f).toString().getBytes(AbstractC0008a.f6a), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static C2258w0 m4591a(String str) {
        EnumC1565U5 enumC1565U5;
        try {
            int r3 = 0;
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), AbstractC0008a.f6a));
            String string = jSONObject.getString("apiKey");
            String string2 = jSONObject.getString("packageName");
            String string3 = jSONObject.getString("reporterType");
            EnumC1565U5[] values = EnumC1565U5.values();
            int length = values.length;
            while (true) {
                if (r3 >= length) {
                    enumC1565U5 = null;
                    break;
                }
                enumC1565U5 = values[r3];
                if (AbstractC2492i.m4911a(enumC1565U5.f5525a, string3)) {
                    break;
                }
                r3++;
            }
            if (enumC1565U5 == null) {
                enumC1565U5 = EnumC1565U5.f5517b;
            }
            return new C2258w0(string, string2, enumC1565U5, jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
