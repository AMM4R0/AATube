package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.C1224Gd;
import io.appmetrica.analytics.impl.C1324Kd;
import io.appmetrica.analytics.impl.C1744bb;
import io.appmetrica.analytics.impl.C2145rc;
import io.appmetrica.analytics.impl.EnumC1295J9;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ExternalAttributions {
    public static ExternalAttribution adjust(Object obj) {
        return obj == null ? new C1224Gd(EnumC1295J9.ADJUST) : new C1324Kd(EnumC1295J9.ADJUST, obj);
    }

    public static ExternalAttribution airbridge(Map<String, String> map) {
        return map == null ? new C1224Gd(EnumC1295J9.AIRBRIDGE) : new C2145rc(EnumC1295J9.AIRBRIDGE, map);
    }

    public static ExternalAttribution appsflyer(Map<String, Object> map) {
        return map == null ? new C1224Gd(EnumC1295J9.APPSFLYER) : new C2145rc(EnumC1295J9.APPSFLYER, map);
    }

    public static ExternalAttribution kochava(JSONObject jSONObject) {
        return jSONObject == null ? new C1224Gd(EnumC1295J9.KOCHAVA) : new C1744bb(EnumC1295J9.KOCHAVA, jSONObject);
    }

    public static ExternalAttribution singular(Map<String, Object> map) {
        return map == null ? new C1224Gd(EnumC1295J9.SINGULAR) : new C2145rc(EnumC1295J9.SINGULAR, map);
    }

    public static ExternalAttribution tenjin(Map<String, String> map) {
        return map == null ? new C1224Gd(EnumC1295J9.TENJIN) : new C2145rc(EnumC1295J9.TENJIN, map);
    }
}
