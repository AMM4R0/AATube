package io.appmetrica.analytics.remotepermissions.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.remotepermissions.impl.d */
/* loaded from: classes.dex */
public final class C2412d implements JsonParser {

    /* renamed from: a */
    public final String f7805a = "permissions";

    /* renamed from: b */
    public final String f7806b = "name";

    /* renamed from: c */
    public final String f7807c = "list";

    /* renamed from: d */
    public final String f7808d = "enabled";

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2409a parse(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashSet hashSet = new HashSet();
        JSONObject optJSONObject = jSONObject.optJSONObject(this.f7805a);
        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray(this.f7807c)) != null) {
            int length = optJSONArray.length();
            for (int r2 = 0; r2 < length; r2++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(r2);
                if (optJSONObject2 != null && optJSONObject2.optBoolean(this.f7808d)) {
                    String optString = optJSONObject2.optString(this.f7806b);
                    if (!TextUtils.isEmpty(optString)) {
                        hashSet.add(optString);
                    }
                }
            }
        }
        return new C2409a(hashSet);
    }

    /* renamed from: b */
    public final C2409a m4768b(JSONObject jSONObject) {
        return (C2409a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (C2409a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
