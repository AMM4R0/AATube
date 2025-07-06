package io.appmetrica.analytics.impl;

import androidx.fragment.app.C0665o;
import java.lang.reflect.Field;
import org.json.JSONObject;
import p002A1.AbstractC0008a;

/* renamed from: io.appmetrica.analytics.impl.Jd */
/* loaded from: classes.dex */
public final class C1299Jd {
    /* renamed from: a */
    public static final C1070A9 m2985a(C1299Jd c1299Jd, EnumC1295J9 enumC1295J9, Object obj) {
        int r6;
        c1299Jd.getClass();
        C1070A9 c1070a9 = new C1070A9();
        switch (enumC1295J9) {
            case UNKNOWN:
                r6 = 0;
                break;
            case APPSFLYER:
                r6 = 1;
                break;
            case ADJUST:
                r6 = 2;
                break;
            case KOCHAVA:
                r6 = 3;
                break;
            case TENJIN:
                r6 = 4;
                break;
            case AIRBRIDGE:
                r6 = 5;
                break;
            case SINGULAR:
                r6 = 6;
                break;
            default:
                throw new C0665o();
        }
        c1070a9.f4461a = r6;
        C1324Kd.f4958b.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Field field : obj.getClass().getFields()) {
            try {
                jSONObject.put(field.getName(), field.get(obj));
            } catch (Throwable unused) {
            }
        }
        c1070a9.f4462b = jSONObject.toString().getBytes(AbstractC0008a.f6a);
        return c1070a9;
    }
}
