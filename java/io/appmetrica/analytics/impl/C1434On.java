package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.AbstractC2492i;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.On */
/* loaded from: classes.dex */
public final class C1434On {

    /* renamed from: a */
    public final InterfaceC1508Rn f5191a;

    /* renamed from: b */
    public final InterfaceC1508Rn f5192b;

    /* renamed from: c */
    public final InterfaceC1459Pn f5193c;

    /* renamed from: d */
    public JSONObject f5194d;

    public C1434On(InterfaceC1508Rn interfaceC1508Rn, C1743ba c1743ba, InterfaceC1459Pn interfaceC1459Pn) {
        this.f5191a = interfaceC1508Rn;
        this.f5192b = c1743ba;
        this.f5193c = interfaceC1459Pn;
    }

    /* renamed from: a */
    public final synchronized JSONObject m3193a() {
        JSONObject jSONObject;
        try {
            if (this.f5194d == null) {
                JSONObject mo3036a = this.f5193c.mo3036a(m3192a(this.f5191a), m3192a(this.f5192b));
                this.f5194d = mo3036a;
                m3194a(mo3036a);
            }
            jSONObject = this.f5194d;
            if (jSONObject == null) {
                AbstractC2492i.m4918h("fileContents");
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m3192a(InterfaceC1508Rn interfaceC1508Rn) {
        try {
            String mo2712a = interfaceC1508Rn.mo2712a();
            return mo2712a != null ? new JSONObject(mo2712a) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public final synchronized void m3194a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        try {
            this.f5191a.mo2713a(jSONObject2);
        } catch (Throwable unused) {
        }
        try {
            this.f5192b.mo2713a(jSONObject2);
        } catch (Throwable unused2) {
        }
    }
}
