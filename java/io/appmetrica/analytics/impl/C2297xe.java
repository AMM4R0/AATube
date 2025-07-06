package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.xe */
/* loaded from: classes.dex */
public final class C2297xe extends AbstractC1871gd implements InterfaceC1508Rn {

    /* renamed from: d */
    public static final long f7436d = 0;

    /* renamed from: e */
    public static final int f7437e = -1;

    /* renamed from: f */
    public static final String f7438f = "";

    /* renamed from: g */
    public static final String f7439g = "";

    /* renamed from: h */
    public static final C2347ze f7440h = new C2347ze("PERMISSIONS_CHECK_TIME", null);

    /* renamed from: i */
    public static final C2347ze f7441i = new C2347ze("PROFILE_ID", null);

    /* renamed from: j */
    public static final C2347ze f7442j = new C2347ze("APP_ENVIRONMENT", null);

    /* renamed from: k */
    public static final C2347ze f7443k = new C2347ze("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: l */
    public static final C2347ze f7444l = new C2347ze("LAST_APP_VERSION_WITH_FEATURES", null);

    /* renamed from: m */
    public static final C2347ze f7445m = new C2347ze("APPLICATION_FEATURES", null);

    /* renamed from: n */
    public static final C2347ze f7446n = new C2347ze("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* renamed from: o */
    public static final C2347ze f7447o = new C2347ze("VITAL_DATA", null);

    /* renamed from: p */
    public static final C2347ze f7448p = new C2347ze("SENT_EXTERNAL_ATTRIBUTIONS", null);

    /* renamed from: q */
    public static final String f7449q = "SESSION_";

    public C2297xe(InterfaceC1221Ga interfaceC1221Ga) {
        super(interfaceC1221Ga);
    }

    /* renamed from: a */
    public final C2297xe m4613a(C1733b0 c1733b0) {
        synchronized (this) {
            m4656b(f7442j.f7524b, c1733b0.f5898a);
            m4655b(f7443k.f7524b, c1733b0.f5899b);
        }
        return this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2322ye
    /* renamed from: c */
    public final Set<String> mo2721c() {
        return this.f7497a.mo2904a();
    }

    /* renamed from: d */
    public final C1733b0 m4616d() {
        C1733b0 c1733b0;
        synchronized (this) {
            c1733b0 = new C1733b0(this.f7497a.getString(f7442j.f7524b, "{}"), this.f7497a.getLong(f7443k.f7524b, 0L));
        }
        return c1733b0;
    }

    /* renamed from: e */
    public final String m4618e() {
        return this.f7497a.getString(f7445m.f7524b, "");
    }

    /* renamed from: f */
    public final List<String> m4619f() {
        String str = f7446n.f7524b;
        List emptyList = Collections.emptyList();
        String[] strArr = emptyList == null ? null : (String[]) emptyList.toArray(new String[emptyList.size()]);
        String string = this.f7497a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int r02 = 0; r02 < jSONArray.length(); r02++) {
                    strArr[r02] = jSONArray.optString(r02);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: g */
    public final int m4620g() {
        return this.f7497a.getInt(f7444l.f7524b, -1);
    }

    /* renamed from: h */
    public final long m4621h() {
        return this.f7497a.getLong(f7440h.f7524b, 0L);
    }

    /* renamed from: i */
    public final C2297xe m4623i(String str) {
        return (C2297xe) m4656b(f7445m.f7524b, str);
    }

    /* renamed from: j */
    public final C2297xe m4625j(String str) {
        return (C2297xe) m4656b(f7441i.f7524b, str);
    }

    /* renamed from: h */
    public final String m4622h(String str) {
        return this.f7497a.getString(new C2347ze(f7449q, str).f7524b, "");
    }

    /* renamed from: i */
    public final String m4624i() {
        return this.f7497a.getString(f7441i.f7524b, null);
    }

    /* renamed from: j */
    public final Map<Integer, String> m4626j() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.f7497a.getString(f7448p.f7524b, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(Integer.valueOf(Integer.parseInt(next)), jSONObject.getString(next));
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    /* renamed from: e */
    public final C2297xe m4617e(String str, String str2) {
        return (C2297xe) m4656b(new C2347ze(f7449q, str).f7524b, str2);
    }

    /* renamed from: a */
    public final C2297xe m4612a(long j2) {
        return (C2297xe) m4655b(f7440h.f7524b, j2);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1871gd
    /* renamed from: f */
    public final String mo2727f(String str) {
        return new C2347ze(str, null).f7524b;
    }

    /* renamed from: a */
    public final C2297xe m4611a(int r2) {
        return (C2297xe) m4654b(f7444l.f7524b, r2);
    }

    /* renamed from: a */
    public final C2297xe m4614a(List<String> list) {
        return (C2297xe) m4650a(f7446n.f7524b, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1508Rn
    /* renamed from: a */
    public final String mo2712a() {
        return this.f7497a.getString(f7447o.f7524b, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1508Rn
    /* renamed from: a */
    public final void mo2713a(String str) {
        m4656b(f7447o.f7524b, str);
    }

    /* renamed from: a */
    public final void m4615a(Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        m4656b(f7448p.f7524b, jSONObject.toString());
    }
}
