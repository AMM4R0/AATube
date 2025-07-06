package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import p002A1.AbstractC0008a;

/* renamed from: io.appmetrica.analytics.impl.Ln */
/* loaded from: classes.dex */
public final class C1359Ln {

    /* renamed from: a */
    public final C1434On f5018a;

    public C1359Ln(C1075Ae c1075Ae, C1743ba c1743ba) {
        this.f5018a = new C1434On(c1075Ae, c1743ba, C1334Kn.f4980a);
    }

    /* renamed from: a */
    public final synchronized void m3069a(String str) {
        C1434On c1434On = this.f5018a;
        c1434On.m3194a(c1434On.m3193a().put("device_id", str));
    }

    /* renamed from: b */
    public final synchronized void m3071b(String str) {
        C1434On c1434On = this.f5018a;
        c1434On.m3194a(c1434On.m3193a().put("device_id_hash", str));
    }

    /* renamed from: c */
    public final synchronized boolean m3072c() {
        return this.f5018a.m3193a().optBoolean("referrer_checked", false);
    }

    /* renamed from: d */
    public final synchronized void m3073d() {
        C1434On c1434On = this.f5018a;
        c1434On.m3194a(c1434On.m3193a().put("referrer_checked", true));
    }

    /* renamed from: a */
    public final synchronized String m3067a() {
        return JsonUtils.optStringOrNull(this.f5018a.m3193a(), "device_id_hash");
    }

    /* renamed from: b */
    public final synchronized C1500Rf m3070b() {
        byte[] decode;
        C1500Rf c1500Rf;
        String optStringOrNull = JsonUtils.optStringOrNull(this.f5018a.m3193a(), "referrer");
        if (optStringOrNull != null) {
            try {
                decode = Base64.decode(optStringOrNull.getBytes(AbstractC0008a.f6a), 0);
            } catch (Throwable unused) {
            }
            c1500Rf = (decode == null || decode.length == 0) ? null : new C1500Rf(decode);
        }
        return c1500Rf;
    }

    /* renamed from: a */
    public final synchronized void m3068a(C1500Rf c1500Rf) {
        try {
            C1434On c1434On = this.f5018a;
            c1434On.m3194a(c1434On.m3193a().put("referrer", c1500Rf != null ? new String(Base64.encode(c1500Rf.m3263a(), 0), AbstractC0008a.f6a) : null));
        } catch (Throwable th) {
            throw th;
        }
    }
}
