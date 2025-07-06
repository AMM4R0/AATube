package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.W9 */
/* loaded from: classes.dex */
public final class C1619W9 {
    /* renamed from: a */
    public static boolean m3495a(JSONObject jSONObject, String str, boolean z2) {
        return ((Boolean) WrapUtils.getOrDefault(jSONObject.has(str) ? Boolean.valueOf(jSONObject.getJSONObject(str).getBoolean("enabled")) : null, Boolean.valueOf(z2))).booleanValue();
    }
}
