package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Mn */
/* loaded from: classes.dex */
public final class C1384Mn implements InterfaceC1459Pn {

    /* renamed from: a */
    public static final C1384Mn f5098a = new C1384Mn();

    @Override // io.appmetrica.analytics.impl.InterfaceC1459Pn
    /* renamed from: a */
    public final JSONObject mo3036a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject3.put("first_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "first_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "first_event_done", bool)));
        jSONObject3.put("init_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "init_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "init_event_done", bool)));
        jSONObject3.put("report_request_id", AbstractC1794db.m3744a(jSONObject2, "report_request_id", AbstractC1794db.m3744a(jSONObject, "report_request_id", -1)));
        jSONObject3.put("global_number", JsonUtils.optLongOrDefault(jSONObject2, "global_number", JsonUtils.optLongOrDefault(jSONObject, "global_number", 0L)));
        jSONObject3.put("session_id", JsonUtils.optLongOrDefault(jSONObject2, "session_id", JsonUtils.optLongOrDefault(jSONObject, "session_id", -1L)));
        jSONObject3.put("referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_handled", bool)));
        jSONObject3.put("numbers_of_type", JsonUtils.optJsonObjectOrNullable(jSONObject2, "numbers_of_type", JsonUtils.optJsonObjectOrNull(jSONObject, "numbers_of_type")));
        jSONObject3.put("open_id", AbstractC1794db.m3744a(jSONObject2, "open_id", AbstractC1794db.m3744a(jSONObject, "open_id", 1)));
        jSONObject3.put("attribution_id", AbstractC1794db.m3744a(jSONObject2, "attribution_id", AbstractC1794db.m3744a(jSONObject, "attribution_id", 1)));
        jSONObject3.put("last_migration_api_level", AbstractC1794db.m3744a(jSONObject2, "last_migration_api_level", AbstractC1794db.m3744a(jSONObject, "last_migration_api_level", 0)));
        jSONObject3.put("external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject2, "external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject, "external_attribution_window_start", -1L)));
        return jSONObject3;
    }
}
