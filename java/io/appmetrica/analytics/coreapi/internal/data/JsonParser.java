package io.appmetrica.analytics.coreapi.internal.data;

import io.appmetrica.analytics.coreapi.internal.data.Parser;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface JsonParser<T> extends Parser<JSONObject, T> {

    public static final class DefaultImpls {
        public static <T> T parseOrNull(JsonParser<? extends T> jsonParser, JSONObject jSONObject) {
            return (T) Parser.DefaultImpls.parseOrNull(jsonParser, jSONObject);
        }
    }
}
