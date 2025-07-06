package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.hl */
/* loaded from: classes.dex */
public final class C1904hl implements InterfaceC1929il {

    /* renamed from: j */
    public static final Map f6436j = Collections.unmodifiableMap(new C1829el());

    /* renamed from: a */
    public final List f6437a;

    /* renamed from: b */
    public final C1726ai f6438b;

    /* renamed from: c */
    public final C2104pl f6439c;

    /* renamed from: d */
    public final Handler f6440d;

    /* renamed from: e */
    public C2123qf f6441e;

    /* renamed from: f */
    public final C1854fl f6442f;

    /* renamed from: g */
    public final Object f6443g;

    /* renamed from: h */
    public final WeakHashMap f6444h;

    /* renamed from: i */
    public HashMap f6445i;

    public C1904hl(Context context, C1726ai c1726ai, C2272we c2272we, Handler handler) {
        this(c1726ai, new C2104pl(context, c2272we), handler);
    }

    /* renamed from: a */
    public final void m3957a(StartupParamsCallback startupParamsCallback, List<String> list, Map<String, String> map) {
        synchronized (this.f6443g) {
            try {
                C2104pl c2104pl = this.f6439c;
                c2104pl.getClass();
                if (!AbstractC2356zn.m4703a((Map) map) && !AbstractC2356zn.m4701a(map, c2104pl.f6940e)) {
                    c2104pl.f6940e = new HashMap(map);
                    c2104pl.f6942g = true;
                    c2104pl.m4301c();
                }
                m3956a(startupParamsCallback, list);
                if (this.f6439c.m4298a((List) list)) {
                    m3960a(list, new C1879gl(this, startupParamsCallback), map);
                } else {
                    m3955a(new Bundle(), startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m3964b(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        synchronized (this.f6443g) {
            try {
                m3963b(bundle);
                m3972h();
                if (startupParamsCallback != null) {
                    m3955a(bundle, startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final String m3967c() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f6439c.f6937b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f7574id;
    }

    /* renamed from: d */
    public final C1644X9 m3968d() {
        C1594V9 c1594v9;
        C2104pl c2104pl = this.f6439c;
        C1519S9 c1519s9 = c2104pl.f6949n;
        C1544T9 c1544t9 = c2104pl.f6948m;
        synchronized (c1544t9) {
            c1594v9 = c1544t9.f5468b;
        }
        c1519s9.getClass();
        Boolean bool = c1594v9.f5572a;
        return new C1644X9();
    }

    /* renamed from: e */
    public final long m3969e() {
        return this.f6439c.f6941f;
    }

    /* renamed from: f */
    public final InterfaceC1167E6 m3970f() {
        return this.f6442f;
    }

    /* renamed from: g */
    public final String m3971g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f6439c.f6937b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f7574id;
    }

    /* renamed from: h */
    public final void m3972h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.f6444h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.f6439c.m4297a((Collection) list)) {
                weakHashMap.put(entry.getKey(), list);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            StartupParamsCallback startupParamsCallback = (StartupParamsCallback) ((Map.Entry) it.next()).getKey();
            if (startupParamsCallback != null) {
                m3955a(new Bundle(), startupParamsCallback);
            }
        }
        weakHashMap.clear();
    }

    /* renamed from: i */
    public final void m3973i() {
        synchronized (this.f6443g) {
            try {
                if (this.f6439c.m4300b()) {
                    m3960a(this.f6437a, this.f6442f, this.f6445i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C1904hl(C1726ai c1726ai, C2104pl c2104pl, Handler handler) {
        this.f6437a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.f6443g = new Object();
        this.f6444h = new WeakHashMap();
        this.f6438b = c1726ai;
        this.f6439c = c2104pl;
        this.f6440d = handler;
        this.f6442f = new C1854fl();
    }

    /* renamed from: b */
    public final void m3963b(Bundle bundle) {
        C2104pl c2104pl = this.f6439c;
        synchronized (c2104pl) {
            c2104pl.m4294a(new C2137r4(C2137r4.m4367a(bundle, "Uuid"), C2137r4.m4367a(bundle, "DeviceId"), C2137r4.m4367a(bundle, "DeviceIdHash"), C2137r4.m4367a(bundle, "AdUrlReport"), C2137r4.m4367a(bundle, "AdUrlGet"), C2137r4.m4367a(bundle, "Clids"), C2137r4.m4367a(bundle, "RequestClids"), C2137r4.m4367a(bundle, "GAID"), C2137r4.m4367a(bundle, "HOAID"), C2137r4.m4367a(bundle, "YANDEX_ADV_ID"), C2137r4.m4367a(bundle, "CUSTOM_SDK_HOSTS"), bundle.getLong("ServerTimeOffset"), bundle.getLong("NextStartupTime"), C2137r4.m4365a(bundle)));
        }
        m3972h();
    }

    /* renamed from: a */
    public final void m3954a(Bundle bundle) {
        m3964b(bundle, null);
    }

    /* renamed from: a */
    public final void m3958a(C2123qf c2123qf) {
        this.f6441e = c2123qf;
    }

    /* renamed from: a */
    public final void m3960a(List list, InterfaceC1167E6 interfaceC1167E6, Map map) {
        ResultReceiverC1192F6 resultReceiverC1192F6 = new ResultReceiverC1192F6(this.f6440d, interfaceC1167E6);
        C1726ai c1726ai = this.f6438b;
        c1726ai.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new C1620Wa(resultReceiverC1192F6, list, map));
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        HashMap hashMap = AbstractC1521Sb.f5412a;
        C2123qf c2123qf = C2123qf.f6997e;
        Set set = AbstractC2242v9.f7279a;
        C1987l4 c1987l4 = new C1987l4("", "", 1536, 0, c2123qf);
        c1987l4.f5633m = bundle;
        C1688Z4 c1688z4 = c1726ai.f5882a;
        c1726ai.m3613a(C1726ai.m3612a(c1987l4, c1688z4), c1688z4, 1, null);
    }

    /* renamed from: b */
    public final void m3966b(List<String> list) {
        synchronized (this.f6443g) {
            try {
                List list2 = this.f6439c.f6939d;
                if (AbstractC2356zn.m4702a((Collection) list)) {
                    if (!AbstractC2356zn.m4702a((Collection) list2)) {
                        C2104pl c2104pl = this.f6439c;
                        c2104pl.f6939d = null;
                        c2104pl.f6944i.m4543a((List<String>) null);
                        this.f6438b.m3618a((List) null);
                    }
                } else if (!AbstractC2356zn.m4701a(list, list2)) {
                    C2104pl c2104pl2 = this.f6439c;
                    c2104pl2.f6939d = list;
                    c2104pl2.f6944i.m4543a(list);
                    this.f6438b.m3618a(list);
                } else {
                    this.f6438b.m3618a(list2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m3961a(Map<String, String> map) {
        if (AbstractC2356zn.m4703a((Map) map)) {
            return;
        }
        synchronized (this.f6443g) {
            try {
                HashMap m3631b = AbstractC1730am.m3631b(map);
                this.f6445i = m3631b;
                this.f6438b.m3617a(m3631b);
                C2104pl c2104pl = this.f6439c;
                c2104pl.getClass();
                if (!AbstractC2356zn.m4703a((Map) m3631b) && !AbstractC2356zn.m4701a(m3631b, c2104pl.f6940e)) {
                    c2104pl.f6940e = new HashMap(m3631b);
                    c2104pl.f6942g = true;
                    c2104pl.m4301c();
                }
            } finally {
            }
        }
    }

    /* renamed from: a */
    public final void m3959a(String str) {
        synchronized (this.f6443g) {
            this.f6438b.m3616a(str);
        }
    }

    /* renamed from: b */
    public final void m3965b(String str) {
        synchronized (this.f6443g) {
            this.f6438b.m3619b(str);
        }
    }

    /* renamed from: a */
    public final void m3955a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        EnumC1779cl enumC1779cl;
        if (this.f6444h.containsKey(startupParamsCallback)) {
            List list = (List) this.f6444h.get(startupParamsCallback);
            if (this.f6439c.m4297a((Collection) list)) {
                startupParamsCallback.onReceive(m3953a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int r7 = bundle.getInt("startup_error_key_code");
                    enumC1779cl = EnumC1779cl.UNKNOWN;
                    if (r7 == 1) {
                        enumC1779cl = EnumC1779cl.NETWORK;
                    } else if (r7 == 2) {
                        enumC1779cl = EnumC1779cl.PARSE;
                    }
                } else {
                    enumC1779cl = null;
                }
                if (enumC1779cl == null) {
                    if (!this.f6439c.m4296a()) {
                        C2123qf c2123qf = this.f6441e;
                        if (c2123qf != null) {
                            c2123qf.m3359a(5, "Clids error. Passed clids: %s, and clids from server are empty.", this.f6445i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        enumC1779cl = EnumC1779cl.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(f6436j, enumC1779cl, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, m3953a(list));
            }
            this.f6444h.remove(startupParamsCallback);
            if (this.f6444h.isEmpty()) {
                C1883h0 c1883h0 = this.f6438b.f5885d;
                synchronized (c1883h0.f6350f) {
                    c1883h0.f6347c = false;
                    c1883h0.m3905c();
                }
            }
        }
    }

    /* renamed from: b */
    public final Map<String, String> m3962b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f6439c.f6937b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.f7574id;
        if (!TextUtils.isEmpty(str)) {
            return AbstractC1794db.m3750a(str);
        }
        return this.f6445i;
    }

    /* renamed from: a */
    public final StartupParamsCallback.Result m3953a(List list) {
        HashMap hashMap = new HashMap();
        C2104pl c2104pl = this.f6439c;
        synchronized (c2104pl) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult) c2104pl.f6937b.get(str);
                    if (identifiersResult != null) {
                        hashMap.put(str, c2104pl.f6938c.m4226a(identifiersResult));
                    }
                }
                c2104pl.f6947l.m2748a(list, hashMap);
                c2104pl.f6948m.m3355a(list, hashMap);
            } catch (Throwable th) {
                throw th;
            }
        }
        return new StartupParamsCallback.Result(hashMap);
    }

    /* renamed from: a */
    public final void m3956a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.f6444h.isEmpty()) {
            C1883h0 c1883h0 = this.f6438b.f5885d;
            synchronized (c1883h0.f6350f) {
                c1883h0.f6347c = true;
                c1883h0.m3904b();
            }
        }
        this.f6444h.put(startupParamsCallback, list);
    }

    /* renamed from: a */
    public final AdvIdentifiersResult m3952a() {
        C2104pl c2104pl = this.f6439c;
        C1285J c1285j = c2104pl.f6945j;
        IdentifiersResult identifiersResult = (IdentifiersResult) c2104pl.f6937b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) c2104pl.f6937b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) c2104pl.f6937b.get("appmetrica_yandex_adv_id");
        c1285j.getClass();
        return new AdvIdentifiersResult(C1285J.m2977a(identifiersResult), C1285J.m2977a(identifiersResult2), C1285J.m2977a(identifiersResult3));
    }
}
