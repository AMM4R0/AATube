package io.appmetrica.analytics.impl;

import android.location.Location;
import android.text.TextUtils;
import io.appmetrica.analytics.PreloadInfo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.h4 */
/* loaded from: classes.dex */
public abstract class AbstractC1887h4 {
    /* renamed from: a */
    public static String m3907a(Location location) {
        if (location == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("provider", location.getProvider());
            jSONObject.put("time", location.getTime());
            jSONObject.put("accuracy", location.getAccuracy());
            jSONObject.put("alt", location.getAltitude());
            jSONObject.put("lng", location.getLongitude());
            jSONObject.put("lat", location.getLatitude());
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static PreloadInfo m3908b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        PreloadInfo.Builder newBuilder = PreloadInfo.newBuilder(jSONObject.has("trackid") ? jSONObject.optString("trackid") : null);
        HashMap m3756c = AbstractC1794db.m3756c(jSONObject.optString("params"));
        if (m3756c != null && m3756c.size() > 0) {
            for (Map.Entry entry : m3756c.entrySet()) {
                newBuilder.setAdditionalParams((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return newBuilder.build();
    }

    /* renamed from: a */
    public static Location m3906a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Location location = new Location(jSONObject.has("provider") ? jSONObject.optString("provider") : null);
            location.setLongitude(jSONObject.getDouble("lng"));
            location.setLatitude(jSONObject.getDouble("lat"));
            location.setTime(jSONObject.optLong("time"));
            location.setAccuracy((float) jSONObject.optDouble("accuracy"));
            location.setAltitude((float) jSONObject.optDouble("alt"));
            return location;
        } catch (Throwable unused) {
            return null;
        }
    }
}
