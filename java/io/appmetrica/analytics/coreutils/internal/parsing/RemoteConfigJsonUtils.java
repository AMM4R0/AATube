package io.appmetrica.analytics.coreutils.internal.parsing;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2492i;
import org.json.JSONArray;
import org.json.JSONObject;
import p002A1.AbstractC0008a;

/* loaded from: classes.dex */
public final class RemoteConfigJsonUtils {
    public static final RemoteConfigJsonUtils INSTANCE = new RemoteConfigJsonUtils();

    private RemoteConfigJsonUtils() {
    }

    public static final boolean extractFeature(JSONObject jSONObject, String str, boolean z2) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        try {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("features");
            if (optJSONObject3 != null && (optJSONObject = optJSONObject3.optJSONObject("list")) != null && (optJSONObject2 = optJSONObject.optJSONObject(str)) != null) {
                return optJSONObject2.optBoolean("enabled", z2);
            }
        } catch (Throwable unused) {
        }
        return z2;
    }

    public static final byte[][] extractHosts(JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("query_hosts");
        if (optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject("list")) == null || (optJSONObject2 = optJSONObject.optJSONObject(str)) == null || (optJSONArray = optJSONObject2.optJSONArray("urls")) == null) {
            return new byte[0][];
        }
        int length = optJSONArray.length();
        byte[][] bArr = new byte[length][];
        for (int r02 = 0; r02 < length; r02++) {
            bArr[r02] = optJSONArray.optString(r02).getBytes(AbstractC0008a.f6a);
        }
        return bArr;
    }

    public static final long extractMillisFromSecondsOrDefault(JSONObject jSONObject, String str, long j2) {
        return extractMillisOrDefault(jSONObject, str, TimeUnit.SECONDS, j2);
    }

    public static final long extractMillisOrDefault(JSONObject jSONObject, String str, TimeUnit timeUnit, long j2) {
        return WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(jSONObject, str), timeUnit, j2);
    }

    public static final String extractQuery(JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        try {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("queries");
            if (optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject("list")) == null || (optJSONObject2 = optJSONObject.optJSONObject(str)) == null) {
                return null;
            }
            RemoteConfigJsonUtils remoteConfigJsonUtils = INSTANCE;
            String optString = optJSONObject2.optString("url", "");
            remoteConfigJsonUtils.getClass();
            if (AbstractC2492i.m4911a(optString, "")) {
                return null;
            }
            return optString;
        } catch (Throwable unused) {
            return null;
        }
    }
}
