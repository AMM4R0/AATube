package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.rl */
/* loaded from: classes.dex */
public final class C2154rl {

    /* renamed from: a */
    public final C2268wa f7074a;

    /* renamed from: b */
    public final C1619W9 f7075b;

    /* renamed from: c */
    public final C1926ii f7076c;

    /* renamed from: d */
    public final C1697Zd f7077d;

    /* renamed from: e */
    public final C1780cm f7078e;

    /* renamed from: f */
    public final C2310y2 f7079f;

    /* renamed from: g */
    public final C1239H3 f7080g;

    /* renamed from: h */
    public final C2210u2 f7081h;

    /* renamed from: i */
    public final C1819eb f7082i;

    /* renamed from: j */
    public final C1705Zl f7083j;

    /* renamed from: k */
    public final C1721ad f7084k;

    /* renamed from: l */
    public final C1145D9 f7085l;

    public C2154rl() {
        this(new C1819eb(), new C2268wa(), new C1619W9(), new C1926ii(), new C1697Zd(), new C1780cm(), new C1239H3(), new C2310y2(), new C2210u2(), new C1705Zl(), new C1721ad(), new C1145D9());
    }

    /* renamed from: a */
    public final void m4402a(C2279wl c2279wl, C1769cb c1769cb) {
        long j2;
        long j3;
        String str;
        ArrayList m4537a;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4 = c1769cb.optJSONObject("queries");
        if (optJSONObject4 != null && (optJSONObject2 = optJSONObject4.optJSONObject("list")) != null && (optJSONObject3 = optJSONObject2.optJSONObject("host")) != null) {
            c2279wl.f7388g = optJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = c1769cb.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject optJSONObject5 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (optJSONObject5 != null) {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = optJSONObject5.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject6 = optJSONObject5.optJSONObject(next);
                if (optJSONObject6 != null && optJSONObject6.has("value")) {
                    hashMap.put(next, optJSONObject6.getString("value"));
                }
            }
            c2279wl.f7391j = AbstractC1730am.m3628a((Map) hashMap);
        }
        JSONObject optJSONObject7 = c1769cb.optJSONObject(CommonUrlParts.LOCALE);
        String str2 = "";
        c2279wl.f7394m = (optJSONObject7 == null || (optJSONObject = optJSONObject7.optJSONObject("country")) == null || !optJSONObject.optBoolean("reliable", false)) ? "" : optJSONObject.optString("value", "");
        JSONObject optJSONObject8 = c1769cb.optJSONObject("time");
        if (optJSONObject8 != null) {
            try {
                c2279wl.f7393l = Long.valueOf(optJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C1482Ql c1482Ql = new C1482Ql();
        JSONObject optJSONObject9 = c1769cb.optJSONObject("stat_sending");
        if (optJSONObject9 != null) {
            c1482Ql.f5263a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject9, "disabled_reporting_interval_seconds", c1482Ql.f5263a);
        }
        this.f7078e.getClass();
        c2279wl.f7397p = new C1755bm(c1482Ql.f5263a);
        this.f7075b.getClass();
        C1382Ml c1382Ml = new C1382Ml();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = c1769cb.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject optJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (optJSONObject10 != null) {
                C1140D4 c1140d4 = new C1140D4();
                c1140d4.f4624a = C1619W9.m3495a(optJSONObject10, "permissions_collecting", c1382Ml.f5086a);
                c1140d4.f4625b = C1619W9.m3495a(optJSONObject10, "features_collecting", c1382Ml.f5087b);
                c1140d4.f4626c = C1619W9.m3495a(optJSONObject10, "google_aid", c1382Ml.f5088c);
                c1140d4.f4627d = C1619W9.m3495a(optJSONObject10, "sim_info", c1382Ml.f5089d);
                c1140d4.f4628e = C1619W9.m3495a(optJSONObject10, "huawei_oaid", c1382Ml.f5090e);
                c1140d4.f4629f = optJSONObject10.has("ssl_pinning") ? Boolean.valueOf(optJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c2279wl.f7383b = new C1190F4(c1140d4);
            }
        } catch (Throwable unused4) {
        }
        this.f7074a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = c1769cb.get("query_hosts");
            } catch (Throwable unused5) {
            }
            JSONObject optJSONObject11 = ((JSONObject) jSONObject3).optJSONObject("list");
            if (optJSONObject11 != null) {
                try {
                    str = optJSONObject11.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused6) {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    c2279wl.f7385d = str;
                }
                ArrayList m4537a2 = C2268wa.m4537a(optJSONObject11, "report");
                if (!AbstractC2356zn.m4702a((Collection) m4537a2)) {
                    c2279wl.f7386e = m4537a2;
                }
                try {
                    str2 = optJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(str2)) {
                    c2279wl.f7387f = str2;
                }
                ArrayList m4537a3 = C2268wa.m4537a(optJSONObject11, "startup");
                if (!AbstractC2356zn.m4702a((Collection) m4537a3)) {
                    c2279wl.f7384c = m4537a3;
                }
                ArrayList m4537a4 = C2268wa.m4537a(optJSONObject11, "diagnostic");
                if (!AbstractC2356zn.m4702a((Collection) m4537a4)) {
                    c2279wl.f7395n = m4537a4;
                }
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys2 = optJSONObject11.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!C2268wa.f7345a.contains(next2) && (m4537a = C2268wa.m4537a(optJSONObject11, next2)) != null) {
                        hashMap2.put(next2, m4537a);
                    }
                }
                c2279wl.f7396o = hashMap2;
            }
        } catch (Throwable unused8) {
        }
        this.f7076c.getClass();
        C1506Rl c1506Rl = new C1506Rl();
        JSONObject optJSONObject12 = c1769cb.optJSONObject("retry_policy");
        int r4 = c1506Rl.f5391w;
        int r5 = c1506Rl.f5392x;
        if (optJSONObject12 != null) {
            r4 = optJSONObject12.optInt("max_interval_seconds", r4);
            r5 = optJSONObject12.optInt("exponential_multiplier", c1506Rl.f5392x);
        }
        c2279wl.f7398q = new RetryPolicyConfig(r4, r5);
        this.f7077d.getClass();
        if (c2279wl.f7383b.f4722a) {
            JSONObject optJSONObject13 = c1769cb.optJSONObject("permissions_collecting");
            C1432Ol c1432Ol = new C1432Ol();
            if (optJSONObject13 != null) {
                j2 = optJSONObject13.optLong("check_interval_seconds", c1432Ol.f5189a);
                j3 = optJSONObject13.optLong("force_send_interval_seconds", c1432Ol.f5190b);
            } else {
                j2 = c1432Ol.f5189a;
                j3 = c1432Ol.f5190b;
            }
            c2279wl.f7392k = new C1648Xd(j2, j3);
        }
        C2285x2 c2285x2 = this.f7079f.f7474a;
        C1282Il c1282Il = new C1282Il();
        JSONObject optJSONObject14 = c1769cb.optJSONObject("auto_inapp_collecting");
        if (optJSONObject14 != null) {
            c1282Il.f4883a = optJSONObject14.optInt("send_frequency_seconds", c1282Il.f4883a);
            c1282Il.f4884b = optJSONObject14.optInt("first_collecting_inapp_max_age_seconds", c1282Il.f4884b);
        }
        c2285x2.getClass();
        c2279wl.f7399r = new BillingConfig(c1282Il.f4883a, c1282Il.f4884b);
        C1239H3 c1239h3 = this.f7080g;
        c1239h3.getClass();
        C1307Jl c1307Jl = new C1307Jl();
        JSONObject optJSONObject15 = c1769cb.optJSONObject("cache_control");
        if (optJSONObject15 != null) {
            c1307Jl.f4932a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject15, "last_known_location_ttl", c1307Jl.f4932a);
        }
        c1239h3.f4813a.getClass();
        c2279wl.f7400s = new C1164E3(c1307Jl.f4932a);
        this.f7081h.getClass();
        C2210u2.m4472a(c2279wl, c1769cb);
        C1705Zl c1705Zl = this.f7083j;
        c1705Zl.getClass();
        JSONObject optJSONObject16 = c1769cb.optJSONObject("startup_update");
        C1457Pl c1457Pl = new C1457Pl();
        Integer m3744a = AbstractC1794db.m3744a(optJSONObject16, "interval_seconds", null);
        if (m3744a != null) {
            c1457Pl.f5234a = m3744a.intValue();
        }
        c1705Zl.f5816a.getClass();
        c2279wl.f7402u = new C1656Xl(c1457Pl.f5234a);
        Map<String, C1348Lc> mo2832b = this.f7084k.f5868a.mo2832b();
        C1696Zc c1696Zc = new C1696Zc(c1769cb);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C1348Lc> entry : mo2832b.entrySet()) {
            Object invoke = c1696Zc.invoke(entry);
            if (invoke != null) {
                linkedHashMap.put(entry.getKey(), invoke);
            }
        }
        c2279wl.f7403v = linkedHashMap;
        C1120C9 c1120c9 = this.f7085l.f4635a;
        C1357Ll c1357Ll = new C1357Ll();
        JSONObject optJSONObject17 = c1769cb.optJSONObject("external_attribution");
        if (optJSONObject17 != null) {
            c1357Ll.f5016a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject17, "collecting_interval_seconds", c1357Ll.f5016a);
        }
        c1120c9.getClass();
        c2279wl.f7404w = new C1095B9(c1357Ll.f5016a);
    }

    public C2154rl(C1819eb c1819eb, C2268wa c2268wa, C1619W9 c1619w9, C1926ii c1926ii, C1697Zd c1697Zd, C1780cm c1780cm, C1239H3 c1239h3, C2310y2 c2310y2, C2210u2 c2210u2, C1705Zl c1705Zl, C1721ad c1721ad, C1145D9 c1145d9) {
        this.f7074a = c2268wa;
        this.f7075b = c1619w9;
        this.f7076c = c1926ii;
        this.f7077d = c1697Zd;
        this.f7078e = c1780cm;
        this.f7080g = c1239h3;
        this.f7079f = c2310y2;
        this.f7081h = c2210u2;
        this.f7082i = c1819eb;
        this.f7083j = c1705Zl;
        this.f7084k = c1721ad;
        this.f7085l = c1145d9;
    }
}
