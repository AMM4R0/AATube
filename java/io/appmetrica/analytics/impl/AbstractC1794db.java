package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.db */
/* loaded from: classes.dex */
public abstract class AbstractC1794db {
    /* renamed from: a */
    public static Object m3745a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                ArrayList arrayList = new ArrayList(length);
                for (int r3 = 0; r3 < length; r3++) {
                    arrayList.add(m3745a(Array.get(obj, r3)));
                }
                return new JSONArray((Collection) arrayList);
            }
            if (obj instanceof Collection) {
                return m3751a((Collection) obj);
            }
            if (!(obj instanceof Map)) {
                if ((obj instanceof Number) && (Double.isInfinite(((Number) obj).doubleValue()) || Double.isNaN(((Number) obj).doubleValue()))) {
                    return null;
                }
                return obj;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                String obj2 = entry.getKey().toString();
                if (obj2 != null) {
                    linkedHashMap.put(obj2, m3745a(entry.getValue()));
                }
            }
            return new JSONObject(linkedHashMap);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m3754b(Map map) {
        if (AbstractC2356zn.m4703a(map)) {
            return null;
        }
        return AndroidUtils.isApiAchieved(19) ? new JSONObject(map).toString() : m3745a((Object) map).toString();
    }

    /* renamed from: c */
    public static HashMap m3756c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (JSONObject.NULL.equals(jSONObject)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = jSONObject.optString(next);
                if (optString != null) {
                    hashMap.put(next, optString);
                }
            }
            return hashMap;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static HashMap m3757d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (JSONObject.NULL.equals(jSONObject)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    /* renamed from: e */
    public static ScreenInfo m3758e(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new ScreenInfo(jSONObject.optInt("width"), jSONObject.optInt("height"), jSONObject.optInt("dpi"), (float) jSONObject.optDouble("scaleFactor", 0.0d));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m3753b(List list) {
        if (AbstractC2356zn.m4702a((Collection) list)) {
            return null;
        }
        if (AndroidUtils.isApiAchieved(19)) {
            return new JSONArray((Collection) list).toString();
        }
        return m3745a((Object) list).toString();
    }

    /* renamed from: b */
    public static ArrayList m3755b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList(jSONArray.length());
                for (int r12 = 0; r12 < jSONArray.length(); r12++) {
                    try {
                        arrayList.add(jSONArray.getString(r12));
                    } catch (Throwable unused) {
                        return arrayList;
                    }
                }
                return arrayList;
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static JSONArray m3751a(Collection collection) {
        if (collection == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(m3745a(it.next()));
            }
            return new JSONArray((Collection) arrayList);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m3747a(HashMap hashMap) {
        if (hashMap == null) {
            return null;
        }
        if (hashMap.isEmpty()) {
            return "";
        }
        return m3754b(hashMap);
    }

    /* renamed from: a */
    public static HashMap m3750a(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return new HashMap();
        }
        return m3756c(str);
    }

    /* renamed from: a */
    public static JSONArray m3752a(List list) {
        if (AbstractC2356zn.m4702a((Collection) list)) {
            return null;
        }
        if (AndroidUtils.isApiAchieved(19)) {
            return new JSONArray((Collection) list);
        }
        return m3751a((Collection) list);
    }

    /* renamed from: a */
    public static Integer m3744a(JSONObject jSONObject, String str, Integer num) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return num;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable unused) {
            return num;
        }
    }

    /* renamed from: a */
    public static ArrayList m3749a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int r12 = 0; r12 < jSONArray.length(); r12++) {
            arrayList.add(jSONArray.getString(r12));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m3746a(ScreenInfo screenInfo) {
        JSONObject jSONObject;
        if (screenInfo == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("width", screenInfo.getWidth()).put("height", screenInfo.getHeight()).put("dpi", screenInfo.getDpi()).put("scaleFactor", screenInfo.getScaleFactor());
            } catch (Throwable unused) {
            }
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static String m3748a(Map map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                JSONArray m3752a = m3752a((List) entry.getValue());
                if (m3752a != null) {
                    jSONObject.put((String) entry.getKey(), m3752a.toString());
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }
}
