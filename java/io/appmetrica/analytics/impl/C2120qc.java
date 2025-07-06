package io.appmetrica.analytics.impl;

import androidx.fragment.app.C0665o;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p002A1.AbstractC0008a;

/* renamed from: io.appmetrica.analytics.impl.qc */
/* loaded from: classes.dex */
public final class C2120qc {
    /* renamed from: a */
    public static final C1070A9 m4355a(C2120qc c2120qc, EnumC1295J9 enumC1295J9, Map map) {
        int r3;
        JSONObject jSONObject;
        String jSONObject2;
        c2120qc.getClass();
        C1070A9 c1070a9 = new C1070A9();
        switch (enumC1295J9) {
            case UNKNOWN:
                r3 = 0;
                break;
            case APPSFLYER:
                r3 = 1;
                break;
            case ADJUST:
                r3 = 2;
                break;
            case KOCHAVA:
                r3 = 3;
                break;
            case TENJIN:
                r3 = 4;
                break;
            case AIRBRIDGE:
                r3 = 5;
                break;
            case SINGULAR:
                r3 = 6;
                break;
            default:
                throw new C0665o();
        }
        c1070a9.f4461a = r3;
        if (AbstractC2356zn.m4703a(map)) {
            jSONObject = null;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                String obj = entry.getKey().toString();
                if (obj != null) {
                    linkedHashMap.put(obj, AbstractC1794db.m3745a(entry.getValue()));
                }
            }
            jSONObject = new JSONObject(linkedHashMap);
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.toString()) != null) {
            c1070a9.f4462b = jSONObject2.getBytes(AbstractC0008a.f6a);
        }
        return c1070a9;
    }
}
