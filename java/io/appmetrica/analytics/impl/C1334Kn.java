package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Kn */
/* loaded from: classes.dex */
public final class C1334Kn implements InterfaceC1459Pn {

    /* renamed from: a */
    public static final C1334Kn f4980a = new C1334Kn();

    @Override // io.appmetrica.analytics.impl.InterfaceC1459Pn
    /* renamed from: a */
    public final JSONObject mo3036a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_id", JsonUtils.optStringOrNullable(jSONObject2, "device_id", JsonUtils.optStringOrNull(jSONObject, "device_id")));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", JsonUtils.optStringOrNullable(jSONObject2, "referrer", JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", AbstractC1794db.m3744a(jSONObject2, "last_migration_api_level", AbstractC1794db.m3744a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }
}
