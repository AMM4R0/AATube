package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Nn */
/* loaded from: classes.dex */
public final class C1409Nn {

    /* renamed from: a */
    public final C1434On f5142a;

    public C1409Nn(C2297xe c2297xe, C1743ba c1743ba, String str) {
        this.f5142a = new C1434On(c2297xe, c1743ba, C1384Mn.f5098a);
    }

    /* renamed from: a */
    public final synchronized void m3137a(JSONObject jSONObject) {
        C1434On c1434On = this.f5142a;
        c1434On.m3194a(c1434On.m3193a().put("numbers_of_type", jSONObject));
    }

    /* renamed from: b */
    public final synchronized void m3140b(long j2) {
        C1434On c1434On = this.f5142a;
        c1434On.m3194a(c1434On.m3193a().put("global_number", j2));
    }

    /* renamed from: c */
    public final synchronized boolean m3143c() {
        return this.f5142a.m3193a().optBoolean("first_event_done", false);
    }

    /* renamed from: d */
    public final synchronized boolean m3144d() {
        return this.f5142a.m3193a().optBoolean("init_event_done", false);
    }

    /* renamed from: a */
    public final synchronized int m3134a() {
        return this.f5142a.m3193a().optInt("attribution_id", 1);
    }

    /* renamed from: b */
    public final synchronized int m3138b() {
        return this.f5142a.m3193a().optInt("open_id", 1);
    }

    /* renamed from: c */
    public final synchronized void m3142c(long j2) {
        C1434On c1434On = this.f5142a;
        c1434On.m3194a(c1434On.m3193a().put("session_id", j2));
    }

    /* renamed from: a */
    public final synchronized void m3135a(int r4) {
        C1434On c1434On = this.f5142a;
        c1434On.m3194a(c1434On.m3193a().put("attribution_id", r4));
    }

    /* renamed from: b */
    public final synchronized void m3139b(int r4) {
        C1434On c1434On = this.f5142a;
        c1434On.m3194a(c1434On.m3193a().put("last_migration_api_level", r4));
    }

    /* renamed from: c */
    public final synchronized void m3141c(int r4) {
        C1434On c1434On = this.f5142a;
        c1434On.m3194a(c1434On.m3193a().put("open_id", r4));
    }

    /* renamed from: a */
    public final synchronized void m3136a(long j2) {
        C1434On c1434On = this.f5142a;
        c1434On.m3194a(c1434On.m3193a().put("external_attribution_window_start", j2));
    }
}
