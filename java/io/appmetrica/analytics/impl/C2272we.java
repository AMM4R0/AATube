package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.List;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.we */
/* loaded from: classes.dex */
public final class C2272we extends AbstractC2322ye {

    /* renamed from: d */
    public static final C2347ze f7349d = new C2347ze("UUID_RESULT", null);

    /* renamed from: e */
    public static final C2347ze f7350e = new C2347ze("DEVICE_ID_RESULT", null);

    /* renamed from: f */
    public static final C2347ze f7351f = new C2347ze("DEVICE_ID_HASH_RESULT", null);

    /* renamed from: g */
    public static final C2347ze f7352g = new C2347ze("AD_URL_GET_RESULT", null);

    /* renamed from: h */
    public static final C2347ze f7353h = new C2347ze("AD_URL_REPORT_RESULT", null);

    /* renamed from: i */
    public static final C2347ze f7354i = new C2347ze("CUSTOM_HOSTS", null);

    /* renamed from: j */
    public static final C2347ze f7355j = new C2347ze("SERVER_TIME_OFFSET", null);

    /* renamed from: k */
    public static final C2347ze f7356k = new C2347ze("RESPONSE_CLIDS_RESULT", null);

    /* renamed from: l */
    public static final C2347ze f7357l = new C2347ze("CUSTOM_SDK_HOSTS", null);

    /* renamed from: m */
    public static final C2347ze f7358m = new C2347ze("CLIENT_CLIDS", null);

    /* renamed from: n */
    public static final C2347ze f7359n = new C2347ze("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* renamed from: o */
    public static final C2347ze f7360o = new C2347ze("API_LEVEL", null);

    /* renamed from: p */
    public static final C2347ze f7361p = new C2347ze("NEXT_STARTUP_TIME", null);

    /* renamed from: q */
    public static final C2347ze f7362q = new C2347ze("GAID", null);

    /* renamed from: r */
    public static final C2347ze f7363r = new C2347ze("HOAID", null);

    /* renamed from: s */
    public static final C2347ze f7364s = new C2347ze("YANDEX_ADV_ID", null);

    /* renamed from: t */
    public static final C2347ze f7365t = new C2347ze("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* renamed from: u */
    public static final C2347ze f7366u = new C2347ze("SCREEN_INFO", null);

    /* renamed from: v */
    public static final C2347ze f7367v = new C2347ze("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* renamed from: w */
    public static final C2347ze f7368w = new C2347ze("FEATURES", null);

    public C2272we(InterfaceC1221Ga interfaceC1221Ga) {
        super(interfaceC1221Ga);
    }

    /* renamed from: a */
    public final boolean m4545a(boolean z2) {
        return this.f7497a.getBoolean(f7365t.f7524b, z2);
    }

    /* renamed from: b */
    public final long m4546b(long j2) {
        return this.f7497a.getLong(f7355j.f7523a, j2);
    }

    /* renamed from: c */
    public final C2272we m4550c(IdentifiersResult identifiersResult) {
        return m4542a(f7357l.f7524b, identifiersResult);
    }

    /* renamed from: d */
    public final IdentifiersResult m4553d() {
        return m4557e(f7352g.f7524b);
    }

    /* renamed from: e */
    public final IdentifiersResult m4556e() {
        return m4557e(f7353h.f7524b);
    }

    /* renamed from: f */
    public final List<String> m4560f() {
        String string = this.f7497a.getString(f7354i.f7524b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC1794db.m3755b(string);
    }

    /* renamed from: g */
    public final IdentifiersResult m4563g() {
        return m4557e(f7357l.f7524b);
    }

    /* renamed from: h */
    public final IdentifiersResult m4566h() {
        return m4557e(f7351f.f7524b);
    }

    /* renamed from: i */
    public final IdentifiersResult m4568i() {
        return m4557e(f7350e.f7524b);
    }

    /* renamed from: j */
    public final C1594V9 m4569j() {
        String string = this.f7497a.getString(f7368w.f7524b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new C1594V9(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C1594V9(null, IdentifierStatus.UNKNOWN, null);
    }

    /* renamed from: k */
    public final IdentifiersResult m4571k() {
        return m4557e(f7362q.f7524b);
    }

    /* renamed from: l */
    public final IdentifiersResult m4572l() {
        return m4557e(f7363r.f7524b);
    }

    /* renamed from: m */
    public final long m4573m() {
        return this.f7497a.getLong(f7361p.f7524b, 0L);
    }

    /* renamed from: n */
    public final IdentifiersResult m4574n() {
        return m4557e(f7356k.f7524b);
    }

    /* renamed from: o */
    public final ScreenInfo m4575o() {
        return AbstractC1794db.m3758e(this.f7497a.getString(f7366u.f7524b, null));
    }

    /* renamed from: p */
    public final IdentifiersResult m4576p() {
        return m4557e(f7349d.f7524b);
    }

    /* renamed from: q */
    public final IdentifiersResult m4577q() {
        return m4557e(f7364s.f7524b);
    }

    /* renamed from: r */
    public final boolean m4578r() {
        return this.f7497a.getBoolean(f7359n.f7524b, false);
    }

    /* renamed from: s */
    public final boolean m4579s() {
        return this.f7497a.getBoolean(f7367v.f7524b, false);
    }

    /* renamed from: t */
    public final C2272we m4580t() {
        return (C2272we) m4657b(f7359n.f7524b, true);
    }

    /* renamed from: u */
    public final void m4581u() {
        m4657b(f7367v.f7524b, true);
    }

    /* renamed from: a */
    public final long m4539a(long j2) {
        return this.f7497a.getLong(f7360o.f7524b, j2);
    }

    /* renamed from: b */
    public final C2272we m4547b(IdentifiersResult identifiersResult) {
        return m4542a(f7353h.f7524b, identifiersResult);
    }

    /* renamed from: c */
    public final C2272we m4549c(long j2) {
        return (C2272we) m4655b(f7360o.f7524b, j2);
    }

    /* renamed from: d */
    public final C2272we m4552d(IdentifiersResult identifiersResult) {
        return m4542a(f7351f.f7524b, identifiersResult);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.internal.IdentifiersResult m4557e(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            io.appmetrica.analytics.impl.Ga r1 = r5.f7497a     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = r1.getString(r6, r0)     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L2a
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L2a
            io.appmetrica.analytics.internal.IdentifiersResult r6 = new io.appmetrica.analytics.internal.IdentifiersResult     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "ID"
            java.lang.String r2 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(r1, r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = "STATUS"
            java.lang.String r3 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(r1, r3)     // Catch: java.lang.Throwable -> L2a
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r3 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.from(r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = "ERROR_EXPLANATION"
            java.lang.String r1 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(r1, r4)     // Catch: java.lang.Throwable -> L2a
            r6.<init>(r2, r3, r1)     // Catch: java.lang.Throwable -> L2a
            goto L2b
        L2a:
            r6 = r0
        L2b:
            if (r6 != 0) goto L36
            io.appmetrica.analytics.internal.IdentifiersResult r6 = new io.appmetrica.analytics.internal.IdentifiersResult
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r1 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN
            java.lang.String r2 = "no identifier in preferences"
            r6.<init>(r0, r1, r2)
        L36:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C2272we.m4557e(java.lang.String):io.appmetrica.analytics.internal.IdentifiersResult");
    }

    /* renamed from: g */
    public final C2272we m4561g(IdentifiersResult identifiersResult) {
        return m4542a(f7363r.f7524b, identifiersResult);
    }

    /* renamed from: h */
    public final C2272we m4564h(IdentifiersResult identifiersResult) {
        return m4542a(f7356k.f7524b, identifiersResult);
    }

    /* renamed from: i */
    public final C2272we m4567i(IdentifiersResult identifiersResult) {
        return m4542a(f7349d.f7524b, identifiersResult);
    }

    /* renamed from: f */
    public final C2272we m4558f(IdentifiersResult identifiersResult) {
        return m4542a(f7362q.f7524b, identifiersResult);
    }

    /* renamed from: a */
    public final C2272we m4541a(IdentifiersResult identifiersResult) {
        return m4542a(f7352g.f7524b, identifiersResult);
    }

    /* renamed from: b */
    public final C2272we m4548b(boolean z2) {
        return (C2272we) m4657b(f7365t.f7524b, z2);
    }

    /* renamed from: d */
    public final C2272we m4551d(long j2) {
        return (C2272we) m4655b(f7361p.f7524b, j2);
    }

    /* renamed from: g */
    public final C2272we m4562g(String str) {
        return (C2272we) m4656b(f7358m.f7524b, str);
    }

    /* renamed from: h */
    public final C2272we m4565h(String str) {
        return (C2272we) m4661d(new C2347ze(str, null).f7524b);
    }

    /* renamed from: f */
    public final String m4559f(String str) {
        return this.f7497a.getString(f7358m.f7524b, str);
    }

    /* renamed from: a */
    public final C2272we m4540a(C1594V9 c1594v9) {
        String str = f7368w.f7524b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c1594v9.f5572a).put("STATUS", c1594v9.f5573b.getValue()).putOpt("ERROR_EXPLANATION", c1594v9.f5574c);
        } catch (Throwable unused) {
        }
        return (C2272we) m4656b(str, jSONObject.toString());
    }

    /* renamed from: e */
    public final C2272we m4555e(IdentifiersResult identifiersResult) {
        return m4542a(f7350e.f7524b, identifiersResult);
    }

    /* renamed from: j */
    public final C2272we m4570j(IdentifiersResult identifiersResult) {
        return m4542a(f7364s.f7524b, identifiersResult);
    }

    /* renamed from: e */
    public final C2272we m4554e(long j2) {
        return (C2272we) m4655b(f7355j.f7524b, j2);
    }

    /* renamed from: a */
    public final C2272we m4543a(List<String> list) {
        return (C2272we) m4656b(f7354i.f7524b, AbstractC1794db.m3753b(list));
    }

    /* renamed from: a */
    public final void m4544a(ScreenInfo screenInfo) {
        m4656b(f7366u.f7524b, AbstractC1794db.m3746a(screenInfo));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C2272we m4542a(java.lang.String r5, io.appmetrica.analytics.internal.IdentifiersResult r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L27
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L27
            r0.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "ID"
            java.lang.String r2 = r6.f7574id     // Catch: java.lang.Throwable -> L22
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "STATUS"
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r3 = r6.status     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r3.getValue()     // Catch: java.lang.Throwable -> L22
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "ERROR_EXPLANATION"
            java.lang.String r6 = r6.errorExplanation     // Catch: java.lang.Throwable -> L22
            r1.put(r2, r6)     // Catch: java.lang.Throwable -> L22
        L22:
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L27
            goto L28
        L27:
            r6 = 0
        L28:
            if (r6 == 0) goto L2d
            r4.m4656b(r5, r6)
        L2d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C2272we.m4542a(java.lang.String, io.appmetrica.analytics.internal.IdentifiersResult):io.appmetrica.analytics.impl.we");
    }
}
