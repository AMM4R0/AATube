package io.appmetrica.analytics.coreutils.internal.parsing;

import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;
import p036M1.AbstractC0379e;
import p140x1.C2890b;
import p145z1.AbstractC2921d;

/* loaded from: classes.dex */
public final class JsonUtils {
    public static final boolean isEqualTo(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean equals;
        if (!AbstractC2921d.m5536Y(AbstractC2921d.m5535X(jSONObject.keys())).equals(AbstractC2921d.m5536Y(AbstractC2921d.m5535X(jSONObject2.keys())))) {
            return false;
        }
        for (String str : AbstractC2921d.m5535X(jSONObject.keys())) {
            Object obj = jSONObject.get(str);
            Object obj2 = jSONObject2.get(str);
            if (obj instanceof JSONObject) {
                if (!(obj2 instanceof JSONObject)) {
                    return false;
                }
                equals = isEqualTo((JSONObject) obj, (JSONObject) obj2);
            } else if (!(obj instanceof JSONArray)) {
                equals = obj.equals(obj2);
            } else {
                if (!(obj2 instanceof JSONArray)) {
                    return false;
                }
                equals = isEqualTo((JSONArray) obj, (JSONArray) obj2);
            }
            if (!equals) {
                return false;
            }
        }
        return true;
    }

    public static final boolean optBooleanOrDefault(JSONObject jSONObject, String str, boolean z2) {
        Boolean optBooleanOrNull = optBooleanOrNull(jSONObject, str);
        return optBooleanOrNull != null ? optBooleanOrNull.booleanValue() : z2;
    }

    public static final Boolean optBooleanOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Boolean optBooleanOrNullable(JSONObject jSONObject, String str, Boolean bool) {
        Boolean optBooleanOrNull = optBooleanOrNull(jSONObject, str);
        return optBooleanOrNull == null ? bool : optBooleanOrNull;
    }

    public static final float optFloatOrDefault(JSONObject jSONObject, String str, float f) {
        Float optFloatOrNull = optFloatOrNull(jSONObject, str);
        return optFloatOrNull != null ? optFloatOrNull.floatValue() : f;
    }

    public static final Float optFloatOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Float.valueOf((float) jSONObject.getDouble(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final JSONObject optJsonObjectOrDefault(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        JSONObject optJsonObjectOrNull = optJsonObjectOrNull(jSONObject, str);
        return optJsonObjectOrNull == null ? jSONObject2 : optJsonObjectOrNull;
    }

    public static final JSONObject optJsonObjectOrNull(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    public static final JSONObject optJsonObjectOrNullable(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        JSONObject optJsonObjectOrNull = optJsonObjectOrNull(jSONObject, str);
        return optJsonObjectOrNull == null ? jSONObject2 : optJsonObjectOrNull;
    }

    public static final Long optLongOrDefault(JSONObject jSONObject, String str, Long l2) {
        Long optLongOrNull = optLongOrNull(jSONObject, str);
        return optLongOrNull == null ? l2 : optLongOrNull;
    }

    public static final Long optLongOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String optStringOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return jSONObject.getString(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String optStringOrNullable(JSONObject jSONObject, String str, String str2) {
        String optStringOrNull = optStringOrNull(jSONObject, str);
        return optStringOrNull == null ? str2 : optStringOrNull;
    }

    public static final boolean isEqualTo(JSONArray jSONArray, JSONArray jSONArray2) {
        boolean equals;
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        Iterable m1069E = AbstractC0379e.m1069E(0, jSONArray.length());
        if (!(m1069E instanceof Collection) || !((Collection) m1069E).isEmpty()) {
            C2890b it = m1069E.iterator();
            while (it.f9517d) {
                int m5481a = it.m5481a();
                Object obj = jSONArray.get(m5481a);
                Object obj2 = jSONArray2.get(m5481a);
                if (obj instanceof JSONObject) {
                    if (!(obj2 instanceof JSONObject)) {
                        return false;
                    }
                    equals = isEqualTo((JSONObject) obj, (JSONObject) obj2);
                } else if (obj instanceof JSONArray) {
                    if (!(obj2 instanceof JSONArray)) {
                        return false;
                    }
                    equals = isEqualTo((JSONArray) obj, (JSONArray) obj2);
                } else {
                    equals = obj.equals(obj2);
                }
                if (!equals) {
                    return false;
                }
            }
        }
        return true;
    }
}
