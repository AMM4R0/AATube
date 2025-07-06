package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.u2 */
/* loaded from: classes.dex */
public final class C2210u2 {
    /* renamed from: a */
    public static void m4472a(C2279wl c2279wl, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject != null) {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = optJSONObject.optJSONArray("deeplink_conditions");
            if (optJSONArray != null) {
                for (int r12 = 0; r12 < optJSONArray.length(); r12++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(r12);
                    String optString = optJSONObject2.optString("key", null);
                    if (!TextUtils.isEmpty(optString)) {
                        String optString2 = optJSONObject2.optString("value", null);
                        arrayList.add(new Pair(optString, optString2 != null ? new C2135r2(optString2) : null));
                    }
                }
            }
            c2279wl.f7401t = new C2160s2(arrayList);
        }
    }
}
