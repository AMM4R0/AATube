package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.C0665o;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.pl */
/* loaded from: classes.dex */
public final class C2104pl {

    /* renamed from: a */
    public final HashSet f6936a;

    /* renamed from: b */
    public final HashMap f6937b;

    /* renamed from: c */
    public final C2029ml f6938c;

    /* renamed from: d */
    public List f6939d;

    /* renamed from: e */
    public HashMap f6940e;

    /* renamed from: f */
    public long f6941f;

    /* renamed from: g */
    public boolean f6942g;

    /* renamed from: h */
    public long f6943h;

    /* renamed from: i */
    public final C2272we f6944i;

    /* renamed from: j */
    public final C1285J f6945j;

    /* renamed from: k */
    public final C1787d4 f6946k;

    /* renamed from: l */
    public final C1092B6 f6947l;

    /* renamed from: m */
    public final C1544T9 f6948m;

    /* renamed from: n */
    public final C1519S9 f6949n;

    /* renamed from: o */
    public final C1159Dn f6950o;

    public C2104pl(Context context, C2272we c2272we) {
        this(c2272we, new C1285J(), new C1787d4(), C2312y4.m4633h().m4634a(context), new C1092B6(), new C1544T9(), new C1519S9(), new C1159Dn());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r8.f6942g != false) goto L21;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean m4298a(java.util.List r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set r0 = io.appmetrica.analytics.impl.AbstractC2254vl.f7314a     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.AbstractC2492i.m4915e(r9, r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "other"
            kotlin.jvm.internal.AbstractC2492i.m4915e(r0, r1)     // Catch: java.lang.Throwable -> L35
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L35
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L35
            r1.retainAll(r0)     // Catch: java.lang.Throwable -> L35
            boolean r0 = r8.m4297a(r1)     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L35
        L1d:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> L35
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L37
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L35
            java.util.HashSet r4 = r8.f6936a     // Catch: java.lang.Throwable -> L35
            boolean r1 = r4.contains(r1)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L1d
            r9 = r3
            goto L38
        L35:
            r9 = move-exception
            goto L54
        L37:
            r9 = r2
        L38:
            long r4 = r8.f6943h     // Catch: java.lang.Throwable -> L35
            io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider r1 = io.appmetrica.analytics.impl.AbstractC2254vl.f7315b     // Catch: java.lang.Throwable -> L35
            long r6 = r1.currentTimeSeconds()     // Catch: java.lang.Throwable -> L35
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L46
            r1 = r3
            goto L47
        L46:
            r1 = r2
        L47:
            if (r0 == 0) goto L51
            if (r9 != 0) goto L51
            if (r1 != 0) goto L51
            boolean r9 = r8.f6942g     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto L52
        L51:
            r2 = r3
        L52:
            monitor-exit(r8)
            return r2
        L54:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L35
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C2104pl.m4298a(java.util.List):boolean");
    }

    /* renamed from: b */
    public final void m4299b(IdentifiersResult identifiersResult) {
        if (m4293a(identifiersResult)) {
            return;
        }
        this.f6937b.put("appmetrica_clids", identifiersResult);
    }

    /* renamed from: c */
    public final void m4302c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            C1159Dn c1159Dn = this.f6950o;
            String str = identifiersResult.f7574id;
            c1159Dn.getClass();
            if (C1159Dn.m2846a(str)) {
                this.f6937b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }

    /* renamed from: b */
    public final synchronized boolean m4300b() {
        return m4298a(Arrays.asList("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    /* renamed from: c */
    public final void m4301c() {
        C1594V9 c1594v9;
        C2272we m4551d = this.f6944i.m4567i((IdentifiersResult) this.f6937b.get(StartupParamsCallback.APPMETRICA_UUID)).m4555e((IdentifiersResult) this.f6937b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).m4552d((IdentifiersResult) this.f6937b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)).m4541a((IdentifiersResult) this.f6937b.get("appmetrica_get_ad_url")).m4547b((IdentifiersResult) this.f6937b.get("appmetrica_report_ad_url")).m4554e(this.f6941f).m4564h((IdentifiersResult) this.f6937b.get("appmetrica_clids")).m4562g(AbstractC1730am.m3628a((Map) this.f6940e)).m4558f((IdentifiersResult) this.f6937b.get("appmetrica_google_adv_id")).m4561g((IdentifiersResult) this.f6937b.get("appmetrica_huawei_oaid")).m4570j((IdentifiersResult) this.f6937b.get("appmetrica_yandex_adv_id")).m4548b(this.f6942g).m4550c(this.f6947l.f4519d).m4551d(this.f6943h);
        C1544T9 c1544t9 = this.f6948m;
        synchronized (c1544t9) {
            c1594v9 = c1544t9.f5468b;
        }
        m4551d.m4540a(c1594v9).m4658b();
    }

    public C2104pl(C2272we c2272we, C1285J c1285j, C1787d4 c1787d4, C1796dd c1796dd, C1092B6 c1092b6, C1544T9 c1544t9, C1519S9 c1519s9, C1159Dn c1159Dn) {
        HashSet hashSet = new HashSet();
        this.f6936a = hashSet;
        this.f6937b = new HashMap();
        this.f6938c = new C2029ml();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.f6944i = c2272we;
        this.f6945j = c1285j;
        this.f6946k = c1787d4;
        this.f6947l = c1092b6;
        this.f6948m = c1544t9;
        this.f6949n = c1519s9;
        this.f6950o = c1159Dn;
        m4302c(c1796dd.m3764a());
        m4295a(StartupParamsCallback.APPMETRICA_DEVICE_ID, c2272we.m4568i());
        m4295a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, c2272we.m4566h());
        m4295a("appmetrica_get_ad_url", c2272we.m4553d());
        m4295a("appmetrica_report_ad_url", c2272we.m4556e());
        m4299b(c2272we.m4574n());
        m4295a("appmetrica_google_adv_id", c2272we.m4571k());
        m4295a("appmetrica_huawei_oaid", c2272we.m4572l());
        m4295a("appmetrica_yandex_adv_id", c2272we.m4577q());
        c1092b6.m2747a(c2272we.m4563g());
        c1544t9.m3354a(c2272we.m4569j());
        this.f6939d = c2272we.m4560f();
        String m4559f = c2272we.m4559f((String) null);
        this.f6940e = m4559f != null ? AbstractC1730am.m3629a(m4559f) : null;
        this.f6942g = c2272we.m4545a(true);
        this.f6941f = c2272we.m4546b(0L);
        this.f6943h = c2272we.m4573m();
        m4301c();
    }

    /* renamed from: a */
    public final boolean m4296a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f6937b.get("appmetrica_clids");
        if (!m4293a(identifiersResult) && identifiersResult.f7574id.isEmpty()) {
            return AbstractC2356zn.m4703a((Map) this.f6940e);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (io.appmetrica.analytics.impl.C1159Dn.m2846a(r1) != false) goto L8;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4294a(io.appmetrica.analytics.impl.C2137r4 r4) {
        /*
            r3 = this;
            io.appmetrica.analytics.internal.IdentifiersResult r0 = r4.f7016a
            java.util.HashMap r1 = r3.f6937b
            java.lang.String r2 = "appmetrica_uuid"
            java.lang.Object r1 = r1.get(r2)
            io.appmetrica.analytics.internal.IdentifiersResult r1 = (io.appmetrica.analytics.internal.IdentifiersResult) r1
            if (r1 == 0) goto L1c
            io.appmetrica.analytics.impl.Dn r2 = r3.f6950o
            java.lang.String r1 = r1.f7574id
            r2.getClass()
            boolean r1 = io.appmetrica.analytics.impl.C1159Dn.m2846a(r1)
            if (r1 == 0) goto L1c
            goto L1f
        L1c:
            r3.m4302c(r0)
        L1f:
            java.lang.String r0 = "appmetrica_device_id"
            io.appmetrica.analytics.internal.IdentifiersResult r1 = r4.f7017b
            r3.m4295a(r0, r1)
            java.lang.String r0 = "appmetrica_device_id_hash"
            io.appmetrica.analytics.internal.IdentifiersResult r1 = r4.f7018c
            r3.m4295a(r0, r1)
            java.util.HashMap r0 = r3.f6937b
            java.lang.String r1 = "appmetrica_google_adv_id"
            io.appmetrica.analytics.internal.IdentifiersResult r2 = r4.f7023h
            r0.put(r1, r2)
            java.util.HashMap r0 = r3.f6937b
            java.lang.String r1 = "appmetrica_huawei_oaid"
            io.appmetrica.analytics.internal.IdentifiersResult r2 = r4.f7024i
            r0.put(r1, r2)
            java.util.HashMap r0 = r3.f6937b
            java.lang.String r1 = "appmetrica_yandex_adv_id"
            io.appmetrica.analytics.internal.IdentifiersResult r2 = r4.f7025j
            r0.put(r1, r2)
            io.appmetrica.analytics.impl.B6 r0 = r3.f6947l
            io.appmetrica.analytics.internal.IdentifiersResult r1 = r4.f7026k
            r0.m2747a(r1)
            io.appmetrica.analytics.impl.T9 r0 = r3.f6948m
            io.appmetrica.analytics.impl.V9 r1 = r4.f7029n
            monitor-enter(r0)
            r0.f5468b = r1     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r0)
            io.appmetrica.analytics.internal.IdentifiersResult r0 = r4.f7020e
            boolean r1 = m4293a(r0)
            if (r1 != 0) goto L66
            java.util.HashMap r1 = r3.f6937b
            java.lang.String r2 = "appmetrica_get_ad_url"
            r1.put(r2, r0)
        L66:
            io.appmetrica.analytics.internal.IdentifiersResult r0 = r4.f7019d
            boolean r1 = m4293a(r0)
            if (r1 != 0) goto L75
            java.util.HashMap r1 = r3.f6937b
            java.lang.String r2 = "appmetrica_report_ad_url"
            r1.put(r2, r0)
        L75:
            long r0 = r4.f7027l
            r3.f6941f = r0
            io.appmetrica.analytics.impl.d4 r0 = r3.f6946k
            java.util.HashMap r1 = r3.f6940e
            io.appmetrica.analytics.internal.IdentifiersResult r2 = r4.f7022g
            java.lang.String r2 = r2.f7574id
            java.util.HashMap r2 = io.appmetrica.analytics.impl.AbstractC1794db.m3750a(r2)
            r0.getClass()
            boolean r0 = io.appmetrica.analytics.impl.AbstractC2356zn.m4703a(r1)
            if (r0 == 0) goto L93
            boolean r0 = io.appmetrica.analytics.impl.AbstractC2356zn.m4703a(r2)
            goto L97
        L93:
            boolean r0 = r1.equals(r2)
        L97:
            if (r0 == 0) goto La5
            java.util.HashMap r0 = r3.f6937b
            java.lang.String r1 = "appmetrica_clids"
            io.appmetrica.analytics.internal.IdentifiersResult r2 = r4.f7021f
            r0.put(r1, r2)
            r0 = 0
            r3.f6942g = r0
        La5:
            long r0 = r4.f7028m
            r3.f6943h = r0
            r3.m4301c()
            return
        Lad:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C2104pl.m4294a(io.appmetrica.analytics.impl.r4):void");
    }

    /* renamed from: a */
    public static boolean m4293a(IdentifiersResult identifiersResult) {
        return identifiersResult == null || identifiersResult.f7574id == null;
    }

    /* renamed from: a */
    public final void m4295a(String str, IdentifiersResult identifiersResult) {
        if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.f7574id)) {
            return;
        }
        this.f6937b.put(str, identifiersResult);
    }

    /* renamed from: a */
    public final synchronized boolean m4297a(Collection collection) {
        Boolean bool;
        String str;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) this.f6937b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (IdentifiersResult) this.f6947l.f4518c.get(str2);
                }
                if (identifiersResult == null) {
                    C1594V9 c1594v9 = this.f6948m.f5468b;
                    if (!AbstractC2492i.m4911a(str2, "appmetrica_lib_ssl_enabled") || (bool = c1594v9.f5572a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean booleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = c1594v9.f5573b;
                        String str3 = c1594v9.f5574c;
                        if (booleanValue) {
                            str = "true";
                        } else if (!booleanValue) {
                            str = "false";
                        } else {
                            throw new C0665o();
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if ("appmetrica_clids".equals(str2)) {
                    if (this.f6942g || m4293a(identifiersResult) || (identifiersResult.f7574id.isEmpty() && !AbstractC2356zn.m4703a((Map) this.f6940e))) {
                        return false;
                    }
                } else if ("appmetrica_lib_ssl_enabled".equals(str2)) {
                    if (identifiersResult == null) {
                        return false;
                    }
                } else if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.f7574id)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
